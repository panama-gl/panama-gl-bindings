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
 * struct _MODEMDEVCAPS {
 *     DWORD dwActualSize;
 *     DWORD dwRequiredSize;
 *     DWORD dwDevSpecificOffset;
 *     DWORD dwDevSpecificSize;
 *     DWORD dwModemProviderVersion;
 *     DWORD dwModemManufacturerOffset;
 *     DWORD dwModemManufacturerSize;
 *     DWORD dwModemModelOffset;
 *     DWORD dwModemModelSize;
 *     DWORD dwModemVersionOffset;
 *     DWORD dwModemVersionSize;
 *     DWORD dwDialOptions;
 *     DWORD dwCallSetupFailTimer;
 *     DWORD dwInactivityTimeout;
 *     DWORD dwSpeakerVolume;
 *     DWORD dwSpeakerMode;
 *     DWORD dwModemOptions;
 *     DWORD dwMaxDTERate;
 *     DWORD dwMaxDCERate;
 *     BYTE abVariablePortion[1];
 * }
 * }
 */
public class _MODEMDEVCAPS {

    _MODEMDEVCAPS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        freeglut_h.C_LONG.withName("dwActualSize"),
        freeglut_h.C_LONG.withName("dwRequiredSize"),
        freeglut_h.C_LONG.withName("dwDevSpecificOffset"),
        freeglut_h.C_LONG.withName("dwDevSpecificSize"),
        freeglut_h.C_LONG.withName("dwModemProviderVersion"),
        freeglut_h.C_LONG.withName("dwModemManufacturerOffset"),
        freeglut_h.C_LONG.withName("dwModemManufacturerSize"),
        freeglut_h.C_LONG.withName("dwModemModelOffset"),
        freeglut_h.C_LONG.withName("dwModemModelSize"),
        freeglut_h.C_LONG.withName("dwModemVersionOffset"),
        freeglut_h.C_LONG.withName("dwModemVersionSize"),
        freeglut_h.C_LONG.withName("dwDialOptions"),
        freeglut_h.C_LONG.withName("dwCallSetupFailTimer"),
        freeglut_h.C_LONG.withName("dwInactivityTimeout"),
        freeglut_h.C_LONG.withName("dwSpeakerVolume"),
        freeglut_h.C_LONG.withName("dwSpeakerMode"),
        freeglut_h.C_LONG.withName("dwModemOptions"),
        freeglut_h.C_LONG.withName("dwMaxDTERate"),
        freeglut_h.C_LONG.withName("dwMaxDCERate"),
        MemoryLayout.sequenceLayout(1, freeglut_h.C_CHAR).withName("abVariablePortion"),
        MemoryLayout.paddingLayout(3)
    ).withName("_MODEMDEVCAPS");

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

    private static final OfInt dwModemProviderVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwModemProviderVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwModemProviderVersion
     * }
     */
    public static final OfInt dwModemProviderVersion$layout() {
        return dwModemProviderVersion$LAYOUT;
    }

    private static final long dwModemProviderVersion$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwModemProviderVersion
     * }
     */
    public static final long dwModemProviderVersion$offset() {
        return dwModemProviderVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwModemProviderVersion
     * }
     */
    public static int dwModemProviderVersion(MemorySegment struct) {
        return struct.get(dwModemProviderVersion$LAYOUT, dwModemProviderVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwModemProviderVersion
     * }
     */
    public static void dwModemProviderVersion(MemorySegment struct, int fieldValue) {
        struct.set(dwModemProviderVersion$LAYOUT, dwModemProviderVersion$OFFSET, fieldValue);
    }

    private static final OfInt dwModemManufacturerOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwModemManufacturerOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwModemManufacturerOffset
     * }
     */
    public static final OfInt dwModemManufacturerOffset$layout() {
        return dwModemManufacturerOffset$LAYOUT;
    }

    private static final long dwModemManufacturerOffset$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwModemManufacturerOffset
     * }
     */
    public static final long dwModemManufacturerOffset$offset() {
        return dwModemManufacturerOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwModemManufacturerOffset
     * }
     */
    public static int dwModemManufacturerOffset(MemorySegment struct) {
        return struct.get(dwModemManufacturerOffset$LAYOUT, dwModemManufacturerOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwModemManufacturerOffset
     * }
     */
    public static void dwModemManufacturerOffset(MemorySegment struct, int fieldValue) {
        struct.set(dwModemManufacturerOffset$LAYOUT, dwModemManufacturerOffset$OFFSET, fieldValue);
    }

    private static final OfInt dwModemManufacturerSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwModemManufacturerSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwModemManufacturerSize
     * }
     */
    public static final OfInt dwModemManufacturerSize$layout() {
        return dwModemManufacturerSize$LAYOUT;
    }

    private static final long dwModemManufacturerSize$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwModemManufacturerSize
     * }
     */
    public static final long dwModemManufacturerSize$offset() {
        return dwModemManufacturerSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwModemManufacturerSize
     * }
     */
    public static int dwModemManufacturerSize(MemorySegment struct) {
        return struct.get(dwModemManufacturerSize$LAYOUT, dwModemManufacturerSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwModemManufacturerSize
     * }
     */
    public static void dwModemManufacturerSize(MemorySegment struct, int fieldValue) {
        struct.set(dwModemManufacturerSize$LAYOUT, dwModemManufacturerSize$OFFSET, fieldValue);
    }

    private static final OfInt dwModemModelOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwModemModelOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwModemModelOffset
     * }
     */
    public static final OfInt dwModemModelOffset$layout() {
        return dwModemModelOffset$LAYOUT;
    }

    private static final long dwModemModelOffset$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwModemModelOffset
     * }
     */
    public static final long dwModemModelOffset$offset() {
        return dwModemModelOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwModemModelOffset
     * }
     */
    public static int dwModemModelOffset(MemorySegment struct) {
        return struct.get(dwModemModelOffset$LAYOUT, dwModemModelOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwModemModelOffset
     * }
     */
    public static void dwModemModelOffset(MemorySegment struct, int fieldValue) {
        struct.set(dwModemModelOffset$LAYOUT, dwModemModelOffset$OFFSET, fieldValue);
    }

    private static final OfInt dwModemModelSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwModemModelSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwModemModelSize
     * }
     */
    public static final OfInt dwModemModelSize$layout() {
        return dwModemModelSize$LAYOUT;
    }

    private static final long dwModemModelSize$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwModemModelSize
     * }
     */
    public static final long dwModemModelSize$offset() {
        return dwModemModelSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwModemModelSize
     * }
     */
    public static int dwModemModelSize(MemorySegment struct) {
        return struct.get(dwModemModelSize$LAYOUT, dwModemModelSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwModemModelSize
     * }
     */
    public static void dwModemModelSize(MemorySegment struct, int fieldValue) {
        struct.set(dwModemModelSize$LAYOUT, dwModemModelSize$OFFSET, fieldValue);
    }

    private static final OfInt dwModemVersionOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwModemVersionOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwModemVersionOffset
     * }
     */
    public static final OfInt dwModemVersionOffset$layout() {
        return dwModemVersionOffset$LAYOUT;
    }

    private static final long dwModemVersionOffset$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwModemVersionOffset
     * }
     */
    public static final long dwModemVersionOffset$offset() {
        return dwModemVersionOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwModemVersionOffset
     * }
     */
    public static int dwModemVersionOffset(MemorySegment struct) {
        return struct.get(dwModemVersionOffset$LAYOUT, dwModemVersionOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwModemVersionOffset
     * }
     */
    public static void dwModemVersionOffset(MemorySegment struct, int fieldValue) {
        struct.set(dwModemVersionOffset$LAYOUT, dwModemVersionOffset$OFFSET, fieldValue);
    }

    private static final OfInt dwModemVersionSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwModemVersionSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwModemVersionSize
     * }
     */
    public static final OfInt dwModemVersionSize$layout() {
        return dwModemVersionSize$LAYOUT;
    }

    private static final long dwModemVersionSize$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwModemVersionSize
     * }
     */
    public static final long dwModemVersionSize$offset() {
        return dwModemVersionSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwModemVersionSize
     * }
     */
    public static int dwModemVersionSize(MemorySegment struct) {
        return struct.get(dwModemVersionSize$LAYOUT, dwModemVersionSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwModemVersionSize
     * }
     */
    public static void dwModemVersionSize(MemorySegment struct, int fieldValue) {
        struct.set(dwModemVersionSize$LAYOUT, dwModemVersionSize$OFFSET, fieldValue);
    }

    private static final OfInt dwDialOptions$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDialOptions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDialOptions
     * }
     */
    public static final OfInt dwDialOptions$layout() {
        return dwDialOptions$LAYOUT;
    }

    private static final long dwDialOptions$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDialOptions
     * }
     */
    public static final long dwDialOptions$offset() {
        return dwDialOptions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDialOptions
     * }
     */
    public static int dwDialOptions(MemorySegment struct) {
        return struct.get(dwDialOptions$LAYOUT, dwDialOptions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDialOptions
     * }
     */
    public static void dwDialOptions(MemorySegment struct, int fieldValue) {
        struct.set(dwDialOptions$LAYOUT, dwDialOptions$OFFSET, fieldValue);
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

    private static final long dwCallSetupFailTimer$OFFSET = 48;

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

    private static final long dwInactivityTimeout$OFFSET = 52;

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

    private static final long dwSpeakerVolume$OFFSET = 56;

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

    private static final long dwSpeakerMode$OFFSET = 60;

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

    private static final OfInt dwModemOptions$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwModemOptions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwModemOptions
     * }
     */
    public static final OfInt dwModemOptions$layout() {
        return dwModemOptions$LAYOUT;
    }

    private static final long dwModemOptions$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwModemOptions
     * }
     */
    public static final long dwModemOptions$offset() {
        return dwModemOptions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwModemOptions
     * }
     */
    public static int dwModemOptions(MemorySegment struct) {
        return struct.get(dwModemOptions$LAYOUT, dwModemOptions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwModemOptions
     * }
     */
    public static void dwModemOptions(MemorySegment struct, int fieldValue) {
        struct.set(dwModemOptions$LAYOUT, dwModemOptions$OFFSET, fieldValue);
    }

    private static final OfInt dwMaxDTERate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMaxDTERate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMaxDTERate
     * }
     */
    public static final OfInt dwMaxDTERate$layout() {
        return dwMaxDTERate$LAYOUT;
    }

    private static final long dwMaxDTERate$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMaxDTERate
     * }
     */
    public static final long dwMaxDTERate$offset() {
        return dwMaxDTERate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMaxDTERate
     * }
     */
    public static int dwMaxDTERate(MemorySegment struct) {
        return struct.get(dwMaxDTERate$LAYOUT, dwMaxDTERate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMaxDTERate
     * }
     */
    public static void dwMaxDTERate(MemorySegment struct, int fieldValue) {
        struct.set(dwMaxDTERate$LAYOUT, dwMaxDTERate$OFFSET, fieldValue);
    }

    private static final OfInt dwMaxDCERate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMaxDCERate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMaxDCERate
     * }
     */
    public static final OfInt dwMaxDCERate$layout() {
        return dwMaxDCERate$LAYOUT;
    }

    private static final long dwMaxDCERate$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMaxDCERate
     * }
     */
    public static final long dwMaxDCERate$offset() {
        return dwMaxDCERate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMaxDCERate
     * }
     */
    public static int dwMaxDCERate(MemorySegment struct) {
        return struct.get(dwMaxDCERate$LAYOUT, dwMaxDCERate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMaxDCERate
     * }
     */
    public static void dwMaxDCERate(MemorySegment struct, int fieldValue) {
        struct.set(dwMaxDCERate$LAYOUT, dwMaxDCERate$OFFSET, fieldValue);
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

    private static final long abVariablePortion$OFFSET = 76;

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

