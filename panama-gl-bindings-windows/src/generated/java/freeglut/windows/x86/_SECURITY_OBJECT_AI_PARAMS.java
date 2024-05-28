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
 * struct _SECURITY_OBJECT_AI_PARAMS {
 *     DWORD Size;
 *     DWORD ConstraintMask;
 * }
 * }
 */
public class _SECURITY_OBJECT_AI_PARAMS {

    _SECURITY_OBJECT_AI_PARAMS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("Size"),
        freeglut_h.C_LONG.withName("ConstraintMask")
    ).withName("_SECURITY_OBJECT_AI_PARAMS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final OfInt ConstraintMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ConstraintMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ConstraintMask
     * }
     */
    public static final OfInt ConstraintMask$layout() {
        return ConstraintMask$LAYOUT;
    }

    private static final long ConstraintMask$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ConstraintMask
     * }
     */
    public static final long ConstraintMask$offset() {
        return ConstraintMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ConstraintMask
     * }
     */
    public static int ConstraintMask(MemorySegment struct) {
        return struct.get(ConstraintMask$LAYOUT, ConstraintMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ConstraintMask
     * }
     */
    public static void ConstraintMask(MemorySegment struct, int fieldValue) {
        struct.set(ConstraintMask$LAYOUT, ConstraintMask$OFFSET, fieldValue);
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

