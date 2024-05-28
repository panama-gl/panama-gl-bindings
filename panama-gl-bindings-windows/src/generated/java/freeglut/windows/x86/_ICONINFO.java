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
 * struct _ICONINFO {
 *     BOOL fIcon;
 *     DWORD xHotspot;
 *     DWORD yHotspot;
 *     HBITMAP hbmMask;
 *     HBITMAP hbmColor;
 * }
 * }
 */
public class _ICONINFO {

    _ICONINFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_INT.withName("fIcon"),
        freeglut_h.C_LONG.withName("xHotspot"),
        freeglut_h.C_LONG.withName("yHotspot"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_POINTER.withName("hbmMask"),
        freeglut_h.C_POINTER.withName("hbmColor")
    ).withName("_ICONINFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt fIcon$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fIcon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fIcon
     * }
     */
    public static final OfInt fIcon$layout() {
        return fIcon$LAYOUT;
    }

    private static final long fIcon$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fIcon
     * }
     */
    public static final long fIcon$offset() {
        return fIcon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fIcon
     * }
     */
    public static int fIcon(MemorySegment struct) {
        return struct.get(fIcon$LAYOUT, fIcon$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fIcon
     * }
     */
    public static void fIcon(MemorySegment struct, int fieldValue) {
        struct.set(fIcon$LAYOUT, fIcon$OFFSET, fieldValue);
    }

    private static final OfInt xHotspot$LAYOUT = (OfInt)$LAYOUT.select(groupElement("xHotspot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD xHotspot
     * }
     */
    public static final OfInt xHotspot$layout() {
        return xHotspot$LAYOUT;
    }

    private static final long xHotspot$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD xHotspot
     * }
     */
    public static final long xHotspot$offset() {
        return xHotspot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD xHotspot
     * }
     */
    public static int xHotspot(MemorySegment struct) {
        return struct.get(xHotspot$LAYOUT, xHotspot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD xHotspot
     * }
     */
    public static void xHotspot(MemorySegment struct, int fieldValue) {
        struct.set(xHotspot$LAYOUT, xHotspot$OFFSET, fieldValue);
    }

    private static final OfInt yHotspot$LAYOUT = (OfInt)$LAYOUT.select(groupElement("yHotspot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD yHotspot
     * }
     */
    public static final OfInt yHotspot$layout() {
        return yHotspot$LAYOUT;
    }

    private static final long yHotspot$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD yHotspot
     * }
     */
    public static final long yHotspot$offset() {
        return yHotspot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD yHotspot
     * }
     */
    public static int yHotspot(MemorySegment struct) {
        return struct.get(yHotspot$LAYOUT, yHotspot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD yHotspot
     * }
     */
    public static void yHotspot(MemorySegment struct, int fieldValue) {
        struct.set(yHotspot$LAYOUT, yHotspot$OFFSET, fieldValue);
    }

    private static final AddressLayout hbmMask$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hbmMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HBITMAP hbmMask
     * }
     */
    public static final AddressLayout hbmMask$layout() {
        return hbmMask$LAYOUT;
    }

    private static final long hbmMask$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HBITMAP hbmMask
     * }
     */
    public static final long hbmMask$offset() {
        return hbmMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HBITMAP hbmMask
     * }
     */
    public static MemorySegment hbmMask(MemorySegment struct) {
        return struct.get(hbmMask$LAYOUT, hbmMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HBITMAP hbmMask
     * }
     */
    public static void hbmMask(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hbmMask$LAYOUT, hbmMask$OFFSET, fieldValue);
    }

    private static final AddressLayout hbmColor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hbmColor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HBITMAP hbmColor
     * }
     */
    public static final AddressLayout hbmColor$layout() {
        return hbmColor$LAYOUT;
    }

    private static final long hbmColor$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HBITMAP hbmColor
     * }
     */
    public static final long hbmColor$offset() {
        return hbmColor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HBITMAP hbmColor
     * }
     */
    public static MemorySegment hbmColor(MemorySegment struct) {
        return struct.get(hbmColor$LAYOUT, hbmColor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HBITMAP hbmColor
     * }
     */
    public static void hbmColor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hbmColor$LAYOUT, hbmColor$OFFSET, fieldValue);
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

