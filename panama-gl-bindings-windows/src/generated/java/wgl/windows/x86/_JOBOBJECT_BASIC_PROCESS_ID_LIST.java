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
 * struct _JOBOBJECT_BASIC_PROCESS_ID_LIST {
 *     DWORD NumberOfAssignedProcesses;
 *     DWORD NumberOfProcessIdsInList;
 *     ULONG_PTR ProcessIdList[1];
 * }
 * }
 */
public class _JOBOBJECT_BASIC_PROCESS_ID_LIST {

    _JOBOBJECT_BASIC_PROCESS_ID_LIST() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("NumberOfAssignedProcesses"),
        wgl_h.C_LONG.withName("NumberOfProcessIdsInList"),
        MemoryLayout.sequenceLayout(1, wgl_h.C_LONG_LONG).withName("ProcessIdList")
    ).withName("_JOBOBJECT_BASIC_PROCESS_ID_LIST");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt NumberOfAssignedProcesses$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberOfAssignedProcesses"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberOfAssignedProcesses
     * }
     */
    public static final OfInt NumberOfAssignedProcesses$layout() {
        return NumberOfAssignedProcesses$LAYOUT;
    }

    private static final long NumberOfAssignedProcesses$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberOfAssignedProcesses
     * }
     */
    public static final long NumberOfAssignedProcesses$offset() {
        return NumberOfAssignedProcesses$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberOfAssignedProcesses
     * }
     */
    public static int NumberOfAssignedProcesses(MemorySegment struct) {
        return struct.get(NumberOfAssignedProcesses$LAYOUT, NumberOfAssignedProcesses$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberOfAssignedProcesses
     * }
     */
    public static void NumberOfAssignedProcesses(MemorySegment struct, int fieldValue) {
        struct.set(NumberOfAssignedProcesses$LAYOUT, NumberOfAssignedProcesses$OFFSET, fieldValue);
    }

    private static final OfInt NumberOfProcessIdsInList$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberOfProcessIdsInList"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberOfProcessIdsInList
     * }
     */
    public static final OfInt NumberOfProcessIdsInList$layout() {
        return NumberOfProcessIdsInList$LAYOUT;
    }

    private static final long NumberOfProcessIdsInList$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberOfProcessIdsInList
     * }
     */
    public static final long NumberOfProcessIdsInList$offset() {
        return NumberOfProcessIdsInList$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberOfProcessIdsInList
     * }
     */
    public static int NumberOfProcessIdsInList(MemorySegment struct) {
        return struct.get(NumberOfProcessIdsInList$LAYOUT, NumberOfProcessIdsInList$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberOfProcessIdsInList
     * }
     */
    public static void NumberOfProcessIdsInList(MemorySegment struct, int fieldValue) {
        struct.set(NumberOfProcessIdsInList$LAYOUT, NumberOfProcessIdsInList$OFFSET, fieldValue);
    }

    private static final SequenceLayout ProcessIdList$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ProcessIdList"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR ProcessIdList[1]
     * }
     */
    public static final SequenceLayout ProcessIdList$layout() {
        return ProcessIdList$LAYOUT;
    }

    private static final long ProcessIdList$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR ProcessIdList[1]
     * }
     */
    public static final long ProcessIdList$offset() {
        return ProcessIdList$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR ProcessIdList[1]
     * }
     */
    public static MemorySegment ProcessIdList(MemorySegment struct) {
        return struct.asSlice(ProcessIdList$OFFSET, ProcessIdList$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR ProcessIdList[1]
     * }
     */
    public static void ProcessIdList(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ProcessIdList$OFFSET, ProcessIdList$LAYOUT.byteSize());
    }

    private static long[] ProcessIdList$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * ULONG_PTR ProcessIdList[1]
     * }
     */
    public static long[] ProcessIdList$dimensions() {
        return ProcessIdList$DIMS;
    }
    private static final VarHandle ProcessIdList$ELEM_HANDLE = ProcessIdList$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * ULONG_PTR ProcessIdList[1]
     * }
     */
    public static long ProcessIdList(MemorySegment struct, long index0) {
        return (long)ProcessIdList$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * ULONG_PTR ProcessIdList[1]
     * }
     */
    public static void ProcessIdList(MemorySegment struct, long index0, long fieldValue) {
        ProcessIdList$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

