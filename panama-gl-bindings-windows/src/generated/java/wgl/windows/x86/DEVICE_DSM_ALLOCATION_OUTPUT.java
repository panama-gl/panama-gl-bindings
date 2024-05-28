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
 * typedef struct _DEVICE_DATA_SET_LB_PROVISIONING_STATE {
 *     DWORD Size;
 *     DWORD Version;
 *     DWORDLONG SlabSizeInBytes;
 *     DWORD SlabOffsetDeltaInBytes;
 *     DWORD SlabAllocationBitMapBitCount;
 *     DWORD SlabAllocationBitMapLength;
 *     DWORD SlabAllocationBitMap[1];
 * } DEVICE_DSM_ALLOCATION_OUTPUT
 * }
 */
public class DEVICE_DSM_ALLOCATION_OUTPUT extends _DEVICE_DATA_SET_LB_PROVISIONING_STATE {

    DEVICE_DSM_ALLOCATION_OUTPUT() {
        // Should not be called directly
    }
}

