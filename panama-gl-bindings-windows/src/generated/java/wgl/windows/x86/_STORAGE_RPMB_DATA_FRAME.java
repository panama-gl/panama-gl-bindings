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
 * struct _STORAGE_RPMB_DATA_FRAME {
 *     BYTE Stuff[196];
 *     BYTE KeyOrMAC[32];
 *     BYTE Data[256];
 *     BYTE Nonce[16];
 *     BYTE WriteCounter[4];
 *     BYTE Address[2];
 *     BYTE BlockCount[2];
 *     BYTE OperationResult[2];
 *     BYTE RequestOrResponseType[2];
 * }
 * }
 */
public class _STORAGE_RPMB_DATA_FRAME {

    _STORAGE_RPMB_DATA_FRAME() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(196, wgl_h.C_CHAR).withName("Stuff"),
        MemoryLayout.sequenceLayout(32, wgl_h.C_CHAR).withName("KeyOrMAC"),
        MemoryLayout.sequenceLayout(256, wgl_h.C_CHAR).withName("Data"),
        MemoryLayout.sequenceLayout(16, wgl_h.C_CHAR).withName("Nonce"),
        MemoryLayout.sequenceLayout(4, wgl_h.C_CHAR).withName("WriteCounter"),
        MemoryLayout.sequenceLayout(2, wgl_h.C_CHAR).withName("Address"),
        MemoryLayout.sequenceLayout(2, wgl_h.C_CHAR).withName("BlockCount"),
        MemoryLayout.sequenceLayout(2, wgl_h.C_CHAR).withName("OperationResult"),
        MemoryLayout.sequenceLayout(2, wgl_h.C_CHAR).withName("RequestOrResponseType")
    ).withName("_STORAGE_RPMB_DATA_FRAME");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout Stuff$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Stuff"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Stuff[196]
     * }
     */
    public static final SequenceLayout Stuff$layout() {
        return Stuff$LAYOUT;
    }

    private static final long Stuff$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Stuff[196]
     * }
     */
    public static final long Stuff$offset() {
        return Stuff$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Stuff[196]
     * }
     */
    public static MemorySegment Stuff(MemorySegment struct) {
        return struct.asSlice(Stuff$OFFSET, Stuff$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Stuff[196]
     * }
     */
    public static void Stuff(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Stuff$OFFSET, Stuff$LAYOUT.byteSize());
    }

    private static long[] Stuff$DIMS = { 196 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Stuff[196]
     * }
     */
    public static long[] Stuff$dimensions() {
        return Stuff$DIMS;
    }
    private static final VarHandle Stuff$ELEM_HANDLE = Stuff$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Stuff[196]
     * }
     */
    public static byte Stuff(MemorySegment struct, long index0) {
        return (byte)Stuff$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Stuff[196]
     * }
     */
    public static void Stuff(MemorySegment struct, long index0, byte fieldValue) {
        Stuff$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout KeyOrMAC$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("KeyOrMAC"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE KeyOrMAC[32]
     * }
     */
    public static final SequenceLayout KeyOrMAC$layout() {
        return KeyOrMAC$LAYOUT;
    }

    private static final long KeyOrMAC$OFFSET = 196;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE KeyOrMAC[32]
     * }
     */
    public static final long KeyOrMAC$offset() {
        return KeyOrMAC$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE KeyOrMAC[32]
     * }
     */
    public static MemorySegment KeyOrMAC(MemorySegment struct) {
        return struct.asSlice(KeyOrMAC$OFFSET, KeyOrMAC$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE KeyOrMAC[32]
     * }
     */
    public static void KeyOrMAC(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, KeyOrMAC$OFFSET, KeyOrMAC$LAYOUT.byteSize());
    }

    private static long[] KeyOrMAC$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE KeyOrMAC[32]
     * }
     */
    public static long[] KeyOrMAC$dimensions() {
        return KeyOrMAC$DIMS;
    }
    private static final VarHandle KeyOrMAC$ELEM_HANDLE = KeyOrMAC$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE KeyOrMAC[32]
     * }
     */
    public static byte KeyOrMAC(MemorySegment struct, long index0) {
        return (byte)KeyOrMAC$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE KeyOrMAC[32]
     * }
     */
    public static void KeyOrMAC(MemorySegment struct, long index0, byte fieldValue) {
        KeyOrMAC$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout Data$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Data[256]
     * }
     */
    public static final SequenceLayout Data$layout() {
        return Data$LAYOUT;
    }

    private static final long Data$OFFSET = 228;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Data[256]
     * }
     */
    public static final long Data$offset() {
        return Data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Data[256]
     * }
     */
    public static MemorySegment Data(MemorySegment struct) {
        return struct.asSlice(Data$OFFSET, Data$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Data[256]
     * }
     */
    public static void Data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Data$OFFSET, Data$LAYOUT.byteSize());
    }

    private static long[] Data$DIMS = { 256 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Data[256]
     * }
     */
    public static long[] Data$dimensions() {
        return Data$DIMS;
    }
    private static final VarHandle Data$ELEM_HANDLE = Data$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Data[256]
     * }
     */
    public static byte Data(MemorySegment struct, long index0) {
        return (byte)Data$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Data[256]
     * }
     */
    public static void Data(MemorySegment struct, long index0, byte fieldValue) {
        Data$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout Nonce$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Nonce"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Nonce[16]
     * }
     */
    public static final SequenceLayout Nonce$layout() {
        return Nonce$LAYOUT;
    }

    private static final long Nonce$OFFSET = 484;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Nonce[16]
     * }
     */
    public static final long Nonce$offset() {
        return Nonce$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Nonce[16]
     * }
     */
    public static MemorySegment Nonce(MemorySegment struct) {
        return struct.asSlice(Nonce$OFFSET, Nonce$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Nonce[16]
     * }
     */
    public static void Nonce(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Nonce$OFFSET, Nonce$LAYOUT.byteSize());
    }

    private static long[] Nonce$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Nonce[16]
     * }
     */
    public static long[] Nonce$dimensions() {
        return Nonce$DIMS;
    }
    private static final VarHandle Nonce$ELEM_HANDLE = Nonce$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Nonce[16]
     * }
     */
    public static byte Nonce(MemorySegment struct, long index0) {
        return (byte)Nonce$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Nonce[16]
     * }
     */
    public static void Nonce(MemorySegment struct, long index0, byte fieldValue) {
        Nonce$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout WriteCounter$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("WriteCounter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE WriteCounter[4]
     * }
     */
    public static final SequenceLayout WriteCounter$layout() {
        return WriteCounter$LAYOUT;
    }

    private static final long WriteCounter$OFFSET = 500;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE WriteCounter[4]
     * }
     */
    public static final long WriteCounter$offset() {
        return WriteCounter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE WriteCounter[4]
     * }
     */
    public static MemorySegment WriteCounter(MemorySegment struct) {
        return struct.asSlice(WriteCounter$OFFSET, WriteCounter$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE WriteCounter[4]
     * }
     */
    public static void WriteCounter(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, WriteCounter$OFFSET, WriteCounter$LAYOUT.byteSize());
    }

    private static long[] WriteCounter$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE WriteCounter[4]
     * }
     */
    public static long[] WriteCounter$dimensions() {
        return WriteCounter$DIMS;
    }
    private static final VarHandle WriteCounter$ELEM_HANDLE = WriteCounter$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE WriteCounter[4]
     * }
     */
    public static byte WriteCounter(MemorySegment struct, long index0) {
        return (byte)WriteCounter$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE WriteCounter[4]
     * }
     */
    public static void WriteCounter(MemorySegment struct, long index0, byte fieldValue) {
        WriteCounter$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout Address$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Address"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Address[2]
     * }
     */
    public static final SequenceLayout Address$layout() {
        return Address$LAYOUT;
    }

    private static final long Address$OFFSET = 504;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Address[2]
     * }
     */
    public static final long Address$offset() {
        return Address$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Address[2]
     * }
     */
    public static MemorySegment Address(MemorySegment struct) {
        return struct.asSlice(Address$OFFSET, Address$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Address[2]
     * }
     */
    public static void Address(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Address$OFFSET, Address$LAYOUT.byteSize());
    }

    private static long[] Address$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Address[2]
     * }
     */
    public static long[] Address$dimensions() {
        return Address$DIMS;
    }
    private static final VarHandle Address$ELEM_HANDLE = Address$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Address[2]
     * }
     */
    public static byte Address(MemorySegment struct, long index0) {
        return (byte)Address$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Address[2]
     * }
     */
    public static void Address(MemorySegment struct, long index0, byte fieldValue) {
        Address$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout BlockCount$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("BlockCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE BlockCount[2]
     * }
     */
    public static final SequenceLayout BlockCount$layout() {
        return BlockCount$LAYOUT;
    }

    private static final long BlockCount$OFFSET = 506;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE BlockCount[2]
     * }
     */
    public static final long BlockCount$offset() {
        return BlockCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE BlockCount[2]
     * }
     */
    public static MemorySegment BlockCount(MemorySegment struct) {
        return struct.asSlice(BlockCount$OFFSET, BlockCount$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE BlockCount[2]
     * }
     */
    public static void BlockCount(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, BlockCount$OFFSET, BlockCount$LAYOUT.byteSize());
    }

    private static long[] BlockCount$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE BlockCount[2]
     * }
     */
    public static long[] BlockCount$dimensions() {
        return BlockCount$DIMS;
    }
    private static final VarHandle BlockCount$ELEM_HANDLE = BlockCount$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE BlockCount[2]
     * }
     */
    public static byte BlockCount(MemorySegment struct, long index0) {
        return (byte)BlockCount$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE BlockCount[2]
     * }
     */
    public static void BlockCount(MemorySegment struct, long index0, byte fieldValue) {
        BlockCount$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout OperationResult$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("OperationResult"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE OperationResult[2]
     * }
     */
    public static final SequenceLayout OperationResult$layout() {
        return OperationResult$LAYOUT;
    }

    private static final long OperationResult$OFFSET = 508;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE OperationResult[2]
     * }
     */
    public static final long OperationResult$offset() {
        return OperationResult$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE OperationResult[2]
     * }
     */
    public static MemorySegment OperationResult(MemorySegment struct) {
        return struct.asSlice(OperationResult$OFFSET, OperationResult$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE OperationResult[2]
     * }
     */
    public static void OperationResult(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, OperationResult$OFFSET, OperationResult$LAYOUT.byteSize());
    }

    private static long[] OperationResult$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE OperationResult[2]
     * }
     */
    public static long[] OperationResult$dimensions() {
        return OperationResult$DIMS;
    }
    private static final VarHandle OperationResult$ELEM_HANDLE = OperationResult$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE OperationResult[2]
     * }
     */
    public static byte OperationResult(MemorySegment struct, long index0) {
        return (byte)OperationResult$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE OperationResult[2]
     * }
     */
    public static void OperationResult(MemorySegment struct, long index0, byte fieldValue) {
        OperationResult$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout RequestOrResponseType$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("RequestOrResponseType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE RequestOrResponseType[2]
     * }
     */
    public static final SequenceLayout RequestOrResponseType$layout() {
        return RequestOrResponseType$LAYOUT;
    }

    private static final long RequestOrResponseType$OFFSET = 510;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE RequestOrResponseType[2]
     * }
     */
    public static final long RequestOrResponseType$offset() {
        return RequestOrResponseType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE RequestOrResponseType[2]
     * }
     */
    public static MemorySegment RequestOrResponseType(MemorySegment struct) {
        return struct.asSlice(RequestOrResponseType$OFFSET, RequestOrResponseType$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE RequestOrResponseType[2]
     * }
     */
    public static void RequestOrResponseType(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, RequestOrResponseType$OFFSET, RequestOrResponseType$LAYOUT.byteSize());
    }

    private static long[] RequestOrResponseType$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE RequestOrResponseType[2]
     * }
     */
    public static long[] RequestOrResponseType$dimensions() {
        return RequestOrResponseType$DIMS;
    }
    private static final VarHandle RequestOrResponseType$ELEM_HANDLE = RequestOrResponseType$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE RequestOrResponseType[2]
     * }
     */
    public static byte RequestOrResponseType(MemorySegment struct, long index0) {
        return (byte)RequestOrResponseType$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE RequestOrResponseType[2]
     * }
     */
    public static void RequestOrResponseType(MemorySegment struct, long index0, byte fieldValue) {
        RequestOrResponseType$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

