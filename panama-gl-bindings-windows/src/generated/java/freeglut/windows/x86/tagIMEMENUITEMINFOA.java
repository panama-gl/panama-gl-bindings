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
 * struct tagIMEMENUITEMINFOA {
 *     UINT cbSize;
 *     UINT fType;
 *     UINT fState;
 *     UINT wID;
 *     HBITMAP hbmpChecked;
 *     HBITMAP hbmpUnchecked;
 *     DWORD dwItemData;
 *     CHAR szString[80];
 *     HBITMAP hbmpItem;
 * }
 * }
 */
public class tagIMEMENUITEMINFOA {

    tagIMEMENUITEMINFOA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_INT.withName("cbSize"),
        freeglut_h.C_INT.withName("fType"),
        freeglut_h.C_INT.withName("fState"),
        freeglut_h.C_INT.withName("wID"),
        freeglut_h.C_POINTER.withName("hbmpChecked"),
        freeglut_h.C_POINTER.withName("hbmpUnchecked"),
        freeglut_h.C_LONG.withName("dwItemData"),
        MemoryLayout.sequenceLayout(80, freeglut_h.C_CHAR).withName("szString"),
        MemoryLayout.paddingLayout(4),
        freeglut_h.C_POINTER.withName("hbmpItem")
    ).withName("tagIMEMENUITEMINFOA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt fType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT fType
     * }
     */
    public static final OfInt fType$layout() {
        return fType$LAYOUT;
    }

    private static final long fType$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT fType
     * }
     */
    public static final long fType$offset() {
        return fType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT fType
     * }
     */
    public static int fType(MemorySegment struct) {
        return struct.get(fType$LAYOUT, fType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT fType
     * }
     */
    public static void fType(MemorySegment struct, int fieldValue) {
        struct.set(fType$LAYOUT, fType$OFFSET, fieldValue);
    }

    private static final OfInt fState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT fState
     * }
     */
    public static final OfInt fState$layout() {
        return fState$LAYOUT;
    }

    private static final long fState$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT fState
     * }
     */
    public static final long fState$offset() {
        return fState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT fState
     * }
     */
    public static int fState(MemorySegment struct) {
        return struct.get(fState$LAYOUT, fState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT fState
     * }
     */
    public static void fState(MemorySegment struct, int fieldValue) {
        struct.set(fState$LAYOUT, fState$OFFSET, fieldValue);
    }

    private static final OfInt wID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT wID
     * }
     */
    public static final OfInt wID$layout() {
        return wID$LAYOUT;
    }

    private static final long wID$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT wID
     * }
     */
    public static final long wID$offset() {
        return wID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT wID
     * }
     */
    public static int wID(MemorySegment struct) {
        return struct.get(wID$LAYOUT, wID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT wID
     * }
     */
    public static void wID(MemorySegment struct, int fieldValue) {
        struct.set(wID$LAYOUT, wID$OFFSET, fieldValue);
    }

    private static final AddressLayout hbmpChecked$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hbmpChecked"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HBITMAP hbmpChecked
     * }
     */
    public static final AddressLayout hbmpChecked$layout() {
        return hbmpChecked$LAYOUT;
    }

    private static final long hbmpChecked$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HBITMAP hbmpChecked
     * }
     */
    public static final long hbmpChecked$offset() {
        return hbmpChecked$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HBITMAP hbmpChecked
     * }
     */
    public static MemorySegment hbmpChecked(MemorySegment struct) {
        return struct.get(hbmpChecked$LAYOUT, hbmpChecked$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HBITMAP hbmpChecked
     * }
     */
    public static void hbmpChecked(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hbmpChecked$LAYOUT, hbmpChecked$OFFSET, fieldValue);
    }

    private static final AddressLayout hbmpUnchecked$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hbmpUnchecked"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HBITMAP hbmpUnchecked
     * }
     */
    public static final AddressLayout hbmpUnchecked$layout() {
        return hbmpUnchecked$LAYOUT;
    }

    private static final long hbmpUnchecked$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HBITMAP hbmpUnchecked
     * }
     */
    public static final long hbmpUnchecked$offset() {
        return hbmpUnchecked$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HBITMAP hbmpUnchecked
     * }
     */
    public static MemorySegment hbmpUnchecked(MemorySegment struct) {
        return struct.get(hbmpUnchecked$LAYOUT, hbmpUnchecked$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HBITMAP hbmpUnchecked
     * }
     */
    public static void hbmpUnchecked(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hbmpUnchecked$LAYOUT, hbmpUnchecked$OFFSET, fieldValue);
    }

    private static final OfInt dwItemData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwItemData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwItemData
     * }
     */
    public static final OfInt dwItemData$layout() {
        return dwItemData$LAYOUT;
    }

    private static final long dwItemData$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwItemData
     * }
     */
    public static final long dwItemData$offset() {
        return dwItemData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwItemData
     * }
     */
    public static int dwItemData(MemorySegment struct) {
        return struct.get(dwItemData$LAYOUT, dwItemData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwItemData
     * }
     */
    public static void dwItemData(MemorySegment struct, int fieldValue) {
        struct.set(dwItemData$LAYOUT, dwItemData$OFFSET, fieldValue);
    }

    private static final SequenceLayout szString$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR szString[80]
     * }
     */
    public static final SequenceLayout szString$layout() {
        return szString$LAYOUT;
    }

    private static final long szString$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR szString[80]
     * }
     */
    public static final long szString$offset() {
        return szString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR szString[80]
     * }
     */
    public static MemorySegment szString(MemorySegment struct) {
        return struct.asSlice(szString$OFFSET, szString$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR szString[80]
     * }
     */
    public static void szString(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szString$OFFSET, szString$LAYOUT.byteSize());
    }

    private static long[] szString$DIMS = { 80 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR szString[80]
     * }
     */
    public static long[] szString$dimensions() {
        return szString$DIMS;
    }
    private static final VarHandle szString$ELEM_HANDLE = szString$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR szString[80]
     * }
     */
    public static byte szString(MemorySegment struct, long index0) {
        return (byte)szString$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR szString[80]
     * }
     */
    public static void szString(MemorySegment struct, long index0, byte fieldValue) {
        szString$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final AddressLayout hbmpItem$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hbmpItem"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HBITMAP hbmpItem
     * }
     */
    public static final AddressLayout hbmpItem$layout() {
        return hbmpItem$LAYOUT;
    }

    private static final long hbmpItem$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HBITMAP hbmpItem
     * }
     */
    public static final long hbmpItem$offset() {
        return hbmpItem$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HBITMAP hbmpItem
     * }
     */
    public static MemorySegment hbmpItem(MemorySegment struct) {
        return struct.get(hbmpItem$LAYOUT, hbmpItem$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HBITMAP hbmpItem
     * }
     */
    public static void hbmpItem(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hbmpItem$LAYOUT, hbmpItem$OFFSET, fieldValue);
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

