// Generated by jextract

package freeglut.windows.x86;

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
 * struct tagMETARECORD {
 *     DWORD rdSize;
 *     WORD rdFunction;
 *     WORD rdParm[1];
 * }
 * }
 */
public class tagMETARECORD {

    tagMETARECORD() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("rdSize"),
        freeglut_h.C_SHORT.withName("rdFunction"),
        MemoryLayout.sequenceLayout(1, freeglut_h.C_SHORT).withName("rdParm")
    ).withName("tagMETARECORD");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt rdSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("rdSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD rdSize
     * }
     */
    public static final OfInt rdSize$layout() {
        return rdSize$LAYOUT;
    }

    private static final long rdSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD rdSize
     * }
     */
    public static final long rdSize$offset() {
        return rdSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD rdSize
     * }
     */
    public static int rdSize(MemorySegment struct) {
        return struct.get(rdSize$LAYOUT, rdSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD rdSize
     * }
     */
    public static void rdSize(MemorySegment struct, int fieldValue) {
        struct.set(rdSize$LAYOUT, rdSize$OFFSET, fieldValue);
    }

    private static final OfShort rdFunction$LAYOUT = (OfShort)$LAYOUT.select(groupElement("rdFunction"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD rdFunction
     * }
     */
    public static final OfShort rdFunction$layout() {
        return rdFunction$LAYOUT;
    }

    private static final long rdFunction$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD rdFunction
     * }
     */
    public static final long rdFunction$offset() {
        return rdFunction$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD rdFunction
     * }
     */
    public static short rdFunction(MemorySegment struct) {
        return struct.get(rdFunction$LAYOUT, rdFunction$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD rdFunction
     * }
     */
    public static void rdFunction(MemorySegment struct, short fieldValue) {
        struct.set(rdFunction$LAYOUT, rdFunction$OFFSET, fieldValue);
    }

    private static final SequenceLayout rdParm$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("rdParm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD rdParm[1]
     * }
     */
    public static final SequenceLayout rdParm$layout() {
        return rdParm$LAYOUT;
    }

    private static final long rdParm$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD rdParm[1]
     * }
     */
    public static final long rdParm$offset() {
        return rdParm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD rdParm[1]
     * }
     */
    public static MemorySegment rdParm(MemorySegment struct) {
        return struct.asSlice(rdParm$OFFSET, rdParm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD rdParm[1]
     * }
     */
    public static void rdParm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rdParm$OFFSET, rdParm$LAYOUT.byteSize());
    }

    private static long[] rdParm$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WORD rdParm[1]
     * }
     */
    public static long[] rdParm$dimensions() {
        return rdParm$DIMS;
    }
    private static final VarHandle rdParm$ELEM_HANDLE = rdParm$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WORD rdParm[1]
     * }
     */
    public static short rdParm(MemorySegment struct, long index0) {
        return (short)rdParm$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WORD rdParm[1]
     * }
     */
    public static void rdParm(MemorySegment struct, long index0, short fieldValue) {
        rdParm$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

