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
 * struct tagWNDCLASSW {
 *     UINT style;
 *     WNDPROC lpfnWndProc;
 *     int cbClsExtra;
 *     int cbWndExtra;
 *     HINSTANCE hInstance;
 *     HICON hIcon;
 *     HCURSOR hCursor;
 *     HBRUSH hbrBackground;
 *     LPCWSTR lpszMenuName;
 *     LPCWSTR lpszClassName;
 * }
 * }
 */
public class tagWNDCLASSW {

    tagWNDCLASSW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_INT.withName("style"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_POINTER.withName("lpfnWndProc"),
        freeglut_h.C_INT.withName("cbClsExtra"),
        freeglut_h.C_INT.withName("cbWndExtra"),
        freeglut_h.C_POINTER.withName("hInstance"),
        freeglut_h.C_POINTER.withName("hIcon"),
        freeglut_h.C_POINTER.withName("hCursor"),
        freeglut_h.C_POINTER.withName("hbrBackground"),
        freeglut_h.C_POINTER.withName("lpszMenuName"),
        freeglut_h.C_POINTER.withName("lpszClassName")
    ).withName("tagWNDCLASSW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt style$LAYOUT = (OfInt)$LAYOUT.select(groupElement("style"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT style
     * }
     */
    public static final OfInt style$layout() {
        return style$LAYOUT;
    }

    private static final long style$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT style
     * }
     */
    public static final long style$offset() {
        return style$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT style
     * }
     */
    public static int style(MemorySegment struct) {
        return struct.get(style$LAYOUT, style$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT style
     * }
     */
    public static void style(MemorySegment struct, int fieldValue) {
        struct.set(style$LAYOUT, style$OFFSET, fieldValue);
    }

    private static final AddressLayout lpfnWndProc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpfnWndProc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WNDPROC lpfnWndProc
     * }
     */
    public static final AddressLayout lpfnWndProc$layout() {
        return lpfnWndProc$LAYOUT;
    }

    private static final long lpfnWndProc$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WNDPROC lpfnWndProc
     * }
     */
    public static final long lpfnWndProc$offset() {
        return lpfnWndProc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WNDPROC lpfnWndProc
     * }
     */
    public static MemorySegment lpfnWndProc(MemorySegment struct) {
        return struct.get(lpfnWndProc$LAYOUT, lpfnWndProc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WNDPROC lpfnWndProc
     * }
     */
    public static void lpfnWndProc(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpfnWndProc$LAYOUT, lpfnWndProc$OFFSET, fieldValue);
    }

    private static final OfInt cbClsExtra$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbClsExtra"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int cbClsExtra
     * }
     */
    public static final OfInt cbClsExtra$layout() {
        return cbClsExtra$LAYOUT;
    }

    private static final long cbClsExtra$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int cbClsExtra
     * }
     */
    public static final long cbClsExtra$offset() {
        return cbClsExtra$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int cbClsExtra
     * }
     */
    public static int cbClsExtra(MemorySegment struct) {
        return struct.get(cbClsExtra$LAYOUT, cbClsExtra$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int cbClsExtra
     * }
     */
    public static void cbClsExtra(MemorySegment struct, int fieldValue) {
        struct.set(cbClsExtra$LAYOUT, cbClsExtra$OFFSET, fieldValue);
    }

    private static final OfInt cbWndExtra$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbWndExtra"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int cbWndExtra
     * }
     */
    public static final OfInt cbWndExtra$layout() {
        return cbWndExtra$LAYOUT;
    }

    private static final long cbWndExtra$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int cbWndExtra
     * }
     */
    public static final long cbWndExtra$offset() {
        return cbWndExtra$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int cbWndExtra
     * }
     */
    public static int cbWndExtra(MemorySegment struct) {
        return struct.get(cbWndExtra$LAYOUT, cbWndExtra$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int cbWndExtra
     * }
     */
    public static void cbWndExtra(MemorySegment struct, int fieldValue) {
        struct.set(cbWndExtra$LAYOUT, cbWndExtra$OFFSET, fieldValue);
    }

    private static final AddressLayout hInstance$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hInstance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static final AddressLayout hInstance$layout() {
        return hInstance$LAYOUT;
    }

    private static final long hInstance$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static final long hInstance$offset() {
        return hInstance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static MemorySegment hInstance(MemorySegment struct) {
        return struct.get(hInstance$LAYOUT, hInstance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static void hInstance(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hInstance$LAYOUT, hInstance$OFFSET, fieldValue);
    }

    private static final AddressLayout hIcon$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hIcon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HICON hIcon
     * }
     */
    public static final AddressLayout hIcon$layout() {
        return hIcon$LAYOUT;
    }

    private static final long hIcon$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HICON hIcon
     * }
     */
    public static final long hIcon$offset() {
        return hIcon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HICON hIcon
     * }
     */
    public static MemorySegment hIcon(MemorySegment struct) {
        return struct.get(hIcon$LAYOUT, hIcon$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HICON hIcon
     * }
     */
    public static void hIcon(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hIcon$LAYOUT, hIcon$OFFSET, fieldValue);
    }

    private static final AddressLayout hCursor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hCursor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCURSOR hCursor
     * }
     */
    public static final AddressLayout hCursor$layout() {
        return hCursor$LAYOUT;
    }

    private static final long hCursor$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCURSOR hCursor
     * }
     */
    public static final long hCursor$offset() {
        return hCursor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCURSOR hCursor
     * }
     */
    public static MemorySegment hCursor(MemorySegment struct) {
        return struct.get(hCursor$LAYOUT, hCursor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCURSOR hCursor
     * }
     */
    public static void hCursor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hCursor$LAYOUT, hCursor$OFFSET, fieldValue);
    }

    private static final AddressLayout hbrBackground$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hbrBackground"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HBRUSH hbrBackground
     * }
     */
    public static final AddressLayout hbrBackground$layout() {
        return hbrBackground$LAYOUT;
    }

    private static final long hbrBackground$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HBRUSH hbrBackground
     * }
     */
    public static final long hbrBackground$offset() {
        return hbrBackground$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HBRUSH hbrBackground
     * }
     */
    public static MemorySegment hbrBackground(MemorySegment struct) {
        return struct.get(hbrBackground$LAYOUT, hbrBackground$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HBRUSH hbrBackground
     * }
     */
    public static void hbrBackground(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hbrBackground$LAYOUT, hbrBackground$OFFSET, fieldValue);
    }

    private static final AddressLayout lpszMenuName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszMenuName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpszMenuName
     * }
     */
    public static final AddressLayout lpszMenuName$layout() {
        return lpszMenuName$LAYOUT;
    }

    private static final long lpszMenuName$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpszMenuName
     * }
     */
    public static final long lpszMenuName$offset() {
        return lpszMenuName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpszMenuName
     * }
     */
    public static MemorySegment lpszMenuName(MemorySegment struct) {
        return struct.get(lpszMenuName$LAYOUT, lpszMenuName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpszMenuName
     * }
     */
    public static void lpszMenuName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszMenuName$LAYOUT, lpszMenuName$OFFSET, fieldValue);
    }

    private static final AddressLayout lpszClassName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszClassName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpszClassName
     * }
     */
    public static final AddressLayout lpszClassName$layout() {
        return lpszClassName$LAYOUT;
    }

    private static final long lpszClassName$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpszClassName
     * }
     */
    public static final long lpszClassName$offset() {
        return lpszClassName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpszClassName
     * }
     */
    public static MemorySegment lpszClassName(MemorySegment struct) {
        return struct.get(lpszClassName$LAYOUT, lpszClassName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpszClassName
     * }
     */
    public static void lpszClassName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszClassName$LAYOUT, lpszClassName$OFFSET, fieldValue);
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

