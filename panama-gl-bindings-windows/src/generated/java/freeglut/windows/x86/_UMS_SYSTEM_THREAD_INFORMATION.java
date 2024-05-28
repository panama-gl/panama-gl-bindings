// Generated by jextract

package freeglut.windows.x86;

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
 * struct _UMS_SYSTEM_THREAD_INFORMATION {
 *     ULONG UmsVersion;
 *     union {
 *         struct {
 *             ULONG IsUmsSchedulerThread : 1;
 *             ULONG IsUmsWorkerThread : 1;
 *         };
 *         ULONG ThreadUmsFlags;
 *     };
 * }
 * }
 */
public class _UMS_SYSTEM_THREAD_INFORMATION {

    _UMS_SYSTEM_THREAD_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("UmsVersion"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$1614:9"),
            freeglut_h.C_LONG.withName("ThreadUmsFlags")
        ).withName("$anon$1613:5")
    ).withName("_UMS_SYSTEM_THREAD_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt UmsVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("UmsVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG UmsVersion
     * }
     */
    public static final OfInt UmsVersion$layout() {
        return UmsVersion$LAYOUT;
    }

    private static final long UmsVersion$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG UmsVersion
     * }
     */
    public static final long UmsVersion$offset() {
        return UmsVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG UmsVersion
     * }
     */
    public static int UmsVersion(MemorySegment struct) {
        return struct.get(UmsVersion$LAYOUT, UmsVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG UmsVersion
     * }
     */
    public static void UmsVersion(MemorySegment struct, int fieldValue) {
        struct.set(UmsVersion$LAYOUT, UmsVersion$OFFSET, fieldValue);
    }

    private static final OfInt ThreadUmsFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$1613:5"), groupElement("ThreadUmsFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ThreadUmsFlags
     * }
     */
    public static final OfInt ThreadUmsFlags$layout() {
        return ThreadUmsFlags$LAYOUT;
    }

    private static final long ThreadUmsFlags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ThreadUmsFlags
     * }
     */
    public static final long ThreadUmsFlags$offset() {
        return ThreadUmsFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ThreadUmsFlags
     * }
     */
    public static int ThreadUmsFlags(MemorySegment struct) {
        return struct.get(ThreadUmsFlags$LAYOUT, ThreadUmsFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ThreadUmsFlags
     * }
     */
    public static void ThreadUmsFlags(MemorySegment struct, int fieldValue) {
        struct.set(ThreadUmsFlags$LAYOUT, ThreadUmsFlags$OFFSET, fieldValue);
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

