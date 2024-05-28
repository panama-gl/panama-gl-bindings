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
 * struct _CMC_RESPONSE_INFO {
 *     DWORD cTaggedAttribute;
 *     PCMC_TAGGED_ATTRIBUTE rgTaggedAttribute;
 *     DWORD cTaggedContentInfo;
 *     PCMC_TAGGED_CONTENT_INFO rgTaggedContentInfo;
 *     DWORD cTaggedOtherMsg;
 *     PCMC_TAGGED_OTHER_MSG rgTaggedOtherMsg;
 * }
 * }
 */
public class _CMC_RESPONSE_INFO {

    _CMC_RESPONSE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cTaggedAttribute"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgTaggedAttribute"),
        wgl_h.C_LONG.withName("cTaggedContentInfo"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgTaggedContentInfo"),
        wgl_h.C_LONG.withName("cTaggedOtherMsg"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("rgTaggedOtherMsg")
    ).withName("_CMC_RESPONSE_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cTaggedAttribute$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cTaggedAttribute"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cTaggedAttribute
     * }
     */
    public static final OfInt cTaggedAttribute$layout() {
        return cTaggedAttribute$LAYOUT;
    }

    private static final long cTaggedAttribute$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cTaggedAttribute
     * }
     */
    public static final long cTaggedAttribute$offset() {
        return cTaggedAttribute$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cTaggedAttribute
     * }
     */
    public static int cTaggedAttribute(MemorySegment struct) {
        return struct.get(cTaggedAttribute$LAYOUT, cTaggedAttribute$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cTaggedAttribute
     * }
     */
    public static void cTaggedAttribute(MemorySegment struct, int fieldValue) {
        struct.set(cTaggedAttribute$LAYOUT, cTaggedAttribute$OFFSET, fieldValue);
    }

    private static final AddressLayout rgTaggedAttribute$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgTaggedAttribute"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCMC_TAGGED_ATTRIBUTE rgTaggedAttribute
     * }
     */
    public static final AddressLayout rgTaggedAttribute$layout() {
        return rgTaggedAttribute$LAYOUT;
    }

    private static final long rgTaggedAttribute$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCMC_TAGGED_ATTRIBUTE rgTaggedAttribute
     * }
     */
    public static final long rgTaggedAttribute$offset() {
        return rgTaggedAttribute$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCMC_TAGGED_ATTRIBUTE rgTaggedAttribute
     * }
     */
    public static MemorySegment rgTaggedAttribute(MemorySegment struct) {
        return struct.get(rgTaggedAttribute$LAYOUT, rgTaggedAttribute$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCMC_TAGGED_ATTRIBUTE rgTaggedAttribute
     * }
     */
    public static void rgTaggedAttribute(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgTaggedAttribute$LAYOUT, rgTaggedAttribute$OFFSET, fieldValue);
    }

    private static final OfInt cTaggedContentInfo$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cTaggedContentInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cTaggedContentInfo
     * }
     */
    public static final OfInt cTaggedContentInfo$layout() {
        return cTaggedContentInfo$LAYOUT;
    }

    private static final long cTaggedContentInfo$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cTaggedContentInfo
     * }
     */
    public static final long cTaggedContentInfo$offset() {
        return cTaggedContentInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cTaggedContentInfo
     * }
     */
    public static int cTaggedContentInfo(MemorySegment struct) {
        return struct.get(cTaggedContentInfo$LAYOUT, cTaggedContentInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cTaggedContentInfo
     * }
     */
    public static void cTaggedContentInfo(MemorySegment struct, int fieldValue) {
        struct.set(cTaggedContentInfo$LAYOUT, cTaggedContentInfo$OFFSET, fieldValue);
    }

    private static final AddressLayout rgTaggedContentInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgTaggedContentInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCMC_TAGGED_CONTENT_INFO rgTaggedContentInfo
     * }
     */
    public static final AddressLayout rgTaggedContentInfo$layout() {
        return rgTaggedContentInfo$LAYOUT;
    }

    private static final long rgTaggedContentInfo$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCMC_TAGGED_CONTENT_INFO rgTaggedContentInfo
     * }
     */
    public static final long rgTaggedContentInfo$offset() {
        return rgTaggedContentInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCMC_TAGGED_CONTENT_INFO rgTaggedContentInfo
     * }
     */
    public static MemorySegment rgTaggedContentInfo(MemorySegment struct) {
        return struct.get(rgTaggedContentInfo$LAYOUT, rgTaggedContentInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCMC_TAGGED_CONTENT_INFO rgTaggedContentInfo
     * }
     */
    public static void rgTaggedContentInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgTaggedContentInfo$LAYOUT, rgTaggedContentInfo$OFFSET, fieldValue);
    }

    private static final OfInt cTaggedOtherMsg$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cTaggedOtherMsg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cTaggedOtherMsg
     * }
     */
    public static final OfInt cTaggedOtherMsg$layout() {
        return cTaggedOtherMsg$LAYOUT;
    }

    private static final long cTaggedOtherMsg$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cTaggedOtherMsg
     * }
     */
    public static final long cTaggedOtherMsg$offset() {
        return cTaggedOtherMsg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cTaggedOtherMsg
     * }
     */
    public static int cTaggedOtherMsg(MemorySegment struct) {
        return struct.get(cTaggedOtherMsg$LAYOUT, cTaggedOtherMsg$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cTaggedOtherMsg
     * }
     */
    public static void cTaggedOtherMsg(MemorySegment struct, int fieldValue) {
        struct.set(cTaggedOtherMsg$LAYOUT, cTaggedOtherMsg$OFFSET, fieldValue);
    }

    private static final AddressLayout rgTaggedOtherMsg$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgTaggedOtherMsg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCMC_TAGGED_OTHER_MSG rgTaggedOtherMsg
     * }
     */
    public static final AddressLayout rgTaggedOtherMsg$layout() {
        return rgTaggedOtherMsg$LAYOUT;
    }

    private static final long rgTaggedOtherMsg$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCMC_TAGGED_OTHER_MSG rgTaggedOtherMsg
     * }
     */
    public static final long rgTaggedOtherMsg$offset() {
        return rgTaggedOtherMsg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCMC_TAGGED_OTHER_MSG rgTaggedOtherMsg
     * }
     */
    public static MemorySegment rgTaggedOtherMsg(MemorySegment struct) {
        return struct.get(rgTaggedOtherMsg$LAYOUT, rgTaggedOtherMsg$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCMC_TAGGED_OTHER_MSG rgTaggedOtherMsg
     * }
     */
    public static void rgTaggedOtherMsg(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgTaggedOtherMsg$LAYOUT, rgTaggedOtherMsg$OFFSET, fieldValue);
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

