# Required software:
# - MSYS2: https://www.msys2.org/
#
# Launch MSYS2's UCRT64 environment:
# Install (run the following commands):
#	pacman -S mingw-w64-ucrt-x86_64-gcc
#	pacman -S mingw-w64-ucrt-x86_64-cmake
#	pacman -S mingw-w64-ucrt-x86_64-cninja
#	pacman -S git
#
# To run this script, navigate within the MSYS2's UCRT64 environment to the directory containing this script and call it in the following way, passing the desired freeglut version:
#	build-freeglut-msys2.sh v<freeglut-version>`
#
# Further reading:
#	https://www.msys2.org/docs/environments/ -> Use UCRT64 (or CLANG64?) for recent Windows 10
#	https://www.msys2.org/docs/cmake/
#	https://www.msys2.org/docs/updating/

if [[ $# < 1 ]]; then
    echo "Required freeglut version argument is missing. Pass for example (without quotes): 'v3.4.0' or 'master' for the latest snapshot"
	exit 1
fi

cd ../../panama-gl-bindings-windows
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

# Copy compiled header and .dll files to the corresponding locations
cp -rv $outDir/include/* ../scripts/windows
libDir=src/main/resources/mingw-w64
mkdir -p $libDir
cp -v $outDir/bin/*.dll $libDir
# Remove undesired 'lib' prefix or resulting .dll file (looks like a bug that it is added
pushd $libDir
for file in lib*.dll; do
	mv -v "$file" "${file#lib}"
done
popd
