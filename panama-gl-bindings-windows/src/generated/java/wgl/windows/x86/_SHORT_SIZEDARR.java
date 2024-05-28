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
 * struct _SHORT_SIZEDARR {
 *     ULONG clSize;
 *     unsigned short *pData;
 * }
 * }
 */
public class _SHORT_SIZEDARR {

    _SHORT_SIZEDARR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("clSize"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pData")
    ).withName("_SHORT_SIZEDARR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt clSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("clSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG clSize
     * }
     */
    public static final OfInt clSize$layout() {
        return clSize$LAYOUT;
    }

    private static final long clSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG clSize
     * }
     */
    public static final long clSize$offset() {
        return clSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG clSize
     * }
     */
    public static int clSize(MemorySegment struct) {
        return struct.get(clSize$LAYOUT, clSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG clSize
     * }
     */
    public static void clSize(MemorySegment struct, int fieldValue) {
        struct.set(clSize$LAYOUT, clSize$OFFSET, fieldValue);
    }

    private static final AddressLayout pData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short *pData
     * }
     */
    public static final AddressLayout pData$layout() {
        return pData$LAYOUT;
    }

    private static final long pData$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short *pData
     * }
     */
    public static final long pData$offset() {
        return pData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short *pData
     * }
     */
    public static MemorySegment pData(MemorySegment struct) {
        return struct.get(pData$LAYOUT, pData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short *pData
     * }
     */
    public static void pData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pData$LAYOUT, pData$OFFSET, fieldValue);
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

