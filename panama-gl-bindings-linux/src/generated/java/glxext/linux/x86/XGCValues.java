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
 *     int function;
 *     unsigned long plane_mask;
 *     unsigned long foreground;
 *     unsigned long background;
 *     int line_width;
 *     int line_style;
 *     int cap_style;
 *     int join_style;
 *     int fill_style;
 *     int fill_rule;
 *     int arc_mode;
 *     Pixmap tile;
 *     Pixmap stipple;
 *     int ts_x_origin;
 *     int ts_y_origin;
 *     Font font;
 *     int subwindow_mode;
 *     int graphics_exposures;
 *     int clip_x_origin;
 *     int clip_y_origin;
 *     Pixmap clip_mask;
 *     int dash_offset;
 *     char dashes;
 * }
 * }
 */
public class XGCValues {

    XGCValues() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glxext_h.C_INT.withName("function"),
        MemoryLayout.paddingLayout(4),
        glxext_h.C_LONG.withName("plane_mask"),
        glxext_h.C_LONG.withName("foreground"),
        glxext_h.C_LONG.withName("background"),
        glxext_h.C_INT.withName("line_width"),
        glxext_h.C_INT.withName("line_style"),
        glxext_h.C_INT.withName("cap_style"),
        glxext_h.C_INT.withName("join_style"),
        glxext_h.C_INT.withName("fill_style"),
        glxext_h.C_INT.withName("fill_rule"),
        glxext_h.C_INT.withName("arc_mode"),
        MemoryLayout.paddingLayout(4),
        glxext_h.C_LONG.withName("tile"),
        glxext_h.C_LONG.withName("stipple"),
        glxext_h.C_INT.withName("ts_x_origin"),
        glxext_h.C_INT.withName("ts_y_origin"),
        glxext_h.C_LONG.withName("font"),
        glxext_h.C_INT.withName("subwindow_mode"),
        glxext_h.C_INT.withName("graphics_exposures"),
        glxext_h.C_INT.withName("clip_x_origin"),
        glxext_h.C_INT.withName("clip_y_origin"),
        glxext_h.C_LONG.withName("clip_mask"),
        glxext_h.C_INT.withName("dash_offset"),
        glxext_h.C_CHAR.withName("dashes"),
        MemoryLayout.paddingLayout(3)
    ).withName("$anon$181:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt function$LAYOUT = (OfInt)$LAYOUT.select(groupElement("function"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int function
     * }
     */
    public static final OfInt function$layout() {
        return function$LAYOUT;
    }

    private static final long function$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int function
     * }
     */
    public static final long function$offset() {
        return function$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int function
     * }
     */
    public static int function(MemorySegment struct) {
        return struct.get(function$LAYOUT, function$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int function
     * }
     */
    public static void function(MemorySegment struct, int fieldValue) {
        struct.set(function$LAYOUT, function$OFFSET, fieldValue);
    }

    private static final OfLong plane_mask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("plane_mask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long plane_mask
     * }
     */
    public static final OfLong plane_mask$layout() {
        return plane_mask$LAYOUT;
    }

    private static final long plane_mask$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long plane_mask
     * }
     */
    public static final long plane_mask$offset() {
        return plane_mask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long plane_mask
     * }
     */
    public static long plane_mask(MemorySegment struct) {
        return struct.get(plane_mask$LAYOUT, plane_mask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long plane_mask
     * }
     */
    public static void plane_mask(MemorySegment struct, long fieldValue) {
        struct.set(plane_mask$LAYOUT, plane_mask$OFFSET, fieldValue);
    }

    private static final OfLong foreground$LAYOUT = (OfLong)$LAYOUT.select(groupElement("foreground"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long foreground
     * }
     */
    public static final OfLong foreground$layout() {
        return foreground$LAYOUT;
    }

    private static final long foreground$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long foreground
     * }
     */
    public static final long foreground$offset() {
        return foreground$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long foreground
     * }
     */
    public static long foreground(MemorySegment struct) {
        return struct.get(foreground$LAYOUT, foreground$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long foreground
     * }
     */
    public static void foreground(MemorySegment struct, long fieldValue) {
        struct.set(foreground$LAYOUT, foreground$OFFSET, fieldValue);
    }

    private static final OfLong background$LAYOUT = (OfLong)$LAYOUT.select(groupElement("background"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long background
     * }
     */
    public static final OfLong background$layout() {
        return background$LAYOUT;
    }

    private static final long background$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long background
     * }
     */
    public static final long background$offset() {
        return background$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long background
     * }
     */
    public static long background(MemorySegment struct) {
        return struct.get(background$LAYOUT, background$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long background
     * }
     */
    public static void background(MemorySegment struct, long fieldValue) {
        struct.set(background$LAYOUT, background$OFFSET, fieldValue);
    }

    private static final OfInt line_width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("line_width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int line_width
     * }
     */
    public static final OfInt line_width$layout() {
        return line_width$LAYOUT;
    }

    private static final long line_width$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int line_width
     * }
     */
    public static final long line_width$offset() {
        return line_width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int line_width
     * }
     */
    public static int line_width(MemorySegment struct) {
        return struct.get(line_width$LAYOUT, line_width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int line_width
     * }
     */
    public static void line_width(MemorySegment struct, int fieldValue) {
        struct.set(line_width$LAYOUT, line_width$OFFSET, fieldValue);
    }

    private static final OfInt line_style$LAYOUT = (OfInt)$LAYOUT.select(groupElement("line_style"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int line_style
     * }
     */
    public static final OfInt line_style$layout() {
        return line_style$LAYOUT;
    }

    private static final long line_style$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int line_style
     * }
     */
    public static final long line_style$offset() {
        return line_style$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int line_style
     * }
     */
    public static int line_style(MemorySegment struct) {
        return struct.get(line_style$LAYOUT, line_style$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int line_style
     * }
     */
    public static void line_style(MemorySegment struct, int fieldValue) {
        struct.set(line_style$LAYOUT, line_style$OFFSET, fieldValue);
    }

    private static final OfInt cap_style$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cap_style"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int cap_style
     * }
     */
    public static final OfInt cap_style$layout() {
        return cap_style$LAYOUT;
    }

    private static final long cap_style$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int cap_style
     * }
     */
    public static final long cap_style$offset() {
        return cap_style$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int cap_style
     * }
     */
    public static int cap_style(MemorySegment struct) {
        return struct.get(cap_style$LAYOUT, cap_style$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int cap_style
     * }
     */
    public static void cap_style(MemorySegment struct, int fieldValue) {
        struct.set(cap_style$LAYOUT, cap_style$OFFSET, fieldValue);
    }

    private static final OfInt join_style$LAYOUT = (OfInt)$LAYOUT.select(groupElement("join_style"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int join_style
     * }
     */
    public static final OfInt join_style$layout() {
        return join_style$LAYOUT;
    }

    private static final long join_style$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int join_style
     * }
     */
    public static final long join_style$offset() {
        return join_style$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int join_style
     * }
     */
    public static int join_style(MemorySegment struct) {
        return struct.get(join_style$LAYOUT, join_style$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int join_style
     * }
     */
    public static void join_style(MemorySegment struct, int fieldValue) {
        struct.set(join_style$LAYOUT, join_style$OFFSET, fieldValue);
    }

    private static final OfInt fill_style$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fill_style"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int fill_style
     * }
     */
    public static final OfInt fill_style$layout() {
        return fill_style$LAYOUT;
    }

    private static final long fill_style$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int fill_style
     * }
     */
    public static final long fill_style$offset() {
        return fill_style$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int fill_style
     * }
     */
    public static int fill_style(MemorySegment struct) {
        return struct.get(fill_style$LAYOUT, fill_style$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int fill_style
     * }
     */
    public static void fill_style(MemorySegment struct, int fieldValue) {
        struct.set(fill_style$LAYOUT, fill_style$OFFSET, fieldValue);
    }

    private static final OfInt fill_rule$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fill_rule"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int fill_rule
     * }
     */
    public static final OfInt fill_rule$layout() {
        return fill_rule$LAYOUT;
    }

    private static final long fill_rule$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int fill_rule
     * }
     */
    public static final long fill_rule$offset() {
        return fill_rule$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int fill_rule
     * }
     */
    public static int fill_rule(MemorySegment struct) {
        return struct.get(fill_rule$LAYOUT, fill_rule$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int fill_rule
     * }
     */
    public static void fill_rule(MemorySegment struct, int fieldValue) {
        struct.set(fill_rule$LAYOUT, fill_rule$OFFSET, fieldValue);
    }

    private static final OfInt arc_mode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("arc_mode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int arc_mode
     * }
     */
    public static final OfInt arc_mode$layout() {
        return arc_mode$LAYOUT;
    }

    private static final long arc_mode$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int arc_mode
     * }
     */
    public static final long arc_mode$offset() {
        return arc_mode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int arc_mode
     * }
     */
    public static int arc_mode(MemorySegment struct) {
        return struct.get(arc_mode$LAYOUT, arc_mode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int arc_mode
     * }
     */
    public static void arc_mode(MemorySegment struct, int fieldValue) {
        struct.set(arc_mode$LAYOUT, arc_mode$OFFSET, fieldValue);
    }

    private static final OfLong tile$LAYOUT = (OfLong)$LAYOUT.select(groupElement("tile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Pixmap tile
     * }
     */
    public static final OfLong tile$layout() {
        return tile$LAYOUT;
    }

    private static final long tile$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Pixmap tile
     * }
     */
    public static final long tile$offset() {
        return tile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Pixmap tile
     * }
     */
    public static long tile(MemorySegment struct) {
        return struct.get(tile$LAYOUT, tile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Pixmap tile
     * }
     */
    public static void tile(MemorySegment struct, long fieldValue) {
        struct.set(tile$LAYOUT, tile$OFFSET, fieldValue);
    }

    private static final OfLong stipple$LAYOUT = (OfLong)$LAYOUT.select(groupElement("stipple"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Pixmap stipple
     * }
     */
    public static final OfLong stipple$layout() {
        return stipple$LAYOUT;
    }

    private static final long stipple$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Pixmap stipple
     * }
     */
    public static final long stipple$offset() {
        return stipple$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Pixmap stipple
     * }
     */
    public static long stipple(MemorySegment struct) {
        return struct.get(stipple$LAYOUT, stipple$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Pixmap stipple
     * }
     */
    public static void stipple(MemorySegment struct, long fieldValue) {
        struct.set(stipple$LAYOUT, stipple$OFFSET, fieldValue);
    }

    private static final OfInt ts_x_origin$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ts_x_origin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int ts_x_origin
     * }
     */
    public static final OfInt ts_x_origin$layout() {
        return ts_x_origin$LAYOUT;
    }

    private static final long ts_x_origin$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int ts_x_origin
     * }
     */
    public static final long ts_x_origin$offset() {
        return ts_x_origin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int ts_x_origin
     * }
     */
    public static int ts_x_origin(MemorySegment struct) {
        return struct.get(ts_x_origin$LAYOUT, ts_x_origin$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int ts_x_origin
     * }
     */
    public static void ts_x_origin(MemorySegment struct, int fieldValue) {
        struct.set(ts_x_origin$LAYOUT, ts_x_origin$OFFSET, fieldValue);
    }

    private static final OfInt ts_y_origin$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ts_y_origin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int ts_y_origin
     * }
     */
    public static final OfInt ts_y_origin$layout() {
        return ts_y_origin$LAYOUT;
    }

    private static final long ts_y_origin$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int ts_y_origin
     * }
     */
    public static final long ts_y_origin$offset() {
        return ts_y_origin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int ts_y_origin
     * }
     */
    public static int ts_y_origin(MemorySegment struct) {
        return struct.get(ts_y_origin$LAYOUT, ts_y_origin$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int ts_y_origin
     * }
     */
    public static void ts_y_origin(MemorySegment struct, int fieldValue) {
        struct.set(ts_y_origin$LAYOUT, ts_y_origin$OFFSET, fieldValue);
    }

    private static final OfLong font$LAYOUT = (OfLong)$LAYOUT.select(groupElement("font"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Font font
     * }
     */
    public static final OfLong font$layout() {
        return font$LAYOUT;
    }

    private static final long font$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Font font
     * }
     */
    public static final long font$offset() {
        return font$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Font font
     * }
     */
    public static long font(MemorySegment struct) {
        return struct.get(font$LAYOUT, font$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Font font
     * }
     */
    public static void font(MemorySegment struct, long fieldValue) {
        struct.set(font$LAYOUT, font$OFFSET, fieldValue);
    }

    private static final OfInt subwindow_mode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("subwindow_mode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int subwindow_mode
     * }
     */
    public static final OfInt subwindow_mode$layout() {
        return subwindow_mode$LAYOUT;
    }

    private static final long subwindow_mode$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int subwindow_mode
     * }
     */
    public static final long subwindow_mode$offset() {
        return subwindow_mode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int subwindow_mode
     * }
     */
    public static int subwindow_mode(MemorySegment struct) {
        return struct.get(subwindow_mode$LAYOUT, subwindow_mode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int subwindow_mode
     * }
     */
    public static void subwindow_mode(MemorySegment struct, int fieldValue) {
        struct.set(subwindow_mode$LAYOUT, subwindow_mode$OFFSET, fieldValue);
    }

    private static final OfInt graphics_exposures$LAYOUT = (OfInt)$LAYOUT.select(groupElement("graphics_exposures"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int graphics_exposures
     * }
     */
    public static final OfInt graphics_exposures$layout() {
        return graphics_exposures$LAYOUT;
    }

    private static final long graphics_exposures$OFFSET = 100;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int graphics_exposures
     * }
     */
    public static final long graphics_exposures$offset() {
        return graphics_exposures$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int graphics_exposures
     * }
     */
    public static int graphics_exposures(MemorySegment struct) {
        return struct.get(graphics_exposures$LAYOUT, graphics_exposures$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int graphics_exposures
     * }
     */
    public static void graphics_exposures(MemorySegment struct, int fieldValue) {
        struct.set(graphics_exposures$LAYOUT, graphics_exposures$OFFSET, fieldValue);
    }

    private static final OfInt clip_x_origin$LAYOUT = (OfInt)$LAYOUT.select(groupElement("clip_x_origin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int clip_x_origin
     * }
     */
    public static final OfInt clip_x_origin$layout() {
        return clip_x_origin$LAYOUT;
    }

    private static final long clip_x_origin$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int clip_x_origin
     * }
     */
    public static final long clip_x_origin$offset() {
        return clip_x_origin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int clip_x_origin
     * }
     */
    public static int clip_x_origin(MemorySegment struct) {
        return struct.get(clip_x_origin$LAYOUT, clip_x_origin$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int clip_x_origin
     * }
     */
    public static void clip_x_origin(MemorySegment struct, int fieldValue) {
        struct.set(clip_x_origin$LAYOUT, clip_x_origin$OFFSET, fieldValue);
    }

    private static final OfInt clip_y_origin$LAYOUT = (OfInt)$LAYOUT.select(groupElement("clip_y_origin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int clip_y_origin
     * }
     */
    public static final OfInt clip_y_origin$layout() {
        return clip_y_origin$LAYOUT;
    }

    private static final long clip_y_origin$OFFSET = 108;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int clip_y_origin
     * }
     */
    public static final long clip_y_origin$offset() {
        return clip_y_origin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int clip_y_origin
     * }
     */
    public static int clip_y_origin(MemorySegment struct) {
        return struct.get(clip_y_origin$LAYOUT, clip_y_origin$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int clip_y_origin
     * }
     */
    public static void clip_y_origin(MemorySegment struct, int fieldValue) {
        struct.set(clip_y_origin$LAYOUT, clip_y_origin$OFFSET, fieldValue);
    }

    private static final OfLong clip_mask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("clip_mask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Pixmap clip_mask
     * }
     */
    public static final OfLong clip_mask$layout() {
        return clip_mask$LAYOUT;
    }

    private static final long clip_mask$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Pixmap clip_mask
     * }
     */
    public static final long clip_mask$offset() {
        return clip_mask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Pixmap clip_mask
     * }
     */
    public static long clip_mask(MemorySegment struct) {
        return struct.get(clip_mask$LAYOUT, clip_mask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Pixmap clip_mask
     * }
     */
    public static void clip_mask(MemorySegment struct, long fieldValue) {
        struct.set(clip_mask$LAYOUT, clip_mask$OFFSET, fieldValue);
    }

    private static final OfInt dash_offset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dash_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int dash_offset
     * }
     */
    public static final OfInt dash_offset$layout() {
        return dash_offset$LAYOUT;
    }

    private static final long dash_offset$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int dash_offset
     * }
     */
    public static final long dash_offset$offset() {
        return dash_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int dash_offset
     * }
     */
    public static int dash_offset(MemorySegment struct) {
        return struct.get(dash_offset$LAYOUT, dash_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int dash_offset
     * }
     */
    public static void dash_offset(MemorySegment struct, int fieldValue) {
        struct.set(dash_offset$LAYOUT, dash_offset$OFFSET, fieldValue);
    }

    private static final OfByte dashes$LAYOUT = (OfByte)$LAYOUT.select(groupElement("dashes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char dashes
     * }
     */
    public static final OfByte dashes$layout() {
        return dashes$LAYOUT;
    }

    private static final long dashes$OFFSET = 124;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char dashes
     * }
     */
    public static final long dashes$offset() {
        return dashes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char dashes
     * }
     */
    public static byte dashes(MemorySegment struct) {
        return struct.get(dashes$LAYOUT, dashes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char dashes
     * }
     */
    public static void dashes(MemorySegment struct, byte fieldValue) {
        struct.set(dashes$LAYOUT, dashes$OFFSET, fieldValue);
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

