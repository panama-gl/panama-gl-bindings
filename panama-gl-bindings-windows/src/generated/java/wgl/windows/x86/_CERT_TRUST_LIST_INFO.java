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
 * struct _CERT_TRUST_LIST_INFO {
 *     DWORD cbSize;
 *     PCTL_ENTRY pCtlEntry;
 *     PCCTL_CONTEXT pCtlContext;
 * }
 * }
 */
public class _CERT_TRUST_LIST_INFO {

    _CERT_TRUST_LIST_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pCtlEntry"),
        wgl_h.C_POINTER.withName("pCtlContext")
    ).withName("_CERT_TRUST_LIST_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final AddressLayout pCtlEntry$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pCtlEntry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCTL_ENTRY pCtlEntry
     * }
     */
    public static final AddressLayout pCtlEntry$layout() {
        return pCtlEntry$LAYOUT;
    }

    private static final long pCtlEntry$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCTL_ENTRY pCtlEntry
     * }
     */
    public static final long pCtlEntry$offset() {
        return pCtlEntry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCTL_ENTRY pCtlEntry
     * }
     */
    public static MemorySegment pCtlEntry(MemorySegment struct) {
        return struct.get(pCtlEntry$LAYOUT, pCtlEntry$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCTL_ENTRY pCtlEntry
     * }
     */
    public static void pCtlEntry(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pCtlEntry$LAYOUT, pCtlEntry$OFFSET, fieldValue);
    }

    private static final AddressLayout pCtlContext$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pCtlContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCCTL_CONTEXT pCtlContext
     * }
     */
    public static final AddressLayout pCtlContext$layout() {
        return pCtlContext$LAYOUT;
    }

    private static final long pCtlContext$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCCTL_CONTEXT pCtlContext
     * }
     */
    public static final long pCtlContext$offset() {
        return pCtlContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCCTL_CONTEXT pCtlContext
     * }
     */
    public static MemorySegment pCtlContext(MemorySegment struct) {
        return struct.get(pCtlContext$LAYOUT, pCtlContext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCCTL_CONTEXT pCtlContext
     * }
     */
    public static void pCtlContext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pCtlContext$LAYOUT, pCtlContext$OFFSET, fieldValue);
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

