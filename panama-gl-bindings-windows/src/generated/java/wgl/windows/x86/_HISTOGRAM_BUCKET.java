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
 * struct _HISTOGRAM_BUCKET {
 *     DWORD Reads;
 *     DWORD Writes;
 * }
 * }
 */
public class _HISTOGRAM_BUCKET {

    _HISTOGRAM_BUCKET() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Reads"),
        wgl_h.C_LONG.withName("Writes")
    ).withName("_HISTOGRAM_BUCKET");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Reads$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reads"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reads
     * }
     */
    public static final OfInt Reads$layout() {
        return Reads$LAYOUT;
    }

    private static final long Reads$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reads
     * }
     */
    public static final long Reads$offset() {
        return Reads$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reads
     * }
     */
    public static int Reads(MemorySegment struct) {
        return struct.get(Reads$LAYOUT, Reads$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reads
     * }
     */
    public static void Reads(MemorySegment struct, int fieldValue) {
        struct.set(Reads$LAYOUT, Reads$OFFSET, fieldValue);
    }

    private static final OfInt Writes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Writes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Writes
     * }
     */
    public static final OfInt Writes$layout() {
        return Writes$LAYOUT;
    }

    private static final long Writes$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Writes
     * }
     */
    public static final long Writes$offset() {
        return Writes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Writes
     * }
     */
    public static int Writes(MemorySegment struct) {
        return struct.get(Writes$LAYOUT, Writes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Writes
     * }
     */
    public static void Writes(MemorySegment struct, int fieldValue) {
        struct.set(Writes$LAYOUT, Writes$OFFSET, fieldValue);
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

