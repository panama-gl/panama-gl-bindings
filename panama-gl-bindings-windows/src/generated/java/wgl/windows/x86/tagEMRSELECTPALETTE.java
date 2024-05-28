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
 * struct tagEMRSELECTPALETTE {
 *     EMR emr;
 *     DWORD ihPal;
 * }
 * }
 */
public class tagEMRSELECTPALETTE {

    tagEMRSELECTPALETTE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagEMR.layout().withName("emr"),
        wgl_h.C_LONG.withName("ihPal")
    ).withName("tagEMRSELECTPALETTE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout emr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("emr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final GroupLayout emr$layout() {
        return emr$LAYOUT;
    }

    private static final long emr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final long emr$offset() {
        return emr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static MemorySegment emr(MemorySegment struct) {
        return struct.asSlice(emr$OFFSET, emr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static void emr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, emr$OFFSET, emr$LAYOUT.byteSize());
    }

    private static final OfInt ihPal$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ihPal"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ihPal
     * }
     */
    public static final OfInt ihPal$layout() {
        return ihPal$LAYOUT;
    }

    private static final long ihPal$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ihPal
     * }
     */
    public static final long ihPal$offset() {
        return ihPal$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ihPal
     * }
     */
    public static int ihPal(MemorySegment struct) {
        return struct.get(ihPal$LAYOUT, ihPal$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ihPal
     * }
     */
    public static void ihPal(MemorySegment struct, int fieldValue) {
        struct.set(ihPal$LAYOUT, ihPal$OFFSET, fieldValue);
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

