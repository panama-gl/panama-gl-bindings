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
 * struct _IMAGE_ENCLAVE_IMPORT {
 *     DWORD MatchType;
 *     DWORD MinimumSecurityVersion;
 *     BYTE UniqueOrAuthorID[32];
 *     BYTE FamilyID[16];
 *     BYTE ImageID[16];
 *     DWORD ImportName;
 *     DWORD Reserved;
 * }
 * }
 */
public class _IMAGE_ENCLAVE_IMPORT {

    _IMAGE_ENCLAVE_IMPORT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("MatchType"),
        wgl_h.C_LONG.withName("MinimumSecurityVersion"),
        MemoryLayout.sequenceLayout(32, wgl_h.C_CHAR).withName("UniqueOrAuthorID"),
        MemoryLayout.sequenceLayout(16, wgl_h.C_CHAR).withName("FamilyID"),
        MemoryLayout.sequenceLayout(16, wgl_h.C_CHAR).withName("ImageID"),
        wgl_h.C_LONG.withName("ImportName"),
        wgl_h.C_LONG.withName("Reserved")
    ).withName("_IMAGE_ENCLAVE_IMPORT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt MatchType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MatchType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MatchType
     * }
     */
    public static final OfInt MatchType$layout() {
        return MatchType$LAYOUT;
    }

    private static final long MatchType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MatchType
     * }
     */
    public static final long MatchType$offset() {
        return MatchType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MatchType
     * }
     */
    public static int MatchType(MemorySegment struct) {
        return struct.get(MatchType$LAYOUT, MatchType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MatchType
     * }
     */
    public static void MatchType(MemorySegment struct, int fieldValue) {
        struct.set(MatchType$LAYOUT, MatchType$OFFSET, fieldValue);
    }

    private static final OfInt MinimumSecurityVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MinimumSecurityVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MinimumSecurityVersion
     * }
     */
    public static final OfInt MinimumSecurityVersion$layout() {
        return MinimumSecurityVersion$LAYOUT;
    }

    private static final long MinimumSecurityVersion$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MinimumSecurityVersion
     * }
     */
    public static final long MinimumSecurityVersion$offset() {
        return MinimumSecurityVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MinimumSecurityVersion
     * }
     */
    public static int MinimumSecurityVersion(MemorySegment struct) {
        return struct.get(MinimumSecurityVersion$LAYOUT, MinimumSecurityVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MinimumSecurityVersion
     * }
     */
    public static void MinimumSecurityVersion(MemorySegment struct, int fieldValue) {
        struct.set(MinimumSecurityVersion$LAYOUT, MinimumSecurityVersion$OFFSET, fieldValue);
    }

    private static final SequenceLayout UniqueOrAuthorID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("UniqueOrAuthorID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE UniqueOrAuthorID[32]
     * }
     */
    public static final SequenceLayout UniqueOrAuthorID$layout() {
        return UniqueOrAuthorID$LAYOUT;
    }

    private static final long UniqueOrAuthorID$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE UniqueOrAuthorID[32]
     * }
     */
    public static final long UniqueOrAuthorID$offset() {
        return UniqueOrAuthorID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE UniqueOrAuthorID[32]
     * }
     */
    public static MemorySegment UniqueOrAuthorID(MemorySegment struct) {
        return struct.asSlice(UniqueOrAuthorID$OFFSET, UniqueOrAuthorID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE UniqueOrAuthorID[32]
     * }
     */
    public static void UniqueOrAuthorID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, UniqueOrAuthorID$OFFSET, UniqueOrAuthorID$LAYOUT.byteSize());
    }

    private static long[] UniqueOrAuthorID$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE UniqueOrAuthorID[32]
     * }
     */
    public static long[] UniqueOrAuthorID$dimensions() {
        return UniqueOrAuthorID$DIMS;
    }
    private static final VarHandle UniqueOrAuthorID$ELEM_HANDLE = UniqueOrAuthorID$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE UniqueOrAuthorID[32]
     * }
     */
    public static byte UniqueOrAuthorID(MemorySegment struct, long index0) {
        return (byte)UniqueOrAuthorID$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE UniqueOrAuthorID[32]
     * }
     */
    public static void UniqueOrAuthorID(MemorySegment struct, long index0, byte fieldValue) {
        UniqueOrAuthorID$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout FamilyID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("FamilyID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE FamilyID[16]
     * }
     */
    public static final SequenceLayout FamilyID$layout() {
        return FamilyID$LAYOUT;
    }

    private static final long FamilyID$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE FamilyID[16]
     * }
     */
    public static final long FamilyID$offset() {
        return FamilyID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE FamilyID[16]
     * }
     */
    public static MemorySegment FamilyID(MemorySegment struct) {
        return struct.asSlice(FamilyID$OFFSET, FamilyID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE FamilyID[16]
     * }
     */
    public static void FamilyID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FamilyID$OFFSET, FamilyID$LAYOUT.byteSize());
    }

    private static long[] FamilyID$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE FamilyID[16]
     * }
     */
    public static long[] FamilyID$dimensions() {
        return FamilyID$DIMS;
    }
    private static final VarHandle FamilyID$ELEM_HANDLE = FamilyID$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE FamilyID[16]
     * }
     */
    public static byte FamilyID(MemorySegment struct, long index0) {
        return (byte)FamilyID$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE FamilyID[16]
     * }
     */
    public static void FamilyID(MemorySegment struct, long index0, byte fieldValue) {
        FamilyID$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout ImageID$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ImageID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ImageID[16]
     * }
     */
    public static final SequenceLayout ImageID$layout() {
        return ImageID$LAYOUT;
    }

    private static final long ImageID$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ImageID[16]
     * }
     */
    public static final long ImageID$offset() {
        return ImageID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ImageID[16]
     * }
     */
    public static MemorySegment ImageID(MemorySegment struct) {
        return struct.asSlice(ImageID$OFFSET, ImageID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ImageID[16]
     * }
     */
    public static void ImageID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ImageID$OFFSET, ImageID$LAYOUT.byteSize());
    }

    private static long[] ImageID$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE ImageID[16]
     * }
     */
    public static long[] ImageID$dimensions() {
        return ImageID$DIMS;
    }
    private static final VarHandle ImageID$ELEM_HANDLE = ImageID$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE ImageID[16]
     * }
     */
    public static byte ImageID(MemorySegment struct, long index0) {
        return (byte)ImageID$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE ImageID[16]
     * }
     */
    public static void ImageID(MemorySegment struct, long index0, byte fieldValue) {
        ImageID$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt ImportName$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ImportName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ImportName
     * }
     */
    public static final OfInt ImportName$layout() {
        return ImportName$LAYOUT;
    }

    private static final long ImportName$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ImportName
     * }
     */
    public static final long ImportName$offset() {
        return ImportName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ImportName
     * }
     */
    public static int ImportName(MemorySegment struct) {
        return struct.get(ImportName$LAYOUT, ImportName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ImportName
     * }
     */
    public static void ImportName(MemorySegment struct, int fieldValue) {
        struct.set(ImportName$LAYOUT, ImportName$OFFSET, fieldValue);
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

    private static final long Reserved$OFFSET = 76;

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

