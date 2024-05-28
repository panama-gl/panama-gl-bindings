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
 * struct _CRYPT_VERIFY_CERT_SIGN_STRONG_PROPERTIES_INFO {
 *     CRYPT_DATA_BLOB CertSignHashCNGAlgPropData;
 *     CRYPT_DATA_BLOB CertIssuerPubKeyBitLengthPropData;
 * }
 * }
 */
public class _CRYPT_VERIFY_CERT_SIGN_STRONG_PROPERTIES_INFO {

    _CRYPT_VERIFY_CERT_SIGN_STRONG_PROPERTIES_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _CRYPTOAPI_BLOB.layout().withName("CertSignHashCNGAlgPropData"),
        _CRYPTOAPI_BLOB.layout().withName("CertIssuerPubKeyBitLengthPropData")
    ).withName("_CRYPT_VERIFY_CERT_SIGN_STRONG_PROPERTIES_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout CertSignHashCNGAlgPropData$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("CertSignHashCNGAlgPropData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB CertSignHashCNGAlgPropData
     * }
     */
    public static final GroupLayout CertSignHashCNGAlgPropData$layout() {
        return CertSignHashCNGAlgPropData$LAYOUT;
    }

    private static final long CertSignHashCNGAlgPropData$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB CertSignHashCNGAlgPropData
     * }
     */
    public static final long CertSignHashCNGAlgPropData$offset() {
        return CertSignHashCNGAlgPropData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB CertSignHashCNGAlgPropData
     * }
     */
    public static MemorySegment CertSignHashCNGAlgPropData(MemorySegment struct) {
        return struct.asSlice(CertSignHashCNGAlgPropData$OFFSET, CertSignHashCNGAlgPropData$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB CertSignHashCNGAlgPropData
     * }
     */
    public static void CertSignHashCNGAlgPropData(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, CertSignHashCNGAlgPropData$OFFSET, CertSignHashCNGAlgPropData$LAYOUT.byteSize());
    }

    private static final GroupLayout CertIssuerPubKeyBitLengthPropData$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("CertIssuerPubKeyBitLengthPropData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB CertIssuerPubKeyBitLengthPropData
     * }
     */
    public static final GroupLayout CertIssuerPubKeyBitLengthPropData$layout() {
        return CertIssuerPubKeyBitLengthPropData$LAYOUT;
    }

    private static final long CertIssuerPubKeyBitLengthPropData$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB CertIssuerPubKeyBitLengthPropData
     * }
     */
    public static final long CertIssuerPubKeyBitLengthPropData$offset() {
        return CertIssuerPubKeyBitLengthPropData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB CertIssuerPubKeyBitLengthPropData
     * }
     */
    public static MemorySegment CertIssuerPubKeyBitLengthPropData(MemorySegment struct) {
        return struct.asSlice(CertIssuerPubKeyBitLengthPropData$OFFSET, CertIssuerPubKeyBitLengthPropData$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB CertIssuerPubKeyBitLengthPropData
     * }
     */
    public static void CertIssuerPubKeyBitLengthPropData(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, CertIssuerPubKeyBitLengthPropData$OFFSET, CertIssuerPubKeyBitLengthPropData$LAYOUT.byteSize());
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

