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
 * typedef struct _PERF_DATA_BLOCK {
 *     WCHAR Signature[4];
 *     DWORD LittleEndian;
 *     DWORD Version;
 *     DWORD Revision;
 *     DWORD TotalByteLength;
 *     DWORD HeaderLength;
 *     DWORD NumObjectTypes;
 *     LONG DefaultObject;
 *     SYSTEMTIME SystemTime;
 *     LARGE_INTEGER PerfTime;
 *     LARGE_INTEGER PerfFreq;
 *     LARGE_INTEGER PerfTime100nSec;
 *     DWORD SystemNameLength;
 *     DWORD SystemNameOffset;
 * } PERF_DATA_BLOCK
 * }
 */
public class PERF_DATA_BLOCK extends _PERF_DATA_BLOCK {

    PERF_DATA_BLOCK() {
        // Should not be called directly
    }
}

