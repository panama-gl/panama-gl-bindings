// Generated by jextract

package freeglut.windows.x86;

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
 * struct _TAPE_GET_DRIVE_PARAMETERS {
 *     BOOLEAN ECC;
 *     BOOLEAN Compression;
 *     BOOLEAN DataPadding;
 *     BOOLEAN ReportSetmarks;
 *     DWORD DefaultBlockSize;
 *     DWORD MaximumBlockSize;
 *     DWORD MinimumBlockSize;
 *     DWORD MaximumPartitionCount;
 *     DWORD FeaturesLow;
 *     DWORD FeaturesHigh;
 *     DWORD EOTWarningZoneSize;
 * }
 * }
 */
public class _TAPE_GET_DRIVE_PARAMETERS {

    _TAPE_GET_DRIVE_PARAMETERS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_CHAR.withName("ECC"),
        freeglut_h.C_CHAR.withName("Compression"),
        freeglut_h.C_CHAR.withName("DataPadding"),
        freeglut_h.C_CHAR.withName("ReportSetmarks"),
        freeglut_h.C_LONG.withName("DefaultBlockSize"),
        freeglut_h.C_LONG.withName("MaximumBlockSize"),
        freeglut_h.C_LONG.withName("MinimumBlockSize"),
        freeglut_h.C_LONG.withName("MaximumPartitionCount"),
        freeglut_h.C_LONG.withName("FeaturesLow"),
        freeglut_h.C_LONG.withName("FeaturesHigh"),
        freeglut_h.C_LONG.withName("EOTWarningZoneSize")
    ).withName("_TAPE_GET_DRIVE_PARAMETERS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte ECC$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ECC"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN ECC
     * }
     */
    public static final OfByte ECC$layout() {
        return ECC$LAYOUT;
    }

    private static final long ECC$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN ECC
     * }
     */
    public static final long ECC$offset() {
        return ECC$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN ECC
     * }
     */
    public static byte ECC(MemorySegment struct) {
        return struct.get(ECC$LAYOUT, ECC$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN ECC
     * }
     */
    public static void ECC(MemorySegment struct, byte fieldValue) {
        struct.set(ECC$LAYOUT, ECC$OFFSET, fieldValue);
    }

    private static final OfByte Compression$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Compression"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN Compression
     * }
     */
    public static final OfByte Compression$layout() {
        return Compression$LAYOUT;
    }

    private static final long Compression$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN Compression
     * }
     */
    public static final long Compression$offset() {
        return Compression$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN Compression
     * }
     */
    public static byte Compression(MemorySegment struct) {
        return struct.get(Compression$LAYOUT, Compression$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN Compression
     * }
     */
    public static void Compression(MemorySegment struct, byte fieldValue) {
        struct.set(Compression$LAYOUT, Compression$OFFSET, fieldValue);
    }

    private static final OfByte DataPadding$LAYOUT = (OfByte)$LAYOUT.select(groupElement("DataPadding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN DataPadding
     * }
     */
    public static final OfByte DataPadding$layout() {
        return DataPadding$LAYOUT;
    }

    private static final long DataPadding$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN DataPadding
     * }
     */
    public static final long DataPadding$offset() {
        return DataPadding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN DataPadding
     * }
     */
    public static byte DataPadding(MemorySegment struct) {
        return struct.get(DataPadding$LAYOUT, DataPadding$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN DataPadding
     * }
     */
    public static void DataPadding(MemorySegment struct, byte fieldValue) {
        struct.set(DataPadding$LAYOUT, DataPadding$OFFSET, fieldValue);
    }

    private static final OfByte ReportSetmarks$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ReportSetmarks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN ReportSetmarks
     * }
     */
    public static final OfByte ReportSetmarks$layout() {
        return ReportSetmarks$LAYOUT;
    }

    private static final long ReportSetmarks$OFFSET = 3;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN ReportSetmarks
     * }
     */
    public static final long ReportSetmarks$offset() {
        return ReportSetmarks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN ReportSetmarks
     * }
     */
    public static byte ReportSetmarks(MemorySegment struct) {
        return struct.get(ReportSetmarks$LAYOUT, ReportSetmarks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN ReportSetmarks
     * }
     */
    public static void ReportSetmarks(MemorySegment struct, byte fieldValue) {
        struct.set(ReportSetmarks$LAYOUT, ReportSetmarks$OFFSET, fieldValue);
    }

    private static final OfInt DefaultBlockSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DefaultBlockSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DefaultBlockSize
     * }
     */
    public static final OfInt DefaultBlockSize$layout() {
        return DefaultBlockSize$LAYOUT;
    }

    private static final long DefaultBlockSize$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DefaultBlockSize
     * }
     */
    public static final long DefaultBlockSize$offset() {
        return DefaultBlockSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DefaultBlockSize
     * }
     */
    public static int DefaultBlockSize(MemorySegment struct) {
        return struct.get(DefaultBlockSize$LAYOUT, DefaultBlockSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DefaultBlockSize
     * }
     */
    public static void DefaultBlockSize(MemorySegment struct, int fieldValue) {
        struct.set(DefaultBlockSize$LAYOUT, DefaultBlockSize$OFFSET, fieldValue);
    }

    private static final OfInt MaximumBlockSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaximumBlockSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaximumBlockSize
     * }
     */
    public static final OfInt MaximumBlockSize$layout() {
        return MaximumBlockSize$LAYOUT;
    }

    private static final long MaximumBlockSize$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaximumBlockSize
     * }
     */
    public static final long MaximumBlockSize$offset() {
        return MaximumBlockSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaximumBlockSize
     * }
     */
    public static int MaximumBlockSize(MemorySegment struct) {
        return struct.get(MaximumBlockSize$LAYOUT, MaximumBlockSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaximumBlockSize
     * }
     */
    public static void MaximumBlockSize(MemorySegment struct, int fieldValue) {
        struct.set(MaximumBlockSize$LAYOUT, MaximumBlockSize$OFFSET, fieldValue);
    }

    private static final OfInt MinimumBlockSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MinimumBlockSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MinimumBlockSize
     * }
     */
    public static final OfInt MinimumBlockSize$layout() {
        return MinimumBlockSize$LAYOUT;
    }

    private static final long MinimumBlockSize$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MinimumBlockSize
     * }
     */
    public static final long MinimumBlockSize$offset() {
        return MinimumBlockSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MinimumBlockSize
     * }
     */
    public static int MinimumBlockSize(MemorySegment struct) {
        return struct.get(MinimumBlockSize$LAYOUT, MinimumBlockSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MinimumBlockSize
     * }
     */
    public static void MinimumBlockSize(MemorySegment struct, int fieldValue) {
        struct.set(MinimumBlockSize$LAYOUT, MinimumBlockSize$OFFSET, fieldValue);
    }

    private static final OfInt MaximumPartitionCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaximumPartitionCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaximumPartitionCount
     * }
     */
    public static final OfInt MaximumPartitionCount$layout() {
        return MaximumPartitionCount$LAYOUT;
    }

    private static final long MaximumPartitionCount$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaximumPartitionCount
     * }
     */
    public static final long MaximumPartitionCount$offset() {
        return MaximumPartitionCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaximumPartitionCount
     * }
     */
    public static int MaximumPartitionCount(MemorySegment struct) {
        return struct.get(MaximumPartitionCount$LAYOUT, MaximumPartitionCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaximumPartitionCount
     * }
     */
    public static void MaximumPartitionCount(MemorySegment struct, int fieldValue) {
        struct.set(MaximumPartitionCount$LAYOUT, MaximumPartitionCount$OFFSET, fieldValue);
    }

    private static final OfInt FeaturesLow$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FeaturesLow"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FeaturesLow
     * }
     */
    public static final OfInt FeaturesLow$layout() {
        return FeaturesLow$LAYOUT;
    }

    private static final long FeaturesLow$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FeaturesLow
     * }
     */
    public static final long FeaturesLow$offset() {
        return FeaturesLow$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FeaturesLow
     * }
     */
    public static int FeaturesLow(MemorySegment struct) {
        return struct.get(FeaturesLow$LAYOUT, FeaturesLow$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FeaturesLow
     * }
     */
    public static void FeaturesLow(MemorySegment struct, int fieldValue) {
        struct.set(FeaturesLow$LAYOUT, FeaturesLow$OFFSET, fieldValue);
    }

    private static final OfInt FeaturesHigh$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FeaturesHigh"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FeaturesHigh
     * }
     */
    public static final OfInt FeaturesHigh$layout() {
        return FeaturesHigh$LAYOUT;
    }

    private static final long FeaturesHigh$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FeaturesHigh
     * }
     */
    public static final long FeaturesHigh$offset() {
        return FeaturesHigh$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FeaturesHigh
     * }
     */
    public static int FeaturesHigh(MemorySegment struct) {
        return struct.get(FeaturesHigh$LAYOUT, FeaturesHigh$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FeaturesHigh
     * }
     */
    public static void FeaturesHigh(MemorySegment struct, int fieldValue) {
        struct.set(FeaturesHigh$LAYOUT, FeaturesHigh$OFFSET, fieldValue);
    }

    private static final OfInt EOTWarningZoneSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EOTWarningZoneSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD EOTWarningZoneSize
     * }
     */
    public static final OfInt EOTWarningZoneSize$layout() {
        return EOTWarningZoneSize$LAYOUT;
    }

    private static final long EOTWarningZoneSize$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD EOTWarningZoneSize
     * }
     */
    public static final long EOTWarningZoneSize$offset() {
        return EOTWarningZoneSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD EOTWarningZoneSize
     * }
     */
    public static int EOTWarningZoneSize(MemorySegment struct) {
        return struct.get(EOTWarningZoneSize$LAYOUT, EOTWarningZoneSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD EOTWarningZoneSize
     * }
     */
    public static void EOTWarningZoneSize(MemorySegment struct, int fieldValue) {
        struct.set(EOTWarningZoneSize$LAYOUT, EOTWarningZoneSize$OFFSET, fieldValue);
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

