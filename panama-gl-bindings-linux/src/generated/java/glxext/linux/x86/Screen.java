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
 *     XExtData *ext_data;
 *     struct _XDisplay *display;
 *     Window root;
 *     int width;
 *     int height;
 *     int mwidth;
 *     int mheight;
 *     int ndepths;
 *     Depth *depths;
 *     int root_depth;
 *     Visual *root_visual;
 *     GC default_gc;
 *     Colormap cmap;
 *     unsigned long white_pixel;
 *     unsigned long black_pixel;
 *     int max_maps;
 *     int min_maps;
 *     int backing_store;
 *     int save_unders;
 *     long root_input_mask;
 * }
 * }
 */
public class Screen {

    Screen() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glxext_h.C_POINTER.withName("ext_data"),
        glxext_h.C_POINTER.withName("display"),
        glxext_h.C_LONG.withName("root"),
        glxext_h.C_INT.withName("width"),
        glxext_h.C_INT.withName("height"),
        glxext_h.C_INT.withName("mwidth"),
        glxext_h.C_INT.withName("mheight"),
        glxext_h.C_INT.withName("ndepths"),
        MemoryLayout.paddingLayout(4),
        glxext_h.C_POINTER.withName("depths"),
        glxext_h.C_INT.withName("root_depth"),
        MemoryLayout.paddingLayout(4),
        glxext_h.C_POINTER.withName("root_visual"),
        glxext_h.C_POINTER.withName("default_gc"),
        glxext_h.C_LONG.withName("cmap"),
        glxext_h.C_LONG.withName("white_pixel"),
        glxext_h.C_LONG.withName("black_pixel"),
        glxext_h.C_INT.withName("max_maps"),
        glxext_h.C_INT.withName("min_maps"),
        glxext_h.C_INT.withName("backing_store"),
        glxext_h.C_INT.withName("save_unders"),
        glxext_h.C_LONG.withName("root_input_mask")
    ).withName("$anon$257:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout ext_data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ext_data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XExtData *ext_data
     * }
     */
    public static final AddressLayout ext_data$layout() {
        return ext_data$LAYOUT;
    }

    private static final long ext_data$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XExtData *ext_data
     * }
     */
    public static final long ext_data$offset() {
        return ext_data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XExtData *ext_data
     * }
     */
    public static MemorySegment ext_data(MemorySegment struct) {
        return struct.get(ext_data$LAYOUT, ext_data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XExtData *ext_data
     * }
     */
    public static void ext_data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ext_data$LAYOUT, ext_data$OFFSET, fieldValue);
    }

    private static final AddressLayout display$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("display"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _XDisplay *display
     * }
     */
    public static final AddressLayout display$layout() {
        return display$LAYOUT;
    }

    private static final long display$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _XDisplay *display
     * }
     */
    public static final long display$offset() {
        return display$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _XDisplay *display
     * }
     */
    public static MemorySegment display(MemorySegment struct) {
        return struct.get(display$LAYOUT, display$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _XDisplay *display
     * }
     */
    public static void display(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(display$LAYOUT, display$OFFSET, fieldValue);
    }

    private static final OfLong root$LAYOUT = (OfLong)$LAYOUT.select(groupElement("root"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Window root
     * }
     */
    public static final OfLong root$layout() {
        return root$LAYOUT;
    }

    private static final long root$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Window root
     * }
     */
    public static final long root$offset() {
        return root$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Window root
     * }
     */
    public static long root(MemorySegment struct) {
        return struct.get(root$LAYOUT, root$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Window root
     * }
     */
    public static void root(MemorySegment struct, long fieldValue) {
        struct.set(root$LAYOUT, root$OFFSET, fieldValue);
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

    private static final long width$OFFSET = 24;

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

    private static final long height$OFFSET = 28;

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

    private static final OfInt mwidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("mwidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int mwidth
     * }
     */
    public static final OfInt mwidth$layout() {
        return mwidth$LAYOUT;
    }

    private static final long mwidth$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int mwidth
     * }
     */
    public static final long mwidth$offset() {
        return mwidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int mwidth
     * }
     */
    public static int mwidth(MemorySegment struct) {
        return struct.get(mwidth$LAYOUT, mwidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int mwidth
     * }
     */
    public static void mwidth(MemorySegment struct, int fieldValue) {
        struct.set(mwidth$LAYOUT, mwidth$OFFSET, fieldValue);
    }

    private static final OfInt mheight$LAYOUT = (OfInt)$LAYOUT.select(groupElement("mheight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int mheight
     * }
     */
    public static final OfInt mheight$layout() {
        return mheight$LAYOUT;
    }

    private static final long mheight$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int mheight
     * }
     */
    public static final long mheight$offset() {
        return mheight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int mheight
     * }
     */
    public static int mheight(MemorySegment struct) {
        return struct.get(mheight$LAYOUT, mheight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int mheight
     * }
     */
    public static void mheight(MemorySegment struct, int fieldValue) {
        struct.set(mheight$LAYOUT, mheight$OFFSET, fieldValue);
    }

    private static final OfInt ndepths$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ndepths"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int ndepths
     * }
     */
    public static final OfInt ndepths$layout() {
        return ndepths$LAYOUT;
    }

    private static final long ndepths$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int ndepths
     * }
     */
    public static final long ndepths$offset() {
        return ndepths$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int ndepths
     * }
     */
    public static int ndepths(MemorySegment struct) {
        return struct.get(ndepths$LAYOUT, ndepths$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int ndepths
     * }
     */
    public static void ndepths(MemorySegment struct, int fieldValue) {
        struct.set(ndepths$LAYOUT, ndepths$OFFSET, fieldValue);
    }

    private static final AddressLayout depths$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("depths"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Depth *depths
     * }
     */
    public static final AddressLayout depths$layout() {
        return depths$LAYOUT;
    }

    private static final long depths$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Depth *depths
     * }
     */
    public static final long depths$offset() {
        return depths$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Depth *depths
     * }
     */
    public static MemorySegment depths(MemorySegment struct) {
        return struct.get(depths$LAYOUT, depths$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Depth *depths
     * }
     */
    public static void depths(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(depths$LAYOUT, depths$OFFSET, fieldValue);
    }

    private static final OfInt root_depth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("root_depth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int root_depth
     * }
     */
    public static final OfInt root_depth$layout() {
        return root_depth$LAYOUT;
    }

    private static final long root_depth$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int root_depth
     * }
     */
    public static final long root_depth$offset() {
        return root_depth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int root_depth
     * }
     */
    public static int root_depth(MemorySegment struct) {
        return struct.get(root_depth$LAYOUT, root_depth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int root_depth
     * }
     */
    public static void root_depth(MemorySegment struct, int fieldValue) {
        struct.set(root_depth$LAYOUT, root_depth$OFFSET, fieldValue);
    }

    private static final AddressLayout root_visual$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("root_visual"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Visual *root_visual
     * }
     */
    public static final AddressLayout root_visual$layout() {
        return root_visual$LAYOUT;
    }

    private static final long root_visual$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Visual *root_visual
     * }
     */
    public static final long root_visual$offset() {
        return root_visual$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Visual *root_visual
     * }
     */
    public static MemorySegment root_visual(MemorySegment struct) {
        return struct.get(root_visual$LAYOUT, root_visual$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Visual *root_visual
     * }
     */
    public static void root_visual(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(root_visual$LAYOUT, root_visual$OFFSET, fieldValue);
    }

    private static final AddressLayout default_gc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("default_gc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GC default_gc
     * }
     */
    public static final AddressLayout default_gc$layout() {
        return default_gc$LAYOUT;
    }

    private static final long default_gc$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GC default_gc
     * }
     */
    public static final long default_gc$offset() {
        return default_gc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GC default_gc
     * }
     */
    public static MemorySegment default_gc(MemorySegment struct) {
        return struct.get(default_gc$LAYOUT, default_gc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GC default_gc
     * }
     */
    public static void default_gc(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(default_gc$LAYOUT, default_gc$OFFSET, fieldValue);
    }

    private static final OfLong cmap$LAYOUT = (OfLong)$LAYOUT.select(groupElement("cmap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Colormap cmap
     * }
     */
    public static final OfLong cmap$layout() {
        return cmap$LAYOUT;
    }

    private static final long cmap$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Colormap cmap
     * }
     */
    public static final long cmap$offset() {
        return cmap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Colormap cmap
     * }
     */
    public static long cmap(MemorySegment struct) {
        return struct.get(cmap$LAYOUT, cmap$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Colormap cmap
     * }
     */
    public static void cmap(MemorySegment struct, long fieldValue) {
        struct.set(cmap$LAYOUT, cmap$OFFSET, fieldValue);
    }

    private static final OfLong white_pixel$LAYOUT = (OfLong)$LAYOUT.select(groupElement("white_pixel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long white_pixel
     * }
     */
    public static final OfLong white_pixel$layout() {
        return white_pixel$LAYOUT;
    }

    private static final long white_pixel$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long white_pixel
     * }
     */
    public static final long white_pixel$offset() {
        return white_pixel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long white_pixel
     * }
     */
    public static long white_pixel(MemorySegment struct) {
        return struct.get(white_pixel$LAYOUT, white_pixel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long white_pixel
     * }
     */
    public static void white_pixel(MemorySegment struct, long fieldValue) {
        struct.set(white_pixel$LAYOUT, white_pixel$OFFSET, fieldValue);
    }

    private static final OfLong black_pixel$LAYOUT = (OfLong)$LAYOUT.select(groupElement("black_pixel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long black_pixel
     * }
     */
    public static final OfLong black_pixel$layout() {
        return black_pixel$LAYOUT;
    }

    private static final long black_pixel$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long black_pixel
     * }
     */
    public static final long black_pixel$offset() {
        return black_pixel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long black_pixel
     * }
     */
    public static long black_pixel(MemorySegment struct) {
        return struct.get(black_pixel$LAYOUT, black_pixel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long black_pixel
     * }
     */
    public static void black_pixel(MemorySegment struct, long fieldValue) {
        struct.set(black_pixel$LAYOUT, black_pixel$OFFSET, fieldValue);
    }

    private static final OfInt max_maps$LAYOUT = (OfInt)$LAYOUT.select(groupElement("max_maps"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int max_maps
     * }
     */
    public static final OfInt max_maps$layout() {
        return max_maps$LAYOUT;
    }

    private static final long max_maps$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int max_maps
     * }
     */
    public static final long max_maps$offset() {
        return max_maps$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int max_maps
     * }
     */
    public static int max_maps(MemorySegment struct) {
        return struct.get(max_maps$LAYOUT, max_maps$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int max_maps
     * }
     */
    public static void max_maps(MemorySegment struct, int fieldValue) {
        struct.set(max_maps$LAYOUT, max_maps$OFFSET, fieldValue);
    }

    private static final OfInt min_maps$LAYOUT = (OfInt)$LAYOUT.select(groupElement("min_maps"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int min_maps
     * }
     */
    public static final OfInt min_maps$layout() {
        return min_maps$LAYOUT;
    }

    private static final long min_maps$OFFSET = 108;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int min_maps
     * }
     */
    public static final long min_maps$offset() {
        return min_maps$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int min_maps
     * }
     */
    public static int min_maps(MemorySegment struct) {
        return struct.get(min_maps$LAYOUT, min_maps$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int min_maps
     * }
     */
    public static void min_maps(MemorySegment struct, int fieldValue) {
        struct.set(min_maps$LAYOUT, min_maps$OFFSET, fieldValue);
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

    private static final long backing_store$OFFSET = 112;

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

    private static final OfInt save_unders$LAYOUT = (OfInt)$LAYOUT.select(groupElement("save_unders"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int save_unders
     * }
     */
    public static final OfInt save_unders$layout() {
        return save_unders$LAYOUT;
    }

    private static final long save_unders$OFFSET = 116;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int save_unders
     * }
     */
    public static final long save_unders$offset() {
        return save_unders$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int save_unders
     * }
     */
    public static int save_unders(MemorySegment struct) {
        return struct.get(save_unders$LAYOUT, save_unders$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int save_unders
     * }
     */
    public static void save_unders(MemorySegment struct, int fieldValue) {
        struct.set(save_unders$LAYOUT, save_unders$OFFSET, fieldValue);
    }

    private static final OfLong root_input_mask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("root_input_mask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long root_input_mask
     * }
     */
    public static final OfLong root_input_mask$layout() {
        return root_input_mask$LAYOUT;
    }

    private static final long root_input_mask$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long root_input_mask
     * }
     */
    public static final long root_input_mask$offset() {
        return root_input_mask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long root_input_mask
     * }
     */
    public static long root_input_mask(MemorySegment struct) {
        return struct.get(root_input_mask$LAYOUT, root_input_mask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long root_input_mask
     * }
     */
    public static void root_input_mask(MemorySegment struct, long fieldValue) {
        struct.set(root_input_mask$LAYOUT, root_input_mask$OFFSET, fieldValue);
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

