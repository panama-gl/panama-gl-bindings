// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _HEAP_SUMMARY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cb"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("cbAllocated"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("cbCommitted"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("cbReserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("cbMaxReserve")
    ).withName("_HEAP_SUMMARY");
    public static MemoryLayout $LAYOUT() {
        return _HEAP_SUMMARY.$struct$LAYOUT;
    }
    static final VarHandle cb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cb"));
    public static VarHandle cb$VH() {
        return _HEAP_SUMMARY.cb$VH;
    }
    public static int cb$get(MemorySegment seg) {
        return (int)_HEAP_SUMMARY.cb$VH.get(seg);
    }
    public static void cb$set( MemorySegment seg, int x) {
        _HEAP_SUMMARY.cb$VH.set(seg, x);
    }
    public static int cb$get(MemorySegment seg, long index) {
        return (int)_HEAP_SUMMARY.cb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, int x) {
        _HEAP_SUMMARY.cb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbAllocated$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbAllocated"));
    public static VarHandle cbAllocated$VH() {
        return _HEAP_SUMMARY.cbAllocated$VH;
    }
    public static long cbAllocated$get(MemorySegment seg) {
        return (long)_HEAP_SUMMARY.cbAllocated$VH.get(seg);
    }
    public static void cbAllocated$set( MemorySegment seg, long x) {
        _HEAP_SUMMARY.cbAllocated$VH.set(seg, x);
    }
    public static long cbAllocated$get(MemorySegment seg, long index) {
        return (long)_HEAP_SUMMARY.cbAllocated$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbAllocated$set(MemorySegment seg, long index, long x) {
        _HEAP_SUMMARY.cbAllocated$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbCommitted$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbCommitted"));
    public static VarHandle cbCommitted$VH() {
        return _HEAP_SUMMARY.cbCommitted$VH;
    }
    public static long cbCommitted$get(MemorySegment seg) {
        return (long)_HEAP_SUMMARY.cbCommitted$VH.get(seg);
    }
    public static void cbCommitted$set( MemorySegment seg, long x) {
        _HEAP_SUMMARY.cbCommitted$VH.set(seg, x);
    }
    public static long cbCommitted$get(MemorySegment seg, long index) {
        return (long)_HEAP_SUMMARY.cbCommitted$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbCommitted$set(MemorySegment seg, long index, long x) {
        _HEAP_SUMMARY.cbCommitted$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbReserved"));
    public static VarHandle cbReserved$VH() {
        return _HEAP_SUMMARY.cbReserved$VH;
    }
    public static long cbReserved$get(MemorySegment seg) {
        return (long)_HEAP_SUMMARY.cbReserved$VH.get(seg);
    }
    public static void cbReserved$set( MemorySegment seg, long x) {
        _HEAP_SUMMARY.cbReserved$VH.set(seg, x);
    }
    public static long cbReserved$get(MemorySegment seg, long index) {
        return (long)_HEAP_SUMMARY.cbReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbReserved$set(MemorySegment seg, long index, long x) {
        _HEAP_SUMMARY.cbReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbMaxReserve$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbMaxReserve"));
    public static VarHandle cbMaxReserve$VH() {
        return _HEAP_SUMMARY.cbMaxReserve$VH;
    }
    public static long cbMaxReserve$get(MemorySegment seg) {
        return (long)_HEAP_SUMMARY.cbMaxReserve$VH.get(seg);
    }
    public static void cbMaxReserve$set( MemorySegment seg, long x) {
        _HEAP_SUMMARY.cbMaxReserve$VH.set(seg, x);
    }
    public static long cbMaxReserve$get(MemorySegment seg, long index) {
        return (long)_HEAP_SUMMARY.cbMaxReserve$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbMaxReserve$set(MemorySegment seg, long index, long x) {
        _HEAP_SUMMARY.cbMaxReserve$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


