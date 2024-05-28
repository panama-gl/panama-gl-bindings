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
 * struct tagGCP_RESULTSA {
 *     DWORD lStructSize;
 *     LPSTR lpOutString;
 *     UINT *lpOrder;
 *     int *lpDx;
 *     int *lpCaretPos;
 *     LPSTR lpClass;
 *     LPWSTR lpGlyphs;
 *     UINT nGlyphs;
 *     int nMaxFit;
 * }
 * }
 */
public class tagGCP_RESULTSA {

    tagGCP_RESULTSA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("lStructSize"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("lpOutString"),
        wgl_h.C_POINTER.withName("lpOrder"),
        wgl_h.C_POINTER.withName("lpDx"),
        wgl_h.C_POINTER.withName("lpCaretPos"),
        wgl_h.C_POINTER.withName("lpClass"),
        wgl_h.C_POINTER.withName("lpGlyphs"),
        wgl_h.C_INT.withName("nGlyphs"),
        wgl_h.C_INT.withName("nMaxFit")
    ).withName("tagGCP_RESULTSA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt lStructSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lStructSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static final OfInt lStructSize$layout() {
        return lStructSize$LAYOUT;
    }

    private static final long lStructSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static final long lStructSize$offset() {
        return lStructSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static int lStructSize(MemorySegment struct) {
        return struct.get(lStructSize$LAYOUT, lStructSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static void lStructSize(MemorySegment struct, int fieldValue) {
        struct.set(lStructSize$LAYOUT, lStructSize$OFFSET, fieldValue);
    }

    private static final AddressLayout lpOutString$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpOutString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR lpOutString
     * }
     */
    public static final AddressLayout lpOutString$layout() {
        return lpOutString$LAYOUT;
    }

    private static final long lpOutString$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR lpOutString
     * }
     */
    public static final long lpOutString$offset() {
        return lpOutString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR lpOutString
     * }
     */
    public static MemorySegment lpOutString(MemorySegment struct) {
        return struct.get(lpOutString$LAYOUT, lpOutString$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR lpOutString
     * }
     */
    public static void lpOutString(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpOutString$LAYOUT, lpOutString$OFFSET, fieldValue);
    }

    private static final AddressLayout lpOrder$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpOrder"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT *lpOrder
     * }
     */
    public static final AddressLayout lpOrder$layout() {
        return lpOrder$LAYOUT;
    }

    private static final long lpOrder$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT *lpOrder
     * }
     */
    public static final long lpOrder$offset() {
        return lpOrder$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT *lpOrder
     * }
     */
    public static MemorySegment lpOrder(MemorySegment struct) {
        return struct.get(lpOrder$LAYOUT, lpOrder$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT *lpOrder
     * }
     */
    public static void lpOrder(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpOrder$LAYOUT, lpOrder$OFFSET, fieldValue);
    }

    private static final AddressLayout lpDx$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpDx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int *lpDx
     * }
     */
    public static final AddressLayout lpDx$layout() {
        return lpDx$LAYOUT;
    }

    private static final long lpDx$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int *lpDx
     * }
     */
    public static final long lpDx$offset() {
        return lpDx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int *lpDx
     * }
     */
    public static MemorySegment lpDx(MemorySegment struct) {
        return struct.get(lpDx$LAYOUT, lpDx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int *lpDx
     * }
     */
    public static void lpDx(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpDx$LAYOUT, lpDx$OFFSET, fieldValue);
    }

    private static final AddressLayout lpCaretPos$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpCaretPos"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int *lpCaretPos
     * }
     */
    public static final AddressLayout lpCaretPos$layout() {
        return lpCaretPos$LAYOUT;
    }

    private static final long lpCaretPos$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int *lpCaretPos
     * }
     */
    public static final long lpCaretPos$offset() {
        return lpCaretPos$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int *lpCaretPos
     * }
     */
    public static MemorySegment lpCaretPos(MemorySegment struct) {
        return struct.get(lpCaretPos$LAYOUT, lpCaretPos$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int *lpCaretPos
     * }
     */
    public static void lpCaretPos(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpCaretPos$LAYOUT, lpCaretPos$OFFSET, fieldValue);
    }

    private static final AddressLayout lpClass$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpClass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR lpClass
     * }
     */
    public static final AddressLayout lpClass$layout() {
        return lpClass$LAYOUT;
    }

    private static final long lpClass$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR lpClass
     * }
     */
    public static final long lpClass$offset() {
        return lpClass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR lpClass
     * }
     */
    public static MemorySegment lpClass(MemorySegment struct) {
        return struct.get(lpClass$LAYOUT, lpClass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR lpClass
     * }
     */
    public static void lpClass(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpClass$LAYOUT, lpClass$OFFSET, fieldValue);
    }

    private static final AddressLayout lpGlyphs$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpGlyphs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpGlyphs
     * }
     */
    public static final AddressLayout lpGlyphs$layout() {
        return lpGlyphs$LAYOUT;
    }

    private static final long lpGlyphs$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpGlyphs
     * }
     */
    public static final long lpGlyphs$offset() {
        return lpGlyphs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpGlyphs
     * }
     */
    public static MemorySegment lpGlyphs(MemorySegment struct) {
        return struct.get(lpGlyphs$LAYOUT, lpGlyphs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpGlyphs
     * }
     */
    public static void lpGlyphs(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpGlyphs$LAYOUT, lpGlyphs$OFFSET, fieldValue);
    }

    private static final OfInt nGlyphs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nGlyphs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT nGlyphs
     * }
     */
    public static final OfInt nGlyphs$layout() {
        return nGlyphs$LAYOUT;
    }

    private static final long nGlyphs$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT nGlyphs
     * }
     */
    public static final long nGlyphs$offset() {
        return nGlyphs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT nGlyphs
     * }
     */
    public static int nGlyphs(MemorySegment struct) {
        return struct.get(nGlyphs$LAYOUT, nGlyphs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT nGlyphs
     * }
     */
    public static void nGlyphs(MemorySegment struct, int fieldValue) {
        struct.set(nGlyphs$LAYOUT, nGlyphs$OFFSET, fieldValue);
    }

    private static final OfInt nMaxFit$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nMaxFit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int nMaxFit
     * }
     */
    public static final OfInt nMaxFit$layout() {
        return nMaxFit$LAYOUT;
    }

    private static final long nMaxFit$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int nMaxFit
     * }
     */
    public static final long nMaxFit$offset() {
        return nMaxFit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int nMaxFit
     * }
     */
    public static int nMaxFit(MemorySegment struct) {
        return struct.get(nMaxFit$LAYOUT, nMaxFit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int nMaxFit
     * }
     */
    public static void nMaxFit(MemorySegment struct, int fieldValue) {
        struct.set(nMaxFit$LAYOUT, nMaxFit$OFFSET, fieldValue);
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

