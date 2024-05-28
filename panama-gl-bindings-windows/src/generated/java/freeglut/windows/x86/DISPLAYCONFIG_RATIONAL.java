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
 * struct DISPLAYCONFIG_RATIONAL {
 *     UINT32 Numerator;
 *     UINT32 Denominator;
 * }
 * }
 */
public class DISPLAYCONFIG_RATIONAL {

    DISPLAYCONFIG_RATIONAL() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_INT.withName("Numerator"),
        freeglut_h.C_INT.withName("Denominator")
    ).withName("DISPLAYCONFIG_RATIONAL");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Numerator$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Numerator"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 Numerator
     * }
     */
    public static final OfInt Numerator$layout() {
        return Numerator$LAYOUT;
    }

    private static final long Numerator$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 Numerator
     * }
     */
    public static final long Numerator$offset() {
        return Numerator$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 Numerator
     * }
     */
    public static int Numerator(MemorySegment struct) {
        return struct.get(Numerator$LAYOUT, Numerator$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 Numerator
     * }
     */
    public static void Numerator(MemorySegment struct, int fieldValue) {
        struct.set(Numerator$LAYOUT, Numerator$OFFSET, fieldValue);
    }

    private static final OfInt Denominator$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Denominator"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 Denominator
     * }
     */
    public static final OfInt Denominator$layout() {
        return Denominator$LAYOUT;
    }

    private static final long Denominator$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 Denominator
     * }
     */
    public static final long Denominator$offset() {
        return Denominator$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 Denominator
     * }
     */
    public static int Denominator(MemorySegment struct) {
        return struct.get(Denominator$LAYOUT, Denominator$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 Denominator
     * }
     */
    public static void Denominator(MemorySegment struct, int fieldValue) {
        struct.set(Denominator$LAYOUT, Denominator$OFFSET, fieldValue);
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

