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
 * struct {
 *     INT cDig;
 *     ULONG dwInFlags;
 *     ULONG dwOutFlags;
 *     INT cchUsed;
 *     INT nBaseShift;
 *     INT nPwr10;
 * }
 * }
 */
public class NUMPARSE {

    NUMPARSE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_INT.withName("cDig"),
        wgl_h.C_LONG.withName("dwInFlags"),
        wgl_h.C_LONG.withName("dwOutFlags"),
        wgl_h.C_INT.withName("cchUsed"),
        wgl_h.C_INT.withName("nBaseShift"),
        wgl_h.C_INT.withName("nPwr10")
    ).withName("$anon$735:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cDig$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cDig"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT cDig
     * }
     */
    public static final OfInt cDig$layout() {
        return cDig$LAYOUT;
    }

    private static final long cDig$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT cDig
     * }
     */
    public static final long cDig$offset() {
        return cDig$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT cDig
     * }
     */
    public static int cDig(MemorySegment struct) {
        return struct.get(cDig$LAYOUT, cDig$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT cDig
     * }
     */
    public static void cDig(MemorySegment struct, int fieldValue) {
        struct.set(cDig$LAYOUT, cDig$OFFSET, fieldValue);
    }

    private static final OfInt dwInFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwInFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwInFlags
     * }
     */
    public static final OfInt dwInFlags$layout() {
        return dwInFlags$LAYOUT;
    }

    private static final long dwInFlags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwInFlags
     * }
     */
    public static final long dwInFlags$offset() {
        return dwInFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwInFlags
     * }
     */
    public static int dwInFlags(MemorySegment struct) {
        return struct.get(dwInFlags$LAYOUT, dwInFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwInFlags
     * }
     */
    public static void dwInFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwInFlags$LAYOUT, dwInFlags$OFFSET, fieldValue);
    }

    private static final OfInt dwOutFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwOutFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwOutFlags
     * }
     */
    public static final OfInt dwOutFlags$layout() {
        return dwOutFlags$LAYOUT;
    }

    private static final long dwOutFlags$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwOutFlags
     * }
     */
    public static final long dwOutFlags$offset() {
        return dwOutFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwOutFlags
     * }
     */
    public static int dwOutFlags(MemorySegment struct) {
        return struct.get(dwOutFlags$LAYOUT, dwOutFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwOutFlags
     * }
     */
    public static void dwOutFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwOutFlags$LAYOUT, dwOutFlags$OFFSET, fieldValue);
    }

    private static final OfInt cchUsed$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cchUsed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT cchUsed
     * }
     */
    public static final OfInt cchUsed$layout() {
        return cchUsed$LAYOUT;
    }

    private static final long cchUsed$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT cchUsed
     * }
     */
    public static final long cchUsed$offset() {
        return cchUsed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT cchUsed
     * }
     */
    public static int cchUsed(MemorySegment struct) {
        return struct.get(cchUsed$LAYOUT, cchUsed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT cchUsed
     * }
     */
    public static void cchUsed(MemorySegment struct, int fieldValue) {
        struct.set(cchUsed$LAYOUT, cchUsed$OFFSET, fieldValue);
    }

    private static final OfInt nBaseShift$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nBaseShift"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT nBaseShift
     * }
     */
    public static final OfInt nBaseShift$layout() {
        return nBaseShift$LAYOUT;
    }

    private static final long nBaseShift$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT nBaseShift
     * }
     */
    public static final long nBaseShift$offset() {
        return nBaseShift$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT nBaseShift
     * }
     */
    public static int nBaseShift(MemorySegment struct) {
        return struct.get(nBaseShift$LAYOUT, nBaseShift$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT nBaseShift
     * }
     */
    public static void nBaseShift(MemorySegment struct, int fieldValue) {
        struct.set(nBaseShift$LAYOUT, nBaseShift$OFFSET, fieldValue);
    }

    private static final OfInt nPwr10$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nPwr10"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT nPwr10
     * }
     */
    public static final OfInt nPwr10$layout() {
        return nPwr10$LAYOUT;
    }

    private static final long nPwr10$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT nPwr10
     * }
     */
    public static final long nPwr10$offset() {
        return nPwr10$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT nPwr10
     * }
     */
    public static int nPwr10(MemorySegment struct) {
        return struct.get(nPwr10$LAYOUT, nPwr10$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT nPwr10
     * }
     */
    public static void nPwr10(MemorySegment struct, int fieldValue) {
        struct.set(nPwr10$LAYOUT, nPwr10$OFFSET, fieldValue);
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

