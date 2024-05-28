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
 * struct tagFONTSIGNATURE {
 *     DWORD fsUsb[4];
 *     DWORD fsCsb[2];
 * }
 * }
 */
public class tagFONTSIGNATURE {

    tagFONTSIGNATURE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, wgl_h.C_LONG).withName("fsUsb"),
        MemoryLayout.sequenceLayout(2, wgl_h.C_LONG).withName("fsCsb")
    ).withName("tagFONTSIGNATURE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout fsUsb$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("fsUsb"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD fsUsb[4]
     * }
     */
    public static final SequenceLayout fsUsb$layout() {
        return fsUsb$LAYOUT;
    }

    private static final long fsUsb$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD fsUsb[4]
     * }
     */
    public static final long fsUsb$offset() {
        return fsUsb$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD fsUsb[4]
     * }
     */
    public static MemorySegment fsUsb(MemorySegment struct) {
        return struct.asSlice(fsUsb$OFFSET, fsUsb$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD fsUsb[4]
     * }
     */
    public static void fsUsb(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, fsUsb$OFFSET, fsUsb$LAYOUT.byteSize());
    }

    private static long[] fsUsb$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD fsUsb[4]
     * }
     */
    public static long[] fsUsb$dimensions() {
        return fsUsb$DIMS;
    }
    private static final VarHandle fsUsb$ELEM_HANDLE = fsUsb$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD fsUsb[4]
     * }
     */
    public static int fsUsb(MemorySegment struct, long index0) {
        return (int)fsUsb$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD fsUsb[4]
     * }
     */
    public static void fsUsb(MemorySegment struct, long index0, int fieldValue) {
        fsUsb$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout fsCsb$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("fsCsb"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD fsCsb[2]
     * }
     */
    public static final SequenceLayout fsCsb$layout() {
        return fsCsb$LAYOUT;
    }

    private static final long fsCsb$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD fsCsb[2]
     * }
     */
    public static final long fsCsb$offset() {
        return fsCsb$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD fsCsb[2]
     * }
     */
    public static MemorySegment fsCsb(MemorySegment struct) {
        return struct.asSlice(fsCsb$OFFSET, fsCsb$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD fsCsb[2]
     * }
     */
    public static void fsCsb(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, fsCsb$OFFSET, fsCsb$LAYOUT.byteSize());
    }

    private static long[] fsCsb$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD fsCsb[2]
     * }
     */
    public static long[] fsCsb$dimensions() {
        return fsCsb$DIMS;
    }
    private static final VarHandle fsCsb$ELEM_HANDLE = fsCsb$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD fsCsb[2]
     * }
     */
    public static int fsCsb(MemorySegment struct, long index0) {
        return (int)fsCsb$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD fsCsb[2]
     * }
     */
    public static void fsCsb(MemorySegment struct, long index0, int fieldValue) {
        fsCsb$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

