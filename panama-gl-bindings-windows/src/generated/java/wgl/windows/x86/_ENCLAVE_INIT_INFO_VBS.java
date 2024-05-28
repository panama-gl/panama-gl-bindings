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
 * struct _ENCLAVE_INIT_INFO_VBS {
 *     DWORD Length;
 *     DWORD ThreadCount;
 * }
 * }
 */
public class _ENCLAVE_INIT_INFO_VBS {

    _ENCLAVE_INIT_INFO_VBS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Length"),
        wgl_h.C_LONG.withName("ThreadCount")
    ).withName("_ENCLAVE_INIT_INFO_VBS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Length$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static final OfInt Length$layout() {
        return Length$LAYOUT;
    }

    private static final long Length$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static final long Length$offset() {
        return Length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static int Length(MemorySegment struct) {
        return struct.get(Length$LAYOUT, Length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static void Length(MemorySegment struct, int fieldValue) {
        struct.set(Length$LAYOUT, Length$OFFSET, fieldValue);
    }

    private static final OfInt ThreadCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ThreadCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ThreadCount
     * }
     */
    public static final OfInt ThreadCount$layout() {
        return ThreadCount$LAYOUT;
    }

    private static final long ThreadCount$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ThreadCount
     * }
     */
    public static final long ThreadCount$offset() {
        return ThreadCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ThreadCount
     * }
     */
    public static int ThreadCount(MemorySegment struct) {
        return struct.get(ThreadCount$LAYOUT, ThreadCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ThreadCount
     * }
     */
    public static void ThreadCount(MemorySegment struct, int fieldValue) {
        struct.set(ThreadCount$LAYOUT, ThreadCount$OFFSET, fieldValue);
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

