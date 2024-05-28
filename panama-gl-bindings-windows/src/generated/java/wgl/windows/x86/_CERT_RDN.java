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
 * struct _CERT_RDN {
 *     DWORD cRDNAttr;
 *     PCERT_RDN_ATTR rgRDNAttr;
 * }
 * }
 */
public class _CERT_RDN {

    _CERT_RDN() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cRDNAttr"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgRDNAttr")
    ).withName("_CERT_RDN");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cRDNAttr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cRDNAttr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cRDNAttr
     * }
     */
    public static final OfInt cRDNAttr$layout() {
        return cRDNAttr$LAYOUT;
    }

    private static final long cRDNAttr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cRDNAttr
     * }
     */
    public static final long cRDNAttr$offset() {
        return cRDNAttr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cRDNAttr
     * }
     */
    public static int cRDNAttr(MemorySegment struct) {
        return struct.get(cRDNAttr$LAYOUT, cRDNAttr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cRDNAttr
     * }
     */
    public static void cRDNAttr(MemorySegment struct, int fieldValue) {
        struct.set(cRDNAttr$LAYOUT, cRDNAttr$OFFSET, fieldValue);
    }

    private static final AddressLayout rgRDNAttr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgRDNAttr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_RDN_ATTR rgRDNAttr
     * }
     */
    public static final AddressLayout rgRDNAttr$layout() {
        return rgRDNAttr$LAYOUT;
    }

    private static final long rgRDNAttr$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_RDN_ATTR rgRDNAttr
     * }
     */
    public static final long rgRDNAttr$offset() {
        return rgRDNAttr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_RDN_ATTR rgRDNAttr
     * }
     */
    public static MemorySegment rgRDNAttr(MemorySegment struct) {
        return struct.get(rgRDNAttr$LAYOUT, rgRDNAttr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_RDN_ATTR rgRDNAttr
     * }
     */
    public static void rgRDNAttr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgRDNAttr$LAYOUT, rgRDNAttr$OFFSET, fieldValue);
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

