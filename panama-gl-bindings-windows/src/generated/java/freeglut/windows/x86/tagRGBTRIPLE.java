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
 * struct tagRGBTRIPLE {
 *     BYTE rgbtBlue;
 *     BYTE rgbtGreen;
 *     BYTE rgbtRed;
 * }
 * }
 */
public class tagRGBTRIPLE {

    tagRGBTRIPLE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_CHAR.withName("rgbtBlue"),
        freeglut_h.C_CHAR.withName("rgbtGreen"),
        freeglut_h.C_CHAR.withName("rgbtRed")
    ).withName("tagRGBTRIPLE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte rgbtBlue$LAYOUT = (OfByte)$LAYOUT.select(groupElement("rgbtBlue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE rgbtBlue
     * }
     */
    public static final OfByte rgbtBlue$layout() {
        return rgbtBlue$LAYOUT;
    }

    private static final long rgbtBlue$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE rgbtBlue
     * }
     */
    public static final long rgbtBlue$offset() {
        return rgbtBlue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE rgbtBlue
     * }
     */
    public static byte rgbtBlue(MemorySegment struct) {
        return struct.get(rgbtBlue$LAYOUT, rgbtBlue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE rgbtBlue
     * }
     */
    public static void rgbtBlue(MemorySegment struct, byte fieldValue) {
        struct.set(rgbtBlue$LAYOUT, rgbtBlue$OFFSET, fieldValue);
    }

    private static final OfByte rgbtGreen$LAYOUT = (OfByte)$LAYOUT.select(groupElement("rgbtGreen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE rgbtGreen
     * }
     */
    public static final OfByte rgbtGreen$layout() {
        return rgbtGreen$LAYOUT;
    }

    private static final long rgbtGreen$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE rgbtGreen
     * }
     */
    public static final long rgbtGreen$offset() {
        return rgbtGreen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE rgbtGreen
     * }
     */
    public static byte rgbtGreen(MemorySegment struct) {
        return struct.get(rgbtGreen$LAYOUT, rgbtGreen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE rgbtGreen
     * }
     */
    public static void rgbtGreen(MemorySegment struct, byte fieldValue) {
        struct.set(rgbtGreen$LAYOUT, rgbtGreen$OFFSET, fieldValue);
    }

    private static final OfByte rgbtRed$LAYOUT = (OfByte)$LAYOUT.select(groupElement("rgbtRed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE rgbtRed
     * }
     */
    public static final OfByte rgbtRed$layout() {
        return rgbtRed$LAYOUT;
    }

    private static final long rgbtRed$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE rgbtRed
     * }
     */
    public static final long rgbtRed$offset() {
        return rgbtRed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE rgbtRed
     * }
     */
    public static byte rgbtRed(MemorySegment struct) {
        return struct.get(rgbtRed$LAYOUT, rgbtRed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE rgbtRed
     * }
     */
    public static void rgbtRed(MemorySegment struct, byte fieldValue) {
        struct.set(rgbtRed$LAYOUT, rgbtRed$OFFSET, fieldValue);
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

