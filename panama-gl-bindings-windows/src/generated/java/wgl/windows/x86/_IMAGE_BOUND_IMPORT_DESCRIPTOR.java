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
 * struct _IMAGE_BOUND_IMPORT_DESCRIPTOR {
 *     DWORD TimeDateStamp;
 *     WORD OffsetModuleName;
 *     WORD NumberOfModuleForwarderRefs;
 * }
 * }
 */
public class _IMAGE_BOUND_IMPORT_DESCRIPTOR {

    _IMAGE_BOUND_IMPORT_DESCRIPTOR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("TimeDateStamp"),
        wgl_h.C_SHORT.withName("OffsetModuleName"),
        wgl_h.C_SHORT.withName("NumberOfModuleForwarderRefs")
    ).withName("_IMAGE_BOUND_IMPORT_DESCRIPTOR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt TimeDateStamp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TimeDateStamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static final OfInt TimeDateStamp$layout() {
        return TimeDateStamp$LAYOUT;
    }

    private static final long TimeDateStamp$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static final long TimeDateStamp$offset() {
        return TimeDateStamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static int TimeDateStamp(MemorySegment struct) {
        return struct.get(TimeDateStamp$LAYOUT, TimeDateStamp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static void TimeDateStamp(MemorySegment struct, int fieldValue) {
        struct.set(TimeDateStamp$LAYOUT, TimeDateStamp$OFFSET, fieldValue);
    }

    private static final OfShort OffsetModuleName$LAYOUT = (OfShort)$LAYOUT.select(groupElement("OffsetModuleName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD OffsetModuleName
     * }
     */
    public static final OfShort OffsetModuleName$layout() {
        return OffsetModuleName$LAYOUT;
    }

    private static final long OffsetModuleName$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD OffsetModuleName
     * }
     */
    public static final long OffsetModuleName$offset() {
        return OffsetModuleName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD OffsetModuleName
     * }
     */
    public static short OffsetModuleName(MemorySegment struct) {
        return struct.get(OffsetModuleName$LAYOUT, OffsetModuleName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD OffsetModuleName
     * }
     */
    public static void OffsetModuleName(MemorySegment struct, short fieldValue) {
        struct.set(OffsetModuleName$LAYOUT, OffsetModuleName$OFFSET, fieldValue);
    }

    private static final OfShort NumberOfModuleForwarderRefs$LAYOUT = (OfShort)$LAYOUT.select(groupElement("NumberOfModuleForwarderRefs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD NumberOfModuleForwarderRefs
     * }
     */
    public static final OfShort NumberOfModuleForwarderRefs$layout() {
        return NumberOfModuleForwarderRefs$LAYOUT;
    }

    private static final long NumberOfModuleForwarderRefs$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD NumberOfModuleForwarderRefs
     * }
     */
    public static final long NumberOfModuleForwarderRefs$offset() {
        return NumberOfModuleForwarderRefs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD NumberOfModuleForwarderRefs
     * }
     */
    public static short NumberOfModuleForwarderRefs(MemorySegment struct) {
        return struct.get(NumberOfModuleForwarderRefs$LAYOUT, NumberOfModuleForwarderRefs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD NumberOfModuleForwarderRefs
     * }
     */
    public static void NumberOfModuleForwarderRefs(MemorySegment struct, short fieldValue) {
        struct.set(NumberOfModuleForwarderRefs$LAYOUT, NumberOfModuleForwarderRefs$OFFSET, fieldValue);
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

