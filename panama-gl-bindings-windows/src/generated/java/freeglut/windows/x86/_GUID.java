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
 * struct _GUID {
 *     unsigned long Data1;
 *     unsigned short Data2;
 *     unsigned short Data3;
 *     unsigned char Data4[8];
 * }
 * }
 */
public class _GUID {

    _GUID() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("Data1"),
        freeglut_h.C_SHORT.withName("Data2"),
        freeglut_h.C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, freeglut_h.C_CHAR).withName("Data4")
    ).withName("_GUID");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Data1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Data1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long Data1
     * }
     */
    public static final OfInt Data1$layout() {
        return Data1$LAYOUT;
    }

    private static final long Data1$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long Data1
     * }
     */
    public static final long Data1$offset() {
        return Data1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long Data1
     * }
     */
    public static int Data1(MemorySegment struct) {
        return struct.get(Data1$LAYOUT, Data1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long Data1
     * }
     */
    public static void Data1(MemorySegment struct, int fieldValue) {
        struct.set(Data1$LAYOUT, Data1$OFFSET, fieldValue);
    }

    private static final OfShort Data2$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Data2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short Data2
     * }
     */
    public static final OfShort Data2$layout() {
        return Data2$LAYOUT;
    }

    private static final long Data2$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short Data2
     * }
     */
    public static final long Data2$offset() {
        return Data2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short Data2
     * }
     */
    public static short Data2(MemorySegment struct) {
        return struct.get(Data2$LAYOUT, Data2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short Data2
     * }
     */
    public static void Data2(MemorySegment struct, short fieldValue) {
        struct.set(Data2$LAYOUT, Data2$OFFSET, fieldValue);
    }

    private static final OfShort Data3$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Data3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short Data3
     * }
     */
    public static final OfShort Data3$layout() {
        return Data3$LAYOUT;
    }

    private static final long Data3$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short Data3
     * }
     */
    public static final long Data3$offset() {
        return Data3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short Data3
     * }
     */
    public static short Data3(MemorySegment struct) {
        return struct.get(Data3$LAYOUT, Data3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short Data3
     * }
     */
    public static void Data3(MemorySegment struct, short fieldValue) {
        struct.set(Data3$LAYOUT, Data3$OFFSET, fieldValue);
    }

    private static final SequenceLayout Data4$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Data4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char Data4[8]
     * }
     */
    public static final SequenceLayout Data4$layout() {
        return Data4$LAYOUT;
    }

    private static final long Data4$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char Data4[8]
     * }
     */
    public static final long Data4$offset() {
        return Data4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char Data4[8]
     * }
     */
    public static MemorySegment Data4(MemorySegment struct) {
        return struct.asSlice(Data4$OFFSET, Data4$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char Data4[8]
     * }
     */
    public static void Data4(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Data4$OFFSET, Data4$LAYOUT.byteSize());
    }

    private static long[] Data4$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char Data4[8]
     * }
     */
    public static long[] Data4$dimensions() {
        return Data4$DIMS;
    }
    private static final VarHandle Data4$ELEM_HANDLE = Data4$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char Data4[8]
     * }
     */
    public static byte Data4(MemorySegment struct, long index0) {
        return (byte)Data4$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char Data4[8]
     * }
     */
    public static void Data4(MemorySegment struct, long index0, byte fieldValue) {
        Data4$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

