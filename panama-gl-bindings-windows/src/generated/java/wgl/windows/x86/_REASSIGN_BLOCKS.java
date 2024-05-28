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
 * struct _REASSIGN_BLOCKS {
 *     WORD Reserved;
 *     WORD Count;
 *     DWORD BlockNumber[1];
 * }
 * }
 */
public class _REASSIGN_BLOCKS {

    _REASSIGN_BLOCKS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_SHORT.withName("Reserved"),
        wgl_h.C_SHORT.withName("Count"),
        MemoryLayout.sequenceLayout(1, wgl_h.C_LONG).withName("BlockNumber")
    ).withName("_REASSIGN_BLOCKS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Reserved$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final OfShort Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static short Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, short fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final OfShort Count$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Count
     * }
     */
    public static final OfShort Count$layout() {
        return Count$LAYOUT;
    }

    private static final long Count$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Count
     * }
     */
    public static final long Count$offset() {
        return Count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Count
     * }
     */
    public static short Count(MemorySegment struct) {
        return struct.get(Count$LAYOUT, Count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Count
     * }
     */
    public static void Count(MemorySegment struct, short fieldValue) {
        struct.set(Count$LAYOUT, Count$OFFSET, fieldValue);
    }

    private static final SequenceLayout BlockNumber$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("BlockNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BlockNumber[1]
     * }
     */
    public static final SequenceLayout BlockNumber$layout() {
        return BlockNumber$LAYOUT;
    }

    private static final long BlockNumber$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BlockNumber[1]
     * }
     */
    public static final long BlockNumber$offset() {
        return BlockNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BlockNumber[1]
     * }
     */
    public static MemorySegment BlockNumber(MemorySegment struct) {
        return struct.asSlice(BlockNumber$OFFSET, BlockNumber$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BlockNumber[1]
     * }
     */
    public static void BlockNumber(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, BlockNumber$OFFSET, BlockNumber$LAYOUT.byteSize());
    }

    private static long[] BlockNumber$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD BlockNumber[1]
     * }
     */
    public static long[] BlockNumber$dimensions() {
        return BlockNumber$DIMS;
    }
    private static final VarHandle BlockNumber$ELEM_HANDLE = BlockNumber$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD BlockNumber[1]
     * }
     */
    public static int BlockNumber(MemorySegment struct, long index0) {
        return (int)BlockNumber$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD BlockNumber[1]
     * }
     */
    public static void BlockNumber(MemorySegment struct, long index0, int fieldValue) {
        BlockNumber$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

