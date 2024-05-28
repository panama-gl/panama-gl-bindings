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
 * typedef struct _STORAGE_ADAPTER_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD MaximumTransferLength;
 *     DWORD MaximumPhysicalPages;
 *     DWORD AlignmentMask;
 *     BOOLEAN AdapterUsesPio;
 *     BOOLEAN AdapterScansDown;
 *     BOOLEAN CommandQueueing;
 *     BOOLEAN AcceleratedTransfer;
 *     BYTE BusType;
 *     WORD BusMajorVersion;
 *     WORD BusMinorVersion;
 *     BYTE SrbType;
 *     BYTE AddressType;
 * } STORAGE_ADAPTER_DESCRIPTOR
 * }
 */
public class STORAGE_ADAPTER_DESCRIPTOR extends _STORAGE_ADAPTER_DESCRIPTOR {

    STORAGE_ADAPTER_DESCRIPTOR() {
        // Should not be called directly
    }
}

