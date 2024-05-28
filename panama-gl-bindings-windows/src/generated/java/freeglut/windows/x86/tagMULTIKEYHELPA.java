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
 * struct tagMULTIKEYHELPA {
 *     DWORD mkSize;
 *     CHAR mkKeylist;
 *     CHAR szKeyphrase[1];
 * }
 * }
 */
public class tagMULTIKEYHELPA {

    tagMULTIKEYHELPA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("mkSize"),
        freeglut_h.C_CHAR.withName("mkKeylist"),
        MemoryLayout.sequenceLayout(1, freeglut_h.C_CHAR).withName("szKeyphrase"),
        MemoryLayout.paddingLayout(2)
    ).withName("tagMULTIKEYHELPA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt mkSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("mkSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD mkSize
     * }
     */
    public static final OfInt mkSize$layout() {
        return mkSize$LAYOUT;
    }

    private static final long mkSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD mkSize
     * }
     */
    public static final long mkSize$offset() {
        return mkSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD mkSize
     * }
     */
    public static int mkSize(MemorySegment struct) {
        return struct.get(mkSize$LAYOUT, mkSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD mkSize
     * }
     */
    public static void mkSize(MemorySegment struct, int fieldValue) {
        struct.set(mkSize$LAYOUT, mkSize$OFFSET, fieldValue);
    }

    private static final OfByte mkKeylist$LAYOUT = (OfByte)$LAYOUT.select(groupElement("mkKeylist"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR mkKeylist
     * }
     */
    public static final OfByte mkKeylist$layout() {
        return mkKeylist$LAYOUT;
    }

    private static final long mkKeylist$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR mkKeylist
     * }
     */
    public static final long mkKeylist$offset() {
        return mkKeylist$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR mkKeylist
     * }
     */
    public static byte mkKeylist(MemorySegment struct) {
        return struct.get(mkKeylist$LAYOUT, mkKeylist$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR mkKeylist
     * }
     */
    public static void mkKeylist(MemorySegment struct, byte fieldValue) {
        struct.set(mkKeylist$LAYOUT, mkKeylist$OFFSET, fieldValue);
    }

    private static final SequenceLayout szKeyphrase$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szKeyphrase"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR szKeyphrase[1]
     * }
     */
    public static final SequenceLayout szKeyphrase$layout() {
        return szKeyphrase$LAYOUT;
    }

    private static final long szKeyphrase$OFFSET = 5;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR szKeyphrase[1]
     * }
     */
    public static final long szKeyphrase$offset() {
        return szKeyphrase$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR szKeyphrase[1]
     * }
     */
    public static MemorySegment szKeyphrase(MemorySegment struct) {
        return struct.asSlice(szKeyphrase$OFFSET, szKeyphrase$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR szKeyphrase[1]
     * }
     */
    public static void szKeyphrase(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szKeyphrase$OFFSET, szKeyphrase$LAYOUT.byteSize());
    }

    private static long[] szKeyphrase$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR szKeyphrase[1]
     * }
     */
    public static long[] szKeyphrase$dimensions() {
        return szKeyphrase$DIMS;
    }
    private static final VarHandle szKeyphrase$ELEM_HANDLE = szKeyphrase$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR szKeyphrase[1]
     * }
     */
    public static byte szKeyphrase(MemorySegment struct, long index0) {
        return (byte)szKeyphrase$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR szKeyphrase[1]
     * }
     */
    public static void szKeyphrase(MemorySegment struct, long index0, byte fieldValue) {
        szKeyphrase$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

