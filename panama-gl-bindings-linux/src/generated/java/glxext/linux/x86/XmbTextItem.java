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
 *     char *chars;
 *     int nchars;
 *     int delta;
 *     XFontSet font_set;
 * }
 * }
 */
public class XmbTextItem {

    XmbTextItem() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glxext_h.C_POINTER.withName("chars"),
        glxext_h.C_INT.withName("nchars"),
        glxext_h.C_INT.withName("delta"),
        glxext_h.C_POINTER.withName("font_set")
    ).withName("$anon$1096:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout chars$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("chars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *chars
     * }
     */
    public static final AddressLayout chars$layout() {
        return chars$LAYOUT;
    }

    private static final long chars$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *chars
     * }
     */
    public static final long chars$offset() {
        return chars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *chars
     * }
     */
    public static MemorySegment chars(MemorySegment struct) {
        return struct.get(chars$LAYOUT, chars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *chars
     * }
     */
    public static void chars(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(chars$LAYOUT, chars$OFFSET, fieldValue);
    }

    private static final OfInt nchars$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nchars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int nchars
     * }
     */
    public static final OfInt nchars$layout() {
        return nchars$LAYOUT;
    }

    private static final long nchars$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int nchars
     * }
     */
    public static final long nchars$offset() {
        return nchars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int nchars
     * }
     */
    public static int nchars(MemorySegment struct) {
        return struct.get(nchars$LAYOUT, nchars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int nchars
     * }
     */
    public static void nchars(MemorySegment struct, int fieldValue) {
        struct.set(nchars$LAYOUT, nchars$OFFSET, fieldValue);
    }

    private static final OfInt delta$LAYOUT = (OfInt)$LAYOUT.select(groupElement("delta"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int delta
     * }
     */
    public static final OfInt delta$layout() {
        return delta$LAYOUT;
    }

    private static final long delta$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int delta
     * }
     */
    public static final long delta$offset() {
        return delta$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int delta
     * }
     */
    public static int delta(MemorySegment struct) {
        return struct.get(delta$LAYOUT, delta$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int delta
     * }
     */
    public static void delta(MemorySegment struct, int fieldValue) {
        struct.set(delta$LAYOUT, delta$OFFSET, fieldValue);
    }

    private static final AddressLayout font_set$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("font_set"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XFontSet font_set
     * }
     */
    public static final AddressLayout font_set$layout() {
        return font_set$LAYOUT;
    }

    private static final long font_set$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XFontSet font_set
     * }
     */
    public static final long font_set$offset() {
        return font_set$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XFontSet font_set
     * }
     */
    public static MemorySegment font_set(MemorySegment struct) {
        return struct.get(font_set$LAYOUT, font_set$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XFontSet font_set
     * }
     */
    public static void font_set(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(font_set$LAYOUT, font_set$OFFSET, fieldValue);
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

