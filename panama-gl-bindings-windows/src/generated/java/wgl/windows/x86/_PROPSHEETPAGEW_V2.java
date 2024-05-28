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
 * struct _PROPSHEETPAGEW_V2 {
 *     DWORD dwSize;
 *     DWORD dwFlags;
 *     HINSTANCE hInstance;
 *     union {
 *         LPCWSTR pszTemplate;
 *         PROPSHEETPAGE_RESOURCE pResource;
 *     };
 *     union {
 *         HICON hIcon;
 *         LPCWSTR pszIcon;
 *     };
 *     LPCWSTR pszTitle;
 *     DLGPROC pfnDlgProc;
 *     LPARAM lParam;
 *     LPFNPSPCALLBACKW pfnCallback;
 *     UINT *pcRefParent;
 *     LPCWSTR pszHeaderTitle;
 *     LPCWSTR pszHeaderSubTitle;
 * }
 * }
 */
public class _PROPSHEETPAGEW_V2 {

    _PROPSHEETPAGEW_V2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwSize"),
        wgl_h.C_LONG.withName("dwFlags"),
        wgl_h.C_POINTER.withName("hInstance"),
        MemoryLayout.unionLayout(
            wgl_h.C_POINTER.withName("pszTemplate"),
            wgl_h.C_POINTER.withName("pResource")
        ).withName("$anon$250:5"),
        MemoryLayout.unionLayout(
            wgl_h.C_POINTER.withName("hIcon"),
            wgl_h.C_POINTER.withName("pszIcon")
        ).withName("$anon$250:5"),
        wgl_h.C_POINTER.withName("pszTitle"),
        wgl_h.C_POINTER.withName("pfnDlgProc"),
        wgl_h.C_LONG_LONG.withName("lParam"),
        wgl_h.C_POINTER.withName("pfnCallback"),
        wgl_h.C_POINTER.withName("pcRefParent"),
        wgl_h.C_POINTER.withName("pszHeaderTitle"),
        wgl_h.C_POINTER.withName("pszHeaderSubTitle")
    ).withName("_PROPSHEETPAGEW_V2");

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

    private static final long dwFlags$OFFSET = 4;

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

    private static final long hInstance$OFFSET = 8;

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

    private static final AddressLayout pszTemplate$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$250:5"), groupElement("pszTemplate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pszTemplate
     * }
     */
    public static final AddressLayout pszTemplate$layout() {
        return pszTemplate$LAYOUT;
    }

    private static final long pszTemplate$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pszTemplate
     * }
     */
    public static final long pszTemplate$offset() {
        return pszTemplate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pszTemplate
     * }
     */
    public static MemorySegment pszTemplate(MemorySegment struct) {
        return struct.get(pszTemplate$LAYOUT, pszTemplate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pszTemplate
     * }
     */
    public static void pszTemplate(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszTemplate$LAYOUT, pszTemplate$OFFSET, fieldValue);
    }

    private static final AddressLayout pResource$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$250:5"), groupElement("pResource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PROPSHEETPAGE_RESOURCE pResource
     * }
     */
    public static final AddressLayout pResource$layout() {
        return pResource$LAYOUT;
    }

    private static final long pResource$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PROPSHEETPAGE_RESOURCE pResource
     * }
     */
    public static final long pResource$offset() {
        return pResource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PROPSHEETPAGE_RESOURCE pResource
     * }
     */
    public static MemorySegment pResource(MemorySegment struct) {
        return struct.get(pResource$LAYOUT, pResource$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PROPSHEETPAGE_RESOURCE pResource
     * }
     */
    public static void pResource(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pResource$LAYOUT, pResource$OFFSET, fieldValue);
    }

    private static final AddressLayout hIcon$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$250:5"), groupElement("hIcon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HICON hIcon
     * }
     */
    public static final AddressLayout hIcon$layout() {
        return hIcon$LAYOUT;
    }

    private static final long hIcon$OFFSET = 24;

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

    private static final AddressLayout pszIcon$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$250:5"), groupElement("pszIcon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pszIcon
     * }
     */
    public static final AddressLayout pszIcon$layout() {
        return pszIcon$LAYOUT;
    }

    private static final long pszIcon$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pszIcon
     * }
     */
    public static final long pszIcon$offset() {
        return pszIcon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pszIcon
     * }
     */
    public static MemorySegment pszIcon(MemorySegment struct) {
        return struct.get(pszIcon$LAYOUT, pszIcon$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pszIcon
     * }
     */
    public static void pszIcon(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszIcon$LAYOUT, pszIcon$OFFSET, fieldValue);
    }

    private static final AddressLayout pszTitle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pszTitle
     * }
     */
    public static final AddressLayout pszTitle$layout() {
        return pszTitle$LAYOUT;
    }

    private static final long pszTitle$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pszTitle
     * }
     */
    public static final long pszTitle$offset() {
        return pszTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pszTitle
     * }
     */
    public static MemorySegment pszTitle(MemorySegment struct) {
        return struct.get(pszTitle$LAYOUT, pszTitle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pszTitle
     * }
     */
    public static void pszTitle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszTitle$LAYOUT, pszTitle$OFFSET, fieldValue);
    }

    private static final AddressLayout pfnDlgProc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pfnDlgProc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DLGPROC pfnDlgProc
     * }
     */
    public static final AddressLayout pfnDlgProc$layout() {
        return pfnDlgProc$LAYOUT;
    }

    private static final long pfnDlgProc$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DLGPROC pfnDlgProc
     * }
     */
    public static final long pfnDlgProc$offset() {
        return pfnDlgProc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DLGPROC pfnDlgProc
     * }
     */
    public static MemorySegment pfnDlgProc(MemorySegment struct) {
        return struct.get(pfnDlgProc$LAYOUT, pfnDlgProc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DLGPROC pfnDlgProc
     * }
     */
    public static void pfnDlgProc(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pfnDlgProc$LAYOUT, pfnDlgProc$OFFSET, fieldValue);
    }

    private static final OfLong lParam$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lParam"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPARAM lParam
     * }
     */
    public static final OfLong lParam$layout() {
        return lParam$LAYOUT;
    }

    private static final long lParam$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPARAM lParam
     * }
     */
    public static final long lParam$offset() {
        return lParam$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPARAM lParam
     * }
     */
    public static long lParam(MemorySegment struct) {
        return struct.get(lParam$LAYOUT, lParam$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPARAM lParam
     * }
     */
    public static void lParam(MemorySegment struct, long fieldValue) {
        struct.set(lParam$LAYOUT, lParam$OFFSET, fieldValue);
    }

    private static final AddressLayout pfnCallback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pfnCallback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPFNPSPCALLBACKW pfnCallback
     * }
     */
    public static final AddressLayout pfnCallback$layout() {
        return pfnCallback$LAYOUT;
    }

    private static final long pfnCallback$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPFNPSPCALLBACKW pfnCallback
     * }
     */
    public static final long pfnCallback$offset() {
        return pfnCallback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPFNPSPCALLBACKW pfnCallback
     * }
     */
    public static MemorySegment pfnCallback(MemorySegment struct) {
        return struct.get(pfnCallback$LAYOUT, pfnCallback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPFNPSPCALLBACKW pfnCallback
     * }
     */
    public static void pfnCallback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pfnCallback$LAYOUT, pfnCallback$OFFSET, fieldValue);
    }

    private static final AddressLayout pcRefParent$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pcRefParent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT *pcRefParent
     * }
     */
    public static final AddressLayout pcRefParent$layout() {
        return pcRefParent$LAYOUT;
    }

    private static final long pcRefParent$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT *pcRefParent
     * }
     */
    public static final long pcRefParent$offset() {
        return pcRefParent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT *pcRefParent
     * }
     */
    public static MemorySegment pcRefParent(MemorySegment struct) {
        return struct.get(pcRefParent$LAYOUT, pcRefParent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT *pcRefParent
     * }
     */
    public static void pcRefParent(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pcRefParent$LAYOUT, pcRefParent$OFFSET, fieldValue);
    }

    private static final AddressLayout pszHeaderTitle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszHeaderTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pszHeaderTitle
     * }
     */
    public static final AddressLayout pszHeaderTitle$layout() {
        return pszHeaderTitle$LAYOUT;
    }

    private static final long pszHeaderTitle$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pszHeaderTitle
     * }
     */
    public static final long pszHeaderTitle$offset() {
        return pszHeaderTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pszHeaderTitle
     * }
     */
    public static MemorySegment pszHeaderTitle(MemorySegment struct) {
        return struct.get(pszHeaderTitle$LAYOUT, pszHeaderTitle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pszHeaderTitle
     * }
     */
    public static void pszHeaderTitle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszHeaderTitle$LAYOUT, pszHeaderTitle$OFFSET, fieldValue);
    }

    private static final AddressLayout pszHeaderSubTitle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszHeaderSubTitle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pszHeaderSubTitle
     * }
     */
    public static final AddressLayout pszHeaderSubTitle$layout() {
        return pszHeaderSubTitle$LAYOUT;
    }

    private static final long pszHeaderSubTitle$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pszHeaderSubTitle
     * }
     */
    public static final long pszHeaderSubTitle$offset() {
        return pszHeaderSubTitle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pszHeaderSubTitle
     * }
     */
    public static MemorySegment pszHeaderSubTitle(MemorySegment struct) {
        return struct.get(pszHeaderSubTitle$LAYOUT, pszHeaderSubTitle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pszHeaderSubTitle
     * }
     */
    public static void pszHeaderSubTitle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszHeaderSubTitle$LAYOUT, pszHeaderSubTitle$OFFSET, fieldValue);
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

