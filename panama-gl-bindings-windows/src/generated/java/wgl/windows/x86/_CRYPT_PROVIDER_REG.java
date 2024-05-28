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
 * struct _CRYPT_PROVIDER_REG {
 *     ULONG cAliases;
 *     PWSTR *rgpszAliases;
 *     PCRYPT_IMAGE_REG pUM;
 *     PCRYPT_IMAGE_REG pKM;
 * }
 * }
 */
public class _CRYPT_PROVIDER_REG {

    _CRYPT_PROVIDER_REG() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cAliases"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgpszAliases"),
        wgl_h.C_POINTER.withName("pUM"),
        wgl_h.C_POINTER.withName("pKM")
    ).withName("_CRYPT_PROVIDER_REG");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cAliases$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cAliases"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cAliases
     * }
     */
    public static final OfInt cAliases$layout() {
        return cAliases$LAYOUT;
    }

    private static final long cAliases$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cAliases
     * }
     */
    public static final long cAliases$offset() {
        return cAliases$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cAliases
     * }
     */
    public static int cAliases(MemorySegment struct) {
        return struct.get(cAliases$LAYOUT, cAliases$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cAliases
     * }
     */
    public static void cAliases(MemorySegment struct, int fieldValue) {
        struct.set(cAliases$LAYOUT, cAliases$OFFSET, fieldValue);
    }

    private static final AddressLayout rgpszAliases$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgpszAliases"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PWSTR *rgpszAliases
     * }
     */
    public static final AddressLayout rgpszAliases$layout() {
        return rgpszAliases$LAYOUT;
    }

    private static final long rgpszAliases$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PWSTR *rgpszAliases
     * }
     */
    public static final long rgpszAliases$offset() {
        return rgpszAliases$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PWSTR *rgpszAliases
     * }
     */
    public static MemorySegment rgpszAliases(MemorySegment struct) {
        return struct.get(rgpszAliases$LAYOUT, rgpszAliases$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PWSTR *rgpszAliases
     * }
     */
    public static void rgpszAliases(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgpszAliases$LAYOUT, rgpszAliases$OFFSET, fieldValue);
    }

    private static final AddressLayout pUM$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pUM"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCRYPT_IMAGE_REG pUM
     * }
     */
    public static final AddressLayout pUM$layout() {
        return pUM$LAYOUT;
    }

    private static final long pUM$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCRYPT_IMAGE_REG pUM
     * }
     */
    public static final long pUM$offset() {
        return pUM$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCRYPT_IMAGE_REG pUM
     * }
     */
    public static MemorySegment pUM(MemorySegment struct) {
        return struct.get(pUM$LAYOUT, pUM$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCRYPT_IMAGE_REG pUM
     * }
     */
    public static void pUM(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pUM$LAYOUT, pUM$OFFSET, fieldValue);
    }

    private static final AddressLayout pKM$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pKM"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCRYPT_IMAGE_REG pKM
     * }
     */
    public static final AddressLayout pKM$layout() {
        return pKM$LAYOUT;
    }

    private static final long pKM$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCRYPT_IMAGE_REG pKM
     * }
     */
    public static final long pKM$offset() {
        return pKM$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCRYPT_IMAGE_REG pKM
     * }
     */
    public static MemorySegment pKM(MemorySegment struct) {
        return struct.get(pKM$LAYOUT, pKM$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCRYPT_IMAGE_REG pKM
     * }
     */
    public static void pKM(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pKM$LAYOUT, pKM$OFFSET, fieldValue);
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

