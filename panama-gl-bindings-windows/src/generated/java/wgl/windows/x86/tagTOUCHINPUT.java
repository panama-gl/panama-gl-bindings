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
 * struct tagTOUCHINPUT {
 *     LONG x;
 *     LONG y;
 *     HANDLE hSource;
 *     DWORD dwID;
 *     DWORD dwFlags;
 *     DWORD dwMask;
 *     DWORD dwTime;
 *     ULONG_PTR dwExtraInfo;
 *     DWORD cxContact;
 *     DWORD cyContact;
 * }
 * }
 */
public class tagTOUCHINPUT {

    tagTOUCHINPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("x"),
        wgl_h.C_LONG.withName("y"),
        wgl_h.C_POINTER.withName("hSource"),
        wgl_h.C_LONG.withName("dwID"),
        wgl_h.C_LONG.withName("dwFlags"),
        wgl_h.C_LONG.withName("dwMask"),
        wgl_h.C_LONG.withName("dwTime"),
        wgl_h.C_LONG_LONG.withName("dwExtraInfo"),
        wgl_h.C_LONG.withName("cxContact"),
        wgl_h.C_LONG.withName("cyContact")
    ).withName("tagTOUCHINPUT");

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
     * LONG x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG x
     * }
     */
    public static int x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG x
     * }
     */
    public static void x(MemorySegment struct, int fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG y
     * }
     */
    public static int y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG y
     * }
     */
    public static void y(MemorySegment struct, int fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final AddressLayout hSource$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hSource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hSource
     * }
     */
    public static final AddressLayout hSource$layout() {
        return hSource$LAYOUT;
    }

    private static final long hSource$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hSource
     * }
     */
    public static final long hSource$offset() {
        return hSource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hSource
     * }
     */
    public static MemorySegment hSource(MemorySegment struct) {
        return struct.get(hSource$LAYOUT, hSource$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hSource
     * }
     */
    public static void hSource(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hSource$LAYOUT, hSource$OFFSET, fieldValue);
    }

    private static final OfInt dwID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwID
     * }
     */
    public static final OfInt dwID$layout() {
        return dwID$LAYOUT;
    }

    private static final long dwID$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwID
     * }
     */
    public static final long dwID$offset() {
        return dwID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwID
     * }
     */
    public static int dwID(MemorySegment struct) {
        return struct.get(dwID$LAYOUT, dwID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwID
     * }
     */
    public static void dwID(MemorySegment struct, int fieldValue) {
        struct.set(dwID$LAYOUT, dwID$OFFSET, fieldValue);
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

    private static final long dwFlags$OFFSET = 20;

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

    private static final OfInt dwMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMask
     * }
     */
    public static final OfInt dwMask$layout() {
        return dwMask$LAYOUT;
    }

    private static final long dwMask$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMask
     * }
     */
    public static final long dwMask$offset() {
        return dwMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMask
     * }
     */
    public static int dwMask(MemorySegment struct) {
        return struct.get(dwMask$LAYOUT, dwMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMask
     * }
     */
    public static void dwMask(MemorySegment struct, int fieldValue) {
        struct.set(dwMask$LAYOUT, dwMask$OFFSET, fieldValue);
    }

    private static final OfInt dwTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static final OfInt dwTime$layout() {
        return dwTime$LAYOUT;
    }

    private static final long dwTime$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static final long dwTime$offset() {
        return dwTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static int dwTime(MemorySegment struct) {
        return struct.get(dwTime$LAYOUT, dwTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static void dwTime(MemorySegment struct, int fieldValue) {
        struct.set(dwTime$LAYOUT, dwTime$OFFSET, fieldValue);
    }

    private static final OfLong dwExtraInfo$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dwExtraInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR dwExtraInfo
     * }
     */
    public static final OfLong dwExtraInfo$layout() {
        return dwExtraInfo$LAYOUT;
    }

    private static final long dwExtraInfo$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR dwExtraInfo
     * }
     */
    public static final long dwExtraInfo$offset() {
        return dwExtraInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR dwExtraInfo
     * }
     */
    public static long dwExtraInfo(MemorySegment struct) {
        return struct.get(dwExtraInfo$LAYOUT, dwExtraInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR dwExtraInfo
     * }
     */
    public static void dwExtraInfo(MemorySegment struct, long fieldValue) {
        struct.set(dwExtraInfo$LAYOUT, dwExtraInfo$OFFSET, fieldValue);
    }

    private static final OfInt cxContact$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cxContact"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cxContact
     * }
     */
    public static final OfInt cxContact$layout() {
        return cxContact$LAYOUT;
    }

    private static final long cxContact$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cxContact
     * }
     */
    public static final long cxContact$offset() {
        return cxContact$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cxContact
     * }
     */
    public static int cxContact(MemorySegment struct) {
        return struct.get(cxContact$LAYOUT, cxContact$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cxContact
     * }
     */
    public static void cxContact(MemorySegment struct, int fieldValue) {
        struct.set(cxContact$LAYOUT, cxContact$OFFSET, fieldValue);
    }

    private static final OfInt cyContact$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cyContact"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cyContact
     * }
     */
    public static final OfInt cyContact$layout() {
        return cyContact$LAYOUT;
    }

    private static final long cyContact$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cyContact
     * }
     */
    public static final long cyContact$offset() {
        return cyContact$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cyContact
     * }
     */
    public static int cyContact(MemorySegment struct) {
        return struct.get(cyContact$LAYOUT, cyContact$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cyContact
     * }
     */
    public static void cyContact(MemorySegment struct, int fieldValue) {
        struct.set(cyContact$LAYOUT, cyContact$OFFSET, fieldValue);
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

