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
 * struct _VIRTUALIZATION_INSTANCE_INFO_OUTPUT {
 *     GUID VirtualizationInstanceID;
 * }
 * }
 */
public class _VIRTUALIZATION_INSTANCE_INFO_OUTPUT {

    _VIRTUALIZATION_INSTANCE_INFO_OUTPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GUID.layout().withName("VirtualizationInstanceID")
    ).withName("_VIRTUALIZATION_INSTANCE_INFO_OUTPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout VirtualizationInstanceID$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("VirtualizationInstanceID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID VirtualizationInstanceID
     * }
     */
    public static final GroupLayout VirtualizationInstanceID$layout() {
        return VirtualizationInstanceID$LAYOUT;
    }

    private static final long VirtualizationInstanceID$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID VirtualizationInstanceID
     * }
     */
    public static final long VirtualizationInstanceID$offset() {
        return VirtualizationInstanceID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID VirtualizationInstanceID
     * }
     */
    public static MemorySegment VirtualizationInstanceID(MemorySegment struct) {
        return struct.asSlice(VirtualizationInstanceID$OFFSET, VirtualizationInstanceID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID VirtualizationInstanceID
     * }
     */
    public static void VirtualizationInstanceID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, VirtualizationInstanceID$OFFSET, VirtualizationInstanceID$LAYOUT.byteSize());
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

