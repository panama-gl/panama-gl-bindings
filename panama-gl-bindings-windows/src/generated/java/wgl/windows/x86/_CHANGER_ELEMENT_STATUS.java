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
 * struct _CHANGER_ELEMENT_STATUS {
 *     CHANGER_ELEMENT Element;
 *     CHANGER_ELEMENT SrcElementAddress;
 *     DWORD Flags;
 *     DWORD ExceptionCode;
 *     BYTE TargetId;
 *     BYTE Lun;
 *     WORD Reserved;
 *     BYTE PrimaryVolumeID[36];
 *     BYTE AlternateVolumeID[36];
 * }
 * }
 */
public class _CHANGER_ELEMENT_STATUS {

    _CHANGER_ELEMENT_STATUS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _CHANGER_ELEMENT.layout().withName("Element"),
        _CHANGER_ELEMENT.layout().withName("SrcElementAddress"),
        wgl_h.C_LONG.withName("Flags"),
        wgl_h.C_LONG.withName("ExceptionCode"),
        wgl_h.C_CHAR.withName("TargetId"),
        wgl_h.C_CHAR.withName("Lun"),
        wgl_h.C_SHORT.withName("Reserved"),
        MemoryLayout.sequenceLayout(36, wgl_h.C_CHAR).withName("PrimaryVolumeID"),
        MemoryLayout.sequenceLayout(36, wgl_h.C_CHAR).withName("AlternateVolumeID")
    ).withName("_CHANGER_ELEMENT_STATUS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout Element$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Element"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Element
     * }
     */
    public static final GroupLayout Element$layout() {
        return Element$LAYOUT;
    }

    private static final long Element$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Element
     * }
     */
    public static final long Element$offset() {
        return Element$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Element
     * }
     */
    public static MemorySegment Element(MemorySegment struct) {
        return struct.asSlice(Element$OFFSET, Element$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Element
     * }
     */
    public static void Element(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Element$OFFSET, Element$LAYOUT.byteSize());
    }

    private static final GroupLayout SrcElementAddress$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SrcElementAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT SrcElementAddress
     * }
     */
    public static final GroupLayout SrcElementAddress$layout() {
        return SrcElementAddress$LAYOUT;
    }

    private static final long SrcElementAddress$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT SrcElementAddress
     * }
     */
    public static final long SrcElementAddress$offset() {
        return SrcElementAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT SrcElementAddress
     * }
     */
    public static MemorySegment SrcElementAddress(MemorySegment struct) {
        return struct.asSlice(SrcElementAddress$OFFSET, SrcElementAddress$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT SrcElementAddress
     * }
     */
    public static void SrcElementAddress(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SrcElementAddress$OFFSET, SrcElementAddress$LAYOUT.byteSize());
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

    private static final long Flags$OFFSET = 16;

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

    private static final OfInt ExceptionCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ExceptionCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ExceptionCode
     * }
     */
    public static final OfInt ExceptionCode$layout() {
        return ExceptionCode$LAYOUT;
    }

    private static final long ExceptionCode$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ExceptionCode
     * }
     */
    public static final long ExceptionCode$offset() {
        return ExceptionCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ExceptionCode
     * }
     */
    public static int ExceptionCode(MemorySegment struct) {
        return struct.get(ExceptionCode$LAYOUT, ExceptionCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ExceptionCode
     * }
     */
    public static void ExceptionCode(MemorySegment struct, int fieldValue) {
        struct.set(ExceptionCode$LAYOUT, ExceptionCode$OFFSET, fieldValue);
    }

    private static final OfByte TargetId$LAYOUT = (OfByte)$LAYOUT.select(groupElement("TargetId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE TargetId
     * }
     */
    public static final OfByte TargetId$layout() {
        return TargetId$LAYOUT;
    }

    private static final long TargetId$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE TargetId
     * }
     */
    public static final long TargetId$offset() {
        return TargetId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE TargetId
     * }
     */
    public static byte TargetId(MemorySegment struct) {
        return struct.get(TargetId$LAYOUT, TargetId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE TargetId
     * }
     */
    public static void TargetId(MemorySegment struct, byte fieldValue) {
        struct.set(TargetId$LAYOUT, TargetId$OFFSET, fieldValue);
    }

    private static final OfByte Lun$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Lun"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Lun
     * }
     */
    public static final OfByte Lun$layout() {
        return Lun$LAYOUT;
    }

    private static final long Lun$OFFSET = 25;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Lun
     * }
     */
    public static final long Lun$offset() {
        return Lun$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Lun
     * }
     */
    public static byte Lun(MemorySegment struct) {
        return struct.get(Lun$LAYOUT, Lun$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Lun
     * }
     */
    public static void Lun(MemorySegment struct, byte fieldValue) {
        struct.set(Lun$LAYOUT, Lun$OFFSET, fieldValue);
    }

    private static final OfShort Reserved$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final OfShort Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 26;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static short Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, short fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final SequenceLayout PrimaryVolumeID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("PrimaryVolumeID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE PrimaryVolumeID[36]
     * }
     */
    public static final SequenceLayout PrimaryVolumeID$layout() {
        return PrimaryVolumeID$LAYOUT;
    }

    private static final long PrimaryVolumeID$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE PrimaryVolumeID[36]
     * }
     */
    public static final long PrimaryVolumeID$offset() {
        return PrimaryVolumeID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE PrimaryVolumeID[36]
     * }
     */
    public static MemorySegment PrimaryVolumeID(MemorySegment struct) {
        return struct.asSlice(PrimaryVolumeID$OFFSET, PrimaryVolumeID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE PrimaryVolumeID[36]
     * }
     */
    public static void PrimaryVolumeID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, PrimaryVolumeID$OFFSET, PrimaryVolumeID$LAYOUT.byteSize());
    }

    private static long[] PrimaryVolumeID$DIMS = { 36 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE PrimaryVolumeID[36]
     * }
     */
    public static long[] PrimaryVolumeID$dimensions() {
        return PrimaryVolumeID$DIMS;
    }
    private static final VarHandle PrimaryVolumeID$ELEM_HANDLE = PrimaryVolumeID$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE PrimaryVolumeID[36]
     * }
     */
    public static byte PrimaryVolumeID(MemorySegment struct, long index0) {
        return (byte)PrimaryVolumeID$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE PrimaryVolumeID[36]
     * }
     */
    public static void PrimaryVolumeID(MemorySegment struct, long index0, byte fieldValue) {
        PrimaryVolumeID$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout AlternateVolumeID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("AlternateVolumeID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE AlternateVolumeID[36]
     * }
     */
    public static final SequenceLayout AlternateVolumeID$layout() {
        return AlternateVolumeID$LAYOUT;
    }

    private static final long AlternateVolumeID$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE AlternateVolumeID[36]
     * }
     */
    public static final long AlternateVolumeID$offset() {
        return AlternateVolumeID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE AlternateVolumeID[36]
     * }
     */
    public static MemorySegment AlternateVolumeID(MemorySegment struct) {
        return struct.asSlice(AlternateVolumeID$OFFSET, AlternateVolumeID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE AlternateVolumeID[36]
     * }
     */
    public static void AlternateVolumeID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, AlternateVolumeID$OFFSET, AlternateVolumeID$LAYOUT.byteSize());
    }

    private static long[] AlternateVolumeID$DIMS = { 36 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE AlternateVolumeID[36]
     * }
     */
    public static long[] AlternateVolumeID$dimensions() {
        return AlternateVolumeID$DIMS;
    }
    private static final VarHandle AlternateVolumeID$ELEM_HANDLE = AlternateVolumeID$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE AlternateVolumeID[36]
     * }
     */
    public static byte AlternateVolumeID(MemorySegment struct, long index0) {
        return (byte)AlternateVolumeID$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE AlternateVolumeID[36]
     * }
     */
    public static void AlternateVolumeID(MemorySegment struct, long index0, byte fieldValue) {
        AlternateVolumeID$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

