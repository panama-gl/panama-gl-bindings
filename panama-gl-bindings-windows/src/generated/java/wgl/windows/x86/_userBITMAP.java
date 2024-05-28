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
 * struct _userBITMAP {
 *     LONG bmType;
 *     LONG bmWidth;
 *     LONG bmHeight;
 *     LONG bmWidthBytes;
 *     WORD bmPlanes;
 *     WORD bmBitsPixel;
 *     ULONG cbSize;
 *     byte pBuffer[1];
 * }
 * }
 */
public class _userBITMAP {

    _userBITMAP() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("bmType"),
        wgl_h.C_LONG.withName("bmWidth"),
        wgl_h.C_LONG.withName("bmHeight"),
        wgl_h.C_LONG.withName("bmWidthBytes"),
        wgl_h.C_SHORT.withName("bmPlanes"),
        wgl_h.C_SHORT.withName("bmBitsPixel"),
        wgl_h.C_LONG.withName("cbSize"),
        MemoryLayout.sequenceLayout(1, wgl_h.C_CHAR).withName("pBuffer"),
        MemoryLayout.paddingLayout(3)
    ).withName("_userBITMAP");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt bmType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bmType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG bmType
     * }
     */
    public static final OfInt bmType$layout() {
        return bmType$LAYOUT;
    }

    private static final long bmType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG bmType
     * }
     */
    public static final long bmType$offset() {
        return bmType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG bmType
     * }
     */
    public static int bmType(MemorySegment struct) {
        return struct.get(bmType$LAYOUT, bmType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG bmType
     * }
     */
    public static void bmType(MemorySegment struct, int fieldValue) {
        struct.set(bmType$LAYOUT, bmType$OFFSET, fieldValue);
    }

    private static final OfInt bmWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bmWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG bmWidth
     * }
     */
    public static final OfInt bmWidth$layout() {
        return bmWidth$LAYOUT;
    }

    private static final long bmWidth$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG bmWidth
     * }
     */
    public static final long bmWidth$offset() {
        return bmWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG bmWidth
     * }
     */
    public static int bmWidth(MemorySegment struct) {
        return struct.get(bmWidth$LAYOUT, bmWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG bmWidth
     * }
     */
    public static void bmWidth(MemorySegment struct, int fieldValue) {
        struct.set(bmWidth$LAYOUT, bmWidth$OFFSET, fieldValue);
    }

    private static final OfInt bmHeight$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bmHeight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG bmHeight
     * }
     */
    public static final OfInt bmHeight$layout() {
        return bmHeight$LAYOUT;
    }

    private static final long bmHeight$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG bmHeight
     * }
     */
    public static final long bmHeight$offset() {
        return bmHeight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG bmHeight
     * }
     */
    public static int bmHeight(MemorySegment struct) {
        return struct.get(bmHeight$LAYOUT, bmHeight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG bmHeight
     * }
     */
    public static void bmHeight(MemorySegment struct, int fieldValue) {
        struct.set(bmHeight$LAYOUT, bmHeight$OFFSET, fieldValue);
    }

    private static final OfInt bmWidthBytes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bmWidthBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG bmWidthBytes
     * }
     */
    public static final OfInt bmWidthBytes$layout() {
        return bmWidthBytes$LAYOUT;
    }

    private static final long bmWidthBytes$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG bmWidthBytes
     * }
     */
    public static final long bmWidthBytes$offset() {
        return bmWidthBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG bmWidthBytes
     * }
     */
    public static int bmWidthBytes(MemorySegment struct) {
        return struct.get(bmWidthBytes$LAYOUT, bmWidthBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG bmWidthBytes
     * }
     */
    public static void bmWidthBytes(MemorySegment struct, int fieldValue) {
        struct.set(bmWidthBytes$LAYOUT, bmWidthBytes$OFFSET, fieldValue);
    }

    private static final OfShort bmPlanes$LAYOUT = (OfShort)$LAYOUT.select(groupElement("bmPlanes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD bmPlanes
     * }
     */
    public static final OfShort bmPlanes$layout() {
        return bmPlanes$LAYOUT;
    }

    private static final long bmPlanes$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD bmPlanes
     * }
     */
    public static final long bmPlanes$offset() {
        return bmPlanes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD bmPlanes
     * }
     */
    public static short bmPlanes(MemorySegment struct) {
        return struct.get(bmPlanes$LAYOUT, bmPlanes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD bmPlanes
     * }
     */
    public static void bmPlanes(MemorySegment struct, short fieldValue) {
        struct.set(bmPlanes$LAYOUT, bmPlanes$OFFSET, fieldValue);
    }

    private static final OfShort bmBitsPixel$LAYOUT = (OfShort)$LAYOUT.select(groupElement("bmBitsPixel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD bmBitsPixel
     * }
     */
    public static final OfShort bmBitsPixel$layout() {
        return bmBitsPixel$LAYOUT;
    }

    private static final long bmBitsPixel$OFFSET = 18;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD bmBitsPixel
     * }
     */
    public static final long bmBitsPixel$offset() {
        return bmBitsPixel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD bmBitsPixel
     * }
     */
    public static short bmBitsPixel(MemorySegment struct) {
        return struct.get(bmBitsPixel$LAYOUT, bmBitsPixel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD bmBitsPixel
     * }
     */
    public static void bmBitsPixel(MemorySegment struct, short fieldValue) {
        struct.set(bmBitsPixel$LAYOUT, bmBitsPixel$OFFSET, fieldValue);
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final SequenceLayout pBuffer$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("pBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * byte pBuffer[1]
     * }
     */
    public static final SequenceLayout pBuffer$layout() {
        return pBuffer$LAYOUT;
    }

    private static final long pBuffer$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * byte pBuffer[1]
     * }
     */
    public static final long pBuffer$offset() {
        return pBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * byte pBuffer[1]
     * }
     */
    public static MemorySegment pBuffer(MemorySegment struct) {
        return struct.asSlice(pBuffer$OFFSET, pBuffer$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * byte pBuffer[1]
     * }
     */
    public static void pBuffer(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pBuffer$OFFSET, pBuffer$LAYOUT.byteSize());
    }

    private static long[] pBuffer$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * byte pBuffer[1]
     * }
     */
    public static long[] pBuffer$dimensions() {
        return pBuffer$DIMS;
    }
    private static final VarHandle pBuffer$ELEM_HANDLE = pBuffer$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * byte pBuffer[1]
     * }
     */
    public static byte pBuffer(MemorySegment struct, long index0) {
        return (byte)pBuffer$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * byte pBuffer[1]
     * }
     */
    public static void pBuffer(MemorySegment struct, long index0, byte fieldValue) {
        pBuffer$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

