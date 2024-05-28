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
 * typedef struct _FILE_STORAGE_TIER {
 *     GUID Id;
 *     WCHAR Name[256];
 *     WCHAR Description[256];
 *     DWORDLONG Flags;
 *     DWORDLONG ProvisionedCapacity;
 *     FILE_STORAGE_TIER_MEDIA_TYPE MediaType;
 *     FILE_STORAGE_TIER_CLASS Class;
 * } FILE_STORAGE_TIER
 * }
 */
public class FILE_STORAGE_TIER extends _FILE_STORAGE_TIER {

    FILE_STORAGE_TIER() {
        // Should not be called directly
    }
}

