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
 * struct _GET_FILTER_FILE_IDENTIFIER_INPUT {
 *     WORD AltitudeLength;
 *     WCHAR Altitude[1];
 * }
 * }
 */
public class _GET_FILTER_FILE_IDENTIFIER_INPUT {

    _GET_FILTER_FILE_IDENTIFIER_INPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_SHORT.withName("AltitudeLength"),
        MemoryLayout.sequenceLayout(1, wgl_h.C_SHORT).withName("Altitude")
    ).withName("_GET_FILTER_FILE_IDENTIFIER_INPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort AltitudeLength$LAYOUT = (OfShort)$LAYOUT.select(groupElement("AltitudeLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD AltitudeLength
     * }
     */
    public static final OfShort AltitudeLength$layout() {
        return AltitudeLength$LAYOUT;
    }

    private static final long AltitudeLength$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD AltitudeLength
     * }
     */
    public static final long AltitudeLength$offset() {
        return AltitudeLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD AltitudeLength
     * }
     */
    public static short AltitudeLength(MemorySegment struct) {
        return struct.get(AltitudeLength$LAYOUT, AltitudeLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD AltitudeLength
     * }
     */
    public static void AltitudeLength(MemorySegment struct, short fieldValue) {
        struct.set(AltitudeLength$LAYOUT, AltitudeLength$OFFSET, fieldValue);
    }

    private static final SequenceLayout Altitude$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Altitude"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR Altitude[1]
     * }
     */
    public static final SequenceLayout Altitude$layout() {
        return Altitude$LAYOUT;
    }

    private static final long Altitude$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR Altitude[1]
     * }
     */
    public static final long Altitude$offset() {
        return Altitude$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR Altitude[1]
     * }
     */
    public static MemorySegment Altitude(MemorySegment struct) {
        return struct.asSlice(Altitude$OFFSET, Altitude$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR Altitude[1]
     * }
     */
    public static void Altitude(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Altitude$OFFSET, Altitude$LAYOUT.byteSize());
    }

    private static long[] Altitude$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR Altitude[1]
     * }
     */
    public static long[] Altitude$dimensions() {
        return Altitude$DIMS;
    }
    private static final VarHandle Altitude$ELEM_HANDLE = Altitude$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR Altitude[1]
     * }
     */
    public static short Altitude(MemorySegment struct, long index0) {
        return (short)Altitude$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR Altitude[1]
     * }
     */
    public static void Altitude(MemorySegment struct, long index0, short fieldValue) {
        Altitude$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

