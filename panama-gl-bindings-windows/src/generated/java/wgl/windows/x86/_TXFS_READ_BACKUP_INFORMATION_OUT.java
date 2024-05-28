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
 * struct _TXFS_READ_BACKUP_INFORMATION_OUT {
 *     union {
 *         DWORD BufferLength;
 *         BYTE Buffer[1];
 *     };
 * }
 * }
 */
public class _TXFS_READ_BACKUP_INFORMATION_OUT {

    _TXFS_READ_BACKUP_INFORMATION_OUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            wgl_h.C_LONG.withName("BufferLength"),
            MemoryLayout.sequenceLayout(1, wgl_h.C_CHAR).withName("Buffer")
        ).withName("$anon$12887:5")
    ).withName("_TXFS_READ_BACKUP_INFORMATION_OUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt BufferLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$12887:5"), groupElement("BufferLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BufferLength
     * }
     */
    public static final OfInt BufferLength$layout() {
        return BufferLength$LAYOUT;
    }

    private static final long BufferLength$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BufferLength
     * }
     */
    public static final long BufferLength$offset() {
        return BufferLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BufferLength
     * }
     */
    public static int BufferLength(MemorySegment struct) {
        return struct.get(BufferLength$LAYOUT, BufferLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BufferLength
     * }
     */
    public static void BufferLength(MemorySegment struct, int fieldValue) {
        struct.set(BufferLength$LAYOUT, BufferLength$OFFSET, fieldValue);
    }

    private static final SequenceLayout Buffer$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("$anon$12887:5"), groupElement("Buffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Buffer[1]
     * }
     */
    public static final SequenceLayout Buffer$layout() {
        return Buffer$LAYOUT;
    }

    private static final long Buffer$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Buffer[1]
     * }
     */
    public static final long Buffer$offset() {
        return Buffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Buffer[1]
     * }
     */
    public static MemorySegment Buffer(MemorySegment struct) {
        return struct.asSlice(Buffer$OFFSET, Buffer$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Buffer[1]
     * }
     */
    public static void Buffer(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Buffer$OFFSET, Buffer$LAYOUT.byteSize());
    }

    private static long[] Buffer$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Buffer[1]
     * }
     */
    public static long[] Buffer$dimensions() {
        return Buffer$DIMS;
    }
    private static final VarHandle Buffer$ELEM_HANDLE = Buffer$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Buffer[1]
     * }
     */
    public static byte Buffer(MemorySegment struct, long index0) {
        return (byte)Buffer$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Buffer[1]
     * }
     */
    public static void Buffer(MemorySegment struct, long index0, byte fieldValue) {
        Buffer$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

