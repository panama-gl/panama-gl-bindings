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
 *     unsigned short count_values;
 *     char **supported_values;
 * }
 * }
 */
public class XIMValuesList {

    XIMValuesList() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glx_h.C_SHORT.withName("count_values"),
        MemoryLayout.paddingLayout(6),
        glx_h.C_POINTER.withName("supported_values")
    ).withName("$anon$1381:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort count_values$LAYOUT = (OfShort)$LAYOUT.select(groupElement("count_values"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short count_values
     * }
     */
    public static final OfShort count_values$layout() {
        return count_values$LAYOUT;
    }

    private static final long count_values$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short count_values
     * }
     */
    public static final long count_values$offset() {
        return count_values$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short count_values
     * }
     */
    public static short count_values(MemorySegment struct) {
        return struct.get(count_values$LAYOUT, count_values$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short count_values
     * }
     */
    public static void count_values(MemorySegment struct, short fieldValue) {
        struct.set(count_values$LAYOUT, count_values$OFFSET, fieldValue);
    }

    private static final AddressLayout supported_values$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("supported_values"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char **supported_values
     * }
     */
    public static final AddressLayout supported_values$layout() {
        return supported_values$LAYOUT;
    }

    private static final long supported_values$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char **supported_values
     * }
     */
    public static final long supported_values$offset() {
        return supported_values$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char **supported_values
     * }
     */
    public static MemorySegment supported_values(MemorySegment struct) {
        return struct.get(supported_values$LAYOUT, supported_values$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char **supported_values
     * }
     */
    public static void supported_values(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(supported_values$LAYOUT, supported_values$OFFSET, fieldValue);
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

