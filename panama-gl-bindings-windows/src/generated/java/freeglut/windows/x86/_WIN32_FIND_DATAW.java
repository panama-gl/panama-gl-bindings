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
 * struct _WIN32_FIND_DATAW {
 *     DWORD dwFileAttributes;
 *     FILETIME ftCreationTime;
 *     FILETIME ftLastAccessTime;
 *     FILETIME ftLastWriteTime;
 *     DWORD nFileSizeHigh;
 *     DWORD nFileSizeLow;
 *     DWORD dwReserved0;
 *     DWORD dwReserved1;
 *     WCHAR cFileName[260];
 *     WCHAR cAlternateFileName[14];
 * }
 * }
 */
public class _WIN32_FIND_DATAW {

    _WIN32_FIND_DATAW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("dwFileAttributes"),
        _FILETIME.layout().withName("ftCreationTime"),
        _FILETIME.layout().withName("ftLastAccessTime"),
        _FILETIME.layout().withName("ftLastWriteTime"),
        freeglut_h.C_LONG.withName("nFileSizeHigh"),
        freeglut_h.C_LONG.withName("nFileSizeLow"),
        freeglut_h.C_LONG.withName("dwReserved0"),
        freeglut_h.C_LONG.withName("dwReserved1"),
        MemoryLayout.sequenceLayout(260, freeglut_h.C_SHORT).withName("cFileName"),
        MemoryLayout.sequenceLayout(14, freeglut_h.C_SHORT).withName("cAlternateFileName")
    ).withName("_WIN32_FIND_DATAW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwFileAttributes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFileAttributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFileAttributes
     * }
     */
    public static final OfInt dwFileAttributes$layout() {
        return dwFileAttributes$LAYOUT;
    }

    private static final long dwFileAttributes$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFileAttributes
     * }
     */
    public static final long dwFileAttributes$offset() {
        return dwFileAttributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFileAttributes
     * }
     */
    public static int dwFileAttributes(MemorySegment struct) {
        return struct.get(dwFileAttributes$LAYOUT, dwFileAttributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFileAttributes
     * }
     */
    public static void dwFileAttributes(MemorySegment struct, int fieldValue) {
        struct.set(dwFileAttributes$LAYOUT, dwFileAttributes$OFFSET, fieldValue);
    }

    private static final GroupLayout ftCreationTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ftCreationTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME ftCreationTime
     * }
     */
    public static final GroupLayout ftCreationTime$layout() {
        return ftCreationTime$LAYOUT;
    }

    private static final long ftCreationTime$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME ftCreationTime
     * }
     */
    public static final long ftCreationTime$offset() {
        return ftCreationTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME ftCreationTime
     * }
     */
    public static MemorySegment ftCreationTime(MemorySegment struct) {
        return struct.asSlice(ftCreationTime$OFFSET, ftCreationTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME ftCreationTime
     * }
     */
    public static void ftCreationTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ftCreationTime$OFFSET, ftCreationTime$LAYOUT.byteSize());
    }

    private static final GroupLayout ftLastAccessTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ftLastAccessTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME ftLastAccessTime
     * }
     */
    public static final GroupLayout ftLastAccessTime$layout() {
        return ftLastAccessTime$LAYOUT;
    }

    private static final long ftLastAccessTime$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME ftLastAccessTime
     * }
     */
    public static final long ftLastAccessTime$offset() {
        return ftLastAccessTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME ftLastAccessTime
     * }
     */
    public static MemorySegment ftLastAccessTime(MemorySegment struct) {
        return struct.asSlice(ftLastAccessTime$OFFSET, ftLastAccessTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME ftLastAccessTime
     * }
     */
    public static void ftLastAccessTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ftLastAccessTime$OFFSET, ftLastAccessTime$LAYOUT.byteSize());
    }

    private static final GroupLayout ftLastWriteTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ftLastWriteTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME ftLastWriteTime
     * }
     */
    public static final GroupLayout ftLastWriteTime$layout() {
        return ftLastWriteTime$LAYOUT;
    }

    private static final long ftLastWriteTime$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME ftLastWriteTime
     * }
     */
    public static final long ftLastWriteTime$offset() {
        return ftLastWriteTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME ftLastWriteTime
     * }
     */
    public static MemorySegment ftLastWriteTime(MemorySegment struct) {
        return struct.asSlice(ftLastWriteTime$OFFSET, ftLastWriteTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME ftLastWriteTime
     * }
     */
    public static void ftLastWriteTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ftLastWriteTime$OFFSET, ftLastWriteTime$LAYOUT.byteSize());
    }

    private static final OfInt nFileSizeHigh$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nFileSizeHigh"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nFileSizeHigh
     * }
     */
    public static final OfInt nFileSizeHigh$layout() {
        return nFileSizeHigh$LAYOUT;
    }

    private static final long nFileSizeHigh$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nFileSizeHigh
     * }
     */
    public static final long nFileSizeHigh$offset() {
        return nFileSizeHigh$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nFileSizeHigh
     * }
     */
    public static int nFileSizeHigh(MemorySegment struct) {
        return struct.get(nFileSizeHigh$LAYOUT, nFileSizeHigh$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nFileSizeHigh
     * }
     */
    public static void nFileSizeHigh(MemorySegment struct, int fieldValue) {
        struct.set(nFileSizeHigh$LAYOUT, nFileSizeHigh$OFFSET, fieldValue);
    }

    private static final OfInt nFileSizeLow$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nFileSizeLow"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nFileSizeLow
     * }
     */
    public static final OfInt nFileSizeLow$layout() {
        return nFileSizeLow$LAYOUT;
    }

    private static final long nFileSizeLow$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nFileSizeLow
     * }
     */
    public static final long nFileSizeLow$offset() {
        return nFileSizeLow$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nFileSizeLow
     * }
     */
    public static int nFileSizeLow(MemorySegment struct) {
        return struct.get(nFileSizeLow$LAYOUT, nFileSizeLow$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nFileSizeLow
     * }
     */
    public static void nFileSizeLow(MemorySegment struct, int fieldValue) {
        struct.set(nFileSizeLow$LAYOUT, nFileSizeLow$OFFSET, fieldValue);
    }

    private static final OfInt dwReserved0$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwReserved0"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwReserved0
     * }
     */
    public static final OfInt dwReserved0$layout() {
        return dwReserved0$LAYOUT;
    }

    private static final long dwReserved0$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwReserved0
     * }
     */
    public static final long dwReserved0$offset() {
        return dwReserved0$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwReserved0
     * }
     */
    public static int dwReserved0(MemorySegment struct) {
        return struct.get(dwReserved0$LAYOUT, dwReserved0$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwReserved0
     * }
     */
    public static void dwReserved0(MemorySegment struct, int fieldValue) {
        struct.set(dwReserved0$LAYOUT, dwReserved0$OFFSET, fieldValue);
    }

    private static final OfInt dwReserved1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwReserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwReserved1
     * }
     */
    public static final OfInt dwReserved1$layout() {
        return dwReserved1$LAYOUT;
    }

    private static final long dwReserved1$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwReserved1
     * }
     */
    public static final long dwReserved1$offset() {
        return dwReserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwReserved1
     * }
     */
    public static int dwReserved1(MemorySegment struct) {
        return struct.get(dwReserved1$LAYOUT, dwReserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwReserved1
     * }
     */
    public static void dwReserved1(MemorySegment struct, int fieldValue) {
        struct.set(dwReserved1$LAYOUT, dwReserved1$OFFSET, fieldValue);
    }

    private static final SequenceLayout cFileName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("cFileName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR cFileName[260]
     * }
     */
    public static final SequenceLayout cFileName$layout() {
        return cFileName$LAYOUT;
    }

    private static final long cFileName$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR cFileName[260]
     * }
     */
    public static final long cFileName$offset() {
        return cFileName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR cFileName[260]
     * }
     */
    public static MemorySegment cFileName(MemorySegment struct) {
        return struct.asSlice(cFileName$OFFSET, cFileName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR cFileName[260]
     * }
     */
    public static void cFileName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cFileName$OFFSET, cFileName$LAYOUT.byteSize());
    }

    private static long[] cFileName$DIMS = { 260 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR cFileName[260]
     * }
     */
    public static long[] cFileName$dimensions() {
        return cFileName$DIMS;
    }
    private static final VarHandle cFileName$ELEM_HANDLE = cFileName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR cFileName[260]
     * }
     */
    public static short cFileName(MemorySegment struct, long index0) {
        return (short)cFileName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR cFileName[260]
     * }
     */
    public static void cFileName(MemorySegment struct, long index0, short fieldValue) {
        cFileName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout cAlternateFileName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("cAlternateFileName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR cAlternateFileName[14]
     * }
     */
    public static final SequenceLayout cAlternateFileName$layout() {
        return cAlternateFileName$LAYOUT;
    }

    private static final long cAlternateFileName$OFFSET = 564;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR cAlternateFileName[14]
     * }
     */
    public static final long cAlternateFileName$offset() {
        return cAlternateFileName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR cAlternateFileName[14]
     * }
     */
    public static MemorySegment cAlternateFileName(MemorySegment struct) {
        return struct.asSlice(cAlternateFileName$OFFSET, cAlternateFileName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR cAlternateFileName[14]
     * }
     */
    public static void cAlternateFileName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cAlternateFileName$OFFSET, cAlternateFileName$LAYOUT.byteSize());
    }

    private static long[] cAlternateFileName$DIMS = { 14 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR cAlternateFileName[14]
     * }
     */
    public static long[] cAlternateFileName$dimensions() {
        return cAlternateFileName$DIMS;
    }
    private static final VarHandle cAlternateFileName$ELEM_HANDLE = cAlternateFileName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR cAlternateFileName[14]
     * }
     */
    public static short cAlternateFileName(MemorySegment struct, long index0) {
        return (short)cAlternateFileName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR cAlternateFileName[14]
     * }
     */
    public static void cAlternateFileName(MemorySegment struct, long index0, short fieldValue) {
        cAlternateFileName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

