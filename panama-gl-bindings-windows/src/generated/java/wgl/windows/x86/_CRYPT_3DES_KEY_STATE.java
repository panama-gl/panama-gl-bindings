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
 * struct _CRYPT_3DES_KEY_STATE {
 *     unsigned char Key[24];
 *     unsigned char IV[8];
 *     unsigned char Feedback[8];
 * }
 * }
 */
public class _CRYPT_3DES_KEY_STATE {

    _CRYPT_3DES_KEY_STATE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(24, wgl_h.C_CHAR).withName("Key"),
        MemoryLayout.sequenceLayout(8, wgl_h.C_CHAR).withName("IV"),
        MemoryLayout.sequenceLayout(8, wgl_h.C_CHAR).withName("Feedback")
    ).withName("_CRYPT_3DES_KEY_STATE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout Key$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Key"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char Key[24]
     * }
     */
    public static final SequenceLayout Key$layout() {
        return Key$LAYOUT;
    }

    private static final long Key$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char Key[24]
     * }
     */
    public static final long Key$offset() {
        return Key$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char Key[24]
     * }
     */
    public static MemorySegment Key(MemorySegment struct) {
        return struct.asSlice(Key$OFFSET, Key$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char Key[24]
     * }
     */
    public static void Key(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Key$OFFSET, Key$LAYOUT.byteSize());
    }

    private static long[] Key$DIMS = { 24 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char Key[24]
     * }
     */
    public static long[] Key$dimensions() {
        return Key$DIMS;
    }
    private static final VarHandle Key$ELEM_HANDLE = Key$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char Key[24]
     * }
     */
    public static byte Key(MemorySegment struct, long index0) {
        return (byte)Key$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char Key[24]
     * }
     */
    public static void Key(MemorySegment struct, long index0, byte fieldValue) {
        Key$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout IV$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("IV"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char IV[8]
     * }
     */
    public static final SequenceLayout IV$layout() {
        return IV$LAYOUT;
    }

    private static final long IV$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char IV[8]
     * }
     */
    public static final long IV$offset() {
        return IV$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char IV[8]
     * }
     */
    public static MemorySegment IV(MemorySegment struct) {
        return struct.asSlice(IV$OFFSET, IV$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char IV[8]
     * }
     */
    public static void IV(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, IV$OFFSET, IV$LAYOUT.byteSize());
    }

    private static long[] IV$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char IV[8]
     * }
     */
    public static long[] IV$dimensions() {
        return IV$DIMS;
    }
    private static final VarHandle IV$ELEM_HANDLE = IV$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char IV[8]
     * }
     */
    public static byte IV(MemorySegment struct, long index0) {
        return (byte)IV$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char IV[8]
     * }
     */
    public static void IV(MemorySegment struct, long index0, byte fieldValue) {
        IV$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout Feedback$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Feedback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char Feedback[8]
     * }
     */
    public static final SequenceLayout Feedback$layout() {
        return Feedback$LAYOUT;
    }

    private static final long Feedback$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char Feedback[8]
     * }
     */
    public static final long Feedback$offset() {
        return Feedback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char Feedback[8]
     * }
     */
    public static MemorySegment Feedback(MemorySegment struct) {
        return struct.asSlice(Feedback$OFFSET, Feedback$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char Feedback[8]
     * }
     */
    public static void Feedback(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Feedback$OFFSET, Feedback$LAYOUT.byteSize());
    }

    private static long[] Feedback$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char Feedback[8]
     * }
     */
    public static long[] Feedback$dimensions() {
        return Feedback$DIMS;
    }
    private static final VarHandle Feedback$ELEM_HANDLE = Feedback$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char Feedback[8]
     * }
     */
    public static byte Feedback(MemorySegment struct, long index0) {
        return (byte)Feedback$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char Feedback[8]
     * }
     */
    public static void Feedback(MemorySegment struct, long index0, byte fieldValue) {
        Feedback$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

