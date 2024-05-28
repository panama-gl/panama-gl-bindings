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
 * struct _DEVICE_DSM_TIERING_QUERY_INPUT {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD Flags;
 *     DWORD NumberOfTierIds;
 *     GUID TierIds[1];
 * }
 * }
 */
public class _DEVICE_DSM_TIERING_QUERY_INPUT {

    _DEVICE_DSM_TIERING_QUERY_INPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Version"),
        wgl_h.C_LONG.withName("Size"),
        wgl_h.C_LONG.withName("Flags"),
        wgl_h.C_LONG.withName("NumberOfTierIds"),
        MemoryLayout.sequenceLayout(1, _GUID.layout()).withName("TierIds")
    ).withName("_DEVICE_DSM_TIERING_QUERY_INPUT");

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

    private static final long Flags$OFFSET = 8;

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

    private static final OfInt NumberOfTierIds$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberOfTierIds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberOfTierIds
     * }
     */
    public static final OfInt NumberOfTierIds$layout() {
        return NumberOfTierIds$LAYOUT;
    }

    private static final long NumberOfTierIds$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberOfTierIds
     * }
     */
    public static final long NumberOfTierIds$offset() {
        return NumberOfTierIds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberOfTierIds
     * }
     */
    public static int NumberOfTierIds(MemorySegment struct) {
        return struct.get(NumberOfTierIds$LAYOUT, NumberOfTierIds$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberOfTierIds
     * }
     */
    public static void NumberOfTierIds(MemorySegment struct, int fieldValue) {
        struct.set(NumberOfTierIds$LAYOUT, NumberOfTierIds$OFFSET, fieldValue);
    }

    private static final SequenceLayout TierIds$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("TierIds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID TierIds[1]
     * }
     */
    public static final SequenceLayout TierIds$layout() {
        return TierIds$LAYOUT;
    }

    private static final long TierIds$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID TierIds[1]
     * }
     */
    public static final long TierIds$offset() {
        return TierIds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID TierIds[1]
     * }
     */
    public static MemorySegment TierIds(MemorySegment struct) {
        return struct.asSlice(TierIds$OFFSET, TierIds$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID TierIds[1]
     * }
     */
    public static void TierIds(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TierIds$OFFSET, TierIds$LAYOUT.byteSize());
    }

    private static long[] TierIds$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * GUID TierIds[1]
     * }
     */
    public static long[] TierIds$dimensions() {
        return TierIds$DIMS;
    }
    private static final MethodHandle TierIds$ELEM_HANDLE = TierIds$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * GUID TierIds[1]
     * }
     */
    public static MemorySegment TierIds(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)TierIds$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * GUID TierIds[1]
     * }
     */
    public static void TierIds(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, TierIds(struct, index0), 0L, _GUID.layout().byteSize());
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

