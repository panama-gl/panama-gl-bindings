// Generated by jextract

package glxext.linux.x86;

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
 * struct {
 *     XRectangle max_ink_extent;
 *     XRectangle max_logical_extent;
 * }
 * }
 */
public class XFontSetExtents {

    XFontSetExtents() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        XRectangle.layout().withName("max_ink_extent"),
        XRectangle.layout().withName("max_logical_extent")
    ).withName("$anon$1084:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout max_ink_extent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("max_ink_extent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XRectangle max_ink_extent
     * }
     */
    public static final GroupLayout max_ink_extent$layout() {
        return max_ink_extent$LAYOUT;
    }

    private static final long max_ink_extent$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XRectangle max_ink_extent
     * }
     */
    public static final long max_ink_extent$offset() {
        return max_ink_extent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XRectangle max_ink_extent
     * }
     */
    public static MemorySegment max_ink_extent(MemorySegment struct) {
        return struct.asSlice(max_ink_extent$OFFSET, max_ink_extent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XRectangle max_ink_extent
     * }
     */
    public static void max_ink_extent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, max_ink_extent$OFFSET, max_ink_extent$LAYOUT.byteSize());
    }

    private static final GroupLayout max_logical_extent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("max_logical_extent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XRectangle max_logical_extent
     * }
     */
    public static final GroupLayout max_logical_extent$layout() {
        return max_logical_extent$LAYOUT;
    }

    private static final long max_logical_extent$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XRectangle max_logical_extent
     * }
     */
    public static final long max_logical_extent$offset() {
        return max_logical_extent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XRectangle max_logical_extent
     * }
     */
    public static MemorySegment max_logical_extent(MemorySegment struct) {
        return struct.asSlice(max_logical_extent$OFFSET, max_logical_extent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XRectangle max_logical_extent
     * }
     */
    public static void max_logical_extent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, max_logical_extent$OFFSET, max_logical_extent$LAYOUT.byteSize());
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
