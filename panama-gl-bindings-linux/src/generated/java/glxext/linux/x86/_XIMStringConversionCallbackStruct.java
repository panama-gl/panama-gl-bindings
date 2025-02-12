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
 * struct _XIMStringConversionCallbackStruct {
 *     XIMStringConversionPosition position;
 *     XIMCaretDirection direction;
 *     XIMStringConversionOperation operation;
 *     unsigned short factor;
 *     XIMStringConversionText *text;
 * }
 * }
 */
public class _XIMStringConversionCallbackStruct {

    _XIMStringConversionCallbackStruct() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glxext_h.C_SHORT.withName("position"),
        MemoryLayout.paddingLayout(2),
        glxext_h.C_INT.withName("direction"),
        glxext_h.C_SHORT.withName("operation"),
        glxext_h.C_SHORT.withName("factor"),
        MemoryLayout.paddingLayout(4),
        glxext_h.C_POINTER.withName("text")
    ).withName("_XIMStringConversionCallbackStruct");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort position$LAYOUT = (OfShort)$LAYOUT.select(groupElement("position"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XIMStringConversionPosition position
     * }
     */
    public static final OfShort position$layout() {
        return position$LAYOUT;
    }

    private static final long position$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XIMStringConversionPosition position
     * }
     */
    public static final long position$offset() {
        return position$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XIMStringConversionPosition position
     * }
     */
    public static short position(MemorySegment struct) {
        return struct.get(position$LAYOUT, position$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XIMStringConversionPosition position
     * }
     */
    public static void position(MemorySegment struct, short fieldValue) {
        struct.set(position$LAYOUT, position$OFFSET, fieldValue);
    }

    private static final OfInt direction$LAYOUT = (OfInt)$LAYOUT.select(groupElement("direction"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XIMCaretDirection direction
     * }
     */
    public static final OfInt direction$layout() {
        return direction$LAYOUT;
    }

    private static final long direction$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XIMCaretDirection direction
     * }
     */
    public static final long direction$offset() {
        return direction$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XIMCaretDirection direction
     * }
     */
    public static int direction(MemorySegment struct) {
        return struct.get(direction$LAYOUT, direction$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XIMCaretDirection direction
     * }
     */
    public static void direction(MemorySegment struct, int fieldValue) {
        struct.set(direction$LAYOUT, direction$OFFSET, fieldValue);
    }

    private static final OfShort operation$LAYOUT = (OfShort)$LAYOUT.select(groupElement("operation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XIMStringConversionOperation operation
     * }
     */
    public static final OfShort operation$layout() {
        return operation$LAYOUT;
    }

    private static final long operation$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XIMStringConversionOperation operation
     * }
     */
    public static final long operation$offset() {
        return operation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XIMStringConversionOperation operation
     * }
     */
    public static short operation(MemorySegment struct) {
        return struct.get(operation$LAYOUT, operation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XIMStringConversionOperation operation
     * }
     */
    public static void operation(MemorySegment struct, short fieldValue) {
        struct.set(operation$LAYOUT, operation$OFFSET, fieldValue);
    }

    private static final OfShort factor$LAYOUT = (OfShort)$LAYOUT.select(groupElement("factor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short factor
     * }
     */
    public static final OfShort factor$layout() {
        return factor$LAYOUT;
    }

    private static final long factor$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short factor
     * }
     */
    public static final long factor$offset() {
        return factor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short factor
     * }
     */
    public static short factor(MemorySegment struct) {
        return struct.get(factor$LAYOUT, factor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short factor
     * }
     */
    public static void factor(MemorySegment struct, short fieldValue) {
        struct.set(factor$LAYOUT, factor$OFFSET, fieldValue);
    }

    private static final AddressLayout text$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("text"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XIMStringConversionText *text
     * }
     */
    public static final AddressLayout text$layout() {
        return text$LAYOUT;
    }

    private static final long text$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XIMStringConversionText *text
     * }
     */
    public static final long text$offset() {
        return text$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XIMStringConversionText *text
     * }
     */
    public static MemorySegment text(MemorySegment struct) {
        return struct.get(text$LAYOUT, text$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XIMStringConversionText *text
     * }
     */
    public static void text(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(text$LAYOUT, text$OFFSET, fieldValue);
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

