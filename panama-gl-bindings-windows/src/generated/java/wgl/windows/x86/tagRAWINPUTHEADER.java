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
 * struct tagRAWINPUTHEADER {
 *     DWORD dwType;
 *     DWORD dwSize;
 *     HANDLE hDevice;
 *     WPARAM wParam;
 * }
 * }
 */
public class tagRAWINPUTHEADER {

    tagRAWINPUTHEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwType"),
        wgl_h.C_LONG.withName("dwSize"),
        wgl_h.C_POINTER.withName("hDevice"),
        wgl_h.C_LONG_LONG.withName("wParam")
    ).withName("tagRAWINPUTHEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwType
     * }
     */
    public static final OfInt dwType$layout() {
        return dwType$LAYOUT;
    }

    private static final long dwType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwType
     * }
     */
    public static final long dwType$offset() {
        return dwType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwType
     * }
     */
    public static int dwType(MemorySegment struct) {
        return struct.get(dwType$LAYOUT, dwType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwType
     * }
     */
    public static void dwType(MemorySegment struct, int fieldValue) {
        struct.set(dwType$LAYOUT, dwType$OFFSET, fieldValue);
    }

    private static final OfInt dwSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static final OfInt dwSize$layout() {
        return dwSize$LAYOUT;
    }

    private static final long dwSize$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static final long dwSize$offset() {
        return dwSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static int dwSize(MemorySegment struct) {
        return struct.get(dwSize$LAYOUT, dwSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static void dwSize(MemorySegment struct, int fieldValue) {
        struct.set(dwSize$LAYOUT, dwSize$OFFSET, fieldValue);
    }

    private static final AddressLayout hDevice$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hDevice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hDevice
     * }
     */
    public static final AddressLayout hDevice$layout() {
        return hDevice$LAYOUT;
    }

    private static final long hDevice$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hDevice
     * }
     */
    public static final long hDevice$offset() {
        return hDevice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hDevice
     * }
     */
    public static MemorySegment hDevice(MemorySegment struct) {
        return struct.get(hDevice$LAYOUT, hDevice$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hDevice
     * }
     */
    public static void hDevice(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hDevice$LAYOUT, hDevice$OFFSET, fieldValue);
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

