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
 * struct _FORM_INFO_1W {
 *     DWORD Flags;
 *     LPWSTR pName;
 *     SIZEL Size;
 *     RECTL ImageableArea;
 * }
 * }
 */
public class _FORM_INFO_1W {

    _FORM_INFO_1W() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Flags"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pName"),
        tagSIZE.layout().withName("Size"),
        _RECTL.layout().withName("ImageableArea")
    ).withName("_FORM_INFO_1W");

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
     * LPWSTR pName
     * }
     */
    public static final AddressLayout pName$layout() {
        return pName$LAYOUT;
    }

    private static final long pName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pName
     * }
     */
    public static final long pName$offset() {
        return pName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pName
     * }
     */
    public static MemorySegment pName(MemorySegment struct) {
        return struct.get(pName$LAYOUT, pName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pName
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

