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
 * struct _DEVICE_DSM_NOTIFICATION_PARAMETERS {
 *     DWORD Size;
 *     DWORD Flags;
 *     DWORD NumFileTypeIDs;
 *     GUID FileTypeID[1];
 * }
 * }
 */
public class _DEVICE_DSM_NOTIFICATION_PARAMETERS {

    _DEVICE_DSM_NOTIFICATION_PARAMETERS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Size"),
        wgl_h.C_LONG.withName("Flags"),
        wgl_h.C_LONG.withName("NumFileTypeIDs"),
        MemoryLayout.sequenceLayout(1, _GUID.layout()).withName("FileTypeID")
    ).withName("_DEVICE_DSM_NOTIFICATION_PARAMETERS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final long Size$OFFSET = 0;

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

    private static final long Flags$OFFSET = 4;

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

    private static final OfInt NumFileTypeIDs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumFileTypeIDs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumFileTypeIDs
     * }
     */
    public static final OfInt NumFileTypeIDs$layout() {
        return NumFileTypeIDs$LAYOUT;
    }

    private static final long NumFileTypeIDs$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumFileTypeIDs
     * }
     */
    public static final long NumFileTypeIDs$offset() {
        return NumFileTypeIDs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumFileTypeIDs
     * }
     */
    public static int NumFileTypeIDs(MemorySegment struct) {
        return struct.get(NumFileTypeIDs$LAYOUT, NumFileTypeIDs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumFileTypeIDs
     * }
     */
    public static void NumFileTypeIDs(MemorySegment struct, int fieldValue) {
        struct.set(NumFileTypeIDs$LAYOUT, NumFileTypeIDs$OFFSET, fieldValue);
    }

    private static final SequenceLayout FileTypeID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("FileTypeID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID FileTypeID[1]
     * }
     */
    public static final SequenceLayout FileTypeID$layout() {
        return FileTypeID$LAYOUT;
    }

    private static final long FileTypeID$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID FileTypeID[1]
     * }
     */
    public static final long FileTypeID$offset() {
        return FileTypeID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID FileTypeID[1]
     * }
     */
    public static MemorySegment FileTypeID(MemorySegment struct) {
        return struct.asSlice(FileTypeID$OFFSET, FileTypeID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID FileTypeID[1]
     * }
     */
    public static void FileTypeID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FileTypeID$OFFSET, FileTypeID$LAYOUT.byteSize());
    }

    private static long[] FileTypeID$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * GUID FileTypeID[1]
     * }
     */
    public static long[] FileTypeID$dimensions() {
        return FileTypeID$DIMS;
    }
    private static final MethodHandle FileTypeID$ELEM_HANDLE = FileTypeID$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * GUID FileTypeID[1]
     * }
     */
    public static MemorySegment FileTypeID(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)FileTypeID$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * GUID FileTypeID[1]
     * }
     */
    public static void FileTypeID(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, FileTypeID(struct, index0), 0L, _GUID.layout().byteSize());
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

