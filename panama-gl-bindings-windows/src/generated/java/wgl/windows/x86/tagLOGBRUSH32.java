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
 * struct tagLOGBRUSH32 {
 *     UINT lbStyle;
 *     COLORREF lbColor;
 *     ULONG lbHatch;
 * }
 * }
 */
public class tagLOGBRUSH32 {

    tagLOGBRUSH32() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_INT.withName("lbStyle"),
        wgl_h.C_LONG.withName("lbColor"),
        wgl_h.C_LONG.withName("lbHatch")
    ).withName("tagLOGBRUSH32");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt lbStyle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lbStyle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT lbStyle
     * }
     */
    public static final OfInt lbStyle$layout() {
        return lbStyle$LAYOUT;
    }

    private static final long lbStyle$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT lbStyle
     * }
     */
    public static final long lbStyle$offset() {
        return lbStyle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT lbStyle
     * }
     */
    public static int lbStyle(MemorySegment struct) {
        return struct.get(lbStyle$LAYOUT, lbStyle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT lbStyle
     * }
     */
    public static void lbStyle(MemorySegment struct, int fieldValue) {
        struct.set(lbStyle$LAYOUT, lbStyle$OFFSET, fieldValue);
    }

    private static final OfInt lbColor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lbColor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * COLORREF lbColor
     * }
     */
    public static final OfInt lbColor$layout() {
        return lbColor$LAYOUT;
    }

    private static final long lbColor$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * COLORREF lbColor
     * }
     */
    public static final long lbColor$offset() {
        return lbColor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * COLORREF lbColor
     * }
     */
    public static int lbColor(MemorySegment struct) {
        return struct.get(lbColor$LAYOUT, lbColor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * COLORREF lbColor
     * }
     */
    public static void lbColor(MemorySegment struct, int fieldValue) {
        struct.set(lbColor$LAYOUT, lbColor$OFFSET, fieldValue);
    }

    private static final OfInt lbHatch$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lbHatch"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG lbHatch
     * }
     */
    public static final OfInt lbHatch$layout() {
        return lbHatch$LAYOUT;
    }

    private static final long lbHatch$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG lbHatch
     * }
     */
    public static final long lbHatch$offset() {
        return lbHatch$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG lbHatch
     * }
     */
    public static int lbHatch(MemorySegment struct) {
        return struct.get(lbHatch$LAYOUT, lbHatch$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG lbHatch
     * }
     */
    public static void lbHatch(MemorySegment struct, int fieldValue) {
        struct.set(lbHatch$LAYOUT, lbHatch$OFFSET, fieldValue);
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

