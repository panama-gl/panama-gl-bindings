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
 * struct {
 *     BOOLEAN AcOnLine;
 *     BOOLEAN BatteryPresent;
 *     BOOLEAN Charging;
 *     BOOLEAN Discharging;
 *     BOOLEAN Spare1[3];
 *     BYTE Tag;
 *     DWORD MaxCapacity;
 *     DWORD RemainingCapacity;
 *     DWORD Rate;
 *     DWORD EstimatedTime;
 *     DWORD DefaultAlert1;
 *     DWORD DefaultAlert2;
 * }
 * }
 */
public class SYSTEM_BATTERY_STATE {

    SYSTEM_BATTERY_STATE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_CHAR.withName("AcOnLine"),
        wgl_h.C_CHAR.withName("BatteryPresent"),
        wgl_h.C_CHAR.withName("Charging"),
        wgl_h.C_CHAR.withName("Discharging"),
        MemoryLayout.sequenceLayout(3, wgl_h.C_CHAR).withName("Spare1"),
        wgl_h.C_CHAR.withName("Tag"),
        wgl_h.C_LONG.withName("MaxCapacity"),
        wgl_h.C_LONG.withName("RemainingCapacity"),
        wgl_h.C_LONG.withName("Rate"),
        wgl_h.C_LONG.withName("EstimatedTime"),
        wgl_h.C_LONG.withName("DefaultAlert1"),
        wgl_h.C_LONG.withName("DefaultAlert2")
    ).withName("$anon$16826:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte AcOnLine$LAYOUT = (OfByte)$LAYOUT.select(groupElement("AcOnLine"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN AcOnLine
     * }
     */
    public static final OfByte AcOnLine$layout() {
        return AcOnLine$LAYOUT;
    }

    private static final long AcOnLine$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN AcOnLine
     * }
     */
    public static final long AcOnLine$offset() {
        return AcOnLine$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN AcOnLine
     * }
     */
    public static byte AcOnLine(MemorySegment struct) {
        return struct.get(AcOnLine$LAYOUT, AcOnLine$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN AcOnLine
     * }
     */
    public static void AcOnLine(MemorySegment struct, byte fieldValue) {
        struct.set(AcOnLine$LAYOUT, AcOnLine$OFFSET, fieldValue);
    }

    private static final OfByte BatteryPresent$LAYOUT = (OfByte)$LAYOUT.select(groupElement("BatteryPresent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN BatteryPresent
     * }
     */
    public static final OfByte BatteryPresent$layout() {
        return BatteryPresent$LAYOUT;
    }

    private static final long BatteryPresent$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN BatteryPresent
     * }
     */
    public static final long BatteryPresent$offset() {
        return BatteryPresent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN BatteryPresent
     * }
     */
    public static byte BatteryPresent(MemorySegment struct) {
        return struct.get(BatteryPresent$LAYOUT, BatteryPresent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN BatteryPresent
     * }
     */
    public static void BatteryPresent(MemorySegment struct, byte fieldValue) {
        struct.set(BatteryPresent$LAYOUT, BatteryPresent$OFFSET, fieldValue);
    }

    private static final OfByte Charging$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Charging"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN Charging
     * }
     */
    public static final OfByte Charging$layout() {
        return Charging$LAYOUT;
    }

    private static final long Charging$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN Charging
     * }
     */
    public static final long Charging$offset() {
        return Charging$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN Charging
     * }
     */
    public static byte Charging(MemorySegment struct) {
        return struct.get(Charging$LAYOUT, Charging$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN Charging
     * }
     */
    public static void Charging(MemorySegment struct, byte fieldValue) {
        struct.set(Charging$LAYOUT, Charging$OFFSET, fieldValue);
    }

    private static final OfByte Discharging$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Discharging"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN Discharging
     * }
     */
    public static final OfByte Discharging$layout() {
        return Discharging$LAYOUT;
    }

    private static final long Discharging$OFFSET = 3;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN Discharging
     * }
     */
    public static final long Discharging$offset() {
        return Discharging$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN Discharging
     * }
     */
    public static byte Discharging(MemorySegment struct) {
        return struct.get(Discharging$LAYOUT, Discharging$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN Discharging
     * }
     */
    public static void Discharging(MemorySegment struct, byte fieldValue) {
        struct.set(Discharging$LAYOUT, Discharging$OFFSET, fieldValue);
    }

    private static final SequenceLayout Spare1$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Spare1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN Spare1[3]
     * }
     */
    public static final SequenceLayout Spare1$layout() {
        return Spare1$LAYOUT;
    }

    private static final long Spare1$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN Spare1[3]
     * }
     */
    public static final long Spare1$offset() {
        return Spare1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN Spare1[3]
     * }
     */
    public static MemorySegment Spare1(MemorySegment struct) {
        return struct.asSlice(Spare1$OFFSET, Spare1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN Spare1[3]
     * }
     */
    public static void Spare1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Spare1$OFFSET, Spare1$LAYOUT.byteSize());
    }

    private static long[] Spare1$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BOOLEAN Spare1[3]
     * }
     */
    public static long[] Spare1$dimensions() {
        return Spare1$DIMS;
    }
    private static final VarHandle Spare1$ELEM_HANDLE = Spare1$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BOOLEAN Spare1[3]
     * }
     */
    public static byte Spare1(MemorySegment struct, long index0) {
        return (byte)Spare1$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BOOLEAN Spare1[3]
     * }
     */
    public static void Spare1(MemorySegment struct, long index0, byte fieldValue) {
        Spare1$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfByte Tag$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Tag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Tag
     * }
     */
    public static final OfByte Tag$layout() {
        return Tag$LAYOUT;
    }

    private static final long Tag$OFFSET = 7;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Tag
     * }
     */
    public static final long Tag$offset() {
        return Tag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Tag
     * }
     */
    public static byte Tag(MemorySegment struct) {
        return struct.get(Tag$LAYOUT, Tag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Tag
     * }
     */
    public static void Tag(MemorySegment struct, byte fieldValue) {
        struct.set(Tag$LAYOUT, Tag$OFFSET, fieldValue);
    }

    private static final OfInt MaxCapacity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaxCapacity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaxCapacity
     * }
     */
    public static final OfInt MaxCapacity$layout() {
        return MaxCapacity$LAYOUT;
    }

    private static final long MaxCapacity$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaxCapacity
     * }
     */
    public static final long MaxCapacity$offset() {
        return MaxCapacity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaxCapacity
     * }
     */
    public static int MaxCapacity(MemorySegment struct) {
        return struct.get(MaxCapacity$LAYOUT, MaxCapacity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaxCapacity
     * }
     */
    public static void MaxCapacity(MemorySegment struct, int fieldValue) {
        struct.set(MaxCapacity$LAYOUT, MaxCapacity$OFFSET, fieldValue);
    }

    private static final OfInt RemainingCapacity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("RemainingCapacity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD RemainingCapacity
     * }
     */
    public static final OfInt RemainingCapacity$layout() {
        return RemainingCapacity$LAYOUT;
    }

    private static final long RemainingCapacity$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD RemainingCapacity
     * }
     */
    public static final long RemainingCapacity$offset() {
        return RemainingCapacity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD RemainingCapacity
     * }
     */
    public static int RemainingCapacity(MemorySegment struct) {
        return struct.get(RemainingCapacity$LAYOUT, RemainingCapacity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD RemainingCapacity
     * }
     */
    public static void RemainingCapacity(MemorySegment struct, int fieldValue) {
        struct.set(RemainingCapacity$LAYOUT, RemainingCapacity$OFFSET, fieldValue);
    }

    private static final OfInt Rate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Rate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Rate
     * }
     */
    public static final OfInt Rate$layout() {
        return Rate$LAYOUT;
    }

    private static final long Rate$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Rate
     * }
     */
    public static final long Rate$offset() {
        return Rate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Rate
     * }
     */
    public static int Rate(MemorySegment struct) {
        return struct.get(Rate$LAYOUT, Rate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Rate
     * }
     */
    public static void Rate(MemorySegment struct, int fieldValue) {
        struct.set(Rate$LAYOUT, Rate$OFFSET, fieldValue);
    }

    private static final OfInt EstimatedTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EstimatedTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD EstimatedTime
     * }
     */
    public static final OfInt EstimatedTime$layout() {
        return EstimatedTime$LAYOUT;
    }

    private static final long EstimatedTime$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD EstimatedTime
     * }
     */
    public static final long EstimatedTime$offset() {
        return EstimatedTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD EstimatedTime
     * }
     */
    public static int EstimatedTime(MemorySegment struct) {
        return struct.get(EstimatedTime$LAYOUT, EstimatedTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD EstimatedTime
     * }
     */
    public static void EstimatedTime(MemorySegment struct, int fieldValue) {
        struct.set(EstimatedTime$LAYOUT, EstimatedTime$OFFSET, fieldValue);
    }

    private static final OfInt DefaultAlert1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DefaultAlert1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DefaultAlert1
     * }
     */
    public static final OfInt DefaultAlert1$layout() {
        return DefaultAlert1$LAYOUT;
    }

    private static final long DefaultAlert1$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DefaultAlert1
     * }
     */
    public static final long DefaultAlert1$offset() {
        return DefaultAlert1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DefaultAlert1
     * }
     */
    public static int DefaultAlert1(MemorySegment struct) {
        return struct.get(DefaultAlert1$LAYOUT, DefaultAlert1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DefaultAlert1
     * }
     */
    public static void DefaultAlert1(MemorySegment struct, int fieldValue) {
        struct.set(DefaultAlert1$LAYOUT, DefaultAlert1$OFFSET, fieldValue);
    }

    private static final OfInt DefaultAlert2$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DefaultAlert2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DefaultAlert2
     * }
     */
    public static final OfInt DefaultAlert2$layout() {
        return DefaultAlert2$LAYOUT;
    }

    private static final long DefaultAlert2$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DefaultAlert2
     * }
     */
    public static final long DefaultAlert2$offset() {
        return DefaultAlert2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DefaultAlert2
     * }
     */
    public static int DefaultAlert2(MemorySegment struct) {
        return struct.get(DefaultAlert2$LAYOUT, DefaultAlert2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DefaultAlert2
     * }
     */
    public static void DefaultAlert2(MemorySegment struct, int fieldValue) {
        struct.set(DefaultAlert2$LAYOUT, DefaultAlert2$OFFSET, fieldValue);
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

