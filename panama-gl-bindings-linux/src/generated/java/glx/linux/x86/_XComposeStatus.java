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
 * struct _XComposeStatus {
 *     XPointer compose_ptr;
 *     int chars_matched;
 * }
 * }
 */
public class _XComposeStatus {

    _XComposeStatus() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glx_h.C_POINTER.withName("compose_ptr"),
        glx_h.C_INT.withName("chars_matched"),
        MemoryLayout.paddingLayout(4)
    ).withName("_XComposeStatus");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout compose_ptr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("compose_ptr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XPointer compose_ptr
     * }
     */
    public static final AddressLayout compose_ptr$layout() {
        return compose_ptr$LAYOUT;
    }

    private static final long compose_ptr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XPointer compose_ptr
     * }
     */
    public static final long compose_ptr$offset() {
        return compose_ptr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XPointer compose_ptr
     * }
     */
    public static MemorySegment compose_ptr(MemorySegment struct) {
        return struct.get(compose_ptr$LAYOUT, compose_ptr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XPointer compose_ptr
     * }
     */
    public static void compose_ptr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(compose_ptr$LAYOUT, compose_ptr$OFFSET, fieldValue);
    }

    private static final OfInt chars_matched$LAYOUT = (OfInt)$LAYOUT.select(groupElement("chars_matched"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int chars_matched
     * }
     */
    public static final OfInt chars_matched$layout() {
        return chars_matched$LAYOUT;
    }

    private static final long chars_matched$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int chars_matched
     * }
     */
    public static final long chars_matched$offset() {
        return chars_matched$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int chars_matched
     * }
     */
    public static int chars_matched(MemorySegment struct) {
        return struct.get(chars_matched$LAYOUT, chars_matched$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int chars_matched
     * }
     */
    public static void chars_matched(MemorySegment struct, int fieldValue) {
        struct.set(chars_matched$LAYOUT, chars_matched$OFFSET, fieldValue);
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

