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
 * struct _CERT_TPM_SPECIFICATION_INFO {
 *     LPWSTR pwszFamily;
 *     DWORD dwLevel;
 *     DWORD dwRevision;
 * }
 * }
 */
public class _CERT_TPM_SPECIFICATION_INFO {

    _CERT_TPM_SPECIFICATION_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_POINTER.withName("pwszFamily"),
        wgl_h.C_LONG.withName("dwLevel"),
        wgl_h.C_LONG.withName("dwRevision")
    ).withName("_CERT_TPM_SPECIFICATION_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pwszFamily$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pwszFamily"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pwszFamily
     * }
     */
    public static final AddressLayout pwszFamily$layout() {
        return pwszFamily$LAYOUT;
    }

    private static final long pwszFamily$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pwszFamily
     * }
     */
    public static final long pwszFamily$offset() {
        return pwszFamily$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pwszFamily
     * }
     */
    public static MemorySegment pwszFamily(MemorySegment struct) {
        return struct.get(pwszFamily$LAYOUT, pwszFamily$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pwszFamily
     * }
     */
    public static void pwszFamily(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pwszFamily$LAYOUT, pwszFamily$OFFSET, fieldValue);
    }

    private static final OfInt dwLevel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwLevel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwLevel
     * }
     */
    public static final OfInt dwLevel$layout() {
        return dwLevel$LAYOUT;
    }

    private static final long dwLevel$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwLevel
     * }
     */
    public static final long dwLevel$offset() {
        return dwLevel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwLevel
     * }
     */
    public static int dwLevel(MemorySegment struct) {
        return struct.get(dwLevel$LAYOUT, dwLevel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwLevel
     * }
     */
    public static void dwLevel(MemorySegment struct, int fieldValue) {
        struct.set(dwLevel$LAYOUT, dwLevel$OFFSET, fieldValue);
    }

    private static final OfInt dwRevision$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwRevision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwRevision
     * }
     */
    public static final OfInt dwRevision$layout() {
        return dwRevision$LAYOUT;
    }

    private static final long dwRevision$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwRevision
     * }
     */
    public static final long dwRevision$offset() {
        return dwRevision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwRevision
     * }
     */
    public static int dwRevision(MemorySegment struct) {
        return struct.get(dwRevision$LAYOUT, dwRevision$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwRevision
     * }
     */
    public static void dwRevision(MemorySegment struct, int fieldValue) {
        struct.set(dwRevision$LAYOUT, dwRevision$OFFSET, fieldValue);
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

