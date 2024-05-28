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
 * struct __BCRYPT_KEY_LENGTHS_STRUCT {
 *     ULONG dwMinLength;
 *     ULONG dwMaxLength;
 *     ULONG dwIncrement;
 * }
 * }
 */
public class __BCRYPT_KEY_LENGTHS_STRUCT {

    __BCRYPT_KEY_LENGTHS_STRUCT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwMinLength"),
        wgl_h.C_LONG.withName("dwMaxLength"),
        wgl_h.C_LONG.withName("dwIncrement")
    ).withName("__BCRYPT_KEY_LENGTHS_STRUCT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwMinLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMinLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwMinLength
     * }
     */
    public static final OfInt dwMinLength$layout() {
        return dwMinLength$LAYOUT;
    }

    private static final long dwMinLength$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwMinLength
     * }
     */
    public static final long dwMinLength$offset() {
        return dwMinLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwMinLength
     * }
     */
    public static int dwMinLength(MemorySegment struct) {
        return struct.get(dwMinLength$LAYOUT, dwMinLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwMinLength
     * }
     */
    public static void dwMinLength(MemorySegment struct, int fieldValue) {
        struct.set(dwMinLength$LAYOUT, dwMinLength$OFFSET, fieldValue);
    }

    private static final OfInt dwMaxLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMaxLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwMaxLength
     * }
     */
    public static final OfInt dwMaxLength$layout() {
        return dwMaxLength$LAYOUT;
    }

    private static final long dwMaxLength$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwMaxLength
     * }
     */
    public static final long dwMaxLength$offset() {
        return dwMaxLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwMaxLength
     * }
     */
    public static int dwMaxLength(MemorySegment struct) {
        return struct.get(dwMaxLength$LAYOUT, dwMaxLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwMaxLength
     * }
     */
    public static void dwMaxLength(MemorySegment struct, int fieldValue) {
        struct.set(dwMaxLength$LAYOUT, dwMaxLength$OFFSET, fieldValue);
    }

    private static final OfInt dwIncrement$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwIncrement"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwIncrement
     * }
     */
    public static final OfInt dwIncrement$layout() {
        return dwIncrement$LAYOUT;
    }

    private static final long dwIncrement$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwIncrement
     * }
     */
    public static final long dwIncrement$offset() {
        return dwIncrement$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwIncrement
     * }
     */
    public static int dwIncrement(MemorySegment struct) {
        return struct.get(dwIncrement$LAYOUT, dwIncrement$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwIncrement
     * }
     */
    public static void dwIncrement(MemorySegment struct, int fieldValue) {
        struct.set(dwIncrement$LAYOUT, dwIncrement$OFFSET, fieldValue);
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

