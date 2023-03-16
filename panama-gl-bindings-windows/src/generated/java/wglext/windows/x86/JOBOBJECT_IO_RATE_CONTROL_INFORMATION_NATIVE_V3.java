// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("MaxIops"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("MaxBandwidth"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ReservationIops"),
        Constants$root.C_POINTER$LAYOUT.withName("VolumeName"),
        Constants$root.C_LONG$LAYOUT.withName("BaseIoSize"),
        Constants$root.C_LONG$LAYOUT.withName("ControlFlags"),
        Constants$root.C_SHORT$LAYOUT.withName("VolumeNameLength"),
        MemoryLayout.paddingLayout(48),
        Constants$root.C_LONG_LONG$LAYOUT.withName("CriticalReservationIops"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ReservationBandwidth"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("CriticalReservationBandwidth"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("MaxTimePercent"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ReservationTimePercent"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("CriticalReservationTimePercent"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("SoftMaxIops"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("SoftMaxBandwidth"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("SoftMaxTimePercent"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LimitExcessNotifyIops"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LimitExcessNotifyBandwidth"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LimitExcessNotifyTimePercent")
    ).withName("JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3");
    public static MemoryLayout $LAYOUT() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.$struct$LAYOUT;
    }
    static final VarHandle MaxIops$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxIops"));
    public static VarHandle MaxIops$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxIops$VH;
    }
    public static long MaxIops$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxIops$VH.get(seg);
    }
    public static void MaxIops$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxIops$VH.set(seg, x);
    }
    public static long MaxIops$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxIops$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxIops$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxIops$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxBandwidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxBandwidth"));
    public static VarHandle MaxBandwidth$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxBandwidth$VH;
    }
    public static long MaxBandwidth$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxBandwidth$VH.get(seg);
    }
    public static void MaxBandwidth$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxBandwidth$VH.set(seg, x);
    }
    public static long MaxBandwidth$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxBandwidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxBandwidth$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxBandwidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReservationIops$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReservationIops"));
    public static VarHandle ReservationIops$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationIops$VH;
    }
    public static long ReservationIops$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationIops$VH.get(seg);
    }
    public static void ReservationIops$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationIops$VH.set(seg, x);
    }
    public static long ReservationIops$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationIops$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReservationIops$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationIops$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VolumeName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VolumeName"));
    public static VarHandle VolumeName$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.VolumeName$VH;
    }
    public static MemoryAddress VolumeName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.VolumeName$VH.get(seg);
    }
    public static void VolumeName$set( MemorySegment seg, MemoryAddress x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.VolumeName$VH.set(seg, x);
    }
    public static MemoryAddress VolumeName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.VolumeName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeName$set(MemorySegment seg, long index, MemoryAddress x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.VolumeName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaseIoSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseIoSize"));
    public static VarHandle BaseIoSize$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.BaseIoSize$VH;
    }
    public static int BaseIoSize$get(MemorySegment seg) {
        return (int)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.BaseIoSize$VH.get(seg);
    }
    public static void BaseIoSize$set( MemorySegment seg, int x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.BaseIoSize$VH.set(seg, x);
    }
    public static int BaseIoSize$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.BaseIoSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseIoSize$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.BaseIoSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ControlFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ControlFlags"));
    public static VarHandle ControlFlags$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ControlFlags$VH;
    }
    public static int ControlFlags$get(MemorySegment seg) {
        return (int)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ControlFlags$VH.get(seg);
    }
    public static void ControlFlags$set( MemorySegment seg, int x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ControlFlags$VH.set(seg, x);
    }
    public static int ControlFlags$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ControlFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlFlags$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ControlFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VolumeNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VolumeNameLength"));
    public static VarHandle VolumeNameLength$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.VolumeNameLength$VH;
    }
    public static short VolumeNameLength$get(MemorySegment seg) {
        return (short)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.VolumeNameLength$VH.get(seg);
    }
    public static void VolumeNameLength$set( MemorySegment seg, short x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.VolumeNameLength$VH.set(seg, x);
    }
    public static short VolumeNameLength$get(MemorySegment seg, long index) {
        return (short)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.VolumeNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeNameLength$set(MemorySegment seg, long index, short x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.VolumeNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CriticalReservationIops$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CriticalReservationIops"));
    public static VarHandle CriticalReservationIops$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationIops$VH;
    }
    public static long CriticalReservationIops$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationIops$VH.get(seg);
    }
    public static void CriticalReservationIops$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationIops$VH.set(seg, x);
    }
    public static long CriticalReservationIops$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationIops$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CriticalReservationIops$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationIops$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReservationBandwidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReservationBandwidth"));
    public static VarHandle ReservationBandwidth$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationBandwidth$VH;
    }
    public static long ReservationBandwidth$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationBandwidth$VH.get(seg);
    }
    public static void ReservationBandwidth$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationBandwidth$VH.set(seg, x);
    }
    public static long ReservationBandwidth$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationBandwidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReservationBandwidth$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationBandwidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CriticalReservationBandwidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CriticalReservationBandwidth"));
    public static VarHandle CriticalReservationBandwidth$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationBandwidth$VH;
    }
    public static long CriticalReservationBandwidth$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationBandwidth$VH.get(seg);
    }
    public static void CriticalReservationBandwidth$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationBandwidth$VH.set(seg, x);
    }
    public static long CriticalReservationBandwidth$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationBandwidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CriticalReservationBandwidth$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationBandwidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxTimePercent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxTimePercent"));
    public static VarHandle MaxTimePercent$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxTimePercent$VH;
    }
    public static long MaxTimePercent$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxTimePercent$VH.get(seg);
    }
    public static void MaxTimePercent$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxTimePercent$VH.set(seg, x);
    }
    public static long MaxTimePercent$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxTimePercent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxTimePercent$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.MaxTimePercent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReservationTimePercent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReservationTimePercent"));
    public static VarHandle ReservationTimePercent$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationTimePercent$VH;
    }
    public static long ReservationTimePercent$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationTimePercent$VH.get(seg);
    }
    public static void ReservationTimePercent$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationTimePercent$VH.set(seg, x);
    }
    public static long ReservationTimePercent$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationTimePercent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReservationTimePercent$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.ReservationTimePercent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CriticalReservationTimePercent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CriticalReservationTimePercent"));
    public static VarHandle CriticalReservationTimePercent$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationTimePercent$VH;
    }
    public static long CriticalReservationTimePercent$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationTimePercent$VH.get(seg);
    }
    public static void CriticalReservationTimePercent$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationTimePercent$VH.set(seg, x);
    }
    public static long CriticalReservationTimePercent$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationTimePercent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CriticalReservationTimePercent$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.CriticalReservationTimePercent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SoftMaxIops$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SoftMaxIops"));
    public static VarHandle SoftMaxIops$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxIops$VH;
    }
    public static long SoftMaxIops$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxIops$VH.get(seg);
    }
    public static void SoftMaxIops$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxIops$VH.set(seg, x);
    }
    public static long SoftMaxIops$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxIops$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SoftMaxIops$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxIops$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SoftMaxBandwidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SoftMaxBandwidth"));
    public static VarHandle SoftMaxBandwidth$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxBandwidth$VH;
    }
    public static long SoftMaxBandwidth$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxBandwidth$VH.get(seg);
    }
    public static void SoftMaxBandwidth$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxBandwidth$VH.set(seg, x);
    }
    public static long SoftMaxBandwidth$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxBandwidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SoftMaxBandwidth$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxBandwidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SoftMaxTimePercent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SoftMaxTimePercent"));
    public static VarHandle SoftMaxTimePercent$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxTimePercent$VH;
    }
    public static long SoftMaxTimePercent$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxTimePercent$VH.get(seg);
    }
    public static void SoftMaxTimePercent$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxTimePercent$VH.set(seg, x);
    }
    public static long SoftMaxTimePercent$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxTimePercent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SoftMaxTimePercent$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.SoftMaxTimePercent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LimitExcessNotifyIops$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LimitExcessNotifyIops"));
    public static VarHandle LimitExcessNotifyIops$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyIops$VH;
    }
    public static long LimitExcessNotifyIops$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyIops$VH.get(seg);
    }
    public static void LimitExcessNotifyIops$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyIops$VH.set(seg, x);
    }
    public static long LimitExcessNotifyIops$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyIops$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LimitExcessNotifyIops$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyIops$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LimitExcessNotifyBandwidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LimitExcessNotifyBandwidth"));
    public static VarHandle LimitExcessNotifyBandwidth$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyBandwidth$VH;
    }
    public static long LimitExcessNotifyBandwidth$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyBandwidth$VH.get(seg);
    }
    public static void LimitExcessNotifyBandwidth$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyBandwidth$VH.set(seg, x);
    }
    public static long LimitExcessNotifyBandwidth$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyBandwidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LimitExcessNotifyBandwidth$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyBandwidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LimitExcessNotifyTimePercent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LimitExcessNotifyTimePercent"));
    public static VarHandle LimitExcessNotifyTimePercent$VH() {
        return JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyTimePercent$VH;
    }
    public static long LimitExcessNotifyTimePercent$get(MemorySegment seg) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyTimePercent$VH.get(seg);
    }
    public static void LimitExcessNotifyTimePercent$set( MemorySegment seg, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyTimePercent$VH.set(seg, x);
    }
    public static long LimitExcessNotifyTimePercent$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyTimePercent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LimitExcessNotifyTimePercent$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3.LimitExcessNotifyTimePercent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


