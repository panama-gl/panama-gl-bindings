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
 * struct _UNWIND_HISTORY_TABLE_ENTRY {
 *     DWORD64 ImageBase;
 *     PRUNTIME_FUNCTION FunctionEntry;
 * }
 * }
 */
public class _UNWIND_HISTORY_TABLE_ENTRY {

    _UNWIND_HISTORY_TABLE_ENTRY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG_LONG.withName("ImageBase"),
        wgl_h.C_POINTER.withName("FunctionEntry")
    ).withName("_UNWIND_HISTORY_TABLE_ENTRY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong ImageBase$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ImageBase"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 ImageBase
     * }
     */
    public static final OfLong ImageBase$layout() {
        return ImageBase$LAYOUT;
    }

    private static final long ImageBase$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 ImageBase
     * }
     */
    public static final long ImageBase$offset() {
        return ImageBase$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 ImageBase
     * }
     */
    public static long ImageBase(MemorySegment struct) {
        return struct.get(ImageBase$LAYOUT, ImageBase$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 ImageBase
     * }
     */
    public static void ImageBase(MemorySegment struct, long fieldValue) {
        struct.set(ImageBase$LAYOUT, ImageBase$OFFSET, fieldValue);
    }

    private static final AddressLayout FunctionEntry$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("FunctionEntry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PRUNTIME_FUNCTION FunctionEntry
     * }
     */
    public static final AddressLayout FunctionEntry$layout() {
        return FunctionEntry$LAYOUT;
    }

    private static final long FunctionEntry$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PRUNTIME_FUNCTION FunctionEntry
     * }
     */
    public static final long FunctionEntry$offset() {
        return FunctionEntry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PRUNTIME_FUNCTION FunctionEntry
     * }
     */
    public static MemorySegment FunctionEntry(MemorySegment struct) {
        return struct.get(FunctionEntry$LAYOUT, FunctionEntry$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PRUNTIME_FUNCTION FunctionEntry
     * }
     */
    public static void FunctionEntry(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(FunctionEntry$LAYOUT, FunctionEntry$OFFSET, fieldValue);
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

