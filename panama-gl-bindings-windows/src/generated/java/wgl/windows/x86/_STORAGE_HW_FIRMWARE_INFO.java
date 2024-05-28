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
 * struct _STORAGE_HW_FIRMWARE_INFO {
 *     DWORD Version;
 *     DWORD Size;
 *     BYTE SupportUpgrade : 1;
 *     BYTE Reserved0 : 7;
 *     BYTE SlotCount;
 *     BYTE ActiveSlot;
 *     BYTE PendingActivateSlot;
 *     BOOLEAN FirmwareShared;
 *     BYTE Reserved[3];
 *     DWORD ImagePayloadAlignment;
 *     DWORD ImagePayloadMaxSize;
 *     STORAGE_HW_FIRMWARE_SLOT_INFO Slot[1];
 * }
 * }
 */
public class _STORAGE_HW_FIRMWARE_INFO {

    _STORAGE_HW_FIRMWARE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Version"),
        wgl_h.C_LONG.withName("Size"),
        MemoryLayout.paddingLayout(1),
        wgl_h.C_CHAR.withName("SlotCount"),
        wgl_h.C_CHAR.withName("ActiveSlot"),
        wgl_h.C_CHAR.withName("PendingActivateSlot"),
        wgl_h.C_CHAR.withName("FirmwareShared"),
        MemoryLayout.sequenceLayout(3, wgl_h.C_CHAR).withName("Reserved"),
        wgl_h.C_LONG.withName("ImagePayloadAlignment"),
        wgl_h.C_LONG.withName("ImagePayloadMaxSize"),
        MemoryLayout.sequenceLayout(1, _STORAGE_HW_FIRMWARE_SLOT_INFO.layout()).withName("Slot")
    ).withName("_STORAGE_HW_FIRMWARE_INFO");

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

    private static final OfByte SlotCount$LAYOUT = (OfByte)$LAYOUT.select(groupElement("SlotCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE SlotCount
     * }
     */
    public static final OfByte SlotCount$layout() {
        return SlotCount$LAYOUT;
    }

    private static final long SlotCount$OFFSET = 9;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE SlotCount
     * }
     */
    public static final long SlotCount$offset() {
        return SlotCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE SlotCount
     * }
     */
    public static byte SlotCount(MemorySegment struct) {
        return struct.get(SlotCount$LAYOUT, SlotCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE SlotCount
     * }
     */
    public static void SlotCount(MemorySegment struct, byte fieldValue) {
        struct.set(SlotCount$LAYOUT, SlotCount$OFFSET, fieldValue);
    }

    private static final OfByte ActiveSlot$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ActiveSlot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ActiveSlot
     * }
     */
    public static final OfByte ActiveSlot$layout() {
        return ActiveSlot$LAYOUT;
    }

    private static final long ActiveSlot$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ActiveSlot
     * }
     */
    public static final long ActiveSlot$offset() {
        return ActiveSlot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ActiveSlot
     * }
     */
    public static byte ActiveSlot(MemorySegment struct) {
        return struct.get(ActiveSlot$LAYOUT, ActiveSlot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ActiveSlot
     * }
     */
    public static void ActiveSlot(MemorySegment struct, byte fieldValue) {
        struct.set(ActiveSlot$LAYOUT, ActiveSlot$OFFSET, fieldValue);
    }

    private static final OfByte PendingActivateSlot$LAYOUT = (OfByte)$LAYOUT.select(groupElement("PendingActivateSlot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE PendingActivateSlot
     * }
     */
    public static final OfByte PendingActivateSlot$layout() {
        return PendingActivateSlot$LAYOUT;
    }

    private static final long PendingActivateSlot$OFFSET = 11;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE PendingActivateSlot
     * }
     */
    public static final long PendingActivateSlot$offset() {
        return PendingActivateSlot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE PendingActivateSlot
     * }
     */
    public static byte PendingActivateSlot(MemorySegment struct) {
        return struct.get(PendingActivateSlot$LAYOUT, PendingActivateSlot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE PendingActivateSlot
     * }
     */
    public static void PendingActivateSlot(MemorySegment struct, byte fieldValue) {
        struct.set(PendingActivateSlot$LAYOUT, PendingActivateSlot$OFFSET, fieldValue);
    }

    private static final OfByte FirmwareShared$LAYOUT = (OfByte)$LAYOUT.select(groupElement("FirmwareShared"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN FirmwareShared
     * }
     */
    public static final OfByte FirmwareShared$layout() {
        return FirmwareShared$LAYOUT;
    }

    private static final long FirmwareShared$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN FirmwareShared
     * }
     */
    public static final long FirmwareShared$offset() {
        return FirmwareShared$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN FirmwareShared
     * }
     */
    public static byte FirmwareShared(MemorySegment struct) {
        return struct.get(FirmwareShared$LAYOUT, FirmwareShared$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN FirmwareShared
     * }
     */
    public static void FirmwareShared(MemorySegment struct, byte fieldValue) {
        struct.set(FirmwareShared$LAYOUT, FirmwareShared$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 13;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static byte Reserved(MemorySegment struct, long index0) {
        return (byte)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, byte fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt ImagePayloadAlignment$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ImagePayloadAlignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ImagePayloadAlignment
     * }
     */
    public static final OfInt ImagePayloadAlignment$layout() {
        return ImagePayloadAlignment$LAYOUT;
    }

    private static final long ImagePayloadAlignment$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ImagePayloadAlignment
     * }
     */
    public static final long ImagePayloadAlignment$offset() {
        return ImagePayloadAlignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ImagePayloadAlignment
     * }
     */
    public static int ImagePayloadAlignment(MemorySegment struct) {
        return struct.get(ImagePayloadAlignment$LAYOUT, ImagePayloadAlignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ImagePayloadAlignment
     * }
     */
    public static void ImagePayloadAlignment(MemorySegment struct, int fieldValue) {
        struct.set(ImagePayloadAlignment$LAYOUT, ImagePayloadAlignment$OFFSET, fieldValue);
    }

    private static final OfInt ImagePayloadMaxSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ImagePayloadMaxSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ImagePayloadMaxSize
     * }
     */
    public static final OfInt ImagePayloadMaxSize$layout() {
        return ImagePayloadMaxSize$LAYOUT;
    }

    private static final long ImagePayloadMaxSize$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ImagePayloadMaxSize
     * }
     */
    public static final long ImagePayloadMaxSize$offset() {
        return ImagePayloadMaxSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ImagePayloadMaxSize
     * }
     */
    public static int ImagePayloadMaxSize(MemorySegment struct) {
        return struct.get(ImagePayloadMaxSize$LAYOUT, ImagePayloadMaxSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ImagePayloadMaxSize
     * }
     */
    public static void ImagePayloadMaxSize(MemorySegment struct, int fieldValue) {
        struct.set(ImagePayloadMaxSize$LAYOUT, ImagePayloadMaxSize$OFFSET, fieldValue);
    }

    private static final SequenceLayout Slot$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Slot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * STORAGE_HW_FIRMWARE_SLOT_INFO Slot[1]
     * }
     */
    public static final SequenceLayout Slot$layout() {
        return Slot$LAYOUT;
    }

    private static final long Slot$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * STORAGE_HW_FIRMWARE_SLOT_INFO Slot[1]
     * }
     */
    public static final long Slot$offset() {
        return Slot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * STORAGE_HW_FIRMWARE_SLOT_INFO Slot[1]
     * }
     */
    public static MemorySegment Slot(MemorySegment struct) {
        return struct.asSlice(Slot$OFFSET, Slot$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * STORAGE_HW_FIRMWARE_SLOT_INFO Slot[1]
     * }
     */
    public static void Slot(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Slot$OFFSET, Slot$LAYOUT.byteSize());
    }

    private static long[] Slot$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * STORAGE_HW_FIRMWARE_SLOT_INFO Slot[1]
     * }
     */
    public static long[] Slot$dimensions() {
        return Slot$DIMS;
    }
    private static final MethodHandle Slot$ELEM_HANDLE = Slot$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * STORAGE_HW_FIRMWARE_SLOT_INFO Slot[1]
     * }
     */
    public static MemorySegment Slot(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)Slot$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * STORAGE_HW_FIRMWARE_SLOT_INFO Slot[1]
     * }
     */
    public static void Slot(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, Slot(struct, index0), 0L, _STORAGE_HW_FIRMWARE_SLOT_INFO.layout().byteSize());
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

