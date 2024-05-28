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
 * typedef struct _DEVICEDUMP_STORAGESTACK_PUBLIC_DUMP {
 *     DEVICEDUMP_STRUCTURE_VERSION Descriptor;
 *     DWORD dwReasonForCollection;
 *     BYTE cDriverName[16];
 *     DWORD uiNumRecords;
 *     DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD RecordArray[1];
 * } DEVICEDUMP_STORAGESTACK_PUBLIC_DUMP
 * }
 */
public class DEVICEDUMP_STORAGESTACK_PUBLIC_DUMP extends _DEVICEDUMP_STORAGESTACK_PUBLIC_DUMP {

    DEVICEDUMP_STORAGESTACK_PUBLIC_DUMP() {
        // Should not be called directly
    }
}

