// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RTL_CRITICAL_SECTION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("DebugInfo"),
        Constants$root.C_LONG$LAYOUT.withName("LockCount"),
        Constants$root.C_LONG$LAYOUT.withName("RecursionCount"),
        Constants$root.C_POINTER$LAYOUT.withName("OwningThread"),
        Constants$root.C_POINTER$LAYOUT.withName("LockSemaphore"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("SpinCount")
    ).withName("_RTL_CRITICAL_SECTION");
    public static MemoryLayout $LAYOUT() {
        return _RTL_CRITICAL_SECTION.$struct$LAYOUT;
    }
    static final VarHandle DebugInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DebugInfo"));
    public static VarHandle DebugInfo$VH() {
        return _RTL_CRITICAL_SECTION.DebugInfo$VH;
    }
    public static MemoryAddress DebugInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RTL_CRITICAL_SECTION.DebugInfo$VH.get(seg);
    }
    public static void DebugInfo$set( MemorySegment seg, MemoryAddress x) {
        _RTL_CRITICAL_SECTION.DebugInfo$VH.set(seg, x);
    }
    public static MemoryAddress DebugInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RTL_CRITICAL_SECTION.DebugInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DebugInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _RTL_CRITICAL_SECTION.DebugInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LockCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LockCount"));
    public static VarHandle LockCount$VH() {
        return _RTL_CRITICAL_SECTION.LockCount$VH;
    }
    public static int LockCount$get(MemorySegment seg) {
        return (int)_RTL_CRITICAL_SECTION.LockCount$VH.get(seg);
    }
    public static void LockCount$set( MemorySegment seg, int x) {
        _RTL_CRITICAL_SECTION.LockCount$VH.set(seg, x);
    }
    public static int LockCount$get(MemorySegment seg, long index) {
        return (int)_RTL_CRITICAL_SECTION.LockCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LockCount$set(MemorySegment seg, long index, int x) {
        _RTL_CRITICAL_SECTION.LockCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RecursionCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RecursionCount"));
    public static VarHandle RecursionCount$VH() {
        return _RTL_CRITICAL_SECTION.RecursionCount$VH;
    }
    public static int RecursionCount$get(MemorySegment seg) {
        return (int)_RTL_CRITICAL_SECTION.RecursionCount$VH.get(seg);
    }
    public static void RecursionCount$set( MemorySegment seg, int x) {
        _RTL_CRITICAL_SECTION.RecursionCount$VH.set(seg, x);
    }
    public static int RecursionCount$get(MemorySegment seg, long index) {
        return (int)_RTL_CRITICAL_SECTION.RecursionCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RecursionCount$set(MemorySegment seg, long index, int x) {
        _RTL_CRITICAL_SECTION.RecursionCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OwningThread$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OwningThread"));
    public static VarHandle OwningThread$VH() {
        return _RTL_CRITICAL_SECTION.OwningThread$VH;
    }
    public static MemoryAddress OwningThread$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RTL_CRITICAL_SECTION.OwningThread$VH.get(seg);
    }
    public static void OwningThread$set( MemorySegment seg, MemoryAddress x) {
        _RTL_CRITICAL_SECTION.OwningThread$VH.set(seg, x);
    }
    public static MemoryAddress OwningThread$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RTL_CRITICAL_SECTION.OwningThread$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OwningThread$set(MemorySegment seg, long index, MemoryAddress x) {
        _RTL_CRITICAL_SECTION.OwningThread$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LockSemaphore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LockSemaphore"));
    public static VarHandle LockSemaphore$VH() {
        return _RTL_CRITICAL_SECTION.LockSemaphore$VH;
    }
    public static MemoryAddress LockSemaphore$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RTL_CRITICAL_SECTION.LockSemaphore$VH.get(seg);
    }
    public static void LockSemaphore$set( MemorySegment seg, MemoryAddress x) {
        _RTL_CRITICAL_SECTION.LockSemaphore$VH.set(seg, x);
    }
    public static MemoryAddress LockSemaphore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RTL_CRITICAL_SECTION.LockSemaphore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LockSemaphore$set(MemorySegment seg, long index, MemoryAddress x) {
        _RTL_CRITICAL_SECTION.LockSemaphore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SpinCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SpinCount"));
    public static VarHandle SpinCount$VH() {
        return _RTL_CRITICAL_SECTION.SpinCount$VH;
    }
    public static long SpinCount$get(MemorySegment seg) {
        return (long)_RTL_CRITICAL_SECTION.SpinCount$VH.get(seg);
    }
    public static void SpinCount$set( MemorySegment seg, long x) {
        _RTL_CRITICAL_SECTION.SpinCount$VH.set(seg, x);
    }
    public static long SpinCount$get(MemorySegment seg, long index) {
        return (long)_RTL_CRITICAL_SECTION.SpinCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SpinCount$set(MemorySegment seg, long index, long x) {
        _RTL_CRITICAL_SECTION.SpinCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


