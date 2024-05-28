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
 * struct _STORAGE_READ_CAPACITY {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD BlockLength;
 *     LARGE_INTEGER NumberOfBlocks;
 *     LARGE_INTEGER DiskLength;
 * }
 * }
 */
public class _STORAGE_READ_CAPACITY {

    _STORAGE_READ_CAPACITY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Version"),
        wgl_h.C_LONG.withName("Size"),
        wgl_h.C_LONG.withName("BlockLength"),
        MemoryLayout.paddingLayout(4),
        _LARGE_INTEGER.layout().withName("NumberOfBlocks"),
        _LARGE_INTEGER.layout().withName("DiskLength")
    ).withName("_STORAGE_READ_CAPACITY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final OfInt BlockLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BlockLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BlockLength
     * }
     */
    public static final OfInt BlockLength$layout() {
        return BlockLength$LAYOUT;
    }

    private static final long BlockLength$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BlockLength
     * }
     */
    public static final long BlockLength$offset() {
        return BlockLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BlockLength
     * }
     */
    public static int BlockLength(MemorySegment struct) {
        return struct.get(BlockLength$LAYOUT, BlockLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BlockLength
     * }
     */
    public static void BlockLength(MemorySegment struct, int fieldValue) {
        struct.set(BlockLength$LAYOUT, BlockLength$OFFSET, fieldValue);
    }

    private static final GroupLayout NumberOfBlocks$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("NumberOfBlocks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER NumberOfBlocks
     * }
     */
    public static final GroupLayout NumberOfBlocks$layout() {
        return NumberOfBlocks$LAYOUT;
    }

    private static final long NumberOfBlocks$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER NumberOfBlocks
     * }
     */
    public static final long NumberOfBlocks$offset() {
        return NumberOfBlocks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER NumberOfBlocks
     * }
     */
    public static MemorySegment NumberOfBlocks(MemorySegment struct) {
        return struct.asSlice(NumberOfBlocks$OFFSET, NumberOfBlocks$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER NumberOfBlocks
     * }
     */
    public static void NumberOfBlocks(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, NumberOfBlocks$OFFSET, NumberOfBlocks$LAYOUT.byteSize());
    }

    private static final GroupLayout DiskLength$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("DiskLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER DiskLength
     * }
     */
    public static final GroupLayout DiskLength$layout() {
        return DiskLength$LAYOUT;
    }

    private static final long DiskLength$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER DiskLength
     * }
     */
    public static final long DiskLength$offset() {
        return DiskLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER DiskLength
     * }
     */
    public static MemorySegment DiskLength(MemorySegment struct) {
        return struct.asSlice(DiskLength$OFFSET, DiskLength$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER DiskLength
     * }
     */
    public static void DiskLength(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, DiskLength$OFFSET, DiskLength$LAYOUT.byteSize());
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

