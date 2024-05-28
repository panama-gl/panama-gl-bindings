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
 * struct tagEMRCREATECOLORSPACEW {
 *     EMR emr;
 *     DWORD ihCS;
 *     LOGCOLORSPACEW lcs;
 *     DWORD dwFlags;
 *     DWORD cbData;
 *     BYTE Data[1];
 * }
 * }
 */
public class tagEMRCREATECOLORSPACEW {

    tagEMRCREATECOLORSPACEW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagEMR.layout().withName("emr"),
        freeglut_h.C_LONG.withName("ihCS"),
        tagLOGCOLORSPACEW.layout().withName("lcs"),
        freeglut_h.C_LONG.withName("dwFlags"),
        freeglut_h.C_LONG.withName("cbData"),
        MemoryLayout.sequenceLayout(1, freeglut_h.C_CHAR).withName("Data"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagEMRCREATECOLORSPACEW");

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

    private static final OfInt ihCS$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ihCS"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ihCS
     * }
     */
    public static final OfInt ihCS$layout() {
        return ihCS$LAYOUT;
    }

    private static final long ihCS$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ihCS
     * }
     */
    public static final long ihCS$offset() {
        return ihCS$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ihCS
     * }
     */
    public static int ihCS(MemorySegment struct) {
        return struct.get(ihCS$LAYOUT, ihCS$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ihCS
     * }
     */
    public static void ihCS(MemorySegment struct, int fieldValue) {
        struct.set(ihCS$LAYOUT, ihCS$OFFSET, fieldValue);
    }

    private static final GroupLayout lcs$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("lcs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LOGCOLORSPACEW lcs
     * }
     */
    public static final GroupLayout lcs$layout() {
        return lcs$LAYOUT;
    }

    private static final long lcs$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LOGCOLORSPACEW lcs
     * }
     */
    public static final long lcs$offset() {
        return lcs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LOGCOLORSPACEW lcs
     * }
     */
    public static MemorySegment lcs(MemorySegment struct) {
        return struct.asSlice(lcs$OFFSET, lcs$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LOGCOLORSPACEW lcs
     * }
     */
    public static void lcs(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lcs$OFFSET, lcs$LAYOUT.byteSize());
    }

    private static final OfInt dwFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final OfInt dwFlags$layout() {
        return dwFlags$LAYOUT;
    }

    private static final long dwFlags$OFFSET = 600;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final long dwFlags$offset() {
        return dwFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static int dwFlags(MemorySegment struct) {
        return struct.get(dwFlags$LAYOUT, dwFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static void dwFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwFlags$LAYOUT, dwFlags$OFFSET, fieldValue);
    }

    private static final OfInt cbData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbData
     * }
     */
    public static final OfInt cbData$layout() {
        return cbData$LAYOUT;
    }

    private static final long cbData$OFFSET = 604;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbData
     * }
     */
    public static final long cbData$offset() {
        return cbData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbData
     * }
     */
    public static int cbData(MemorySegment struct) {
        return struct.get(cbData$LAYOUT, cbData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbData
     * }
     */
    public static void cbData(MemorySegment struct, int fieldValue) {
        struct.set(cbData$LAYOUT, cbData$OFFSET, fieldValue);
    }

    private static final SequenceLayout Data$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Data[1]
     * }
     */
    public static final SequenceLayout Data$layout() {
        return Data$LAYOUT;
    }

    private static final long Data$OFFSET = 608;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Data[1]
     * }
     */
    public static final long Data$offset() {
        return Data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Data[1]
     * }
     */
    public static MemorySegment Data(MemorySegment struct) {
        return struct.asSlice(Data$OFFSET, Data$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Data[1]
     * }
     */
    public static void Data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Data$OFFSET, Data$LAYOUT.byteSize());
    }

    private static long[] Data$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Data[1]
     * }
     */
    public static long[] Data$dimensions() {
        return Data$DIMS;
    }
    private static final VarHandle Data$ELEM_HANDLE = Data$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Data[1]
     * }
     */
    public static byte Data(MemorySegment struct, long index0) {
        return (byte)Data$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Data[1]
     * }
     */
    public static void Data(MemorySegment struct, long index0, byte fieldValue) {
        Data$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

