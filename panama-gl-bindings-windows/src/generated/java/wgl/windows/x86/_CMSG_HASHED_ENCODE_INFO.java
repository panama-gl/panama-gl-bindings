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
 * struct _CMSG_HASHED_ENCODE_INFO {
 *     DWORD cbSize;
 *     HCRYPTPROV_LEGACY hCryptProv;
 *     CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm;
 *     void *pvHashAuxInfo;
 * }
 * }
 */
public class _CMSG_HASHED_ENCODE_INFO {

    _CMSG_HASHED_ENCODE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_LONG_LONG.withName("hCryptProv"),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("HashAlgorithm"),
        wgl_h.C_POINTER.withName("pvHashAuxInfo")
    ).withName("_CMSG_HASHED_ENCODE_INFO");

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

    private static final OfLong hCryptProv$LAYOUT = (OfLong)$LAYOUT.select(groupElement("hCryptProv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCRYPTPROV_LEGACY hCryptProv
     * }
     */
    public static final OfLong hCryptProv$layout() {
        return hCryptProv$LAYOUT;
    }

    private static final long hCryptProv$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCRYPTPROV_LEGACY hCryptProv
     * }
     */
    public static final long hCryptProv$offset() {
        return hCryptProv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCRYPTPROV_LEGACY hCryptProv
     * }
     */
    public static long hCryptProv(MemorySegment struct) {
        return struct.get(hCryptProv$LAYOUT, hCryptProv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCRYPTPROV_LEGACY hCryptProv
     * }
     */
    public static void hCryptProv(MemorySegment struct, long fieldValue) {
        struct.set(hCryptProv$LAYOUT, hCryptProv$OFFSET, fieldValue);
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

    private static final long HashAlgorithm$OFFSET = 16;

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

    private static final AddressLayout pvHashAuxInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvHashAuxInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *pvHashAuxInfo
     * }
     */
    public static final AddressLayout pvHashAuxInfo$layout() {
        return pvHashAuxInfo$LAYOUT;
    }

    private static final long pvHashAuxInfo$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pvHashAuxInfo
     * }
     */
    public static final long pvHashAuxInfo$offset() {
        return pvHashAuxInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pvHashAuxInfo
     * }
     */
    public static MemorySegment pvHashAuxInfo(MemorySegment struct) {
        return struct.get(pvHashAuxInfo$LAYOUT, pvHashAuxInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pvHashAuxInfo
     * }
     */
    public static void pvHashAuxInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvHashAuxInfo$LAYOUT, pvHashAuxInfo$OFFSET, fieldValue);
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

