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
 * struct _CMSG_STREAM_INFO {
 *     DWORD cbContent;
 *     PFN_CMSG_STREAM_OUTPUT pfnStreamOutput;
 *     void *pvArg;
 * }
 * }
 */
public class _CMSG_STREAM_INFO {

    _CMSG_STREAM_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cbContent"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("pfnStreamOutput"),
        wgl_h.C_POINTER.withName("pvArg")
    ).withName("_CMSG_STREAM_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbContent$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbContent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbContent
     * }
     */
    public static final OfInt cbContent$layout() {
        return cbContent$LAYOUT;
    }

    private static final long cbContent$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbContent
     * }
     */
    public static final long cbContent$offset() {
        return cbContent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbContent
     * }
     */
    public static int cbContent(MemorySegment struct) {
        return struct.get(cbContent$LAYOUT, cbContent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbContent
     * }
     */
    public static void cbContent(MemorySegment struct, int fieldValue) {
        struct.set(cbContent$LAYOUT, cbContent$OFFSET, fieldValue);
    }

    private static final AddressLayout pfnStreamOutput$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pfnStreamOutput"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PFN_CMSG_STREAM_OUTPUT pfnStreamOutput
     * }
     */
    public static final AddressLayout pfnStreamOutput$layout() {
        return pfnStreamOutput$LAYOUT;
    }

    private static final long pfnStreamOutput$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PFN_CMSG_STREAM_OUTPUT pfnStreamOutput
     * }
     */
    public static final long pfnStreamOutput$offset() {
        return pfnStreamOutput$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PFN_CMSG_STREAM_OUTPUT pfnStreamOutput
     * }
     */
    public static MemorySegment pfnStreamOutput(MemorySegment struct) {
        return struct.get(pfnStreamOutput$LAYOUT, pfnStreamOutput$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PFN_CMSG_STREAM_OUTPUT pfnStreamOutput
     * }
     */
    public static void pfnStreamOutput(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pfnStreamOutput$LAYOUT, pfnStreamOutput$OFFSET, fieldValue);
    }

    private static final AddressLayout pvArg$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvArg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *pvArg
     * }
     */
    public static final AddressLayout pvArg$layout() {
        return pvArg$LAYOUT;
    }

    private static final long pvArg$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pvArg
     * }
     */
    public static final long pvArg$offset() {
        return pvArg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pvArg
     * }
     */
    public static MemorySegment pvArg(MemorySegment struct) {
        return struct.get(pvArg$LAYOUT, pvArg$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pvArg
     * }
     */
    public static void pvArg(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvArg$LAYOUT, pvArg$OFFSET, fieldValue);
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

