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
 * struct _STORAGE_RPMB_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD SizeInBytes;
 *     DWORD MaxReliableWriteSizeInBytes;
 *     STORAGE_RPMB_FRAME_TYPE FrameFormat;
 * }
 * }
 */
public class _STORAGE_RPMB_DESCRIPTOR {

    _STORAGE_RPMB_DESCRIPTOR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Version"),
        wgl_h.C_LONG.withName("Size"),
        wgl_h.C_LONG.withName("SizeInBytes"),
        wgl_h.C_LONG.withName("MaxReliableWriteSizeInBytes"),
        wgl_h.C_INT.withName("FrameFormat")
    ).withName("_STORAGE_RPMB_DESCRIPTOR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final OfInt SizeInBytes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SizeInBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SizeInBytes
     * }
     */
    public static final OfInt SizeInBytes$layout() {
        return SizeInBytes$LAYOUT;
    }

    private static final long SizeInBytes$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SizeInBytes
     * }
     */
    public static final long SizeInBytes$offset() {
        return SizeInBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SizeInBytes
     * }
     */
    public static int SizeInBytes(MemorySegment struct) {
        return struct.get(SizeInBytes$LAYOUT, SizeInBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SizeInBytes
     * }
     */
    public static void SizeInBytes(MemorySegment struct, int fieldValue) {
        struct.set(SizeInBytes$LAYOUT, SizeInBytes$OFFSET, fieldValue);
    }

    private static final OfInt MaxReliableWriteSizeInBytes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaxReliableWriteSizeInBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaxReliableWriteSizeInBytes
     * }
     */
    public static final OfInt MaxReliableWriteSizeInBytes$layout() {
        return MaxReliableWriteSizeInBytes$LAYOUT;
    }

    private static final long MaxReliableWriteSizeInBytes$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaxReliableWriteSizeInBytes
     * }
     */
    public static final long MaxReliableWriteSizeInBytes$offset() {
        return MaxReliableWriteSizeInBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaxReliableWriteSizeInBytes
     * }
     */
    public static int MaxReliableWriteSizeInBytes(MemorySegment struct) {
        return struct.get(MaxReliableWriteSizeInBytes$LAYOUT, MaxReliableWriteSizeInBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaxReliableWriteSizeInBytes
     * }
     */
    public static void MaxReliableWriteSizeInBytes(MemorySegment struct, int fieldValue) {
        struct.set(MaxReliableWriteSizeInBytes$LAYOUT, MaxReliableWriteSizeInBytes$OFFSET, fieldValue);
    }

    private static final OfInt FrameFormat$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FrameFormat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * STORAGE_RPMB_FRAME_TYPE FrameFormat
     * }
     */
    public static final OfInt FrameFormat$layout() {
        return FrameFormat$LAYOUT;
    }

    private static final long FrameFormat$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * STORAGE_RPMB_FRAME_TYPE FrameFormat
     * }
     */
    public static final long FrameFormat$offset() {
        return FrameFormat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * STORAGE_RPMB_FRAME_TYPE FrameFormat
     * }
     */
    public static int FrameFormat(MemorySegment struct) {
        return struct.get(FrameFormat$LAYOUT, FrameFormat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * STORAGE_RPMB_FRAME_TYPE FrameFormat
     * }
     */
    public static void FrameFormat(MemorySegment struct, int fieldValue) {
        struct.set(FrameFormat$LAYOUT, FrameFormat$OFFSET, fieldValue);
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

