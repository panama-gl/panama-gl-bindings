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
 * struct tagWINDOWPLACEMENT {
 *     UINT length;
 *     UINT flags;
 *     UINT showCmd;
 *     POINT ptMinPosition;
 *     POINT ptMaxPosition;
 *     RECT rcNormalPosition;
 * }
 * }
 */
public class tagWINDOWPLACEMENT {

    tagWINDOWPLACEMENT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_INT.withName("length"),
        wgl_h.C_INT.withName("flags"),
        wgl_h.C_INT.withName("showCmd"),
        tagPOINT.layout().withName("ptMinPosition"),
        tagPOINT.layout().withName("ptMaxPosition"),
        tagRECT.layout().withName("rcNormalPosition")
    ).withName("tagWINDOWPLACEMENT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt length$LAYOUT = (OfInt)$LAYOUT.select(groupElement("length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT length
     * }
     */
    public static final OfInt length$layout() {
        return length$LAYOUT;
    }

    private static final long length$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT length
     * }
     */
    public static final long length$offset() {
        return length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT length
     * }
     */
    public static int length(MemorySegment struct) {
        return struct.get(length$LAYOUT, length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT length
     * }
     */
    public static void length(MemorySegment struct, int fieldValue) {
        struct.set(length$LAYOUT, length$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt showCmd$LAYOUT = (OfInt)$LAYOUT.select(groupElement("showCmd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT showCmd
     * }
     */
    public static final OfInt showCmd$layout() {
        return showCmd$LAYOUT;
    }

    private static final long showCmd$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT showCmd
     * }
     */
    public static final long showCmd$offset() {
        return showCmd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT showCmd
     * }
     */
    public static int showCmd(MemorySegment struct) {
        return struct.get(showCmd$LAYOUT, showCmd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT showCmd
     * }
     */
    public static void showCmd(MemorySegment struct, int fieldValue) {
        struct.set(showCmd$LAYOUT, showCmd$OFFSET, fieldValue);
    }

    private static final GroupLayout ptMinPosition$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ptMinPosition"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINT ptMinPosition
     * }
     */
    public static final GroupLayout ptMinPosition$layout() {
        return ptMinPosition$LAYOUT;
    }

    private static final long ptMinPosition$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINT ptMinPosition
     * }
     */
    public static final long ptMinPosition$offset() {
        return ptMinPosition$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINT ptMinPosition
     * }
     */
    public static MemorySegment ptMinPosition(MemorySegment struct) {
        return struct.asSlice(ptMinPosition$OFFSET, ptMinPosition$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINT ptMinPosition
     * }
     */
    public static void ptMinPosition(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ptMinPosition$OFFSET, ptMinPosition$LAYOUT.byteSize());
    }

    private static final GroupLayout ptMaxPosition$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ptMaxPosition"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINT ptMaxPosition
     * }
     */
    public static final GroupLayout ptMaxPosition$layout() {
        return ptMaxPosition$LAYOUT;
    }

    private static final long ptMaxPosition$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINT ptMaxPosition
     * }
     */
    public static final long ptMaxPosition$offset() {
        return ptMaxPosition$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINT ptMaxPosition
     * }
     */
    public static MemorySegment ptMaxPosition(MemorySegment struct) {
        return struct.asSlice(ptMaxPosition$OFFSET, ptMaxPosition$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINT ptMaxPosition
     * }
     */
    public static void ptMaxPosition(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ptMaxPosition$OFFSET, ptMaxPosition$LAYOUT.byteSize());
    }

    private static final GroupLayout rcNormalPosition$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rcNormalPosition"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECT rcNormalPosition
     * }
     */
    public static final GroupLayout rcNormalPosition$layout() {
        return rcNormalPosition$LAYOUT;
    }

    private static final long rcNormalPosition$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECT rcNormalPosition
     * }
     */
    public static final long rcNormalPosition$offset() {
        return rcNormalPosition$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECT rcNormalPosition
     * }
     */
    public static MemorySegment rcNormalPosition(MemorySegment struct) {
        return struct.asSlice(rcNormalPosition$OFFSET, rcNormalPosition$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECT rcNormalPosition
     * }
     */
    public static void rcNormalPosition(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rcNormalPosition$OFFSET, rcNormalPosition$LAYOUT.byteSize());
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

