// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _KERNEL_CET_CONTEXT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Ssp"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Rip"),
        Constants$root.C_SHORT$LAYOUT.withName("SegCs"),
        MemoryLayout.unionLayout(
            Constants$root.C_SHORT$LAYOUT.withName("AllFlags"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1).withName("UseWrss"),
                    MemoryLayout.paddingLayout(1).withName("PopShadowStackOne"),
                    MemoryLayout.paddingLayout(14).withName("Unused")
                )
            ).withName("$anon$0")
        ).withName("$anon$0"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("Fill")
    ).withName("_KERNEL_CET_CONTEXT");
    public static MemoryLayout $LAYOUT() {
        return _KERNEL_CET_CONTEXT.$struct$LAYOUT;
    }
    static final VarHandle Ssp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Ssp"));
    public static VarHandle Ssp$VH() {
        return _KERNEL_CET_CONTEXT.Ssp$VH;
    }
    public static long Ssp$get(MemorySegment seg) {
        return (long)_KERNEL_CET_CONTEXT.Ssp$VH.get(seg);
    }
    public static void Ssp$set( MemorySegment seg, long x) {
        _KERNEL_CET_CONTEXT.Ssp$VH.set(seg, x);
    }
    public static long Ssp$get(MemorySegment seg, long index) {
        return (long)_KERNEL_CET_CONTEXT.Ssp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Ssp$set(MemorySegment seg, long index, long x) {
        _KERNEL_CET_CONTEXT.Ssp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Rip$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Rip"));
    public static VarHandle Rip$VH() {
        return _KERNEL_CET_CONTEXT.Rip$VH;
    }
    public static long Rip$get(MemorySegment seg) {
        return (long)_KERNEL_CET_CONTEXT.Rip$VH.get(seg);
    }
    public static void Rip$set( MemorySegment seg, long x) {
        _KERNEL_CET_CONTEXT.Rip$VH.set(seg, x);
    }
    public static long Rip$get(MemorySegment seg, long index) {
        return (long)_KERNEL_CET_CONTEXT.Rip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Rip$set(MemorySegment seg, long index, long x) {
        _KERNEL_CET_CONTEXT.Rip$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SegCs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SegCs"));
    public static VarHandle SegCs$VH() {
        return _KERNEL_CET_CONTEXT.SegCs$VH;
    }
    public static short SegCs$get(MemorySegment seg) {
        return (short)_KERNEL_CET_CONTEXT.SegCs$VH.get(seg);
    }
    public static void SegCs$set( MemorySegment seg, short x) {
        _KERNEL_CET_CONTEXT.SegCs$VH.set(seg, x);
    }
    public static short SegCs$get(MemorySegment seg, long index) {
        return (short)_KERNEL_CET_CONTEXT.SegCs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SegCs$set(MemorySegment seg, long index, short x) {
        _KERNEL_CET_CONTEXT.SegCs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AllFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("AllFlags"));
    public static VarHandle AllFlags$VH() {
        return _KERNEL_CET_CONTEXT.AllFlags$VH;
    }
    public static short AllFlags$get(MemorySegment seg) {
        return (short)_KERNEL_CET_CONTEXT.AllFlags$VH.get(seg);
    }
    public static void AllFlags$set( MemorySegment seg, short x) {
        _KERNEL_CET_CONTEXT.AllFlags$VH.set(seg, x);
    }
    public static short AllFlags$get(MemorySegment seg, long index) {
        return (short)_KERNEL_CET_CONTEXT.AllFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AllFlags$set(MemorySegment seg, long index, short x) {
        _KERNEL_CET_CONTEXT.AllFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Fill$slice(MemorySegment seg) {
        return seg.asSlice(20, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

