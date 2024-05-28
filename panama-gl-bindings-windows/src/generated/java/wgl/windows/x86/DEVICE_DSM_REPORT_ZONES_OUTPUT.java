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
 * typedef struct _DEVICE_DSM_REPORT_ZONES_DATA {
 *     DWORD Size;
 *     DWORD ZoneCount;
 *     STORAGE_ZONES_ATTRIBUTES Attributes;
 *     DWORD Reserved0;
 *     STORAGE_ZONE_DESCRIPTOR ZoneDescriptors[1];
 * } DEVICE_DSM_REPORT_ZONES_OUTPUT
 * }
 */
public class DEVICE_DSM_REPORT_ZONES_OUTPUT extends _DEVICE_DSM_REPORT_ZONES_DATA {

    DEVICE_DSM_REPORT_ZONES_OUTPUT() {
        // Should not be called directly
    }
}

