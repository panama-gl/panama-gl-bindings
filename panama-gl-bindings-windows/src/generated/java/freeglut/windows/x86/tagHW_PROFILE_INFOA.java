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
 * struct tagHW_PROFILE_INFOA {
 *     DWORD dwDockInfo;
 *     CHAR szHwProfileGuid[39];
 *     CHAR szHwProfileName[80];
 * }
 * }
 */
public class tagHW_PROFILE_INFOA {

    tagHW_PROFILE_INFOA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("dwDockInfo"),
        MemoryLayout.sequenceLayout(39, freeglut_h.C_CHAR).withName("szHwProfileGuid"),
        MemoryLayout.sequenceLayout(80, freeglut_h.C_CHAR).withName("szHwProfileName"),
        MemoryLayout.paddingLayout(1)
    ).withName("tagHW_PROFILE_INFOA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwDockInfo$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDockInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDockInfo
     * }
     */
    public static final OfInt dwDockInfo$layout() {
        return dwDockInfo$LAYOUT;
    }

    private static final long dwDockInfo$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDockInfo
     * }
     */
    public static final long dwDockInfo$offset() {
        return dwDockInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDockInfo
     * }
     */
    public static int dwDockInfo(MemorySegment struct) {
        return struct.get(dwDockInfo$LAYOUT, dwDockInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDockInfo
     * }
     */
    public static void dwDockInfo(MemorySegment struct, int fieldValue) {
        struct.set(dwDockInfo$LAYOUT, dwDockInfo$OFFSET, fieldValue);
    }

    private static final SequenceLayout szHwProfileGuid$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szHwProfileGuid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR szHwProfileGuid[39]
     * }
     */
    public static final SequenceLayout szHwProfileGuid$layout() {
        return szHwProfileGuid$LAYOUT;
    }

    private static final long szHwProfileGuid$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR szHwProfileGuid[39]
     * }
     */
    public static final long szHwProfileGuid$offset() {
        return szHwProfileGuid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR szHwProfileGuid[39]
     * }
     */
    public static MemorySegment szHwProfileGuid(MemorySegment struct) {
        return struct.asSlice(szHwProfileGuid$OFFSET, szHwProfileGuid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR szHwProfileGuid[39]
     * }
     */
    public static void szHwProfileGuid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szHwProfileGuid$OFFSET, szHwProfileGuid$LAYOUT.byteSize());
    }

    private static long[] szHwProfileGuid$DIMS = { 39 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR szHwProfileGuid[39]
     * }
     */
    public static long[] szHwProfileGuid$dimensions() {
        return szHwProfileGuid$DIMS;
    }
    private static final VarHandle szHwProfileGuid$ELEM_HANDLE = szHwProfileGuid$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR szHwProfileGuid[39]
     * }
     */
    public static byte szHwProfileGuid(MemorySegment struct, long index0) {
        return (byte)szHwProfileGuid$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR szHwProfileGuid[39]
     * }
     */
    public static void szHwProfileGuid(MemorySegment struct, long index0, byte fieldValue) {
        szHwProfileGuid$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout szHwProfileName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szHwProfileName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR szHwProfileName[80]
     * }
     */
    public static final SequenceLayout szHwProfileName$layout() {
        return szHwProfileName$LAYOUT;
    }

    private static final long szHwProfileName$OFFSET = 43;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR szHwProfileName[80]
     * }
     */
    public static final long szHwProfileName$offset() {
        return szHwProfileName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR szHwProfileName[80]
     * }
     */
    public static MemorySegment szHwProfileName(MemorySegment struct) {
        return struct.asSlice(szHwProfileName$OFFSET, szHwProfileName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR szHwProfileName[80]
     * }
     */
    public static void szHwProfileName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szHwProfileName$OFFSET, szHwProfileName$LAYOUT.byteSize());
    }

    private static long[] szHwProfileName$DIMS = { 80 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR szHwProfileName[80]
     * }
     */
    public static long[] szHwProfileName$dimensions() {
        return szHwProfileName$DIMS;
    }
    private static final VarHandle szHwProfileName$ELEM_HANDLE = szHwProfileName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR szHwProfileName[80]
     * }
     */
    public static byte szHwProfileName(MemorySegment struct, long index0) {
        return (byte)szHwProfileName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR szHwProfileName[80]
     * }
     */
    public static void szHwProfileName(MemorySegment struct, long index0, byte fieldValue) {
        szHwProfileName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

