// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PERFORMANCE_DATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Size"),
        Constants$root.C_CHAR$LAYOUT.withName("Version"),
        Constants$root.C_CHAR$LAYOUT.withName("HwCountersCount"),
        Constants$root.C_LONG$LAYOUT.withName("ContextSwitchCount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("WaitReasonBitMap"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("CycleTime"),
        Constants$root.C_LONG$LAYOUT.withName("RetryCount"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Type"),
            Constants$root.C_LONG$LAYOUT.withName("Reserved"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Value")
        ).withName("_HARDWARE_COUNTER_DATA")).withName("HwCounters")
    ).withName("_PERFORMANCE_DATA");
    public static MemoryLayout $LAYOUT() {
        return _PERFORMANCE_DATA.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _PERFORMANCE_DATA.Size$VH;
    }
    public static short Size$get(MemorySegment seg) {
        return (short)_PERFORMANCE_DATA.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, short x) {
        _PERFORMANCE_DATA.Size$VH.set(seg, x);
    }
    public static short Size$get(MemorySegment seg, long index) {
        return (short)_PERFORMANCE_DATA.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, short x) {
        _PERFORMANCE_DATA.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _PERFORMANCE_DATA.Version$VH;
    }
    public static byte Version$get(MemorySegment seg) {
        return (byte)_PERFORMANCE_DATA.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, byte x) {
        _PERFORMANCE_DATA.Version$VH.set(seg, x);
    }
    public static byte Version$get(MemorySegment seg, long index) {
        return (byte)_PERFORMANCE_DATA.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, byte x) {
        _PERFORMANCE_DATA.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HwCountersCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HwCountersCount"));
    public static VarHandle HwCountersCount$VH() {
        return _PERFORMANCE_DATA.HwCountersCount$VH;
    }
    public static byte HwCountersCount$get(MemorySegment seg) {
        return (byte)_PERFORMANCE_DATA.HwCountersCount$VH.get(seg);
    }
    public static void HwCountersCount$set( MemorySegment seg, byte x) {
        _PERFORMANCE_DATA.HwCountersCount$VH.set(seg, x);
    }
    public static byte HwCountersCount$get(MemorySegment seg, long index) {
        return (byte)_PERFORMANCE_DATA.HwCountersCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HwCountersCount$set(MemorySegment seg, long index, byte x) {
        _PERFORMANCE_DATA.HwCountersCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ContextSwitchCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ContextSwitchCount"));
    public static VarHandle ContextSwitchCount$VH() {
        return _PERFORMANCE_DATA.ContextSwitchCount$VH;
    }
    public static int ContextSwitchCount$get(MemorySegment seg) {
        return (int)_PERFORMANCE_DATA.ContextSwitchCount$VH.get(seg);
    }
    public static void ContextSwitchCount$set( MemorySegment seg, int x) {
        _PERFORMANCE_DATA.ContextSwitchCount$VH.set(seg, x);
    }
    public static int ContextSwitchCount$get(MemorySegment seg, long index) {
        return (int)_PERFORMANCE_DATA.ContextSwitchCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextSwitchCount$set(MemorySegment seg, long index, int x) {
        _PERFORMANCE_DATA.ContextSwitchCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WaitReasonBitMap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WaitReasonBitMap"));
    public static VarHandle WaitReasonBitMap$VH() {
        return _PERFORMANCE_DATA.WaitReasonBitMap$VH;
    }
    public static long WaitReasonBitMap$get(MemorySegment seg) {
        return (long)_PERFORMANCE_DATA.WaitReasonBitMap$VH.get(seg);
    }
    public static void WaitReasonBitMap$set( MemorySegment seg, long x) {
        _PERFORMANCE_DATA.WaitReasonBitMap$VH.set(seg, x);
    }
    public static long WaitReasonBitMap$get(MemorySegment seg, long index) {
        return (long)_PERFORMANCE_DATA.WaitReasonBitMap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WaitReasonBitMap$set(MemorySegment seg, long index, long x) {
        _PERFORMANCE_DATA.WaitReasonBitMap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CycleTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CycleTime"));
    public static VarHandle CycleTime$VH() {
        return _PERFORMANCE_DATA.CycleTime$VH;
    }
    public static long CycleTime$get(MemorySegment seg) {
        return (long)_PERFORMANCE_DATA.CycleTime$VH.get(seg);
    }
    public static void CycleTime$set( MemorySegment seg, long x) {
        _PERFORMANCE_DATA.CycleTime$VH.set(seg, x);
    }
    public static long CycleTime$get(MemorySegment seg, long index) {
        return (long)_PERFORMANCE_DATA.CycleTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CycleTime$set(MemorySegment seg, long index, long x) {
        _PERFORMANCE_DATA.CycleTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RetryCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RetryCount"));
    public static VarHandle RetryCount$VH() {
        return _PERFORMANCE_DATA.RetryCount$VH;
    }
    public static int RetryCount$get(MemorySegment seg) {
        return (int)_PERFORMANCE_DATA.RetryCount$VH.get(seg);
    }
    public static void RetryCount$set( MemorySegment seg, int x) {
        _PERFORMANCE_DATA.RetryCount$VH.set(seg, x);
    }
    public static int RetryCount$get(MemorySegment seg, long index) {
        return (int)_PERFORMANCE_DATA.RetryCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RetryCount$set(MemorySegment seg, long index, int x) {
        _PERFORMANCE_DATA.RetryCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _PERFORMANCE_DATA.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_PERFORMANCE_DATA.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _PERFORMANCE_DATA.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_PERFORMANCE_DATA.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _PERFORMANCE_DATA.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment HwCounters$slice(MemorySegment seg) {
        return seg.asSlice(32, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


