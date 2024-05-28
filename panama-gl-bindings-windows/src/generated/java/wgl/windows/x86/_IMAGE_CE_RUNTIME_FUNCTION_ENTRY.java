// Generated by jextract

package wgl.windows.x86;

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
 * struct _IMAGE_CE_RUNTIME_FUNCTION_ENTRY {
 *     DWORD FuncStart;
 *     DWORD PrologLen : 8;
 *     DWORD FuncLen : 22;
 *     DWORD ThirtyTwoBit : 1;
 *     DWORD ExceptionFlag : 1;
 * }
 * }
 */
public class _IMAGE_CE_RUNTIME_FUNCTION_ENTRY {

    _IMAGE_CE_RUNTIME_FUNCTION_ENTRY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("FuncStart"),
        MemoryLayout.paddingLayout(4)
    ).withName("_IMAGE_CE_RUNTIME_FUNCTION_ENTRY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt FuncStart$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FuncStart"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FuncStart
     * }
     */
    public static final OfInt FuncStart$layout() {
        return FuncStart$LAYOUT;
    }

    private static final long FuncStart$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FuncStart
     * }
     */
    public static final long FuncStart$offset() {
        return FuncStart$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FuncStart
     * }
     */
    public static int FuncStart(MemorySegment struct) {
        return struct.get(FuncStart$LAYOUT, FuncStart$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FuncStart
     * }
     */
    public static void FuncStart(MemorySegment struct, int fieldValue) {
        struct.set(FuncStart$LAYOUT, FuncStart$OFFSET, fieldValue);
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

