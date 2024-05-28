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
 * struct _MODEMSETTINGS {
 *     DWORD dwActualSize;
 *     DWORD dwRequiredSize;
 *     DWORD dwDevSpecificOffset;
 *     DWORD dwDevSpecificSize;
 *     DWORD dwCallSetupFailTimer;
 *     DWORD dwInactivityTimeout;
 *     DWORD dwSpeakerVolume;
 *     DWORD dwSpeakerMode;
 *     DWORD dwPreferredModemOptions;
 *     DWORD dwNegotiatedModemOptions;
 *     DWORD dwNegotiatedDCERate;
 *     BYTE abVariablePortion[1];
 * }
 * }
 */
public class _MODEMSETTINGS {

    _MODEMSETTINGS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("dwActualSize"),
        freeglut_h.C_LONG.withName("dwRequiredSize"),
        freeglut_h.C_LONG.withName("dwDevSpecificOffset"),
        freeglut_h.C_LONG.withName("dwDevSpecificSize"),
        freeglut_h.C_LONG.withName("dwCallSetupFailTimer"),
        freeglut_h.C_LONG.withName("dwInactivityTimeout"),
        freeglut_h.C_LONG.withName("dwSpeakerVolume"),
        freeglut_h.C_LONG.withName("dwSpeakerMode"),
        freeglut_h.C_LONG.withName("dwPreferredModemOptions"),
        freeglut_h.C_LONG.withName("dwNegotiatedModemOptions"),
        freeglut_h.C_LONG.withName("dwNegotiatedDCERate"),
        MemoryLayout.sequenceLayout(1, freeglut_h.C_CHAR).withName("abVariablePortion"),
        MemoryLayout.paddingLayout(3)
    ).withName("_MODEMSETTINGS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwActualSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwActualSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwActualSize
     * }
     */
    public static final OfInt dwActualSize$layout() {
        return dwActualSize$LAYOUT;
    }

    private static final long dwActualSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwActualSize
     * }
     */
    public static final long dwActualSize$offset() {
        return dwActualSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwActualSize
     * }
     */
    public static int dwActualSize(MemorySegment struct) {
        return struct.get(dwActualSize$LAYOUT, dwActualSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwActualSize
     * }
     */
    public static void dwActualSize(MemorySegment struct, int fieldValue) {
        struct.set(dwActualSize$LAYOUT, dwActualSize$OFFSET, fieldValue);
    }

    private static final OfInt dwRequiredSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwRequiredSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwRequiredSize
     * }
     */
    public static final OfInt dwRequiredSize$layout() {
        return dwRequiredSize$LAYOUT;
    }

    private static final long dwRequiredSize$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwRequiredSize
     * }
     */
    public static final long dwRequiredSize$offset() {
        return dwRequiredSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwRequiredSize
     * }
     */
    public static int dwRequiredSize(MemorySegment struct) {
        return struct.get(dwRequiredSize$LAYOUT, dwRequiredSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwRequiredSize
     * }
     */
    public static void dwRequiredSize(MemorySegment struct, int fieldValue) {
        struct.set(dwRequiredSize$LAYOUT, dwRequiredSize$OFFSET, fieldValue);
    }

    private static final OfInt dwDevSpecificOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDevSpecificOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDevSpecificOffset
     * }
     */
    public static final OfInt dwDevSpecificOffset$layout() {
        return dwDevSpecificOffset$LAYOUT;
    }

    private static final long dwDevSpecificOffset$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDevSpecificOffset
     * }
     */
    public static final long dwDevSpecificOffset$offset() {
        return dwDevSpecificOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDevSpecificOffset
     * }
     */
    public static int dwDevSpecificOffset(MemorySegment struct) {
        return struct.get(dwDevSpecificOffset$LAYOUT, dwDevSpecificOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDevSpecificOffset
     * }
     */
    public static void dwDevSpecificOffset(MemorySegment struct, int fieldValue) {
        struct.set(dwDevSpecificOffset$LAYOUT, dwDevSpecificOffset$OFFSET, fieldValue);
    }

    private static final OfInt dwDevSpecificSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDevSpecificSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDevSpecificSize
     * }
     */
    public static final OfInt dwDevSpecificSize$layout() {
        return dwDevSpecificSize$LAYOUT;
    }

    private static final long dwDevSpecificSize$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDevSpecificSize
     * }
     */
    public static final long dwDevSpecificSize$offset() {
        return dwDevSpecificSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDevSpecificSize
     * }
     */
    public static int dwDevSpecificSize(MemorySegment struct) {
        return struct.get(dwDevSpecificSize$LAYOUT, dwDevSpecificSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDevSpecificSize
     * }
     */
    public static void dwDevSpecificSize(MemorySegment struct, int fieldValue) {
        struct.set(dwDevSpecificSize$LAYOUT, dwDevSpecificSize$OFFSET, fieldValue);
    }

    private static final OfInt dwCallSetupFailTimer$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCallSetupFailTimer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwCallSetupFailTimer
     * }
     */
    public static final OfInt dwCallSetupFailTimer$layout() {
        return dwCallSetupFailTimer$LAYOUT;
    }

    private static final long dwCallSetupFailTimer$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwCallSetupFailTimer
     * }
     */
    public static final long dwCallSetupFailTimer$offset() {
        return dwCallSetupFailTimer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwCallSetupFailTimer
     * }
     */
    public static int dwCallSetupFailTimer(MemorySegment struct) {
        return struct.get(dwCallSetupFailTimer$LAYOUT, dwCallSetupFailTimer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwCallSetupFailTimer
     * }
     */
    public static void dwCallSetupFailTimer(MemorySegment struct, int fieldValue) {
        struct.set(dwCallSetupFailTimer$LAYOUT, dwCallSetupFailTimer$OFFSET, fieldValue);
    }

    private static final OfInt dwInactivityTimeout$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwInactivityTimeout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwInactivityTimeout
     * }
     */
    public static final OfInt dwInactivityTimeout$layout() {
        return dwInactivityTimeout$LAYOUT;
    }

    private static final long dwInactivityTimeout$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwInactivityTimeout
     * }
     */
    public static final long dwInactivityTimeout$offset() {
        return dwInactivityTimeout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwInactivityTimeout
     * }
     */
    public static int dwInactivityTimeout(MemorySegment struct) {
        return struct.get(dwInactivityTimeout$LAYOUT, dwInactivityTimeout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwInactivityTimeout
     * }
     */
    public static void dwInactivityTimeout(MemorySegment struct, int fieldValue) {
        struct.set(dwInactivityTimeout$LAYOUT, dwInactivityTimeout$OFFSET, fieldValue);
    }

    private static final OfInt dwSpeakerVolume$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSpeakerVolume"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSpeakerVolume
     * }
     */
    public static final OfInt dwSpeakerVolume$layout() {
        return dwSpeakerVolume$LAYOUT;
    }

    private static final long dwSpeakerVolume$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSpeakerVolume
     * }
     */
    public static final long dwSpeakerVolume$offset() {
        return dwSpeakerVolume$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSpeakerVolume
     * }
     */
    public static int dwSpeakerVolume(MemorySegment struct) {
        return struct.get(dwSpeakerVolume$LAYOUT, dwSpeakerVolume$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSpeakerVolume
     * }
     */
    public static void dwSpeakerVolume(MemorySegment struct, int fieldValue) {
        struct.set(dwSpeakerVolume$LAYOUT, dwSpeakerVolume$OFFSET, fieldValue);
    }

    private static final OfInt dwSpeakerMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSpeakerMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSpeakerMode
     * }
     */
    public static final OfInt dwSpeakerMode$layout() {
        return dwSpeakerMode$LAYOUT;
    }

    private static final long dwSpeakerMode$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSpeakerMode
     * }
     */
    public static final long dwSpeakerMode$offset() {
        return dwSpeakerMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSpeakerMode
     * }
     */
    public static int dwSpeakerMode(MemorySegment struct) {
        return struct.get(dwSpeakerMode$LAYOUT, dwSpeakerMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSpeakerMode
     * }
     */
    public static void dwSpeakerMode(MemorySegment struct, int fieldValue) {
        struct.set(dwSpeakerMode$LAYOUT, dwSpeakerMode$OFFSET, fieldValue);
    }

    private static final OfInt dwPreferredModemOptions$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwPreferredModemOptions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwPreferredModemOptions
     * }
     */
    public static final OfInt dwPreferredModemOptions$layout() {
        return dwPreferredModemOptions$LAYOUT;
    }

    private static final long dwPreferredModemOptions$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwPreferredModemOptions
     * }
     */
    public static final long dwPreferredModemOptions$offset() {
        return dwPreferredModemOptions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwPreferredModemOptions
     * }
     */
    public static int dwPreferredModemOptions(MemorySegment struct) {
        return struct.get(dwPreferredModemOptions$LAYOUT, dwPreferredModemOptions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwPreferredModemOptions
     * }
     */
    public static void dwPreferredModemOptions(MemorySegment struct, int fieldValue) {
        struct.set(dwPreferredModemOptions$LAYOUT, dwPreferredModemOptions$OFFSET, fieldValue);
    }

    private static final OfInt dwNegotiatedModemOptions$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwNegotiatedModemOptions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwNegotiatedModemOptions
     * }
     */
    public static final OfInt dwNegotiatedModemOptions$layout() {
        return dwNegotiatedModemOptions$LAYOUT;
    }

    private static final long dwNegotiatedModemOptions$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwNegotiatedModemOptions
     * }
     */
    public static final long dwNegotiatedModemOptions$offset() {
        return dwNegotiatedModemOptions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwNegotiatedModemOptions
     * }
     */
    public static int dwNegotiatedModemOptions(MemorySegment struct) {
        return struct.get(dwNegotiatedModemOptions$LAYOUT, dwNegotiatedModemOptions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwNegotiatedModemOptions
     * }
     */
    public static void dwNegotiatedModemOptions(MemorySegment struct, int fieldValue) {
        struct.set(dwNegotiatedModemOptions$LAYOUT, dwNegotiatedModemOptions$OFFSET, fieldValue);
    }

    private static final OfInt dwNegotiatedDCERate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwNegotiatedDCERate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwNegotiatedDCERate
     * }
     */
    public static final OfInt dwNegotiatedDCERate$layout() {
        return dwNegotiatedDCERate$LAYOUT;
    }

    private static final long dwNegotiatedDCERate$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwNegotiatedDCERate
     * }
     */
    public static final long dwNegotiatedDCERate$offset() {
        return dwNegotiatedDCERate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwNegotiatedDCERate
     * }
     */
    public static int dwNegotiatedDCERate(MemorySegment struct) {
        return struct.get(dwNegotiatedDCERate$LAYOUT, dwNegotiatedDCERate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwNegotiatedDCERate
     * }
     */
    public static void dwNegotiatedDCERate(MemorySegment struct, int fieldValue) {
        struct.set(dwNegotiatedDCERate$LAYOUT, dwNegotiatedDCERate$OFFSET, fieldValue);
    }

    private static final SequenceLayout abVariablePortion$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("abVariablePortion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE abVariablePortion[1]
     * }
     */
    public static final SequenceLayout abVariablePortion$layout() {
        return abVariablePortion$LAYOUT;
    }

    private static final long abVariablePortion$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE abVariablePortion[1]
     * }
     */
    public static final long abVariablePortion$offset() {
        return abVariablePortion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE abVariablePortion[1]
     * }
     */
    public static MemorySegment abVariablePortion(MemorySegment struct) {
        return struct.asSlice(abVariablePortion$OFFSET, abVariablePortion$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE abVariablePortion[1]
     * }
     */
    public static void abVariablePortion(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, abVariablePortion$OFFSET, abVariablePortion$LAYOUT.byteSize());
    }

    private static long[] abVariablePortion$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE abVariablePortion[1]
     * }
     */
    public static long[] abVariablePortion$dimensions() {
        return abVariablePortion$DIMS;
    }
    private static final VarHandle abVariablePortion$ELEM_HANDLE = abVariablePortion$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE abVariablePortion[1]
     * }
     */
    public static byte abVariablePortion(MemorySegment struct, long index0) {
        return (byte)abVariablePortion$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE abVariablePortion[1]
     * }
     */
    public static void abVariablePortion(MemorySegment struct, long index0, byte fieldValue) {
        abVariablePortion$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

