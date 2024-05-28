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
 *     int event_type;
 *     int draw_type;
 *     unsigned long serial;
 *     int send_event;
 *     Display *display;
 *     GLXDrawable drawable;
 *     unsigned int buffer_mask;
 *     unsigned int aux_buffer;
 *     int x;
 *     int y;
 *     int width;
 *     int height;
 *     int count;
 * }
 * }
 */
public class GLXPbufferClobberEvent {

    GLXPbufferClobberEvent() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glxext_h.C_INT.withName("event_type"),
        glxext_h.C_INT.withName("draw_type"),
        glxext_h.C_LONG.withName("serial"),
        glxext_h.C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(4),
        glxext_h.C_POINTER.withName("display"),
        glxext_h.C_LONG.withName("drawable"),
        glxext_h.C_INT.withName("buffer_mask"),
        glxext_h.C_INT.withName("aux_buffer"),
        glxext_h.C_INT.withName("x"),
        glxext_h.C_INT.withName("y"),
        glxext_h.C_INT.withName("width"),
        glxext_h.C_INT.withName("height"),
        glxext_h.C_INT.withName("count"),
        MemoryLayout.paddingLayout(4)
    ).withName("$anon$477:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt event_type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("event_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int event_type
     * }
     */
    public static final OfInt event_type$layout() {
        return event_type$LAYOUT;
    }

    private static final long event_type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int event_type
     * }
     */
    public static final long event_type$offset() {
        return event_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int event_type
     * }
     */
    public static int event_type(MemorySegment struct) {
        return struct.get(event_type$LAYOUT, event_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int event_type
     * }
     */
    public static void event_type(MemorySegment struct, int fieldValue) {
        struct.set(event_type$LAYOUT, event_type$OFFSET, fieldValue);
    }

    private static final OfInt draw_type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("draw_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int draw_type
     * }
     */
    public static final OfInt draw_type$layout() {
        return draw_type$LAYOUT;
    }

    private static final long draw_type$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int draw_type
     * }
     */
    public static final long draw_type$offset() {
        return draw_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int draw_type
     * }
     */
    public static int draw_type(MemorySegment struct) {
        return struct.get(draw_type$LAYOUT, draw_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int draw_type
     * }
     */
    public static void draw_type(MemorySegment struct, int fieldValue) {
        struct.set(draw_type$LAYOUT, draw_type$OFFSET, fieldValue);
    }

    private static final OfLong serial$LAYOUT = (OfLong)$LAYOUT.select(groupElement("serial"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static final OfLong serial$layout() {
        return serial$LAYOUT;
    }

    private static final long serial$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static final long serial$offset() {
        return serial$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static long serial(MemorySegment struct) {
        return struct.get(serial$LAYOUT, serial$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static void serial(MemorySegment struct, long fieldValue) {
        struct.set(serial$LAYOUT, serial$OFFSET, fieldValue);
    }

    private static final OfInt send_event$LAYOUT = (OfInt)$LAYOUT.select(groupElement("send_event"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int send_event
     * }
     */
    public static final OfInt send_event$layout() {
        return send_event$LAYOUT;
    }

    private static final long send_event$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int send_event
     * }
     */
    public static final long send_event$offset() {
        return send_event$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int send_event
     * }
     */
    public static int send_event(MemorySegment struct) {
        return struct.get(send_event$LAYOUT, send_event$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int send_event
     * }
     */
    public static void send_event(MemorySegment struct, int fieldValue) {
        struct.set(send_event$LAYOUT, send_event$OFFSET, fieldValue);
    }

    private static final AddressLayout display$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("display"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static final AddressLayout display$layout() {
        return display$LAYOUT;
    }

    private static final long display$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static final long display$offset() {
        return display$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static MemorySegment display(MemorySegment struct) {
        return struct.get(display$LAYOUT, display$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static void display(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(display$LAYOUT, display$OFFSET, fieldValue);
    }

    private static final OfLong drawable$LAYOUT = (OfLong)$LAYOUT.select(groupElement("drawable"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GLXDrawable drawable
     * }
     */
    public static final OfLong drawable$layout() {
        return drawable$LAYOUT;
    }

    private static final long drawable$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GLXDrawable drawable
     * }
     */
    public static final long drawable$offset() {
        return drawable$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GLXDrawable drawable
     * }
     */
    public static long drawable(MemorySegment struct) {
        return struct.get(drawable$LAYOUT, drawable$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GLXDrawable drawable
     * }
     */
    public static void drawable(MemorySegment struct, long fieldValue) {
        struct.set(drawable$LAYOUT, drawable$OFFSET, fieldValue);
    }

    private static final OfInt buffer_mask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("buffer_mask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int buffer_mask
     * }
     */
    public static final OfInt buffer_mask$layout() {
        return buffer_mask$LAYOUT;
    }

    private static final long buffer_mask$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int buffer_mask
     * }
     */
    public static final long buffer_mask$offset() {
        return buffer_mask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int buffer_mask
     * }
     */
    public static int buffer_mask(MemorySegment struct) {
        return struct.get(buffer_mask$LAYOUT, buffer_mask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int buffer_mask
     * }
     */
    public static void buffer_mask(MemorySegment struct, int fieldValue) {
        struct.set(buffer_mask$LAYOUT, buffer_mask$OFFSET, fieldValue);
    }

    private static final OfInt aux_buffer$LAYOUT = (OfInt)$LAYOUT.select(groupElement("aux_buffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int aux_buffer
     * }
     */
    public static final OfInt aux_buffer$layout() {
        return aux_buffer$LAYOUT;
    }

    private static final long aux_buffer$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int aux_buffer
     * }
     */
    public static final long aux_buffer$offset() {
        return aux_buffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int aux_buffer
     * }
     */
    public static int aux_buffer(MemorySegment struct) {
        return struct.get(aux_buffer$LAYOUT, aux_buffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int aux_buffer
     * }
     */
    public static void aux_buffer(MemorySegment struct, int fieldValue) {
        struct.set(aux_buffer$LAYOUT, aux_buffer$OFFSET, fieldValue);
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

    private static final long x$OFFSET = 48;

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

    private static final long y$OFFSET = 52;

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

    private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final OfInt width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static int width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static void width(MemorySegment struct, int fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final OfInt height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static int height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static void height(MemorySegment struct, int fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final OfInt count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int count
     * }
     */
    public static final OfInt count$layout() {
        return count$LAYOUT;
    }

    private static final long count$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int count
     * }
     */
    public static final long count$offset() {
        return count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int count
     * }
     */
    public static int count(MemorySegment struct) {
        return struct.get(count$LAYOUT, count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int count
     * }
     */
    public static void count(MemorySegment struct, int fieldValue) {
        struct.set(count$LAYOUT, count$OFFSET, fieldValue);
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

