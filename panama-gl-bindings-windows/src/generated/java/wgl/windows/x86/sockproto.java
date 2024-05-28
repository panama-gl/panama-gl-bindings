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
 * struct sockproto {
 *     u_short sp_family;
 *     u_short sp_protocol;
 * }
 * }
 */
public class sockproto {

    sockproto() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_SHORT.withName("sp_family"),
        wgl_h.C_SHORT.withName("sp_protocol")
    ).withName("sockproto");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort sp_family$LAYOUT = (OfShort)$LAYOUT.select(groupElement("sp_family"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * u_short sp_family
     * }
     */
    public static final OfShort sp_family$layout() {
        return sp_family$LAYOUT;
    }

    private static final long sp_family$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * u_short sp_family
     * }
     */
    public static final long sp_family$offset() {
        return sp_family$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * u_short sp_family
     * }
     */
    public static short sp_family(MemorySegment struct) {
        return struct.get(sp_family$LAYOUT, sp_family$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * u_short sp_family
     * }
     */
    public static void sp_family(MemorySegment struct, short fieldValue) {
        struct.set(sp_family$LAYOUT, sp_family$OFFSET, fieldValue);
    }

    private static final OfShort sp_protocol$LAYOUT = (OfShort)$LAYOUT.select(groupElement("sp_protocol"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * u_short sp_protocol
     * }
     */
    public static final OfShort sp_protocol$layout() {
        return sp_protocol$LAYOUT;
    }

    private static final long sp_protocol$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * u_short sp_protocol
     * }
     */
    public static final long sp_protocol$offset() {
        return sp_protocol$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * u_short sp_protocol
     * }
     */
    public static short sp_protocol(MemorySegment struct) {
        return struct.get(sp_protocol$LAYOUT, sp_protocol$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * u_short sp_protocol
     * }
     */
    public static void sp_protocol(MemorySegment struct, short fieldValue) {
        struct.set(sp_protocol$LAYOUT, sp_protocol$OFFSET, fieldValue);
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

