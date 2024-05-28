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
 * struct _JOBOBJECT_EXTENDED_LIMIT_INFORMATION {
 *     JOBOBJECT_BASIC_LIMIT_INFORMATION BasicLimitInformation;
 *     IO_COUNTERS IoInfo;
 *     SIZE_T ProcessMemoryLimit;
 *     SIZE_T JobMemoryLimit;
 *     SIZE_T PeakProcessMemoryUsed;
 *     SIZE_T PeakJobMemoryUsed;
 * }
 * }
 */
public class _JOBOBJECT_EXTENDED_LIMIT_INFORMATION {

    _JOBOBJECT_EXTENDED_LIMIT_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.layout().withName("BasicLimitInformation"),
        _IO_COUNTERS.layout().withName("IoInfo"),
        freeglut_h.C_LONG_LONG.withName("ProcessMemoryLimit"),
        freeglut_h.C_LONG_LONG.withName("JobMemoryLimit"),
        freeglut_h.C_LONG_LONG.withName("PeakProcessMemoryUsed"),
        freeglut_h.C_LONG_LONG.withName("PeakJobMemoryUsed")
    ).withName("_JOBOBJECT_EXTENDED_LIMIT_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout BasicLimitInformation$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("BasicLimitInformation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_BASIC_LIMIT_INFORMATION BasicLimitInformation
     * }
     */
    public static final GroupLayout BasicLimitInformation$layout() {
        return BasicLimitInformation$LAYOUT;
    }

    private static final long BasicLimitInformation$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_BASIC_LIMIT_INFORMATION BasicLimitInformation
     * }
     */
    public static final long BasicLimitInformation$offset() {
        return BasicLimitInformation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_BASIC_LIMIT_INFORMATION BasicLimitInformation
     * }
     */
    public static MemorySegment BasicLimitInformation(MemorySegment struct) {
        return struct.asSlice(BasicLimitInformation$OFFSET, BasicLimitInformation$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_BASIC_LIMIT_INFORMATION BasicLimitInformation
     * }
     */
    public static void BasicLimitInformation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, BasicLimitInformation$OFFSET, BasicLimitInformation$LAYOUT.byteSize());
    }

    private static final GroupLayout IoInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("IoInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * IO_COUNTERS IoInfo
     * }
     */
    public static final GroupLayout IoInfo$layout() {
        return IoInfo$LAYOUT;
    }

    private static final long IoInfo$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * IO_COUNTERS IoInfo
     * }
     */
    public static final long IoInfo$offset() {
        return IoInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * IO_COUNTERS IoInfo
     * }
     */
    public static MemorySegment IoInfo(MemorySegment struct) {
        return struct.asSlice(IoInfo$OFFSET, IoInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * IO_COUNTERS IoInfo
     * }
     */
    public static void IoInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, IoInfo$OFFSET, IoInfo$LAYOUT.byteSize());
    }

    private static final OfLong ProcessMemoryLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ProcessMemoryLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T ProcessMemoryLimit
     * }
     */
    public static final OfLong ProcessMemoryLimit$layout() {
        return ProcessMemoryLimit$LAYOUT;
    }

    private static final long ProcessMemoryLimit$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T ProcessMemoryLimit
     * }
     */
    public static final long ProcessMemoryLimit$offset() {
        return ProcessMemoryLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T ProcessMemoryLimit
     * }
     */
    public static long ProcessMemoryLimit(MemorySegment struct) {
        return struct.get(ProcessMemoryLimit$LAYOUT, ProcessMemoryLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T ProcessMemoryLimit
     * }
     */
    public static void ProcessMemoryLimit(MemorySegment struct, long fieldValue) {
        struct.set(ProcessMemoryLimit$LAYOUT, ProcessMemoryLimit$OFFSET, fieldValue);
    }

    private static final OfLong JobMemoryLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("JobMemoryLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T JobMemoryLimit
     * }
     */
    public static final OfLong JobMemoryLimit$layout() {
        return JobMemoryLimit$LAYOUT;
    }

    private static final long JobMemoryLimit$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T JobMemoryLimit
     * }
     */
    public static final long JobMemoryLimit$offset() {
        return JobMemoryLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T JobMemoryLimit
     * }
     */
    public static long JobMemoryLimit(MemorySegment struct) {
        return struct.get(JobMemoryLimit$LAYOUT, JobMemoryLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T JobMemoryLimit
     * }
     */
    public static void JobMemoryLimit(MemorySegment struct, long fieldValue) {
        struct.set(JobMemoryLimit$LAYOUT, JobMemoryLimit$OFFSET, fieldValue);
    }

    private static final OfLong PeakProcessMemoryUsed$LAYOUT = (OfLong)$LAYOUT.select(groupElement("PeakProcessMemoryUsed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T PeakProcessMemoryUsed
     * }
     */
    public static final OfLong PeakProcessMemoryUsed$layout() {
        return PeakProcessMemoryUsed$LAYOUT;
    }

    private static final long PeakProcessMemoryUsed$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T PeakProcessMemoryUsed
     * }
     */
    public static final long PeakProcessMemoryUsed$offset() {
        return PeakProcessMemoryUsed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T PeakProcessMemoryUsed
     * }
     */
    public static long PeakProcessMemoryUsed(MemorySegment struct) {
        return struct.get(PeakProcessMemoryUsed$LAYOUT, PeakProcessMemoryUsed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T PeakProcessMemoryUsed
     * }
     */
    public static void PeakProcessMemoryUsed(MemorySegment struct, long fieldValue) {
        struct.set(PeakProcessMemoryUsed$LAYOUT, PeakProcessMemoryUsed$OFFSET, fieldValue);
    }

    private static final OfLong PeakJobMemoryUsed$LAYOUT = (OfLong)$LAYOUT.select(groupElement("PeakJobMemoryUsed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T PeakJobMemoryUsed
     * }
     */
    public static final OfLong PeakJobMemoryUsed$layout() {
        return PeakJobMemoryUsed$LAYOUT;
    }

    private static final long PeakJobMemoryUsed$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T PeakJobMemoryUsed
     * }
     */
    public static final long PeakJobMemoryUsed$offset() {
        return PeakJobMemoryUsed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T PeakJobMemoryUsed
     * }
     */
    public static long PeakJobMemoryUsed(MemorySegment struct) {
        return struct.get(PeakJobMemoryUsed$LAYOUT, PeakJobMemoryUsed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T PeakJobMemoryUsed
     * }
     */
    public static void PeakJobMemoryUsed(MemorySegment struct, long fieldValue) {
        struct.set(PeakJobMemoryUsed$LAYOUT, PeakJobMemoryUsed$OFFSET, fieldValue);
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

