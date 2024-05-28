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
 *     Pixmap background_pixmap;
 *     unsigned long background_pixel;
 *     Pixmap border_pixmap;
 *     unsigned long border_pixel;
 *     int bit_gravity;
 *     int win_gravity;
 *     int backing_store;
 *     unsigned long backing_planes;
 *     unsigned long backing_pixel;
 *     int save_under;
 *     long event_mask;
 *     long do_not_propagate_mask;
 *     int override_redirect;
 *     Colormap colormap;
 *     Cursor cursor;
 * }
 * }
 */
public class XSetWindowAttributes {

    XSetWindowAttributes() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glx_h.C_LONG.withName("background_pixmap"),
        glx_h.C_LONG.withName("background_pixel"),
        glx_h.C_LONG.withName("border_pixmap"),
        glx_h.C_LONG.withName("border_pixel"),
        glx_h.C_INT.withName("bit_gravity"),
        glx_h.C_INT.withName("win_gravity"),
        glx_h.C_INT.withName("backing_store"),
        MemoryLayout.paddingLayout(4),
        glx_h.C_LONG.withName("backing_planes"),
        glx_h.C_LONG.withName("backing_pixel"),
        glx_h.C_INT.withName("save_under"),
        MemoryLayout.paddingLayout(4),
        glx_h.C_LONG.withName("event_mask"),
        glx_h.C_LONG.withName("do_not_propagate_mask"),
        glx_h.C_INT.withName("override_redirect"),
        MemoryLayout.paddingLayout(4),
        glx_h.C_LONG.withName("colormap"),
        glx_h.C_LONG.withName("cursor")
    ).withName("$anon$290:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong background_pixmap$LAYOUT = (OfLong)$LAYOUT.select(groupElement("background_pixmap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Pixmap background_pixmap
     * }
     */
    public static final OfLong background_pixmap$layout() {
        return background_pixmap$LAYOUT;
    }

    private static final long background_pixmap$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Pixmap background_pixmap
     * }
     */
    public static final long background_pixmap$offset() {
        return background_pixmap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Pixmap background_pixmap
     * }
     */
    public static long background_pixmap(MemorySegment struct) {
        return struct.get(background_pixmap$LAYOUT, background_pixmap$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Pixmap background_pixmap
     * }
     */
    public static void background_pixmap(MemorySegment struct, long fieldValue) {
        struct.set(background_pixmap$LAYOUT, background_pixmap$OFFSET, fieldValue);
    }

    private static final OfLong background_pixel$LAYOUT = (OfLong)$LAYOUT.select(groupElement("background_pixel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long background_pixel
     * }
     */
    public static final OfLong background_pixel$layout() {
        return background_pixel$LAYOUT;
    }

    private static final long background_pixel$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long background_pixel
     * }
     */
    public static final long background_pixel$offset() {
        return background_pixel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long background_pixel
     * }
     */
    public static long background_pixel(MemorySegment struct) {
        return struct.get(background_pixel$LAYOUT, background_pixel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long background_pixel
     * }
     */
    public static void background_pixel(MemorySegment struct, long fieldValue) {
        struct.set(background_pixel$LAYOUT, background_pixel$OFFSET, fieldValue);
    }

    private static final OfLong border_pixmap$LAYOUT = (OfLong)$LAYOUT.select(groupElement("border_pixmap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Pixmap border_pixmap
     * }
     */
    public static final OfLong border_pixmap$layout() {
        return border_pixmap$LAYOUT;
    }

    private static final long border_pixmap$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Pixmap border_pixmap
     * }
     */
    public static final long border_pixmap$offset() {
        return border_pixmap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Pixmap border_pixmap
     * }
     */
    public static long border_pixmap(MemorySegment struct) {
        return struct.get(border_pixmap$LAYOUT, border_pixmap$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Pixmap border_pixmap
     * }
     */
    public static void border_pixmap(MemorySegment struct, long fieldValue) {
        struct.set(border_pixmap$LAYOUT, border_pixmap$OFFSET, fieldValue);
    }

    private static final OfLong border_pixel$LAYOUT = (OfLong)$LAYOUT.select(groupElement("border_pixel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long border_pixel
     * }
     */
    public static final OfLong border_pixel$layout() {
        return border_pixel$LAYOUT;
    }

    private static final long border_pixel$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long border_pixel
     * }
     */
    public static final long border_pixel$offset() {
        return border_pixel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long border_pixel
     * }
     */
    public static long border_pixel(MemorySegment struct) {
        return struct.get(border_pixel$LAYOUT, border_pixel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long border_pixel
     * }
     */
    public static void border_pixel(MemorySegment struct, long fieldValue) {
        struct.set(border_pixel$LAYOUT, border_pixel$OFFSET, fieldValue);
    }

    private static final OfInt bit_gravity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bit_gravity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int bit_gravity
     * }
     */
    public static final OfInt bit_gravity$layout() {
        return bit_gravity$LAYOUT;
    }

    private static final long bit_gravity$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int bit_gravity
     * }
     */
    public static final long bit_gravity$offset() {
        return bit_gravity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int bit_gravity
     * }
     */
    public static int bit_gravity(MemorySegment struct) {
        return struct.get(bit_gravity$LAYOUT, bit_gravity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int bit_gravity
     * }
     */
    public static void bit_gravity(MemorySegment struct, int fieldValue) {
        struct.set(bit_gravity$LAYOUT, bit_gravity$OFFSET, fieldValue);
    }

    private static final OfInt win_gravity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("win_gravity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int win_gravity
     * }
     */
    public static final OfInt win_gravity$layout() {
        return win_gravity$LAYOUT;
    }

    private static final long win_gravity$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int win_gravity
     * }
     */
    public static final long win_gravity$offset() {
        return win_gravity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int win_gravity
     * }
     */
    public static int win_gravity(MemorySegment struct) {
        return struct.get(win_gravity$LAYOUT, win_gravity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int win_gravity
     * }
     */
    public static void win_gravity(MemorySegment struct, int fieldValue) {
        struct.set(win_gravity$LAYOUT, win_gravity$OFFSET, fieldValue);
    }

    private static final OfInt backing_store$LAYOUT = (OfInt)$LAYOUT.select(groupElement("backing_store"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int backing_store
     * }
     */
    public static final OfInt backing_store$layout() {
        return backing_store$LAYOUT;
    }

    private static final long backing_store$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int backing_store
     * }
     */
    public static final long backing_store$offset() {
        return backing_store$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int backing_store
     * }
     */
    public static int backing_store(MemorySegment struct) {
        return struct.get(backing_store$LAYOUT, backing_store$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int backing_store
     * }
     */
    public static void backing_store(MemorySegment struct, int fieldValue) {
        struct.set(backing_store$LAYOUT, backing_store$OFFSET, fieldValue);
    }

    private static final OfLong backing_planes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("backing_planes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long backing_planes
     * }
     */
    public static final OfLong backing_planes$layout() {
        return backing_planes$LAYOUT;
    }

    private static final long backing_planes$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long backing_planes
     * }
     */
    public static final long backing_planes$offset() {
        return backing_planes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long backing_planes
     * }
     */
    public static long backing_planes(MemorySegment struct) {
        return struct.get(backing_planes$LAYOUT, backing_planes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long backing_planes
     * }
     */
    public static void backing_planes(MemorySegment struct, long fieldValue) {
        struct.set(backing_planes$LAYOUT, backing_planes$OFFSET, fieldValue);
    }

    private static final OfLong backing_pixel$LAYOUT = (OfLong)$LAYOUT.select(groupElement("backing_pixel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long backing_pixel
     * }
     */
    public static final OfLong backing_pixel$layout() {
        return backing_pixel$LAYOUT;
    }

    private static final long backing_pixel$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long backing_pixel
     * }
     */
    public static final long backing_pixel$offset() {
        return backing_pixel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long backing_pixel
     * }
     */
    public static long backing_pixel(MemorySegment struct) {
        return struct.get(backing_pixel$LAYOUT, backing_pixel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long backing_pixel
     * }
     */
    public static void backing_pixel(MemorySegment struct, long fieldValue) {
        struct.set(backing_pixel$LAYOUT, backing_pixel$OFFSET, fieldValue);
    }

    private static final OfInt save_under$LAYOUT = (OfInt)$LAYOUT.select(groupElement("save_under"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int save_under
     * }
     */
    public static final OfInt save_under$layout() {
        return save_under$LAYOUT;
    }

    private static final long save_under$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int save_under
     * }
     */
    public static final long save_under$offset() {
        return save_under$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int save_under
     * }
     */
    public static int save_under(MemorySegment struct) {
        return struct.get(save_under$LAYOUT, save_under$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int save_under
     * }
     */
    public static void save_under(MemorySegment struct, int fieldValue) {
        struct.set(save_under$LAYOUT, save_under$OFFSET, fieldValue);
    }

    private static final OfLong event_mask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("event_mask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long event_mask
     * }
     */
    public static final OfLong event_mask$layout() {
        return event_mask$LAYOUT;
    }

    private static final long event_mask$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long event_mask
     * }
     */
    public static final long event_mask$offset() {
        return event_mask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long event_mask
     * }
     */
    public static long event_mask(MemorySegment struct) {
        return struct.get(event_mask$LAYOUT, event_mask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long event_mask
     * }
     */
    public static void event_mask(MemorySegment struct, long fieldValue) {
        struct.set(event_mask$LAYOUT, event_mask$OFFSET, fieldValue);
    }

    private static final OfLong do_not_propagate_mask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("do_not_propagate_mask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long do_not_propagate_mask
     * }
     */
    public static final OfLong do_not_propagate_mask$layout() {
        return do_not_propagate_mask$LAYOUT;
    }

    private static final long do_not_propagate_mask$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long do_not_propagate_mask
     * }
     */
    public static final long do_not_propagate_mask$offset() {
        return do_not_propagate_mask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long do_not_propagate_mask
     * }
     */
    public static long do_not_propagate_mask(MemorySegment struct) {
        return struct.get(do_not_propagate_mask$LAYOUT, do_not_propagate_mask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long do_not_propagate_mask
     * }
     */
    public static void do_not_propagate_mask(MemorySegment struct, long fieldValue) {
        struct.set(do_not_propagate_mask$LAYOUT, do_not_propagate_mask$OFFSET, fieldValue);
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

    private static final long override_redirect$OFFSET = 88;

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

    private static final OfLong colormap$LAYOUT = (OfLong)$LAYOUT.select(groupElement("colormap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Colormap colormap
     * }
     */
    public static final OfLong colormap$layout() {
        return colormap$LAYOUT;
    }

    private static final long colormap$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Colormap colormap
     * }
     */
    public static final long colormap$offset() {
        return colormap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Colormap colormap
     * }
     */
    public static long colormap(MemorySegment struct) {
        return struct.get(colormap$LAYOUT, colormap$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Colormap colormap
     * }
     */
    public static void colormap(MemorySegment struct, long fieldValue) {
        struct.set(colormap$LAYOUT, colormap$OFFSET, fieldValue);
    }

    private static final OfLong cursor$LAYOUT = (OfLong)$LAYOUT.select(groupElement("cursor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Cursor cursor
     * }
     */
    public static final OfLong cursor$layout() {
        return cursor$LAYOUT;
    }

    private static final long cursor$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Cursor cursor
     * }
     */
    public static final long cursor$offset() {
        return cursor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Cursor cursor
     * }
     */
    public static long cursor(MemorySegment struct) {
        return struct.get(cursor$LAYOUT, cursor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Cursor cursor
     * }
     */
    public static void cursor(MemorySegment struct, long fieldValue) {
        struct.set(cursor$LAYOUT, cursor$OFFSET, fieldValue);
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

