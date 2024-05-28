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
 * struct tagGUITHREADINFO {
 *     DWORD cbSize;
 *     DWORD flags;
 *     HWND hwndActive;
 *     HWND hwndFocus;
 *     HWND hwndCapture;
 *     HWND hwndMenuOwner;
 *     HWND hwndMoveSize;
 *     HWND hwndCaret;
 *     RECT rcCaret;
 * }
 * }
 */
public class tagGUITHREADINFO {

    tagGUITHREADINFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cbSize"),
        wgl_h.C_LONG.withName("flags"),
        wgl_h.C_POINTER.withName("hwndActive"),
        wgl_h.C_POINTER.withName("hwndFocus"),
        wgl_h.C_POINTER.withName("hwndCapture"),
        wgl_h.C_POINTER.withName("hwndMenuOwner"),
        wgl_h.C_POINTER.withName("hwndMoveSize"),
        wgl_h.C_POINTER.withName("hwndCaret"),
        tagRECT.layout().withName("rcCaret")
    ).withName("tagGUITHREADINFO");

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

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndActive$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndActive"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndActive
     * }
     */
    public static final AddressLayout hwndActive$layout() {
        return hwndActive$LAYOUT;
    }

    private static final long hwndActive$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndActive
     * }
     */
    public static final long hwndActive$offset() {
        return hwndActive$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndActive
     * }
     */
    public static MemorySegment hwndActive(MemorySegment struct) {
        return struct.get(hwndActive$LAYOUT, hwndActive$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndActive
     * }
     */
    public static void hwndActive(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndActive$LAYOUT, hwndActive$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndFocus$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndFocus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndFocus
     * }
     */
    public static final AddressLayout hwndFocus$layout() {
        return hwndFocus$LAYOUT;
    }

    private static final long hwndFocus$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndFocus
     * }
     */
    public static final long hwndFocus$offset() {
        return hwndFocus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndFocus
     * }
     */
    public static MemorySegment hwndFocus(MemorySegment struct) {
        return struct.get(hwndFocus$LAYOUT, hwndFocus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndFocus
     * }
     */
    public static void hwndFocus(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndFocus$LAYOUT, hwndFocus$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndCapture$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndCapture"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndCapture
     * }
     */
    public static final AddressLayout hwndCapture$layout() {
        return hwndCapture$LAYOUT;
    }

    private static final long hwndCapture$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndCapture
     * }
     */
    public static final long hwndCapture$offset() {
        return hwndCapture$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndCapture
     * }
     */
    public static MemorySegment hwndCapture(MemorySegment struct) {
        return struct.get(hwndCapture$LAYOUT, hwndCapture$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndCapture
     * }
     */
    public static void hwndCapture(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndCapture$LAYOUT, hwndCapture$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndMenuOwner$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndMenuOwner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndMenuOwner
     * }
     */
    public static final AddressLayout hwndMenuOwner$layout() {
        return hwndMenuOwner$LAYOUT;
    }

    private static final long hwndMenuOwner$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndMenuOwner
     * }
     */
    public static final long hwndMenuOwner$offset() {
        return hwndMenuOwner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndMenuOwner
     * }
     */
    public static MemorySegment hwndMenuOwner(MemorySegment struct) {
        return struct.get(hwndMenuOwner$LAYOUT, hwndMenuOwner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndMenuOwner
     * }
     */
    public static void hwndMenuOwner(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndMenuOwner$LAYOUT, hwndMenuOwner$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndMoveSize$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndMoveSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndMoveSize
     * }
     */
    public static final AddressLayout hwndMoveSize$layout() {
        return hwndMoveSize$LAYOUT;
    }

    private static final long hwndMoveSize$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndMoveSize
     * }
     */
    public static final long hwndMoveSize$offset() {
        return hwndMoveSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndMoveSize
     * }
     */
    public static MemorySegment hwndMoveSize(MemorySegment struct) {
        return struct.get(hwndMoveSize$LAYOUT, hwndMoveSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndMoveSize
     * }
     */
    public static void hwndMoveSize(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndMoveSize$LAYOUT, hwndMoveSize$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndCaret$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndCaret"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndCaret
     * }
     */
    public static final AddressLayout hwndCaret$layout() {
        return hwndCaret$LAYOUT;
    }

    private static final long hwndCaret$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndCaret
     * }
     */
    public static final long hwndCaret$offset() {
        return hwndCaret$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndCaret
     * }
     */
    public static MemorySegment hwndCaret(MemorySegment struct) {
        return struct.get(hwndCaret$LAYOUT, hwndCaret$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndCaret
     * }
     */
    public static void hwndCaret(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndCaret$LAYOUT, hwndCaret$OFFSET, fieldValue);
    }

    private static final GroupLayout rcCaret$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rcCaret"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECT rcCaret
     * }
     */
    public static final GroupLayout rcCaret$layout() {
        return rcCaret$LAYOUT;
    }

    private static final long rcCaret$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECT rcCaret
     * }
     */
    public static final long rcCaret$offset() {
        return rcCaret$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECT rcCaret
     * }
     */
    public static MemorySegment rcCaret(MemorySegment struct) {
        return struct.asSlice(rcCaret$OFFSET, rcCaret$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECT rcCaret
     * }
     */
    public static void rcCaret(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rcCaret$OFFSET, rcCaret$LAYOUT.byteSize());
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

