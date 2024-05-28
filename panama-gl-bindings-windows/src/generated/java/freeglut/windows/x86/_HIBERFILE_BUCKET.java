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
 * struct _HIBERFILE_BUCKET {
 *     DWORD64 MaxPhysicalMemory;
 *     DWORD PhysicalMemoryPercent[3];
 * }
 * }
 */
public class _HIBERFILE_BUCKET {

    _HIBERFILE_BUCKET() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG_LONG.withName("MaxPhysicalMemory"),
        MemoryLayout.sequenceLayout(3, freeglut_h.C_LONG).withName("PhysicalMemoryPercent"),
        MemoryLayout.paddingLayout(4)
    ).withName("_HIBERFILE_BUCKET");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong MaxPhysicalMemory$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MaxPhysicalMemory"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 MaxPhysicalMemory
     * }
     */
    public static final OfLong MaxPhysicalMemory$layout() {
        return MaxPhysicalMemory$LAYOUT;
    }

    private static final long MaxPhysicalMemory$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 MaxPhysicalMemory
     * }
     */
    public static final long MaxPhysicalMemory$offset() {
        return MaxPhysicalMemory$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 MaxPhysicalMemory
     * }
     */
    public static long MaxPhysicalMemory(MemorySegment struct) {
        return struct.get(MaxPhysicalMemory$LAYOUT, MaxPhysicalMemory$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 MaxPhysicalMemory
     * }
     */
    public static void MaxPhysicalMemory(MemorySegment struct, long fieldValue) {
        struct.set(MaxPhysicalMemory$LAYOUT, MaxPhysicalMemory$OFFSET, fieldValue);
    }

    private static final SequenceLayout PhysicalMemoryPercent$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("PhysicalMemoryPercent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PhysicalMemoryPercent[3]
     * }
     */
    public static final SequenceLayout PhysicalMemoryPercent$layout() {
        return PhysicalMemoryPercent$LAYOUT;
    }

    private static final long PhysicalMemoryPercent$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PhysicalMemoryPercent[3]
     * }
     */
    public static final long PhysicalMemoryPercent$offset() {
        return PhysicalMemoryPercent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PhysicalMemoryPercent[3]
     * }
     */
    public static MemorySegment PhysicalMemoryPercent(MemorySegment struct) {
        return struct.asSlice(PhysicalMemoryPercent$OFFSET, PhysicalMemoryPercent$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PhysicalMemoryPercent[3]
     * }
     */
    public static void PhysicalMemoryPercent(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, PhysicalMemoryPercent$OFFSET, PhysicalMemoryPercent$LAYOUT.byteSize());
    }

    private static long[] PhysicalMemoryPercent$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD PhysicalMemoryPercent[3]
     * }
     */
    public static long[] PhysicalMemoryPercent$dimensions() {
        return PhysicalMemoryPercent$DIMS;
    }
    private static final VarHandle PhysicalMemoryPercent$ELEM_HANDLE = PhysicalMemoryPercent$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD PhysicalMemoryPercent[3]
     * }
     */
    public static int PhysicalMemoryPercent(MemorySegment struct, long index0) {
        return (int)PhysicalMemoryPercent$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD PhysicalMemoryPercent[3]
     * }
     */
    public static void PhysicalMemoryPercent(MemorySegment struct, long index0, int fieldValue) {
        PhysicalMemoryPercent$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

