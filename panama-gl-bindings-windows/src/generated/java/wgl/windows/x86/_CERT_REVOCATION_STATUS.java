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
 * struct _CERT_REVOCATION_STATUS {
 *     DWORD cbSize;
 *     DWORD dwIndex;
 *     DWORD dwError;
 *     DWORD dwReason;
 *     BOOL fHasFreshnessTime;
 *     DWORD dwFreshnessTime;
 * }
 * }
 */
public class _CERT_REVOCATION_STATUS {

    _CERT_REVOCATION_STATUS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cbSize"),
        wgl_h.C_LONG.withName("dwIndex"),
        wgl_h.C_LONG.withName("dwError"),
        wgl_h.C_LONG.withName("dwReason"),
        wgl_h.C_INT.withName("fHasFreshnessTime"),
        wgl_h.C_LONG.withName("dwFreshnessTime")
    ).withName("_CERT_REVOCATION_STATUS");

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
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt dwIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwIndex
     * }
     */
    public static final OfInt dwIndex$layout() {
        return dwIndex$LAYOUT;
    }

    private static final long dwIndex$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwIndex
     * }
     */
    public static final long dwIndex$offset() {
        return dwIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwIndex
     * }
     */
    public static int dwIndex(MemorySegment struct) {
        return struct.get(dwIndex$LAYOUT, dwIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwIndex
     * }
     */
    public static void dwIndex(MemorySegment struct, int fieldValue) {
        struct.set(dwIndex$LAYOUT, dwIndex$OFFSET, fieldValue);
    }

    private static final OfInt dwError$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwError"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwError
     * }
     */
    public static final OfInt dwError$layout() {
        return dwError$LAYOUT;
    }

    private static final long dwError$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwError
     * }
     */
    public static final long dwError$offset() {
        return dwError$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwError
     * }
     */
    public static int dwError(MemorySegment struct) {
        return struct.get(dwError$LAYOUT, dwError$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwError
     * }
     */
    public static void dwError(MemorySegment struct, int fieldValue) {
        struct.set(dwError$LAYOUT, dwError$OFFSET, fieldValue);
    }

    private static final OfInt dwReason$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwReason"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwReason
     * }
     */
    public static final OfInt dwReason$layout() {
        return dwReason$LAYOUT;
    }

    private static final long dwReason$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwReason
     * }
     */
    public static final long dwReason$offset() {
        return dwReason$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwReason
     * }
     */
    public static int dwReason(MemorySegment struct) {
        return struct.get(dwReason$LAYOUT, dwReason$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwReason
     * }
     */
    public static void dwReason(MemorySegment struct, int fieldValue) {
        struct.set(dwReason$LAYOUT, dwReason$OFFSET, fieldValue);
    }

    private static final OfInt fHasFreshnessTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fHasFreshnessTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fHasFreshnessTime
     * }
     */
    public static final OfInt fHasFreshnessTime$layout() {
        return fHasFreshnessTime$LAYOUT;
    }

    private static final long fHasFreshnessTime$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fHasFreshnessTime
     * }
     */
    public static final long fHasFreshnessTime$offset() {
        return fHasFreshnessTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fHasFreshnessTime
     * }
     */
    public static int fHasFreshnessTime(MemorySegment struct) {
        return struct.get(fHasFreshnessTime$LAYOUT, fHasFreshnessTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fHasFreshnessTime
     * }
     */
    public static void fHasFreshnessTime(MemorySegment struct, int fieldValue) {
        struct.set(fHasFreshnessTime$LAYOUT, fHasFreshnessTime$OFFSET, fieldValue);
    }

    private static final OfInt dwFreshnessTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFreshnessTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFreshnessTime
     * }
     */
    public static final OfInt dwFreshnessTime$layout() {
        return dwFreshnessTime$LAYOUT;
    }

    private static final long dwFreshnessTime$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFreshnessTime
     * }
     */
    public static final long dwFreshnessTime$offset() {
        return dwFreshnessTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFreshnessTime
     * }
     */
    public static int dwFreshnessTime(MemorySegment struct) {
        return struct.get(dwFreshnessTime$LAYOUT, dwFreshnessTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFreshnessTime
     * }
     */
    public static void dwFreshnessTime(MemorySegment struct, int fieldValue) {
        struct.set(dwFreshnessTime$LAYOUT, dwFreshnessTime$OFFSET, fieldValue);
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

