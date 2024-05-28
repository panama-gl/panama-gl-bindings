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
 * struct _STARTUPINFOEXW {
 *     STARTUPINFOW StartupInfo;
 *     LPPROC_THREAD_ATTRIBUTE_LIST lpAttributeList;
 * }
 * }
 */
public class _STARTUPINFOEXW {

    _STARTUPINFOEXW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _STARTUPINFOW.layout().withName("StartupInfo"),
        wgl_h.C_POINTER.withName("lpAttributeList")
    ).withName("_STARTUPINFOEXW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout StartupInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("StartupInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * STARTUPINFOW StartupInfo
     * }
     */
    public static final GroupLayout StartupInfo$layout() {
        return StartupInfo$LAYOUT;
    }

    private static final long StartupInfo$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * STARTUPINFOW StartupInfo
     * }
     */
    public static final long StartupInfo$offset() {
        return StartupInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * STARTUPINFOW StartupInfo
     * }
     */
    public static MemorySegment StartupInfo(MemorySegment struct) {
        return struct.asSlice(StartupInfo$OFFSET, StartupInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * STARTUPINFOW StartupInfo
     * }
     */
    public static void StartupInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StartupInfo$OFFSET, StartupInfo$LAYOUT.byteSize());
    }

    private static final AddressLayout lpAttributeList$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpAttributeList"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPPROC_THREAD_ATTRIBUTE_LIST lpAttributeList
     * }
     */
    public static final AddressLayout lpAttributeList$layout() {
        return lpAttributeList$LAYOUT;
    }

    private static final long lpAttributeList$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPPROC_THREAD_ATTRIBUTE_LIST lpAttributeList
     * }
     */
    public static final long lpAttributeList$offset() {
        return lpAttributeList$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPPROC_THREAD_ATTRIBUTE_LIST lpAttributeList
     * }
     */
    public static MemorySegment lpAttributeList(MemorySegment struct) {
        return struct.get(lpAttributeList$LAYOUT, lpAttributeList$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPPROC_THREAD_ATTRIBUTE_LIST lpAttributeList
     * }
     */
    public static void lpAttributeList(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpAttributeList$LAYOUT, lpAttributeList$OFFSET, fieldValue);
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

