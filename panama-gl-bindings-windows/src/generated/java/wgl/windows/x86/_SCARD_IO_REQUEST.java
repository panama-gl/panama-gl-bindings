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
 * struct _SCARD_IO_REQUEST {
 *     DWORD dwProtocol;
 *     DWORD cbPciLength;
 * }
 * }
 */
public class _SCARD_IO_REQUEST {

    _SCARD_IO_REQUEST() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwProtocol"),
        wgl_h.C_LONG.withName("cbPciLength")
    ).withName("_SCARD_IO_REQUEST");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwProtocol$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwProtocol"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwProtocol
     * }
     */
    public static final OfInt dwProtocol$layout() {
        return dwProtocol$LAYOUT;
    }

    private static final long dwProtocol$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwProtocol
     * }
     */
    public static final long dwProtocol$offset() {
        return dwProtocol$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwProtocol
     * }
     */
    public static int dwProtocol(MemorySegment struct) {
        return struct.get(dwProtocol$LAYOUT, dwProtocol$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwProtocol
     * }
     */
    public static void dwProtocol(MemorySegment struct, int fieldValue) {
        struct.set(dwProtocol$LAYOUT, dwProtocol$OFFSET, fieldValue);
    }

    private static final OfInt cbPciLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbPciLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbPciLength
     * }
     */
    public static final OfInt cbPciLength$layout() {
        return cbPciLength$LAYOUT;
    }

    private static final long cbPciLength$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbPciLength
     * }
     */
    public static final long cbPciLength$offset() {
        return cbPciLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbPciLength
     * }
     */
    public static int cbPciLength(MemorySegment struct) {
        return struct.get(cbPciLength$LAYOUT, cbPciLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbPciLength
     * }
     */
    public static void cbPciLength(MemorySegment struct, int fieldValue) {
        struct.set(cbPciLength$LAYOUT, cbPciLength$OFFSET, fieldValue);
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

