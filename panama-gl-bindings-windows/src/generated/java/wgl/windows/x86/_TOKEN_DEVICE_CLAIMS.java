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
 * struct _TOKEN_DEVICE_CLAIMS {
 *     PCLAIMS_BLOB DeviceClaims;
 * }
 * }
 */
public class _TOKEN_DEVICE_CLAIMS {

    _TOKEN_DEVICE_CLAIMS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_POINTER.withName("DeviceClaims")
    ).withName("_TOKEN_DEVICE_CLAIMS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout DeviceClaims$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("DeviceClaims"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCLAIMS_BLOB DeviceClaims
     * }
     */
    public static final AddressLayout DeviceClaims$layout() {
        return DeviceClaims$LAYOUT;
    }

    private static final long DeviceClaims$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCLAIMS_BLOB DeviceClaims
     * }
     */
    public static final long DeviceClaims$offset() {
        return DeviceClaims$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCLAIMS_BLOB DeviceClaims
     * }
     */
    public static MemorySegment DeviceClaims(MemorySegment struct) {
        return struct.get(DeviceClaims$LAYOUT, DeviceClaims$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCLAIMS_BLOB DeviceClaims
     * }
     */
    public static void DeviceClaims(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(DeviceClaims$LAYOUT, DeviceClaims$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

