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
 * struct tagCACLIPDATA {
 *     ULONG cElems;
 *     CLIPDATA *pElems;
 * }
 * }
 */
public class tagCACLIPDATA {

    tagCACLIPDATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cElems"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pElems")
    ).withName("tagCACLIPDATA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cElems$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cElems"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cElems
     * }
     */
    public static final OfInt cElems$layout() {
        return cElems$LAYOUT;
    }

    private static final long cElems$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cElems
     * }
     */
    public static final long cElems$offset() {
        return cElems$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cElems
     * }
     */
    public static int cElems(MemorySegment struct) {
        return struct.get(cElems$LAYOUT, cElems$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cElems
     * }
     */
    public static void cElems(MemorySegment struct, int fieldValue) {
        struct.set(cElems$LAYOUT, cElems$OFFSET, fieldValue);
    }

    private static final AddressLayout pElems$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pElems"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CLIPDATA *pElems
     * }
     */
    public static final AddressLayout pElems$layout() {
        return pElems$LAYOUT;
    }

    private static final long pElems$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CLIPDATA *pElems
     * }
     */
    public static final long pElems$offset() {
        return pElems$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CLIPDATA *pElems
     * }
     */
    public static MemorySegment pElems(MemorySegment struct) {
        return struct.get(pElems$LAYOUT, pElems$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CLIPDATA *pElems
     * }
     */
    public static void pElems(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pElems$LAYOUT, pElems$OFFSET, fieldValue);
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

