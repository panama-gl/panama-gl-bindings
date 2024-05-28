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
 * struct _RTL_CRITICAL_SECTION_DEBUG {
 *     WORD Type;
 *     WORD CreatorBackTraceIndex;
 *     struct _RTL_CRITICAL_SECTION *CriticalSection;
 *     LIST_ENTRY ProcessLocksList;
 *     DWORD EntryCount;
 *     DWORD ContentionCount;
 *     DWORD Flags;
 *     WORD CreatorBackTraceIndexHigh;
 *     WORD SpareWORD;
 * }
 * }
 */
public class _RTL_CRITICAL_SECTION_DEBUG {

    _RTL_CRITICAL_SECTION_DEBUG() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_SHORT.withName("Type"),
        wgl_h.C_SHORT.withName("CreatorBackTraceIndex"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("CriticalSection"),
        _LIST_ENTRY.layout().withName("ProcessLocksList"),
        wgl_h.C_LONG.withName("EntryCount"),
        wgl_h.C_LONG.withName("ContentionCount"),
        wgl_h.C_LONG.withName("Flags"),
        wgl_h.C_SHORT.withName("CreatorBackTraceIndexHigh"),
        wgl_h.C_SHORT.withName("SpareWORD")
    ).withName("_RTL_CRITICAL_SECTION_DEBUG");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Type$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static final OfShort Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static short Type(MemorySegment struct) {
        return struct.get(Type$LAYOUT, Type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static void Type(MemorySegment struct, short fieldValue) {
        struct.set(Type$LAYOUT, Type$OFFSET, fieldValue);
    }

    private static final OfShort CreatorBackTraceIndex$LAYOUT = (OfShort)$LAYOUT.select(groupElement("CreatorBackTraceIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD CreatorBackTraceIndex
     * }
     */
    public static final OfShort CreatorBackTraceIndex$layout() {
        return CreatorBackTraceIndex$LAYOUT;
    }

    private static final long CreatorBackTraceIndex$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD CreatorBackTraceIndex
     * }
     */
    public static final long CreatorBackTraceIndex$offset() {
        return CreatorBackTraceIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD CreatorBackTraceIndex
     * }
     */
    public static short CreatorBackTraceIndex(MemorySegment struct) {
        return struct.get(CreatorBackTraceIndex$LAYOUT, CreatorBackTraceIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD CreatorBackTraceIndex
     * }
     */
    public static void CreatorBackTraceIndex(MemorySegment struct, short fieldValue) {
        struct.set(CreatorBackTraceIndex$LAYOUT, CreatorBackTraceIndex$OFFSET, fieldValue);
    }

    private static final AddressLayout CriticalSection$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("CriticalSection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _RTL_CRITICAL_SECTION *CriticalSection
     * }
     */
    public static final AddressLayout CriticalSection$layout() {
        return CriticalSection$LAYOUT;
    }

    private static final long CriticalSection$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _RTL_CRITICAL_SECTION *CriticalSection
     * }
     */
    public static final long CriticalSection$offset() {
        return CriticalSection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _RTL_CRITICAL_SECTION *CriticalSection
     * }
     */
    public static MemorySegment CriticalSection(MemorySegment struct) {
        return struct.get(CriticalSection$LAYOUT, CriticalSection$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _RTL_CRITICAL_SECTION *CriticalSection
     * }
     */
    public static void CriticalSection(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(CriticalSection$LAYOUT, CriticalSection$OFFSET, fieldValue);
    }

    private static final GroupLayout ProcessLocksList$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ProcessLocksList"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LIST_ENTRY ProcessLocksList
     * }
     */
    public static final GroupLayout ProcessLocksList$layout() {
        return ProcessLocksList$LAYOUT;
    }

    private static final long ProcessLocksList$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LIST_ENTRY ProcessLocksList
     * }
     */
    public static final long ProcessLocksList$offset() {
        return ProcessLocksList$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LIST_ENTRY ProcessLocksList
     * }
     */
    public static MemorySegment ProcessLocksList(MemorySegment struct) {
        return struct.asSlice(ProcessLocksList$OFFSET, ProcessLocksList$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LIST_ENTRY ProcessLocksList
     * }
     */
    public static void ProcessLocksList(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ProcessLocksList$OFFSET, ProcessLocksList$LAYOUT.byteSize());
    }

    private static final OfInt EntryCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EntryCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD EntryCount
     * }
     */
    public static final OfInt EntryCount$layout() {
        return EntryCount$LAYOUT;
    }

    private static final long EntryCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD EntryCount
     * }
     */
    public static final long EntryCount$offset() {
        return EntryCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD EntryCount
     * }
     */
    public static int EntryCount(MemorySegment struct) {
        return struct.get(EntryCount$LAYOUT, EntryCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD EntryCount
     * }
     */
    public static void EntryCount(MemorySegment struct, int fieldValue) {
        struct.set(EntryCount$LAYOUT, EntryCount$OFFSET, fieldValue);
    }

    private static final OfInt ContentionCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ContentionCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ContentionCount
     * }
     */
    public static final OfInt ContentionCount$layout() {
        return ContentionCount$LAYOUT;
    }

    private static final long ContentionCount$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ContentionCount
     * }
     */
    public static final long ContentionCount$offset() {
        return ContentionCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ContentionCount
     * }
     */
    public static int ContentionCount(MemorySegment struct) {
        return struct.get(ContentionCount$LAYOUT, ContentionCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ContentionCount
     * }
     */
    public static void ContentionCount(MemorySegment struct, int fieldValue) {
        struct.set(ContentionCount$LAYOUT, ContentionCount$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final OfShort CreatorBackTraceIndexHigh$LAYOUT = (OfShort)$LAYOUT.select(groupElement("CreatorBackTraceIndexHigh"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD CreatorBackTraceIndexHigh
     * }
     */
    public static final OfShort CreatorBackTraceIndexHigh$layout() {
        return CreatorBackTraceIndexHigh$LAYOUT;
    }

    private static final long CreatorBackTraceIndexHigh$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD CreatorBackTraceIndexHigh
     * }
     */
    public static final long CreatorBackTraceIndexHigh$offset() {
        return CreatorBackTraceIndexHigh$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD CreatorBackTraceIndexHigh
     * }
     */
    public static short CreatorBackTraceIndexHigh(MemorySegment struct) {
        return struct.get(CreatorBackTraceIndexHigh$LAYOUT, CreatorBackTraceIndexHigh$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD CreatorBackTraceIndexHigh
     * }
     */
    public static void CreatorBackTraceIndexHigh(MemorySegment struct, short fieldValue) {
        struct.set(CreatorBackTraceIndexHigh$LAYOUT, CreatorBackTraceIndexHigh$OFFSET, fieldValue);
    }

    private static final OfShort SpareWORD$LAYOUT = (OfShort)$LAYOUT.select(groupElement("SpareWORD"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD SpareWORD
     * }
     */
    public static final OfShort SpareWORD$layout() {
        return SpareWORD$LAYOUT;
    }

    private static final long SpareWORD$OFFSET = 46;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD SpareWORD
     * }
     */
    public static final long SpareWORD$offset() {
        return SpareWORD$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD SpareWORD
     * }
     */
    public static short SpareWORD(MemorySegment struct) {
        return struct.get(SpareWORD$LAYOUT, SpareWORD$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD SpareWORD
     * }
     */
    public static void SpareWORD(MemorySegment struct, short fieldValue) {
        struct.set(SpareWORD$LAYOUT, SpareWORD$OFFSET, fieldValue);
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

