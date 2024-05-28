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
 * struct _SHFILEOPSTRUCTA {
 *     HWND hwnd;
 *     UINT wFunc;
 *     PCZZSTR pFrom;
 *     PCZZSTR pTo;
 *     FILEOP_FLAGS fFlags;
 *     BOOL fAnyOperationsAborted;
 *     LPVOID hNameMappings;
 *     PCSTR lpszProgressTitle;
 * }
 * }
 */
public class _SHFILEOPSTRUCTA {

    _SHFILEOPSTRUCTA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_POINTER.withName("hwnd"),
        wgl_h.C_INT.withName("wFunc"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pFrom"),
        wgl_h.C_POINTER.withName("pTo"),
        wgl_h.C_SHORT.withName("fFlags"),
        MemoryLayout.paddingLayout(2),
        wgl_h.C_INT.withName("fAnyOperationsAborted"),
        wgl_h.C_POINTER.withName("hNameMappings"),
        wgl_h.C_POINTER.withName("lpszProgressTitle")
    ).withName("_SHFILEOPSTRUCTA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout hwnd$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwnd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static final AddressLayout hwnd$layout() {
        return hwnd$LAYOUT;
    }

    private static final long hwnd$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static final long hwnd$offset() {
        return hwnd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static MemorySegment hwnd(MemorySegment struct) {
        return struct.get(hwnd$LAYOUT, hwnd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static void hwnd(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwnd$LAYOUT, hwnd$OFFSET, fieldValue);
    }

    private static final OfInt wFunc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wFunc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT wFunc
     * }
     */
    public static final OfInt wFunc$layout() {
        return wFunc$LAYOUT;
    }

    private static final long wFunc$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT wFunc
     * }
     */
    public static final long wFunc$offset() {
        return wFunc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT wFunc
     * }
     */
    public static int wFunc(MemorySegment struct) {
        return struct.get(wFunc$LAYOUT, wFunc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT wFunc
     * }
     */
    public static void wFunc(MemorySegment struct, int fieldValue) {
        struct.set(wFunc$LAYOUT, wFunc$OFFSET, fieldValue);
    }

    private static final AddressLayout pFrom$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pFrom"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCZZSTR pFrom
     * }
     */
    public static final AddressLayout pFrom$layout() {
        return pFrom$LAYOUT;
    }

    private static final long pFrom$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCZZSTR pFrom
     * }
     */
    public static final long pFrom$offset() {
        return pFrom$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCZZSTR pFrom
     * }
     */
    public static MemorySegment pFrom(MemorySegment struct) {
        return struct.get(pFrom$LAYOUT, pFrom$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCZZSTR pFrom
     * }
     */
    public static void pFrom(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pFrom$LAYOUT, pFrom$OFFSET, fieldValue);
    }

    private static final AddressLayout pTo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pTo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCZZSTR pTo
     * }
     */
    public static final AddressLayout pTo$layout() {
        return pTo$LAYOUT;
    }

    private static final long pTo$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCZZSTR pTo
     * }
     */
    public static final long pTo$offset() {
        return pTo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCZZSTR pTo
     * }
     */
    public static MemorySegment pTo(MemorySegment struct) {
        return struct.get(pTo$LAYOUT, pTo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCZZSTR pTo
     * }
     */
    public static void pTo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pTo$LAYOUT, pTo$OFFSET, fieldValue);
    }

    private static final OfShort fFlags$LAYOUT = (OfShort)$LAYOUT.select(groupElement("fFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILEOP_FLAGS fFlags
     * }
     */
    public static final OfShort fFlags$layout() {
        return fFlags$LAYOUT;
    }

    private static final long fFlags$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILEOP_FLAGS fFlags
     * }
     */
    public static final long fFlags$offset() {
        return fFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILEOP_FLAGS fFlags
     * }
     */
    public static short fFlags(MemorySegment struct) {
        return struct.get(fFlags$LAYOUT, fFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILEOP_FLAGS fFlags
     * }
     */
    public static void fFlags(MemorySegment struct, short fieldValue) {
        struct.set(fFlags$LAYOUT, fFlags$OFFSET, fieldValue);
    }

    private static final OfInt fAnyOperationsAborted$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fAnyOperationsAborted"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fAnyOperationsAborted
     * }
     */
    public static final OfInt fAnyOperationsAborted$layout() {
        return fAnyOperationsAborted$LAYOUT;
    }

    private static final long fAnyOperationsAborted$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fAnyOperationsAborted
     * }
     */
    public static final long fAnyOperationsAborted$offset() {
        return fAnyOperationsAborted$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fAnyOperationsAborted
     * }
     */
    public static int fAnyOperationsAborted(MemorySegment struct) {
        return struct.get(fAnyOperationsAborted$LAYOUT, fAnyOperationsAborted$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fAnyOperationsAborted
     * }
     */
    public static void fAnyOperationsAborted(MemorySegment struct, int fieldValue) {
        struct.set(fAnyOperationsAborted$LAYOUT, fAnyOperationsAborted$OFFSET, fieldValue);
    }

    private static final AddressLayout hNameMappings$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hNameMappings"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID hNameMappings
     * }
     */
    public static final AddressLayout hNameMappings$layout() {
        return hNameMappings$LAYOUT;
    }

    private static final long hNameMappings$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID hNameMappings
     * }
     */
    public static final long hNameMappings$offset() {
        return hNameMappings$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID hNameMappings
     * }
     */
    public static MemorySegment hNameMappings(MemorySegment struct) {
        return struct.get(hNameMappings$LAYOUT, hNameMappings$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID hNameMappings
     * }
     */
    public static void hNameMappings(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hNameMappings$LAYOUT, hNameMappings$OFFSET, fieldValue);
    }

    private static final AddressLayout lpszProgressTitle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszProgressTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCSTR lpszProgressTitle
     * }
     */
    public static final AddressLayout lpszProgressTitle$layout() {
        return lpszProgressTitle$LAYOUT;
    }

    private static final long lpszProgressTitle$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCSTR lpszProgressTitle
     * }
     */
    public static final long lpszProgressTitle$offset() {
        return lpszProgressTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCSTR lpszProgressTitle
     * }
     */
    public static MemorySegment lpszProgressTitle(MemorySegment struct) {
        return struct.get(lpszProgressTitle$LAYOUT, lpszProgressTitle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCSTR lpszProgressTitle
     * }
     */
    public static void lpszProgressTitle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszProgressTitle$LAYOUT, lpszProgressTitle$OFFSET, fieldValue);
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

