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
 * struct _STREAM_LAYOUT_ENTRY {
 *     DWORD Version;
 *     DWORD NextStreamOffset;
 *     DWORD Flags;
 *     DWORD ExtentInformationOffset;
 *     LARGE_INTEGER AllocationSize;
 *     LARGE_INTEGER EndOfFile;
 *     DWORD StreamInformationOffset;
 *     DWORD AttributeTypeCode;
 *     DWORD AttributeFlags;
 *     DWORD StreamIdentifierLength;
 *     WCHAR StreamIdentifier[1];
 * }
 * }
 */
public class _STREAM_LAYOUT_ENTRY {

    _STREAM_LAYOUT_ENTRY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Version"),
        wgl_h.C_LONG.withName("NextStreamOffset"),
        wgl_h.C_LONG.withName("Flags"),
        wgl_h.C_LONG.withName("ExtentInformationOffset"),
        _LARGE_INTEGER.layout().withName("AllocationSize"),
        _LARGE_INTEGER.layout().withName("EndOfFile"),
        wgl_h.C_LONG.withName("StreamInformationOffset"),
        wgl_h.C_LONG.withName("AttributeTypeCode"),
        wgl_h.C_LONG.withName("AttributeFlags"),
        wgl_h.C_LONG.withName("StreamIdentifierLength"),
        MemoryLayout.sequenceLayout(1, wgl_h.C_SHORT).withName("StreamIdentifier"),
        MemoryLayout.paddingLayout(6)
    ).withName("_STREAM_LAYOUT_ENTRY");

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

    private static final OfInt NextStreamOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NextStreamOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NextStreamOffset
     * }
     */
    public static final OfInt NextStreamOffset$layout() {
        return NextStreamOffset$LAYOUT;
    }

    private static final long NextStreamOffset$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NextStreamOffset
     * }
     */
    public static final long NextStreamOffset$offset() {
        return NextStreamOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NextStreamOffset
     * }
     */
    public static int NextStreamOffset(MemorySegment struct) {
        return struct.get(NextStreamOffset$LAYOUT, NextStreamOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NextStreamOffset
     * }
     */
    public static void NextStreamOffset(MemorySegment struct, int fieldValue) {
        struct.set(NextStreamOffset$LAYOUT, NextStreamOffset$OFFSET, fieldValue);
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

    private static final OfInt ExtentInformationOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ExtentInformationOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ExtentInformationOffset
     * }
     */
    public static final OfInt ExtentInformationOffset$layout() {
        return ExtentInformationOffset$LAYOUT;
    }

    private static final long ExtentInformationOffset$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ExtentInformationOffset
     * }
     */
    public static final long ExtentInformationOffset$offset() {
        return ExtentInformationOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ExtentInformationOffset
     * }
     */
    public static int ExtentInformationOffset(MemorySegment struct) {
        return struct.get(ExtentInformationOffset$LAYOUT, ExtentInformationOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ExtentInformationOffset
     * }
     */
    public static void ExtentInformationOffset(MemorySegment struct, int fieldValue) {
        struct.set(ExtentInformationOffset$LAYOUT, ExtentInformationOffset$OFFSET, fieldValue);
    }

    private static final GroupLayout AllocationSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("AllocationSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AllocationSize
     * }
     */
    public static final GroupLayout AllocationSize$layout() {
        return AllocationSize$LAYOUT;
    }

    private static final long AllocationSize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AllocationSize
     * }
     */
    public static final long AllocationSize$offset() {
        return AllocationSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AllocationSize
     * }
     */
    public static MemorySegment AllocationSize(MemorySegment struct) {
        return struct.asSlice(AllocationSize$OFFSET, AllocationSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AllocationSize
     * }
     */
    public static void AllocationSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, AllocationSize$OFFSET, AllocationSize$LAYOUT.byteSize());
    }

    private static final GroupLayout EndOfFile$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("EndOfFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER EndOfFile
     * }
     */
    public static final GroupLayout EndOfFile$layout() {
        return EndOfFile$LAYOUT;
    }

    private static final long EndOfFile$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER EndOfFile
     * }
     */
    public static final long EndOfFile$offset() {
        return EndOfFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER EndOfFile
     * }
     */
    public static MemorySegment EndOfFile(MemorySegment struct) {
        return struct.asSlice(EndOfFile$OFFSET, EndOfFile$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER EndOfFile
     * }
     */
    public static void EndOfFile(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, EndOfFile$OFFSET, EndOfFile$LAYOUT.byteSize());
    }

    private static final OfInt StreamInformationOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("StreamInformationOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD StreamInformationOffset
     * }
     */
    public static final OfInt StreamInformationOffset$layout() {
        return StreamInformationOffset$LAYOUT;
    }

    private static final long StreamInformationOffset$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD StreamInformationOffset
     * }
     */
    public static final long StreamInformationOffset$offset() {
        return StreamInformationOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD StreamInformationOffset
     * }
     */
    public static int StreamInformationOffset(MemorySegment struct) {
        return struct.get(StreamInformationOffset$LAYOUT, StreamInformationOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD StreamInformationOffset
     * }
     */
    public static void StreamInformationOffset(MemorySegment struct, int fieldValue) {
        struct.set(StreamInformationOffset$LAYOUT, StreamInformationOffset$OFFSET, fieldValue);
    }

    private static final OfInt AttributeTypeCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AttributeTypeCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AttributeTypeCode
     * }
     */
    public static final OfInt AttributeTypeCode$layout() {
        return AttributeTypeCode$LAYOUT;
    }

    private static final long AttributeTypeCode$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AttributeTypeCode
     * }
     */
    public static final long AttributeTypeCode$offset() {
        return AttributeTypeCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AttributeTypeCode
     * }
     */
    public static int AttributeTypeCode(MemorySegment struct) {
        return struct.get(AttributeTypeCode$LAYOUT, AttributeTypeCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AttributeTypeCode
     * }
     */
    public static void AttributeTypeCode(MemorySegment struct, int fieldValue) {
        struct.set(AttributeTypeCode$LAYOUT, AttributeTypeCode$OFFSET, fieldValue);
    }

    private static final OfInt AttributeFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AttributeFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AttributeFlags
     * }
     */
    public static final OfInt AttributeFlags$layout() {
        return AttributeFlags$LAYOUT;
    }

    private static final long AttributeFlags$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AttributeFlags
     * }
     */
    public static final long AttributeFlags$offset() {
        return AttributeFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AttributeFlags
     * }
     */
    public static int AttributeFlags(MemorySegment struct) {
        return struct.get(AttributeFlags$LAYOUT, AttributeFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AttributeFlags
     * }
     */
    public static void AttributeFlags(MemorySegment struct, int fieldValue) {
        struct.set(AttributeFlags$LAYOUT, AttributeFlags$OFFSET, fieldValue);
    }

    private static final OfInt StreamIdentifierLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("StreamIdentifierLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD StreamIdentifierLength
     * }
     */
    public static final OfInt StreamIdentifierLength$layout() {
        return StreamIdentifierLength$LAYOUT;
    }

    private static final long StreamIdentifierLength$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD StreamIdentifierLength
     * }
     */
    public static final long StreamIdentifierLength$offset() {
        return StreamIdentifierLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD StreamIdentifierLength
     * }
     */
    public static int StreamIdentifierLength(MemorySegment struct) {
        return struct.get(StreamIdentifierLength$LAYOUT, StreamIdentifierLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD StreamIdentifierLength
     * }
     */
    public static void StreamIdentifierLength(MemorySegment struct, int fieldValue) {
        struct.set(StreamIdentifierLength$LAYOUT, StreamIdentifierLength$OFFSET, fieldValue);
    }

    private static final SequenceLayout StreamIdentifier$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("StreamIdentifier"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR StreamIdentifier[1]
     * }
     */
    public static final SequenceLayout StreamIdentifier$layout() {
        return StreamIdentifier$LAYOUT;
    }

    private static final long StreamIdentifier$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR StreamIdentifier[1]
     * }
     */
    public static final long StreamIdentifier$offset() {
        return StreamIdentifier$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR StreamIdentifier[1]
     * }
     */
    public static MemorySegment StreamIdentifier(MemorySegment struct) {
        return struct.asSlice(StreamIdentifier$OFFSET, StreamIdentifier$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR StreamIdentifier[1]
     * }
     */
    public static void StreamIdentifier(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StreamIdentifier$OFFSET, StreamIdentifier$LAYOUT.byteSize());
    }

    private static long[] StreamIdentifier$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR StreamIdentifier[1]
     * }
     */
    public static long[] StreamIdentifier$dimensions() {
        return StreamIdentifier$DIMS;
    }
    private static final VarHandle StreamIdentifier$ELEM_HANDLE = StreamIdentifier$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR StreamIdentifier[1]
     * }
     */
    public static short StreamIdentifier(MemorySegment struct, long index0) {
        return (short)StreamIdentifier$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR StreamIdentifier[1]
     * }
     */
    public static void StreamIdentifier(MemorySegment struct, long index0, short fieldValue) {
        StreamIdentifier$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

