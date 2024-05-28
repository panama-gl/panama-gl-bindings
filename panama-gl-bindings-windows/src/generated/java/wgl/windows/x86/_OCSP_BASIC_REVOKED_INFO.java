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
 * struct _OCSP_BASIC_REVOKED_INFO {
 *     FILETIME RevocationDate;
 *     DWORD dwCrlReasonCode;
 * }
 * }
 */
public class _OCSP_BASIC_REVOKED_INFO {

    _OCSP_BASIC_REVOKED_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _FILETIME.layout().withName("RevocationDate"),
        wgl_h.C_LONG.withName("dwCrlReasonCode")
    ).withName("_OCSP_BASIC_REVOKED_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout RevocationDate$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("RevocationDate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME RevocationDate
     * }
     */
    public static final GroupLayout RevocationDate$layout() {
        return RevocationDate$LAYOUT;
    }

    private static final long RevocationDate$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME RevocationDate
     * }
     */
    public static final long RevocationDate$offset() {
        return RevocationDate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME RevocationDate
     * }
     */
    public static MemorySegment RevocationDate(MemorySegment struct) {
        return struct.asSlice(RevocationDate$OFFSET, RevocationDate$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME RevocationDate
     * }
     */
    public static void RevocationDate(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, RevocationDate$OFFSET, RevocationDate$LAYOUT.byteSize());
    }

    private static final OfInt dwCrlReasonCode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCrlReasonCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwCrlReasonCode
     * }
     */
    public static final OfInt dwCrlReasonCode$layout() {
        return dwCrlReasonCode$LAYOUT;
    }

    private static final long dwCrlReasonCode$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwCrlReasonCode
     * }
     */
    public static final long dwCrlReasonCode$offset() {
        return dwCrlReasonCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwCrlReasonCode
     * }
     */
    public static int dwCrlReasonCode(MemorySegment struct) {
        return struct.get(dwCrlReasonCode$LAYOUT, dwCrlReasonCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwCrlReasonCode
     * }
     */
    public static void dwCrlReasonCode(MemorySegment struct, int fieldValue) {
        struct.set(dwCrlReasonCode$LAYOUT, dwCrlReasonCode$OFFSET, fieldValue);
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

