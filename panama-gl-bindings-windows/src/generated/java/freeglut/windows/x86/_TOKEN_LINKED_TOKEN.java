// Generated by jextract

package freeglut.windows.x86;

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
 * struct _TOKEN_LINKED_TOKEN {
 *     HANDLE LinkedToken;
 * }
 * }
 */
public class _TOKEN_LINKED_TOKEN {

    _TOKEN_LINKED_TOKEN() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_POINTER.withName("LinkedToken")
    ).withName("_TOKEN_LINKED_TOKEN");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout LinkedToken$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("LinkedToken"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE LinkedToken
     * }
     */
    public static final AddressLayout LinkedToken$layout() {
        return LinkedToken$LAYOUT;
    }

    private static final long LinkedToken$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE LinkedToken
     * }
     */
    public static final long LinkedToken$offset() {
        return LinkedToken$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE LinkedToken
     * }
     */
    public static MemorySegment LinkedToken(MemorySegment struct) {
        return struct.get(LinkedToken$LAYOUT, LinkedToken$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE LinkedToken
     * }
     */
    public static void LinkedToken(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(LinkedToken$LAYOUT, LinkedToken$OFFSET, fieldValue);
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

