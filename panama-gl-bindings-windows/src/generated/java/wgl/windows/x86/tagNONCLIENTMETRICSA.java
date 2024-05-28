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
 * struct tagNONCLIENTMETRICSA {
 *     UINT cbSize;
 *     int iBorderWidth;
 *     int iScrollWidth;
 *     int iScrollHeight;
 *     int iCaptionWidth;
 *     int iCaptionHeight;
 *     LOGFONTA lfCaptionFont;
 *     int iSmCaptionWidth;
 *     int iSmCaptionHeight;
 *     LOGFONTA lfSmCaptionFont;
 *     int iMenuWidth;
 *     int iMenuHeight;
 *     LOGFONTA lfMenuFont;
 *     LOGFONTA lfStatusFont;
 *     LOGFONTA lfMessageFont;
 *     int iPaddedBorderWidth;
 * }
 * }
 */
public class tagNONCLIENTMETRICSA {

    tagNONCLIENTMETRICSA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_INT.withName("cbSize"),
        wgl_h.C_INT.withName("iBorderWidth"),
        wgl_h.C_INT.withName("iScrollWidth"),
        wgl_h.C_INT.withName("iScrollHeight"),
        wgl_h.C_INT.withName("iCaptionWidth"),
        wgl_h.C_INT.withName("iCaptionHeight"),
        tagLOGFONTA.layout().withName("lfCaptionFont"),
        wgl_h.C_INT.withName("iSmCaptionWidth"),
        wgl_h.C_INT.withName("iSmCaptionHeight"),
        tagLOGFONTA.layout().withName("lfSmCaptionFont"),
        wgl_h.C_INT.withName("iMenuWidth"),
        wgl_h.C_INT.withName("iMenuHeight"),
        tagLOGFONTA.layout().withName("lfMenuFont"),
        tagLOGFONTA.layout().withName("lfStatusFont"),
        tagLOGFONTA.layout().withName("lfMessageFont"),
        wgl_h.C_INT.withName("iPaddedBorderWidth")
    ).withName("tagNONCLIENTMETRICSA");

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

    private static final OfInt iBorderWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iBorderWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int iBorderWidth
     * }
     */
    public static final OfInt iBorderWidth$layout() {
        return iBorderWidth$LAYOUT;
    }

    private static final long iBorderWidth$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int iBorderWidth
     * }
     */
    public static final long iBorderWidth$offset() {
        return iBorderWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int iBorderWidth
     * }
     */
    public static int iBorderWidth(MemorySegment struct) {
        return struct.get(iBorderWidth$LAYOUT, iBorderWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int iBorderWidth
     * }
     */
    public static void iBorderWidth(MemorySegment struct, int fieldValue) {
        struct.set(iBorderWidth$LAYOUT, iBorderWidth$OFFSET, fieldValue);
    }

    private static final OfInt iScrollWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iScrollWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int iScrollWidth
     * }
     */
    public static final OfInt iScrollWidth$layout() {
        return iScrollWidth$LAYOUT;
    }

    private static final long iScrollWidth$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int iScrollWidth
     * }
     */
    public static final long iScrollWidth$offset() {
        return iScrollWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int iScrollWidth
     * }
     */
    public static int iScrollWidth(MemorySegment struct) {
        return struct.get(iScrollWidth$LAYOUT, iScrollWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int iScrollWidth
     * }
     */
    public static void iScrollWidth(MemorySegment struct, int fieldValue) {
        struct.set(iScrollWidth$LAYOUT, iScrollWidth$OFFSET, fieldValue);
    }

    private static final OfInt iScrollHeight$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iScrollHeight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int iScrollHeight
     * }
     */
    public static final OfInt iScrollHeight$layout() {
        return iScrollHeight$LAYOUT;
    }

    private static final long iScrollHeight$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int iScrollHeight
     * }
     */
    public static final long iScrollHeight$offset() {
        return iScrollHeight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int iScrollHeight
     * }
     */
    public static int iScrollHeight(MemorySegment struct) {
        return struct.get(iScrollHeight$LAYOUT, iScrollHeight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int iScrollHeight
     * }
     */
    public static void iScrollHeight(MemorySegment struct, int fieldValue) {
        struct.set(iScrollHeight$LAYOUT, iScrollHeight$OFFSET, fieldValue);
    }

    private static final OfInt iCaptionWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iCaptionWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int iCaptionWidth
     * }
     */
    public static final OfInt iCaptionWidth$layout() {
        return iCaptionWidth$LAYOUT;
    }

    private static final long iCaptionWidth$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int iCaptionWidth
     * }
     */
    public static final long iCaptionWidth$offset() {
        return iCaptionWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int iCaptionWidth
     * }
     */
    public static int iCaptionWidth(MemorySegment struct) {
        return struct.get(iCaptionWidth$LAYOUT, iCaptionWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int iCaptionWidth
     * }
     */
    public static void iCaptionWidth(MemorySegment struct, int fieldValue) {
        struct.set(iCaptionWidth$LAYOUT, iCaptionWidth$OFFSET, fieldValue);
    }

    private static final OfInt iCaptionHeight$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iCaptionHeight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int iCaptionHeight
     * }
     */
    public static final OfInt iCaptionHeight$layout() {
        return iCaptionHeight$LAYOUT;
    }

    private static final long iCaptionHeight$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int iCaptionHeight
     * }
     */
    public static final long iCaptionHeight$offset() {
        return iCaptionHeight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int iCaptionHeight
     * }
     */
    public static int iCaptionHeight(MemorySegment struct) {
        return struct.get(iCaptionHeight$LAYOUT, iCaptionHeight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int iCaptionHeight
     * }
     */
    public static void iCaptionHeight(MemorySegment struct, int fieldValue) {
        struct.set(iCaptionHeight$LAYOUT, iCaptionHeight$OFFSET, fieldValue);
    }

    private static final GroupLayout lfCaptionFont$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("lfCaptionFont"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LOGFONTA lfCaptionFont
     * }
     */
    public static final GroupLayout lfCaptionFont$layout() {
        return lfCaptionFont$LAYOUT;
    }

    private static final long lfCaptionFont$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LOGFONTA lfCaptionFont
     * }
     */
    public static final long lfCaptionFont$offset() {
        return lfCaptionFont$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LOGFONTA lfCaptionFont
     * }
     */
    public static MemorySegment lfCaptionFont(MemorySegment struct) {
        return struct.asSlice(lfCaptionFont$OFFSET, lfCaptionFont$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LOGFONTA lfCaptionFont
     * }
     */
    public static void lfCaptionFont(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lfCaptionFont$OFFSET, lfCaptionFont$LAYOUT.byteSize());
    }

    private static final OfInt iSmCaptionWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iSmCaptionWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int iSmCaptionWidth
     * }
     */
    public static final OfInt iSmCaptionWidth$layout() {
        return iSmCaptionWidth$LAYOUT;
    }

    private static final long iSmCaptionWidth$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int iSmCaptionWidth
     * }
     */
    public static final long iSmCaptionWidth$offset() {
        return iSmCaptionWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int iSmCaptionWidth
     * }
     */
    public static int iSmCaptionWidth(MemorySegment struct) {
        return struct.get(iSmCaptionWidth$LAYOUT, iSmCaptionWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int iSmCaptionWidth
     * }
     */
    public static void iSmCaptionWidth(MemorySegment struct, int fieldValue) {
        struct.set(iSmCaptionWidth$LAYOUT, iSmCaptionWidth$OFFSET, fieldValue);
    }

    private static final OfInt iSmCaptionHeight$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iSmCaptionHeight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int iSmCaptionHeight
     * }
     */
    public static final OfInt iSmCaptionHeight$layout() {
        return iSmCaptionHeight$LAYOUT;
    }

    private static final long iSmCaptionHeight$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int iSmCaptionHeight
     * }
     */
    public static final long iSmCaptionHeight$offset() {
        return iSmCaptionHeight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int iSmCaptionHeight
     * }
     */
    public static int iSmCaptionHeight(MemorySegment struct) {
        return struct.get(iSmCaptionHeight$LAYOUT, iSmCaptionHeight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int iSmCaptionHeight
     * }
     */
    public static void iSmCaptionHeight(MemorySegment struct, int fieldValue) {
        struct.set(iSmCaptionHeight$LAYOUT, iSmCaptionHeight$OFFSET, fieldValue);
    }

    private static final GroupLayout lfSmCaptionFont$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("lfSmCaptionFont"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LOGFONTA lfSmCaptionFont
     * }
     */
    public static final GroupLayout lfSmCaptionFont$layout() {
        return lfSmCaptionFont$LAYOUT;
    }

    private static final long lfSmCaptionFont$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LOGFONTA lfSmCaptionFont
     * }
     */
    public static final long lfSmCaptionFont$offset() {
        return lfSmCaptionFont$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LOGFONTA lfSmCaptionFont
     * }
     */
    public static MemorySegment lfSmCaptionFont(MemorySegment struct) {
        return struct.asSlice(lfSmCaptionFont$OFFSET, lfSmCaptionFont$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LOGFONTA lfSmCaptionFont
     * }
     */
    public static void lfSmCaptionFont(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lfSmCaptionFont$OFFSET, lfSmCaptionFont$LAYOUT.byteSize());
    }

    private static final OfInt iMenuWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iMenuWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int iMenuWidth
     * }
     */
    public static final OfInt iMenuWidth$layout() {
        return iMenuWidth$LAYOUT;
    }

    private static final long iMenuWidth$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int iMenuWidth
     * }
     */
    public static final long iMenuWidth$offset() {
        return iMenuWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int iMenuWidth
     * }
     */
    public static int iMenuWidth(MemorySegment struct) {
        return struct.get(iMenuWidth$LAYOUT, iMenuWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int iMenuWidth
     * }
     */
    public static void iMenuWidth(MemorySegment struct, int fieldValue) {
        struct.set(iMenuWidth$LAYOUT, iMenuWidth$OFFSET, fieldValue);
    }

    private static final OfInt iMenuHeight$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iMenuHeight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int iMenuHeight
     * }
     */
    public static final OfInt iMenuHeight$layout() {
        return iMenuHeight$LAYOUT;
    }

    private static final long iMenuHeight$OFFSET = 156;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int iMenuHeight
     * }
     */
    public static final long iMenuHeight$offset() {
        return iMenuHeight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int iMenuHeight
     * }
     */
    public static int iMenuHeight(MemorySegment struct) {
        return struct.get(iMenuHeight$LAYOUT, iMenuHeight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int iMenuHeight
     * }
     */
    public static void iMenuHeight(MemorySegment struct, int fieldValue) {
        struct.set(iMenuHeight$LAYOUT, iMenuHeight$OFFSET, fieldValue);
    }

    private static final GroupLayout lfMenuFont$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("lfMenuFont"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LOGFONTA lfMenuFont
     * }
     */
    public static final GroupLayout lfMenuFont$layout() {
        return lfMenuFont$LAYOUT;
    }

    private static final long lfMenuFont$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LOGFONTA lfMenuFont
     * }
     */
    public static final long lfMenuFont$offset() {
        return lfMenuFont$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LOGFONTA lfMenuFont
     * }
     */
    public static MemorySegment lfMenuFont(MemorySegment struct) {
        return struct.asSlice(lfMenuFont$OFFSET, lfMenuFont$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LOGFONTA lfMenuFont
     * }
     */
    public static void lfMenuFont(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lfMenuFont$OFFSET, lfMenuFont$LAYOUT.byteSize());
    }

    private static final GroupLayout lfStatusFont$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("lfStatusFont"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LOGFONTA lfStatusFont
     * }
     */
    public static final GroupLayout lfStatusFont$layout() {
        return lfStatusFont$LAYOUT;
    }

    private static final long lfStatusFont$OFFSET = 220;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LOGFONTA lfStatusFont
     * }
     */
    public static final long lfStatusFont$offset() {
        return lfStatusFont$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LOGFONTA lfStatusFont
     * }
     */
    public static MemorySegment lfStatusFont(MemorySegment struct) {
        return struct.asSlice(lfStatusFont$OFFSET, lfStatusFont$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LOGFONTA lfStatusFont
     * }
     */
    public static void lfStatusFont(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lfStatusFont$OFFSET, lfStatusFont$LAYOUT.byteSize());
    }

    private static final GroupLayout lfMessageFont$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("lfMessageFont"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LOGFONTA lfMessageFont
     * }
     */
    public static final GroupLayout lfMessageFont$layout() {
        return lfMessageFont$LAYOUT;
    }

    private static final long lfMessageFont$OFFSET = 280;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LOGFONTA lfMessageFont
     * }
     */
    public static final long lfMessageFont$offset() {
        return lfMessageFont$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LOGFONTA lfMessageFont
     * }
     */
    public static MemorySegment lfMessageFont(MemorySegment struct) {
        return struct.asSlice(lfMessageFont$OFFSET, lfMessageFont$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LOGFONTA lfMessageFont
     * }
     */
    public static void lfMessageFont(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lfMessageFont$OFFSET, lfMessageFont$LAYOUT.byteSize());
    }

    private static final OfInt iPaddedBorderWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iPaddedBorderWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int iPaddedBorderWidth
     * }
     */
    public static final OfInt iPaddedBorderWidth$layout() {
        return iPaddedBorderWidth$LAYOUT;
    }

    private static final long iPaddedBorderWidth$OFFSET = 340;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int iPaddedBorderWidth
     * }
     */
    public static final long iPaddedBorderWidth$offset() {
        return iPaddedBorderWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int iPaddedBorderWidth
     * }
     */
    public static int iPaddedBorderWidth(MemorySegment struct) {
        return struct.get(iPaddedBorderWidth$LAYOUT, iPaddedBorderWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int iPaddedBorderWidth
     * }
     */
    public static void iPaddedBorderWidth(MemorySegment struct, int fieldValue) {
        struct.set(iPaddedBorderWidth$LAYOUT, iPaddedBorderWidth$OFFSET, fieldValue);
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

