// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("LimitFlags"),
        Constants$root.C_LONG$LAYOUT.withName("ViolationLimitFlags"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("IoReadBytes"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("IoReadBytesLimit"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("IoWriteBytes"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("IoWriteBytesLimit"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("PerJobUserTime"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("PerJobUserTimeLimit"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("JobMemory"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("JobHighMemoryLimit"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("JobMemoryLimit")
        ).withName("$anon$0"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("RateControlTolerance"),
            Constants$root.C_LONG$LAYOUT.withName("CpuRateControlTolerance")
        ).withName("$anon$1"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("RateControlToleranceLimit"),
            Constants$root.C_LONG$LAYOUT.withName("CpuRateControlToleranceLimit")
        ).withName("$anon$2"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("JobLowMemoryLimit"),
        Constants$root.C_LONG$LAYOUT.withName("IoRateControlTolerance"),
        Constants$root.C_LONG$LAYOUT.withName("IoRateControlToleranceLimit"),
        Constants$root.C_LONG$LAYOUT.withName("NetRateControlTolerance"),
        Constants$root.C_LONG$LAYOUT.withName("NetRateControlToleranceLimit")
    ).withName("JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2");
    public static MemoryLayout $LAYOUT() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.$struct$LAYOUT;
    }
    static final VarHandle LimitFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LimitFlags"));
    public static VarHandle LimitFlags$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.LimitFlags$VH;
    }
    public static int LimitFlags$get(MemorySegment seg) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.LimitFlags$VH.get(seg);
    }
    public static void LimitFlags$set( MemorySegment seg, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.LimitFlags$VH.set(seg, x);
    }
    public static int LimitFlags$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.LimitFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LimitFlags$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.LimitFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ViolationLimitFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ViolationLimitFlags"));
    public static VarHandle ViolationLimitFlags$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.ViolationLimitFlags$VH;
    }
    public static int ViolationLimitFlags$get(MemorySegment seg) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.ViolationLimitFlags$VH.get(seg);
    }
    public static void ViolationLimitFlags$set( MemorySegment seg, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.ViolationLimitFlags$VH.set(seg, x);
    }
    public static int ViolationLimitFlags$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.ViolationLimitFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ViolationLimitFlags$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.ViolationLimitFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IoReadBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IoReadBytes"));
    public static VarHandle IoReadBytes$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoReadBytes$VH;
    }
    public static long IoReadBytes$get(MemorySegment seg) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoReadBytes$VH.get(seg);
    }
    public static void IoReadBytes$set( MemorySegment seg, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoReadBytes$VH.set(seg, x);
    }
    public static long IoReadBytes$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoReadBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IoReadBytes$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoReadBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IoReadBytesLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IoReadBytesLimit"));
    public static VarHandle IoReadBytesLimit$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoReadBytesLimit$VH;
    }
    public static long IoReadBytesLimit$get(MemorySegment seg) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoReadBytesLimit$VH.get(seg);
    }
    public static void IoReadBytesLimit$set( MemorySegment seg, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoReadBytesLimit$VH.set(seg, x);
    }
    public static long IoReadBytesLimit$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoReadBytesLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IoReadBytesLimit$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoReadBytesLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IoWriteBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IoWriteBytes"));
    public static VarHandle IoWriteBytes$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoWriteBytes$VH;
    }
    public static long IoWriteBytes$get(MemorySegment seg) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoWriteBytes$VH.get(seg);
    }
    public static void IoWriteBytes$set( MemorySegment seg, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoWriteBytes$VH.set(seg, x);
    }
    public static long IoWriteBytes$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoWriteBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IoWriteBytes$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoWriteBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IoWriteBytesLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IoWriteBytesLimit"));
    public static VarHandle IoWriteBytesLimit$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoWriteBytesLimit$VH;
    }
    public static long IoWriteBytesLimit$get(MemorySegment seg) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoWriteBytesLimit$VH.get(seg);
    }
    public static void IoWriteBytesLimit$set( MemorySegment seg, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoWriteBytesLimit$VH.set(seg, x);
    }
    public static long IoWriteBytesLimit$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoWriteBytesLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IoWriteBytesLimit$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoWriteBytesLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PerJobUserTime$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static MemorySegment PerJobUserTimeLimit$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    static final VarHandle JobMemory$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobMemory"));
    public static VarHandle JobMemory$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobMemory$VH;
    }
    public static long JobMemory$get(MemorySegment seg) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobMemory$VH.get(seg);
    }
    public static void JobMemory$set( MemorySegment seg, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobMemory$VH.set(seg, x);
    }
    public static long JobMemory$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobMemory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobMemory$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobMemory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle JobHighMemoryLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("JobHighMemoryLimit"));
    public static VarHandle JobHighMemoryLimit$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobHighMemoryLimit$VH;
    }
    public static long JobHighMemoryLimit$get(MemorySegment seg) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobHighMemoryLimit$VH.get(seg);
    }
    public static void JobHighMemoryLimit$set( MemorySegment seg, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobHighMemoryLimit$VH.set(seg, x);
    }
    public static long JobHighMemoryLimit$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobHighMemoryLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobHighMemoryLimit$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobHighMemoryLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle JobMemoryLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("JobMemoryLimit"));
    public static VarHandle JobMemoryLimit$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobMemoryLimit$VH;
    }
    public static long JobMemoryLimit$get(MemorySegment seg) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobMemoryLimit$VH.get(seg);
    }
    public static void JobMemoryLimit$set( MemorySegment seg, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobMemoryLimit$VH.set(seg, x);
    }
    public static long JobMemoryLimit$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobMemoryLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobMemoryLimit$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobMemoryLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RateControlTolerance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("RateControlTolerance"));
    public static VarHandle RateControlTolerance$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.RateControlTolerance$VH;
    }
    public static int RateControlTolerance$get(MemorySegment seg) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.RateControlTolerance$VH.get(seg);
    }
    public static void RateControlTolerance$set( MemorySegment seg, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.RateControlTolerance$VH.set(seg, x);
    }
    public static int RateControlTolerance$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.RateControlTolerance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RateControlTolerance$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.RateControlTolerance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CpuRateControlTolerance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("CpuRateControlTolerance"));
    public static VarHandle CpuRateControlTolerance$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.CpuRateControlTolerance$VH;
    }
    public static int CpuRateControlTolerance$get(MemorySegment seg) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.CpuRateControlTolerance$VH.get(seg);
    }
    public static void CpuRateControlTolerance$set( MemorySegment seg, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.CpuRateControlTolerance$VH.set(seg, x);
    }
    public static int CpuRateControlTolerance$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.CpuRateControlTolerance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CpuRateControlTolerance$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.CpuRateControlTolerance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RateControlToleranceLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("RateControlToleranceLimit"));
    public static VarHandle RateControlToleranceLimit$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.RateControlToleranceLimit$VH;
    }
    public static int RateControlToleranceLimit$get(MemorySegment seg) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.RateControlToleranceLimit$VH.get(seg);
    }
    public static void RateControlToleranceLimit$set( MemorySegment seg, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.RateControlToleranceLimit$VH.set(seg, x);
    }
    public static int RateControlToleranceLimit$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.RateControlToleranceLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RateControlToleranceLimit$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.RateControlToleranceLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CpuRateControlToleranceLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$2"), MemoryLayout.PathElement.groupElement("CpuRateControlToleranceLimit"));
    public static VarHandle CpuRateControlToleranceLimit$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.CpuRateControlToleranceLimit$VH;
    }
    public static int CpuRateControlToleranceLimit$get(MemorySegment seg) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.CpuRateControlToleranceLimit$VH.get(seg);
    }
    public static void CpuRateControlToleranceLimit$set( MemorySegment seg, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.CpuRateControlToleranceLimit$VH.set(seg, x);
    }
    public static int CpuRateControlToleranceLimit$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.CpuRateControlToleranceLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CpuRateControlToleranceLimit$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.CpuRateControlToleranceLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle JobLowMemoryLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobLowMemoryLimit"));
    public static VarHandle JobLowMemoryLimit$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobLowMemoryLimit$VH;
    }
    public static long JobLowMemoryLimit$get(MemorySegment seg) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobLowMemoryLimit$VH.get(seg);
    }
    public static void JobLowMemoryLimit$set( MemorySegment seg, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobLowMemoryLimit$VH.set(seg, x);
    }
    public static long JobLowMemoryLimit$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobLowMemoryLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobLowMemoryLimit$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.JobLowMemoryLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IoRateControlTolerance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IoRateControlTolerance"));
    public static VarHandle IoRateControlTolerance$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoRateControlTolerance$VH;
    }
    public static int IoRateControlTolerance$get(MemorySegment seg) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoRateControlTolerance$VH.get(seg);
    }
    public static void IoRateControlTolerance$set( MemorySegment seg, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoRateControlTolerance$VH.set(seg, x);
    }
    public static int IoRateControlTolerance$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoRateControlTolerance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IoRateControlTolerance$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoRateControlTolerance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IoRateControlToleranceLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IoRateControlToleranceLimit"));
    public static VarHandle IoRateControlToleranceLimit$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoRateControlToleranceLimit$VH;
    }
    public static int IoRateControlToleranceLimit$get(MemorySegment seg) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoRateControlToleranceLimit$VH.get(seg);
    }
    public static void IoRateControlToleranceLimit$set( MemorySegment seg, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoRateControlToleranceLimit$VH.set(seg, x);
    }
    public static int IoRateControlToleranceLimit$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoRateControlToleranceLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IoRateControlToleranceLimit$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.IoRateControlToleranceLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NetRateControlTolerance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NetRateControlTolerance"));
    public static VarHandle NetRateControlTolerance$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.NetRateControlTolerance$VH;
    }
    public static int NetRateControlTolerance$get(MemorySegment seg) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.NetRateControlTolerance$VH.get(seg);
    }
    public static void NetRateControlTolerance$set( MemorySegment seg, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.NetRateControlTolerance$VH.set(seg, x);
    }
    public static int NetRateControlTolerance$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.NetRateControlTolerance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NetRateControlTolerance$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.NetRateControlTolerance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NetRateControlToleranceLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NetRateControlToleranceLimit"));
    public static VarHandle NetRateControlToleranceLimit$VH() {
        return JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.NetRateControlToleranceLimit$VH;
    }
    public static int NetRateControlToleranceLimit$get(MemorySegment seg) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.NetRateControlToleranceLimit$VH.get(seg);
    }
    public static void NetRateControlToleranceLimit$set( MemorySegment seg, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.NetRateControlToleranceLimit$VH.set(seg, x);
    }
    public static int NetRateControlToleranceLimit$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.NetRateControlToleranceLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NetRateControlToleranceLimit$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2.NetRateControlToleranceLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


