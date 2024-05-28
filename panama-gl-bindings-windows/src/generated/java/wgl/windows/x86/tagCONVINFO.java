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
 * struct tagCONVINFO {
 *     DWORD cb;
 *     DWORD_PTR hUser;
 *     HCONV hConvPartner;
 *     HSZ hszSvcPartner;
 *     HSZ hszServiceReq;
 *     HSZ hszTopic;
 *     HSZ hszItem;
 *     UINT wFmt;
 *     UINT wType;
 *     UINT wStatus;
 *     UINT wConvst;
 *     UINT wLastError;
 *     HCONVLIST hConvList;
 *     CONVCONTEXT ConvCtxt;
 *     HWND hwnd;
 *     HWND hwndPartner;
 * }
 * }
 */
public class tagCONVINFO {

    tagCONVINFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_LONG.withName("cb"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_LONG_LONG.withName("hUser"),
        wgl_h.C_POINTER.withName("hConvPartner"),
        wgl_h.C_POINTER.withName("hszSvcPartner"),
        wgl_h.C_POINTER.withName("hszServiceReq"),
        wgl_h.C_POINTER.withName("hszTopic"),
        wgl_h.C_POINTER.withName("hszItem"),
        wgl_h.C_INT.withName("wFmt"),
        wgl_h.C_INT.withName("wType"),
        wgl_h.C_INT.withName("wStatus"),
        wgl_h.C_INT.withName("wConvst"),
        wgl_h.C_INT.withName("wLastError"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("hConvList"),
        tagCONVCONTEXT.layout().withName("ConvCtxt"),
        MemoryLayout.paddingLayout(4),
        wgl_h.C_POINTER.withName("hwnd"),
        wgl_h.C_POINTER.withName("hwndPartner")
    ).withName("tagCONVINFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cb$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cb"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cb
     * }
     */
    public static final OfInt cb$layout() {
        return cb$LAYOUT;
    }

    private static final long cb$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cb
     * }
     */
    public static final long cb$offset() {
        return cb$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cb
     * }
     */
    public static int cb(MemorySegment struct) {
        return struct.get(cb$LAYOUT, cb$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cb
     * }
     */
    public static void cb(MemorySegment struct, int fieldValue) {
        struct.set(cb$LAYOUT, cb$OFFSET, fieldValue);
    }

    private static final OfLong hUser$LAYOUT = (OfLong)$LAYOUT.select(groupElement("hUser"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD_PTR hUser
     * }
     */
    public static final OfLong hUser$layout() {
        return hUser$LAYOUT;
    }

    private static final long hUser$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD_PTR hUser
     * }
     */
    public static final long hUser$offset() {
        return hUser$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD_PTR hUser
     * }
     */
    public static long hUser(MemorySegment struct) {
        return struct.get(hUser$LAYOUT, hUser$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD_PTR hUser
     * }
     */
    public static void hUser(MemorySegment struct, long fieldValue) {
        struct.set(hUser$LAYOUT, hUser$OFFSET, fieldValue);
    }

    private static final AddressLayout hConvPartner$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hConvPartner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCONV hConvPartner
     * }
     */
    public static final AddressLayout hConvPartner$layout() {
        return hConvPartner$LAYOUT;
    }

    private static final long hConvPartner$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCONV hConvPartner
     * }
     */
    public static final long hConvPartner$offset() {
        return hConvPartner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCONV hConvPartner
     * }
     */
    public static MemorySegment hConvPartner(MemorySegment struct) {
        return struct.get(hConvPartner$LAYOUT, hConvPartner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCONV hConvPartner
     * }
     */
    public static void hConvPartner(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hConvPartner$LAYOUT, hConvPartner$OFFSET, fieldValue);
    }

    private static final AddressLayout hszSvcPartner$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hszSvcPartner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HSZ hszSvcPartner
     * }
     */
    public static final AddressLayout hszSvcPartner$layout() {
        return hszSvcPartner$LAYOUT;
    }

    private static final long hszSvcPartner$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HSZ hszSvcPartner
     * }
     */
    public static final long hszSvcPartner$offset() {
        return hszSvcPartner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HSZ hszSvcPartner
     * }
     */
    public static MemorySegment hszSvcPartner(MemorySegment struct) {
        return struct.get(hszSvcPartner$LAYOUT, hszSvcPartner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HSZ hszSvcPartner
     * }
     */
    public static void hszSvcPartner(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hszSvcPartner$LAYOUT, hszSvcPartner$OFFSET, fieldValue);
    }

    private static final AddressLayout hszServiceReq$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hszServiceReq"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HSZ hszServiceReq
     * }
     */
    public static final AddressLayout hszServiceReq$layout() {
        return hszServiceReq$LAYOUT;
    }

    private static final long hszServiceReq$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HSZ hszServiceReq
     * }
     */
    public static final long hszServiceReq$offset() {
        return hszServiceReq$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HSZ hszServiceReq
     * }
     */
    public static MemorySegment hszServiceReq(MemorySegment struct) {
        return struct.get(hszServiceReq$LAYOUT, hszServiceReq$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HSZ hszServiceReq
     * }
     */
    public static void hszServiceReq(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hszServiceReq$LAYOUT, hszServiceReq$OFFSET, fieldValue);
    }

    private static final AddressLayout hszTopic$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hszTopic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HSZ hszTopic
     * }
     */
    public static final AddressLayout hszTopic$layout() {
        return hszTopic$LAYOUT;
    }

    private static final long hszTopic$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HSZ hszTopic
     * }
     */
    public static final long hszTopic$offset() {
        return hszTopic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HSZ hszTopic
     * }
     */
    public static MemorySegment hszTopic(MemorySegment struct) {
        return struct.get(hszTopic$LAYOUT, hszTopic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HSZ hszTopic
     * }
     */
    public static void hszTopic(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hszTopic$LAYOUT, hszTopic$OFFSET, fieldValue);
    }

    private static final AddressLayout hszItem$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hszItem"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HSZ hszItem
     * }
     */
    public static final AddressLayout hszItem$layout() {
        return hszItem$LAYOUT;
    }

    private static final long hszItem$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HSZ hszItem
     * }
     */
    public static final long hszItem$offset() {
        return hszItem$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HSZ hszItem
     * }
     */
    public static MemorySegment hszItem(MemorySegment struct) {
        return struct.get(hszItem$LAYOUT, hszItem$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HSZ hszItem
     * }
     */
    public static void hszItem(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hszItem$LAYOUT, hszItem$OFFSET, fieldValue);
    }

    private static final OfInt wFmt$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wFmt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT wFmt
     * }
     */
    public static final OfInt wFmt$layout() {
        return wFmt$LAYOUT;
    }

    private static final long wFmt$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT wFmt
     * }
     */
    public static final long wFmt$offset() {
        return wFmt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT wFmt
     * }
     */
    public static int wFmt(MemorySegment struct) {
        return struct.get(wFmt$LAYOUT, wFmt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT wFmt
     * }
     */
    public static void wFmt(MemorySegment struct, int fieldValue) {
        struct.set(wFmt$LAYOUT, wFmt$OFFSET, fieldValue);
    }

    private static final OfInt wType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT wType
     * }
     */
    public static final OfInt wType$layout() {
        return wType$LAYOUT;
    }

    private static final long wType$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT wType
     * }
     */
    public static final long wType$offset() {
        return wType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT wType
     * }
     */
    public static int wType(MemorySegment struct) {
        return struct.get(wType$LAYOUT, wType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT wType
     * }
     */
    public static void wType(MemorySegment struct, int fieldValue) {
        struct.set(wType$LAYOUT, wType$OFFSET, fieldValue);
    }

    private static final OfInt wStatus$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT wStatus
     * }
     */
    public static final OfInt wStatus$layout() {
        return wStatus$LAYOUT;
    }

    private static final long wStatus$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT wStatus
     * }
     */
    public static final long wStatus$offset() {
        return wStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT wStatus
     * }
     */
    public static int wStatus(MemorySegment struct) {
        return struct.get(wStatus$LAYOUT, wStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT wStatus
     * }
     */
    public static void wStatus(MemorySegment struct, int fieldValue) {
        struct.set(wStatus$LAYOUT, wStatus$OFFSET, fieldValue);
    }

    private static final OfInt wConvst$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wConvst"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT wConvst
     * }
     */
    public static final OfInt wConvst$layout() {
        return wConvst$LAYOUT;
    }

    private static final long wConvst$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT wConvst
     * }
     */
    public static final long wConvst$offset() {
        return wConvst$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT wConvst
     * }
     */
    public static int wConvst(MemorySegment struct) {
        return struct.get(wConvst$LAYOUT, wConvst$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT wConvst
     * }
     */
    public static void wConvst(MemorySegment struct, int fieldValue) {
        struct.set(wConvst$LAYOUT, wConvst$OFFSET, fieldValue);
    }

    private static final OfInt wLastError$LAYOUT = (OfInt)$LAYOUT.select(groupElement("wLastError"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT wLastError
     * }
     */
    public static final OfInt wLastError$layout() {
        return wLastError$LAYOUT;
    }

    private static final long wLastError$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT wLastError
     * }
     */
    public static final long wLastError$offset() {
        return wLastError$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT wLastError
     * }
     */
    public static int wLastError(MemorySegment struct) {
        return struct.get(wLastError$LAYOUT, wLastError$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT wLastError
     * }
     */
    public static void wLastError(MemorySegment struct, int fieldValue) {
        struct.set(wLastError$LAYOUT, wLastError$OFFSET, fieldValue);
    }

    private static final AddressLayout hConvList$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hConvList"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCONVLIST hConvList
     * }
     */
    public static final AddressLayout hConvList$layout() {
        return hConvList$LAYOUT;
    }

    private static final long hConvList$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCONVLIST hConvList
     * }
     */
    public static final long hConvList$offset() {
        return hConvList$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCONVLIST hConvList
     * }
     */
    public static MemorySegment hConvList(MemorySegment struct) {
        return struct.get(hConvList$LAYOUT, hConvList$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCONVLIST hConvList
     * }
     */
    public static void hConvList(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hConvList$LAYOUT, hConvList$OFFSET, fieldValue);
    }

    private static final GroupLayout ConvCtxt$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ConvCtxt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CONVCONTEXT ConvCtxt
     * }
     */
    public static final GroupLayout ConvCtxt$layout() {
        return ConvCtxt$LAYOUT;
    }

    private static final long ConvCtxt$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CONVCONTEXT ConvCtxt
     * }
     */
    public static final long ConvCtxt$offset() {
        return ConvCtxt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CONVCONTEXT ConvCtxt
     * }
     */
    public static MemorySegment ConvCtxt(MemorySegment struct) {
        return struct.asSlice(ConvCtxt$OFFSET, ConvCtxt$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CONVCONTEXT ConvCtxt
     * }
     */
    public static void ConvCtxt(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ConvCtxt$OFFSET, ConvCtxt$LAYOUT.byteSize());
    }

    private static final AddressLayout hwnd$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwnd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static final AddressLayout hwnd$layout() {
        return hwnd$LAYOUT;
    }

    private static final long hwnd$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static final long hwnd$offset() {
        return hwnd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static MemorySegment hwnd(MemorySegment struct) {
        return struct.get(hwnd$LAYOUT, hwnd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static void hwnd(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwnd$LAYOUT, hwnd$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndPartner$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndPartner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndPartner
     * }
     */
    public static final AddressLayout hwndPartner$layout() {
        return hwndPartner$LAYOUT;
    }

    private static final long hwndPartner$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndPartner
     * }
     */
    public static final long hwndPartner$offset() {
        return hwndPartner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndPartner
     * }
     */
    public static MemorySegment hwndPartner(MemorySegment struct) {
        return struct.get(hwndPartner$LAYOUT, hwndPartner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndPartner
     * }
     */
    public static void hwndPartner(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndPartner$LAYOUT, hwndPartner$OFFSET, fieldValue);
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

