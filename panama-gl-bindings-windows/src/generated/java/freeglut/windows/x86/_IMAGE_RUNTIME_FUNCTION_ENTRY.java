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
 * struct _IMAGE_RUNTIME_FUNCTION_ENTRY {
 *     DWORD BeginAddress;
 *     DWORD EndAddress;
 *     union {
 *         DWORD UnwindInfoAddress;
 *         DWORD UnwindData;
 *     };
 * }
 * }
 */
public class _IMAGE_RUNTIME_FUNCTION_ENTRY {

    _IMAGE_RUNTIME_FUNCTION_ENTRY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("BeginAddress"),
        freeglut_h.C_LONG.withName("EndAddress"),
        MemoryLayout.unionLayout(
            freeglut_h.C_LONG.withName("UnwindInfoAddress"),
            freeglut_h.C_LONG.withName("UnwindData")
        ).withName("$anon$18859:5")
    ).withName("_IMAGE_RUNTIME_FUNCTION_ENTRY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt BeginAddress$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BeginAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BeginAddress
     * }
     */
    public static final OfInt BeginAddress$layout() {
        return BeginAddress$LAYOUT;
    }

    private static final long BeginAddress$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BeginAddress
     * }
     */
    public static final long BeginAddress$offset() {
        return BeginAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BeginAddress
     * }
     */
    public static int BeginAddress(MemorySegment struct) {
        return struct.get(BeginAddress$LAYOUT, BeginAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BeginAddress
     * }
     */
    public static void BeginAddress(MemorySegment struct, int fieldValue) {
        struct.set(BeginAddress$LAYOUT, BeginAddress$OFFSET, fieldValue);
    }

    private static final OfInt EndAddress$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EndAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD EndAddress
     * }
     */
    public static final OfInt EndAddress$layout() {
        return EndAddress$LAYOUT;
    }

    private static final long EndAddress$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD EndAddress
     * }
     */
    public static final long EndAddress$offset() {
        return EndAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD EndAddress
     * }
     */
    public static int EndAddress(MemorySegment struct) {
        return struct.get(EndAddress$LAYOUT, EndAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD EndAddress
     * }
     */
    public static void EndAddress(MemorySegment struct, int fieldValue) {
        struct.set(EndAddress$LAYOUT, EndAddress$OFFSET, fieldValue);
    }

    private static final OfInt UnwindInfoAddress$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$18859:5"), groupElement("UnwindInfoAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD UnwindInfoAddress
     * }
     */
    public static final OfInt UnwindInfoAddress$layout() {
        return UnwindInfoAddress$LAYOUT;
    }

    private static final long UnwindInfoAddress$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD UnwindInfoAddress
     * }
     */
    public static final long UnwindInfoAddress$offset() {
        return UnwindInfoAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD UnwindInfoAddress
     * }
     */
    public static int UnwindInfoAddress(MemorySegment struct) {
        return struct.get(UnwindInfoAddress$LAYOUT, UnwindInfoAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD UnwindInfoAddress
     * }
     */
    public static void UnwindInfoAddress(MemorySegment struct, int fieldValue) {
        struct.set(UnwindInfoAddress$LAYOUT, UnwindInfoAddress$OFFSET, fieldValue);
    }

    private static final OfInt UnwindData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$18859:5"), groupElement("UnwindData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD UnwindData
     * }
     */
    public static final OfInt UnwindData$layout() {
        return UnwindData$LAYOUT;
    }

    private static final long UnwindData$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD UnwindData
     * }
     */
    public static final long UnwindData$offset() {
        return UnwindData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD UnwindData
     * }
     */
    public static int UnwindData(MemorySegment struct) {
        return struct.get(UnwindData$LAYOUT, UnwindData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD UnwindData
     * }
     */
    public static void UnwindData(MemorySegment struct, int fieldValue) {
        struct.set(UnwindData$LAYOUT, UnwindData$OFFSET, fieldValue);
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

