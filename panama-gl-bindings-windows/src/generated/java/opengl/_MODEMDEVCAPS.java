// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MODEMDEVCAPS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwActualSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwRequiredSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwDevSpecificOffset"),
        Constants$root.C_LONG$LAYOUT.withName("dwDevSpecificSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwModemProviderVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwModemManufacturerOffset"),
        Constants$root.C_LONG$LAYOUT.withName("dwModemManufacturerSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwModemModelOffset"),
        Constants$root.C_LONG$LAYOUT.withName("dwModemModelSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwModemVersionOffset"),
        Constants$root.C_LONG$LAYOUT.withName("dwModemVersionSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwDialOptions"),
        Constants$root.C_LONG$LAYOUT.withName("dwCallSetupFailTimer"),
        Constants$root.C_LONG$LAYOUT.withName("dwInactivityTimeout"),
        Constants$root.C_LONG$LAYOUT.withName("dwSpeakerVolume"),
        Constants$root.C_LONG$LAYOUT.withName("dwSpeakerMode"),
        Constants$root.C_LONG$LAYOUT.withName("dwModemOptions"),
        Constants$root.C_LONG$LAYOUT.withName("dwMaxDTERate"),
        Constants$root.C_LONG$LAYOUT.withName("dwMaxDCERate"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("abVariablePortion"),
        MemoryLayout.paddingLayout(24)
    ).withName("_MODEMDEVCAPS");
    public static MemoryLayout $LAYOUT() {
        return _MODEMDEVCAPS.$struct$LAYOUT;
    }
    static final VarHandle dwActualSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwActualSize"));
    public static VarHandle dwActualSize$VH() {
        return _MODEMDEVCAPS.dwActualSize$VH;
    }
    public static int dwActualSize$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwActualSize$VH.get(seg);
    }
    public static void dwActualSize$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwActualSize$VH.set(seg, x);
    }
    public static int dwActualSize$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwActualSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwActualSize$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwActualSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRequiredSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRequiredSize"));
    public static VarHandle dwRequiredSize$VH() {
        return _MODEMDEVCAPS.dwRequiredSize$VH;
    }
    public static int dwRequiredSize$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwRequiredSize$VH.get(seg);
    }
    public static void dwRequiredSize$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwRequiredSize$VH.set(seg, x);
    }
    public static int dwRequiredSize$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwRequiredSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRequiredSize$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwRequiredSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDevSpecificOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDevSpecificOffset"));
    public static VarHandle dwDevSpecificOffset$VH() {
        return _MODEMDEVCAPS.dwDevSpecificOffset$VH;
    }
    public static int dwDevSpecificOffset$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwDevSpecificOffset$VH.get(seg);
    }
    public static void dwDevSpecificOffset$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwDevSpecificOffset$VH.set(seg, x);
    }
    public static int dwDevSpecificOffset$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwDevSpecificOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDevSpecificOffset$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwDevSpecificOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDevSpecificSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDevSpecificSize"));
    public static VarHandle dwDevSpecificSize$VH() {
        return _MODEMDEVCAPS.dwDevSpecificSize$VH;
    }
    public static int dwDevSpecificSize$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwDevSpecificSize$VH.get(seg);
    }
    public static void dwDevSpecificSize$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwDevSpecificSize$VH.set(seg, x);
    }
    public static int dwDevSpecificSize$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwDevSpecificSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDevSpecificSize$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwDevSpecificSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwModemProviderVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwModemProviderVersion"));
    public static VarHandle dwModemProviderVersion$VH() {
        return _MODEMDEVCAPS.dwModemProviderVersion$VH;
    }
    public static int dwModemProviderVersion$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwModemProviderVersion$VH.get(seg);
    }
    public static void dwModemProviderVersion$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwModemProviderVersion$VH.set(seg, x);
    }
    public static int dwModemProviderVersion$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwModemProviderVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwModemProviderVersion$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwModemProviderVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwModemManufacturerOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwModemManufacturerOffset"));
    public static VarHandle dwModemManufacturerOffset$VH() {
        return _MODEMDEVCAPS.dwModemManufacturerOffset$VH;
    }
    public static int dwModemManufacturerOffset$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwModemManufacturerOffset$VH.get(seg);
    }
    public static void dwModemManufacturerOffset$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwModemManufacturerOffset$VH.set(seg, x);
    }
    public static int dwModemManufacturerOffset$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwModemManufacturerOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwModemManufacturerOffset$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwModemManufacturerOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwModemManufacturerSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwModemManufacturerSize"));
    public static VarHandle dwModemManufacturerSize$VH() {
        return _MODEMDEVCAPS.dwModemManufacturerSize$VH;
    }
    public static int dwModemManufacturerSize$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwModemManufacturerSize$VH.get(seg);
    }
    public static void dwModemManufacturerSize$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwModemManufacturerSize$VH.set(seg, x);
    }
    public static int dwModemManufacturerSize$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwModemManufacturerSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwModemManufacturerSize$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwModemManufacturerSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwModemModelOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwModemModelOffset"));
    public static VarHandle dwModemModelOffset$VH() {
        return _MODEMDEVCAPS.dwModemModelOffset$VH;
    }
    public static int dwModemModelOffset$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwModemModelOffset$VH.get(seg);
    }
    public static void dwModemModelOffset$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwModemModelOffset$VH.set(seg, x);
    }
    public static int dwModemModelOffset$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwModemModelOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwModemModelOffset$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwModemModelOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwModemModelSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwModemModelSize"));
    public static VarHandle dwModemModelSize$VH() {
        return _MODEMDEVCAPS.dwModemModelSize$VH;
    }
    public static int dwModemModelSize$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwModemModelSize$VH.get(seg);
    }
    public static void dwModemModelSize$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwModemModelSize$VH.set(seg, x);
    }
    public static int dwModemModelSize$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwModemModelSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwModemModelSize$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwModemModelSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwModemVersionOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwModemVersionOffset"));
    public static VarHandle dwModemVersionOffset$VH() {
        return _MODEMDEVCAPS.dwModemVersionOffset$VH;
    }
    public static int dwModemVersionOffset$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwModemVersionOffset$VH.get(seg);
    }
    public static void dwModemVersionOffset$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwModemVersionOffset$VH.set(seg, x);
    }
    public static int dwModemVersionOffset$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwModemVersionOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwModemVersionOffset$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwModemVersionOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwModemVersionSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwModemVersionSize"));
    public static VarHandle dwModemVersionSize$VH() {
        return _MODEMDEVCAPS.dwModemVersionSize$VH;
    }
    public static int dwModemVersionSize$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwModemVersionSize$VH.get(seg);
    }
    public static void dwModemVersionSize$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwModemVersionSize$VH.set(seg, x);
    }
    public static int dwModemVersionSize$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwModemVersionSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwModemVersionSize$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwModemVersionSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDialOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDialOptions"));
    public static VarHandle dwDialOptions$VH() {
        return _MODEMDEVCAPS.dwDialOptions$VH;
    }
    public static int dwDialOptions$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwDialOptions$VH.get(seg);
    }
    public static void dwDialOptions$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwDialOptions$VH.set(seg, x);
    }
    public static int dwDialOptions$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwDialOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDialOptions$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwDialOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCallSetupFailTimer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallSetupFailTimer"));
    public static VarHandle dwCallSetupFailTimer$VH() {
        return _MODEMDEVCAPS.dwCallSetupFailTimer$VH;
    }
    public static int dwCallSetupFailTimer$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwCallSetupFailTimer$VH.get(seg);
    }
    public static void dwCallSetupFailTimer$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwCallSetupFailTimer$VH.set(seg, x);
    }
    public static int dwCallSetupFailTimer$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwCallSetupFailTimer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallSetupFailTimer$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwCallSetupFailTimer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwInactivityTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwInactivityTimeout"));
    public static VarHandle dwInactivityTimeout$VH() {
        return _MODEMDEVCAPS.dwInactivityTimeout$VH;
    }
    public static int dwInactivityTimeout$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwInactivityTimeout$VH.get(seg);
    }
    public static void dwInactivityTimeout$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwInactivityTimeout$VH.set(seg, x);
    }
    public static int dwInactivityTimeout$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwInactivityTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInactivityTimeout$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwInactivityTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSpeakerVolume$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSpeakerVolume"));
    public static VarHandle dwSpeakerVolume$VH() {
        return _MODEMDEVCAPS.dwSpeakerVolume$VH;
    }
    public static int dwSpeakerVolume$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwSpeakerVolume$VH.get(seg);
    }
    public static void dwSpeakerVolume$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwSpeakerVolume$VH.set(seg, x);
    }
    public static int dwSpeakerVolume$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwSpeakerVolume$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSpeakerVolume$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwSpeakerVolume$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSpeakerMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSpeakerMode"));
    public static VarHandle dwSpeakerMode$VH() {
        return _MODEMDEVCAPS.dwSpeakerMode$VH;
    }
    public static int dwSpeakerMode$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwSpeakerMode$VH.get(seg);
    }
    public static void dwSpeakerMode$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwSpeakerMode$VH.set(seg, x);
    }
    public static int dwSpeakerMode$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwSpeakerMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSpeakerMode$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwSpeakerMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwModemOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwModemOptions"));
    public static VarHandle dwModemOptions$VH() {
        return _MODEMDEVCAPS.dwModemOptions$VH;
    }
    public static int dwModemOptions$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwModemOptions$VH.get(seg);
    }
    public static void dwModemOptions$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwModemOptions$VH.set(seg, x);
    }
    public static int dwModemOptions$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwModemOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwModemOptions$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwModemOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMaxDTERate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMaxDTERate"));
    public static VarHandle dwMaxDTERate$VH() {
        return _MODEMDEVCAPS.dwMaxDTERate$VH;
    }
    public static int dwMaxDTERate$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwMaxDTERate$VH.get(seg);
    }
    public static void dwMaxDTERate$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwMaxDTERate$VH.set(seg, x);
    }
    public static int dwMaxDTERate$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwMaxDTERate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxDTERate$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwMaxDTERate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMaxDCERate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMaxDCERate"));
    public static VarHandle dwMaxDCERate$VH() {
        return _MODEMDEVCAPS.dwMaxDCERate$VH;
    }
    public static int dwMaxDCERate$get(MemorySegment seg) {
        return (int)_MODEMDEVCAPS.dwMaxDCERate$VH.get(seg);
    }
    public static void dwMaxDCERate$set( MemorySegment seg, int x) {
        _MODEMDEVCAPS.dwMaxDCERate$VH.set(seg, x);
    }
    public static int dwMaxDCERate$get(MemorySegment seg, long index) {
        return (int)_MODEMDEVCAPS.dwMaxDCERate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxDCERate$set(MemorySegment seg, long index, int x) {
        _MODEMDEVCAPS.dwMaxDCERate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment abVariablePortion$slice(MemorySegment seg) {
        return seg.asSlice(76, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


