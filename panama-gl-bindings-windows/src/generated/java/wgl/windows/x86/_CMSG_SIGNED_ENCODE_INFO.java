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
 * struct _CMSG_SIGNED_ENCODE_INFO {
 *     DWORD cbSize;
 *     DWORD cSigners;
 *     PCMSG_SIGNER_ENCODE_INFO rgSigners;
 *     DWORD cCertEncoded;
 *     PCERT_BLOB rgCertEncoded;
 *     DWORD cCrlEncoded;
 *     PCRL_BLOB rgCrlEncoded;
 * }
 * }
 */
public class _CMSG_SIGNED_ENCODE_INFO {

    _CMSG_SIGNED_ENCODE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cbSize"),
        wgl_h.C_LONG.withName("cSigners"),
        wgl_h.C_POINTER.withName("rgSigners"),
        wgl_h.C_LONG.withName("cCertEncoded"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgCertEncoded"),
        wgl_h.C_LONG.withName("cCrlEncoded"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgCrlEncoded")
    ).withName("_CMSG_SIGNED_ENCODE_INFO");

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

    private static final OfInt cSigners$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cSigners"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cSigners
     * }
     */
    public static final OfInt cSigners$layout() {
        return cSigners$LAYOUT;
    }

    private static final long cSigners$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cSigners
     * }
     */
    public static final long cSigners$offset() {
        return cSigners$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cSigners
     * }
     */
    public static int cSigners(MemorySegment struct) {
        return struct.get(cSigners$LAYOUT, cSigners$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cSigners
     * }
     */
    public static void cSigners(MemorySegment struct, int fieldValue) {
        struct.set(cSigners$LAYOUT, cSigners$OFFSET, fieldValue);
    }

    private static final AddressLayout rgSigners$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgSigners"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCMSG_SIGNER_ENCODE_INFO rgSigners
     * }
     */
    public static final AddressLayout rgSigners$layout() {
        return rgSigners$LAYOUT;
    }

    private static final long rgSigners$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCMSG_SIGNER_ENCODE_INFO rgSigners
     * }
     */
    public static final long rgSigners$offset() {
        return rgSigners$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCMSG_SIGNER_ENCODE_INFO rgSigners
     * }
     */
    public static MemorySegment rgSigners(MemorySegment struct) {
        return struct.get(rgSigners$LAYOUT, rgSigners$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCMSG_SIGNER_ENCODE_INFO rgSigners
     * }
     */
    public static void rgSigners(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgSigners$LAYOUT, rgSigners$OFFSET, fieldValue);
    }

    private static final OfInt cCertEncoded$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cCertEncoded"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cCertEncoded
     * }
     */
    public static final OfInt cCertEncoded$layout() {
        return cCertEncoded$LAYOUT;
    }

    private static final long cCertEncoded$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cCertEncoded
     * }
     */
    public static final long cCertEncoded$offset() {
        return cCertEncoded$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cCertEncoded
     * }
     */
    public static int cCertEncoded(MemorySegment struct) {
        return struct.get(cCertEncoded$LAYOUT, cCertEncoded$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cCertEncoded
     * }
     */
    public static void cCertEncoded(MemorySegment struct, int fieldValue) {
        struct.set(cCertEncoded$LAYOUT, cCertEncoded$OFFSET, fieldValue);
    }

    private static final AddressLayout rgCertEncoded$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgCertEncoded"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_BLOB rgCertEncoded
     * }
     */
    public static final AddressLayout rgCertEncoded$layout() {
        return rgCertEncoded$LAYOUT;
    }

    private static final long rgCertEncoded$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_BLOB rgCertEncoded
     * }
     */
    public static final long rgCertEncoded$offset() {
        return rgCertEncoded$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_BLOB rgCertEncoded
     * }
     */
    public static MemorySegment rgCertEncoded(MemorySegment struct) {
        return struct.get(rgCertEncoded$LAYOUT, rgCertEncoded$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_BLOB rgCertEncoded
     * }
     */
    public static void rgCertEncoded(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgCertEncoded$LAYOUT, rgCertEncoded$OFFSET, fieldValue);
    }

    private static final OfInt cCrlEncoded$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cCrlEncoded"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cCrlEncoded
     * }
     */
    public static final OfInt cCrlEncoded$layout() {
        return cCrlEncoded$LAYOUT;
    }

    private static final long cCrlEncoded$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cCrlEncoded
     * }
     */
    public static final long cCrlEncoded$offset() {
        return cCrlEncoded$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cCrlEncoded
     * }
     */
    public static int cCrlEncoded(MemorySegment struct) {
        return struct.get(cCrlEncoded$LAYOUT, cCrlEncoded$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cCrlEncoded
     * }
     */
    public static void cCrlEncoded(MemorySegment struct, int fieldValue) {
        struct.set(cCrlEncoded$LAYOUT, cCrlEncoded$OFFSET, fieldValue);
    }

    private static final AddressLayout rgCrlEncoded$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgCrlEncoded"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCRL_BLOB rgCrlEncoded
     * }
     */
    public static final AddressLayout rgCrlEncoded$layout() {
        return rgCrlEncoded$LAYOUT;
    }

    private static final long rgCrlEncoded$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCRL_BLOB rgCrlEncoded
     * }
     */
    public static final long rgCrlEncoded$offset() {
        return rgCrlEncoded$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCRL_BLOB rgCrlEncoded
     * }
     */
    public static MemorySegment rgCrlEncoded(MemorySegment struct) {
        return struct.get(rgCrlEncoded$LAYOUT, rgCrlEncoded$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCRL_BLOB rgCrlEncoded
     * }
     */
    public static void rgCrlEncoded(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgCrlEncoded$LAYOUT, rgCrlEncoded$OFFSET, fieldValue);
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

