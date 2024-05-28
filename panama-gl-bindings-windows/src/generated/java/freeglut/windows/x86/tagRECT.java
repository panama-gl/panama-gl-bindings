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
 * struct tagRECT {
 *     LONG left;
 *     LONG top;
 *     LONG right;
 *     LONG bottom;
 * }
 * }
 */
public class tagRECT {

    tagRECT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("left"),
        freeglut_h.C_LONG.withName("top"),
        freeglut_h.C_LONG.withName("right"),
        freeglut_h.C_LONG.withName("bottom")
    ).withName("tagRECT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt left$LAYOUT = (OfInt)$LAYOUT.select(groupElement("left"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG left
     * }
     */
    public static final OfInt left$layout() {
        return left$LAYOUT;
    }

    private static final long left$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG left
     * }
     */
    public static final long left$offset() {
        return left$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG left
     * }
     */
    public static int left(MemorySegment struct) {
        return struct.get(left$LAYOUT, left$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG left
     * }
     */
    public static void left(MemorySegment struct, int fieldValue) {
        struct.set(left$LAYOUT, left$OFFSET, fieldValue);
    }

    private static final OfInt top$LAYOUT = (OfInt)$LAYOUT.select(groupElement("top"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG top
     * }
     */
    public static final OfInt top$layout() {
        return top$LAYOUT;
    }

    private static final long top$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG top
     * }
     */
    public static final long top$offset() {
        return top$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG top
     * }
     */
    public static int top(MemorySegment struct) {
        return struct.get(top$LAYOUT, top$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG top
     * }
     */
    public static void top(MemorySegment struct, int fieldValue) {
        struct.set(top$LAYOUT, top$OFFSET, fieldValue);
    }

    private static final OfInt right$LAYOUT = (OfInt)$LAYOUT.select(groupElement("right"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG right
     * }
     */
    public static final OfInt right$layout() {
        return right$LAYOUT;
    }

    private static final long right$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG right
     * }
     */
    public static final long right$offset() {
        return right$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG right
     * }
     */
    public static int right(MemorySegment struct) {
        return struct.get(right$LAYOUT, right$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG right
     * }
     */
    public static void right(MemorySegment struct, int fieldValue) {
        struct.set(right$LAYOUT, right$OFFSET, fieldValue);
    }

    private static final OfInt bottom$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bottom"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG bottom
     * }
     */
    public static final OfInt bottom$layout() {
        return bottom$LAYOUT;
    }

    private static final long bottom$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG bottom
     * }
     */
    public static final long bottom$offset() {
        return bottom$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG bottom
     * }
     */
    public static int bottom(MemorySegment struct) {
        return struct.get(bottom$LAYOUT, bottom$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG bottom
     * }
     */
    public static void bottom(MemorySegment struct, int fieldValue) {
        struct.set(bottom$LAYOUT, bottom$OFFSET, fieldValue);
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

