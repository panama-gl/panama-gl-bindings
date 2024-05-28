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
 * struct _SCM_PD_FIRMWARE_SLOT_INFO {
 *     DWORD Version;
 *     DWORD Size;
 *     BYTE SlotNumber;
 *     BYTE ReadOnly : 1;
 *     BYTE Reserved0 : 7;
 *     BYTE Reserved1[6];
 *     BYTE Revision[32];
 * }
 * }
 */
public class _SCM_PD_FIRMWARE_SLOT_INFO {

    _SCM_PD_FIRMWARE_SLOT_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Version"),
        wgl_h.C_LONG.withName("Size"),
        wgl_h.C_CHAR.withName("SlotNumber"),
        MemoryLayout.paddingLayout(1),
        MemoryLayout.sequenceLayout(6, wgl_h.C_CHAR).withName("Reserved1"),
        MemoryLayout.sequenceLayout(32, wgl_h.C_CHAR).withName("Revision")
    ).withName("_SCM_PD_FIRMWARE_SLOT_INFO");

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

    private static final OfByte SlotNumber$LAYOUT = (OfByte)$LAYOUT.select(groupElement("SlotNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE SlotNumber
     * }
     */
    public static final OfByte SlotNumber$layout() {
        return SlotNumber$LAYOUT;
    }

    private static final long SlotNumber$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE SlotNumber
     * }
     */
    public static final long SlotNumber$offset() {
        return SlotNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE SlotNumber
     * }
     */
    public static byte SlotNumber(MemorySegment struct) {
        return struct.get(SlotNumber$LAYOUT, SlotNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE SlotNumber
     * }
     */
    public static void SlotNumber(MemorySegment struct, byte fieldValue) {
        struct.set(SlotNumber$LAYOUT, SlotNumber$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved1$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved1[6]
     * }
     */
    public static final SequenceLayout Reserved1$layout() {
        return Reserved1$LAYOUT;
    }

    private static final long Reserved1$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved1[6]
     * }
     */
    public static final long Reserved1$offset() {
        return Reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[6]
     * }
     */
    public static MemorySegment Reserved1(MemorySegment struct) {
        return struct.asSlice(Reserved1$OFFSET, Reserved1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[6]
     * }
     */
    public static void Reserved1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved1$OFFSET, Reserved1$LAYOUT.byteSize());
    }

    private static long[] Reserved1$DIMS = { 6 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Reserved1[6]
     * }
     */
    public static long[] Reserved1$dimensions() {
        return Reserved1$DIMS;
    }
    private static final VarHandle Reserved1$ELEM_HANDLE = Reserved1$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[6]
     * }
     */
    public static byte Reserved1(MemorySegment struct, long index0) {
        return (byte)Reserved1$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Reserved1[6]
     * }
     */
    public static void Reserved1(MemorySegment struct, long index0, byte fieldValue) {
        Reserved1$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout Revision$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Revision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Revision[32]
     * }
     */
    public static final SequenceLayout Revision$layout() {
        return Revision$LAYOUT;
    }

    private static final long Revision$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Revision[32]
     * }
     */
    public static final long Revision$offset() {
        return Revision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Revision[32]
     * }
     */
    public static MemorySegment Revision(MemorySegment struct) {
        return struct.asSlice(Revision$OFFSET, Revision$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Revision[32]
     * }
     */
    public static void Revision(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Revision$OFFSET, Revision$LAYOUT.byteSize());
    }

    private static long[] Revision$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Revision[32]
     * }
     */
    public static long[] Revision$dimensions() {
        return Revision$DIMS;
    }
    private static final VarHandle Revision$ELEM_HANDLE = Revision$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Revision[32]
     * }
     */
    public static byte Revision(MemorySegment struct, long index0) {
        return (byte)Revision$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Revision[32]
     * }
     */
    public static void Revision(MemorySegment struct, long index0, byte fieldValue) {
        Revision$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

