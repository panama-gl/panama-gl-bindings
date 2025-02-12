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
 *     int channel;
 *     unsigned int participationType;
 *     int timeSlice;
 * }
 * }
 */
public class GLXHyperpipeConfigSGIX {

    GLXHyperpipeConfigSGIX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(80, glxext_h.C_CHAR).withName("pipeName"),
        glxext_h.C_INT.withName("channel"),
        glxext_h.C_INT.withName("participationType"),
        glxext_h.C_INT.withName("timeSlice")
    ).withName("$anon$772:9");

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

    private static final OfInt channel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("channel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int channel
     * }
     */
    public static final OfInt channel$layout() {
        return channel$LAYOUT;
    }

    private static final long channel$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int channel
     * }
     */
    public static final long channel$offset() {
        return channel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int channel
     * }
     */
    public static int channel(MemorySegment struct) {
        return struct.get(channel$LAYOUT, channel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int channel
     * }
     */
    public static void channel(MemorySegment struct, int fieldValue) {
        struct.set(channel$LAYOUT, channel$OFFSET, fieldValue);
    }

    private static final OfInt participationType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("participationType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int participationType
     * }
     */
    public static final OfInt participationType$layout() {
        return participationType$LAYOUT;
    }

    private static final long participationType$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int participationType
     * }
     */
    public static final long participationType$offset() {
        return participationType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int participationType
     * }
     */
    public static int participationType(MemorySegment struct) {
        return struct.get(participationType$LAYOUT, participationType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int participationType
     * }
     */
    public static void participationType(MemorySegment struct, int fieldValue) {
        struct.set(participationType$LAYOUT, participationType$OFFSET, fieldValue);
    }

    private static final OfInt timeSlice$LAYOUT = (OfInt)$LAYOUT.select(groupElement("timeSlice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int timeSlice
     * }
     */
    public static final OfInt timeSlice$layout() {
        return timeSlice$LAYOUT;
    }

    private static final long timeSlice$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int timeSlice
     * }
     */
    public static final long timeSlice$offset() {
        return timeSlice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int timeSlice
     * }
     */
    public static int timeSlice(MemorySegment struct) {
        return struct.get(timeSlice$LAYOUT, timeSlice$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int timeSlice
     * }
     */
    public static void timeSlice(MemorySegment struct, int fieldValue) {
        struct.set(timeSlice$LAYOUT, timeSlice$OFFSET, fieldValue);
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

