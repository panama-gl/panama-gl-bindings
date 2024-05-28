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
 * struct _REARRANGE_FILE_DATA {
 *     ULONGLONG SourceStartingOffset;
 *     ULONGLONG TargetOffset;
 *     HANDLE SourceFileHandle;
 *     DWORD Length;
 *     DWORD Flags;
 * }
 * }
 */
public class _REARRANGE_FILE_DATA {

    _REARRANGE_FILE_DATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG_LONG.withName("SourceStartingOffset"),
        freeglut_h.C_LONG_LONG.withName("TargetOffset"),
        freeglut_h.C_POINTER.withName("SourceFileHandle"),
        freeglut_h.C_LONG.withName("Length"),
        freeglut_h.C_LONG.withName("Flags")
    ).withName("_REARRANGE_FILE_DATA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong SourceStartingOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("SourceStartingOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG SourceStartingOffset
     * }
     */
    public static final OfLong SourceStartingOffset$layout() {
        return SourceStartingOffset$LAYOUT;
    }

    private static final long SourceStartingOffset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG SourceStartingOffset
     * }
     */
    public static final long SourceStartingOffset$offset() {
        return SourceStartingOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG SourceStartingOffset
     * }
     */
    public static long SourceStartingOffset(MemorySegment struct) {
        return struct.get(SourceStartingOffset$LAYOUT, SourceStartingOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG SourceStartingOffset
     * }
     */
    public static void SourceStartingOffset(MemorySegment struct, long fieldValue) {
        struct.set(SourceStartingOffset$LAYOUT, SourceStartingOffset$OFFSET, fieldValue);
    }

    private static final OfLong TargetOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TargetOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG TargetOffset
     * }
     */
    public static final OfLong TargetOffset$layout() {
        return TargetOffset$LAYOUT;
    }

    private static final long TargetOffset$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG TargetOffset
     * }
     */
    public static final long TargetOffset$offset() {
        return TargetOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG TargetOffset
     * }
     */
    public static long TargetOffset(MemorySegment struct) {
        return struct.get(TargetOffset$LAYOUT, TargetOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG TargetOffset
     * }
     */
    public static void TargetOffset(MemorySegment struct, long fieldValue) {
        struct.set(TargetOffset$LAYOUT, TargetOffset$OFFSET, fieldValue);
    }

    private static final AddressLayout SourceFileHandle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SourceFileHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE SourceFileHandle
     * }
     */
    public static final AddressLayout SourceFileHandle$layout() {
        return SourceFileHandle$LAYOUT;
    }

    private static final long SourceFileHandle$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE SourceFileHandle
     * }
     */
    public static final long SourceFileHandle$offset() {
        return SourceFileHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE SourceFileHandle
     * }
     */
    public static MemorySegment SourceFileHandle(MemorySegment struct) {
        return struct.get(SourceFileHandle$LAYOUT, SourceFileHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE SourceFileHandle
     * }
     */
    public static void SourceFileHandle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SourceFileHandle$LAYOUT, SourceFileHandle$OFFSET, fieldValue);
    }

    private static final OfInt Length$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static final OfInt Length$layout() {
        return Length$LAYOUT;
    }

    private static final long Length$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static final long Length$offset() {
        return Length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static int Length(MemorySegment struct) {
        return struct.get(Length$LAYOUT, Length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Length
     * }
     */
    public static void Length(MemorySegment struct, int fieldValue) {
        struct.set(Length$LAYOUT, Length$OFFSET, fieldValue);
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

    private static final long Flags$OFFSET = 28;

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

