// Generated by jextract

package glx.linux.x86;

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
 *     short x;
 *     short y;
 *     unsigned short width;
 *     unsigned short height;
 *     short angle1;
 *     short angle2;
 * }
 * }
 */
public class XArc {

    XArc() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glx_h.C_SHORT.withName("x"),
        glx_h.C_SHORT.withName("y"),
        glx_h.C_SHORT.withName("width"),
        glx_h.C_SHORT.withName("height"),
        glx_h.C_SHORT.withName("angle1"),
        glx_h.C_SHORT.withName("angle2")
    ).withName("$anon$435:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort x$LAYOUT = (OfShort)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short x
     * }
     */
    public static final OfShort x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short x
     * }
     */
    public static short x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short x
     * }
     */
    public static void x(MemorySegment struct, short fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfShort y$LAYOUT = (OfShort)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short y
     * }
     */
    public static final OfShort y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short y
     * }
     */
    public static short y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short y
     * }
     */
    public static void y(MemorySegment struct, short fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfShort width$LAYOUT = (OfShort)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short width
     * }
     */
    public static final OfShort width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short width
     * }
     */
    public static short width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short width
     * }
     */
    public static void width(MemorySegment struct, short fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfShort height$LAYOUT = (OfShort)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short height
     * }
     */
    public static final OfShort height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short height
     * }
     */
    public static short height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short height
     * }
     */
    public static void height(MemorySegment struct, short fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final OfShort angle1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("angle1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short angle1
     * }
     */
    public static final OfShort angle1$layout() {
        return angle1$LAYOUT;
    }

    private static final long angle1$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short angle1
     * }
     */
    public static final long angle1$offset() {
        return angle1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short angle1
     * }
     */
    public static short angle1(MemorySegment struct) {
        return struct.get(angle1$LAYOUT, angle1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short angle1
     * }
     */
    public static void angle1(MemorySegment struct, short fieldValue) {
        struct.set(angle1$LAYOUT, angle1$OFFSET, fieldValue);
    }

    private static final OfShort angle2$LAYOUT = (OfShort)$LAYOUT.select(groupElement("angle2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short angle2
     * }
     */
    public static final OfShort angle2$layout() {
        return angle2$LAYOUT;
    }

    private static final long angle2$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short angle2
     * }
     */
    public static final long angle2$offset() {
        return angle2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short angle2
     * }
     */
    public static short angle2(MemorySegment struct) {
        return struct.get(angle2$LAYOUT, angle2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short angle2
     * }
     */
    public static void angle2(MemorySegment struct, short fieldValue) {
        struct.set(angle2$LAYOUT, angle2$OFFSET, fieldValue);
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

