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
 * struct _STORAGE_PROTOCOL_COMMAND {
 *     DWORD Version;
 *     DWORD Length;
 *     STORAGE_PROTOCOL_TYPE ProtocolType;
 *     DWORD Flags;
 *     DWORD ReturnStatus;
 *     DWORD ErrorCode;
 *     DWORD CommandLength;
 *     DWORD ErrorInfoLength;
 *     DWORD DataToDeviceTransferLength;
 *     DWORD DataFromDeviceTransferLength;
 *     DWORD TimeOutValue;
 *     DWORD ErrorInfoOffset;
 *     DWORD DataToDeviceBufferOffset;
 *     DWORD DataFromDeviceBufferOffset;
 *     DWORD CommandSpecific;
 *     DWORD Reserved0;
 *     DWORD FixedProtocolReturnData;
 *     DWORD Reserved1[3];
 *     BYTE Command[1];
 * }
 * }
 */
public class _STORAGE_PROTOCOL_COMMAND {

    _STORAGE_PROTOCOL_COMMAND() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Version"),
        wgl_h.C_LONG.withName("Length"),
        wgl_h.C_INT.withName("ProtocolType"),
        wgl_h.C_LONG.withName("Flags"),
        wgl_h.C_LONG.withName("ReturnStatus"),
        wgl_h.C_LONG.withName("ErrorCode"),
        wgl_h.C_LONG.withName("CommandLength"),
        wgl_h.C_LONG.withName("ErrorInfoLength"),
        wgl_h.C_LONG.withName("DataToDeviceTransferLength"),
        wgl_h.C_LONG.withName("DataFromDeviceTransferLength"),
        wgl_h.C_LONG.withName("TimeOutValue"),
        wgl_h.C_LONG.withName("ErrorInfoOffset"),
        wgl_h.C_LONG.withName("DataToDeviceBufferOffset"),
        wgl_h.C_LONG.withName("DataFromDeviceBufferOffset"),
        wgl_h.C_LONG.withName("CommandSpecific"),
        wgl_h.C_LONG.withName("Reserved0"),
        wgl_h.C_LONG.withName("FixedProtocolReturnData"),
        MemoryLayout.sequenceLayout(3, wgl_h.C_LONG).withName("Reserved1"),
        MemoryLayout.sequenceLayout(1, wgl_h.C_CHAR).withName("Command"),
        MemoryLayout.paddingLayout(3)
    ).withName("_STORAGE_PROTOCOL_COMMAND");

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

    private static final long Length$OFFSET = 4;

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

    private static final OfInt ProtocolType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ProtocolType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * STORAGE_PROTOCOL_TYPE ProtocolType
     * }
     */
    public static final OfInt ProtocolType$layout() {
        return ProtocolType$LAYOUT;
    }

    private static final long ProtocolType$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * STORAGE_PROTOCOL_TYPE ProtocolType
     * }
     */
    public static final long ProtocolType$offset() {
        return ProtocolType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * STORAGE_PROTOCOL_TYPE ProtocolType
     * }
     */
    public static int ProtocolType(MemorySegment struct) {
        return struct.get(ProtocolType$LAYOUT, ProtocolType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * STORAGE_PROTOCOL_TYPE ProtocolType
     * }
     */
    public static void ProtocolType(MemorySegment struct, int fieldValue) {
        struct.set(ProtocolType$LAYOUT, ProtocolType$OFFSET, fieldValue);
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

    private static final long Flags$OFFSET = 12;

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

    private static final OfInt ReturnStatus$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ReturnStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ReturnStatus
     * }
     */
    public static final OfInt ReturnStatus$layout() {
        return ReturnStatus$LAYOUT;
    }

    private static final long ReturnStatus$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ReturnStatus
     * }
     */
    public static final long ReturnStatus$offset() {
        return ReturnStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ReturnStatus
     * }
     */
    public static int ReturnStatus(MemorySegment struct) {
        return struct.get(ReturnStatus$LAYOUT, ReturnStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ReturnStatus
     * }
     */
    public static void ReturnStatus(MemorySegment struct, int fieldValue) {
        struct.set(ReturnStatus$LAYOUT, ReturnStatus$OFFSET, fieldValue);
    }

    private static final OfInt ErrorCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ErrorCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ErrorCode
     * }
     */
    public static final OfInt ErrorCode$layout() {
        return ErrorCode$LAYOUT;
    }

    private static final long ErrorCode$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ErrorCode
     * }
     */
    public static final long ErrorCode$offset() {
        return ErrorCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ErrorCode
     * }
     */
    public static int ErrorCode(MemorySegment struct) {
        return struct.get(ErrorCode$LAYOUT, ErrorCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ErrorCode
     * }
     */
    public static void ErrorCode(MemorySegment struct, int fieldValue) {
        struct.set(ErrorCode$LAYOUT, ErrorCode$OFFSET, fieldValue);
    }

    private static final OfInt CommandLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CommandLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD CommandLength
     * }
     */
    public static final OfInt CommandLength$layout() {
        return CommandLength$LAYOUT;
    }

    private static final long CommandLength$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD CommandLength
     * }
     */
    public static final long CommandLength$offset() {
        return CommandLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD CommandLength
     * }
     */
    public static int CommandLength(MemorySegment struct) {
        return struct.get(CommandLength$LAYOUT, CommandLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD CommandLength
     * }
     */
    public static void CommandLength(MemorySegment struct, int fieldValue) {
        struct.set(CommandLength$LAYOUT, CommandLength$OFFSET, fieldValue);
    }

    private static final OfInt ErrorInfoLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ErrorInfoLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ErrorInfoLength
     * }
     */
    public static final OfInt ErrorInfoLength$layout() {
        return ErrorInfoLength$LAYOUT;
    }

    private static final long ErrorInfoLength$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ErrorInfoLength
     * }
     */
    public static final long ErrorInfoLength$offset() {
        return ErrorInfoLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ErrorInfoLength
     * }
     */
    public static int ErrorInfoLength(MemorySegment struct) {
        return struct.get(ErrorInfoLength$LAYOUT, ErrorInfoLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ErrorInfoLength
     * }
     */
    public static void ErrorInfoLength(MemorySegment struct, int fieldValue) {
        struct.set(ErrorInfoLength$LAYOUT, ErrorInfoLength$OFFSET, fieldValue);
    }

    private static final OfInt DataToDeviceTransferLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DataToDeviceTransferLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DataToDeviceTransferLength
     * }
     */
    public static final OfInt DataToDeviceTransferLength$layout() {
        return DataToDeviceTransferLength$LAYOUT;
    }

    private static final long DataToDeviceTransferLength$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DataToDeviceTransferLength
     * }
     */
    public static final long DataToDeviceTransferLength$offset() {
        return DataToDeviceTransferLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DataToDeviceTransferLength
     * }
     */
    public static int DataToDeviceTransferLength(MemorySegment struct) {
        return struct.get(DataToDeviceTransferLength$LAYOUT, DataToDeviceTransferLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DataToDeviceTransferLength
     * }
     */
    public static void DataToDeviceTransferLength(MemorySegment struct, int fieldValue) {
        struct.set(DataToDeviceTransferLength$LAYOUT, DataToDeviceTransferLength$OFFSET, fieldValue);
    }

    private static final OfInt DataFromDeviceTransferLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DataFromDeviceTransferLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DataFromDeviceTransferLength
     * }
     */
    public static final OfInt DataFromDeviceTransferLength$layout() {
        return DataFromDeviceTransferLength$LAYOUT;
    }

    private static final long DataFromDeviceTransferLength$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DataFromDeviceTransferLength
     * }
     */
    public static final long DataFromDeviceTransferLength$offset() {
        return DataFromDeviceTransferLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DataFromDeviceTransferLength
     * }
     */
    public static int DataFromDeviceTransferLength(MemorySegment struct) {
        return struct.get(DataFromDeviceTransferLength$LAYOUT, DataFromDeviceTransferLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DataFromDeviceTransferLength
     * }
     */
    public static void DataFromDeviceTransferLength(MemorySegment struct, int fieldValue) {
        struct.set(DataFromDeviceTransferLength$LAYOUT, DataFromDeviceTransferLength$OFFSET, fieldValue);
    }

    private static final OfInt TimeOutValue$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TimeOutValue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TimeOutValue
     * }
     */
    public static final OfInt TimeOutValue$layout() {
        return TimeOutValue$LAYOUT;
    }

    private static final long TimeOutValue$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TimeOutValue
     * }
     */
    public static final long TimeOutValue$offset() {
        return TimeOutValue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TimeOutValue
     * }
     */
    public static int TimeOutValue(MemorySegment struct) {
        return struct.get(TimeOutValue$LAYOUT, TimeOutValue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TimeOutValue
     * }
     */
    public static void TimeOutValue(MemorySegment struct, int fieldValue) {
        struct.set(TimeOutValue$LAYOUT, TimeOutValue$OFFSET, fieldValue);
    }

    private static final OfInt ErrorInfoOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ErrorInfoOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ErrorInfoOffset
     * }
     */
    public static final OfInt ErrorInfoOffset$layout() {
        return ErrorInfoOffset$LAYOUT;
    }

    private static final long ErrorInfoOffset$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ErrorInfoOffset
     * }
     */
    public static final long ErrorInfoOffset$offset() {
        return ErrorInfoOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ErrorInfoOffset
     * }
     */
    public static int ErrorInfoOffset(MemorySegment struct) {
        return struct.get(ErrorInfoOffset$LAYOUT, ErrorInfoOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ErrorInfoOffset
     * }
     */
    public static void ErrorInfoOffset(MemorySegment struct, int fieldValue) {
        struct.set(ErrorInfoOffset$LAYOUT, ErrorInfoOffset$OFFSET, fieldValue);
    }

    private static final OfInt DataToDeviceBufferOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DataToDeviceBufferOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DataToDeviceBufferOffset
     * }
     */
    public static final OfInt DataToDeviceBufferOffset$layout() {
        return DataToDeviceBufferOffset$LAYOUT;
    }

    private static final long DataToDeviceBufferOffset$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DataToDeviceBufferOffset
     * }
     */
    public static final long DataToDeviceBufferOffset$offset() {
        return DataToDeviceBufferOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DataToDeviceBufferOffset
     * }
     */
    public static int DataToDeviceBufferOffset(MemorySegment struct) {
        return struct.get(DataToDeviceBufferOffset$LAYOUT, DataToDeviceBufferOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DataToDeviceBufferOffset
     * }
     */
    public static void DataToDeviceBufferOffset(MemorySegment struct, int fieldValue) {
        struct.set(DataToDeviceBufferOffset$LAYOUT, DataToDeviceBufferOffset$OFFSET, fieldValue);
    }

    private static final OfInt DataFromDeviceBufferOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DataFromDeviceBufferOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DataFromDeviceBufferOffset
     * }
     */
    public static final OfInt DataFromDeviceBufferOffset$layout() {
        return DataFromDeviceBufferOffset$LAYOUT;
    }

    private static final long DataFromDeviceBufferOffset$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DataFromDeviceBufferOffset
     * }
     */
    public static final long DataFromDeviceBufferOffset$offset() {
        return DataFromDeviceBufferOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DataFromDeviceBufferOffset
     * }
     */
    public static int DataFromDeviceBufferOffset(MemorySegment struct) {
        return struct.get(DataFromDeviceBufferOffset$LAYOUT, DataFromDeviceBufferOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DataFromDeviceBufferOffset
     * }
     */
    public static void DataFromDeviceBufferOffset(MemorySegment struct, int fieldValue) {
        struct.set(DataFromDeviceBufferOffset$LAYOUT, DataFromDeviceBufferOffset$OFFSET, fieldValue);
    }

    private static final OfInt CommandSpecific$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CommandSpecific"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD CommandSpecific
     * }
     */
    public static final OfInt CommandSpecific$layout() {
        return CommandSpecific$LAYOUT;
    }

    private static final long CommandSpecific$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD CommandSpecific
     * }
     */
    public static final long CommandSpecific$offset() {
        return CommandSpecific$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD CommandSpecific
     * }
     */
    public static int CommandSpecific(MemorySegment struct) {
        return struct.get(CommandSpecific$LAYOUT, CommandSpecific$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD CommandSpecific
     * }
     */
    public static void CommandSpecific(MemorySegment struct, int fieldValue) {
        struct.set(CommandSpecific$LAYOUT, CommandSpecific$OFFSET, fieldValue);
    }

    private static final OfInt Reserved0$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved0"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved0
     * }
     */
    public static final OfInt Reserved0$layout() {
        return Reserved0$LAYOUT;
    }

    private static final long Reserved0$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved0
     * }
     */
    public static final long Reserved0$offset() {
        return Reserved0$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved0
     * }
     */
    public static int Reserved0(MemorySegment struct) {
        return struct.get(Reserved0$LAYOUT, Reserved0$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved0
     * }
     */
    public static void Reserved0(MemorySegment struct, int fieldValue) {
        struct.set(Reserved0$LAYOUT, Reserved0$OFFSET, fieldValue);
    }

    private static final OfInt FixedProtocolReturnData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FixedProtocolReturnData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FixedProtocolReturnData
     * }
     */
    public static final OfInt FixedProtocolReturnData$layout() {
        return FixedProtocolReturnData$LAYOUT;
    }

    private static final long FixedProtocolReturnData$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FixedProtocolReturnData
     * }
     */
    public static final long FixedProtocolReturnData$offset() {
        return FixedProtocolReturnData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FixedProtocolReturnData
     * }
     */
    public static int FixedProtocolReturnData(MemorySegment struct) {
        return struct.get(FixedProtocolReturnData$LAYOUT, FixedProtocolReturnData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FixedProtocolReturnData
     * }
     */
    public static void FixedProtocolReturnData(MemorySegment struct, int fieldValue) {
        struct.set(FixedProtocolReturnData$LAYOUT, FixedProtocolReturnData$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved1$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved1[3]
     * }
     */
    public static final SequenceLayout Reserved1$layout() {
        return Reserved1$LAYOUT;
    }

    private static final long Reserved1$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved1[3]
     * }
     */
    public static final long Reserved1$offset() {
        return Reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved1[3]
     * }
     */
    public static MemorySegment Reserved1(MemorySegment struct) {
        return struct.asSlice(Reserved1$OFFSET, Reserved1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved1[3]
     * }
     */
    public static void Reserved1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved1$OFFSET, Reserved1$LAYOUT.byteSize());
    }

    private static long[] Reserved1$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD Reserved1[3]
     * }
     */
    public static long[] Reserved1$dimensions() {
        return Reserved1$DIMS;
    }
    private static final VarHandle Reserved1$ELEM_HANDLE = Reserved1$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD Reserved1[3]
     * }
     */
    public static int Reserved1(MemorySegment struct, long index0) {
        return (int)Reserved1$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD Reserved1[3]
     * }
     */
    public static void Reserved1(MemorySegment struct, long index0, int fieldValue) {
        Reserved1$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout Command$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Command"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Command[1]
     * }
     */
    public static final SequenceLayout Command$layout() {
        return Command$LAYOUT;
    }

    private static final long Command$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Command[1]
     * }
     */
    public static final long Command$offset() {
        return Command$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Command[1]
     * }
     */
    public static MemorySegment Command(MemorySegment struct) {
        return struct.asSlice(Command$OFFSET, Command$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Command[1]
     * }
     */
    public static void Command(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Command$OFFSET, Command$LAYOUT.byteSize());
    }

    private static long[] Command$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Command[1]
     * }
     */
    public static long[] Command$dimensions() {
        return Command$DIMS;
    }
    private static final VarHandle Command$ELEM_HANDLE = Command$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Command[1]
     * }
     */
    public static byte Command(MemorySegment struct, long index0) {
        return (byte)Command$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Command[1]
     * }
     */
    public static void Command(MemorySegment struct, long index0, byte fieldValue) {
        Command$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

