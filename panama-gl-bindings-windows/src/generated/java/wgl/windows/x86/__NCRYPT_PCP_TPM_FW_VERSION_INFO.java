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
 * struct __NCRYPT_PCP_TPM_FW_VERSION_INFO {
 *     UINT16 major1;
 *     UINT16 major2;
 *     UINT16 minor1;
 *     UINT16 minor2;
 * }
 * }
 */
public class __NCRYPT_PCP_TPM_FW_VERSION_INFO {

    __NCRYPT_PCP_TPM_FW_VERSION_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_SHORT.withName("major1"),
        wgl_h.C_SHORT.withName("major2"),
        wgl_h.C_SHORT.withName("minor1"),
        wgl_h.C_SHORT.withName("minor2")
    ).withName("__NCRYPT_PCP_TPM_FW_VERSION_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort major1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("major1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT16 major1
     * }
     */
    public static final OfShort major1$layout() {
        return major1$LAYOUT;
    }

    private static final long major1$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT16 major1
     * }
     */
    public static final long major1$offset() {
        return major1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT16 major1
     * }
     */
    public static short major1(MemorySegment struct) {
        return struct.get(major1$LAYOUT, major1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT16 major1
     * }
     */
    public static void major1(MemorySegment struct, short fieldValue) {
        struct.set(major1$LAYOUT, major1$OFFSET, fieldValue);
    }

    private static final OfShort major2$LAYOUT = (OfShort)$LAYOUT.select(groupElement("major2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT16 major2
     * }
     */
    public static final OfShort major2$layout() {
        return major2$LAYOUT;
    }

    private static final long major2$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT16 major2
     * }
     */
    public static final long major2$offset() {
        return major2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT16 major2
     * }
     */
    public static short major2(MemorySegment struct) {
        return struct.get(major2$LAYOUT, major2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT16 major2
     * }
     */
    public static void major2(MemorySegment struct, short fieldValue) {
        struct.set(major2$LAYOUT, major2$OFFSET, fieldValue);
    }

    private static final OfShort minor1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("minor1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT16 minor1
     * }
     */
    public static final OfShort minor1$layout() {
        return minor1$LAYOUT;
    }

    private static final long minor1$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT16 minor1
     * }
     */
    public static final long minor1$offset() {
        return minor1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT16 minor1
     * }
     */
    public static short minor1(MemorySegment struct) {
        return struct.get(minor1$LAYOUT, minor1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT16 minor1
     * }
     */
    public static void minor1(MemorySegment struct, short fieldValue) {
        struct.set(minor1$LAYOUT, minor1$OFFSET, fieldValue);
    }

    private static final OfShort minor2$LAYOUT = (OfShort)$LAYOUT.select(groupElement("minor2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT16 minor2
     * }
     */
    public static final OfShort minor2$layout() {
        return minor2$LAYOUT;
    }

    private static final long minor2$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT16 minor2
     * }
     */
    public static final long minor2$offset() {
        return minor2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT16 minor2
     * }
     */
    public static short minor2(MemorySegment struct) {
        return struct.get(minor2$LAYOUT, minor2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT16 minor2
     * }
     */
    public static void minor2(MemorySegment struct, short fieldValue) {
        struct.set(minor2$LAYOUT, minor2$OFFSET, fieldValue);
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

