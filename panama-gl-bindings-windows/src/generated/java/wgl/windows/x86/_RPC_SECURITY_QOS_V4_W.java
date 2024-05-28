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
 * struct _RPC_SECURITY_QOS_V4_W {
 *     unsigned long Version;
 *     unsigned long Capabilities;
 *     unsigned long IdentityTracking;
 *     unsigned long ImpersonationType;
 *     unsigned long AdditionalSecurityInfoType;
 *     union {
 *         RPC_HTTP_TRANSPORT_CREDENTIALS_W *HttpCredentials;
 *     } u;
 *     void *Sid;
 *     unsigned int EffectiveOnly;
 * }
 * }
 */
public class _RPC_SECURITY_QOS_V4_W {

    _RPC_SECURITY_QOS_V4_W() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Version"),
        wgl_h.C_LONG.withName("Capabilities"),
        wgl_h.C_LONG.withName("IdentityTracking"),
        wgl_h.C_LONG.withName("ImpersonationType"),
        wgl_h.C_LONG.withName("AdditionalSecurityInfoType"),
        MemoryLayout.paddingLayout(4),
        _RPC_SECURITY_QOS_V4_W.u.layout().withName("u"),
        wgl_h.C_POINTER.withName("Sid"),
        wgl_h.C_INT.withName("EffectiveOnly"),
        MemoryLayout.paddingLayout(4)
    ).withName("_RPC_SECURITY_QOS_V4_W");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfInt Capabilities$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Capabilities"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long Capabilities
     * }
     */
    public static final OfInt Capabilities$layout() {
        return Capabilities$LAYOUT;
    }

    private static final long Capabilities$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long Capabilities
     * }
     */
    public static final long Capabilities$offset() {
        return Capabilities$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long Capabilities
     * }
     */
    public static int Capabilities(MemorySegment struct) {
        return struct.get(Capabilities$LAYOUT, Capabilities$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long Capabilities
     * }
     */
    public static void Capabilities(MemorySegment struct, int fieldValue) {
        struct.set(Capabilities$LAYOUT, Capabilities$OFFSET, fieldValue);
    }

    private static final OfInt IdentityTracking$LAYOUT = (OfInt)$LAYOUT.select(groupElement("IdentityTracking"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long IdentityTracking
     * }
     */
    public static final OfInt IdentityTracking$layout() {
        return IdentityTracking$LAYOUT;
    }

    private static final long IdentityTracking$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long IdentityTracking
     * }
     */
    public static final long IdentityTracking$offset() {
        return IdentityTracking$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long IdentityTracking
     * }
     */
    public static int IdentityTracking(MemorySegment struct) {
        return struct.get(IdentityTracking$LAYOUT, IdentityTracking$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long IdentityTracking
     * }
     */
    public static void IdentityTracking(MemorySegment struct, int fieldValue) {
        struct.set(IdentityTracking$LAYOUT, IdentityTracking$OFFSET, fieldValue);
    }

    private static final OfInt ImpersonationType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ImpersonationType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long ImpersonationType
     * }
     */
    public static final OfInt ImpersonationType$layout() {
        return ImpersonationType$LAYOUT;
    }

    private static final long ImpersonationType$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long ImpersonationType
     * }
     */
    public static final long ImpersonationType$offset() {
        return ImpersonationType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long ImpersonationType
     * }
     */
    public static int ImpersonationType(MemorySegment struct) {
        return struct.get(ImpersonationType$LAYOUT, ImpersonationType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long ImpersonationType
     * }
     */
    public static void ImpersonationType(MemorySegment struct, int fieldValue) {
        struct.set(ImpersonationType$LAYOUT, ImpersonationType$OFFSET, fieldValue);
    }

    private static final OfInt AdditionalSecurityInfoType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AdditionalSecurityInfoType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long AdditionalSecurityInfoType
     * }
     */
    public static final OfInt AdditionalSecurityInfoType$layout() {
        return AdditionalSecurityInfoType$LAYOUT;
    }

    private static final long AdditionalSecurityInfoType$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long AdditionalSecurityInfoType
     * }
     */
    public static final long AdditionalSecurityInfoType$offset() {
        return AdditionalSecurityInfoType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long AdditionalSecurityInfoType
     * }
     */
    public static int AdditionalSecurityInfoType(MemorySegment struct) {
        return struct.get(AdditionalSecurityInfoType$LAYOUT, AdditionalSecurityInfoType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long AdditionalSecurityInfoType
     * }
     */
    public static void AdditionalSecurityInfoType(MemorySegment struct, int fieldValue) {
        struct.set(AdditionalSecurityInfoType$LAYOUT, AdditionalSecurityInfoType$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     RPC_HTTP_TRANSPORT_CREDENTIALS_W *HttpCredentials;
     * }
     * }
     */
    public static class u {

        u() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            wgl_h.C_POINTER.withName("HttpCredentials")
        ).withName("$anon$1868:3");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final AddressLayout HttpCredentials$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("HttpCredentials"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * RPC_HTTP_TRANSPORT_CREDENTIALS_W *HttpCredentials
         * }
         */
        public static final AddressLayout HttpCredentials$layout() {
            return HttpCredentials$LAYOUT;
        }

        private static final long HttpCredentials$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * RPC_HTTP_TRANSPORT_CREDENTIALS_W *HttpCredentials
         * }
         */
        public static final long HttpCredentials$offset() {
            return HttpCredentials$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * RPC_HTTP_TRANSPORT_CREDENTIALS_W *HttpCredentials
         * }
         */
        public static MemorySegment HttpCredentials(MemorySegment union) {
            return union.get(HttpCredentials$LAYOUT, HttpCredentials$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * RPC_HTTP_TRANSPORT_CREDENTIALS_W *HttpCredentials
         * }
         */
        public static void HttpCredentials(MemorySegment union, MemorySegment fieldValue) {
            union.set(HttpCredentials$LAYOUT, HttpCredentials$OFFSET, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
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

    private static final GroupLayout u$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("u"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     RPC_HTTP_TRANSPORT_CREDENTIALS_W *HttpCredentials;
     * } u
     * }
     */
    public static final GroupLayout u$layout() {
        return u$LAYOUT;
    }

    private static final long u$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     RPC_HTTP_TRANSPORT_CREDENTIALS_W *HttpCredentials;
     * } u
     * }
     */
    public static final long u$offset() {
        return u$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     RPC_HTTP_TRANSPORT_CREDENTIALS_W *HttpCredentials;
     * } u
     * }
     */
    public static MemorySegment u(MemorySegment struct) {
        return struct.asSlice(u$OFFSET, u$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     RPC_HTTP_TRANSPORT_CREDENTIALS_W *HttpCredentials;
     * } u
     * }
     */
    public static void u(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, u$OFFSET, u$LAYOUT.byteSize());
    }

    private static final AddressLayout Sid$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Sid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *Sid
     * }
     */
    public static final AddressLayout Sid$layout() {
        return Sid$LAYOUT;
    }

    private static final long Sid$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *Sid
     * }
     */
    public static final long Sid$offset() {
        return Sid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *Sid
     * }
     */
    public static MemorySegment Sid(MemorySegment struct) {
        return struct.get(Sid$LAYOUT, Sid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *Sid
     * }
     */
    public static void Sid(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Sid$LAYOUT, Sid$OFFSET, fieldValue);
    }

    private static final OfInt EffectiveOnly$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EffectiveOnly"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int EffectiveOnly
     * }
     */
    public static final OfInt EffectiveOnly$layout() {
        return EffectiveOnly$LAYOUT;
    }

    private static final long EffectiveOnly$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int EffectiveOnly
     * }
     */
    public static final long EffectiveOnly$offset() {
        return EffectiveOnly$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int EffectiveOnly
     * }
     */
    public static int EffectiveOnly(MemorySegment struct) {
        return struct.get(EffectiveOnly$LAYOUT, EffectiveOnly$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int EffectiveOnly
     * }
     */
    public static void EffectiveOnly(MemorySegment struct, int fieldValue) {
        struct.set(EffectiveOnly$LAYOUT, EffectiveOnly$OFFSET, fieldValue);
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

