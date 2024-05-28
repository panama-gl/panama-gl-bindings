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
 * struct _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT {
 *     ULONG MarshalCookie;
 *     GUID UOW;
 * }
 * }
 */
public class _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT {

    _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("MarshalCookie"),
        _GUID.layout().withName("UOW")
    ).withName("_TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt MarshalCookie$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MarshalCookie"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG MarshalCookie
     * }
     */
    public static final OfInt MarshalCookie$layout() {
        return MarshalCookie$LAYOUT;
    }

    private static final long MarshalCookie$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG MarshalCookie
     * }
     */
    public static final long MarshalCookie$offset() {
        return MarshalCookie$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG MarshalCookie
     * }
     */
    public static int MarshalCookie(MemorySegment struct) {
        return struct.get(MarshalCookie$LAYOUT, MarshalCookie$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG MarshalCookie
     * }
     */
    public static void MarshalCookie(MemorySegment struct, int fieldValue) {
        struct.set(MarshalCookie$LAYOUT, MarshalCookie$OFFSET, fieldValue);
    }

    private static final GroupLayout UOW$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("UOW"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID UOW
     * }
     */
    public static final GroupLayout UOW$layout() {
        return UOW$LAYOUT;
    }

    private static final long UOW$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID UOW
     * }
     */
    public static final long UOW$offset() {
        return UOW$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID UOW
     * }
     */
    public static MemorySegment UOW(MemorySegment struct) {
        return struct.asSlice(UOW$OFFSET, UOW$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID UOW
     * }
     */
    public static void UOW(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, UOW$OFFSET, UOW$LAYOUT.byteSize());
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

