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
 *     int depth;
 *     int bits_per_pixel;
 *     int scanline_pad;
 * }
 * }
 */
public class ScreenFormat {

    ScreenFormat() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glxext_h.C_POINTER.withName("ext_data"),
        glxext_h.C_INT.withName("depth"),
        glxext_h.C_INT.withName("bits_per_pixel"),
        glxext_h.C_INT.withName("scanline_pad"),
        MemoryLayout.paddingLayout(4)
    ).withName("$anon$280:9");

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

    private static final OfInt depth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("depth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int depth
     * }
     */
    public static final OfInt depth$layout() {
        return depth$LAYOUT;
    }

    private static final long depth$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int depth
     * }
     */
    public static final long depth$offset() {
        return depth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int depth
     * }
     */
    public static int depth(MemorySegment struct) {
        return struct.get(depth$LAYOUT, depth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int depth
     * }
     */
    public static void depth(MemorySegment struct, int fieldValue) {
        struct.set(depth$LAYOUT, depth$OFFSET, fieldValue);
    }

    private static final OfInt bits_per_pixel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bits_per_pixel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int bits_per_pixel
     * }
     */
    public static final OfInt bits_per_pixel$layout() {
        return bits_per_pixel$LAYOUT;
    }

    private static final long bits_per_pixel$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int bits_per_pixel
     * }
     */
    public static final long bits_per_pixel$offset() {
        return bits_per_pixel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int bits_per_pixel
     * }
     */
    public static int bits_per_pixel(MemorySegment struct) {
        return struct.get(bits_per_pixel$LAYOUT, bits_per_pixel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int bits_per_pixel
     * }
     */
    public static void bits_per_pixel(MemorySegment struct, int fieldValue) {
        struct.set(bits_per_pixel$LAYOUT, bits_per_pixel$OFFSET, fieldValue);
    }

    private static final OfInt scanline_pad$LAYOUT = (OfInt)$LAYOUT.select(groupElement("scanline_pad"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int scanline_pad
     * }
     */
    public static final OfInt scanline_pad$layout() {
        return scanline_pad$LAYOUT;
    }

    private static final long scanline_pad$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int scanline_pad
     * }
     */
    public static final long scanline_pad$offset() {
        return scanline_pad$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int scanline_pad
     * }
     */
    public static int scanline_pad(MemorySegment struct) {
        return struct.get(scanline_pad$LAYOUT, scanline_pad$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int scanline_pad
     * }
     */
    public static void scanline_pad(MemorySegment struct, int fieldValue) {
        struct.set(scanline_pad$LAYOUT, scanline_pad$OFFSET, fieldValue);
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

