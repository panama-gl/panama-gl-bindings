// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef struct _NT_TIB32 {
 *     DWORD ExceptionList;
 *     DWORD StackBase;
 *     DWORD StackLimit;
 *     DWORD SubSystemTib;
 *     union {
 *         DWORD FiberData;
 *         DWORD Version;
 *     };
 *     DWORD ArbitraryUserPointer;
 *     DWORD Self;
 * } NT_TIB32
 * }
 */
public class NT_TIB32 extends _NT_TIB32 {

    NT_TIB32() {
        // Should not be called directly
    }
}

