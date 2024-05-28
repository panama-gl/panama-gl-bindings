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
 * typedef struct _SCRUB_DATA_OUTPUT {
 *     DWORD Size;
 *     DWORD Flags;
 *     DWORD Status;
 *     ULONGLONG ErrorFileOffset;
 *     ULONGLONG ErrorLength;
 *     ULONGLONG NumberOfBytesRepaired;
 *     ULONGLONG NumberOfBytesFailed;
 *     ULONGLONG InternalFileReference;
 *     WORD ResumeContextLength;
 *     WORD ParityExtentDataOffset;
 *     DWORD Reserved[9];
 *     ULONGLONG NumberOfMetadataBytesProcessed;
 *     ULONGLONG NumberOfDataBytesProcessed;
 *     ULONGLONG TotalNumberOfMetadataBytesInUse;
 *     ULONGLONG TotalNumberOfDataBytesInUse;
 *     BYTE ResumeContext[816];
 * } SCRUB_DATA_OUTPUT
 * }
 */
public class SCRUB_DATA_OUTPUT extends _SCRUB_DATA_OUTPUT {

    SCRUB_DATA_OUTPUT() {
        // Should not be called directly
    }
}

