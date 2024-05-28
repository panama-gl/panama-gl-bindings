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
 * struct tagBITMAPCOREINFO {
 *     BITMAPCOREHEADER bmciHeader;
 *     RGBTRIPLE bmciColors[1];
 * }
 * }
 */
public class tagBITMAPCOREINFO {

    tagBITMAPCOREINFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagBITMAPCOREHEADER.layout().withName("bmciHeader"),
        MemoryLayout.sequenceLayout(1, tagRGBTRIPLE.layout()).withName("bmciColors"),
        MemoryLayout.paddingLayout(1)
    ).withName("tagBITMAPCOREINFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout bmciHeader$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("bmciHeader"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BITMAPCOREHEADER bmciHeader
     * }
     */
    public static final GroupLayout bmciHeader$layout() {
        return bmciHeader$LAYOUT;
    }

    private static final long bmciHeader$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BITMAPCOREHEADER bmciHeader
     * }
     */
    public static final long bmciHeader$offset() {
        return bmciHeader$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BITMAPCOREHEADER bmciHeader
     * }
     */
    public static MemorySegment bmciHeader(MemorySegment struct) {
        return struct.asSlice(bmciHeader$OFFSET, bmciHeader$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BITMAPCOREHEADER bmciHeader
     * }
     */
    public static void bmciHeader(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bmciHeader$OFFSET, bmciHeader$LAYOUT.byteSize());
    }

    private static final SequenceLayout bmciColors$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("bmciColors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RGBTRIPLE bmciColors[1]
     * }
     */
    public static final SequenceLayout bmciColors$layout() {
        return bmciColors$LAYOUT;
    }

    private static final long bmciColors$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RGBTRIPLE bmciColors[1]
     * }
     */
    public static final long bmciColors$offset() {
        return bmciColors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RGBTRIPLE bmciColors[1]
     * }
     */
    public static MemorySegment bmciColors(MemorySegment struct) {
        return struct.asSlice(bmciColors$OFFSET, bmciColors$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RGBTRIPLE bmciColors[1]
     * }
     */
    public static void bmciColors(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bmciColors$OFFSET, bmciColors$LAYOUT.byteSize());
    }

    private static long[] bmciColors$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * RGBTRIPLE bmciColors[1]
     * }
     */
    public static long[] bmciColors$dimensions() {
        return bmciColors$DIMS;
    }
    private static final MethodHandle bmciColors$ELEM_HANDLE = bmciColors$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * RGBTRIPLE bmciColors[1]
     * }
     */
    public static MemorySegment bmciColors(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)bmciColors$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * RGBTRIPLE bmciColors[1]
     * }
     */
    public static void bmciColors(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, bmciColors(struct, index0), 0L, tagRGBTRIPLE.layout().byteSize());
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

