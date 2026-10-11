#!/bin/bash
# Cross-compile freeglut for Windows x64 or ARM64 from Linux or macOS, using Zig as C compiler,
# resource compiler and linker (Zig ships the MinGW-w64 headers and libraries of both CPUs).
#
# The resulting freeglut.dll only depends on DLLs of Windows 10+ (OPENGL32, GDI32, USER32,
# KERNEL32, ADVAPI32, WINMM and the Universal C Runtime).
#
# Required software:
# - CMake and Ninja
# - Git
# - Zig (https://ziglang.org/download/), either in the PATH, given by the ZIG environment
#   variable, or installed as a Python package with :
#	pip install ziglang
#
# To run this script, navigate on the CLI to the directory containing this script and call it in
# the following way, passing the desired freeglut version, the target CPU (x64 or arm64), and
# optionally a directory where freeglut.dll and its license should be copied :
#	build-freeglut-cross.sh v<freeglut-version> <x64|arm64> [destination-dir]
#
# Example :
#	build-freeglut-cross.sh v3.8.0 arm64 ../../../panama-gl/panama-gl-wrappers-windows/src/main/resources/natives/windows-aarch64

set -e

if [[ $# < 2 ]]; then
	echo "Required arguments are missing. Pass for example (without quotes): 'v3.8.0 x64' or 'v3.8.0 arm64'"
	exit 1
fi

releaseVersion=$1
arch=$2
destDir=$3

case $arch in
	x64)   zigTarget=x86_64-windows-gnu;  cmakeProcessor=AMD64 ;;
	arm64) zigTarget=aarch64-windows-gnu; cmakeProcessor=ARM64 ;;
	*) echo "Unsupported CPU '$arch' : use x64 or arm64"; exit 1 ;;
esac

# Resolve Zig
if [[ -z "$ZIG" ]]; then
	if command -v zig > /dev/null; then
		ZIG=zig
	elif python3 -c "import ziglang" 2> /dev/null; then
		ZIG="python3 -m ziglang"
	else
		echo "Zig not found : install it or run 'pip install ziglang'"
		exit 1
	fi
fi

# Make the destination absolute before changing directory
if [[ -n "$destDir" ]]; then
	mkdir -p "$destDir"
	destDir=$(cd "$destDir" && pwd)
fi

cd ../../panama-gl-bindings-windows
echo Running in $PWD

rootDir=$PWD/target/freeglut-${releaseVersion}-zig-${arch}
srcDir=$rootDir/freeglut
buildDir=$rootDir/build
outDir=$rootDir/output
toolsDir=$rootDir/tools

# Clean up and prepare empty directory
rm -rf $rootDir
mkdir -p $rootDir $toolsDir

# Wrap Zig commands as executables CMake can use as compilers and archivers
cat > $toolsDir/cc <<EOF
#!/bin/sh
exec $ZIG cc -target $zigTarget "\$@"
EOF
cat > $toolsDir/ar <<EOF
#!/bin/sh
exec $ZIG ar "\$@"
EOF
cat > $toolsDir/ranlib <<EOF
#!/bin/sh
exec $ZIG ranlib "\$@"
EOF
# CMake invokes the resource compiler of MinGW with the arguments of windres
#	-O coff -D<define> -I <include> <input.rc> <output>
# while 'zig rc' takes the arguments of the Microsoft rc.exe, plus the CPU of the COFF object it
# produces.
cat > $toolsDir/windres <<EOF
#!/bin/bash
args=()
files=()
while [[ \$# > 0 ]]; do
	case \$1 in
		-O) shift ;;
		-D) args+=(/d "\$2"); shift ;;
		-D*) args+=(/d "\${1#-D}") ;;
		-I) args+=(/i "\$2"); shift ;;
		-I*) args+=(/i "\${1#-I}") ;;
		-*) ;;
		*) files+=("\$1") ;;
	esac
	shift
done
exec $ZIG rc /:target $zigTarget /:auto-includes gnu "\${args[@]}" /fo "\${files[1]}" -- "\${files[0]}"
EOF
chmod +x $toolsDir/*

# Fetch sources and build
git clone --depth=1 --branch=$releaseVersion https://github.com/FreeGLUTProject/freeglut.git $srcDir
cmake -G "Ninja" -S $srcDir -B $buildDir \
	-DCMAKE_SYSTEM_NAME=Windows \
	-DCMAKE_SYSTEM_PROCESSOR=$cmakeProcessor \
	-DCMAKE_C_COMPILER=$toolsDir/cc \
	-DCMAKE_AR=$toolsDir/ar \
	-DCMAKE_RANLIB=$toolsDir/ranlib \
	-DCMAKE_RC_COMPILER=$toolsDir/windres \
	-DCMAKE_BUILD_TYPE=Release \
	-DFREEGLUT_BUILD_DEMOS=OFF \
	-DFREEGLUT_BUILD_STATIC_LIBS=OFF
cmake --build $buildDir
cmake --install $buildDir --prefix $outDir

# Remove undesired 'lib' prefix that MinGW adds to the .dll file
mv -v $outDir/bin/libfreeglut.dll $outDir/bin/freeglut.dll

# Copy the .dll file and its license to the destination
if [[ -n "$destDir" ]]; then
	cp -v $outDir/bin/freeglut.dll $destDir
	cp -v $srcDir/COPYING $destDir/COPYING
fi
