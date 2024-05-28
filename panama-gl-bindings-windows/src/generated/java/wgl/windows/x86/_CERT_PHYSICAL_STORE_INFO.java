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
 * struct _CERT_PHYSICAL_STORE_INFO {
 *     DWORD cbSize;
 *     LPSTR pszOpenStoreProvider;
 *     DWORD dwOpenEncodingType;
 *     DWORD dwOpenFlags;
 *     CRYPT_DATA_BLOB OpenParameters;
 *     DWORD dwFlags;
 *     DWORD dwPriority;
 * }
 * }
 */
public class _CERT_PHYSICAL_STORE_INFO {

    _CERT_PHYSICAL_STORE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pszOpenStoreProvider"),
        wgl_h.C_LONG.withName("dwOpenEncodingType"),
        wgl_h.C_LONG.withName("dwOpenFlags"),
        _CRYPTOAPI_BLOB.layout().withName("OpenParameters"),
        wgl_h.C_LONG.withName("dwFlags"),
        wgl_h.C_LONG.withName("dwPriority")
    ).withName("_CERT_PHYSICAL_STORE_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final AddressLayout pszOpenStoreProvider$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszOpenStoreProvider"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pszOpenStoreProvider
     * }
     */
    public static final AddressLayout pszOpenStoreProvider$layout() {
        return pszOpenStoreProvider$LAYOUT;
    }

    private static final long pszOpenStoreProvider$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pszOpenStoreProvider
     * }
     */
    public static final long pszOpenStoreProvider$offset() {
        return pszOpenStoreProvider$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pszOpenStoreProvider
     * }
     */
    public static MemorySegment pszOpenStoreProvider(MemorySegment struct) {
        return struct.get(pszOpenStoreProvider$LAYOUT, pszOpenStoreProvider$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pszOpenStoreProvider
     * }
     */
    public static void pszOpenStoreProvider(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszOpenStoreProvider$LAYOUT, pszOpenStoreProvider$OFFSET, fieldValue);
    }

    private static final OfInt dwOpenEncodingType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwOpenEncodingType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwOpenEncodingType
     * }
     */
    public static final OfInt dwOpenEncodingType$layout() {
        return dwOpenEncodingType$LAYOUT;
    }

    private static final long dwOpenEncodingType$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwOpenEncodingType
     * }
     */
    public static final long dwOpenEncodingType$offset() {
        return dwOpenEncodingType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwOpenEncodingType
     * }
     */
    public static int dwOpenEncodingType(MemorySegment struct) {
        return struct.get(dwOpenEncodingType$LAYOUT, dwOpenEncodingType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwOpenEncodingType
     * }
     */
    public static void dwOpenEncodingType(MemorySegment struct, int fieldValue) {
        struct.set(dwOpenEncodingType$LAYOUT, dwOpenEncodingType$OFFSET, fieldValue);
    }

    private static final OfInt dwOpenFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwOpenFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwOpenFlags
     * }
     */
    public static final OfInt dwOpenFlags$layout() {
        return dwOpenFlags$LAYOUT;
    }

    private static final long dwOpenFlags$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwOpenFlags
     * }
     */
    public static final long dwOpenFlags$offset() {
        return dwOpenFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwOpenFlags
     * }
     */
    public static int dwOpenFlags(MemorySegment struct) {
        return struct.get(dwOpenFlags$LAYOUT, dwOpenFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwOpenFlags
     * }
     */
    public static void dwOpenFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwOpenFlags$LAYOUT, dwOpenFlags$OFFSET, fieldValue);
    }

    private static final GroupLayout OpenParameters$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("OpenParameters"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB OpenParameters
     * }
     */
    public static final GroupLayout OpenParameters$layout() {
        return OpenParameters$LAYOUT;
    }

    private static final long OpenParameters$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB OpenParameters
     * }
     */
    public static final long OpenParameters$offset() {
        return OpenParameters$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB OpenParameters
     * }
     */
    public static MemorySegment OpenParameters(MemorySegment struct) {
        return struct.asSlice(OpenParameters$OFFSET, OpenParameters$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB OpenParameters
     * }
     */
    public static void OpenParameters(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, OpenParameters$OFFSET, OpenParameters$LAYOUT.byteSize());
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

    private static final long dwFlags$OFFSET = 40;

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

    private static final OfInt dwPriority$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwPriority"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwPriority
     * }
     */
    public static final OfInt dwPriority$layout() {
        return dwPriority$LAYOUT;
    }

    private static final long dwPriority$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwPriority
     * }
     */
    public static final long dwPriority$offset() {
        return dwPriority$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwPriority
     * }
     */
    public static int dwPriority(MemorySegment struct) {
        return struct.get(dwPriority$LAYOUT, dwPriority$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwPriority
     * }
     */
    public static void dwPriority(MemorySegment struct, int fieldValue) {
        struct.set(dwPriority$LAYOUT, dwPriority$OFFSET, fieldValue);
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

