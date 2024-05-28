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
 * struct _RPC_BINDING_HANDLE_TEMPLATE_V1_W {
 *     unsigned long Version;
 *     unsigned long Flags;
 *     unsigned long ProtocolSequence;
 *     unsigned short *NetworkAddress;
 *     unsigned short *StringEndpoint;
 *     union {
 *         unsigned short *Reserved;
 *     } u1;
 *     UUID ObjectUuid;
 * }
 * }
 */
public class _RPC_BINDING_HANDLE_TEMPLATE_V1_W {

    _RPC_BINDING_HANDLE_TEMPLATE_V1_W() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Version"),
        wgl_h.C_LONG.withName("Flags"),
        wgl_h.C_LONG.withName("ProtocolSequence"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("NetworkAddress"),
        wgl_h.C_POINTER.withName("StringEndpoint"),
        _RPC_BINDING_HANDLE_TEMPLATE_V1_W.u1.layout().withName("u1"),
        _GUID.layout().withName("ObjectUuid")
    ).withName("_RPC_BINDING_HANDLE_TEMPLATE_V1_W");

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

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final OfInt ProtocolSequence$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ProtocolSequence"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long ProtocolSequence
     * }
     */
    public static final OfInt ProtocolSequence$layout() {
        return ProtocolSequence$LAYOUT;
    }

    private static final long ProtocolSequence$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long ProtocolSequence
     * }
     */
    public static final long ProtocolSequence$offset() {
        return ProtocolSequence$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long ProtocolSequence
     * }
     */
    public static int ProtocolSequence(MemorySegment struct) {
        return struct.get(ProtocolSequence$LAYOUT, ProtocolSequence$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long ProtocolSequence
     * }
     */
    public static void ProtocolSequence(MemorySegment struct, int fieldValue) {
        struct.set(ProtocolSequence$LAYOUT, ProtocolSequence$OFFSET, fieldValue);
    }

    private static final AddressLayout NetworkAddress$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("NetworkAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short *NetworkAddress
     * }
     */
    public static final AddressLayout NetworkAddress$layout() {
        return NetworkAddress$LAYOUT;
    }

    private static final long NetworkAddress$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short *NetworkAddress
     * }
     */
    public static final long NetworkAddress$offset() {
        return NetworkAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short *NetworkAddress
     * }
     */
    public static MemorySegment NetworkAddress(MemorySegment struct) {
        return struct.get(NetworkAddress$LAYOUT, NetworkAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short *NetworkAddress
     * }
     */
    public static void NetworkAddress(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(NetworkAddress$LAYOUT, NetworkAddress$OFFSET, fieldValue);
    }

    private static final AddressLayout StringEndpoint$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("StringEndpoint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short *StringEndpoint
     * }
     */
    public static final AddressLayout StringEndpoint$layout() {
        return StringEndpoint$LAYOUT;
    }

    private static final long StringEndpoint$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short *StringEndpoint
     * }
     */
    public static final long StringEndpoint$offset() {
        return StringEndpoint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short *StringEndpoint
     * }
     */
    public static MemorySegment StringEndpoint(MemorySegment struct) {
        return struct.get(StringEndpoint$LAYOUT, StringEndpoint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short *StringEndpoint
     * }
     */
    public static void StringEndpoint(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(StringEndpoint$LAYOUT, StringEndpoint$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     unsigned short *Reserved;
     * }
     * }
     */
    public static class u1 {

        u1() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            wgl_h.C_POINTER.withName("Reserved")
        ).withName("$anon$2046:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final AddressLayout Reserved$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Reserved"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * unsigned short *Reserved
         * }
         */
        public static final AddressLayout Reserved$layout() {
            return Reserved$LAYOUT;
        }

        private static final long Reserved$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * unsigned short *Reserved
         * }
         */
        public static final long Reserved$offset() {
            return Reserved$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * unsigned short *Reserved
         * }
         */
        public static MemorySegment Reserved(MemorySegment union) {
            return union.get(Reserved$LAYOUT, Reserved$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * unsigned short *Reserved
         * }
         */
        public static void Reserved(MemorySegment union, MemorySegment fieldValue) {
            union.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
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

    private static final GroupLayout u1$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("u1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     unsigned short *Reserved;
     * } u1
     * }
     */
    public static final GroupLayout u1$layout() {
        return u1$LAYOUT;
    }

    private static final long u1$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     unsigned short *Reserved;
     * } u1
     * }
     */
    public static final long u1$offset() {
        return u1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     unsigned short *Reserved;
     * } u1
     * }
     */
    public static MemorySegment u1(MemorySegment struct) {
        return struct.asSlice(u1$OFFSET, u1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     unsigned short *Reserved;
     * } u1
     * }
     */
    public static void u1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, u1$OFFSET, u1$LAYOUT.byteSize());
    }

    private static final GroupLayout ObjectUuid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ObjectUuid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UUID ObjectUuid
     * }
     */
    public static final GroupLayout ObjectUuid$layout() {
        return ObjectUuid$LAYOUT;
    }

    private static final long ObjectUuid$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UUID ObjectUuid
     * }
     */
    public static final long ObjectUuid$offset() {
        return ObjectUuid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UUID ObjectUuid
     * }
     */
    public static MemorySegment ObjectUuid(MemorySegment struct) {
        return struct.asSlice(ObjectUuid$OFFSET, ObjectUuid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UUID ObjectUuid
     * }
     */
    public static void ObjectUuid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ObjectUuid$OFFSET, ObjectUuid$LAYOUT.byteSize());
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

