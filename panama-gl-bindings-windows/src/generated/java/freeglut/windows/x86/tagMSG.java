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
 * struct tagMSG {
 *     HWND hwnd;
 *     UINT message;
 *     WPARAM wParam;
 *     LPARAM lParam;
 *     DWORD time;
 *     POINT pt;
 * }
 * }
 */
public class tagMSG {

    tagMSG() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_POINTER.withName("hwnd"),
        freeglut_h.C_INT.withName("message"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_LONG_LONG.withName("wParam"),
        freeglut_h.C_LONG_LONG.withName("lParam"),
        freeglut_h.C_LONG.withName("time"),
        tagPOINT.layout().withName("pt"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagMSG");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout hwnd$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwnd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static final AddressLayout hwnd$layout() {
        return hwnd$LAYOUT;
    }

    private static final long hwnd$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static final long hwnd$offset() {
        return hwnd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static MemorySegment hwnd(MemorySegment struct) {
        return struct.get(hwnd$LAYOUT, hwnd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static void hwnd(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwnd$LAYOUT, hwnd$OFFSET, fieldValue);
    }

    private static final OfInt message$LAYOUT = (OfInt)$LAYOUT.select(groupElement("message"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT message
     * }
     */
    public static final OfInt message$layout() {
        return message$LAYOUT;
    }

    private static final long message$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT message
     * }
     */
    public static final long message$offset() {
        return message$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT message
     * }
     */
    public static int message(MemorySegment struct) {
        return struct.get(message$LAYOUT, message$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT message
     * }
     */
    public static void message(MemorySegment struct, int fieldValue) {
        struct.set(message$LAYOUT, message$OFFSET, fieldValue);
    }

    private static final OfLong wParam$LAYOUT = (OfLong)$LAYOUT.select(groupElement("wParam"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WPARAM wParam
     * }
     */
    public static final OfLong wParam$layout() {
        return wParam$LAYOUT;
    }

    private static final long wParam$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WPARAM wParam
     * }
     */
    public static final long wParam$offset() {
        return wParam$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WPARAM wParam
     * }
     */
    public static long wParam(MemorySegment struct) {
        return struct.get(wParam$LAYOUT, wParam$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WPARAM wParam
     * }
     */
    public static void wParam(MemorySegment struct, long fieldValue) {
        struct.set(wParam$LAYOUT, wParam$OFFSET, fieldValue);
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

    private static final long lParam$OFFSET = 24;

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

    private static final OfInt time$LAYOUT = (OfInt)$LAYOUT.select(groupElement("time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD time
     * }
     */
    public static final OfInt time$layout() {
        return time$LAYOUT;
    }

    private static final long time$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD time
     * }
     */
    public static final long time$offset() {
        return time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD time
     * }
     */
    public static int time(MemorySegment struct) {
        return struct.get(time$LAYOUT, time$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD time
     * }
     */
    public static void time(MemorySegment struct, int fieldValue) {
        struct.set(time$LAYOUT, time$OFFSET, fieldValue);
    }

    private static final GroupLayout pt$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINT pt
     * }
     */
    public static final GroupLayout pt$layout() {
        return pt$LAYOUT;
    }

    private static final long pt$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINT pt
     * }
     */
    public static final long pt$offset() {
        return pt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINT pt
     * }
     */
    public static MemorySegment pt(MemorySegment struct) {
        return struct.asSlice(pt$OFFSET, pt$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINT pt
     * }
     */
    public static void pt(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pt$OFFSET, pt$LAYOUT.byteSize());
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

