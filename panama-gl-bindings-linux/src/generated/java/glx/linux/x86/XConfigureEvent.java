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
 *     int type;
 *     unsigned long serial;
 *     int send_event;
 *     Display *display;
 *     Window event;
 *     Window window;
 *     int x;
 *     int y;
 *     int width;
 *     int height;
 *     int border_width;
 *     Window above;
 *     int override_redirect;
 * }
 * }
 */
public class XConfigureEvent {

    XConfigureEvent() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glx_h.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        glx_h.C_LONG.withName("serial"),
        glx_h.C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(4),
        glx_h.C_POINTER.withName("display"),
        glx_h.C_LONG.withName("event"),
        glx_h.C_LONG.withName("window"),
        glx_h.C_INT.withName("x"),
        glx_h.C_INT.withName("y"),
        glx_h.C_INT.withName("width"),
        glx_h.C_INT.withName("height"),
        glx_h.C_INT.withName("border_width"),
        MemoryLayout.paddingLayout(4),
        glx_h.C_LONG.withName("above"),
        glx_h.C_INT.withName("override_redirect"),
        MemoryLayout.paddingLayout(4)
    ).withName("$anon$768:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
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

    private static final OfLong event$LAYOUT = (OfLong)$LAYOUT.select(groupElement("event"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Window event
     * }
     */
    public static final OfLong event$layout() {
        return event$LAYOUT;
    }

    private static final long event$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Window event
     * }
     */
    public static final long event$offset() {
        return event$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Window event
     * }
     */
    public static long event(MemorySegment struct) {
        return struct.get(event$LAYOUT, event$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Window event
     * }
     */
    public static void event(MemorySegment struct, long fieldValue) {
        struct.set(event$LAYOUT, event$OFFSET, fieldValue);
    }

    private static final OfLong window$LAYOUT = (OfLong)$LAYOUT.select(groupElement("window"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Window window
     * }
     */
    public static final OfLong window$layout() {
        return window$LAYOUT;
    }

    private static final long window$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Window window
     * }
     */
    public static final long window$offset() {
        return window$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Window window
     * }
     */
    public static long window(MemorySegment struct) {
        return struct.get(window$LAYOUT, window$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Window window
     * }
     */
    public static void window(MemorySegment struct, long fieldValue) {
        struct.set(window$LAYOUT, window$OFFSET, fieldValue);
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

    private static final OfInt border_width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("border_width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int border_width
     * }
     */
    public static final OfInt border_width$layout() {
        return border_width$LAYOUT;
    }

    private static final long border_width$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int border_width
     * }
     */
    public static final long border_width$offset() {
        return border_width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int border_width
     * }
     */
    public static int border_width(MemorySegment struct) {
        return struct.get(border_width$LAYOUT, border_width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int border_width
     * }
     */
    public static void border_width(MemorySegment struct, int fieldValue) {
        struct.set(border_width$LAYOUT, border_width$OFFSET, fieldValue);
    }

    private static final OfLong above$LAYOUT = (OfLong)$LAYOUT.select(groupElement("above"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Window above
     * }
     */
    public static final OfLong above$layout() {
        return above$LAYOUT;
    }

    private static final long above$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Window above
     * }
     */
    public static final long above$offset() {
        return above$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Window above
     * }
     */
    public static long above(MemorySegment struct) {
        return struct.get(above$LAYOUT, above$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Window above
     * }
     */
    public static void above(MemorySegment struct, long fieldValue) {
        struct.set(above$LAYOUT, above$OFFSET, fieldValue);
    }

    private static final OfInt override_redirect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("override_redirect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int override_redirect
     * }
     */
    public static final OfInt override_redirect$layout() {
        return override_redirect$LAYOUT;
    }

    private static final long override_redirect$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int override_redirect
     * }
     */
    public static final long override_redirect$offset() {
        return override_redirect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int override_redirect
     * }
     */
    public static int override_redirect(MemorySegment struct) {
        return struct.get(override_redirect$LAYOUT, override_redirect$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int override_redirect
     * }
     */
    public static void override_redirect(MemorySegment struct, int fieldValue) {
        struct.set(override_redirect$LAYOUT, override_redirect$OFFSET, fieldValue);
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

