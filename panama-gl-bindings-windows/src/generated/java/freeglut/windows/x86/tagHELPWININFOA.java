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
 * struct tagHELPWININFOA {
 *     int wStructSize;
 *     int x;
 *     int y;
 *     int dx;
 *     int dy;
 *     int wMax;
 *     CHAR rgchMember[2];
 * }
 * }
 */
public class tagHELPWININFOA {

    tagHELPWININFOA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_INT.withName("wStructSize"),
        freeglut_h.C_INT.withName("x"),
        freeglut_h.C_INT.withName("y"),
        freeglut_h.C_INT.withName("dx"),
        freeglut_h.C_INT.withName("dy"),
        freeglut_h.C_INT.withName("wMax"),
        MemoryLayout.sequenceLayout(2, freeglut_h.C_CHAR).withName("rgchMember"),
        MemoryLayout.paddingLayout(2)
    ).withName("tagHELPWININFOA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt wStructSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wStructSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int wStructSize
     * }
     */
    public static final OfInt wStructSize$layout() {
        return wStructSize$LAYOUT;
    }

    private static final long wStructSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int wStructSize
     * }
     */
    public static final long wStructSize$offset() {
        return wStructSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int wStructSize
     * }
     */
    public static int wStructSize(MemorySegment struct) {
        return struct.get(wStructSize$LAYOUT, wStructSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int wStructSize
     * }
     */
    public static void wStructSize(MemorySegment struct, int fieldValue) {
        struct.set(wStructSize$LAYOUT, wStructSize$OFFSET, fieldValue);
    }

    private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static int x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static void x(MemorySegment struct, int fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static int y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static void y(MemorySegment struct, int fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfInt dx$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int dx
     * }
     */
    public static final OfInt dx$layout() {
        return dx$LAYOUT;
    }

    private static final long dx$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int dx
     * }
     */
    public static final long dx$offset() {
        return dx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int dx
     * }
     */
    public static int dx(MemorySegment struct) {
        return struct.get(dx$LAYOUT, dx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int dx
     * }
     */
    public static void dx(MemorySegment struct, int fieldValue) {
        struct.set(dx$LAYOUT, dx$OFFSET, fieldValue);
    }

    private static final OfInt dy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int dy
     * }
     */
    public static final OfInt dy$layout() {
        return dy$LAYOUT;
    }

    private static final long dy$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int dy
     * }
     */
    public static final long dy$offset() {
        return dy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int dy
     * }
     */
    public static int dy(MemorySegment struct) {
        return struct.get(dy$LAYOUT, dy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int dy
     * }
     */
    public static void dy(MemorySegment struct, int fieldValue) {
        struct.set(dy$LAYOUT, dy$OFFSET, fieldValue);
    }

    private static final OfInt wMax$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wMax"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int wMax
     * }
     */
    public static final OfInt wMax$layout() {
        return wMax$LAYOUT;
    }

    private static final long wMax$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int wMax
     * }
     */
    public static final long wMax$offset() {
        return wMax$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int wMax
     * }
     */
    public static int wMax(MemorySegment struct) {
        return struct.get(wMax$LAYOUT, wMax$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int wMax
     * }
     */
    public static void wMax(MemorySegment struct, int fieldValue) {
        struct.set(wMax$LAYOUT, wMax$OFFSET, fieldValue);
    }

    private static final SequenceLayout rgchMember$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("rgchMember"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR rgchMember[2]
     * }
     */
    public static final SequenceLayout rgchMember$layout() {
        return rgchMember$LAYOUT;
    }

    private static final long rgchMember$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR rgchMember[2]
     * }
     */
    public static final long rgchMember$offset() {
        return rgchMember$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR rgchMember[2]
     * }
     */
    public static MemorySegment rgchMember(MemorySegment struct) {
        return struct.asSlice(rgchMember$OFFSET, rgchMember$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR rgchMember[2]
     * }
     */
    public static void rgchMember(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rgchMember$OFFSET, rgchMember$LAYOUT.byteSize());
    }

    private static long[] rgchMember$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR rgchMember[2]
     * }
     */
    public static long[] rgchMember$dimensions() {
        return rgchMember$DIMS;
    }
    private static final VarHandle rgchMember$ELEM_HANDLE = rgchMember$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR rgchMember[2]
     * }
     */
    public static byte rgchMember(MemorySegment struct, long index0) {
        return (byte)rgchMember$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR rgchMember[2]
     * }
     */
    public static void rgchMember(MemorySegment struct, long index0, byte fieldValue) {
        rgchMember$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

