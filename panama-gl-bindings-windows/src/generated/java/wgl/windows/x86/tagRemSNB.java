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
 * struct tagRemSNB {
 *     ULONG ulCntStr;
 *     ULONG ulCntChar;
 *     OLECHAR rgString[1];
 * }
 * }
 */
public class tagRemSNB {

    tagRemSNB() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("ulCntStr"),
        wgl_h.C_LONG.withName("ulCntChar"),
        MemoryLayout.sequenceLayout(1, wgl_h.C_SHORT).withName("rgString"),
        MemoryLayout.paddingLayout(2)
    ).withName("tagRemSNB");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ulCntStr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulCntStr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ulCntStr
     * }
     */
    public static final OfInt ulCntStr$layout() {
        return ulCntStr$LAYOUT;
    }

    private static final long ulCntStr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ulCntStr
     * }
     */
    public static final long ulCntStr$offset() {
        return ulCntStr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ulCntStr
     * }
     */
    public static int ulCntStr(MemorySegment struct) {
        return struct.get(ulCntStr$LAYOUT, ulCntStr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ulCntStr
     * }
     */
    public static void ulCntStr(MemorySegment struct, int fieldValue) {
        struct.set(ulCntStr$LAYOUT, ulCntStr$OFFSET, fieldValue);
    }

    private static final OfInt ulCntChar$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulCntChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ulCntChar
     * }
     */
    public static final OfInt ulCntChar$layout() {
        return ulCntChar$LAYOUT;
    }

    private static final long ulCntChar$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ulCntChar
     * }
     */
    public static final long ulCntChar$offset() {
        return ulCntChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ulCntChar
     * }
     */
    public static int ulCntChar(MemorySegment struct) {
        return struct.get(ulCntChar$LAYOUT, ulCntChar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ulCntChar
     * }
     */
    public static void ulCntChar(MemorySegment struct, int fieldValue) {
        struct.set(ulCntChar$LAYOUT, ulCntChar$OFFSET, fieldValue);
    }

    private static final SequenceLayout rgString$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("rgString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * OLECHAR rgString[1]
     * }
     */
    public static final SequenceLayout rgString$layout() {
        return rgString$LAYOUT;
    }

    private static final long rgString$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * OLECHAR rgString[1]
     * }
     */
    public static final long rgString$offset() {
        return rgString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * OLECHAR rgString[1]
     * }
     */
    public static MemorySegment rgString(MemorySegment struct) {
        return struct.asSlice(rgString$OFFSET, rgString$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * OLECHAR rgString[1]
     * }
     */
    public static void rgString(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rgString$OFFSET, rgString$LAYOUT.byteSize());
    }

    private static long[] rgString$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * OLECHAR rgString[1]
     * }
     */
    public static long[] rgString$dimensions() {
        return rgString$DIMS;
    }
    private static final VarHandle rgString$ELEM_HANDLE = rgString$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * OLECHAR rgString[1]
     * }
     */
    public static short rgString(MemorySegment struct, long index0) {
        return (short)rgString$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * OLECHAR rgString[1]
     * }
     */
    public static void rgString(MemorySegment struct, long index0, short fieldValue) {
        rgString$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

