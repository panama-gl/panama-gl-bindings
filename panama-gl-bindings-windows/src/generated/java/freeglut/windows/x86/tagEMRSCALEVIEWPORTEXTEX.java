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
 * struct tagEMRSCALEVIEWPORTEXTEX {
 *     EMR emr;
 *     LONG xNum;
 *     LONG xDenom;
 *     LONG yNum;
 *     LONG yDenom;
 * }
 * }
 */
public class tagEMRSCALEVIEWPORTEXTEX {

    tagEMRSCALEVIEWPORTEXTEX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagEMR.layout().withName("emr"),
        freeglut_h.C_LONG.withName("xNum"),
        freeglut_h.C_LONG.withName("xDenom"),
        freeglut_h.C_LONG.withName("yNum"),
        freeglut_h.C_LONG.withName("yDenom")
    ).withName("tagEMRSCALEVIEWPORTEXTEX");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout emr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("emr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final GroupLayout emr$layout() {
        return emr$LAYOUT;
    }

    private static final long emr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final long emr$offset() {
        return emr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static MemorySegment emr(MemorySegment struct) {
        return struct.asSlice(emr$OFFSET, emr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static void emr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, emr$OFFSET, emr$LAYOUT.byteSize());
    }

    private static final OfInt xNum$LAYOUT = (OfInt)$LAYOUT.select(groupElement("xNum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG xNum
     * }
     */
    public static final OfInt xNum$layout() {
        return xNum$LAYOUT;
    }

    private static final long xNum$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG xNum
     * }
     */
    public static final long xNum$offset() {
        return xNum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG xNum
     * }
     */
    public static int xNum(MemorySegment struct) {
        return struct.get(xNum$LAYOUT, xNum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG xNum
     * }
     */
    public static void xNum(MemorySegment struct, int fieldValue) {
        struct.set(xNum$LAYOUT, xNum$OFFSET, fieldValue);
    }

    private static final OfInt xDenom$LAYOUT = (OfInt)$LAYOUT.select(groupElement("xDenom"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG xDenom
     * }
     */
    public static final OfInt xDenom$layout() {
        return xDenom$LAYOUT;
    }

    private static final long xDenom$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG xDenom
     * }
     */
    public static final long xDenom$offset() {
        return xDenom$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG xDenom
     * }
     */
    public static int xDenom(MemorySegment struct) {
        return struct.get(xDenom$LAYOUT, xDenom$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG xDenom
     * }
     */
    public static void xDenom(MemorySegment struct, int fieldValue) {
        struct.set(xDenom$LAYOUT, xDenom$OFFSET, fieldValue);
    }

    private static final OfInt yNum$LAYOUT = (OfInt)$LAYOUT.select(groupElement("yNum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG yNum
     * }
     */
    public static final OfInt yNum$layout() {
        return yNum$LAYOUT;
    }

    private static final long yNum$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG yNum
     * }
     */
    public static final long yNum$offset() {
        return yNum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG yNum
     * }
     */
    public static int yNum(MemorySegment struct) {
        return struct.get(yNum$LAYOUT, yNum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG yNum
     * }
     */
    public static void yNum(MemorySegment struct, int fieldValue) {
        struct.set(yNum$LAYOUT, yNum$OFFSET, fieldValue);
    }

    private static final OfInt yDenom$LAYOUT = (OfInt)$LAYOUT.select(groupElement("yDenom"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG yDenom
     * }
     */
    public static final OfInt yDenom$layout() {
        return yDenom$LAYOUT;
    }

    private static final long yDenom$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG yDenom
     * }
     */
    public static final long yDenom$offset() {
        return yDenom$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG yDenom
     * }
     */
    public static int yDenom(MemorySegment struct) {
        return struct.get(yDenom$LAYOUT, yDenom$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG yDenom
     * }
     */
    public static void yDenom(MemorySegment struct, int fieldValue) {
        struct.set(yDenom$LAYOUT, yDenom$OFFSET, fieldValue);
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

