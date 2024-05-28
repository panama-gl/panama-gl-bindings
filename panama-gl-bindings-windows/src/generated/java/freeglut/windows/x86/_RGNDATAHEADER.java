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
 * struct _RGNDATAHEADER {
 *     DWORD dwSize;
 *     DWORD iType;
 *     DWORD nCount;
 *     DWORD nRgnSize;
 *     RECT rcBound;
 * }
 * }
 */
public class _RGNDATAHEADER {

    _RGNDATAHEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("dwSize"),
        freeglut_h.C_LONG.withName("iType"),
        freeglut_h.C_LONG.withName("nCount"),
        freeglut_h.C_LONG.withName("nRgnSize"),
        tagRECT.layout().withName("rcBound")
    ).withName("_RGNDATAHEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static final OfInt dwSize$layout() {
        return dwSize$LAYOUT;
    }

    private static final long dwSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static final long dwSize$offset() {
        return dwSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static int dwSize(MemorySegment struct) {
        return struct.get(dwSize$LAYOUT, dwSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static void dwSize(MemorySegment struct, int fieldValue) {
        struct.set(dwSize$LAYOUT, dwSize$OFFSET, fieldValue);
    }

    private static final OfInt iType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD iType
     * }
     */
    public static final OfInt iType$layout() {
        return iType$LAYOUT;
    }

    private static final long iType$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD iType
     * }
     */
    public static final long iType$offset() {
        return iType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD iType
     * }
     */
    public static int iType(MemorySegment struct) {
        return struct.get(iType$LAYOUT, iType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD iType
     * }
     */
    public static void iType(MemorySegment struct, int fieldValue) {
        struct.set(iType$LAYOUT, iType$OFFSET, fieldValue);
    }

    private static final OfInt nCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nCount
     * }
     */
    public static final OfInt nCount$layout() {
        return nCount$LAYOUT;
    }

    private static final long nCount$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nCount
     * }
     */
    public static final long nCount$offset() {
        return nCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nCount
     * }
     */
    public static int nCount(MemorySegment struct) {
        return struct.get(nCount$LAYOUT, nCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nCount
     * }
     */
    public static void nCount(MemorySegment struct, int fieldValue) {
        struct.set(nCount$LAYOUT, nCount$OFFSET, fieldValue);
    }

    private static final OfInt nRgnSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nRgnSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nRgnSize
     * }
     */
    public static final OfInt nRgnSize$layout() {
        return nRgnSize$LAYOUT;
    }

    private static final long nRgnSize$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nRgnSize
     * }
     */
    public static final long nRgnSize$offset() {
        return nRgnSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nRgnSize
     * }
     */
    public static int nRgnSize(MemorySegment struct) {
        return struct.get(nRgnSize$LAYOUT, nRgnSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nRgnSize
     * }
     */
    public static void nRgnSize(MemorySegment struct, int fieldValue) {
        struct.set(nRgnSize$LAYOUT, nRgnSize$OFFSET, fieldValue);
    }

    private static final GroupLayout rcBound$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rcBound"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECT rcBound
     * }
     */
    public static final GroupLayout rcBound$layout() {
        return rcBound$LAYOUT;
    }

    private static final long rcBound$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECT rcBound
     * }
     */
    public static final long rcBound$offset() {
        return rcBound$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECT rcBound
     * }
     */
    public static MemorySegment rcBound(MemorySegment struct) {
        return struct.asSlice(rcBound$OFFSET, rcBound$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECT rcBound
     * }
     */
    public static void rcBound(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rcBound$OFFSET, rcBound$LAYOUT.byteSize());
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

