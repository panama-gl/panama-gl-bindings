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
 * struct _PARTITION_INFORMATION {
 *     LARGE_INTEGER StartingOffset;
 *     LARGE_INTEGER PartitionLength;
 *     DWORD HiddenSectors;
 *     DWORD PartitionNumber;
 *     BYTE PartitionType;
 *     BOOLEAN BootIndicator;
 *     BOOLEAN RecognizedPartition;
 *     BOOLEAN RewritePartition;
 * }
 * }
 */
public class _PARTITION_INFORMATION {

    _PARTITION_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LARGE_INTEGER.layout().withName("StartingOffset"),
        _LARGE_INTEGER.layout().withName("PartitionLength"),
        wgl_h.C_LONG.withName("HiddenSectors"),
        wgl_h.C_LONG.withName("PartitionNumber"),
        wgl_h.C_CHAR.withName("PartitionType"),
        wgl_h.C_CHAR.withName("BootIndicator"),
        wgl_h.C_CHAR.withName("RecognizedPartition"),
        wgl_h.C_CHAR.withName("RewritePartition"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PARTITION_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout StartingOffset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("StartingOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingOffset
     * }
     */
    public static final GroupLayout StartingOffset$layout() {
        return StartingOffset$LAYOUT;
    }

    private static final long StartingOffset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingOffset
     * }
     */
    public static final long StartingOffset$offset() {
        return StartingOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingOffset
     * }
     */
    public static MemorySegment StartingOffset(MemorySegment struct) {
        return struct.asSlice(StartingOffset$OFFSET, StartingOffset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StartingOffset
     * }
     */
    public static void StartingOffset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StartingOffset$OFFSET, StartingOffset$LAYOUT.byteSize());
    }

    private static final GroupLayout PartitionLength$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("PartitionLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PartitionLength
     * }
     */
    public static final GroupLayout PartitionLength$layout() {
        return PartitionLength$LAYOUT;
    }

    private static final long PartitionLength$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PartitionLength
     * }
     */
    public static final long PartitionLength$offset() {
        return PartitionLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PartitionLength
     * }
     */
    public static MemorySegment PartitionLength(MemorySegment struct) {
        return struct.asSlice(PartitionLength$OFFSET, PartitionLength$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PartitionLength
     * }
     */
    public static void PartitionLength(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, PartitionLength$OFFSET, PartitionLength$LAYOUT.byteSize());
    }

    private static final OfInt HiddenSectors$LAYOUT = (OfInt)$LAYOUT.select(groupElement("HiddenSectors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD HiddenSectors
     * }
     */
    public static final OfInt HiddenSectors$layout() {
        return HiddenSectors$LAYOUT;
    }

    private static final long HiddenSectors$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD HiddenSectors
     * }
     */
    public static final long HiddenSectors$offset() {
        return HiddenSectors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD HiddenSectors
     * }
     */
    public static int HiddenSectors(MemorySegment struct) {
        return struct.get(HiddenSectors$LAYOUT, HiddenSectors$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD HiddenSectors
     * }
     */
    public static void HiddenSectors(MemorySegment struct, int fieldValue) {
        struct.set(HiddenSectors$LAYOUT, HiddenSectors$OFFSET, fieldValue);
    }

    private static final OfInt PartitionNumber$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PartitionNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PartitionNumber
     * }
     */
    public static final OfInt PartitionNumber$layout() {
        return PartitionNumber$LAYOUT;
    }

    private static final long PartitionNumber$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PartitionNumber
     * }
     */
    public static final long PartitionNumber$offset() {
        return PartitionNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PartitionNumber
     * }
     */
    public static int PartitionNumber(MemorySegment struct) {
        return struct.get(PartitionNumber$LAYOUT, PartitionNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PartitionNumber
     * }
     */
    public static void PartitionNumber(MemorySegment struct, int fieldValue) {
        struct.set(PartitionNumber$LAYOUT, PartitionNumber$OFFSET, fieldValue);
    }

    private static final OfByte PartitionType$LAYOUT = (OfByte)$LAYOUT.select(groupElement("PartitionType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE PartitionType
     * }
     */
    public static final OfByte PartitionType$layout() {
        return PartitionType$LAYOUT;
    }

    private static final long PartitionType$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE PartitionType
     * }
     */
    public static final long PartitionType$offset() {
        return PartitionType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE PartitionType
     * }
     */
    public static byte PartitionType(MemorySegment struct) {
        return struct.get(PartitionType$LAYOUT, PartitionType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE PartitionType
     * }
     */
    public static void PartitionType(MemorySegment struct, byte fieldValue) {
        struct.set(PartitionType$LAYOUT, PartitionType$OFFSET, fieldValue);
    }

    private static final OfByte BootIndicator$LAYOUT = (OfByte)$LAYOUT.select(groupElement("BootIndicator"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN BootIndicator
     * }
     */
    public static final OfByte BootIndicator$layout() {
        return BootIndicator$LAYOUT;
    }

    private static final long BootIndicator$OFFSET = 25;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN BootIndicator
     * }
     */
    public static final long BootIndicator$offset() {
        return BootIndicator$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN BootIndicator
     * }
     */
    public static byte BootIndicator(MemorySegment struct) {
        return struct.get(BootIndicator$LAYOUT, BootIndicator$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN BootIndicator
     * }
     */
    public static void BootIndicator(MemorySegment struct, byte fieldValue) {
        struct.set(BootIndicator$LAYOUT, BootIndicator$OFFSET, fieldValue);
    }

    private static final OfByte RecognizedPartition$LAYOUT = (OfByte)$LAYOUT.select(groupElement("RecognizedPartition"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN RecognizedPartition
     * }
     */
    public static final OfByte RecognizedPartition$layout() {
        return RecognizedPartition$LAYOUT;
    }

    private static final long RecognizedPartition$OFFSET = 26;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN RecognizedPartition
     * }
     */
    public static final long RecognizedPartition$offset() {
        return RecognizedPartition$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN RecognizedPartition
     * }
     */
    public static byte RecognizedPartition(MemorySegment struct) {
        return struct.get(RecognizedPartition$LAYOUT, RecognizedPartition$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN RecognizedPartition
     * }
     */
    public static void RecognizedPartition(MemorySegment struct, byte fieldValue) {
        struct.set(RecognizedPartition$LAYOUT, RecognizedPartition$OFFSET, fieldValue);
    }

    private static final OfByte RewritePartition$LAYOUT = (OfByte)$LAYOUT.select(groupElement("RewritePartition"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN RewritePartition
     * }
     */
    public static final OfByte RewritePartition$layout() {
        return RewritePartition$LAYOUT;
    }

    private static final long RewritePartition$OFFSET = 27;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN RewritePartition
     * }
     */
    public static final long RewritePartition$offset() {
        return RewritePartition$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN RewritePartition
     * }
     */
    public static byte RewritePartition(MemorySegment struct) {
        return struct.get(RewritePartition$LAYOUT, RewritePartition$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN RewritePartition
     * }
     */
    public static void RewritePartition(MemorySegment struct, byte fieldValue) {
        struct.set(RewritePartition$LAYOUT, RewritePartition$OFFSET, fieldValue);
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

