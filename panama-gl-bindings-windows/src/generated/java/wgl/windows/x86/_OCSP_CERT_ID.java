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
 * struct _OCSP_CERT_ID {
 *     CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm;
 *     CRYPT_HASH_BLOB IssuerNameHash;
 *     CRYPT_HASH_BLOB IssuerKeyHash;
 *     CRYPT_INTEGER_BLOB SerialNumber;
 * }
 * }
 */
public class _OCSP_CERT_ID {

    _OCSP_CERT_ID() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("HashAlgorithm"),
        _CRYPTOAPI_BLOB.layout().withName("IssuerNameHash"),
        _CRYPTOAPI_BLOB.layout().withName("IssuerKeyHash"),
        _CRYPTOAPI_BLOB.layout().withName("SerialNumber")
    ).withName("_OCSP_CERT_ID");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout HashAlgorithm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("HashAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm
     * }
     */
    public static final GroupLayout HashAlgorithm$layout() {
        return HashAlgorithm$LAYOUT;
    }

    private static final long HashAlgorithm$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm
     * }
     */
    public static final long HashAlgorithm$offset() {
        return HashAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm
     * }
     */
    public static MemorySegment HashAlgorithm(MemorySegment struct) {
        return struct.asSlice(HashAlgorithm$OFFSET, HashAlgorithm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm
     * }
     */
    public static void HashAlgorithm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, HashAlgorithm$OFFSET, HashAlgorithm$LAYOUT.byteSize());
    }

    private static final GroupLayout IssuerNameHash$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("IssuerNameHash"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_HASH_BLOB IssuerNameHash
     * }
     */
    public static final GroupLayout IssuerNameHash$layout() {
        return IssuerNameHash$LAYOUT;
    }

    private static final long IssuerNameHash$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_HASH_BLOB IssuerNameHash
     * }
     */
    public static final long IssuerNameHash$offset() {
        return IssuerNameHash$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_HASH_BLOB IssuerNameHash
     * }
     */
    public static MemorySegment IssuerNameHash(MemorySegment struct) {
        return struct.asSlice(IssuerNameHash$OFFSET, IssuerNameHash$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_HASH_BLOB IssuerNameHash
     * }
     */
    public static void IssuerNameHash(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, IssuerNameHash$OFFSET, IssuerNameHash$LAYOUT.byteSize());
    }

    private static final GroupLayout IssuerKeyHash$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("IssuerKeyHash"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_HASH_BLOB IssuerKeyHash
     * }
     */
    public static final GroupLayout IssuerKeyHash$layout() {
        return IssuerKeyHash$LAYOUT;
    }

    private static final long IssuerKeyHash$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_HASH_BLOB IssuerKeyHash
     * }
     */
    public static final long IssuerKeyHash$offset() {
        return IssuerKeyHash$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_HASH_BLOB IssuerKeyHash
     * }
     */
    public static MemorySegment IssuerKeyHash(MemorySegment struct) {
        return struct.asSlice(IssuerKeyHash$OFFSET, IssuerKeyHash$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_HASH_BLOB IssuerKeyHash
     * }
     */
    public static void IssuerKeyHash(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, IssuerKeyHash$OFFSET, IssuerKeyHash$LAYOUT.byteSize());
    }

    private static final GroupLayout SerialNumber$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SerialNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB SerialNumber
     * }
     */
    public static final GroupLayout SerialNumber$layout() {
        return SerialNumber$LAYOUT;
    }

    private static final long SerialNumber$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB SerialNumber
     * }
     */
    public static final long SerialNumber$offset() {
        return SerialNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB SerialNumber
     * }
     */
    public static MemorySegment SerialNumber(MemorySegment struct) {
        return struct.asSlice(SerialNumber$OFFSET, SerialNumber$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB SerialNumber
     * }
     */
    public static void SerialNumber(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SerialNumber$OFFSET, SerialNumber$LAYOUT.byteSize());
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

