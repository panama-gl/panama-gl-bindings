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
 * struct _JOB_SET_ARRAY {
 *     HANDLE JobHandle;
 *     DWORD MemberLevel;
 *     DWORD Flags;
 * }
 * }
 */
public class _JOB_SET_ARRAY {

    _JOB_SET_ARRAY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_POINTER.withName("JobHandle"),
        wgl_h.C_LONG.withName("MemberLevel"),
        wgl_h.C_LONG.withName("Flags")
    ).withName("_JOB_SET_ARRAY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout JobHandle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("JobHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE JobHandle
     * }
     */
    public static final AddressLayout JobHandle$layout() {
        return JobHandle$LAYOUT;
    }

    private static final long JobHandle$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE JobHandle
     * }
     */
    public static final long JobHandle$offset() {
        return JobHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE JobHandle
     * }
     */
    public static MemorySegment JobHandle(MemorySegment struct) {
        return struct.get(JobHandle$LAYOUT, JobHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE JobHandle
     * }
     */
    public static void JobHandle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(JobHandle$LAYOUT, JobHandle$OFFSET, fieldValue);
    }

    private static final OfInt MemberLevel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MemberLevel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MemberLevel
     * }
     */
    public static final OfInt MemberLevel$layout() {
        return MemberLevel$LAYOUT;
    }

    private static final long MemberLevel$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MemberLevel
     * }
     */
    public static final long MemberLevel$offset() {
        return MemberLevel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MemberLevel
     * }
     */
    public static int MemberLevel(MemorySegment struct) {
        return struct.get(MemberLevel$LAYOUT, MemberLevel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MemberLevel
     * }
     */
    public static void MemberLevel(MemorySegment struct, int fieldValue) {
        struct.set(MemberLevel$LAYOUT, MemberLevel$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
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

