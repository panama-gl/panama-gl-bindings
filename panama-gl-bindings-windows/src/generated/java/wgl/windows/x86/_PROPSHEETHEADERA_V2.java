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
 * struct _PROPSHEETHEADERA_V2 {
 *     DWORD dwSize;
 *     DWORD dwFlags;
 *     HWND hwndParent;
 *     HINSTANCE hInstance;
 *     union {
 *         HICON hIcon;
 *         LPCSTR pszIcon;
 *     };
 *     LPCSTR pszCaption;
 *     UINT nPages;
 *     union {
 *         UINT nStartPage;
 *         LPCSTR pStartPage;
 *     };
 *     union {
 *         LPCPROPSHEETPAGEA ppsp;
 *         HPROPSHEETPAGE *phpage;
 *     };
 *     PFNPROPSHEETCALLBACK pfnCallback;
 *     union {
 *         HBITMAP hbmWatermark;
 *         LPCSTR pszbmWatermark;
 *     };
 *     HPALETTE hplWatermark;
 *     union {
 *         HBITMAP hbmHeader;
 *         LPCSTR pszbmHeader;
 *     };
 * }
 * }
 */
public class _PROPSHEETHEADERA_V2 {

    _PROPSHEETHEADERA_V2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwSize"),
        wgl_h.C_LONG.withName("dwFlags"),
        wgl_h.C_POINTER.withName("hwndParent"),
        wgl_h.C_POINTER.withName("hInstance"),
        MemoryLayout.unionLayout(
            wgl_h.C_POINTER.withName("hIcon"),
            wgl_h.C_POINTER.withName("pszIcon")
        ).withName("$anon$479:5"),
        wgl_h.C_POINTER.withName("pszCaption"),
        wgl_h.C_INT.withName("nPages"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            wgl_h.C_INT.withName("nStartPage"),
            wgl_h.C_POINTER.withName("pStartPage")
        ).withName("$anon$479:5"),
        MemoryLayout.unionLayout(
            wgl_h.C_POINTER.withName("ppsp"),
            wgl_h.C_POINTER.withName("phpage")
        ).withName("$anon$479:5"),
        wgl_h.C_POINTER.withName("pfnCallback"),
        MemoryLayout.unionLayout(
            wgl_h.C_POINTER.withName("hbmWatermark"),
            wgl_h.C_POINTER.withName("pszbmWatermark")
        ).withName("$anon$480:5"),
        wgl_h.C_POINTER.withName("hplWatermark"),
        MemoryLayout.unionLayout(
            wgl_h.C_POINTER.withName("hbmHeader"),
            wgl_h.C_POINTER.withName("pszbmHeader")
        ).withName("$anon$486:5")
    ).withName("_PROPSHEETHEADERA_V2");

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

    private static final AddressLayout hwndParent$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndParent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndParent
     * }
     */
    public static final AddressLayout hwndParent$layout() {
        return hwndParent$LAYOUT;
    }

    private static final long hwndParent$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndParent
     * }
     */
    public static final long hwndParent$offset() {
        return hwndParent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndParent
     * }
     */
    public static MemorySegment hwndParent(MemorySegment struct) {
        return struct.get(hwndParent$LAYOUT, hwndParent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndParent
     * }
     */
    public static void hwndParent(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndParent$LAYOUT, hwndParent$OFFSET, fieldValue);
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

    private static final long hInstance$OFFSET = 16;

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

    private static final AddressLayout hIcon$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$479:5"), groupElement("hIcon"));

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

    private static final AddressLayout pszIcon$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$479:5"), groupElement("pszIcon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR pszIcon
     * }
     */
    public static final AddressLayout pszIcon$layout() {
        return pszIcon$LAYOUT;
    }

    private static final long pszIcon$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR pszIcon
     * }
     */
    public static final long pszIcon$offset() {
        return pszIcon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR pszIcon
     * }
     */
    public static MemorySegment pszIcon(MemorySegment struct) {
        return struct.get(pszIcon$LAYOUT, pszIcon$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR pszIcon
     * }
     */
    public static void pszIcon(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszIcon$LAYOUT, pszIcon$OFFSET, fieldValue);
    }

    private static final AddressLayout pszCaption$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszCaption"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR pszCaption
     * }
     */
    public static final AddressLayout pszCaption$layout() {
        return pszCaption$LAYOUT;
    }

    private static final long pszCaption$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR pszCaption
     * }
     */
    public static final long pszCaption$offset() {
        return pszCaption$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR pszCaption
     * }
     */
    public static MemorySegment pszCaption(MemorySegment struct) {
        return struct.get(pszCaption$LAYOUT, pszCaption$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR pszCaption
     * }
     */
    public static void pszCaption(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszCaption$LAYOUT, pszCaption$OFFSET, fieldValue);
    }

    private static final OfInt nPages$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nPages"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT nPages
     * }
     */
    public static final OfInt nPages$layout() {
        return nPages$LAYOUT;
    }

    private static final long nPages$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT nPages
     * }
     */
    public static final long nPages$offset() {
        return nPages$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT nPages
     * }
     */
    public static int nPages(MemorySegment struct) {
        return struct.get(nPages$LAYOUT, nPages$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT nPages
     * }
     */
    public static void nPages(MemorySegment struct, int fieldValue) {
        struct.set(nPages$LAYOUT, nPages$OFFSET, fieldValue);
    }

    private static final OfInt nStartPage$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$479:5"), groupElement("nStartPage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT nStartPage
     * }
     */
    public static final OfInt nStartPage$layout() {
        return nStartPage$LAYOUT;
    }

    private static final long nStartPage$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT nStartPage
     * }
     */
    public static final long nStartPage$offset() {
        return nStartPage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT nStartPage
     * }
     */
    public static int nStartPage(MemorySegment struct) {
        return struct.get(nStartPage$LAYOUT, nStartPage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT nStartPage
     * }
     */
    public static void nStartPage(MemorySegment struct, int fieldValue) {
        struct.set(nStartPage$LAYOUT, nStartPage$OFFSET, fieldValue);
    }

    private static final AddressLayout pStartPage$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$479:5"), groupElement("pStartPage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR pStartPage
     * }
     */
    public static final AddressLayout pStartPage$layout() {
        return pStartPage$LAYOUT;
    }

    private static final long pStartPage$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR pStartPage
     * }
     */
    public static final long pStartPage$offset() {
        return pStartPage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR pStartPage
     * }
     */
    public static MemorySegment pStartPage(MemorySegment struct) {
        return struct.get(pStartPage$LAYOUT, pStartPage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR pStartPage
     * }
     */
    public static void pStartPage(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pStartPage$LAYOUT, pStartPage$OFFSET, fieldValue);
    }

    private static final AddressLayout ppsp$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$479:5"), groupElement("ppsp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCPROPSHEETPAGEA ppsp
     * }
     */
    public static final AddressLayout ppsp$layout() {
        return ppsp$LAYOUT;
    }

    private static final long ppsp$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCPROPSHEETPAGEA ppsp
     * }
     */
    public static final long ppsp$offset() {
        return ppsp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCPROPSHEETPAGEA ppsp
     * }
     */
    public static MemorySegment ppsp(MemorySegment struct) {
        return struct.get(ppsp$LAYOUT, ppsp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCPROPSHEETPAGEA ppsp
     * }
     */
    public static void ppsp(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ppsp$LAYOUT, ppsp$OFFSET, fieldValue);
    }

    private static final AddressLayout phpage$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$479:5"), groupElement("phpage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HPROPSHEETPAGE *phpage
     * }
     */
    public static final AddressLayout phpage$layout() {
        return phpage$LAYOUT;
    }

    private static final long phpage$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HPROPSHEETPAGE *phpage
     * }
     */
    public static final long phpage$offset() {
        return phpage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HPROPSHEETPAGE *phpage
     * }
     */
    public static MemorySegment phpage(MemorySegment struct) {
        return struct.get(phpage$LAYOUT, phpage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HPROPSHEETPAGE *phpage
     * }
     */
    public static void phpage(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(phpage$LAYOUT, phpage$OFFSET, fieldValue);
    }

    private static final AddressLayout pfnCallback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pfnCallback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PFNPROPSHEETCALLBACK pfnCallback
     * }
     */
    public static final AddressLayout pfnCallback$layout() {
        return pfnCallback$LAYOUT;
    }

    private static final long pfnCallback$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PFNPROPSHEETCALLBACK pfnCallback
     * }
     */
    public static final long pfnCallback$offset() {
        return pfnCallback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PFNPROPSHEETCALLBACK pfnCallback
     * }
     */
    public static MemorySegment pfnCallback(MemorySegment struct) {
        return struct.get(pfnCallback$LAYOUT, pfnCallback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PFNPROPSHEETCALLBACK pfnCallback
     * }
     */
    public static void pfnCallback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pfnCallback$LAYOUT, pfnCallback$OFFSET, fieldValue);
    }

    private static final AddressLayout hbmWatermark$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$480:5"), groupElement("hbmWatermark"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HBITMAP hbmWatermark
     * }
     */
    public static final AddressLayout hbmWatermark$layout() {
        return hbmWatermark$LAYOUT;
    }

    private static final long hbmWatermark$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HBITMAP hbmWatermark
     * }
     */
    public static final long hbmWatermark$offset() {
        return hbmWatermark$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HBITMAP hbmWatermark
     * }
     */
    public static MemorySegment hbmWatermark(MemorySegment struct) {
        return struct.get(hbmWatermark$LAYOUT, hbmWatermark$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HBITMAP hbmWatermark
     * }
     */
    public static void hbmWatermark(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hbmWatermark$LAYOUT, hbmWatermark$OFFSET, fieldValue);
    }

    private static final AddressLayout pszbmWatermark$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$480:5"), groupElement("pszbmWatermark"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR pszbmWatermark
     * }
     */
    public static final AddressLayout pszbmWatermark$layout() {
        return pszbmWatermark$LAYOUT;
    }

    private static final long pszbmWatermark$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR pszbmWatermark
     * }
     */
    public static final long pszbmWatermark$offset() {
        return pszbmWatermark$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR pszbmWatermark
     * }
     */
    public static MemorySegment pszbmWatermark(MemorySegment struct) {
        return struct.get(pszbmWatermark$LAYOUT, pszbmWatermark$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR pszbmWatermark
     * }
     */
    public static void pszbmWatermark(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszbmWatermark$LAYOUT, pszbmWatermark$OFFSET, fieldValue);
    }

    private static final AddressLayout hplWatermark$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hplWatermark"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HPALETTE hplWatermark
     * }
     */
    public static final AddressLayout hplWatermark$layout() {
        return hplWatermark$LAYOUT;
    }

    private static final long hplWatermark$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HPALETTE hplWatermark
     * }
     */
    public static final long hplWatermark$offset() {
        return hplWatermark$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HPALETTE hplWatermark
     * }
     */
    public static MemorySegment hplWatermark(MemorySegment struct) {
        return struct.get(hplWatermark$LAYOUT, hplWatermark$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HPALETTE hplWatermark
     * }
     */
    public static void hplWatermark(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hplWatermark$LAYOUT, hplWatermark$OFFSET, fieldValue);
    }

    private static final AddressLayout hbmHeader$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$486:5"), groupElement("hbmHeader"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HBITMAP hbmHeader
     * }
     */
    public static final AddressLayout hbmHeader$layout() {
        return hbmHeader$LAYOUT;
    }

    private static final long hbmHeader$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HBITMAP hbmHeader
     * }
     */
    public static final long hbmHeader$offset() {
        return hbmHeader$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HBITMAP hbmHeader
     * }
     */
    public static MemorySegment hbmHeader(MemorySegment struct) {
        return struct.get(hbmHeader$LAYOUT, hbmHeader$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HBITMAP hbmHeader
     * }
     */
    public static void hbmHeader(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hbmHeader$LAYOUT, hbmHeader$OFFSET, fieldValue);
    }

    private static final AddressLayout pszbmHeader$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$486:5"), groupElement("pszbmHeader"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR pszbmHeader
     * }
     */
    public static final AddressLayout pszbmHeader$layout() {
        return pszbmHeader$LAYOUT;
    }

    private static final long pszbmHeader$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR pszbmHeader
     * }
     */
    public static final long pszbmHeader$offset() {
        return pszbmHeader$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR pszbmHeader
     * }
     */
    public static MemorySegment pszbmHeader(MemorySegment struct) {
        return struct.get(pszbmHeader$LAYOUT, pszbmHeader$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR pszbmHeader
     * }
     */
    public static void pszbmHeader(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszbmHeader$LAYOUT, pszbmHeader$OFFSET, fieldValue);
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

