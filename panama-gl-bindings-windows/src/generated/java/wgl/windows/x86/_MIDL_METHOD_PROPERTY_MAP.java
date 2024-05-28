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
 * struct _MIDL_METHOD_PROPERTY_MAP {
 *     unsigned long Count;
 *     const MIDL_METHOD_PROPERTY *Properties;
 * }
 * }
 */
public class _MIDL_METHOD_PROPERTY_MAP {

    _MIDL_METHOD_PROPERTY_MAP() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("Count"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("Properties")
    ).withName("_MIDL_METHOD_PROPERTY_MAP");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long Count
     * }
     */
    public static final OfInt Count$layout() {
        return Count$LAYOUT;
    }

    private static final long Count$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long Count
     * }
     */
    public static final long Count$offset() {
        return Count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long Count
     * }
     */
    public static int Count(MemorySegment struct) {
        return struct.get(Count$LAYOUT, Count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long Count
     * }
     */
    public static void Count(MemorySegment struct, int fieldValue) {
        struct.set(Count$LAYOUT, Count$OFFSET, fieldValue);
    }

    private static final AddressLayout Properties$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Properties"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const MIDL_METHOD_PROPERTY *Properties
     * }
     */
    public static final AddressLayout Properties$layout() {
        return Properties$LAYOUT;
    }

    private static final long Properties$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const MIDL_METHOD_PROPERTY *Properties
     * }
     */
    public static final long Properties$offset() {
        return Properties$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const MIDL_METHOD_PROPERTY *Properties
     * }
     */
    public static MemorySegment Properties(MemorySegment struct) {
        return struct.get(Properties$LAYOUT, Properties$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const MIDL_METHOD_PROPERTY *Properties
     * }
     */
    public static void Properties(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Properties$LAYOUT, Properties$OFFSET, fieldValue);
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

