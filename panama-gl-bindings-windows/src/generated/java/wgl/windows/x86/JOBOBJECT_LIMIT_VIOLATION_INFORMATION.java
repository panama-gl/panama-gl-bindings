// Generated by jextract

package wgl.windows.x86;

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
 * typedef struct _JOBOBJECT_LIMIT_VIOLATION_INFORMATION {
 *     DWORD LimitFlags;
 *     DWORD ViolationLimitFlags;
 *     DWORD64 IoReadBytes;
 *     DWORD64 IoReadBytesLimit;
 *     DWORD64 IoWriteBytes;
 *     DWORD64 IoWriteBytesLimit;
 *     LARGE_INTEGER PerJobUserTime;
 *     LARGE_INTEGER PerJobUserTimeLimit;
 *     DWORD64 JobMemory;
 *     DWORD64 JobMemoryLimit;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlToleranceLimit;
 * } JOBOBJECT_LIMIT_VIOLATION_INFORMATION
 * }
 */
public class JOBOBJECT_LIMIT_VIOLATION_INFORMATION extends _JOBOBJECT_LIMIT_VIOLATION_INFORMATION {

    JOBOBJECT_LIMIT_VIOLATION_INFORMATION() {
        // Should not be called directly
    }
}

