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
 *     int XOrigin;
 *     int YOrigin;
 *     int maxHeight;
 *     int maxWidth;
 * }
 * }
 */
public class GLXPipeRectLimits {

    GLXPipeRectLimits() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(80, glxext_h.C_CHAR).withName("pipeName"),
        glxext_h.C_INT.withName("XOrigin"),
        glxext_h.C_INT.withName("YOrigin"),
        glxext_h.C_INT.withName("maxHeight"),
        glxext_h.C_INT.withName("maxWidth")
    ).withName("$anon$783:9");

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

    private static final OfInt XOrigin$LAYOUT = (OfInt)$LAYOUT.select(groupElement("XOrigin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int XOrigin
     * }
     */
    public static final OfInt XOrigin$layout() {
        return XOrigin$LAYOUT;
    }

    private static final long XOrigin$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int XOrigin
     * }
     */
    public static final long XOrigin$offset() {
        return XOrigin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int XOrigin
     * }
     */
    public static int XOrigin(MemorySegment struct) {
        return struct.get(XOrigin$LAYOUT, XOrigin$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int XOrigin
     * }
     */
    public static void XOrigin(MemorySegment struct, int fieldValue) {
        struct.set(XOrigin$LAYOUT, XOrigin$OFFSET, fieldValue);
    }

    private static final OfInt YOrigin$LAYOUT = (OfInt)$LAYOUT.select(groupElement("YOrigin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int YOrigin
     * }
     */
    public static final OfInt YOrigin$layout() {
        return YOrigin$LAYOUT;
    }

    private static final long YOrigin$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int YOrigin
     * }
     */
    public static final long YOrigin$offset() {
        return YOrigin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int YOrigin
     * }
     */
    public static int YOrigin(MemorySegment struct) {
        return struct.get(YOrigin$LAYOUT, YOrigin$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int YOrigin
     * }
     */
    public static void YOrigin(MemorySegment struct, int fieldValue) {
        struct.set(YOrigin$LAYOUT, YOrigin$OFFSET, fieldValue);
    }

    private static final OfInt maxHeight$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxHeight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int maxHeight
     * }
     */
    public static final OfInt maxHeight$layout() {
        return maxHeight$LAYOUT;
    }

    private static final long maxHeight$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int maxHeight
     * }
     */
    public static final long maxHeight$offset() {
        return maxHeight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int maxHeight
     * }
     */
    public static int maxHeight(MemorySegment struct) {
        return struct.get(maxHeight$LAYOUT, maxHeight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int maxHeight
     * }
     */
    public static void maxHeight(MemorySegment struct, int fieldValue) {
        struct.set(maxHeight$LAYOUT, maxHeight$OFFSET, fieldValue);
    }

    private static final OfInt maxWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("maxWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int maxWidth
     * }
     */
    public static final OfInt maxWidth$layout() {
        return maxWidth$LAYOUT;
    }

    private static final long maxWidth$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int maxWidth
     * }
     */
    public static final long maxWidth$offset() {
        return maxWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int maxWidth
     * }
     */
    public static int maxWidth(MemorySegment struct) {
        return struct.get(maxWidth$LAYOUT, maxWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int maxWidth
     * }
     */
    public static void maxWidth(MemorySegment struct, int fieldValue) {
        struct.set(maxWidth$LAYOUT, maxWidth$OFFSET, fieldValue);
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
