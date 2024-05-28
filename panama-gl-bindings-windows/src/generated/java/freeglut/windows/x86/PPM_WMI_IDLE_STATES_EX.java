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
 *     DWORD Type;
 *     DWORD Count;
 *     DWORD TargetState;
 *     DWORD OldState;
 *     PVOID TargetProcessors;
 *     PPM_WMI_IDLE_STATE State[1];
 * }
 * }
 */
public class PPM_WMI_IDLE_STATES_EX {

    PPM_WMI_IDLE_STATES_EX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("Type"),
        freeglut_h.C_LONG.withName("Count"),
        freeglut_h.C_LONG.withName("TargetState"),
        freeglut_h.C_LONG.withName("OldState"),
        freeglut_h.C_POINTER.withName("TargetProcessors"),
        MemoryLayout.sequenceLayout(1, PPM_WMI_IDLE_STATE.layout()).withName("State")
    ).withName("$anon$16242:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Type
     * }
     */
    public static final OfInt Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Type
     * }
     */
    public static int Type(MemorySegment struct) {
        return struct.get(Type$LAYOUT, Type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Type
     * }
     */
    public static void Type(MemorySegment struct, int fieldValue) {
        struct.set(Type$LAYOUT, Type$OFFSET, fieldValue);
    }

    private static final OfInt Count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static final OfInt Count$layout() {
        return Count$LAYOUT;
    }

    private static final long Count$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static final long Count$offset() {
        return Count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static int Count(MemorySegment struct) {
        return struct.get(Count$LAYOUT, Count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static void Count(MemorySegment struct, int fieldValue) {
        struct.set(Count$LAYOUT, Count$OFFSET, fieldValue);
    }

    private static final OfInt TargetState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TargetState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TargetState
     * }
     */
    public static final OfInt TargetState$layout() {
        return TargetState$LAYOUT;
    }

    private static final long TargetState$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TargetState
     * }
     */
    public static final long TargetState$offset() {
        return TargetState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TargetState
     * }
     */
    public static int TargetState(MemorySegment struct) {
        return struct.get(TargetState$LAYOUT, TargetState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TargetState
     * }
     */
    public static void TargetState(MemorySegment struct, int fieldValue) {
        struct.set(TargetState$LAYOUT, TargetState$OFFSET, fieldValue);
    }

    private static final OfInt OldState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("OldState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD OldState
     * }
     */
    public static final OfInt OldState$layout() {
        return OldState$LAYOUT;
    }

    private static final long OldState$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD OldState
     * }
     */
    public static final long OldState$offset() {
        return OldState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD OldState
     * }
     */
    public static int OldState(MemorySegment struct) {
        return struct.get(OldState$LAYOUT, OldState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD OldState
     * }
     */
    public static void OldState(MemorySegment struct, int fieldValue) {
        struct.set(OldState$LAYOUT, OldState$OFFSET, fieldValue);
    }

    private static final AddressLayout TargetProcessors$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("TargetProcessors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID TargetProcessors
     * }
     */
    public static final AddressLayout TargetProcessors$layout() {
        return TargetProcessors$LAYOUT;
    }

    private static final long TargetProcessors$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID TargetProcessors
     * }
     */
    public static final long TargetProcessors$offset() {
        return TargetProcessors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID TargetProcessors
     * }
     */
    public static MemorySegment TargetProcessors(MemorySegment struct) {
        return struct.get(TargetProcessors$LAYOUT, TargetProcessors$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID TargetProcessors
     * }
     */
    public static void TargetProcessors(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(TargetProcessors$LAYOUT, TargetProcessors$OFFSET, fieldValue);
    }

    private static final SequenceLayout State$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("State"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PPM_WMI_IDLE_STATE State[1]
     * }
     */
    public static final SequenceLayout State$layout() {
        return State$LAYOUT;
    }

    private static final long State$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PPM_WMI_IDLE_STATE State[1]
     * }
     */
    public static final long State$offset() {
        return State$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PPM_WMI_IDLE_STATE State[1]
     * }
     */
    public static MemorySegment State(MemorySegment struct) {
        return struct.asSlice(State$OFFSET, State$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PPM_WMI_IDLE_STATE State[1]
     * }
     */
    public static void State(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, State$OFFSET, State$LAYOUT.byteSize());
    }

    private static long[] State$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * PPM_WMI_IDLE_STATE State[1]
     * }
     */
    public static long[] State$dimensions() {
        return State$DIMS;
    }
    private static final MethodHandle State$ELEM_HANDLE = State$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * PPM_WMI_IDLE_STATE State[1]
     * }
     */
    public static MemorySegment State(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)State$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * PPM_WMI_IDLE_STATE State[1]
     * }
     */
    public static void State(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, State(struct, index0), 0L, PPM_WMI_IDLE_STATE.layout().byteSize());
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

