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
 * struct tagPOINTER_TYPE_INFO {
 *     POINTER_INPUT_TYPE type;
 *     union {
 *         POINTER_TOUCH_INFO touchInfo;
 *         POINTER_PEN_INFO penInfo;
 *     };
 * }
 * }
 */
public class tagPOINTER_TYPE_INFO {

    tagPOINTER_TYPE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("type"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            tagPOINTER_TOUCH_INFO.layout().withName("touchInfo"),
            tagPOINTER_PEN_INFO.layout().withName("penInfo")
        ).withName("$anon$6474:5")
    ).withName("tagPOINTER_TYPE_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTER_INPUT_TYPE type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTER_INPUT_TYPE type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTER_INPUT_TYPE type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTER_INPUT_TYPE type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final GroupLayout touchInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$6474:5"), groupElement("touchInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTER_TOUCH_INFO touchInfo
     * }
     */
    public static final GroupLayout touchInfo$layout() {
        return touchInfo$LAYOUT;
    }

    private static final long touchInfo$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTER_TOUCH_INFO touchInfo
     * }
     */
    public static final long touchInfo$offset() {
        return touchInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTER_TOUCH_INFO touchInfo
     * }
     */
    public static MemorySegment touchInfo(MemorySegment struct) {
        return struct.asSlice(touchInfo$OFFSET, touchInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTER_TOUCH_INFO touchInfo
     * }
     */
    public static void touchInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, touchInfo$OFFSET, touchInfo$LAYOUT.byteSize());
    }

    private static final GroupLayout penInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$6474:5"), groupElement("penInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTER_PEN_INFO penInfo
     * }
     */
    public static final GroupLayout penInfo$layout() {
        return penInfo$LAYOUT;
    }

    private static final long penInfo$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTER_PEN_INFO penInfo
     * }
     */
    public static final long penInfo$offset() {
        return penInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTER_PEN_INFO penInfo
     * }
     */
    public static MemorySegment penInfo(MemorySegment struct) {
        return struct.asSlice(penInfo$OFFSET, penInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTER_PEN_INFO penInfo
     * }
     */
    public static void penInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, penInfo$OFFSET, penInfo$LAYOUT.byteSize());
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

