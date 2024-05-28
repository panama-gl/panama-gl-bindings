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
 * struct _FILE_LAYOUT_NAME_ENTRY {
 *     DWORD NextNameOffset;
 *     DWORD Flags;
 *     DWORDLONG ParentFileReferenceNumber;
 *     DWORD FileNameLength;
 *     DWORD Reserved;
 *     WCHAR FileName[1];
 * }
 * }
 */
public class _FILE_LAYOUT_NAME_ENTRY {

    _FILE_LAYOUT_NAME_ENTRY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("NextNameOffset"),
        wgl_h.C_LONG.withName("Flags"),
        wgl_h.C_LONG_LONG.withName("ParentFileReferenceNumber"),
        wgl_h.C_LONG.withName("FileNameLength"),
        wgl_h.C_LONG.withName("Reserved"),
        MemoryLayout.sequenceLayout(1, wgl_h.C_SHORT).withName("FileName"),
        MemoryLayout.paddingLayout(6)
    ).withName("_FILE_LAYOUT_NAME_ENTRY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt NextNameOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NextNameOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NextNameOffset
     * }
     */
    public static final OfInt NextNameOffset$layout() {
        return NextNameOffset$LAYOUT;
    }

    private static final long NextNameOffset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NextNameOffset
     * }
     */
    public static final long NextNameOffset$offset() {
        return NextNameOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NextNameOffset
     * }
     */
    public static int NextNameOffset(MemorySegment struct) {
        return struct.get(NextNameOffset$LAYOUT, NextNameOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NextNameOffset
     * }
     */
    public static void NextNameOffset(MemorySegment struct, int fieldValue) {
        struct.set(NextNameOffset$LAYOUT, NextNameOffset$OFFSET, fieldValue);
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

    private static final OfLong ParentFileReferenceNumber$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ParentFileReferenceNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG ParentFileReferenceNumber
     * }
     */
    public static final OfLong ParentFileReferenceNumber$layout() {
        return ParentFileReferenceNumber$LAYOUT;
    }

    private static final long ParentFileReferenceNumber$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG ParentFileReferenceNumber
     * }
     */
    public static final long ParentFileReferenceNumber$offset() {
        return ParentFileReferenceNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG ParentFileReferenceNumber
     * }
     */
    public static long ParentFileReferenceNumber(MemorySegment struct) {
        return struct.get(ParentFileReferenceNumber$LAYOUT, ParentFileReferenceNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG ParentFileReferenceNumber
     * }
     */
    public static void ParentFileReferenceNumber(MemorySegment struct, long fieldValue) {
        struct.set(ParentFileReferenceNumber$LAYOUT, ParentFileReferenceNumber$OFFSET, fieldValue);
    }

    private static final OfInt FileNameLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FileNameLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FileNameLength
     * }
     */
    public static final OfInt FileNameLength$layout() {
        return FileNameLength$LAYOUT;
    }

    private static final long FileNameLength$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FileNameLength
     * }
     */
    public static final long FileNameLength$offset() {
        return FileNameLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FileNameLength
     * }
     */
    public static int FileNameLength(MemorySegment struct) {
        return struct.get(FileNameLength$LAYOUT, FileNameLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FileNameLength
     * }
     */
    public static void FileNameLength(MemorySegment struct, int fieldValue) {
        struct.set(FileNameLength$LAYOUT, FileNameLength$OFFSET, fieldValue);
    }

    private static final OfInt Reserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static final OfInt Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static int Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, int fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final SequenceLayout FileName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("FileName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static final SequenceLayout FileName$layout() {
        return FileName$LAYOUT;
    }

    private static final long FileName$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static final long FileName$offset() {
        return FileName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static MemorySegment FileName(MemorySegment struct) {
        return struct.asSlice(FileName$OFFSET, FileName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static void FileName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FileName$OFFSET, FileName$LAYOUT.byteSize());
    }

    private static long[] FileName$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static long[] FileName$dimensions() {
        return FileName$DIMS;
    }
    private static final VarHandle FileName$ELEM_HANDLE = FileName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static short FileName(MemorySegment struct, long index0) {
        return (short)FileName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR FileName[1]
     * }
     */
    public static void FileName(MemorySegment struct, long index0, short fieldValue) {
        FileName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

