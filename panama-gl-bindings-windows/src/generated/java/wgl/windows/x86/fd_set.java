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
 * struct fd_set {
 *     u_int fd_count;
 *     SOCKET fd_array[64];
 * }
 * }
 */
public class fd_set {

    fd_set() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_INT.withName("fd_count"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.sequenceLayout(64, wgl_h.C_LONG_LONG).withName("fd_array")
    ).withName("fd_set");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt fd_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fd_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * u_int fd_count
     * }
     */
    public static final OfInt fd_count$layout() {
        return fd_count$LAYOUT;
    }

    private static final long fd_count$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * u_int fd_count
     * }
     */
    public static final long fd_count$offset() {
        return fd_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * u_int fd_count
     * }
     */
    public static int fd_count(MemorySegment struct) {
        return struct.get(fd_count$LAYOUT, fd_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * u_int fd_count
     * }
     */
    public static void fd_count(MemorySegment struct, int fieldValue) {
        struct.set(fd_count$LAYOUT, fd_count$OFFSET, fieldValue);
    }

    private static final SequenceLayout fd_array$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("fd_array"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SOCKET fd_array[64]
     * }
     */
    public static final SequenceLayout fd_array$layout() {
        return fd_array$LAYOUT;
    }

    private static final long fd_array$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SOCKET fd_array[64]
     * }
     */
    public static final long fd_array$offset() {
        return fd_array$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SOCKET fd_array[64]
     * }
     */
    public static MemorySegment fd_array(MemorySegment struct) {
        return struct.asSlice(fd_array$OFFSET, fd_array$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SOCKET fd_array[64]
     * }
     */
    public static void fd_array(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, fd_array$OFFSET, fd_array$LAYOUT.byteSize());
    }

    private static long[] fd_array$DIMS = { 64 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * SOCKET fd_array[64]
     * }
     */
    public static long[] fd_array$dimensions() {
        return fd_array$DIMS;
    }
    private static final VarHandle fd_array$ELEM_HANDLE = fd_array$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * SOCKET fd_array[64]
     * }
     */
    public static long fd_array(MemorySegment struct, long index0) {
        return (long)fd_array$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * SOCKET fd_array[64]
     * }
     */
    public static void fd_array(MemorySegment struct, long index0, long fieldValue) {
        fd_array$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

