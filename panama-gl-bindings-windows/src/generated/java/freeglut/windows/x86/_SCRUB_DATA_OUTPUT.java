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
 * struct _SCRUB_DATA_OUTPUT {
 *     DWORD Size;
 *     DWORD Flags;
 *     DWORD Status;
 *     ULONGLONG ErrorFileOffset;
 *     ULONGLONG ErrorLength;
 *     ULONGLONG NumberOfBytesRepaired;
 *     ULONGLONG NumberOfBytesFailed;
 *     ULONGLONG InternalFileReference;
 *     WORD ResumeContextLength;
 *     WORD ParityExtentDataOffset;
 *     DWORD Reserved[9];
 *     ULONGLONG NumberOfMetadataBytesProcessed;
 *     ULONGLONG NumberOfDataBytesProcessed;
 *     ULONGLONG TotalNumberOfMetadataBytesInUse;
 *     ULONGLONG TotalNumberOfDataBytesInUse;
 *     BYTE ResumeContext[816];
 * }
 * }
 */
public class _SCRUB_DATA_OUTPUT {

    _SCRUB_DATA_OUTPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("Size"),
        freeglut_h.C_LONG.withName("Flags"),
        freeglut_h.C_LONG.withName("Status"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_LONG_LONG.withName("ErrorFileOffset"),
        freeglut_h.C_LONG_LONG.withName("ErrorLength"),
        freeglut_h.C_LONG_LONG.withName("NumberOfBytesRepaired"),
        freeglut_h.C_LONG_LONG.withName("NumberOfBytesFailed"),
        freeglut_h.C_LONG_LONG.withName("InternalFileReference"),
        freeglut_h.C_SHORT.withName("ResumeContextLength"),
        freeglut_h.C_SHORT.withName("ParityExtentDataOffset"),
        MemoryLayout.sequenceLayout(9, freeglut_h.C_LONG).withName("Reserved"),
        freeglut_h.C_LONG_LONG.withName("NumberOfMetadataBytesProcessed"),
        freeglut_h.C_LONG_LONG.withName("NumberOfDataBytesProcessed"),
        freeglut_h.C_LONG_LONG.withName("TotalNumberOfMetadataBytesInUse"),
        freeglut_h.C_LONG_LONG.withName("TotalNumberOfDataBytesInUse"),
        MemoryLayout.sequenceLayout(816, freeglut_h.C_CHAR).withName("ResumeContext")
    ).withName("_SCRUB_DATA_OUTPUT");

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

    private static final OfInt Status$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Status"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Status
     * }
     */
    public static final OfInt Status$layout() {
        return Status$LAYOUT;
    }

    private static final long Status$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Status
     * }
     */
    public static final long Status$offset() {
        return Status$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Status
     * }
     */
    public static int Status(MemorySegment struct) {
        return struct.get(Status$LAYOUT, Status$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Status
     * }
     */
    public static void Status(MemorySegment struct, int fieldValue) {
        struct.set(Status$LAYOUT, Status$OFFSET, fieldValue);
    }

    private static final OfLong ErrorFileOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ErrorFileOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG ErrorFileOffset
     * }
     */
    public static final OfLong ErrorFileOffset$layout() {
        return ErrorFileOffset$LAYOUT;
    }

    private static final long ErrorFileOffset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG ErrorFileOffset
     * }
     */
    public static final long ErrorFileOffset$offset() {
        return ErrorFileOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG ErrorFileOffset
     * }
     */
    public static long ErrorFileOffset(MemorySegment struct) {
        return struct.get(ErrorFileOffset$LAYOUT, ErrorFileOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG ErrorFileOffset
     * }
     */
    public static void ErrorFileOffset(MemorySegment struct, long fieldValue) {
        struct.set(ErrorFileOffset$LAYOUT, ErrorFileOffset$OFFSET, fieldValue);
    }

    private static final OfLong ErrorLength$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ErrorLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG ErrorLength
     * }
     */
    public static final OfLong ErrorLength$layout() {
        return ErrorLength$LAYOUT;
    }

    private static final long ErrorLength$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG ErrorLength
     * }
     */
    public static final long ErrorLength$offset() {
        return ErrorLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG ErrorLength
     * }
     */
    public static long ErrorLength(MemorySegment struct) {
        return struct.get(ErrorLength$LAYOUT, ErrorLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG ErrorLength
     * }
     */
    public static void ErrorLength(MemorySegment struct, long fieldValue) {
        struct.set(ErrorLength$LAYOUT, ErrorLength$OFFSET, fieldValue);
    }

    private static final OfLong NumberOfBytesRepaired$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NumberOfBytesRepaired"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfBytesRepaired
     * }
     */
    public static final OfLong NumberOfBytesRepaired$layout() {
        return NumberOfBytesRepaired$LAYOUT;
    }

    private static final long NumberOfBytesRepaired$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfBytesRepaired
     * }
     */
    public static final long NumberOfBytesRepaired$offset() {
        return NumberOfBytesRepaired$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfBytesRepaired
     * }
     */
    public static long NumberOfBytesRepaired(MemorySegment struct) {
        return struct.get(NumberOfBytesRepaired$LAYOUT, NumberOfBytesRepaired$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfBytesRepaired
     * }
     */
    public static void NumberOfBytesRepaired(MemorySegment struct, long fieldValue) {
        struct.set(NumberOfBytesRepaired$LAYOUT, NumberOfBytesRepaired$OFFSET, fieldValue);
    }

    private static final OfLong NumberOfBytesFailed$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NumberOfBytesFailed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfBytesFailed
     * }
     */
    public static final OfLong NumberOfBytesFailed$layout() {
        return NumberOfBytesFailed$LAYOUT;
    }

    private static final long NumberOfBytesFailed$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfBytesFailed
     * }
     */
    public static final long NumberOfBytesFailed$offset() {
        return NumberOfBytesFailed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfBytesFailed
     * }
     */
    public static long NumberOfBytesFailed(MemorySegment struct) {
        return struct.get(NumberOfBytesFailed$LAYOUT, NumberOfBytesFailed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfBytesFailed
     * }
     */
    public static void NumberOfBytesFailed(MemorySegment struct, long fieldValue) {
        struct.set(NumberOfBytesFailed$LAYOUT, NumberOfBytesFailed$OFFSET, fieldValue);
    }

    private static final OfLong InternalFileReference$LAYOUT = (OfLong)$LAYOUT.select(groupElement("InternalFileReference"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG InternalFileReference
     * }
     */
    public static final OfLong InternalFileReference$layout() {
        return InternalFileReference$LAYOUT;
    }

    private static final long InternalFileReference$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG InternalFileReference
     * }
     */
    public static final long InternalFileReference$offset() {
        return InternalFileReference$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG InternalFileReference
     * }
     */
    public static long InternalFileReference(MemorySegment struct) {
        return struct.get(InternalFileReference$LAYOUT, InternalFileReference$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG InternalFileReference
     * }
     */
    public static void InternalFileReference(MemorySegment struct, long fieldValue) {
        struct.set(InternalFileReference$LAYOUT, InternalFileReference$OFFSET, fieldValue);
    }

    private static final OfShort ResumeContextLength$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ResumeContextLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ResumeContextLength
     * }
     */
    public static final OfShort ResumeContextLength$layout() {
        return ResumeContextLength$LAYOUT;
    }

    private static final long ResumeContextLength$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ResumeContextLength
     * }
     */
    public static final long ResumeContextLength$offset() {
        return ResumeContextLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ResumeContextLength
     * }
     */
    public static short ResumeContextLength(MemorySegment struct) {
        return struct.get(ResumeContextLength$LAYOUT, ResumeContextLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ResumeContextLength
     * }
     */
    public static void ResumeContextLength(MemorySegment struct, short fieldValue) {
        struct.set(ResumeContextLength$LAYOUT, ResumeContextLength$OFFSET, fieldValue);
    }

    private static final OfShort ParityExtentDataOffset$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ParityExtentDataOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ParityExtentDataOffset
     * }
     */
    public static final OfShort ParityExtentDataOffset$layout() {
        return ParityExtentDataOffset$LAYOUT;
    }

    private static final long ParityExtentDataOffset$OFFSET = 58;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ParityExtentDataOffset
     * }
     */
    public static final long ParityExtentDataOffset$offset() {
        return ParityExtentDataOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ParityExtentDataOffset
     * }
     */
    public static short ParityExtentDataOffset(MemorySegment struct) {
        return struct.get(ParityExtentDataOffset$LAYOUT, ParityExtentDataOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ParityExtentDataOffset
     * }
     */
    public static void ParityExtentDataOffset(MemorySegment struct, short fieldValue) {
        struct.set(ParityExtentDataOffset$LAYOUT, ParityExtentDataOffset$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved[9]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved[9]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved[9]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved[9]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 9 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD Reserved[9]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD Reserved[9]
     * }
     */
    public static int Reserved(MemorySegment struct, long index0) {
        return (int)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD Reserved[9]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, int fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong NumberOfMetadataBytesProcessed$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NumberOfMetadataBytesProcessed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfMetadataBytesProcessed
     * }
     */
    public static final OfLong NumberOfMetadataBytesProcessed$layout() {
        return NumberOfMetadataBytesProcessed$LAYOUT;
    }

    private static final long NumberOfMetadataBytesProcessed$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfMetadataBytesProcessed
     * }
     */
    public static final long NumberOfMetadataBytesProcessed$offset() {
        return NumberOfMetadataBytesProcessed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfMetadataBytesProcessed
     * }
     */
    public static long NumberOfMetadataBytesProcessed(MemorySegment struct) {
        return struct.get(NumberOfMetadataBytesProcessed$LAYOUT, NumberOfMetadataBytesProcessed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfMetadataBytesProcessed
     * }
     */
    public static void NumberOfMetadataBytesProcessed(MemorySegment struct, long fieldValue) {
        struct.set(NumberOfMetadataBytesProcessed$LAYOUT, NumberOfMetadataBytesProcessed$OFFSET, fieldValue);
    }

    private static final OfLong NumberOfDataBytesProcessed$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NumberOfDataBytesProcessed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfDataBytesProcessed
     * }
     */
    public static final OfLong NumberOfDataBytesProcessed$layout() {
        return NumberOfDataBytesProcessed$LAYOUT;
    }

    private static final long NumberOfDataBytesProcessed$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfDataBytesProcessed
     * }
     */
    public static final long NumberOfDataBytesProcessed$offset() {
        return NumberOfDataBytesProcessed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfDataBytesProcessed
     * }
     */
    public static long NumberOfDataBytesProcessed(MemorySegment struct) {
        return struct.get(NumberOfDataBytesProcessed$LAYOUT, NumberOfDataBytesProcessed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG NumberOfDataBytesProcessed
     * }
     */
    public static void NumberOfDataBytesProcessed(MemorySegment struct, long fieldValue) {
        struct.set(NumberOfDataBytesProcessed$LAYOUT, NumberOfDataBytesProcessed$OFFSET, fieldValue);
    }

    private static final OfLong TotalNumberOfMetadataBytesInUse$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TotalNumberOfMetadataBytesInUse"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNumberOfMetadataBytesInUse
     * }
     */
    public static final OfLong TotalNumberOfMetadataBytesInUse$layout() {
        return TotalNumberOfMetadataBytesInUse$LAYOUT;
    }

    private static final long TotalNumberOfMetadataBytesInUse$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNumberOfMetadataBytesInUse
     * }
     */
    public static final long TotalNumberOfMetadataBytesInUse$offset() {
        return TotalNumberOfMetadataBytesInUse$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNumberOfMetadataBytesInUse
     * }
     */
    public static long TotalNumberOfMetadataBytesInUse(MemorySegment struct) {
        return struct.get(TotalNumberOfMetadataBytesInUse$LAYOUT, TotalNumberOfMetadataBytesInUse$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNumberOfMetadataBytesInUse
     * }
     */
    public static void TotalNumberOfMetadataBytesInUse(MemorySegment struct, long fieldValue) {
        struct.set(TotalNumberOfMetadataBytesInUse$LAYOUT, TotalNumberOfMetadataBytesInUse$OFFSET, fieldValue);
    }

    private static final OfLong TotalNumberOfDataBytesInUse$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TotalNumberOfDataBytesInUse"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNumberOfDataBytesInUse
     * }
     */
    public static final OfLong TotalNumberOfDataBytesInUse$layout() {
        return TotalNumberOfDataBytesInUse$LAYOUT;
    }

    private static final long TotalNumberOfDataBytesInUse$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNumberOfDataBytesInUse
     * }
     */
    public static final long TotalNumberOfDataBytesInUse$offset() {
        return TotalNumberOfDataBytesInUse$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNumberOfDataBytesInUse
     * }
     */
    public static long TotalNumberOfDataBytesInUse(MemorySegment struct) {
        return struct.get(TotalNumberOfDataBytesInUse$LAYOUT, TotalNumberOfDataBytesInUse$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNumberOfDataBytesInUse
     * }
     */
    public static void TotalNumberOfDataBytesInUse(MemorySegment struct, long fieldValue) {
        struct.set(TotalNumberOfDataBytesInUse$LAYOUT, TotalNumberOfDataBytesInUse$OFFSET, fieldValue);
    }

    private static final SequenceLayout ResumeContext$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ResumeContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ResumeContext[816]
     * }
     */
    public static final SequenceLayout ResumeContext$layout() {
        return ResumeContext$LAYOUT;
    }

    private static final long ResumeContext$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ResumeContext[816]
     * }
     */
    public static final long ResumeContext$offset() {
        return ResumeContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ResumeContext[816]
     * }
     */
    public static MemorySegment ResumeContext(MemorySegment struct) {
        return struct.asSlice(ResumeContext$OFFSET, ResumeContext$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ResumeContext[816]
     * }
     */
    public static void ResumeContext(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ResumeContext$OFFSET, ResumeContext$LAYOUT.byteSize());
    }

    private static long[] ResumeContext$DIMS = { 816 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE ResumeContext[816]
     * }
     */
    public static long[] ResumeContext$dimensions() {
        return ResumeContext$DIMS;
    }
    private static final VarHandle ResumeContext$ELEM_HANDLE = ResumeContext$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE ResumeContext[816]
     * }
     */
    public static byte ResumeContext(MemorySegment struct, long index0) {
        return (byte)ResumeContext$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE ResumeContext[816]
     * }
     */
    public static void ResumeContext(MemorySegment struct, long index0, byte fieldValue) {
        ResumeContext$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

