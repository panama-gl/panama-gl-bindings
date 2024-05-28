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
 * struct _CERT_ALT_NAME_INFO {
 *     DWORD cAltEntry;
 *     PCERT_ALT_NAME_ENTRY rgAltEntry;
 * }
 * }
 */
public class _CERT_ALT_NAME_INFO {

    _CERT_ALT_NAME_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cAltEntry"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgAltEntry")
    ).withName("_CERT_ALT_NAME_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cAltEntry$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cAltEntry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cAltEntry
     * }
     */
    public static final OfInt cAltEntry$layout() {
        return cAltEntry$LAYOUT;
    }

    private static final long cAltEntry$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cAltEntry
     * }
     */
    public static final long cAltEntry$offset() {
        return cAltEntry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cAltEntry
     * }
     */
    public static int cAltEntry(MemorySegment struct) {
        return struct.get(cAltEntry$LAYOUT, cAltEntry$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cAltEntry
     * }
     */
    public static void cAltEntry(MemorySegment struct, int fieldValue) {
        struct.set(cAltEntry$LAYOUT, cAltEntry$OFFSET, fieldValue);
    }

    private static final AddressLayout rgAltEntry$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgAltEntry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_ALT_NAME_ENTRY rgAltEntry
     * }
     */
    public static final AddressLayout rgAltEntry$layout() {
        return rgAltEntry$LAYOUT;
    }

    private static final long rgAltEntry$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_ALT_NAME_ENTRY rgAltEntry
     * }
     */
    public static final long rgAltEntry$offset() {
        return rgAltEntry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_ALT_NAME_ENTRY rgAltEntry
     * }
     */
    public static MemorySegment rgAltEntry(MemorySegment struct) {
        return struct.get(rgAltEntry$LAYOUT, rgAltEntry$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_ALT_NAME_ENTRY rgAltEntry
     * }
     */
    public static void rgAltEntry(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgAltEntry$LAYOUT, rgAltEntry$OFFSET, fieldValue);
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

