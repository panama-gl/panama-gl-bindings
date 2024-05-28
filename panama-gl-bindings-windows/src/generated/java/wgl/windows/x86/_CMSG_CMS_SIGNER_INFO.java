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
 * struct _CMSG_CMS_SIGNER_INFO {
 *     DWORD dwVersion;
 *     CERT_ID SignerId;
 *     CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm;
 *     CRYPT_ALGORITHM_IDENTIFIER HashEncryptionAlgorithm;
 *     CRYPT_DATA_BLOB EncryptedHash;
 *     CRYPT_ATTRIBUTES AuthAttrs;
 *     CRYPT_ATTRIBUTES UnauthAttrs;
 * }
 * }
 */
public class _CMSG_CMS_SIGNER_INFO {

    _CMSG_CMS_SIGNER_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwVersion"),
        MemoryLayout.paddingLayout(4),
        _CERT_ID.layout().withName("SignerId"),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("HashAlgorithm"),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("HashEncryptionAlgorithm"),
        _CRYPTOAPI_BLOB.layout().withName("EncryptedHash"),
        _CRYPT_ATTRIBUTES.layout().withName("AuthAttrs"),
        _CRYPT_ATTRIBUTES.layout().withName("UnauthAttrs")
    ).withName("_CMSG_CMS_SIGNER_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static final OfInt dwVersion$layout() {
        return dwVersion$LAYOUT;
    }

    private static final long dwVersion$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static final long dwVersion$offset() {
        return dwVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static int dwVersion(MemorySegment struct) {
        return struct.get(dwVersion$LAYOUT, dwVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static void dwVersion(MemorySegment struct, int fieldValue) {
        struct.set(dwVersion$LAYOUT, dwVersion$OFFSET, fieldValue);
    }

    private static final GroupLayout SignerId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SignerId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CERT_ID SignerId
     * }
     */
    public static final GroupLayout SignerId$layout() {
        return SignerId$LAYOUT;
    }

    private static final long SignerId$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CERT_ID SignerId
     * }
     */
    public static final long SignerId$offset() {
        return SignerId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CERT_ID SignerId
     * }
     */
    public static MemorySegment SignerId(MemorySegment struct) {
        return struct.asSlice(SignerId$OFFSET, SignerId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CERT_ID SignerId
     * }
     */
    public static void SignerId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SignerId$OFFSET, SignerId$LAYOUT.byteSize());
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

    private static final long HashAlgorithm$OFFSET = 48;

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

    private static final GroupLayout HashEncryptionAlgorithm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("HashEncryptionAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashEncryptionAlgorithm
     * }
     */
    public static final GroupLayout HashEncryptionAlgorithm$layout() {
        return HashEncryptionAlgorithm$LAYOUT;
    }

    private static final long HashEncryptionAlgorithm$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashEncryptionAlgorithm
     * }
     */
    public static final long HashEncryptionAlgorithm$offset() {
        return HashEncryptionAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashEncryptionAlgorithm
     * }
     */
    public static MemorySegment HashEncryptionAlgorithm(MemorySegment struct) {
        return struct.asSlice(HashEncryptionAlgorithm$OFFSET, HashEncryptionAlgorithm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashEncryptionAlgorithm
     * }
     */
    public static void HashEncryptionAlgorithm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, HashEncryptionAlgorithm$OFFSET, HashEncryptionAlgorithm$LAYOUT.byteSize());
    }

    private static final GroupLayout EncryptedHash$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("EncryptedHash"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB EncryptedHash
     * }
     */
    public static final GroupLayout EncryptedHash$layout() {
        return EncryptedHash$LAYOUT;
    }

    private static final long EncryptedHash$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB EncryptedHash
     * }
     */
    public static final long EncryptedHash$offset() {
        return EncryptedHash$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB EncryptedHash
     * }
     */
    public static MemorySegment EncryptedHash(MemorySegment struct) {
        return struct.asSlice(EncryptedHash$OFFSET, EncryptedHash$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB EncryptedHash
     * }
     */
    public static void EncryptedHash(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, EncryptedHash$OFFSET, EncryptedHash$LAYOUT.byteSize());
    }

    private static final GroupLayout AuthAttrs$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("AuthAttrs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ATTRIBUTES AuthAttrs
     * }
     */
    public static final GroupLayout AuthAttrs$layout() {
        return AuthAttrs$LAYOUT;
    }

    private static final long AuthAttrs$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ATTRIBUTES AuthAttrs
     * }
     */
    public static final long AuthAttrs$offset() {
        return AuthAttrs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ATTRIBUTES AuthAttrs
     * }
     */
    public static MemorySegment AuthAttrs(MemorySegment struct) {
        return struct.asSlice(AuthAttrs$OFFSET, AuthAttrs$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ATTRIBUTES AuthAttrs
     * }
     */
    public static void AuthAttrs(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, AuthAttrs$OFFSET, AuthAttrs$LAYOUT.byteSize());
    }

    private static final GroupLayout UnauthAttrs$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("UnauthAttrs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ATTRIBUTES UnauthAttrs
     * }
     */
    public static final GroupLayout UnauthAttrs$layout() {
        return UnauthAttrs$LAYOUT;
    }

    private static final long UnauthAttrs$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ATTRIBUTES UnauthAttrs
     * }
     */
    public static final long UnauthAttrs$offset() {
        return UnauthAttrs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ATTRIBUTES UnauthAttrs
     * }
     */
    public static MemorySegment UnauthAttrs(MemorySegment struct) {
        return struct.asSlice(UnauthAttrs$OFFSET, UnauthAttrs$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ATTRIBUTES UnauthAttrs
     * }
     */
    public static void UnauthAttrs(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, UnauthAttrs$OFFSET, UnauthAttrs$LAYOUT.byteSize());
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

