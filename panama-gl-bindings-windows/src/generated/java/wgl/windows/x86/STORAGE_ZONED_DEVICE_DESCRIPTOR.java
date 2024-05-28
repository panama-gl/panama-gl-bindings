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
 * typedef struct _STORAGE_ZONED_DEVICE_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     STORAGE_ZONED_DEVICE_TYPES DeviceType;
 *     DWORD ZoneCount;
 *     union {
 *         struct {
 *             DWORD MaxOpenZoneCount;
 *             BOOLEAN UnrestrictedRead;
 *             BYTE Reserved[3];
 *         } SequentialRequiredZone;
 *         struct {
 *             DWORD OptimalOpenZoneCount;
 *             DWORD Reserved;
 *         } SequentialPreferredZone;
 *     } ZoneAttributes;
 *     DWORD ZoneGroupCount;
 *     STORAGE_ZONE_GROUP ZoneGroup[1];
 * } STORAGE_ZONED_DEVICE_DESCRIPTOR
 * }
 */
public class STORAGE_ZONED_DEVICE_DESCRIPTOR extends _STORAGE_ZONED_DEVICE_DESCRIPTOR {

    STORAGE_ZONED_DEVICE_DESCRIPTOR() {
        // Should not be called directly
    }
}

