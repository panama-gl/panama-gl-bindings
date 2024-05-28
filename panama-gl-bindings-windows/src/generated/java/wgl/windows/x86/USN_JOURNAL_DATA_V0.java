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
 *     DWORDLONG UsnJournalID;
 *     USN FirstUsn;
 *     USN NextUsn;
 *     USN LowestValidUsn;
 *     USN MaxUsn;
 *     DWORDLONG MaximumSize;
 *     DWORDLONG AllocationDelta;
 * }
 * }
 */
public class USN_JOURNAL_DATA_V0 {

    USN_JOURNAL_DATA_V0() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG_LONG.withName("UsnJournalID"),
        wgl_h.C_LONG_LONG.withName("FirstUsn"),
        wgl_h.C_LONG_LONG.withName("NextUsn"),
        wgl_h.C_LONG_LONG.withName("LowestValidUsn"),
        wgl_h.C_LONG_LONG.withName("MaxUsn"),
        wgl_h.C_LONG_LONG.withName("MaximumSize"),
        wgl_h.C_LONG_LONG.withName("AllocationDelta")
    ).withName("$anon$10961:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong UsnJournalID$LAYOUT = (OfLong)$LAYOUT.select(groupElement("UsnJournalID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG UsnJournalID
     * }
     */
    public static final OfLong UsnJournalID$layout() {
        return UsnJournalID$LAYOUT;
    }

    private static final long UsnJournalID$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG UsnJournalID
     * }
     */
    public static final long UsnJournalID$offset() {
        return UsnJournalID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG UsnJournalID
     * }
     */
    public static long UsnJournalID(MemorySegment struct) {
        return struct.get(UsnJournalID$LAYOUT, UsnJournalID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG UsnJournalID
     * }
     */
    public static void UsnJournalID(MemorySegment struct, long fieldValue) {
        struct.set(UsnJournalID$LAYOUT, UsnJournalID$OFFSET, fieldValue);
    }

    private static final OfLong FirstUsn$LAYOUT = (OfLong)$LAYOUT.select(groupElement("FirstUsn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USN FirstUsn
     * }
     */
    public static final OfLong FirstUsn$layout() {
        return FirstUsn$LAYOUT;
    }

    private static final long FirstUsn$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USN FirstUsn
     * }
     */
    public static final long FirstUsn$offset() {
        return FirstUsn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USN FirstUsn
     * }
     */
    public static long FirstUsn(MemorySegment struct) {
        return struct.get(FirstUsn$LAYOUT, FirstUsn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USN FirstUsn
     * }
     */
    public static void FirstUsn(MemorySegment struct, long fieldValue) {
        struct.set(FirstUsn$LAYOUT, FirstUsn$OFFSET, fieldValue);
    }

    private static final OfLong NextUsn$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NextUsn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USN NextUsn
     * }
     */
    public static final OfLong NextUsn$layout() {
        return NextUsn$LAYOUT;
    }

    private static final long NextUsn$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USN NextUsn
     * }
     */
    public static final long NextUsn$offset() {
        return NextUsn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USN NextUsn
     * }
     */
    public static long NextUsn(MemorySegment struct) {
        return struct.get(NextUsn$LAYOUT, NextUsn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USN NextUsn
     * }
     */
    public static void NextUsn(MemorySegment struct, long fieldValue) {
        struct.set(NextUsn$LAYOUT, NextUsn$OFFSET, fieldValue);
    }

    private static final OfLong LowestValidUsn$LAYOUT = (OfLong)$LAYOUT.select(groupElement("LowestValidUsn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USN LowestValidUsn
     * }
     */
    public static final OfLong LowestValidUsn$layout() {
        return LowestValidUsn$LAYOUT;
    }

    private static final long LowestValidUsn$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USN LowestValidUsn
     * }
     */
    public static final long LowestValidUsn$offset() {
        return LowestValidUsn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USN LowestValidUsn
     * }
     */
    public static long LowestValidUsn(MemorySegment struct) {
        return struct.get(LowestValidUsn$LAYOUT, LowestValidUsn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USN LowestValidUsn
     * }
     */
    public static void LowestValidUsn(MemorySegment struct, long fieldValue) {
        struct.set(LowestValidUsn$LAYOUT, LowestValidUsn$OFFSET, fieldValue);
    }

    private static final OfLong MaxUsn$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MaxUsn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USN MaxUsn
     * }
     */
    public static final OfLong MaxUsn$layout() {
        return MaxUsn$LAYOUT;
    }

    private static final long MaxUsn$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USN MaxUsn
     * }
     */
    public static final long MaxUsn$offset() {
        return MaxUsn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USN MaxUsn
     * }
     */
    public static long MaxUsn(MemorySegment struct) {
        return struct.get(MaxUsn$LAYOUT, MaxUsn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USN MaxUsn
     * }
     */
    public static void MaxUsn(MemorySegment struct, long fieldValue) {
        struct.set(MaxUsn$LAYOUT, MaxUsn$OFFSET, fieldValue);
    }

    private static final OfLong MaximumSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MaximumSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG MaximumSize
     * }
     */
    public static final OfLong MaximumSize$layout() {
        return MaximumSize$LAYOUT;
    }

    private static final long MaximumSize$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG MaximumSize
     * }
     */
    public static final long MaximumSize$offset() {
        return MaximumSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG MaximumSize
     * }
     */
    public static long MaximumSize(MemorySegment struct) {
        return struct.get(MaximumSize$LAYOUT, MaximumSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG MaximumSize
     * }
     */
    public static void MaximumSize(MemorySegment struct, long fieldValue) {
        struct.set(MaximumSize$LAYOUT, MaximumSize$OFFSET, fieldValue);
    }

    private static final OfLong AllocationDelta$LAYOUT = (OfLong)$LAYOUT.select(groupElement("AllocationDelta"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG AllocationDelta
     * }
     */
    public static final OfLong AllocationDelta$layout() {
        return AllocationDelta$LAYOUT;
    }

    private static final long AllocationDelta$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG AllocationDelta
     * }
     */
    public static final long AllocationDelta$offset() {
        return AllocationDelta$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG AllocationDelta
     * }
     */
    public static long AllocationDelta(MemorySegment struct) {
        return struct.get(AllocationDelta$LAYOUT, AllocationDelta$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG AllocationDelta
     * }
     */
    public static void AllocationDelta(MemorySegment struct, long fieldValue) {
        struct.set(AllocationDelta$LAYOUT, AllocationDelta$OFFSET, fieldValue);
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

