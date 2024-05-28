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
 * struct tagDRVCONFIGINFO {
 *     DWORD dwDCISize;
 *     LPCWSTR lpszDCISectionName;
 *     LPCWSTR lpszDCIAliasName;
 * }
 * }
 */
public class tagDRVCONFIGINFO {

    tagDRVCONFIGINFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.align(wgl_h.C_LONG, 1).withName("dwDCISize"),
        wgl_h.align(wgl_h.C_POINTER, 1).withName("lpszDCISectionName"),
        wgl_h.align(wgl_h.C_POINTER, 1).withName("lpszDCIAliasName")
    ).withName("tagDRVCONFIGINFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwDCISize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDCISize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDCISize
     * }
     */
    public static final OfInt dwDCISize$layout() {
        return dwDCISize$LAYOUT;
    }

    private static final long dwDCISize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDCISize
     * }
     */
    public static final long dwDCISize$offset() {
        return dwDCISize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDCISize
     * }
     */
    public static int dwDCISize(MemorySegment struct) {
        return struct.get(dwDCISize$LAYOUT, dwDCISize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDCISize
     * }
     */
    public static void dwDCISize(MemorySegment struct, int fieldValue) {
        struct.set(dwDCISize$LAYOUT, dwDCISize$OFFSET, fieldValue);
    }

    private static final AddressLayout lpszDCISectionName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszDCISectionName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpszDCISectionName
     * }
     */
    public static final AddressLayout lpszDCISectionName$layout() {
        return lpszDCISectionName$LAYOUT;
    }

    private static final long lpszDCISectionName$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpszDCISectionName
     * }
     */
    public static final long lpszDCISectionName$offset() {
        return lpszDCISectionName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpszDCISectionName
     * }
     */
    public static MemorySegment lpszDCISectionName(MemorySegment struct) {
        return struct.get(lpszDCISectionName$LAYOUT, lpszDCISectionName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpszDCISectionName
     * }
     */
    public static void lpszDCISectionName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszDCISectionName$LAYOUT, lpszDCISectionName$OFFSET, fieldValue);
    }

    private static final AddressLayout lpszDCIAliasName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszDCIAliasName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpszDCIAliasName
     * }
     */
    public static final AddressLayout lpszDCIAliasName$layout() {
        return lpszDCIAliasName$LAYOUT;
    }

    private static final long lpszDCIAliasName$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpszDCIAliasName
     * }
     */
    public static final long lpszDCIAliasName$offset() {
        return lpszDCIAliasName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpszDCIAliasName
     * }
     */
    public static MemorySegment lpszDCIAliasName(MemorySegment struct) {
        return struct.get(lpszDCIAliasName$LAYOUT, lpszDCIAliasName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpszDCIAliasName
     * }
     */
    public static void lpszDCIAliasName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszDCIAliasName$LAYOUT, lpszDCIAliasName$OFFSET, fieldValue);
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

