@REM Required software:
@REM - CMake: https://cmake.org/download/
@REM - Visual Studio 2022 (Community Edition): https://visualstudio.microsoft.com/de/downloads/
@REM	-> Install Community Edition and select component 'Desktop development with C++'
@REM
@REM To run this script, navigate on the CLI to the directory containing this script and call it in the following way, passing the desired freeglut version:
@REM	build-freeglut-msvsc.bat v<freeglut-version>`

@echo off

if "%~1"=="" (
	echo "Required freeglut version argument is missing. Pass for example (without quotes): 'v3.4.0' or 'master' for the latest snapshot"
	exit 1
)

cd ../../panama-gl-bindings-windows
echo Running in %cd%

SET releaseVersion=%1
SET rootDir=target/freeglut-%releaseVersion%-msvsc
SET srcDir=%rootDir%/freeglut
SET buildDir=%rootDir%/build
SET outDir=%rootDir%/output

@REM Clean up
RMDIR /S /Q %rootDir%
MKDIR %rootDir%

@REM Fetch sources and build
git clone --depth=1 --branch=%releaseVersion% https://github.com/FreeGLUTProject/freeglut.git %srcDir%
cmake -G "Visual Studio 17 2022" -S %srcDir% -B %buildDir% -DFREEGLUT_BUILD_DEMOS=OFF
cmake --build %buildDir% --config Release 
cmake --install %buildDir% --prefix %outDir%

@REM Copy compiled header and .dll files to the corresponding locations
ROBOCOPY %outDir%\include\ ..\scripts\windows /S
SET libDir=src\main\resources\msvsc
MKDIR %libDir%
ROBOCOPY %outDir%\bin\ %libDir% *.dll /S
