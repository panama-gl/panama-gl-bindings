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
 * struct tagCUSTDATAITEM {
 *     GUID guid;
 *     VARIANTARG varValue;
 * }
 * }
 */
public class tagCUSTDATAITEM {

    tagCUSTDATAITEM() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GUID.layout().withName("guid"),
        tagVARIANT.layout().withName("varValue")
    ).withName("tagCUSTDATAITEM");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout guid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("guid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID guid
     * }
     */
    public static final GroupLayout guid$layout() {
        return guid$LAYOUT;
    }

    private static final long guid$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID guid
     * }
     */
    public static final long guid$offset() {
        return guid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID guid
     * }
     */
    public static MemorySegment guid(MemorySegment struct) {
        return struct.asSlice(guid$OFFSET, guid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID guid
     * }
     */
    public static void guid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, guid$OFFSET, guid$LAYOUT.byteSize());
    }

    private static final GroupLayout varValue$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("varValue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VARIANTARG varValue
     * }
     */
    public static final GroupLayout varValue$layout() {
        return varValue$LAYOUT;
    }

    private static final long varValue$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VARIANTARG varValue
     * }
     */
    public static final long varValue$offset() {
        return varValue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VARIANTARG varValue
     * }
     */
    public static MemorySegment varValue(MemorySegment struct) {
        return struct.asSlice(varValue$OFFSET, varValue$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VARIANTARG varValue
     * }
     */
    public static void varValue(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, varValue$OFFSET, varValue$LAYOUT.byteSize());
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

