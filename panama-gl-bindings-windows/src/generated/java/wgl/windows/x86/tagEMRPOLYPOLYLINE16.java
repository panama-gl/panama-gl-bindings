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
 * struct tagEMRPOLYPOLYLINE16 {
 *     EMR emr;
 *     RECTL rclBounds;
 *     DWORD nPolys;
 *     DWORD cpts;
 *     DWORD aPolyCounts[1];
 *     POINTS apts[1];
 * }
 * }
 */
public class tagEMRPOLYPOLYLINE16 {

    tagEMRPOLYPOLYLINE16() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagEMR.layout().withName("emr"),
        _RECTL.layout().withName("rclBounds"),
        wgl_h.C_LONG.withName("nPolys"),
        wgl_h.C_LONG.withName("cpts"),
        MemoryLayout.sequenceLayout(1, wgl_h.C_LONG).withName("aPolyCounts"),
        MemoryLayout.sequenceLayout(1, tagPOINTS.layout()).withName("apts")
    ).withName("tagEMRPOLYPOLYLINE16");

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

    private static final GroupLayout rclBounds$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rclBounds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static final GroupLayout rclBounds$layout() {
        return rclBounds$LAYOUT;
    }

    private static final long rclBounds$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static final long rclBounds$offset() {
        return rclBounds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static MemorySegment rclBounds(MemorySegment struct) {
        return struct.asSlice(rclBounds$OFFSET, rclBounds$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static void rclBounds(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rclBounds$OFFSET, rclBounds$LAYOUT.byteSize());
    }

    private static final OfInt nPolys$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nPolys"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nPolys
     * }
     */
    public static final OfInt nPolys$layout() {
        return nPolys$LAYOUT;
    }

    private static final long nPolys$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nPolys
     * }
     */
    public static final long nPolys$offset() {
        return nPolys$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nPolys
     * }
     */
    public static int nPolys(MemorySegment struct) {
        return struct.get(nPolys$LAYOUT, nPolys$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nPolys
     * }
     */
    public static void nPolys(MemorySegment struct, int fieldValue) {
        struct.set(nPolys$LAYOUT, nPolys$OFFSET, fieldValue);
    }

    private static final OfInt cpts$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cpts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cpts
     * }
     */
    public static final OfInt cpts$layout() {
        return cpts$LAYOUT;
    }

    private static final long cpts$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cpts
     * }
     */
    public static final long cpts$offset() {
        return cpts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cpts
     * }
     */
    public static int cpts(MemorySegment struct) {
        return struct.get(cpts$LAYOUT, cpts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cpts
     * }
     */
    public static void cpts(MemorySegment struct, int fieldValue) {
        struct.set(cpts$LAYOUT, cpts$OFFSET, fieldValue);
    }

    private static final SequenceLayout aPolyCounts$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("aPolyCounts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD aPolyCounts[1]
     * }
     */
    public static final SequenceLayout aPolyCounts$layout() {
        return aPolyCounts$LAYOUT;
    }

    private static final long aPolyCounts$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD aPolyCounts[1]
     * }
     */
    public static final long aPolyCounts$offset() {
        return aPolyCounts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD aPolyCounts[1]
     * }
     */
    public static MemorySegment aPolyCounts(MemorySegment struct) {
        return struct.asSlice(aPolyCounts$OFFSET, aPolyCounts$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD aPolyCounts[1]
     * }
     */
    public static void aPolyCounts(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, aPolyCounts$OFFSET, aPolyCounts$LAYOUT.byteSize());
    }

    private static long[] aPolyCounts$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD aPolyCounts[1]
     * }
     */
    public static long[] aPolyCounts$dimensions() {
        return aPolyCounts$DIMS;
    }
    private static final VarHandle aPolyCounts$ELEM_HANDLE = aPolyCounts$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD aPolyCounts[1]
     * }
     */
    public static int aPolyCounts(MemorySegment struct, long index0) {
        return (int)aPolyCounts$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD aPolyCounts[1]
     * }
     */
    public static void aPolyCounts(MemorySegment struct, long index0, int fieldValue) {
        aPolyCounts$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout apts$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("apts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTS apts[1]
     * }
     */
    public static final SequenceLayout apts$layout() {
        return apts$LAYOUT;
    }

    private static final long apts$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTS apts[1]
     * }
     */
    public static final long apts$offset() {
        return apts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTS apts[1]
     * }
     */
    public static MemorySegment apts(MemorySegment struct) {
        return struct.asSlice(apts$OFFSET, apts$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTS apts[1]
     * }
     */
    public static void apts(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, apts$OFFSET, apts$LAYOUT.byteSize());
    }

    private static long[] apts$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * POINTS apts[1]
     * }
     */
    public static long[] apts$dimensions() {
        return apts$DIMS;
    }
    private static final MethodHandle apts$ELEM_HANDLE = apts$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * POINTS apts[1]
     * }
     */
    public static MemorySegment apts(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)apts$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * POINTS apts[1]
     * }
     */
    public static void apts(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, apts(struct, index0), 0L, tagPOINTS.layout().byteSize());
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

