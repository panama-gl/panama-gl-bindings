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
 * struct _CERT_QC_STATEMENTS_EXT_INFO {
 *     DWORD cStatement;
 *     PCERT_QC_STATEMENT rgStatement;
 * }
 * }
 */
public class _CERT_QC_STATEMENTS_EXT_INFO {

    _CERT_QC_STATEMENTS_EXT_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cStatement"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgStatement")
    ).withName("_CERT_QC_STATEMENTS_EXT_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cStatement$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cStatement"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cStatement
     * }
     */
    public static final OfInt cStatement$layout() {
        return cStatement$LAYOUT;
    }

    private static final long cStatement$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cStatement
     * }
     */
    public static final long cStatement$offset() {
        return cStatement$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cStatement
     * }
     */
    public static int cStatement(MemorySegment struct) {
        return struct.get(cStatement$LAYOUT, cStatement$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cStatement
     * }
     */
    public static void cStatement(MemorySegment struct, int fieldValue) {
        struct.set(cStatement$LAYOUT, cStatement$OFFSET, fieldValue);
    }

    private static final AddressLayout rgStatement$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgStatement"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_QC_STATEMENT rgStatement
     * }
     */
    public static final AddressLayout rgStatement$layout() {
        return rgStatement$LAYOUT;
    }

    private static final long rgStatement$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_QC_STATEMENT rgStatement
     * }
     */
    public static final long rgStatement$offset() {
        return rgStatement$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_QC_STATEMENT rgStatement
     * }
     */
    public static MemorySegment rgStatement(MemorySegment struct) {
        return struct.get(rgStatement$LAYOUT, rgStatement$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_QC_STATEMENT rgStatement
     * }
     */
    public static void rgStatement(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgStatement$LAYOUT, rgStatement$OFFSET, fieldValue);
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

