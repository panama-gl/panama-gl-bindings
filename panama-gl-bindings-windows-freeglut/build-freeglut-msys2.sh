# Required software:
# - MSYS2: https://www.msys2.org/
#
# Launch MSYS2's UCRT64 environment:
# Install (run the following commands):
#	pacman -S mingw-w64-ucrt-x86_64-gcc
#	pacman -S mingw-w64-ucrt-x86_64-cmake
#	pacman -S mingw-w64-ucrt-x86_64-ninja
#	pacman -S git
#
# Call this script within the MSYS2's UCRT64 environment passing the desired freeglut version:
#	build-freeglut-msys2.sh v<freeglut-version>
#
# It builds freeglut.dll for x64 in target/freeglut-<version>-mingw-w64/output/bin, to be used locally
# from the java.library.path, and copies the freeglut headers in scripts/windows, from which the
# Windows binding is generated. The DLLs embedded by this module are built by
# build-freeglut-cross.sh instead, whose build is reproducible.
#
# Further reading:
#	https://www.msys2.org/docs/environments/ -> Use UCRT64 (or CLANG64?) for recent Windows 10
#	https://www.msys2.org/docs/cmake/
#	https://www.msys2.org/docs/updating/

if [[ $# < 1 ]]; then
    echo "Required freeglut version argument is missing. Pass for example (without quotes): 'v3.4.0' or 'master' for the latest snapshot"
	exit 1
fi

cd "$(dirname "$0")"
echo Running in $PWD

releaseVersion=$1
rootDir=target/freeglut-${releaseVersion}-mingw-w64
srcDir=$rootDir/freeglut
buildDir=$rootDir/build
outDir=$rootDir/output

# Clean up and prepare empty directory
rm -rf $rootDir
mkdir -p $rootDir


# Fetch sources and build
git clone --depth=1 --branch=$releaseVersion https://github.com/FreeGLUTProject/freeglut.git $srcDir
cmake -G "Ninja" -S $srcDir -B $buildDir -DFREEGLUT_BUILD_DEMOS=OFF
cmake --build $buildDir --config Release
cmake --install $buildDir --prefix $outDir

# Copy the headers where the Windows binding is generated from
cp -rv $outDir/include/* ../scripts/windows
# Remove undesired 'lib' prefix that MinGW adds to the .dll files
for file in $outDir/bin/lib*.dll; do
	name=$(basename "$file")
	mv -v "$file" "$outDir/bin/${name#lib}"
done
echo freeglut.dll built in $PWD/$outDir/bin
