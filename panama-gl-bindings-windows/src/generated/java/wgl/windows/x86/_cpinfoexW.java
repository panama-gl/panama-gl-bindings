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
 * struct _cpinfoexW {
 *     UINT MaxCharSize;
 *     BYTE DefaultChar[2];
 *     BYTE LeadByte[12];
 *     WCHAR UnicodeDefaultChar;
 *     UINT CodePage;
 *     WCHAR CodePageName[260];
 * }
 * }
 */
public class _cpinfoexW {

    _cpinfoexW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_INT.withName("MaxCharSize"),
        MemoryLayout.sequenceLayout(2, wgl_h.C_CHAR).withName("DefaultChar"),
        MemoryLayout.sequenceLayout(12, wgl_h.C_CHAR).withName("LeadByte"),
        wgl_h.C_SHORT.withName("UnicodeDefaultChar"),
        wgl_h.C_INT.withName("CodePage"),
        MemoryLayout.sequenceLayout(260, wgl_h.C_SHORT).withName("CodePageName")
    ).withName("_cpinfoexW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt MaxCharSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaxCharSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT MaxCharSize
     * }
     */
    public static final OfInt MaxCharSize$layout() {
        return MaxCharSize$LAYOUT;
    }

    private static final long MaxCharSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT MaxCharSize
     * }
     */
    public static final long MaxCharSize$offset() {
        return MaxCharSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT MaxCharSize
     * }
     */
    public static int MaxCharSize(MemorySegment struct) {
        return struct.get(MaxCharSize$LAYOUT, MaxCharSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT MaxCharSize
     * }
     */
    public static void MaxCharSize(MemorySegment struct, int fieldValue) {
        struct.set(MaxCharSize$LAYOUT, MaxCharSize$OFFSET, fieldValue);
    }

    private static final SequenceLayout DefaultChar$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("DefaultChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE DefaultChar[2]
     * }
     */
    public static final SequenceLayout DefaultChar$layout() {
        return DefaultChar$LAYOUT;
    }

    private static final long DefaultChar$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE DefaultChar[2]
     * }
     */
    public static final long DefaultChar$offset() {
        return DefaultChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE DefaultChar[2]
     * }
     */
    public static MemorySegment DefaultChar(MemorySegment struct) {
        return struct.asSlice(DefaultChar$OFFSET, DefaultChar$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE DefaultChar[2]
     * }
     */
    public static void DefaultChar(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, DefaultChar$OFFSET, DefaultChar$LAYOUT.byteSize());
    }

    private static long[] DefaultChar$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE DefaultChar[2]
     * }
     */
    public static long[] DefaultChar$dimensions() {
        return DefaultChar$DIMS;
    }
    private static final VarHandle DefaultChar$ELEM_HANDLE = DefaultChar$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE DefaultChar[2]
     * }
     */
    public static byte DefaultChar(MemorySegment struct, long index0) {
        return (byte)DefaultChar$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE DefaultChar[2]
     * }
     */
    public static void DefaultChar(MemorySegment struct, long index0, byte fieldValue) {
        DefaultChar$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout LeadByte$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("LeadByte"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE LeadByte[12]
     * }
     */
    public static final SequenceLayout LeadByte$layout() {
        return LeadByte$LAYOUT;
    }

    private static final long LeadByte$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE LeadByte[12]
     * }
     */
    public static final long LeadByte$offset() {
        return LeadByte$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE LeadByte[12]
     * }
     */
    public static MemorySegment LeadByte(MemorySegment struct) {
        return struct.asSlice(LeadByte$OFFSET, LeadByte$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE LeadByte[12]
     * }
     */
    public static void LeadByte(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, LeadByte$OFFSET, LeadByte$LAYOUT.byteSize());
    }

    private static long[] LeadByte$DIMS = { 12 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE LeadByte[12]
     * }
     */
    public static long[] LeadByte$dimensions() {
        return LeadByte$DIMS;
    }
    private static final VarHandle LeadByte$ELEM_HANDLE = LeadByte$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE LeadByte[12]
     * }
     */
    public static byte LeadByte(MemorySegment struct, long index0) {
        return (byte)LeadByte$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE LeadByte[12]
     * }
     */
    public static void LeadByte(MemorySegment struct, long index0, byte fieldValue) {
        LeadByte$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfShort UnicodeDefaultChar$LAYOUT = (OfShort)$LAYOUT.select(groupElement("UnicodeDefaultChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR UnicodeDefaultChar
     * }
     */
    public static final OfShort UnicodeDefaultChar$layout() {
        return UnicodeDefaultChar$LAYOUT;
    }

    private static final long UnicodeDefaultChar$OFFSET = 18;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR UnicodeDefaultChar
     * }
     */
    public static final long UnicodeDefaultChar$offset() {
        return UnicodeDefaultChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR UnicodeDefaultChar
     * }
     */
    public static short UnicodeDefaultChar(MemorySegment struct) {
        return struct.get(UnicodeDefaultChar$LAYOUT, UnicodeDefaultChar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR UnicodeDefaultChar
     * }
     */
    public static void UnicodeDefaultChar(MemorySegment struct, short fieldValue) {
        struct.set(UnicodeDefaultChar$LAYOUT, UnicodeDefaultChar$OFFSET, fieldValue);
    }

    private static final OfInt CodePage$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CodePage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT CodePage
     * }
     */
    public static final OfInt CodePage$layout() {
        return CodePage$LAYOUT;
    }

    private static final long CodePage$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT CodePage
     * }
     */
    public static final long CodePage$offset() {
        return CodePage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT CodePage
     * }
     */
    public static int CodePage(MemorySegment struct) {
        return struct.get(CodePage$LAYOUT, CodePage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT CodePage
     * }
     */
    public static void CodePage(MemorySegment struct, int fieldValue) {
        struct.set(CodePage$LAYOUT, CodePage$OFFSET, fieldValue);
    }

    private static final SequenceLayout CodePageName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("CodePageName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR CodePageName[260]
     * }
     */
    public static final SequenceLayout CodePageName$layout() {
        return CodePageName$LAYOUT;
    }

    private static final long CodePageName$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR CodePageName[260]
     * }
     */
    public static final long CodePageName$offset() {
        return CodePageName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR CodePageName[260]
     * }
     */
    public static MemorySegment CodePageName(MemorySegment struct) {
        return struct.asSlice(CodePageName$OFFSET, CodePageName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR CodePageName[260]
     * }
     */
    public static void CodePageName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, CodePageName$OFFSET, CodePageName$LAYOUT.byteSize());
    }

    private static long[] CodePageName$DIMS = { 260 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR CodePageName[260]
     * }
     */
    public static long[] CodePageName$dimensions() {
        return CodePageName$DIMS;
    }
    private static final VarHandle CodePageName$ELEM_HANDLE = CodePageName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR CodePageName[260]
     * }
     */
    public static short CodePageName(MemorySegment struct, long index0) {
        return (short)CodePageName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR CodePageName[260]
     * }
     */
    public static void CodePageName(MemorySegment struct, long index0, short fieldValue) {
        CodePageName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

