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
 * struct tagGESTUREINFO {
 *     UINT cbSize;
 *     DWORD dwFlags;
 *     DWORD dwID;
 *     HWND hwndTarget;
 *     POINTS ptsLocation;
 *     DWORD dwInstanceID;
 *     DWORD dwSequenceID;
 *     ULONGLONG ullArguments;
 *     UINT cbExtraArgs;
 * }
 * }
 */
public class tagGESTUREINFO {

    tagGESTUREINFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_INT.withName("cbSize"),
        freeglut_h.C_LONG.withName("dwFlags"),
        freeglut_h.C_LONG.withName("dwID"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_POINTER.withName("hwndTarget"),
        tagPOINTS.layout().withName("ptsLocation"),
        freeglut_h.C_LONG.withName("dwInstanceID"),
        freeglut_h.C_LONG.withName("dwSequenceID"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_LONG_LONG.withName("ullArguments"),
        freeglut_h.C_INT.withName("cbExtraArgs"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagGESTUREINFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt dwFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final OfInt dwFlags$layout() {
        return dwFlags$LAYOUT;
    }

    private static final long dwFlags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final long dwFlags$offset() {
        return dwFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static int dwFlags(MemorySegment struct) {
        return struct.get(dwFlags$LAYOUT, dwFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static void dwFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwFlags$LAYOUT, dwFlags$OFFSET, fieldValue);
    }

    private static final OfInt dwID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwID
     * }
     */
    public static final OfInt dwID$layout() {
        return dwID$LAYOUT;
    }

    private static final long dwID$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwID
     * }
     */
    public static final long dwID$offset() {
        return dwID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwID
     * }
     */
    public static int dwID(MemorySegment struct) {
        return struct.get(dwID$LAYOUT, dwID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwID
     * }
     */
    public static void dwID(MemorySegment struct, int fieldValue) {
        struct.set(dwID$LAYOUT, dwID$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndTarget$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndTarget"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndTarget
     * }
     */
    public static final AddressLayout hwndTarget$layout() {
        return hwndTarget$LAYOUT;
    }

    private static final long hwndTarget$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndTarget
     * }
     */
    public static final long hwndTarget$offset() {
        return hwndTarget$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndTarget
     * }
     */
    public static MemorySegment hwndTarget(MemorySegment struct) {
        return struct.get(hwndTarget$LAYOUT, hwndTarget$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndTarget
     * }
     */
    public static void hwndTarget(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndTarget$LAYOUT, hwndTarget$OFFSET, fieldValue);
    }

    private static final GroupLayout ptsLocation$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ptsLocation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTS ptsLocation
     * }
     */
    public static final GroupLayout ptsLocation$layout() {
        return ptsLocation$LAYOUT;
    }

    private static final long ptsLocation$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTS ptsLocation
     * }
     */
    public static final long ptsLocation$offset() {
        return ptsLocation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTS ptsLocation
     * }
     */
    public static MemorySegment ptsLocation(MemorySegment struct) {
        return struct.asSlice(ptsLocation$OFFSET, ptsLocation$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTS ptsLocation
     * }
     */
    public static void ptsLocation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ptsLocation$OFFSET, ptsLocation$LAYOUT.byteSize());
    }

    private static final OfInt dwInstanceID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwInstanceID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwInstanceID
     * }
     */
    public static final OfInt dwInstanceID$layout() {
        return dwInstanceID$LAYOUT;
    }

    private static final long dwInstanceID$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwInstanceID
     * }
     */
    public static final long dwInstanceID$offset() {
        return dwInstanceID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwInstanceID
     * }
     */
    public static int dwInstanceID(MemorySegment struct) {
        return struct.get(dwInstanceID$LAYOUT, dwInstanceID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwInstanceID
     * }
     */
    public static void dwInstanceID(MemorySegment struct, int fieldValue) {
        struct.set(dwInstanceID$LAYOUT, dwInstanceID$OFFSET, fieldValue);
    }

    private static final OfInt dwSequenceID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSequenceID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSequenceID
     * }
     */
    public static final OfInt dwSequenceID$layout() {
        return dwSequenceID$LAYOUT;
    }

    private static final long dwSequenceID$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSequenceID
     * }
     */
    public static final long dwSequenceID$offset() {
        return dwSequenceID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSequenceID
     * }
     */
    public static int dwSequenceID(MemorySegment struct) {
        return struct.get(dwSequenceID$LAYOUT, dwSequenceID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSequenceID
     * }
     */
    public static void dwSequenceID(MemorySegment struct, int fieldValue) {
        struct.set(dwSequenceID$LAYOUT, dwSequenceID$OFFSET, fieldValue);
    }

    private static final OfLong ullArguments$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ullArguments"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG ullArguments
     * }
     */
    public static final OfLong ullArguments$layout() {
        return ullArguments$LAYOUT;
    }

    private static final long ullArguments$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG ullArguments
     * }
     */
    public static final long ullArguments$offset() {
        return ullArguments$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG ullArguments
     * }
     */
    public static long ullArguments(MemorySegment struct) {
        return struct.get(ullArguments$LAYOUT, ullArguments$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG ullArguments
     * }
     */
    public static void ullArguments(MemorySegment struct, long fieldValue) {
        struct.set(ullArguments$LAYOUT, ullArguments$OFFSET, fieldValue);
    }

    private static final OfInt cbExtraArgs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbExtraArgs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT cbExtraArgs
     * }
     */
    public static final OfInt cbExtraArgs$layout() {
        return cbExtraArgs$LAYOUT;
    }

    private static final long cbExtraArgs$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT cbExtraArgs
     * }
     */
    public static final long cbExtraArgs$offset() {
        return cbExtraArgs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT cbExtraArgs
     * }
     */
    public static int cbExtraArgs(MemorySegment struct) {
        return struct.get(cbExtraArgs$LAYOUT, cbExtraArgs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT cbExtraArgs
     * }
     */
    public static void cbExtraArgs(MemorySegment struct, int fieldValue) {
        struct.set(cbExtraArgs$LAYOUT, cbExtraArgs$OFFSET, fieldValue);
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

