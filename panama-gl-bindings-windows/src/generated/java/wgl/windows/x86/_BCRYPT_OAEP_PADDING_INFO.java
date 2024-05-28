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
 * struct _BCRYPT_OAEP_PADDING_INFO {
 *     LPCWSTR pszAlgId;
 *     PUCHAR pbLabel;
 *     ULONG cbLabel;
 * }
 * }
 */
public class _BCRYPT_OAEP_PADDING_INFO {

    _BCRYPT_OAEP_PADDING_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_POINTER.withName("pszAlgId"),
        wgl_h.C_POINTER.withName("pbLabel"),
        wgl_h.C_LONG.withName("cbLabel"),
        MemoryLayout.paddingLayout(4)
    ).withName("_BCRYPT_OAEP_PADDING_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pszAlgId$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszAlgId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR pszAlgId
     * }
     */
    public static final AddressLayout pszAlgId$layout() {
        return pszAlgId$LAYOUT;
    }

    private static final long pszAlgId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR pszAlgId
     * }
     */
    public static final long pszAlgId$offset() {
        return pszAlgId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR pszAlgId
     * }
     */
    public static MemorySegment pszAlgId(MemorySegment struct) {
        return struct.get(pszAlgId$LAYOUT, pszAlgId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR pszAlgId
     * }
     */
    public static void pszAlgId(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszAlgId$LAYOUT, pszAlgId$OFFSET, fieldValue);
    }

    private static final AddressLayout pbLabel$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pbLabel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PUCHAR pbLabel
     * }
     */
    public static final AddressLayout pbLabel$layout() {
        return pbLabel$LAYOUT;
    }

    private static final long pbLabel$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PUCHAR pbLabel
     * }
     */
    public static final long pbLabel$offset() {
        return pbLabel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PUCHAR pbLabel
     * }
     */
    public static MemorySegment pbLabel(MemorySegment struct) {
        return struct.get(pbLabel$LAYOUT, pbLabel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PUCHAR pbLabel
     * }
     */
    public static void pbLabel(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pbLabel$LAYOUT, pbLabel$OFFSET, fieldValue);
    }

    private static final OfInt cbLabel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbLabel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbLabel
     * }
     */
    public static final OfInt cbLabel$layout() {
        return cbLabel$LAYOUT;
    }

    private static final long cbLabel$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbLabel
     * }
     */
    public static final long cbLabel$offset() {
        return cbLabel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbLabel
     * }
     */
    public static int cbLabel(MemorySegment struct) {
        return struct.get(cbLabel$LAYOUT, cbLabel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbLabel
     * }
     */
    public static void cbLabel(MemorySegment struct, int fieldValue) {
        struct.set(cbLabel$LAYOUT, cbLabel$OFFSET, fieldValue);
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

