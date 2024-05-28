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
 * struct _QUERY_SERVICE_LOCK_STATUSW {
 *     DWORD fIsLocked;
 *     LPWSTR lpLockOwner;
 *     DWORD dwLockDuration;
 * }
 * }
 */
public class _QUERY_SERVICE_LOCK_STATUSW {

    _QUERY_SERVICE_LOCK_STATUSW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("fIsLocked"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_POINTER.withName("lpLockOwner"),
        freeglut_h.C_LONG.withName("dwLockDuration"),
        MemoryLayout.paddingLayout(4)
    ).withName("_QUERY_SERVICE_LOCK_STATUSW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt fIsLocked$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fIsLocked"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD fIsLocked
     * }
     */
    public static final OfInt fIsLocked$layout() {
        return fIsLocked$LAYOUT;
    }

    private static final long fIsLocked$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD fIsLocked
     * }
     */
    public static final long fIsLocked$offset() {
        return fIsLocked$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD fIsLocked
     * }
     */
    public static int fIsLocked(MemorySegment struct) {
        return struct.get(fIsLocked$LAYOUT, fIsLocked$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD fIsLocked
     * }
     */
    public static void fIsLocked(MemorySegment struct, int fieldValue) {
        struct.set(fIsLocked$LAYOUT, fIsLocked$OFFSET, fieldValue);
    }

    private static final AddressLayout lpLockOwner$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpLockOwner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpLockOwner
     * }
     */
    public static final AddressLayout lpLockOwner$layout() {
        return lpLockOwner$LAYOUT;
    }

    private static final long lpLockOwner$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpLockOwner
     * }
     */
    public static final long lpLockOwner$offset() {
        return lpLockOwner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpLockOwner
     * }
     */
    public static MemorySegment lpLockOwner(MemorySegment struct) {
        return struct.get(lpLockOwner$LAYOUT, lpLockOwner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpLockOwner
     * }
     */
    public static void lpLockOwner(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpLockOwner$LAYOUT, lpLockOwner$OFFSET, fieldValue);
    }

    private static final OfInt dwLockDuration$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwLockDuration"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwLockDuration
     * }
     */
    public static final OfInt dwLockDuration$layout() {
        return dwLockDuration$LAYOUT;
    }

    private static final long dwLockDuration$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwLockDuration
     * }
     */
    public static final long dwLockDuration$offset() {
        return dwLockDuration$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwLockDuration
     * }
     */
    public static int dwLockDuration(MemorySegment struct) {
        return struct.get(dwLockDuration$LAYOUT, dwLockDuration$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwLockDuration
     * }
     */
    public static void dwLockDuration(MemorySegment struct, int fieldValue) {
        struct.set(dwLockDuration$LAYOUT, dwLockDuration$OFFSET, fieldValue);
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

