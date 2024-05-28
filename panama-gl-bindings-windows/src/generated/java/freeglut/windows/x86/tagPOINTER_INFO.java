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
 * struct tagPOINTER_INFO {
 *     POINTER_INPUT_TYPE pointerType;
 *     UINT32 pointerId;
 *     UINT32 frameId;
 *     POINTER_FLAGS pointerFlags;
 *     HANDLE sourceDevice;
 *     HWND hwndTarget;
 *     POINT ptPixelLocation;
 *     POINT ptHimetricLocation;
 *     POINT ptPixelLocationRaw;
 *     POINT ptHimetricLocationRaw;
 *     DWORD dwTime;
 *     UINT32 historyCount;
 *     INT32 InputData;
 *     DWORD dwKeyStates;
 *     UINT64 PerformanceCount;
 *     POINTER_BUTTON_CHANGE_TYPE ButtonChangeType;
 * }
 * }
 */
public class tagPOINTER_INFO {

    tagPOINTER_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("pointerType"),
        freeglut_h.C_INT.withName("pointerId"),
        freeglut_h.C_INT.withName("frameId"),
        freeglut_h.C_INT.withName("pointerFlags"),
        freeglut_h.C_POINTER.withName("sourceDevice"),
        freeglut_h.C_POINTER.withName("hwndTarget"),
        tagPOINT.layout().withName("ptPixelLocation"),
        tagPOINT.layout().withName("ptHimetricLocation"),
        tagPOINT.layout().withName("ptPixelLocationRaw"),
        tagPOINT.layout().withName("ptHimetricLocationRaw"),
        freeglut_h.C_LONG.withName("dwTime"),
        freeglut_h.C_INT.withName("historyCount"),
        freeglut_h.C_INT.withName("InputData"),
        freeglut_h.C_LONG.withName("dwKeyStates"),
        freeglut_h.C_LONG_LONG.withName("PerformanceCount"),
        freeglut_h.C_INT.withName("ButtonChangeType"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagPOINTER_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt pointerType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pointerType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTER_INPUT_TYPE pointerType
     * }
     */
    public static final OfInt pointerType$layout() {
        return pointerType$LAYOUT;
    }

    private static final long pointerType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTER_INPUT_TYPE pointerType
     * }
     */
    public static final long pointerType$offset() {
        return pointerType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTER_INPUT_TYPE pointerType
     * }
     */
    public static int pointerType(MemorySegment struct) {
        return struct.get(pointerType$LAYOUT, pointerType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTER_INPUT_TYPE pointerType
     * }
     */
    public static void pointerType(MemorySegment struct, int fieldValue) {
        struct.set(pointerType$LAYOUT, pointerType$OFFSET, fieldValue);
    }

    private static final OfInt pointerId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pointerId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 pointerId
     * }
     */
    public static final OfInt pointerId$layout() {
        return pointerId$LAYOUT;
    }

    private static final long pointerId$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 pointerId
     * }
     */
    public static final long pointerId$offset() {
        return pointerId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 pointerId
     * }
     */
    public static int pointerId(MemorySegment struct) {
        return struct.get(pointerId$LAYOUT, pointerId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 pointerId
     * }
     */
    public static void pointerId(MemorySegment struct, int fieldValue) {
        struct.set(pointerId$LAYOUT, pointerId$OFFSET, fieldValue);
    }

    private static final OfInt frameId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("frameId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 frameId
     * }
     */
    public static final OfInt frameId$layout() {
        return frameId$LAYOUT;
    }

    private static final long frameId$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 frameId
     * }
     */
    public static final long frameId$offset() {
        return frameId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 frameId
     * }
     */
    public static int frameId(MemorySegment struct) {
        return struct.get(frameId$LAYOUT, frameId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 frameId
     * }
     */
    public static void frameId(MemorySegment struct, int fieldValue) {
        struct.set(frameId$LAYOUT, frameId$OFFSET, fieldValue);
    }

    private static final OfInt pointerFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pointerFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTER_FLAGS pointerFlags
     * }
     */
    public static final OfInt pointerFlags$layout() {
        return pointerFlags$LAYOUT;
    }

    private static final long pointerFlags$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTER_FLAGS pointerFlags
     * }
     */
    public static final long pointerFlags$offset() {
        return pointerFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTER_FLAGS pointerFlags
     * }
     */
    public static int pointerFlags(MemorySegment struct) {
        return struct.get(pointerFlags$LAYOUT, pointerFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTER_FLAGS pointerFlags
     * }
     */
    public static void pointerFlags(MemorySegment struct, int fieldValue) {
        struct.set(pointerFlags$LAYOUT, pointerFlags$OFFSET, fieldValue);
    }

    private static final AddressLayout sourceDevice$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sourceDevice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE sourceDevice
     * }
     */
    public static final AddressLayout sourceDevice$layout() {
        return sourceDevice$LAYOUT;
    }

    private static final long sourceDevice$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE sourceDevice
     * }
     */
    public static final long sourceDevice$offset() {
        return sourceDevice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE sourceDevice
     * }
     */
    public static MemorySegment sourceDevice(MemorySegment struct) {
        return struct.get(sourceDevice$LAYOUT, sourceDevice$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE sourceDevice
     * }
     */
    public static void sourceDevice(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sourceDevice$LAYOUT, sourceDevice$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndTarget$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndTarget"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndTarget
     * }
     */
    public static final AddressLayout hwndTarget$layout() {
        return hwndTarget$LAYOUT;
    }

    private static final long hwndTarget$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndTarget
     * }
     */
    public static final long hwndTarget$offset() {
        return hwndTarget$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndTarget
     * }
     */
    public static MemorySegment hwndTarget(MemorySegment struct) {
        return struct.get(hwndTarget$LAYOUT, hwndTarget$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndTarget
     * }
     */
    public static void hwndTarget(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndTarget$LAYOUT, hwndTarget$OFFSET, fieldValue);
    }

    private static final GroupLayout ptPixelLocation$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ptPixelLocation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINT ptPixelLocation
     * }
     */
    public static final GroupLayout ptPixelLocation$layout() {
        return ptPixelLocation$LAYOUT;
    }

    private static final long ptPixelLocation$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINT ptPixelLocation
     * }
     */
    public static final long ptPixelLocation$offset() {
        return ptPixelLocation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINT ptPixelLocation
     * }
     */
    public static MemorySegment ptPixelLocation(MemorySegment struct) {
        return struct.asSlice(ptPixelLocation$OFFSET, ptPixelLocation$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINT ptPixelLocation
     * }
     */
    public static void ptPixelLocation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ptPixelLocation$OFFSET, ptPixelLocation$LAYOUT.byteSize());
    }

    private static final GroupLayout ptHimetricLocation$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ptHimetricLocation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINT ptHimetricLocation
     * }
     */
    public static final GroupLayout ptHimetricLocation$layout() {
        return ptHimetricLocation$LAYOUT;
    }

    private static final long ptHimetricLocation$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINT ptHimetricLocation
     * }
     */
    public static final long ptHimetricLocation$offset() {
        return ptHimetricLocation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINT ptHimetricLocation
     * }
     */
    public static MemorySegment ptHimetricLocation(MemorySegment struct) {
        return struct.asSlice(ptHimetricLocation$OFFSET, ptHimetricLocation$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINT ptHimetricLocation
     * }
     */
    public static void ptHimetricLocation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ptHimetricLocation$OFFSET, ptHimetricLocation$LAYOUT.byteSize());
    }

    private static final GroupLayout ptPixelLocationRaw$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ptPixelLocationRaw"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINT ptPixelLocationRaw
     * }
     */
    public static final GroupLayout ptPixelLocationRaw$layout() {
        return ptPixelLocationRaw$LAYOUT;
    }

    private static final long ptPixelLocationRaw$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINT ptPixelLocationRaw
     * }
     */
    public static final long ptPixelLocationRaw$offset() {
        return ptPixelLocationRaw$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINT ptPixelLocationRaw
     * }
     */
    public static MemorySegment ptPixelLocationRaw(MemorySegment struct) {
        return struct.asSlice(ptPixelLocationRaw$OFFSET, ptPixelLocationRaw$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINT ptPixelLocationRaw
     * }
     */
    public static void ptPixelLocationRaw(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ptPixelLocationRaw$OFFSET, ptPixelLocationRaw$LAYOUT.byteSize());
    }

    private static final GroupLayout ptHimetricLocationRaw$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ptHimetricLocationRaw"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINT ptHimetricLocationRaw
     * }
     */
    public static final GroupLayout ptHimetricLocationRaw$layout() {
        return ptHimetricLocationRaw$LAYOUT;
    }

    private static final long ptHimetricLocationRaw$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINT ptHimetricLocationRaw
     * }
     */
    public static final long ptHimetricLocationRaw$offset() {
        return ptHimetricLocationRaw$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINT ptHimetricLocationRaw
     * }
     */
    public static MemorySegment ptHimetricLocationRaw(MemorySegment struct) {
        return struct.asSlice(ptHimetricLocationRaw$OFFSET, ptHimetricLocationRaw$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINT ptHimetricLocationRaw
     * }
     */
    public static void ptHimetricLocationRaw(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ptHimetricLocationRaw$OFFSET, ptHimetricLocationRaw$LAYOUT.byteSize());
    }

    private static final OfInt dwTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static final OfInt dwTime$layout() {
        return dwTime$LAYOUT;
    }

    private static final long dwTime$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static final long dwTime$offset() {
        return dwTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static int dwTime(MemorySegment struct) {
        return struct.get(dwTime$LAYOUT, dwTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwTime
     * }
     */
    public static void dwTime(MemorySegment struct, int fieldValue) {
        struct.set(dwTime$LAYOUT, dwTime$OFFSET, fieldValue);
    }

    private static final OfInt historyCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("historyCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 historyCount
     * }
     */
    public static final OfInt historyCount$layout() {
        return historyCount$LAYOUT;
    }

    private static final long historyCount$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 historyCount
     * }
     */
    public static final long historyCount$offset() {
        return historyCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 historyCount
     * }
     */
    public static int historyCount(MemorySegment struct) {
        return struct.get(historyCount$LAYOUT, historyCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 historyCount
     * }
     */
    public static void historyCount(MemorySegment struct, int fieldValue) {
        struct.set(historyCount$LAYOUT, historyCount$OFFSET, fieldValue);
    }

    private static final OfInt InputData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("InputData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT32 InputData
     * }
     */
    public static final OfInt InputData$layout() {
        return InputData$LAYOUT;
    }

    private static final long InputData$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT32 InputData
     * }
     */
    public static final long InputData$offset() {
        return InputData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT32 InputData
     * }
     */
    public static int InputData(MemorySegment struct) {
        return struct.get(InputData$LAYOUT, InputData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT32 InputData
     * }
     */
    public static void InputData(MemorySegment struct, int fieldValue) {
        struct.set(InputData$LAYOUT, InputData$OFFSET, fieldValue);
    }

    private static final OfInt dwKeyStates$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwKeyStates"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwKeyStates
     * }
     */
    public static final OfInt dwKeyStates$layout() {
        return dwKeyStates$LAYOUT;
    }

    private static final long dwKeyStates$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwKeyStates
     * }
     */
    public static final long dwKeyStates$offset() {
        return dwKeyStates$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwKeyStates
     * }
     */
    public static int dwKeyStates(MemorySegment struct) {
        return struct.get(dwKeyStates$LAYOUT, dwKeyStates$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwKeyStates
     * }
     */
    public static void dwKeyStates(MemorySegment struct, int fieldValue) {
        struct.set(dwKeyStates$LAYOUT, dwKeyStates$OFFSET, fieldValue);
    }

    private static final OfLong PerformanceCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("PerformanceCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT64 PerformanceCount
     * }
     */
    public static final OfLong PerformanceCount$layout() {
        return PerformanceCount$LAYOUT;
    }

    private static final long PerformanceCount$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT64 PerformanceCount
     * }
     */
    public static final long PerformanceCount$offset() {
        return PerformanceCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT64 PerformanceCount
     * }
     */
    public static long PerformanceCount(MemorySegment struct) {
        return struct.get(PerformanceCount$LAYOUT, PerformanceCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT64 PerformanceCount
     * }
     */
    public static void PerformanceCount(MemorySegment struct, long fieldValue) {
        struct.set(PerformanceCount$LAYOUT, PerformanceCount$OFFSET, fieldValue);
    }

    private static final OfInt ButtonChangeType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ButtonChangeType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTER_BUTTON_CHANGE_TYPE ButtonChangeType
     * }
     */
    public static final OfInt ButtonChangeType$layout() {
        return ButtonChangeType$LAYOUT;
    }

    private static final long ButtonChangeType$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTER_BUTTON_CHANGE_TYPE ButtonChangeType
     * }
     */
    public static final long ButtonChangeType$offset() {
        return ButtonChangeType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTER_BUTTON_CHANGE_TYPE ButtonChangeType
     * }
     */
    public static int ButtonChangeType(MemorySegment struct) {
        return struct.get(ButtonChangeType$LAYOUT, ButtonChangeType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTER_BUTTON_CHANGE_TYPE ButtonChangeType
     * }
     */
    public static void ButtonChangeType(MemorySegment struct, int fieldValue) {
        struct.set(ButtonChangeType$LAYOUT, ButtonChangeType$OFFSET, fieldValue);
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

