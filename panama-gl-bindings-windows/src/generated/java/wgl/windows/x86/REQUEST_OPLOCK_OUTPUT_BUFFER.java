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
 * typedef struct _REQUEST_OPLOCK_OUTPUT_BUFFER {
 *     WORD StructureVersion;
 *     WORD StructureLength;
 *     DWORD OriginalOplockLevel;
 *     DWORD NewOplockLevel;
 *     DWORD Flags;
 *     ACCESS_MASK AccessMode;
 *     WORD ShareMode;
 * } REQUEST_OPLOCK_OUTPUT_BUFFER
 * }
 */
public class REQUEST_OPLOCK_OUTPUT_BUFFER extends _REQUEST_OPLOCK_OUTPUT_BUFFER {

    REQUEST_OPLOCK_OUTPUT_BUFFER() {
        // Should not be called directly
    }
}

