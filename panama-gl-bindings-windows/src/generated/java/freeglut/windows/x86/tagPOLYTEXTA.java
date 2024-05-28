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
 * struct tagPOLYTEXTA {
 *     int x;
 *     int y;
 *     UINT n;
 *     LPCSTR lpstr;
 *     UINT uiFlags;
 *     RECT rcl;
 *     int *pdx;
 * }
 * }
 */
public class tagPOLYTEXTA {

    tagPOLYTEXTA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_INT.withName("x"),
        freeglut_h.C_INT.withName("y"),
        freeglut_h.C_INT.withName("n"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_POINTER.withName("lpstr"),
        freeglut_h.C_INT.withName("uiFlags"),
        tagRECT.layout().withName("rcl"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_POINTER.withName("pdx")
    ).withName("tagPOLYTEXTA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static int x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static void x(MemorySegment struct, int fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static int y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static void y(MemorySegment struct, int fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfInt n$LAYOUT = (OfInt)$LAYOUT.select(groupElement("n"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT n
     * }
     */
    public static final OfInt n$layout() {
        return n$LAYOUT;
    }

    private static final long n$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT n
     * }
     */
    public static final long n$offset() {
        return n$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT n
     * }
     */
    public static int n(MemorySegment struct) {
        return struct.get(n$LAYOUT, n$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT n
     * }
     */
    public static void n(MemorySegment struct, int fieldValue) {
        struct.set(n$LAYOUT, n$OFFSET, fieldValue);
    }

    private static final AddressLayout lpstr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpstr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR lpstr
     * }
     */
    public static final AddressLayout lpstr$layout() {
        return lpstr$LAYOUT;
    }

    private static final long lpstr$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR lpstr
     * }
     */
    public static final long lpstr$offset() {
        return lpstr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR lpstr
     * }
     */
    public static MemorySegment lpstr(MemorySegment struct) {
        return struct.get(lpstr$LAYOUT, lpstr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR lpstr
     * }
     */
    public static void lpstr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpstr$LAYOUT, lpstr$OFFSET, fieldValue);
    }

    private static final OfInt uiFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("uiFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT uiFlags
     * }
     */
    public static final OfInt uiFlags$layout() {
        return uiFlags$LAYOUT;
    }

    private static final long uiFlags$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT uiFlags
     * }
     */
    public static final long uiFlags$offset() {
        return uiFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT uiFlags
     * }
     */
    public static int uiFlags(MemorySegment struct) {
        return struct.get(uiFlags$LAYOUT, uiFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT uiFlags
     * }
     */
    public static void uiFlags(MemorySegment struct, int fieldValue) {
        struct.set(uiFlags$LAYOUT, uiFlags$OFFSET, fieldValue);
    }

    private static final GroupLayout rcl$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rcl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECT rcl
     * }
     */
    public static final GroupLayout rcl$layout() {
        return rcl$LAYOUT;
    }

    private static final long rcl$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECT rcl
     * }
     */
    public static final long rcl$offset() {
        return rcl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECT rcl
     * }
     */
    public static MemorySegment rcl(MemorySegment struct) {
        return struct.asSlice(rcl$OFFSET, rcl$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECT rcl
     * }
     */
    public static void rcl(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rcl$OFFSET, rcl$LAYOUT.byteSize());
    }

    private static final AddressLayout pdx$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pdx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int *pdx
     * }
     */
    public static final AddressLayout pdx$layout() {
        return pdx$LAYOUT;
    }

    private static final long pdx$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int *pdx
     * }
     */
    public static final long pdx$offset() {
        return pdx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int *pdx
     * }
     */
    public static MemorySegment pdx(MemorySegment struct) {
        return struct.get(pdx$LAYOUT, pdx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int *pdx
     * }
     */
    public static void pdx(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pdx$LAYOUT, pdx$OFFSET, fieldValue);
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

