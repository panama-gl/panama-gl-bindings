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
 * struct tagSTYLEBUFA {
 *     DWORD dwStyle;
 *     CHAR szDescription[32];
 * }
 * }
 */
public class tagSTYLEBUFA {

    tagSTYLEBUFA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("dwStyle"),
        MemoryLayout.sequenceLayout(32, freeglut_h.C_CHAR).withName("szDescription")
    ).withName("tagSTYLEBUFA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwStyle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwStyle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwStyle
     * }
     */
    public static final OfInt dwStyle$layout() {
        return dwStyle$LAYOUT;
    }

    private static final long dwStyle$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwStyle
     * }
     */
    public static final long dwStyle$offset() {
        return dwStyle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwStyle
     * }
     */
    public static int dwStyle(MemorySegment struct) {
        return struct.get(dwStyle$LAYOUT, dwStyle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwStyle
     * }
     */
    public static void dwStyle(MemorySegment struct, int fieldValue) {
        struct.set(dwStyle$LAYOUT, dwStyle$OFFSET, fieldValue);
    }

    private static final SequenceLayout szDescription$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szDescription"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR szDescription[32]
     * }
     */
    public static final SequenceLayout szDescription$layout() {
        return szDescription$LAYOUT;
    }

    private static final long szDescription$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR szDescription[32]
     * }
     */
    public static final long szDescription$offset() {
        return szDescription$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR szDescription[32]
     * }
     */
    public static MemorySegment szDescription(MemorySegment struct) {
        return struct.asSlice(szDescription$OFFSET, szDescription$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR szDescription[32]
     * }
     */
    public static void szDescription(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szDescription$OFFSET, szDescription$LAYOUT.byteSize());
    }

    private static long[] szDescription$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR szDescription[32]
     * }
     */
    public static long[] szDescription$dimensions() {
        return szDescription$DIMS;
    }
    private static final VarHandle szDescription$ELEM_HANDLE = szDescription$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR szDescription[32]
     * }
     */
    public static byte szDescription(MemorySegment struct, long index0) {
        return (byte)szDescription$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR szDescription[32]
     * }
     */
    public static void szDescription(MemorySegment struct, long index0, byte fieldValue) {
        szDescription$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

