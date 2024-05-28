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
 * struct tagMOUSEINPUT {
 *     LONG dx;
 *     LONG dy;
 *     DWORD mouseData;
 *     DWORD dwFlags;
 *     DWORD time;
 *     ULONG_PTR dwExtraInfo;
 * }
 * }
 */
public class tagMOUSEINPUT {

    tagMOUSEINPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dx"),
        wgl_h.C_LONG.withName("dy"),
        wgl_h.C_LONG.withName("mouseData"),
        wgl_h.C_LONG.withName("dwFlags"),
        wgl_h.C_LONG.withName("time"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_LONG_LONG.withName("dwExtraInfo")
    ).withName("tagMOUSEINPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dx$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG dx
     * }
     */
    public static final OfInt dx$layout() {
        return dx$LAYOUT;
    }

    private static final long dx$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG dx
     * }
     */
    public static final long dx$offset() {
        return dx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG dx
     * }
     */
    public static int dx(MemorySegment struct) {
        return struct.get(dx$LAYOUT, dx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG dx
     * }
     */
    public static void dx(MemorySegment struct, int fieldValue) {
        struct.set(dx$LAYOUT, dx$OFFSET, fieldValue);
    }

    private static final OfInt dy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG dy
     * }
     */
    public static final OfInt dy$layout() {
        return dy$LAYOUT;
    }

    private static final long dy$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG dy
     * }
     */
    public static final long dy$offset() {
        return dy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG dy
     * }
     */
    public static int dy(MemorySegment struct) {
        return struct.get(dy$LAYOUT, dy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG dy
     * }
     */
    public static void dy(MemorySegment struct, int fieldValue) {
        struct.set(dy$LAYOUT, dy$OFFSET, fieldValue);
    }

    private static final OfInt mouseData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("mouseData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD mouseData
     * }
     */
    public static final OfInt mouseData$layout() {
        return mouseData$LAYOUT;
    }

    private static final long mouseData$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD mouseData
     * }
     */
    public static final long mouseData$offset() {
        return mouseData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD mouseData
     * }
     */
    public static int mouseData(MemorySegment struct) {
        return struct.get(mouseData$LAYOUT, mouseData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD mouseData
     * }
     */
    public static void mouseData(MemorySegment struct, int fieldValue) {
        struct.set(mouseData$LAYOUT, mouseData$OFFSET, fieldValue);
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

    private static final long dwFlags$OFFSET = 12;

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

    private static final long time$OFFSET = 16;

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

    private static final OfLong dwExtraInfo$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dwExtraInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR dwExtraInfo
     * }
     */
    public static final OfLong dwExtraInfo$layout() {
        return dwExtraInfo$LAYOUT;
    }

    private static final long dwExtraInfo$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR dwExtraInfo
     * }
     */
    public static final long dwExtraInfo$offset() {
        return dwExtraInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR dwExtraInfo
     * }
     */
    public static long dwExtraInfo(MemorySegment struct) {
        return struct.get(dwExtraInfo$LAYOUT, dwExtraInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR dwExtraInfo
     * }
     */
    public static void dwExtraInfo(MemorySegment struct, long fieldValue) {
        struct.set(dwExtraInfo$LAYOUT, dwExtraInfo$OFFSET, fieldValue);
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

