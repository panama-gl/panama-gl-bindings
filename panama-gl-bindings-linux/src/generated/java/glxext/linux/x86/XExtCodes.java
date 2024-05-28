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
 *     int extension;
 *     int major_opcode;
 *     int first_event;
 *     int first_error;
 * }
 * }
 */
public class XExtCodes {

    XExtCodes() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glxext_h.C_INT.withName("extension"),
        glxext_h.C_INT.withName("major_opcode"),
        glxext_h.C_INT.withName("first_event"),
        glxext_h.C_INT.withName("first_error")
    ).withName("$anon$160:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt extension$LAYOUT = (OfInt)$LAYOUT.select(groupElement("extension"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int extension
     * }
     */
    public static final OfInt extension$layout() {
        return extension$LAYOUT;
    }

    private static final long extension$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int extension
     * }
     */
    public static final long extension$offset() {
        return extension$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int extension
     * }
     */
    public static int extension(MemorySegment struct) {
        return struct.get(extension$LAYOUT, extension$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int extension
     * }
     */
    public static void extension(MemorySegment struct, int fieldValue) {
        struct.set(extension$LAYOUT, extension$OFFSET, fieldValue);
    }

    private static final OfInt major_opcode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("major_opcode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int major_opcode
     * }
     */
    public static final OfInt major_opcode$layout() {
        return major_opcode$LAYOUT;
    }

    private static final long major_opcode$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int major_opcode
     * }
     */
    public static final long major_opcode$offset() {
        return major_opcode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int major_opcode
     * }
     */
    public static int major_opcode(MemorySegment struct) {
        return struct.get(major_opcode$LAYOUT, major_opcode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int major_opcode
     * }
     */
    public static void major_opcode(MemorySegment struct, int fieldValue) {
        struct.set(major_opcode$LAYOUT, major_opcode$OFFSET, fieldValue);
    }

    private static final OfInt first_event$LAYOUT = (OfInt)$LAYOUT.select(groupElement("first_event"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int first_event
     * }
     */
    public static final OfInt first_event$layout() {
        return first_event$LAYOUT;
    }

    private static final long first_event$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int first_event
     * }
     */
    public static final long first_event$offset() {
        return first_event$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int first_event
     * }
     */
    public static int first_event(MemorySegment struct) {
        return struct.get(first_event$LAYOUT, first_event$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int first_event
     * }
     */
    public static void first_event(MemorySegment struct, int fieldValue) {
        struct.set(first_event$LAYOUT, first_event$OFFSET, fieldValue);
    }

    private static final OfInt first_error$LAYOUT = (OfInt)$LAYOUT.select(groupElement("first_error"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int first_error
     * }
     */
    public static final OfInt first_error$layout() {
        return first_error$LAYOUT;
    }

    private static final long first_error$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int first_error
     * }
     */
    public static final long first_error$offset() {
        return first_error$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int first_error
     * }
     */
    public static int first_error(MemorySegment struct) {
        return struct.get(first_error$LAYOUT, first_error$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int first_error
     * }
     */
    public static void first_error(MemorySegment struct, int fieldValue) {
        struct.set(first_error$LAYOUT, first_error$OFFSET, fieldValue);
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

