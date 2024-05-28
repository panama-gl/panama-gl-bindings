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
 * struct _CERT_KEY_USAGE_RESTRICTION_INFO {
 *     DWORD cCertPolicyId;
 *     PCERT_POLICY_ID rgCertPolicyId;
 *     CRYPT_BIT_BLOB RestrictedKeyUsage;
 * }
 * }
 */
public class _CERT_KEY_USAGE_RESTRICTION_INFO {

    _CERT_KEY_USAGE_RESTRICTION_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cCertPolicyId"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgCertPolicyId"),
        _CRYPT_BIT_BLOB.layout().withName("RestrictedKeyUsage")
    ).withName("_CERT_KEY_USAGE_RESTRICTION_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cCertPolicyId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cCertPolicyId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cCertPolicyId
     * }
     */
    public static final OfInt cCertPolicyId$layout() {
        return cCertPolicyId$LAYOUT;
    }

    private static final long cCertPolicyId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cCertPolicyId
     * }
     */
    public static final long cCertPolicyId$offset() {
        return cCertPolicyId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cCertPolicyId
     * }
     */
    public static int cCertPolicyId(MemorySegment struct) {
        return struct.get(cCertPolicyId$LAYOUT, cCertPolicyId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cCertPolicyId
     * }
     */
    public static void cCertPolicyId(MemorySegment struct, int fieldValue) {
        struct.set(cCertPolicyId$LAYOUT, cCertPolicyId$OFFSET, fieldValue);
    }

    private static final AddressLayout rgCertPolicyId$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgCertPolicyId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_POLICY_ID rgCertPolicyId
     * }
     */
    public static final AddressLayout rgCertPolicyId$layout() {
        return rgCertPolicyId$LAYOUT;
    }

    private static final long rgCertPolicyId$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_POLICY_ID rgCertPolicyId
     * }
     */
    public static final long rgCertPolicyId$offset() {
        return rgCertPolicyId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_POLICY_ID rgCertPolicyId
     * }
     */
    public static MemorySegment rgCertPolicyId(MemorySegment struct) {
        return struct.get(rgCertPolicyId$LAYOUT, rgCertPolicyId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_POLICY_ID rgCertPolicyId
     * }
     */
    public static void rgCertPolicyId(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgCertPolicyId$LAYOUT, rgCertPolicyId$OFFSET, fieldValue);
    }

    private static final GroupLayout RestrictedKeyUsage$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("RestrictedKeyUsage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB RestrictedKeyUsage
     * }
     */
    public static final GroupLayout RestrictedKeyUsage$layout() {
        return RestrictedKeyUsage$LAYOUT;
    }

    private static final long RestrictedKeyUsage$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB RestrictedKeyUsage
     * }
     */
    public static final long RestrictedKeyUsage$offset() {
        return RestrictedKeyUsage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB RestrictedKeyUsage
     * }
     */
    public static MemorySegment RestrictedKeyUsage(MemorySegment struct) {
        return struct.asSlice(RestrictedKeyUsage$OFFSET, RestrictedKeyUsage$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB RestrictedKeyUsage
     * }
     */
    public static void RestrictedKeyUsage(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, RestrictedKeyUsage$OFFSET, RestrictedKeyUsage$LAYOUT.byteSize());
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

