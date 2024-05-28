// Generated by jextract

package freeglut.windows.x86;

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
 * struct _ENLISTMENT_BASIC_INFORMATION {
 *     GUID EnlistmentId;
 *     GUID TransactionId;
 *     GUID ResourceManagerId;
 * }
 * }
 */
public class _ENLISTMENT_BASIC_INFORMATION {

    _ENLISTMENT_BASIC_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GUID.layout().withName("EnlistmentId"),
        _GUID.layout().withName("TransactionId"),
        _GUID.layout().withName("ResourceManagerId")
    ).withName("_ENLISTMENT_BASIC_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout EnlistmentId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("EnlistmentId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID EnlistmentId
     * }
     */
    public static final GroupLayout EnlistmentId$layout() {
        return EnlistmentId$LAYOUT;
    }

    private static final long EnlistmentId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID EnlistmentId
     * }
     */
    public static final long EnlistmentId$offset() {
        return EnlistmentId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID EnlistmentId
     * }
     */
    public static MemorySegment EnlistmentId(MemorySegment struct) {
        return struct.asSlice(EnlistmentId$OFFSET, EnlistmentId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID EnlistmentId
     * }
     */
    public static void EnlistmentId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, EnlistmentId$OFFSET, EnlistmentId$LAYOUT.byteSize());
    }

    private static final GroupLayout TransactionId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("TransactionId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID TransactionId
     * }
     */
    public static final GroupLayout TransactionId$layout() {
        return TransactionId$LAYOUT;
    }

    private static final long TransactionId$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID TransactionId
     * }
     */
    public static final long TransactionId$offset() {
        return TransactionId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID TransactionId
     * }
     */
    public static MemorySegment TransactionId(MemorySegment struct) {
        return struct.asSlice(TransactionId$OFFSET, TransactionId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID TransactionId
     * }
     */
    public static void TransactionId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TransactionId$OFFSET, TransactionId$LAYOUT.byteSize());
    }

    private static final GroupLayout ResourceManagerId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ResourceManagerId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID ResourceManagerId
     * }
     */
    public static final GroupLayout ResourceManagerId$layout() {
        return ResourceManagerId$LAYOUT;
    }

    private static final long ResourceManagerId$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID ResourceManagerId
     * }
     */
    public static final long ResourceManagerId$offset() {
        return ResourceManagerId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID ResourceManagerId
     * }
     */
    public static MemorySegment ResourceManagerId(MemorySegment struct) {
        return struct.asSlice(ResourceManagerId$OFFSET, ResourceManagerId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID ResourceManagerId
     * }
     */
    public static void ResourceManagerId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ResourceManagerId$OFFSET, ResourceManagerId$LAYOUT.byteSize());
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

