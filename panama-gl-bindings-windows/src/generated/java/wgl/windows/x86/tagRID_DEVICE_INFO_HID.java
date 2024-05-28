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
 * struct tagRID_DEVICE_INFO_HID {
 *     DWORD dwVendorId;
 *     DWORD dwProductId;
 *     DWORD dwVersionNumber;
 *     USHORT usUsagePage;
 *     USHORT usUsage;
 * }
 * }
 */
public class tagRID_DEVICE_INFO_HID {

    tagRID_DEVICE_INFO_HID() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("dwVendorId"),
        wgl_h.C_LONG.withName("dwProductId"),
        wgl_h.C_LONG.withName("dwVersionNumber"),
        wgl_h.C_SHORT.withName("usUsagePage"),
        wgl_h.C_SHORT.withName("usUsage")
    ).withName("tagRID_DEVICE_INFO_HID");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwVendorId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwVendorId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwVendorId
     * }
     */
    public static final OfInt dwVendorId$layout() {
        return dwVendorId$LAYOUT;
    }

    private static final long dwVendorId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwVendorId
     * }
     */
    public static final long dwVendorId$offset() {
        return dwVendorId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwVendorId
     * }
     */
    public static int dwVendorId(MemorySegment struct) {
        return struct.get(dwVendorId$LAYOUT, dwVendorId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwVendorId
     * }
     */
    public static void dwVendorId(MemorySegment struct, int fieldValue) {
        struct.set(dwVendorId$LAYOUT, dwVendorId$OFFSET, fieldValue);
    }

    private static final OfInt dwProductId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwProductId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwProductId
     * }
     */
    public static final OfInt dwProductId$layout() {
        return dwProductId$LAYOUT;
    }

    private static final long dwProductId$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwProductId
     * }
     */
    public static final long dwProductId$offset() {
        return dwProductId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwProductId
     * }
     */
    public static int dwProductId(MemorySegment struct) {
        return struct.get(dwProductId$LAYOUT, dwProductId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwProductId
     * }
     */
    public static void dwProductId(MemorySegment struct, int fieldValue) {
        struct.set(dwProductId$LAYOUT, dwProductId$OFFSET, fieldValue);
    }

    private static final OfInt dwVersionNumber$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwVersionNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwVersionNumber
     * }
     */
    public static final OfInt dwVersionNumber$layout() {
        return dwVersionNumber$LAYOUT;
    }

    private static final long dwVersionNumber$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwVersionNumber
     * }
     */
    public static final long dwVersionNumber$offset() {
        return dwVersionNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwVersionNumber
     * }
     */
    public static int dwVersionNumber(MemorySegment struct) {
        return struct.get(dwVersionNumber$LAYOUT, dwVersionNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwVersionNumber
     * }
     */
    public static void dwVersionNumber(MemorySegment struct, int fieldValue) {
        struct.set(dwVersionNumber$LAYOUT, dwVersionNumber$OFFSET, fieldValue);
    }

    private static final OfShort usUsagePage$LAYOUT = (OfShort)$LAYOUT.select(groupElement("usUsagePage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT usUsagePage
     * }
     */
    public static final OfShort usUsagePage$layout() {
        return usUsagePage$LAYOUT;
    }

    private static final long usUsagePage$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT usUsagePage
     * }
     */
    public static final long usUsagePage$offset() {
        return usUsagePage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT usUsagePage
     * }
     */
    public static short usUsagePage(MemorySegment struct) {
        return struct.get(usUsagePage$LAYOUT, usUsagePage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT usUsagePage
     * }
     */
    public static void usUsagePage(MemorySegment struct, short fieldValue) {
        struct.set(usUsagePage$LAYOUT, usUsagePage$OFFSET, fieldValue);
    }

    private static final OfShort usUsage$LAYOUT = (OfShort)$LAYOUT.select(groupElement("usUsage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT usUsage
     * }
     */
    public static final OfShort usUsage$layout() {
        return usUsage$LAYOUT;
    }

    private static final long usUsage$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT usUsage
     * }
     */
    public static final long usUsage$offset() {
        return usUsage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT usUsage
     * }
     */
    public static short usUsage(MemorySegment struct) {
        return struct.get(usUsage$LAYOUT, usUsage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT usUsage
     * }
     */
    public static void usUsage(MemorySegment struct, short fieldValue) {
        struct.set(usUsage$LAYOUT, usUsage$OFFSET, fieldValue);
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

