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
 * struct _POWER_IDLE_RESILIENCY {
 *     DWORD CoalescingTimeout;
 *     DWORD IdleResiliencyPeriod;
 * }
 * }
 */
public class _POWER_IDLE_RESILIENCY {

    _POWER_IDLE_RESILIENCY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("CoalescingTimeout"),
        freeglut_h.C_LONG.withName("IdleResiliencyPeriod")
    ).withName("_POWER_IDLE_RESILIENCY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt CoalescingTimeout$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CoalescingTimeout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD CoalescingTimeout
     * }
     */
    public static final OfInt CoalescingTimeout$layout() {
        return CoalescingTimeout$LAYOUT;
    }

    private static final long CoalescingTimeout$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD CoalescingTimeout
     * }
     */
    public static final long CoalescingTimeout$offset() {
        return CoalescingTimeout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD CoalescingTimeout
     * }
     */
    public static int CoalescingTimeout(MemorySegment struct) {
        return struct.get(CoalescingTimeout$LAYOUT, CoalescingTimeout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD CoalescingTimeout
     * }
     */
    public static void CoalescingTimeout(MemorySegment struct, int fieldValue) {
        struct.set(CoalescingTimeout$LAYOUT, CoalescingTimeout$OFFSET, fieldValue);
    }

    private static final OfInt IdleResiliencyPeriod$LAYOUT = (OfInt)$LAYOUT.select(groupElement("IdleResiliencyPeriod"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD IdleResiliencyPeriod
     * }
     */
    public static final OfInt IdleResiliencyPeriod$layout() {
        return IdleResiliencyPeriod$LAYOUT;
    }

    private static final long IdleResiliencyPeriod$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD IdleResiliencyPeriod
     * }
     */
    public static final long IdleResiliencyPeriod$offset() {
        return IdleResiliencyPeriod$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD IdleResiliencyPeriod
     * }
     */
    public static int IdleResiliencyPeriod(MemorySegment struct) {
        return struct.get(IdleResiliencyPeriod$LAYOUT, IdleResiliencyPeriod$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD IdleResiliencyPeriod
     * }
     */
    public static void IdleResiliencyPeriod(MemorySegment struct, int fieldValue) {
        struct.set(IdleResiliencyPeriod$LAYOUT, IdleResiliencyPeriod$OFFSET, fieldValue);
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

