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
 *     int num_orientation;
 *     XOrientation *orientation;
 * }
 * }
 */
public class XOMOrientation {

    XOMOrientation() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glx_h.C_INT.withName("num_orientation"),
        MemoryLayout.paddingLayout(4),
        glx_h.C_POINTER.withName("orientation")
    ).withName("$anon$1134:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt num_orientation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("num_orientation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int num_orientation
     * }
     */
    public static final OfInt num_orientation$layout() {
        return num_orientation$LAYOUT;
    }

    private static final long num_orientation$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int num_orientation
     * }
     */
    public static final long num_orientation$offset() {
        return num_orientation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int num_orientation
     * }
     */
    public static int num_orientation(MemorySegment struct) {
        return struct.get(num_orientation$LAYOUT, num_orientation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int num_orientation
     * }
     */
    public static void num_orientation(MemorySegment struct, int fieldValue) {
        struct.set(num_orientation$LAYOUT, num_orientation$OFFSET, fieldValue);
    }

    private static final AddressLayout orientation$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("orientation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XOrientation *orientation
     * }
     */
    public static final AddressLayout orientation$layout() {
        return orientation$LAYOUT;
    }

    private static final long orientation$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XOrientation *orientation
     * }
     */
    public static final long orientation$offset() {
        return orientation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XOrientation *orientation
     * }
     */
    public static MemorySegment orientation(MemorySegment struct) {
        return struct.get(orientation$LAYOUT, orientation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XOrientation *orientation
     * }
     */
    public static void orientation(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(orientation$LAYOUT, orientation$OFFSET, fieldValue);
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

