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
 * struct _CERT_SERVER_OCSP_RESPONSE_CONTEXT {
 *     DWORD cbSize;
 *     BYTE *pbEncodedOcspResponse;
 *     DWORD cbEncodedOcspResponse;
 * }
 * }
 */
public class _CERT_SERVER_OCSP_RESPONSE_CONTEXT {

    _CERT_SERVER_OCSP_RESPONSE_CONTEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pbEncodedOcspResponse"),
        wgl_h.C_LONG.withName("cbEncodedOcspResponse"),
        MemoryLayout.paddingLayout(4)
    ).withName("_CERT_SERVER_OCSP_RESPONSE_CONTEXT");

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

    private static final AddressLayout pbEncodedOcspResponse$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pbEncodedOcspResponse"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE *pbEncodedOcspResponse
     * }
     */
    public static final AddressLayout pbEncodedOcspResponse$layout() {
        return pbEncodedOcspResponse$LAYOUT;
    }

    private static final long pbEncodedOcspResponse$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE *pbEncodedOcspResponse
     * }
     */
    public static final long pbEncodedOcspResponse$offset() {
        return pbEncodedOcspResponse$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE *pbEncodedOcspResponse
     * }
     */
    public static MemorySegment pbEncodedOcspResponse(MemorySegment struct) {
        return struct.get(pbEncodedOcspResponse$LAYOUT, pbEncodedOcspResponse$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE *pbEncodedOcspResponse
     * }
     */
    public static void pbEncodedOcspResponse(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pbEncodedOcspResponse$LAYOUT, pbEncodedOcspResponse$OFFSET, fieldValue);
    }

    private static final OfInt cbEncodedOcspResponse$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbEncodedOcspResponse"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbEncodedOcspResponse
     * }
     */
    public static final OfInt cbEncodedOcspResponse$layout() {
        return cbEncodedOcspResponse$LAYOUT;
    }

    private static final long cbEncodedOcspResponse$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbEncodedOcspResponse
     * }
     */
    public static final long cbEncodedOcspResponse$offset() {
        return cbEncodedOcspResponse$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbEncodedOcspResponse
     * }
     */
    public static int cbEncodedOcspResponse(MemorySegment struct) {
        return struct.get(cbEncodedOcspResponse$LAYOUT, cbEncodedOcspResponse$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbEncodedOcspResponse
     * }
     */
    public static void cbEncodedOcspResponse(MemorySegment struct, int fieldValue) {
        struct.set(cbEncodedOcspResponse$LAYOUT, cbEncodedOcspResponse$OFFSET, fieldValue);
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

