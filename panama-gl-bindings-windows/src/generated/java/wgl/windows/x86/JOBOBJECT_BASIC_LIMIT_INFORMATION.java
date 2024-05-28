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
 * typedef struct _JOBOBJECT_BASIC_LIMIT_INFORMATION {
 *     LARGE_INTEGER PerProcessUserTimeLimit;
 *     LARGE_INTEGER PerJobUserTimeLimit;
 *     DWORD LimitFlags;
 *     SIZE_T MinimumWorkingSetSize;
 *     SIZE_T MaximumWorkingSetSize;
 *     DWORD ActiveProcessLimit;
 *     ULONG_PTR Affinity;
 *     DWORD PriorityClass;
 *     DWORD SchedulingClass;
 * } JOBOBJECT_BASIC_LIMIT_INFORMATION
 * }
 */
public class JOBOBJECT_BASIC_LIMIT_INFORMATION extends _JOBOBJECT_BASIC_LIMIT_INFORMATION {

    JOBOBJECT_BASIC_LIMIT_INFORMATION() {
        // Should not be called directly
    }
}

