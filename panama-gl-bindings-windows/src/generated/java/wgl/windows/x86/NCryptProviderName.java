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
 * struct NCryptProviderName {
 *     LPWSTR pszName;
 *     LPWSTR pszComment;
 * }
 * }
 */
public class NCryptProviderName {

    NCryptProviderName() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_POINTER.withName("pszName"),
        wgl_h.C_POINTER.withName("pszComment")
    ).withName("NCryptProviderName");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pszName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pszName
     * }
     */
    public static final AddressLayout pszName$layout() {
        return pszName$LAYOUT;
    }

    private static final long pszName$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pszName
     * }
     */
    public static final long pszName$offset() {
        return pszName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pszName
     * }
     */
    public static MemorySegment pszName(MemorySegment struct) {
        return struct.get(pszName$LAYOUT, pszName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pszName
     * }
     */
    public static void pszName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszName$LAYOUT, pszName$OFFSET, fieldValue);
    }

    private static final AddressLayout pszComment$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszComment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pszComment
     * }
     */
    public static final AddressLayout pszComment$layout() {
        return pszComment$LAYOUT;
    }

    private static final long pszComment$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pszComment
     * }
     */
    public static final long pszComment$offset() {
        return pszComment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pszComment
     * }
     */
    public static MemorySegment pszComment(MemorySegment struct) {
        return struct.get(pszComment$LAYOUT, pszComment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pszComment
     * }
     */
    public static void pszComment(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszComment$LAYOUT, pszComment$OFFSET, fieldValue);
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

