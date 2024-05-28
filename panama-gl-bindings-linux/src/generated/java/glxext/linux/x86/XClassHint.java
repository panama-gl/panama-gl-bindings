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
 *     char *res_name;
 *     char *res_class;
 * }
 * }
 */
public class XClassHint {

    XClassHint() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        glxext_h.C_POINTER.withName("res_name"),
        glxext_h.C_POINTER.withName("res_class")
    ).withName("$anon$189:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout res_name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("res_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *res_name
     * }
     */
    public static final AddressLayout res_name$layout() {
        return res_name$LAYOUT;
    }

    private static final long res_name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *res_name
     * }
     */
    public static final long res_name$offset() {
        return res_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *res_name
     * }
     */
    public static MemorySegment res_name(MemorySegment struct) {
        return struct.get(res_name$LAYOUT, res_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *res_name
     * }
     */
    public static void res_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(res_name$LAYOUT, res_name$OFFSET, fieldValue);
    }

    private static final AddressLayout res_class$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("res_class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *res_class
     * }
     */
    public static final AddressLayout res_class$layout() {
        return res_class$LAYOUT;
    }

    private static final long res_class$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *res_class
     * }
     */
    public static final long res_class$offset() {
        return res_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *res_class
     * }
     */
    public static MemorySegment res_class(MemorySegment struct) {
        return struct.get(res_class$LAYOUT, res_class$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *res_class
     * }
     */
    public static void res_class(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(res_class$LAYOUT, res_class$OFFSET, fieldValue);
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

