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
 * struct _DOCINFOA {
 *     int cbSize;
 *     LPCSTR lpszDocName;
 *     LPCSTR lpszOutput;
 *     LPCSTR lpszDatatype;
 *     DWORD fwType;
 * }
 * }
 */
public class _DOCINFOA {

    _DOCINFOA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_INT.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_POINTER.withName("lpszDocName"),
        freeglut_h.C_POINTER.withName("lpszOutput"),
        freeglut_h.C_POINTER.withName("lpszDatatype"),
        freeglut_h.C_LONG.withName("fwType"),
        MemoryLayout.paddingLayout(4)
    ).withName("_DOCINFOA");

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
     * int cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final AddressLayout lpszDocName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszDocName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR lpszDocName
     * }
     */
    public static final AddressLayout lpszDocName$layout() {
        return lpszDocName$LAYOUT;
    }

    private static final long lpszDocName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR lpszDocName
     * }
     */
    public static final long lpszDocName$offset() {
        return lpszDocName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR lpszDocName
     * }
     */
    public static MemorySegment lpszDocName(MemorySegment struct) {
        return struct.get(lpszDocName$LAYOUT, lpszDocName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR lpszDocName
     * }
     */
    public static void lpszDocName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszDocName$LAYOUT, lpszDocName$OFFSET, fieldValue);
    }

    private static final AddressLayout lpszOutput$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszOutput"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR lpszOutput
     * }
     */
    public static final AddressLayout lpszOutput$layout() {
        return lpszOutput$LAYOUT;
    }

    private static final long lpszOutput$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR lpszOutput
     * }
     */
    public static final long lpszOutput$offset() {
        return lpszOutput$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR lpszOutput
     * }
     */
    public static MemorySegment lpszOutput(MemorySegment struct) {
        return struct.get(lpszOutput$LAYOUT, lpszOutput$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR lpszOutput
     * }
     */
    public static void lpszOutput(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszOutput$LAYOUT, lpszOutput$OFFSET, fieldValue);
    }

    private static final AddressLayout lpszDatatype$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszDatatype"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR lpszDatatype
     * }
     */
    public static final AddressLayout lpszDatatype$layout() {
        return lpszDatatype$LAYOUT;
    }

    private static final long lpszDatatype$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR lpszDatatype
     * }
     */
    public static final long lpszDatatype$offset() {
        return lpszDatatype$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR lpszDatatype
     * }
     */
    public static MemorySegment lpszDatatype(MemorySegment struct) {
        return struct.get(lpszDatatype$LAYOUT, lpszDatatype$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR lpszDatatype
     * }
     */
    public static void lpszDatatype(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszDatatype$LAYOUT, lpszDatatype$OFFSET, fieldValue);
    }

    private static final OfInt fwType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fwType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD fwType
     * }
     */
    public static final OfInt fwType$layout() {
        return fwType$LAYOUT;
    }

    private static final long fwType$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD fwType
     * }
     */
    public static final long fwType$offset() {
        return fwType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD fwType
     * }
     */
    public static int fwType(MemorySegment struct) {
        return struct.get(fwType$LAYOUT, fwType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD fwType
     * }
     */
    public static void fwType(MemorySegment struct, int fieldValue) {
        struct.set(fwType$LAYOUT, fwType$OFFSET, fieldValue);
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

