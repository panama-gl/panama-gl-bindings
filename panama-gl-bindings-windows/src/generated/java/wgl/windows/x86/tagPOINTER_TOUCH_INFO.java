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
 * struct tagPOINTER_TOUCH_INFO {
 *     POINTER_INFO pointerInfo;
 *     TOUCH_FLAGS touchFlags;
 *     TOUCH_MASK touchMask;
 *     RECT rcContact;
 *     RECT rcContactRaw;
 *     UINT32 orientation;
 *     UINT32 pressure;
 * }
 * }
 */
public class tagPOINTER_TOUCH_INFO {

    tagPOINTER_TOUCH_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagPOINTER_INFO.layout().withName("pointerInfo"),
        wgl_h.C_INT.withName("touchFlags"),
        wgl_h.C_INT.withName("touchMask"),
        tagRECT.layout().withName("rcContact"),
        tagRECT.layout().withName("rcContactRaw"),
        wgl_h.C_INT.withName("orientation"),
        wgl_h.C_INT.withName("pressure")
    ).withName("tagPOINTER_TOUCH_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout pointerInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pointerInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTER_INFO pointerInfo
     * }
     */
    public static final GroupLayout pointerInfo$layout() {
        return pointerInfo$LAYOUT;
    }

    private static final long pointerInfo$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTER_INFO pointerInfo
     * }
     */
    public static final long pointerInfo$offset() {
        return pointerInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTER_INFO pointerInfo
     * }
     */
    public static MemorySegment pointerInfo(MemorySegment struct) {
        return struct.asSlice(pointerInfo$OFFSET, pointerInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTER_INFO pointerInfo
     * }
     */
    public static void pointerInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pointerInfo$OFFSET, pointerInfo$LAYOUT.byteSize());
    }

    private static final OfInt touchFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("touchFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TOUCH_FLAGS touchFlags
     * }
     */
    public static final OfInt touchFlags$layout() {
        return touchFlags$LAYOUT;
    }

    private static final long touchFlags$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TOUCH_FLAGS touchFlags
     * }
     */
    public static final long touchFlags$offset() {
        return touchFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TOUCH_FLAGS touchFlags
     * }
     */
    public static int touchFlags(MemorySegment struct) {
        return struct.get(touchFlags$LAYOUT, touchFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TOUCH_FLAGS touchFlags
     * }
     */
    public static void touchFlags(MemorySegment struct, int fieldValue) {
        struct.set(touchFlags$LAYOUT, touchFlags$OFFSET, fieldValue);
    }

    private static final OfInt touchMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("touchMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TOUCH_MASK touchMask
     * }
     */
    public static final OfInt touchMask$layout() {
        return touchMask$LAYOUT;
    }

    private static final long touchMask$OFFSET = 100;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TOUCH_MASK touchMask
     * }
     */
    public static final long touchMask$offset() {
        return touchMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TOUCH_MASK touchMask
     * }
     */
    public static int touchMask(MemorySegment struct) {
        return struct.get(touchMask$LAYOUT, touchMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TOUCH_MASK touchMask
     * }
     */
    public static void touchMask(MemorySegment struct, int fieldValue) {
        struct.set(touchMask$LAYOUT, touchMask$OFFSET, fieldValue);
    }

    private static final GroupLayout rcContact$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rcContact"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECT rcContact
     * }
     */
    public static final GroupLayout rcContact$layout() {
        return rcContact$LAYOUT;
    }

    private static final long rcContact$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECT rcContact
     * }
     */
    public static final long rcContact$offset() {
        return rcContact$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECT rcContact
     * }
     */
    public static MemorySegment rcContact(MemorySegment struct) {
        return struct.asSlice(rcContact$OFFSET, rcContact$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECT rcContact
     * }
     */
    public static void rcContact(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rcContact$OFFSET, rcContact$LAYOUT.byteSize());
    }

    private static final GroupLayout rcContactRaw$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rcContactRaw"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECT rcContactRaw
     * }
     */
    public static final GroupLayout rcContactRaw$layout() {
        return rcContactRaw$LAYOUT;
    }

    private static final long rcContactRaw$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECT rcContactRaw
     * }
     */
    public static final long rcContactRaw$offset() {
        return rcContactRaw$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECT rcContactRaw
     * }
     */
    public static MemorySegment rcContactRaw(MemorySegment struct) {
        return struct.asSlice(rcContactRaw$OFFSET, rcContactRaw$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECT rcContactRaw
     * }
     */
    public static void rcContactRaw(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rcContactRaw$OFFSET, rcContactRaw$LAYOUT.byteSize());
    }

    private static final OfInt orientation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("orientation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 orientation
     * }
     */
    public static final OfInt orientation$layout() {
        return orientation$LAYOUT;
    }

    private static final long orientation$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 orientation
     * }
     */
    public static final long orientation$offset() {
        return orientation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 orientation
     * }
     */
    public static int orientation(MemorySegment struct) {
        return struct.get(orientation$LAYOUT, orientation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 orientation
     * }
     */
    public static void orientation(MemorySegment struct, int fieldValue) {
        struct.set(orientation$LAYOUT, orientation$OFFSET, fieldValue);
    }

    private static final OfInt pressure$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pressure"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 pressure
     * }
     */
    public static final OfInt pressure$layout() {
        return pressure$LAYOUT;
    }

    private static final long pressure$OFFSET = 140;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 pressure
     * }
     */
    public static final long pressure$offset() {
        return pressure$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 pressure
     * }
     */
    public static int pressure(MemorySegment struct) {
        return struct.get(pressure$LAYOUT, pressure$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 pressure
     * }
     */
    public static void pressure(MemorySegment struct, int fieldValue) {
        struct.set(pressure$LAYOUT, pressure$OFFSET, fieldValue);
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

