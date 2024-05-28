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
 * struct _DEVICE_LB_PROVISIONING_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     BYTE ThinProvisioningEnabled : 1;
 *     BYTE ThinProvisioningReadZeros : 1;
 *     BYTE AnchorSupported : 3;
 *     BYTE UnmapGranularityAlignmentValid : 1;
 *     BYTE Reserved0 : 2;
 *     BYTE Reserved1[7];
 *     DWORDLONG OptimalUnmapGranularity;
 *     DWORDLONG UnmapGranularityAlignment;
 *     DWORD MaxUnmapLbaCount;
 *     DWORD MaxUnmapBlockDescriptorCount;
 * }
 * }
 */
public class _DEVICE_LB_PROVISIONING_DESCRIPTOR {

    _DEVICE_LB_PROVISIONING_DESCRIPTOR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Version"),
        wgl_h.C_LONG.withName("Size"),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.sequenceLayout(7, wgl_h.C_CHAR).withName("Reserved1"),
        wgl_h.C_LONG_LONG.withName("OptimalUnmapGranularity"),
        wgl_h.C_LONG_LONG.withName("UnmapGranularityAlignment"),
        wgl_h.C_LONG.withName("MaxUnmapLbaCount"),
        wgl_h.C_LONG.withName("MaxUnmapBlockDescriptorCount")
    ).withName("_DEVICE_LB_PROVISIONING_DESCRIPTOR");

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

    private static final SequenceLayout Reserved1$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved1[7]
     * }
     */
    public static final SequenceLayout Reserved1$layout() {
        return Reserved1$LAYOUT;
    }

    private static final long Reserved1$OFFSET = 9;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved1[7]
     * }
     */
    public static final long Reserved1$offset() {
        return Reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[7]
     * }
     */
    public static MemorySegment Reserved1(MemorySegment struct) {
        return struct.asSlice(Reserved1$OFFSET, Reserved1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[7]
     * }
     */
    public static void Reserved1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved1$OFFSET, Reserved1$LAYOUT.byteSize());
    }

    private static long[] Reserved1$DIMS = { 7 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Reserved1[7]
     * }
     */
    public static long[] Reserved1$dimensions() {
        return Reserved1$DIMS;
    }
    private static final VarHandle Reserved1$ELEM_HANDLE = Reserved1$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[7]
     * }
     */
    public static byte Reserved1(MemorySegment struct, long index0) {
        return (byte)Reserved1$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[7]
     * }
     */
    public static void Reserved1(MemorySegment struct, long index0, byte fieldValue) {
        Reserved1$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong OptimalUnmapGranularity$LAYOUT = (OfLong)$LAYOUT.select(groupElement("OptimalUnmapGranularity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG OptimalUnmapGranularity
     * }
     */
    public static final OfLong OptimalUnmapGranularity$layout() {
        return OptimalUnmapGranularity$LAYOUT;
    }

    private static final long OptimalUnmapGranularity$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG OptimalUnmapGranularity
     * }
     */
    public static final long OptimalUnmapGranularity$offset() {
        return OptimalUnmapGranularity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG OptimalUnmapGranularity
     * }
     */
    public static long OptimalUnmapGranularity(MemorySegment struct) {
        return struct.get(OptimalUnmapGranularity$LAYOUT, OptimalUnmapGranularity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG OptimalUnmapGranularity
     * }
     */
    public static void OptimalUnmapGranularity(MemorySegment struct, long fieldValue) {
        struct.set(OptimalUnmapGranularity$LAYOUT, OptimalUnmapGranularity$OFFSET, fieldValue);
    }

    private static final OfLong UnmapGranularityAlignment$LAYOUT = (OfLong)$LAYOUT.select(groupElement("UnmapGranularityAlignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG UnmapGranularityAlignment
     * }
     */
    public static final OfLong UnmapGranularityAlignment$layout() {
        return UnmapGranularityAlignment$LAYOUT;
    }

    private static final long UnmapGranularityAlignment$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG UnmapGranularityAlignment
     * }
     */
    public static final long UnmapGranularityAlignment$offset() {
        return UnmapGranularityAlignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG UnmapGranularityAlignment
     * }
     */
    public static long UnmapGranularityAlignment(MemorySegment struct) {
        return struct.get(UnmapGranularityAlignment$LAYOUT, UnmapGranularityAlignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG UnmapGranularityAlignment
     * }
     */
    public static void UnmapGranularityAlignment(MemorySegment struct, long fieldValue) {
        struct.set(UnmapGranularityAlignment$LAYOUT, UnmapGranularityAlignment$OFFSET, fieldValue);
    }

    private static final OfInt MaxUnmapLbaCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaxUnmapLbaCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaxUnmapLbaCount
     * }
     */
    public static final OfInt MaxUnmapLbaCount$layout() {
        return MaxUnmapLbaCount$LAYOUT;
    }

    private static final long MaxUnmapLbaCount$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaxUnmapLbaCount
     * }
     */
    public static final long MaxUnmapLbaCount$offset() {
        return MaxUnmapLbaCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaxUnmapLbaCount
     * }
     */
    public static int MaxUnmapLbaCount(MemorySegment struct) {
        return struct.get(MaxUnmapLbaCount$LAYOUT, MaxUnmapLbaCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaxUnmapLbaCount
     * }
     */
    public static void MaxUnmapLbaCount(MemorySegment struct, int fieldValue) {
        struct.set(MaxUnmapLbaCount$LAYOUT, MaxUnmapLbaCount$OFFSET, fieldValue);
    }

    private static final OfInt MaxUnmapBlockDescriptorCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaxUnmapBlockDescriptorCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaxUnmapBlockDescriptorCount
     * }
     */
    public static final OfInt MaxUnmapBlockDescriptorCount$layout() {
        return MaxUnmapBlockDescriptorCount$LAYOUT;
    }

    private static final long MaxUnmapBlockDescriptorCount$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaxUnmapBlockDescriptorCount
     * }
     */
    public static final long MaxUnmapBlockDescriptorCount$offset() {
        return MaxUnmapBlockDescriptorCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaxUnmapBlockDescriptorCount
     * }
     */
    public static int MaxUnmapBlockDescriptorCount(MemorySegment struct) {
        return struct.get(MaxUnmapBlockDescriptorCount$LAYOUT, MaxUnmapBlockDescriptorCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaxUnmapBlockDescriptorCount
     * }
     */
    public static void MaxUnmapBlockDescriptorCount(MemorySegment struct, int fieldValue) {
        struct.set(MaxUnmapBlockDescriptorCount$LAYOUT, MaxUnmapBlockDescriptorCount$OFFSET, fieldValue);
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

