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
 * struct _OVERLAPPED_ENTRY {
 *     ULONG_PTR lpCompletionKey;
 *     LPOVERLAPPED lpOverlapped;
 *     ULONG_PTR Internal;
 *     DWORD dwNumberOfBytesTransferred;
 * }
 * }
 */
public class _OVERLAPPED_ENTRY {

    _OVERLAPPED_ENTRY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG_LONG.withName("lpCompletionKey"),
        wgl_h.C_POINTER.withName("lpOverlapped"),
        wgl_h.C_LONG_LONG.withName("Internal"),
        wgl_h.C_LONG.withName("dwNumberOfBytesTransferred"),
        MemoryLayout.paddingLayout(4)
    ).withName("_OVERLAPPED_ENTRY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong lpCompletionKey$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lpCompletionKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR lpCompletionKey
     * }
     */
    public static final OfLong lpCompletionKey$layout() {
        return lpCompletionKey$LAYOUT;
    }

    private static final long lpCompletionKey$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR lpCompletionKey
     * }
     */
    public static final long lpCompletionKey$offset() {
        return lpCompletionKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR lpCompletionKey
     * }
     */
    public static long lpCompletionKey(MemorySegment struct) {
        return struct.get(lpCompletionKey$LAYOUT, lpCompletionKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR lpCompletionKey
     * }
     */
    public static void lpCompletionKey(MemorySegment struct, long fieldValue) {
        struct.set(lpCompletionKey$LAYOUT, lpCompletionKey$OFFSET, fieldValue);
    }

    private static final AddressLayout lpOverlapped$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpOverlapped"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPOVERLAPPED lpOverlapped
     * }
     */
    public static final AddressLayout lpOverlapped$layout() {
        return lpOverlapped$LAYOUT;
    }

    private static final long lpOverlapped$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPOVERLAPPED lpOverlapped
     * }
     */
    public static final long lpOverlapped$offset() {
        return lpOverlapped$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPOVERLAPPED lpOverlapped
     * }
     */
    public static MemorySegment lpOverlapped(MemorySegment struct) {
        return struct.get(lpOverlapped$LAYOUT, lpOverlapped$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPOVERLAPPED lpOverlapped
     * }
     */
    public static void lpOverlapped(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpOverlapped$LAYOUT, lpOverlapped$OFFSET, fieldValue);
    }

    private static final OfLong Internal$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Internal"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR Internal
     * }
     */
    public static final OfLong Internal$layout() {
        return Internal$LAYOUT;
    }

    private static final long Internal$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR Internal
     * }
     */
    public static final long Internal$offset() {
        return Internal$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR Internal
     * }
     */
    public static long Internal(MemorySegment struct) {
        return struct.get(Internal$LAYOUT, Internal$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR Internal
     * }
     */
    public static void Internal(MemorySegment struct, long fieldValue) {
        struct.set(Internal$LAYOUT, Internal$OFFSET, fieldValue);
    }

    private static final OfInt dwNumberOfBytesTransferred$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwNumberOfBytesTransferred"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwNumberOfBytesTransferred
     * }
     */
    public static final OfInt dwNumberOfBytesTransferred$layout() {
        return dwNumberOfBytesTransferred$LAYOUT;
    }

    private static final long dwNumberOfBytesTransferred$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwNumberOfBytesTransferred
     * }
     */
    public static final long dwNumberOfBytesTransferred$offset() {
        return dwNumberOfBytesTransferred$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwNumberOfBytesTransferred
     * }
     */
    public static int dwNumberOfBytesTransferred(MemorySegment struct) {
        return struct.get(dwNumberOfBytesTransferred$LAYOUT, dwNumberOfBytesTransferred$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwNumberOfBytesTransferred
     * }
     */
    public static void dwNumberOfBytesTransferred(MemorySegment struct, int fieldValue) {
        struct.set(dwNumberOfBytesTransferred$LAYOUT, dwNumberOfBytesTransferred$OFFSET, fieldValue);
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

