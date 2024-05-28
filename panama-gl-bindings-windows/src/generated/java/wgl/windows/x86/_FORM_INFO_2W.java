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
 * struct _FORM_INFO_2W {
 *     DWORD Flags;
 *     LPCWSTR pName;
 *     SIZEL Size;
 *     RECTL ImageableArea;
 *     LPCSTR pKeyword;
 *     DWORD StringType;
 *     LPCWSTR pMuiDll;
 *     DWORD dwResourceId;
 *     LPCWSTR pDisplayName;
 *     LANGID wLangId;
 * }
 * }
 */
public class _FORM_INFO_2W {

    _FORM_INFO_2W() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Flags"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pName"),
        tagSIZE.layout().withName("Size"),
        _RECTL.layout().withName("ImageableArea"),
        wgl_h.C_POINTER.withName("pKeyword"),
        wgl_h.C_LONG.withName("StringType"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pMuiDll"),
        wgl_h.C_LONG.withName("dwResourceId"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pDisplayName"),
        wgl_h.C_SHORT.withName("wLangId"),
        MemoryLayout.paddingLayout(6)
    ).withName("_FORM_INFO_2W");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final AddressLayout pName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pName
     * }
     */
    public static final AddressLayout pName$layout() {
        return pName$LAYOUT;
    }

    private static final long pName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pName
     * }
     */
    public static final long pName$offset() {
        return pName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pName
     * }
     */
    public static MemorySegment pName(MemorySegment struct) {
        return struct.get(pName$LAYOUT, pName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pName
     * }
     */
    public static void pName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pName$LAYOUT, pName$OFFSET, fieldValue);
    }

    private static final GroupLayout Size$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZEL Size
     * }
     */
    public static final GroupLayout Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZEL Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZEL Size
     * }
     */
    public static MemorySegment Size(MemorySegment struct) {
        return struct.asSlice(Size$OFFSET, Size$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZEL Size
     * }
     */
    public static void Size(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Size$OFFSET, Size$LAYOUT.byteSize());
    }

    private static final GroupLayout ImageableArea$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ImageableArea"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECTL ImageableArea
     * }
     */
    public static final GroupLayout ImageableArea$layout() {
        return ImageableArea$LAYOUT;
    }

    private static final long ImageableArea$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECTL ImageableArea
     * }
     */
    public static final long ImageableArea$offset() {
        return ImageableArea$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECTL ImageableArea
     * }
     */
    public static MemorySegment ImageableArea(MemorySegment struct) {
        return struct.asSlice(ImageableArea$OFFSET, ImageableArea$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECTL ImageableArea
     * }
     */
    public static void ImageableArea(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ImageableArea$OFFSET, ImageableArea$LAYOUT.byteSize());
    }

    private static final AddressLayout pKeyword$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pKeyword"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR pKeyword
     * }
     */
    public static final AddressLayout pKeyword$layout() {
        return pKeyword$LAYOUT;
    }

    private static final long pKeyword$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR pKeyword
     * }
     */
    public static final long pKeyword$offset() {
        return pKeyword$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR pKeyword
     * }
     */
    public static MemorySegment pKeyword(MemorySegment struct) {
        return struct.get(pKeyword$LAYOUT, pKeyword$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR pKeyword
     * }
     */
    public static void pKeyword(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pKeyword$LAYOUT, pKeyword$OFFSET, fieldValue);
    }

    private static final OfInt StringType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("StringType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD StringType
     * }
     */
    public static final OfInt StringType$layout() {
        return StringType$LAYOUT;
    }

    private static final long StringType$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD StringType
     * }
     */
    public static final long StringType$offset() {
        return StringType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD StringType
     * }
     */
    public static int StringType(MemorySegment struct) {
        return struct.get(StringType$LAYOUT, StringType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD StringType
     * }
     */
    public static void StringType(MemorySegment struct, int fieldValue) {
        struct.set(StringType$LAYOUT, StringType$OFFSET, fieldValue);
    }

    private static final AddressLayout pMuiDll$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pMuiDll"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pMuiDll
     * }
     */
    public static final AddressLayout pMuiDll$layout() {
        return pMuiDll$LAYOUT;
    }

    private static final long pMuiDll$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pMuiDll
     * }
     */
    public static final long pMuiDll$offset() {
        return pMuiDll$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pMuiDll
     * }
     */
    public static MemorySegment pMuiDll(MemorySegment struct) {
        return struct.get(pMuiDll$LAYOUT, pMuiDll$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pMuiDll
     * }
     */
    public static void pMuiDll(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pMuiDll$LAYOUT, pMuiDll$OFFSET, fieldValue);
    }

    private static final OfInt dwResourceId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwResourceId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwResourceId
     * }
     */
    public static final OfInt dwResourceId$layout() {
        return dwResourceId$LAYOUT;
    }

    private static final long dwResourceId$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwResourceId
     * }
     */
    public static final long dwResourceId$offset() {
        return dwResourceId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwResourceId
     * }
     */
    public static int dwResourceId(MemorySegment struct) {
        return struct.get(dwResourceId$LAYOUT, dwResourceId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwResourceId
     * }
     */
    public static void dwResourceId(MemorySegment struct, int fieldValue) {
        struct.set(dwResourceId$LAYOUT, dwResourceId$OFFSET, fieldValue);
    }

    private static final AddressLayout pDisplayName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDisplayName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pDisplayName
     * }
     */
    public static final AddressLayout pDisplayName$layout() {
        return pDisplayName$LAYOUT;
    }

    private static final long pDisplayName$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pDisplayName
     * }
     */
    public static final long pDisplayName$offset() {
        return pDisplayName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pDisplayName
     * }
     */
    public static MemorySegment pDisplayName(MemorySegment struct) {
        return struct.get(pDisplayName$LAYOUT, pDisplayName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pDisplayName
     * }
     */
    public static void pDisplayName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDisplayName$LAYOUT, pDisplayName$OFFSET, fieldValue);
    }

    private static final OfShort wLangId$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wLangId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LANGID wLangId
     * }
     */
    public static final OfShort wLangId$layout() {
        return wLangId$LAYOUT;
    }

    private static final long wLangId$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LANGID wLangId
     * }
     */
    public static final long wLangId$offset() {
        return wLangId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LANGID wLangId
     * }
     */
    public static short wLangId(MemorySegment struct) {
        return struct.get(wLangId$LAYOUT, wLangId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LANGID wLangId
     * }
     */
    public static void wLangId(MemorySegment struct, short fieldValue) {
        struct.set(wLangId$LAYOUT, wLangId$OFFSET, fieldValue);
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

