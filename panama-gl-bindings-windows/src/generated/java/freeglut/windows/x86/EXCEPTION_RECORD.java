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
 * typedef struct _EXCEPTION_RECORD {
 *     DWORD ExceptionCode;
 *     DWORD ExceptionFlags;
 *     struct _EXCEPTION_RECORD *ExceptionRecord;
 *     PVOID ExceptionAddress;
 *     DWORD NumberParameters;
 *     ULONG_PTR ExceptionInformation[15];
 * } EXCEPTION_RECORD
 * }
 */
public class EXCEPTION_RECORD extends _EXCEPTION_RECORD {

    EXCEPTION_RECORD() {
        // Should not be called directly
    }
}

