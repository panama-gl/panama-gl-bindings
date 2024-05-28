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
 * struct {
 *     DWORD Revision;
 *     BYTE MaxThrottle;
 *     BYTE MinThrottle;
 *     BYTE BusyAdjThreshold;
 *     union {
 *         BYTE Spare;
 *         union {
 *             BYTE AsBYTE;
 *             struct {
 *                 BYTE NoDomainAccounting : 1;
 *                 BYTE IncreasePolicy : 2;
 *                 BYTE DecreasePolicy : 2;
 *                 BYTE Reserved : 3;
 *             };
 *         } Flags;
 *     };
 *     DWORD TimeCheck;
 *     DWORD IncreaseTime;
 *     DWORD DecreaseTime;
 *     DWORD IncreasePercent;
 *     DWORD DecreasePercent;
 * }
 * }
 */
public class PROCESSOR_PERFSTATE_POLICY {

    PROCESSOR_PERFSTATE_POLICY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("Revision"),
        freeglut_h.C_CHAR.withName("MaxThrottle"),
        freeglut_h.C_CHAR.withName("MinThrottle"),
        freeglut_h.C_CHAR.withName("BusyAdjThreshold"),
        MemoryLayout.unionLayout(
            freeglut_h.C_CHAR.withName("Spare"),
            PROCESSOR_PERFSTATE_POLICY.Flags.layout().withName("Flags")
        ).withName("$anon$16711:5"),
        freeglut_h.C_LONG.withName("TimeCheck"),
        freeglut_h.C_LONG.withName("IncreaseTime"),
        freeglut_h.C_LONG.withName("DecreaseTime"),
        freeglut_h.C_LONG.withName("IncreasePercent"),
        freeglut_h.C_LONG.withName("DecreasePercent")
    ).withName("$anon$16706:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Revision$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Revision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Revision
     * }
     */
    public static final OfInt Revision$layout() {
        return Revision$LAYOUT;
    }

    private static final long Revision$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Revision
     * }
     */
    public static final long Revision$offset() {
        return Revision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Revision
     * }
     */
    public static int Revision(MemorySegment struct) {
        return struct.get(Revision$LAYOUT, Revision$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Revision
     * }
     */
    public static void Revision(MemorySegment struct, int fieldValue) {
        struct.set(Revision$LAYOUT, Revision$OFFSET, fieldValue);
    }

    private static final OfByte MaxThrottle$LAYOUT = (OfByte)$LAYOUT.select(groupElement("MaxThrottle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE MaxThrottle
     * }
     */
    public static final OfByte MaxThrottle$layout() {
        return MaxThrottle$LAYOUT;
    }

    private static final long MaxThrottle$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE MaxThrottle
     * }
     */
    public static final long MaxThrottle$offset() {
        return MaxThrottle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE MaxThrottle
     * }
     */
    public static byte MaxThrottle(MemorySegment struct) {
        return struct.get(MaxThrottle$LAYOUT, MaxThrottle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE MaxThrottle
     * }
     */
    public static void MaxThrottle(MemorySegment struct, byte fieldValue) {
        struct.set(MaxThrottle$LAYOUT, MaxThrottle$OFFSET, fieldValue);
    }

    private static final OfByte MinThrottle$LAYOUT = (OfByte)$LAYOUT.select(groupElement("MinThrottle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE MinThrottle
     * }
     */
    public static final OfByte MinThrottle$layout() {
        return MinThrottle$LAYOUT;
    }

    private static final long MinThrottle$OFFSET = 5;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE MinThrottle
     * }
     */
    public static final long MinThrottle$offset() {
        return MinThrottle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE MinThrottle
     * }
     */
    public static byte MinThrottle(MemorySegment struct) {
        return struct.get(MinThrottle$LAYOUT, MinThrottle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE MinThrottle
     * }
     */
    public static void MinThrottle(MemorySegment struct, byte fieldValue) {
        struct.set(MinThrottle$LAYOUT, MinThrottle$OFFSET, fieldValue);
    }

    private static final OfByte BusyAdjThreshold$LAYOUT = (OfByte)$LAYOUT.select(groupElement("BusyAdjThreshold"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE BusyAdjThreshold
     * }
     */
    public static final OfByte BusyAdjThreshold$layout() {
        return BusyAdjThreshold$LAYOUT;
    }

    private static final long BusyAdjThreshold$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE BusyAdjThreshold
     * }
     */
    public static final long BusyAdjThreshold$offset() {
        return BusyAdjThreshold$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE BusyAdjThreshold
     * }
     */
    public static byte BusyAdjThreshold(MemorySegment struct) {
        return struct.get(BusyAdjThreshold$LAYOUT, BusyAdjThreshold$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE BusyAdjThreshold
     * }
     */
    public static void BusyAdjThreshold(MemorySegment struct, byte fieldValue) {
        struct.set(BusyAdjThreshold$LAYOUT, BusyAdjThreshold$OFFSET, fieldValue);
    }

    private static final OfByte Spare$LAYOUT = (OfByte)$LAYOUT.select(groupElement("$anon$16711:5"), groupElement("Spare"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Spare
     * }
     */
    public static final OfByte Spare$layout() {
        return Spare$LAYOUT;
    }

    private static final long Spare$OFFSET = 7;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Spare
     * }
     */
    public static final long Spare$offset() {
        return Spare$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Spare
     * }
     */
    public static byte Spare(MemorySegment struct) {
        return struct.get(Spare$LAYOUT, Spare$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Spare
     * }
     */
    public static void Spare(MemorySegment struct, byte fieldValue) {
        struct.set(Spare$LAYOUT, Spare$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     BYTE AsBYTE;
     *     struct {
     *         BYTE NoDomainAccounting : 1;
     *         BYTE IncreasePolicy : 2;
     *         BYTE DecreasePolicy : 2;
     *         BYTE Reserved : 3;
     *     };
     * }
     * }
     */
    public static class Flags {

        Flags() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            freeglut_h.C_CHAR.withName("AsBYTE"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(1)
            ).withName("$anon$16715:13")
        ).withName("$anon$16713:9");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfByte AsBYTE$LAYOUT = (OfByte)$LAYOUT.select(groupElement("AsBYTE"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE AsBYTE
         * }
         */
        public static final OfByte AsBYTE$layout() {
            return AsBYTE$LAYOUT;
        }

        private static final long AsBYTE$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE AsBYTE
         * }
         */
        public static final long AsBYTE$offset() {
            return AsBYTE$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE AsBYTE
         * }
         */
        public static byte AsBYTE(MemorySegment union) {
            return union.get(AsBYTE$LAYOUT, AsBYTE$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE AsBYTE
         * }
         */
        public static void AsBYTE(MemorySegment union, byte fieldValue) {
            union.set(AsBYTE$LAYOUT, AsBYTE$OFFSET, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
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

    private static final GroupLayout Flags$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$16711:5"), groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     BYTE AsBYTE;
     *     struct {
     *         BYTE NoDomainAccounting : 1;
     *         BYTE IncreasePolicy : 2;
     *         BYTE DecreasePolicy : 2;
     *         BYTE Reserved : 3;
     *     };
     * } Flags
     * }
     */
    public static final GroupLayout Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 7;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     BYTE AsBYTE;
     *     struct {
     *         BYTE NoDomainAccounting : 1;
     *         BYTE IncreasePolicy : 2;
     *         BYTE DecreasePolicy : 2;
     *         BYTE Reserved : 3;
     *     };
     * } Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     BYTE AsBYTE;
     *     struct {
     *         BYTE NoDomainAccounting : 1;
     *         BYTE IncreasePolicy : 2;
     *         BYTE DecreasePolicy : 2;
     *         BYTE Reserved : 3;
     *     };
     * } Flags
     * }
     */
    public static MemorySegment Flags(MemorySegment struct) {
        return struct.asSlice(Flags$OFFSET, Flags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     BYTE AsBYTE;
     *     struct {
     *         BYTE NoDomainAccounting : 1;
     *         BYTE IncreasePolicy : 2;
     *         BYTE DecreasePolicy : 2;
     *         BYTE Reserved : 3;
     *     };
     * } Flags
     * }
     */
    public static void Flags(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Flags$OFFSET, Flags$LAYOUT.byteSize());
    }

    private static final OfInt TimeCheck$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TimeCheck"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TimeCheck
     * }
     */
    public static final OfInt TimeCheck$layout() {
        return TimeCheck$LAYOUT;
    }

    private static final long TimeCheck$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TimeCheck
     * }
     */
    public static final long TimeCheck$offset() {
        return TimeCheck$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TimeCheck
     * }
     */
    public static int TimeCheck(MemorySegment struct) {
        return struct.get(TimeCheck$LAYOUT, TimeCheck$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TimeCheck
     * }
     */
    public static void TimeCheck(MemorySegment struct, int fieldValue) {
        struct.set(TimeCheck$LAYOUT, TimeCheck$OFFSET, fieldValue);
    }

    private static final OfInt IncreaseTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("IncreaseTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD IncreaseTime
     * }
     */
    public static final OfInt IncreaseTime$layout() {
        return IncreaseTime$LAYOUT;
    }

    private static final long IncreaseTime$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD IncreaseTime
     * }
     */
    public static final long IncreaseTime$offset() {
        return IncreaseTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD IncreaseTime
     * }
     */
    public static int IncreaseTime(MemorySegment struct) {
        return struct.get(IncreaseTime$LAYOUT, IncreaseTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD IncreaseTime
     * }
     */
    public static void IncreaseTime(MemorySegment struct, int fieldValue) {
        struct.set(IncreaseTime$LAYOUT, IncreaseTime$OFFSET, fieldValue);
    }

    private static final OfInt DecreaseTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DecreaseTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DecreaseTime
     * }
     */
    public static final OfInt DecreaseTime$layout() {
        return DecreaseTime$LAYOUT;
    }

    private static final long DecreaseTime$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DecreaseTime
     * }
     */
    public static final long DecreaseTime$offset() {
        return DecreaseTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DecreaseTime
     * }
     */
    public static int DecreaseTime(MemorySegment struct) {
        return struct.get(DecreaseTime$LAYOUT, DecreaseTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DecreaseTime
     * }
     */
    public static void DecreaseTime(MemorySegment struct, int fieldValue) {
        struct.set(DecreaseTime$LAYOUT, DecreaseTime$OFFSET, fieldValue);
    }

    private static final OfInt IncreasePercent$LAYOUT = (OfInt)$LAYOUT.select(groupElement("IncreasePercent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD IncreasePercent
     * }
     */
    public static final OfInt IncreasePercent$layout() {
        return IncreasePercent$LAYOUT;
    }

    private static final long IncreasePercent$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD IncreasePercent
     * }
     */
    public static final long IncreasePercent$offset() {
        return IncreasePercent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD IncreasePercent
     * }
     */
    public static int IncreasePercent(MemorySegment struct) {
        return struct.get(IncreasePercent$LAYOUT, IncreasePercent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD IncreasePercent
     * }
     */
    public static void IncreasePercent(MemorySegment struct, int fieldValue) {
        struct.set(IncreasePercent$LAYOUT, IncreasePercent$OFFSET, fieldValue);
    }

    private static final OfInt DecreasePercent$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DecreasePercent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DecreasePercent
     * }
     */
    public static final OfInt DecreasePercent$layout() {
        return DecreasePercent$LAYOUT;
    }

    private static final long DecreasePercent$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DecreasePercent
     * }
     */
    public static final long DecreasePercent$offset() {
        return DecreasePercent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DecreasePercent
     * }
     */
    public static int DecreasePercent(MemorySegment struct) {
        return struct.get(DecreasePercent$LAYOUT, DecreasePercent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DecreasePercent
     * }
     */
    public static void DecreasePercent(MemorySegment struct, int fieldValue) {
        struct.set(DecreasePercent$LAYOUT, DecreasePercent$OFFSET, fieldValue);
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

