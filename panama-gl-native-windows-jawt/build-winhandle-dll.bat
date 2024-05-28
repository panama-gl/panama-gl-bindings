

gcc -I"C:\Program Files\Zulu\zulu-17\include" -I"C:\Program Files\Zulu\zulu-17\include\win32" -c src/main/c/win32/Win32.c -o target/Win32.o

gcc target/Win32.o -L"C:\Program Files\Zulu\zulu-17\lib" -L"C:\Program Files\Zulu\zulu-17\lib\server" -ljawt -ljvm -shared -o target/Win32.dll

cp target/Win32.dll src/main/resources/Win32.dll
