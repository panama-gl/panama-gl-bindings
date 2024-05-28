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
 * struct _FILE_COMPRESSION_INFO {
 *     LARGE_INTEGER CompressedFileSize;
 *     WORD CompressionFormat;
 *     UCHAR CompressionUnitShift;
 *     UCHAR ChunkShift;
 *     UCHAR ClusterShift;
 *     UCHAR Reserved[3];
 * }
 * }
 */
public class _FILE_COMPRESSION_INFO {

    _FILE_COMPRESSION_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LARGE_INTEGER.layout().withName("CompressedFileSize"),
        wgl_h.C_SHORT.withName("CompressionFormat"),
        wgl_h.C_CHAR.withName("CompressionUnitShift"),
        wgl_h.C_CHAR.withName("ChunkShift"),
        wgl_h.C_CHAR.withName("ClusterShift"),
        MemoryLayout.sequenceLayout(3, wgl_h.C_CHAR).withName("Reserved")
    ).withName("_FILE_COMPRESSION_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout CompressedFileSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("CompressedFileSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER CompressedFileSize
     * }
     */
    public static final GroupLayout CompressedFileSize$layout() {
        return CompressedFileSize$LAYOUT;
    }

    private static final long CompressedFileSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER CompressedFileSize
     * }
     */
    public static final long CompressedFileSize$offset() {
        return CompressedFileSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER CompressedFileSize
     * }
     */
    public static MemorySegment CompressedFileSize(MemorySegment struct) {
        return struct.asSlice(CompressedFileSize$OFFSET, CompressedFileSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER CompressedFileSize
     * }
     */
    public static void CompressedFileSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, CompressedFileSize$OFFSET, CompressedFileSize$LAYOUT.byteSize());
    }

    private static final OfShort CompressionFormat$LAYOUT = (OfShort)$LAYOUT.select(groupElement("CompressionFormat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD CompressionFormat
     * }
     */
    public static final OfShort CompressionFormat$layout() {
        return CompressionFormat$LAYOUT;
    }

    private static final long CompressionFormat$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD CompressionFormat
     * }
     */
    public static final long CompressionFormat$offset() {
        return CompressionFormat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD CompressionFormat
     * }
     */
    public static short CompressionFormat(MemorySegment struct) {
        return struct.get(CompressionFormat$LAYOUT, CompressionFormat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD CompressionFormat
     * }
     */
    public static void CompressionFormat(MemorySegment struct, short fieldValue) {
        struct.set(CompressionFormat$LAYOUT, CompressionFormat$OFFSET, fieldValue);
    }

    private static final OfByte CompressionUnitShift$LAYOUT = (OfByte)$LAYOUT.select(groupElement("CompressionUnitShift"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR CompressionUnitShift
     * }
     */
    public static final OfByte CompressionUnitShift$layout() {
        return CompressionUnitShift$LAYOUT;
    }

    private static final long CompressionUnitShift$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR CompressionUnitShift
     * }
     */
    public static final long CompressionUnitShift$offset() {
        return CompressionUnitShift$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR CompressionUnitShift
     * }
     */
    public static byte CompressionUnitShift(MemorySegment struct) {
        return struct.get(CompressionUnitShift$LAYOUT, CompressionUnitShift$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR CompressionUnitShift
     * }
     */
    public static void CompressionUnitShift(MemorySegment struct, byte fieldValue) {
        struct.set(CompressionUnitShift$LAYOUT, CompressionUnitShift$OFFSET, fieldValue);
    }

    private static final OfByte ChunkShift$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ChunkShift"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR ChunkShift
     * }
     */
    public static final OfByte ChunkShift$layout() {
        return ChunkShift$LAYOUT;
    }

    private static final long ChunkShift$OFFSET = 11;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR ChunkShift
     * }
     */
    public static final long ChunkShift$offset() {
        return ChunkShift$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR ChunkShift
     * }
     */
    public static byte ChunkShift(MemorySegment struct) {
        return struct.get(ChunkShift$LAYOUT, ChunkShift$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR ChunkShift
     * }
     */
    public static void ChunkShift(MemorySegment struct, byte fieldValue) {
        struct.set(ChunkShift$LAYOUT, ChunkShift$OFFSET, fieldValue);
    }

    private static final OfByte ClusterShift$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ClusterShift"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR ClusterShift
     * }
     */
    public static final OfByte ClusterShift$layout() {
        return ClusterShift$LAYOUT;
    }

    private static final long ClusterShift$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR ClusterShift
     * }
     */
    public static final long ClusterShift$offset() {
        return ClusterShift$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR ClusterShift
     * }
     */
    public static byte ClusterShift(MemorySegment struct) {
        return struct.get(ClusterShift$LAYOUT, ClusterShift$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR ClusterShift
     * }
     */
    public static void ClusterShift(MemorySegment struct, byte fieldValue) {
        struct.set(ClusterShift$LAYOUT, ClusterShift$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR Reserved[3]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 13;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR Reserved[3]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR Reserved[3]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR Reserved[3]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * UCHAR Reserved[3]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * UCHAR Reserved[3]
     * }
     */
    public static byte Reserved(MemorySegment struct, long index0) {
        return (byte)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * UCHAR Reserved[3]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, byte fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

