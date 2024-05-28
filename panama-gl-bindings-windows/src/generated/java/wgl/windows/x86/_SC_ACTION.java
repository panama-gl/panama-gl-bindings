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
 * struct _SC_ACTION {
 *     SC_ACTION_TYPE Type;
 *     DWORD Delay;
 * }
 * }
 */
public class _SC_ACTION {

    _SC_ACTION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_INT.withName("Type"),
        wgl_h.C_LONG.withName("Delay")
    ).withName("_SC_ACTION");

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
     * SC_ACTION_TYPE Type
     * }
     */
    public static final OfInt Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SC_ACTION_TYPE Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SC_ACTION_TYPE Type
     * }
     */
    public static int Type(MemorySegment struct) {
        return struct.get(Type$LAYOUT, Type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SC_ACTION_TYPE Type
     * }
     */
    public static void Type(MemorySegment struct, int fieldValue) {
        struct.set(Type$LAYOUT, Type$OFFSET, fieldValue);
    }

    private static final OfInt Delay$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Delay"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Delay
     * }
     */
    public static final OfInt Delay$layout() {
        return Delay$LAYOUT;
    }

    private static final long Delay$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Delay
     * }
     */
    public static final long Delay$offset() {
        return Delay$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Delay
     * }
     */
    public static int Delay(MemorySegment struct) {
        return struct.get(Delay$LAYOUT, Delay$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Delay
     * }
     */
    public static void Delay(MemorySegment struct, int fieldValue) {
        struct.set(Delay$LAYOUT, Delay$OFFSET, fieldValue);
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

