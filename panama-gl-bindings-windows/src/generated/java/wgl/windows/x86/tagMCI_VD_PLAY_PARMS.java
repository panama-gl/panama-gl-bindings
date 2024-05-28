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
 * struct tagMCI_VD_PLAY_PARMS {
 *     DWORD_PTR dwCallback;
 *     DWORD dwFrom;
 *     DWORD dwTo;
 *     DWORD dwSpeed;
 * }
 * }
 */
public class tagMCI_VD_PLAY_PARMS {

    tagMCI_VD_PLAY_PARMS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.align(wgl_h.C_LONG_LONG, 1).withName("dwCallback"),
        wgl_h.align(wgl_h.C_LONG, 1).withName("dwFrom"),
        wgl_h.align(wgl_h.C_LONG, 1).withName("dwTo"),
        wgl_h.align(wgl_h.C_LONG, 1).withName("dwSpeed")
    ).withName("tagMCI_VD_PLAY_PARMS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong dwCallback$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dwCallback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static final OfLong dwCallback$layout() {
        return dwCallback$LAYOUT;
    }

    private static final long dwCallback$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static final long dwCallback$offset() {
        return dwCallback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static long dwCallback(MemorySegment struct) {
        return struct.get(dwCallback$LAYOUT, dwCallback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static void dwCallback(MemorySegment struct, long fieldValue) {
        struct.set(dwCallback$LAYOUT, dwCallback$OFFSET, fieldValue);
    }

    private static final OfInt dwFrom$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFrom"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFrom
     * }
     */
    public static final OfInt dwFrom$layout() {
        return dwFrom$LAYOUT;
    }

    private static final long dwFrom$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFrom
     * }
     */
    public static final long dwFrom$offset() {
        return dwFrom$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFrom
     * }
     */
    public static int dwFrom(MemorySegment struct) {
        return struct.get(dwFrom$LAYOUT, dwFrom$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFrom
     * }
     */
    public static void dwFrom(MemorySegment struct, int fieldValue) {
        struct.set(dwFrom$LAYOUT, dwFrom$OFFSET, fieldValue);
    }

    private static final OfInt dwTo$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwTo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwTo
     * }
     */
    public static final OfInt dwTo$layout() {
        return dwTo$LAYOUT;
    }

    private static final long dwTo$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwTo
     * }
     */
    public static final long dwTo$offset() {
        return dwTo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwTo
     * }
     */
    public static int dwTo(MemorySegment struct) {
        return struct.get(dwTo$LAYOUT, dwTo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwTo
     * }
     */
    public static void dwTo(MemorySegment struct, int fieldValue) {
        struct.set(dwTo$LAYOUT, dwTo$OFFSET, fieldValue);
    }

    private static final OfInt dwSpeed$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSpeed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSpeed
     * }
     */
    public static final OfInt dwSpeed$layout() {
        return dwSpeed$LAYOUT;
    }

    private static final long dwSpeed$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSpeed
     * }
     */
    public static final long dwSpeed$offset() {
        return dwSpeed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSpeed
     * }
     */
    public static int dwSpeed(MemorySegment struct) {
        return struct.get(dwSpeed$LAYOUT, dwSpeed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSpeed
     * }
     */
    public static void dwSpeed(MemorySegment struct, int fieldValue) {
        struct.set(dwSpeed$LAYOUT, dwSpeed$OFFSET, fieldValue);
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

