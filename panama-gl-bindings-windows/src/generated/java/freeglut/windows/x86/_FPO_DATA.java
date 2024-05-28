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
 * struct _FPO_DATA {
 *     DWORD ulOffStart;
 *     DWORD cbProcSize;
 *     DWORD cdwLocals;
 *     WORD cdwParams;
 *     WORD cbProlog : 8;
 *     WORD cbRegs : 3;
 *     WORD fHasSEH : 1;
 *     WORD fUseBP : 1;
 *     WORD reserved : 1;
 *     WORD cbFrame : 2;
 * }
 * }
 */
public class _FPO_DATA {

    _FPO_DATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("ulOffStart"),
        freeglut_h.C_LONG.withName("cbProcSize"),
        freeglut_h.C_LONG.withName("cdwLocals"),
        freeglut_h.C_SHORT.withName("cdwParams"),
        MemoryLayout.paddingLayout(2)
    ).withName("_FPO_DATA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ulOffStart$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulOffStart"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulOffStart
     * }
     */
    public static final OfInt ulOffStart$layout() {
        return ulOffStart$LAYOUT;
    }

    private static final long ulOffStart$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulOffStart
     * }
     */
    public static final long ulOffStart$offset() {
        return ulOffStart$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulOffStart
     * }
     */
    public static int ulOffStart(MemorySegment struct) {
        return struct.get(ulOffStart$LAYOUT, ulOffStart$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulOffStart
     * }
     */
    public static void ulOffStart(MemorySegment struct, int fieldValue) {
        struct.set(ulOffStart$LAYOUT, ulOffStart$OFFSET, fieldValue);
    }

    private static final OfInt cbProcSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbProcSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbProcSize
     * }
     */
    public static final OfInt cbProcSize$layout() {
        return cbProcSize$LAYOUT;
    }

    private static final long cbProcSize$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbProcSize
     * }
     */
    public static final long cbProcSize$offset() {
        return cbProcSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbProcSize
     * }
     */
    public static int cbProcSize(MemorySegment struct) {
        return struct.get(cbProcSize$LAYOUT, cbProcSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbProcSize
     * }
     */
    public static void cbProcSize(MemorySegment struct, int fieldValue) {
        struct.set(cbProcSize$LAYOUT, cbProcSize$OFFSET, fieldValue);
    }

    private static final OfInt cdwLocals$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cdwLocals"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cdwLocals
     * }
     */
    public static final OfInt cdwLocals$layout() {
        return cdwLocals$LAYOUT;
    }

    private static final long cdwLocals$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cdwLocals
     * }
     */
    public static final long cdwLocals$offset() {
        return cdwLocals$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cdwLocals
     * }
     */
    public static int cdwLocals(MemorySegment struct) {
        return struct.get(cdwLocals$LAYOUT, cdwLocals$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cdwLocals
     * }
     */
    public static void cdwLocals(MemorySegment struct, int fieldValue) {
        struct.set(cdwLocals$LAYOUT, cdwLocals$OFFSET, fieldValue);
    }

    private static final OfShort cdwParams$LAYOUT = (OfShort)$LAYOUT.select(groupElement("cdwParams"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD cdwParams
     * }
     */
    public static final OfShort cdwParams$layout() {
        return cdwParams$LAYOUT;
    }

    private static final long cdwParams$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD cdwParams
     * }
     */
    public static final long cdwParams$offset() {
        return cdwParams$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD cdwParams
     * }
     */
    public static short cdwParams(MemorySegment struct) {
        return struct.get(cdwParams$LAYOUT, cdwParams$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD cdwParams
     * }
     */
    public static void cdwParams(MemorySegment struct, short fieldValue) {
        struct.set(cdwParams$LAYOUT, cdwParams$OFFSET, fieldValue);
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

