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
 * struct _DEVICE_DATA_SET_RANGE {
 *     LONGLONG StartingOffset;
 *     DWORDLONG LengthInBytes;
 * }
 * }
 */
public class _DEVICE_DATA_SET_RANGE {

    _DEVICE_DATA_SET_RANGE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG_LONG.withName("StartingOffset"),
        wgl_h.C_LONG_LONG.withName("LengthInBytes")
    ).withName("_DEVICE_DATA_SET_RANGE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong StartingOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("StartingOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONGLONG StartingOffset
     * }
     */
    public static final OfLong StartingOffset$layout() {
        return StartingOffset$LAYOUT;
    }

    private static final long StartingOffset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONGLONG StartingOffset
     * }
     */
    public static final long StartingOffset$offset() {
        return StartingOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONGLONG StartingOffset
     * }
     */
    public static long StartingOffset(MemorySegment struct) {
        return struct.get(StartingOffset$LAYOUT, StartingOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONGLONG StartingOffset
     * }
     */
    public static void StartingOffset(MemorySegment struct, long fieldValue) {
        struct.set(StartingOffset$LAYOUT, StartingOffset$OFFSET, fieldValue);
    }

    private static final OfLong LengthInBytes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("LengthInBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG LengthInBytes
     * }
     */
    public static final OfLong LengthInBytes$layout() {
        return LengthInBytes$LAYOUT;
    }

    private static final long LengthInBytes$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG LengthInBytes
     * }
     */
    public static final long LengthInBytes$offset() {
        return LengthInBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG LengthInBytes
     * }
     */
    public static long LengthInBytes(MemorySegment struct) {
        return struct.get(LengthInBytes$LAYOUT, LengthInBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG LengthInBytes
     * }
     */
    public static void LengthInBytes(MemorySegment struct, long fieldValue) {
        struct.set(LengthInBytes$LAYOUT, LengthInBytes$OFFSET, fieldValue);
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

