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
 *     DWORD ThermalConstraint;
 *     DWORD64 Processors;
 * }
 * }
 */
public class PPM_THERMALCHANGE_EVENT {

    PPM_THERMALCHANGE_EVENT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("ThermalConstraint"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_LONG_LONG.withName("Processors")
    ).withName("$anon$16493:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ThermalConstraint$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ThermalConstraint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ThermalConstraint
     * }
     */
    public static final OfInt ThermalConstraint$layout() {
        return ThermalConstraint$LAYOUT;
    }

    private static final long ThermalConstraint$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ThermalConstraint
     * }
     */
    public static final long ThermalConstraint$offset() {
        return ThermalConstraint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ThermalConstraint
     * }
     */
    public static int ThermalConstraint(MemorySegment struct) {
        return struct.get(ThermalConstraint$LAYOUT, ThermalConstraint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ThermalConstraint
     * }
     */
    public static void ThermalConstraint(MemorySegment struct, int fieldValue) {
        struct.set(ThermalConstraint$LAYOUT, ThermalConstraint$OFFSET, fieldValue);
    }

    private static final OfLong Processors$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Processors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 Processors
     * }
     */
    public static final OfLong Processors$layout() {
        return Processors$LAYOUT;
    }

    private static final long Processors$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 Processors
     * }
     */
    public static final long Processors$offset() {
        return Processors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 Processors
     * }
     */
    public static long Processors(MemorySegment struct) {
        return struct.get(Processors$LAYOUT, Processors$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 Processors
     * }
     */
    public static void Processors(MemorySegment struct, long fieldValue) {
        struct.set(Processors$LAYOUT, Processors$OFFSET, fieldValue);
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

