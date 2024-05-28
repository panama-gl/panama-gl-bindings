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
 * struct _CSV_QUERY_FILE_REVISION {
 *     LONGLONG FileId;
 *     LONGLONG FileRevision[3];
 * }
 * }
 */
public class _CSV_QUERY_FILE_REVISION {

    _CSV_QUERY_FILE_REVISION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG_LONG.withName("FileId"),
        MemoryLayout.sequenceLayout(3, wgl_h.C_LONG_LONG).withName("FileRevision")
    ).withName("_CSV_QUERY_FILE_REVISION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong FileId$LAYOUT = (OfLong)$LAYOUT.select(groupElement("FileId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONGLONG FileId
     * }
     */
    public static final OfLong FileId$layout() {
        return FileId$LAYOUT;
    }

    private static final long FileId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONGLONG FileId
     * }
     */
    public static final long FileId$offset() {
        return FileId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONGLONG FileId
     * }
     */
    public static long FileId(MemorySegment struct) {
        return struct.get(FileId$LAYOUT, FileId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONGLONG FileId
     * }
     */
    public static void FileId(MemorySegment struct, long fieldValue) {
        struct.set(FileId$LAYOUT, FileId$OFFSET, fieldValue);
    }

    private static final SequenceLayout FileRevision$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("FileRevision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONGLONG FileRevision[3]
     * }
     */
    public static final SequenceLayout FileRevision$layout() {
        return FileRevision$LAYOUT;
    }

    private static final long FileRevision$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONGLONG FileRevision[3]
     * }
     */
    public static final long FileRevision$offset() {
        return FileRevision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONGLONG FileRevision[3]
     * }
     */
    public static MemorySegment FileRevision(MemorySegment struct) {
        return struct.asSlice(FileRevision$OFFSET, FileRevision$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONGLONG FileRevision[3]
     * }
     */
    public static void FileRevision(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FileRevision$OFFSET, FileRevision$LAYOUT.byteSize());
    }

    private static long[] FileRevision$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * LONGLONG FileRevision[3]
     * }
     */
    public static long[] FileRevision$dimensions() {
        return FileRevision$DIMS;
    }
    private static final VarHandle FileRevision$ELEM_HANDLE = FileRevision$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * LONGLONG FileRevision[3]
     * }
     */
    public static long FileRevision(MemorySegment struct, long index0) {
        return (long)FileRevision$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * LONGLONG FileRevision[3]
     * }
     */
    public static void FileRevision(MemorySegment struct, long index0, long fieldValue) {
        FileRevision$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

