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
 * struct tagMCI_ANIM_UPDATE_PARMS {
 *     DWORD_PTR dwCallback;
 *     RECT rc;
 *     HDC hDC;
 * }
 * }
 */
public class tagMCI_ANIM_UPDATE_PARMS {

    tagMCI_ANIM_UPDATE_PARMS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.align(wgl_h.C_LONG_LONG, 1).withName("dwCallback"),
        wgl_h.align(tagRECT.layout(), 1).withName("rc"),
        wgl_h.align(wgl_h.C_POINTER, 1).withName("hDC")
    ).withName("tagMCI_ANIM_UPDATE_PARMS");

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

    private static final long rc$OFFSET = 8;

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

    private static final AddressLayout hDC$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hDC"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HDC hDC
     * }
     */
    public static final AddressLayout hDC$layout() {
        return hDC$LAYOUT;
    }

    private static final long hDC$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HDC hDC
     * }
     */
    public static final long hDC$offset() {
        return hDC$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HDC hDC
     * }
     */
    public static MemorySegment hDC(MemorySegment struct) {
        return struct.get(hDC$LAYOUT, hDC$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HDC hDC
     * }
     */
    public static void hDC(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hDC$LAYOUT, hDC$OFFSET, fieldValue);
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

