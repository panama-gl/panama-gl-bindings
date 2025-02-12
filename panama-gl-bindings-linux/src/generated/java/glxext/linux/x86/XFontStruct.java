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
 *     Font fid;
 *     unsigned int direction;
 *     unsigned int min_char_or_byte2;
 *     unsigned int max_char_or_byte2;
 *     unsigned int min_byte1;
 *     unsigned int max_byte1;
 *     int all_chars_exist;
 *     unsigned int default_char;
 *     int n_properties;
 *     XFontProp *properties;
 *     XCharStruct min_bounds;
 *     XCharStruct max_bounds;
 *     XCharStruct *per_char;
 *     int ascent;
 *     int descent;
 * }
 * }
 */
public class XFontStruct {

    XFontStruct() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glxext_h.C_POINTER.withName("ext_data"),
        glxext_h.C_LONG.withName("fid"),
        glxext_h.C_INT.withName("direction"),
        glxext_h.C_INT.withName("min_char_or_byte2"),
        glxext_h.C_INT.withName("max_char_or_byte2"),
        glxext_h.C_INT.withName("min_byte1"),
        glxext_h.C_INT.withName("max_byte1"),
        glxext_h.C_INT.withName("all_chars_exist"),
        glxext_h.C_INT.withName("default_char"),
        glxext_h.C_INT.withName("n_properties"),
        glxext_h.C_POINTER.withName("properties"),
        XCharStruct.layout().withName("min_bounds"),
        XCharStruct.layout().withName("max_bounds"),
        glxext_h.C_POINTER.withName("per_char"),
        glxext_h.C_INT.withName("ascent"),
        glxext_h.C_INT.withName("descent")
    ).withName("$anon$1035:9");

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

    private static final OfLong fid$LAYOUT = (OfLong)$LAYOUT.select(groupElement("fid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Font fid
     * }
     */
    public static final OfLong fid$layout() {
        return fid$LAYOUT;
    }

    private static final long fid$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Font fid
     * }
     */
    public static final long fid$offset() {
        return fid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Font fid
     * }
     */
    public static long fid(MemorySegment struct) {
        return struct.get(fid$LAYOUT, fid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Font fid
     * }
     */
    public static void fid(MemorySegment struct, long fieldValue) {
        struct.set(fid$LAYOUT, fid$OFFSET, fieldValue);
    }

    private static final OfInt direction$LAYOUT = (OfInt)$LAYOUT.select(groupElement("direction"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int direction
     * }
     */
    public static final OfInt direction$layout() {
        return direction$LAYOUT;
    }

    private static final long direction$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int direction
     * }
     */
    public static final long direction$offset() {
        return direction$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int direction
     * }
     */
    public static int direction(MemorySegment struct) {
        return struct.get(direction$LAYOUT, direction$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int direction
     * }
     */
    public static void direction(MemorySegment struct, int fieldValue) {
        struct.set(direction$LAYOUT, direction$OFFSET, fieldValue);
    }

    private static final OfInt min_char_or_byte2$LAYOUT = (OfInt)$LAYOUT.select(groupElement("min_char_or_byte2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int min_char_or_byte2
     * }
     */
    public static final OfInt min_char_or_byte2$layout() {
        return min_char_or_byte2$LAYOUT;
    }

    private static final long min_char_or_byte2$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int min_char_or_byte2
     * }
     */
    public static final long min_char_or_byte2$offset() {
        return min_char_or_byte2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int min_char_or_byte2
     * }
     */
    public static int min_char_or_byte2(MemorySegment struct) {
        return struct.get(min_char_or_byte2$LAYOUT, min_char_or_byte2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int min_char_or_byte2
     * }
     */
    public static void min_char_or_byte2(MemorySegment struct, int fieldValue) {
        struct.set(min_char_or_byte2$LAYOUT, min_char_or_byte2$OFFSET, fieldValue);
    }

    private static final OfInt max_char_or_byte2$LAYOUT = (OfInt)$LAYOUT.select(groupElement("max_char_or_byte2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int max_char_or_byte2
     * }
     */
    public static final OfInt max_char_or_byte2$layout() {
        return max_char_or_byte2$LAYOUT;
    }

    private static final long max_char_or_byte2$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int max_char_or_byte2
     * }
     */
    public static final long max_char_or_byte2$offset() {
        return max_char_or_byte2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int max_char_or_byte2
     * }
     */
    public static int max_char_or_byte2(MemorySegment struct) {
        return struct.get(max_char_or_byte2$LAYOUT, max_char_or_byte2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int max_char_or_byte2
     * }
     */
    public static void max_char_or_byte2(MemorySegment struct, int fieldValue) {
        struct.set(max_char_or_byte2$LAYOUT, max_char_or_byte2$OFFSET, fieldValue);
    }

    private static final OfInt min_byte1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("min_byte1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int min_byte1
     * }
     */
    public static final OfInt min_byte1$layout() {
        return min_byte1$LAYOUT;
    }

    private static final long min_byte1$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int min_byte1
     * }
     */
    public static final long min_byte1$offset() {
        return min_byte1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int min_byte1
     * }
     */
    public static int min_byte1(MemorySegment struct) {
        return struct.get(min_byte1$LAYOUT, min_byte1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int min_byte1
     * }
     */
    public static void min_byte1(MemorySegment struct, int fieldValue) {
        struct.set(min_byte1$LAYOUT, min_byte1$OFFSET, fieldValue);
    }

    private static final OfInt max_byte1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("max_byte1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int max_byte1
     * }
     */
    public static final OfInt max_byte1$layout() {
        return max_byte1$LAYOUT;
    }

    private static final long max_byte1$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int max_byte1
     * }
     */
    public static final long max_byte1$offset() {
        return max_byte1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int max_byte1
     * }
     */
    public static int max_byte1(MemorySegment struct) {
        return struct.get(max_byte1$LAYOUT, max_byte1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int max_byte1
     * }
     */
    public static void max_byte1(MemorySegment struct, int fieldValue) {
        struct.set(max_byte1$LAYOUT, max_byte1$OFFSET, fieldValue);
    }

    private static final OfInt all_chars_exist$LAYOUT = (OfInt)$LAYOUT.select(groupElement("all_chars_exist"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int all_chars_exist
     * }
     */
    public static final OfInt all_chars_exist$layout() {
        return all_chars_exist$LAYOUT;
    }

    private static final long all_chars_exist$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int all_chars_exist
     * }
     */
    public static final long all_chars_exist$offset() {
        return all_chars_exist$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int all_chars_exist
     * }
     */
    public static int all_chars_exist(MemorySegment struct) {
        return struct.get(all_chars_exist$LAYOUT, all_chars_exist$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int all_chars_exist
     * }
     */
    public static void all_chars_exist(MemorySegment struct, int fieldValue) {
        struct.set(all_chars_exist$LAYOUT, all_chars_exist$OFFSET, fieldValue);
    }

    private static final OfInt default_char$LAYOUT = (OfInt)$LAYOUT.select(groupElement("default_char"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int default_char
     * }
     */
    public static final OfInt default_char$layout() {
        return default_char$LAYOUT;
    }

    private static final long default_char$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int default_char
     * }
     */
    public static final long default_char$offset() {
        return default_char$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int default_char
     * }
     */
    public static int default_char(MemorySegment struct) {
        return struct.get(default_char$LAYOUT, default_char$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int default_char
     * }
     */
    public static void default_char(MemorySegment struct, int fieldValue) {
        struct.set(default_char$LAYOUT, default_char$OFFSET, fieldValue);
    }

    private static final OfInt n_properties$LAYOUT = (OfInt)$LAYOUT.select(groupElement("n_properties"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int n_properties
     * }
     */
    public static final OfInt n_properties$layout() {
        return n_properties$LAYOUT;
    }

    private static final long n_properties$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int n_properties
     * }
     */
    public static final long n_properties$offset() {
        return n_properties$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int n_properties
     * }
     */
    public static int n_properties(MemorySegment struct) {
        return struct.get(n_properties$LAYOUT, n_properties$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int n_properties
     * }
     */
    public static void n_properties(MemorySegment struct, int fieldValue) {
        struct.set(n_properties$LAYOUT, n_properties$OFFSET, fieldValue);
    }

    private static final AddressLayout properties$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("properties"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XFontProp *properties
     * }
     */
    public static final AddressLayout properties$layout() {
        return properties$LAYOUT;
    }

    private static final long properties$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XFontProp *properties
     * }
     */
    public static final long properties$offset() {
        return properties$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XFontProp *properties
     * }
     */
    public static MemorySegment properties(MemorySegment struct) {
        return struct.get(properties$LAYOUT, properties$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XFontProp *properties
     * }
     */
    public static void properties(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(properties$LAYOUT, properties$OFFSET, fieldValue);
    }

    private static final GroupLayout min_bounds$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("min_bounds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XCharStruct min_bounds
     * }
     */
    public static final GroupLayout min_bounds$layout() {
        return min_bounds$LAYOUT;
    }

    private static final long min_bounds$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XCharStruct min_bounds
     * }
     */
    public static final long min_bounds$offset() {
        return min_bounds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XCharStruct min_bounds
     * }
     */
    public static MemorySegment min_bounds(MemorySegment struct) {
        return struct.asSlice(min_bounds$OFFSET, min_bounds$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XCharStruct min_bounds
     * }
     */
    public static void min_bounds(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, min_bounds$OFFSET, min_bounds$LAYOUT.byteSize());
    }

    private static final GroupLayout max_bounds$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("max_bounds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XCharStruct max_bounds
     * }
     */
    public static final GroupLayout max_bounds$layout() {
        return max_bounds$LAYOUT;
    }

    private static final long max_bounds$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XCharStruct max_bounds
     * }
     */
    public static final long max_bounds$offset() {
        return max_bounds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XCharStruct max_bounds
     * }
     */
    public static MemorySegment max_bounds(MemorySegment struct) {
        return struct.asSlice(max_bounds$OFFSET, max_bounds$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XCharStruct max_bounds
     * }
     */
    public static void max_bounds(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, max_bounds$OFFSET, max_bounds$LAYOUT.byteSize());
    }

    private static final AddressLayout per_char$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("per_char"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XCharStruct *per_char
     * }
     */
    public static final AddressLayout per_char$layout() {
        return per_char$LAYOUT;
    }

    private static final long per_char$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XCharStruct *per_char
     * }
     */
    public static final long per_char$offset() {
        return per_char$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XCharStruct *per_char
     * }
     */
    public static MemorySegment per_char(MemorySegment struct) {
        return struct.get(per_char$LAYOUT, per_char$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XCharStruct *per_char
     * }
     */
    public static void per_char(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(per_char$LAYOUT, per_char$OFFSET, fieldValue);
    }

    private static final OfInt ascent$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ascent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int ascent
     * }
     */
    public static final OfInt ascent$layout() {
        return ascent$LAYOUT;
    }

    private static final long ascent$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int ascent
     * }
     */
    public static final long ascent$offset() {
        return ascent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int ascent
     * }
     */
    public static int ascent(MemorySegment struct) {
        return struct.get(ascent$LAYOUT, ascent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int ascent
     * }
     */
    public static void ascent(MemorySegment struct, int fieldValue) {
        struct.set(ascent$LAYOUT, ascent$OFFSET, fieldValue);
    }

    private static final OfInt descent$LAYOUT = (OfInt)$LAYOUT.select(groupElement("descent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int descent
     * }
     */
    public static final OfInt descent$layout() {
        return descent$LAYOUT;
    }

    private static final long descent$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int descent
     * }
     */
    public static final long descent$offset() {
        return descent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int descent
     * }
     */
    public static int descent(MemorySegment struct) {
        return struct.get(descent$LAYOUT, descent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int descent
     * }
     */
    public static void descent(MemorySegment struct, int fieldValue) {
        struct.set(descent$LAYOUT, descent$OFFSET, fieldValue);
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

