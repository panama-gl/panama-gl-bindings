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
 * struct tagENUMLOGFONTW {
 *     LOGFONTW elfLogFont;
 *     WCHAR elfFullName[64];
 *     WCHAR elfStyle[32];
 * }
 * }
 */
public class tagENUMLOGFONTW {

    tagENUMLOGFONTW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagLOGFONTW.layout().withName("elfLogFont"),
        MemoryLayout.sequenceLayout(64, wgl_h.C_SHORT).withName("elfFullName"),
        MemoryLayout.sequenceLayout(32, wgl_h.C_SHORT).withName("elfStyle")
    ).withName("tagENUMLOGFONTW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout elfLogFont$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("elfLogFont"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LOGFONTW elfLogFont
     * }
     */
    public static final GroupLayout elfLogFont$layout() {
        return elfLogFont$LAYOUT;
    }

    private static final long elfLogFont$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LOGFONTW elfLogFont
     * }
     */
    public static final long elfLogFont$offset() {
        return elfLogFont$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LOGFONTW elfLogFont
     * }
     */
    public static MemorySegment elfLogFont(MemorySegment struct) {
        return struct.asSlice(elfLogFont$OFFSET, elfLogFont$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LOGFONTW elfLogFont
     * }
     */
    public static void elfLogFont(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, elfLogFont$OFFSET, elfLogFont$LAYOUT.byteSize());
    }

    private static final SequenceLayout elfFullName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("elfFullName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR elfFullName[64]
     * }
     */
    public static final SequenceLayout elfFullName$layout() {
        return elfFullName$LAYOUT;
    }

    private static final long elfFullName$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR elfFullName[64]
     * }
     */
    public static final long elfFullName$offset() {
        return elfFullName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR elfFullName[64]
     * }
     */
    public static MemorySegment elfFullName(MemorySegment struct) {
        return struct.asSlice(elfFullName$OFFSET, elfFullName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR elfFullName[64]
     * }
     */
    public static void elfFullName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, elfFullName$OFFSET, elfFullName$LAYOUT.byteSize());
    }

    private static long[] elfFullName$DIMS = { 64 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR elfFullName[64]
     * }
     */
    public static long[] elfFullName$dimensions() {
        return elfFullName$DIMS;
    }
    private static final VarHandle elfFullName$ELEM_HANDLE = elfFullName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR elfFullName[64]
     * }
     */
    public static short elfFullName(MemorySegment struct, long index0) {
        return (short)elfFullName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR elfFullName[64]
     * }
     */
    public static void elfFullName(MemorySegment struct, long index0, short fieldValue) {
        elfFullName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout elfStyle$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("elfStyle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR elfStyle[32]
     * }
     */
    public static final SequenceLayout elfStyle$layout() {
        return elfStyle$LAYOUT;
    }

    private static final long elfStyle$OFFSET = 220;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR elfStyle[32]
     * }
     */
    public static final long elfStyle$offset() {
        return elfStyle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR elfStyle[32]
     * }
     */
    public static MemorySegment elfStyle(MemorySegment struct) {
        return struct.asSlice(elfStyle$OFFSET, elfStyle$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR elfStyle[32]
     * }
     */
    public static void elfStyle(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, elfStyle$OFFSET, elfStyle$LAYOUT.byteSize());
    }

    private static long[] elfStyle$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR elfStyle[32]
     * }
     */
    public static long[] elfStyle$dimensions() {
        return elfStyle$DIMS;
    }
    private static final VarHandle elfStyle$ELEM_HANDLE = elfStyle$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR elfStyle[32]
     * }
     */
    public static short elfStyle(MemorySegment struct, long index0) {
        return (short)elfStyle$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR elfStyle[32]
     * }
     */
    public static void elfStyle(MemorySegment struct, long index0, short fieldValue) {
        elfStyle$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

