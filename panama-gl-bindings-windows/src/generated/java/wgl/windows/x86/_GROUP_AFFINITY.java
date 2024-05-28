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
 * struct _GROUP_AFFINITY {
 *     KAFFINITY Mask;
 *     WORD Group;
 *     WORD Reserved[3];
 * }
 * }
 */
public class _GROUP_AFFINITY {

    _GROUP_AFFINITY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG_LONG.withName("Mask"),
        wgl_h.C_SHORT.withName("Group"),
        MemoryLayout.sequenceLayout(3, wgl_h.C_SHORT).withName("Reserved")
    ).withName("_GROUP_AFFINITY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong Mask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Mask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * KAFFINITY Mask
     * }
     */
    public static final OfLong Mask$layout() {
        return Mask$LAYOUT;
    }

    private static final long Mask$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * KAFFINITY Mask
     * }
     */
    public static final long Mask$offset() {
        return Mask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * KAFFINITY Mask
     * }
     */
    public static long Mask(MemorySegment struct) {
        return struct.get(Mask$LAYOUT, Mask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * KAFFINITY Mask
     * }
     */
    public static void Mask(MemorySegment struct, long fieldValue) {
        struct.set(Mask$LAYOUT, Mask$OFFSET, fieldValue);
    }

    private static final OfShort Group$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Group"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Group
     * }
     */
    public static final OfShort Group$layout() {
        return Group$LAYOUT;
    }

    private static final long Group$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Group
     * }
     */
    public static final long Group$offset() {
        return Group$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Group
     * }
     */
    public static short Group(MemorySegment struct) {
        return struct.get(Group$LAYOUT, Group$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Group
     * }
     */
    public static void Group(MemorySegment struct, short fieldValue) {
        struct.set(Group$LAYOUT, Group$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Reserved[3]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Reserved[3]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Reserved[3]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Reserved[3]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WORD Reserved[3]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WORD Reserved[3]
     * }
     */
    public static short Reserved(MemorySegment struct, long index0) {
        return (short)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WORD Reserved[3]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, short fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

