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
 * struct ASSOCIATIONELEMENT {
 *     ASSOCCLASS ac;
 *     HKEY hkClass;
 *     PCWSTR pszClass;
 * }
 * }
 */
public class ASSOCIATIONELEMENT {

    ASSOCIATIONELEMENT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_INT.withName("ac"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("hkClass"),
        wgl_h.C_POINTER.withName("pszClass")
    ).withName("ASSOCIATIONELEMENT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ac$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ac"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ASSOCCLASS ac
     * }
     */
    public static final OfInt ac$layout() {
        return ac$LAYOUT;
    }

    private static final long ac$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ASSOCCLASS ac
     * }
     */
    public static final long ac$offset() {
        return ac$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ASSOCCLASS ac
     * }
     */
    public static int ac(MemorySegment struct) {
        return struct.get(ac$LAYOUT, ac$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ASSOCCLASS ac
     * }
     */
    public static void ac(MemorySegment struct, int fieldValue) {
        struct.set(ac$LAYOUT, ac$OFFSET, fieldValue);
    }

    private static final AddressLayout hkClass$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hkClass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HKEY hkClass
     * }
     */
    public static final AddressLayout hkClass$layout() {
        return hkClass$LAYOUT;
    }

    private static final long hkClass$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HKEY hkClass
     * }
     */
    public static final long hkClass$offset() {
        return hkClass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HKEY hkClass
     * }
     */
    public static MemorySegment hkClass(MemorySegment struct) {
        return struct.get(hkClass$LAYOUT, hkClass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HKEY hkClass
     * }
     */
    public static void hkClass(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hkClass$LAYOUT, hkClass$OFFSET, fieldValue);
    }

    private static final AddressLayout pszClass$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszClass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCWSTR pszClass
     * }
     */
    public static final AddressLayout pszClass$layout() {
        return pszClass$LAYOUT;
    }

    private static final long pszClass$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCWSTR pszClass
     * }
     */
    public static final long pszClass$offset() {
        return pszClass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCWSTR pszClass
     * }
     */
    public static MemorySegment pszClass(MemorySegment struct) {
        return struct.get(pszClass$LAYOUT, pszClass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCWSTR pszClass
     * }
     */
    public static void pszClass(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszClass$LAYOUT, pszClass$OFFSET, fieldValue);
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

