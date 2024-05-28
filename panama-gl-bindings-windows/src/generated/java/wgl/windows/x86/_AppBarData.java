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
 * struct _AppBarData {
 *     DWORD cbSize;
 *     HWND hWnd;
 *     UINT uCallbackMessage;
 *     UINT uEdge;
 *     RECT rc;
 *     LPARAM lParam;
 * }
 * }
 */
public class _AppBarData {

    _AppBarData() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("hWnd"),
        wgl_h.C_INT.withName("uCallbackMessage"),
        wgl_h.C_INT.withName("uEdge"),
        tagRECT.layout().withName("rc"),
        wgl_h.C_LONG_LONG.withName("lParam")
    ).withName("_AppBarData");

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

    private static final AddressLayout hWnd$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hWnd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hWnd
     * }
     */
    public static final AddressLayout hWnd$layout() {
        return hWnd$LAYOUT;
    }

    private static final long hWnd$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hWnd
     * }
     */
    public static final long hWnd$offset() {
        return hWnd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hWnd
     * }
     */
    public static MemorySegment hWnd(MemorySegment struct) {
        return struct.get(hWnd$LAYOUT, hWnd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hWnd
     * }
     */
    public static void hWnd(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hWnd$LAYOUT, hWnd$OFFSET, fieldValue);
    }

    private static final OfInt uCallbackMessage$LAYOUT = (OfInt)$LAYOUT.select(groupElement("uCallbackMessage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT uCallbackMessage
     * }
     */
    public static final OfInt uCallbackMessage$layout() {
        return uCallbackMessage$LAYOUT;
    }

    private static final long uCallbackMessage$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT uCallbackMessage
     * }
     */
    public static final long uCallbackMessage$offset() {
        return uCallbackMessage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT uCallbackMessage
     * }
     */
    public static int uCallbackMessage(MemorySegment struct) {
        return struct.get(uCallbackMessage$LAYOUT, uCallbackMessage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT uCallbackMessage
     * }
     */
    public static void uCallbackMessage(MemorySegment struct, int fieldValue) {
        struct.set(uCallbackMessage$LAYOUT, uCallbackMessage$OFFSET, fieldValue);
    }

    private static final OfInt uEdge$LAYOUT = (OfInt)$LAYOUT.select(groupElement("uEdge"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT uEdge
     * }
     */
    public static final OfInt uEdge$layout() {
        return uEdge$LAYOUT;
    }

    private static final long uEdge$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT uEdge
     * }
     */
    public static final long uEdge$offset() {
        return uEdge$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT uEdge
     * }
     */
    public static int uEdge(MemorySegment struct) {
        return struct.get(uEdge$LAYOUT, uEdge$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT uEdge
     * }
     */
    public static void uEdge(MemorySegment struct, int fieldValue) {
        struct.set(uEdge$LAYOUT, uEdge$OFFSET, fieldValue);
    }

    private static final GroupLayout rc$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECT rc
     * }
     */
    public static final GroupLayout rc$layout() {
        return rc$LAYOUT;
    }

    private static final long rc$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECT rc
     * }
     */
    public static final long rc$offset() {
        return rc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECT rc
     * }
     */
    public static MemorySegment rc(MemorySegment struct) {
        return struct.asSlice(rc$OFFSET, rc$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECT rc
     * }
     */
    public static void rc(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rc$OFFSET, rc$LAYOUT.byteSize());
    }

    private static final OfLong lParam$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lParam"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPARAM lParam
     * }
     */
    public static final OfLong lParam$layout() {
        return lParam$LAYOUT;
    }

    private static final long lParam$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPARAM lParam
     * }
     */
    public static final long lParam$offset() {
        return lParam$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPARAM lParam
     * }
     */
    public static long lParam(MemorySegment struct) {
        return struct.get(lParam$LAYOUT, lParam$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPARAM lParam
     * }
     */
    public static void lParam(MemorySegment struct, long fieldValue) {
        struct.set(lParam$LAYOUT, lParam$OFFSET, fieldValue);
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

