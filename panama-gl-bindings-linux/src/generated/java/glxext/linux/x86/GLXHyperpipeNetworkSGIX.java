// Generated by jextract

package glxext.linux.x86;

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
 * struct {
 *     char pipeName[80];
 *     int networkId;
 * }
 * }
 */
public class GLXHyperpipeNetworkSGIX {

    GLXHyperpipeNetworkSGIX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(80, glxext_h.C_CHAR).withName("pipeName"),
        glxext_h.C_INT.withName("networkId")
    ).withName("$anon$768:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout pipeName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("pipeName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char pipeName[80]
     * }
     */
    public static final SequenceLayout pipeName$layout() {
        return pipeName$LAYOUT;
    }

    private static final long pipeName$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char pipeName[80]
     * }
     */
    public static final long pipeName$offset() {
        return pipeName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char pipeName[80]
     * }
     */
    public static MemorySegment pipeName(MemorySegment struct) {
        return struct.asSlice(pipeName$OFFSET, pipeName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char pipeName[80]
     * }
     */
    public static void pipeName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pipeName$OFFSET, pipeName$LAYOUT.byteSize());
    }

    private static long[] pipeName$DIMS = { 80 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char pipeName[80]
     * }
     */
    public static long[] pipeName$dimensions() {
        return pipeName$DIMS;
    }
    private static final VarHandle pipeName$ELEM_HANDLE = pipeName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char pipeName[80]
     * }
     */
    public static byte pipeName(MemorySegment struct, long index0) {
        return (byte)pipeName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char pipeName[80]
     * }
     */
    public static void pipeName(MemorySegment struct, long index0, byte fieldValue) {
        pipeName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt networkId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("networkId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int networkId
     * }
     */
    public static final OfInt networkId$layout() {
        return networkId$LAYOUT;
    }

    private static final long networkId$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int networkId
     * }
     */
    public static final long networkId$offset() {
        return networkId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int networkId
     * }
     */
    public static int networkId(MemorySegment struct) {
        return struct.get(networkId$LAYOUT, networkId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int networkId
     * }
     */
    public static void networkId(MemorySegment struct, int fieldValue) {
        struct.set(networkId$LAYOUT, networkId$OFFSET, fieldValue);
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

