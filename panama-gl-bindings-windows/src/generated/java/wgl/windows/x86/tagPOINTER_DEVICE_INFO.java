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
 * struct tagPOINTER_DEVICE_INFO {
 *     DWORD displayOrientation;
 *     HANDLE device;
 *     POINTER_DEVICE_TYPE pointerDeviceType;
 *     HMONITOR monitor;
 *     ULONG startingCursorId;
 *     USHORT maxActiveContacts;
 *     WCHAR productString[520];
 * }
 * }
 */
public class tagPOINTER_DEVICE_INFO {

    tagPOINTER_DEVICE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("displayOrientation"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("device"),
        wgl_h.C_INT.withName("pointerDeviceType"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("monitor"),
        wgl_h.C_LONG.withName("startingCursorId"),
        wgl_h.C_SHORT.withName("maxActiveContacts"),
        MemoryLayout.sequenceLayout(520, wgl_h.C_SHORT).withName("productString"),
        MemoryLayout.paddingLayout(2)
    ).withName("tagPOINTER_DEVICE_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt displayOrientation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("displayOrientation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD displayOrientation
     * }
     */
    public static final OfInt displayOrientation$layout() {
        return displayOrientation$LAYOUT;
    }

    private static final long displayOrientation$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD displayOrientation
     * }
     */
    public static final long displayOrientation$offset() {
        return displayOrientation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD displayOrientation
     * }
     */
    public static int displayOrientation(MemorySegment struct) {
        return struct.get(displayOrientation$LAYOUT, displayOrientation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD displayOrientation
     * }
     */
    public static void displayOrientation(MemorySegment struct, int fieldValue) {
        struct.set(displayOrientation$LAYOUT, displayOrientation$OFFSET, fieldValue);
    }

    private static final AddressLayout device$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("device"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE device
     * }
     */
    public static final AddressLayout device$layout() {
        return device$LAYOUT;
    }

    private static final long device$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE device
     * }
     */
    public static final long device$offset() {
        return device$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE device
     * }
     */
    public static MemorySegment device(MemorySegment struct) {
        return struct.get(device$LAYOUT, device$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE device
     * }
     */
    public static void device(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(device$LAYOUT, device$OFFSET, fieldValue);
    }

    private static final OfInt pointerDeviceType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pointerDeviceType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTER_DEVICE_TYPE pointerDeviceType
     * }
     */
    public static final OfInt pointerDeviceType$layout() {
        return pointerDeviceType$LAYOUT;
    }

    private static final long pointerDeviceType$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTER_DEVICE_TYPE pointerDeviceType
     * }
     */
    public static final long pointerDeviceType$offset() {
        return pointerDeviceType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTER_DEVICE_TYPE pointerDeviceType
     * }
     */
    public static int pointerDeviceType(MemorySegment struct) {
        return struct.get(pointerDeviceType$LAYOUT, pointerDeviceType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTER_DEVICE_TYPE pointerDeviceType
     * }
     */
    public static void pointerDeviceType(MemorySegment struct, int fieldValue) {
        struct.set(pointerDeviceType$LAYOUT, pointerDeviceType$OFFSET, fieldValue);
    }

    private static final AddressLayout monitor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("monitor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HMONITOR monitor
     * }
     */
    public static final AddressLayout monitor$layout() {
        return monitor$LAYOUT;
    }

    private static final long monitor$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HMONITOR monitor
     * }
     */
    public static final long monitor$offset() {
        return monitor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HMONITOR monitor
     * }
     */
    public static MemorySegment monitor(MemorySegment struct) {
        return struct.get(monitor$LAYOUT, monitor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HMONITOR monitor
     * }
     */
    public static void monitor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(monitor$LAYOUT, monitor$OFFSET, fieldValue);
    }

    private static final OfInt startingCursorId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("startingCursorId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG startingCursorId
     * }
     */
    public static final OfInt startingCursorId$layout() {
        return startingCursorId$LAYOUT;
    }

    private static final long startingCursorId$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG startingCursorId
     * }
     */
    public static final long startingCursorId$offset() {
        return startingCursorId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG startingCursorId
     * }
     */
    public static int startingCursorId(MemorySegment struct) {
        return struct.get(startingCursorId$LAYOUT, startingCursorId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG startingCursorId
     * }
     */
    public static void startingCursorId(MemorySegment struct, int fieldValue) {
        struct.set(startingCursorId$LAYOUT, startingCursorId$OFFSET, fieldValue);
    }

    private static final OfShort maxActiveContacts$LAYOUT = (OfShort)$LAYOUT.select(groupElement("maxActiveContacts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT maxActiveContacts
     * }
     */
    public static final OfShort maxActiveContacts$layout() {
        return maxActiveContacts$LAYOUT;
    }

    private static final long maxActiveContacts$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT maxActiveContacts
     * }
     */
    public static final long maxActiveContacts$offset() {
        return maxActiveContacts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT maxActiveContacts
     * }
     */
    public static short maxActiveContacts(MemorySegment struct) {
        return struct.get(maxActiveContacts$LAYOUT, maxActiveContacts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT maxActiveContacts
     * }
     */
    public static void maxActiveContacts(MemorySegment struct, short fieldValue) {
        struct.set(maxActiveContacts$LAYOUT, maxActiveContacts$OFFSET, fieldValue);
    }

    private static final SequenceLayout productString$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("productString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR productString[520]
     * }
     */
    public static final SequenceLayout productString$layout() {
        return productString$LAYOUT;
    }

    private static final long productString$OFFSET = 38;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR productString[520]
     * }
     */
    public static final long productString$offset() {
        return productString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR productString[520]
     * }
     */
    public static MemorySegment productString(MemorySegment struct) {
        return struct.asSlice(productString$OFFSET, productString$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR productString[520]
     * }
     */
    public static void productString(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, productString$OFFSET, productString$LAYOUT.byteSize());
    }

    private static long[] productString$DIMS = { 520 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR productString[520]
     * }
     */
    public static long[] productString$dimensions() {
        return productString$DIMS;
    }
    private static final VarHandle productString$ELEM_HANDLE = productString$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR productString[520]
     * }
     */
    public static short productString(MemorySegment struct, long index0) {
        return (short)productString$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR productString[520]
     * }
     */
    public static void productString(MemorySegment struct, long index0, short fieldValue) {
        productString$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

