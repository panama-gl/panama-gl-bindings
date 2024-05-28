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
 * struct _TRIVERTEX {
 *     LONG x;
 *     LONG y;
 *     COLOR16 Red;
 *     COLOR16 Green;
 *     COLOR16 Blue;
 *     COLOR16 Alpha;
 * }
 * }
 */
public class _TRIVERTEX {

    _TRIVERTEX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("x"),
        wgl_h.C_LONG.withName("y"),
        wgl_h.C_SHORT.withName("Red"),
        wgl_h.C_SHORT.withName("Green"),
        wgl_h.C_SHORT.withName("Blue"),
        wgl_h.C_SHORT.withName("Alpha")
    ).withName("_TRIVERTEX");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG x
     * }
     */
    public static int x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG x
     * }
     */
    public static void x(MemorySegment struct, int fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG y
     * }
     */
    public static int y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG y
     * }
     */
    public static void y(MemorySegment struct, int fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfShort Red$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Red"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * COLOR16 Red
     * }
     */
    public static final OfShort Red$layout() {
        return Red$LAYOUT;
    }

    private static final long Red$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * COLOR16 Red
     * }
     */
    public static final long Red$offset() {
        return Red$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * COLOR16 Red
     * }
     */
    public static short Red(MemorySegment struct) {
        return struct.get(Red$LAYOUT, Red$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * COLOR16 Red
     * }
     */
    public static void Red(MemorySegment struct, short fieldValue) {
        struct.set(Red$LAYOUT, Red$OFFSET, fieldValue);
    }

    private static final OfShort Green$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Green"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * COLOR16 Green
     * }
     */
    public static final OfShort Green$layout() {
        return Green$LAYOUT;
    }

    private static final long Green$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * COLOR16 Green
     * }
     */
    public static final long Green$offset() {
        return Green$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * COLOR16 Green
     * }
     */
    public static short Green(MemorySegment struct) {
        return struct.get(Green$LAYOUT, Green$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * COLOR16 Green
     * }
     */
    public static void Green(MemorySegment struct, short fieldValue) {
        struct.set(Green$LAYOUT, Green$OFFSET, fieldValue);
    }

    private static final OfShort Blue$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Blue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * COLOR16 Blue
     * }
     */
    public static final OfShort Blue$layout() {
        return Blue$LAYOUT;
    }

    private static final long Blue$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * COLOR16 Blue
     * }
     */
    public static final long Blue$offset() {
        return Blue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * COLOR16 Blue
     * }
     */
    public static short Blue(MemorySegment struct) {
        return struct.get(Blue$LAYOUT, Blue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * COLOR16 Blue
     * }
     */
    public static void Blue(MemorySegment struct, short fieldValue) {
        struct.set(Blue$LAYOUT, Blue$OFFSET, fieldValue);
    }

    private static final OfShort Alpha$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Alpha"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * COLOR16 Alpha
     * }
     */
    public static final OfShort Alpha$layout() {
        return Alpha$LAYOUT;
    }

    private static final long Alpha$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * COLOR16 Alpha
     * }
     */
    public static final long Alpha$offset() {
        return Alpha$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * COLOR16 Alpha
     * }
     */
    public static short Alpha(MemorySegment struct) {
        return struct.get(Alpha$LAYOUT, Alpha$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * COLOR16 Alpha
     * }
     */
    public static void Alpha(MemorySegment struct, short fieldValue) {
        struct.set(Alpha$LAYOUT, Alpha$OFFSET, fieldValue);
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

