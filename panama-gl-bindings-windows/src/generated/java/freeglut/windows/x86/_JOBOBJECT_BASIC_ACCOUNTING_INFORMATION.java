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
 * struct _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION {
 *     LARGE_INTEGER TotalUserTime;
 *     LARGE_INTEGER TotalKernelTime;
 *     LARGE_INTEGER ThisPeriodTotalUserTime;
 *     LARGE_INTEGER ThisPeriodTotalKernelTime;
 *     DWORD TotalPageFaultCount;
 *     DWORD TotalProcesses;
 *     DWORD ActiveProcesses;
 *     DWORD TotalTerminatedProcesses;
 * }
 * }
 */
public class _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION {

    _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LARGE_INTEGER.layout().withName("TotalUserTime"),
        _LARGE_INTEGER.layout().withName("TotalKernelTime"),
        _LARGE_INTEGER.layout().withName("ThisPeriodTotalUserTime"),
        _LARGE_INTEGER.layout().withName("ThisPeriodTotalKernelTime"),
        freeglut_h.C_LONG.withName("TotalPageFaultCount"),
        freeglut_h.C_LONG.withName("TotalProcesses"),
        freeglut_h.C_LONG.withName("ActiveProcesses"),
        freeglut_h.C_LONG.withName("TotalTerminatedProcesses")
    ).withName("_JOBOBJECT_BASIC_ACCOUNTING_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout TotalUserTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("TotalUserTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TotalUserTime
     * }
     */
    public static final GroupLayout TotalUserTime$layout() {
        return TotalUserTime$LAYOUT;
    }

    private static final long TotalUserTime$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TotalUserTime
     * }
     */
    public static final long TotalUserTime$offset() {
        return TotalUserTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TotalUserTime
     * }
     */
    public static MemorySegment TotalUserTime(MemorySegment struct) {
        return struct.asSlice(TotalUserTime$OFFSET, TotalUserTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TotalUserTime
     * }
     */
    public static void TotalUserTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TotalUserTime$OFFSET, TotalUserTime$LAYOUT.byteSize());
    }

    private static final GroupLayout TotalKernelTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("TotalKernelTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TotalKernelTime
     * }
     */
    public static final GroupLayout TotalKernelTime$layout() {
        return TotalKernelTime$LAYOUT;
    }

    private static final long TotalKernelTime$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TotalKernelTime
     * }
     */
    public static final long TotalKernelTime$offset() {
        return TotalKernelTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TotalKernelTime
     * }
     */
    public static MemorySegment TotalKernelTime(MemorySegment struct) {
        return struct.asSlice(TotalKernelTime$OFFSET, TotalKernelTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TotalKernelTime
     * }
     */
    public static void TotalKernelTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TotalKernelTime$OFFSET, TotalKernelTime$LAYOUT.byteSize());
    }

    private static final GroupLayout ThisPeriodTotalUserTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ThisPeriodTotalUserTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ThisPeriodTotalUserTime
     * }
     */
    public static final GroupLayout ThisPeriodTotalUserTime$layout() {
        return ThisPeriodTotalUserTime$LAYOUT;
    }

    private static final long ThisPeriodTotalUserTime$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ThisPeriodTotalUserTime
     * }
     */
    public static final long ThisPeriodTotalUserTime$offset() {
        return ThisPeriodTotalUserTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ThisPeriodTotalUserTime
     * }
     */
    public static MemorySegment ThisPeriodTotalUserTime(MemorySegment struct) {
        return struct.asSlice(ThisPeriodTotalUserTime$OFFSET, ThisPeriodTotalUserTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ThisPeriodTotalUserTime
     * }
     */
    public static void ThisPeriodTotalUserTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ThisPeriodTotalUserTime$OFFSET, ThisPeriodTotalUserTime$LAYOUT.byteSize());
    }

    private static final GroupLayout ThisPeriodTotalKernelTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ThisPeriodTotalKernelTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ThisPeriodTotalKernelTime
     * }
     */
    public static final GroupLayout ThisPeriodTotalKernelTime$layout() {
        return ThisPeriodTotalKernelTime$LAYOUT;
    }

    private static final long ThisPeriodTotalKernelTime$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ThisPeriodTotalKernelTime
     * }
     */
    public static final long ThisPeriodTotalKernelTime$offset() {
        return ThisPeriodTotalKernelTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ThisPeriodTotalKernelTime
     * }
     */
    public static MemorySegment ThisPeriodTotalKernelTime(MemorySegment struct) {
        return struct.asSlice(ThisPeriodTotalKernelTime$OFFSET, ThisPeriodTotalKernelTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ThisPeriodTotalKernelTime
     * }
     */
    public static void ThisPeriodTotalKernelTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ThisPeriodTotalKernelTime$OFFSET, ThisPeriodTotalKernelTime$LAYOUT.byteSize());
    }

    private static final OfInt TotalPageFaultCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TotalPageFaultCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TotalPageFaultCount
     * }
     */
    public static final OfInt TotalPageFaultCount$layout() {
        return TotalPageFaultCount$LAYOUT;
    }

    private static final long TotalPageFaultCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TotalPageFaultCount
     * }
     */
    public static final long TotalPageFaultCount$offset() {
        return TotalPageFaultCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TotalPageFaultCount
     * }
     */
    public static int TotalPageFaultCount(MemorySegment struct) {
        return struct.get(TotalPageFaultCount$LAYOUT, TotalPageFaultCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TotalPageFaultCount
     * }
     */
    public static void TotalPageFaultCount(MemorySegment struct, int fieldValue) {
        struct.set(TotalPageFaultCount$LAYOUT, TotalPageFaultCount$OFFSET, fieldValue);
    }

    private static final OfInt TotalProcesses$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TotalProcesses"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TotalProcesses
     * }
     */
    public static final OfInt TotalProcesses$layout() {
        return TotalProcesses$LAYOUT;
    }

    private static final long TotalProcesses$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TotalProcesses
     * }
     */
    public static final long TotalProcesses$offset() {
        return TotalProcesses$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TotalProcesses
     * }
     */
    public static int TotalProcesses(MemorySegment struct) {
        return struct.get(TotalProcesses$LAYOUT, TotalProcesses$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TotalProcesses
     * }
     */
    public static void TotalProcesses(MemorySegment struct, int fieldValue) {
        struct.set(TotalProcesses$LAYOUT, TotalProcesses$OFFSET, fieldValue);
    }

    private static final OfInt ActiveProcesses$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ActiveProcesses"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ActiveProcesses
     * }
     */
    public static final OfInt ActiveProcesses$layout() {
        return ActiveProcesses$LAYOUT;
    }

    private static final long ActiveProcesses$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ActiveProcesses
     * }
     */
    public static final long ActiveProcesses$offset() {
        return ActiveProcesses$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ActiveProcesses
     * }
     */
    public static int ActiveProcesses(MemorySegment struct) {
        return struct.get(ActiveProcesses$LAYOUT, ActiveProcesses$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ActiveProcesses
     * }
     */
    public static void ActiveProcesses(MemorySegment struct, int fieldValue) {
        struct.set(ActiveProcesses$LAYOUT, ActiveProcesses$OFFSET, fieldValue);
    }

    private static final OfInt TotalTerminatedProcesses$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TotalTerminatedProcesses"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TotalTerminatedProcesses
     * }
     */
    public static final OfInt TotalTerminatedProcesses$layout() {
        return TotalTerminatedProcesses$LAYOUT;
    }

    private static final long TotalTerminatedProcesses$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TotalTerminatedProcesses
     * }
     */
    public static final long TotalTerminatedProcesses$offset() {
        return TotalTerminatedProcesses$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TotalTerminatedProcesses
     * }
     */
    public static int TotalTerminatedProcesses(MemorySegment struct) {
        return struct.get(TotalTerminatedProcesses$LAYOUT, TotalTerminatedProcesses$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TotalTerminatedProcesses
     * }
     */
    public static void TotalTerminatedProcesses(MemorySegment struct, int fieldValue) {
        struct.set(TotalTerminatedProcesses$LAYOUT, TotalTerminatedProcesses$OFFSET, fieldValue);
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

