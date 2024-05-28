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
 * struct _SINGLE_LIST_ENTRY {
 *     struct _SINGLE_LIST_ENTRY *Next;
 * }
 * }
 */
public class _SINGLE_LIST_ENTRY {

    _SINGLE_LIST_ENTRY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_POINTER.withName("Next")
    ).withName("_SINGLE_LIST_ENTRY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout Next$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Next"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _SINGLE_LIST_ENTRY *Next
     * }
     */
    public static final AddressLayout Next$layout() {
        return Next$LAYOUT;
    }

    private static final long Next$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _SINGLE_LIST_ENTRY *Next
     * }
     */
    public static final long Next$offset() {
        return Next$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _SINGLE_LIST_ENTRY *Next
     * }
     */
    public static MemorySegment Next(MemorySegment struct) {
        return struct.get(Next$LAYOUT, Next$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _SINGLE_LIST_ENTRY *Next
     * }
     */
    public static void Next(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Next$LAYOUT, Next$OFFSET, fieldValue);
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

