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
 * struct _CRYPT_ATTRIBUTES {
 *     DWORD cAttr;
 *     PCRYPT_ATTRIBUTE rgAttr;
 * }
 * }
 */
public class _CRYPT_ATTRIBUTES {

    _CRYPT_ATTRIBUTES() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cAttr"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgAttr")
    ).withName("_CRYPT_ATTRIBUTES");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cAttr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cAttr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cAttr
     * }
     */
    public static final OfInt cAttr$layout() {
        return cAttr$LAYOUT;
    }

    private static final long cAttr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cAttr
     * }
     */
    public static final long cAttr$offset() {
        return cAttr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cAttr
     * }
     */
    public static int cAttr(MemorySegment struct) {
        return struct.get(cAttr$LAYOUT, cAttr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cAttr
     * }
     */
    public static void cAttr(MemorySegment struct, int fieldValue) {
        struct.set(cAttr$LAYOUT, cAttr$OFFSET, fieldValue);
    }

    private static final AddressLayout rgAttr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgAttr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgAttr
     * }
     */
    public static final AddressLayout rgAttr$layout() {
        return rgAttr$LAYOUT;
    }

    private static final long rgAttr$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgAttr
     * }
     */
    public static final long rgAttr$offset() {
        return rgAttr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgAttr
     * }
     */
    public static MemorySegment rgAttr(MemorySegment struct) {
        return struct.get(rgAttr$LAYOUT, rgAttr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgAttr
     * }
     */
    public static void rgAttr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgAttr$LAYOUT, rgAttr$OFFSET, fieldValue);
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

