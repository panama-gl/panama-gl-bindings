// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TRIVERTEX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("x"),
        Constants$root.C_LONG$LAYOUT.withName("y"),
        Constants$root.C_SHORT$LAYOUT.withName("Red"),
        Constants$root.C_SHORT$LAYOUT.withName("Green"),
        Constants$root.C_SHORT$LAYOUT.withName("Blue"),
        Constants$root.C_SHORT$LAYOUT.withName("Alpha")
    ).withName("_TRIVERTEX");
    public static MemoryLayout $LAYOUT() {
        return _TRIVERTEX.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return _TRIVERTEX.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)_TRIVERTEX.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        _TRIVERTEX.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)_TRIVERTEX.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        _TRIVERTEX.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return _TRIVERTEX.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)_TRIVERTEX.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        _TRIVERTEX.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)_TRIVERTEX.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        _TRIVERTEX.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Red$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Red"));
    public static VarHandle Red$VH() {
        return _TRIVERTEX.Red$VH;
    }
    public static short Red$get(MemorySegment seg) {
        return (short)_TRIVERTEX.Red$VH.get(seg);
    }
    public static void Red$set( MemorySegment seg, short x) {
        _TRIVERTEX.Red$VH.set(seg, x);
    }
    public static short Red$get(MemorySegment seg, long index) {
        return (short)_TRIVERTEX.Red$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Red$set(MemorySegment seg, long index, short x) {
        _TRIVERTEX.Red$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Green$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Green"));
    public static VarHandle Green$VH() {
        return _TRIVERTEX.Green$VH;
    }
    public static short Green$get(MemorySegment seg) {
        return (short)_TRIVERTEX.Green$VH.get(seg);
    }
    public static void Green$set( MemorySegment seg, short x) {
        _TRIVERTEX.Green$VH.set(seg, x);
    }
    public static short Green$get(MemorySegment seg, long index) {
        return (short)_TRIVERTEX.Green$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Green$set(MemorySegment seg, long index, short x) {
        _TRIVERTEX.Green$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Blue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Blue"));
    public static VarHandle Blue$VH() {
        return _TRIVERTEX.Blue$VH;
    }
    public static short Blue$get(MemorySegment seg) {
        return (short)_TRIVERTEX.Blue$VH.get(seg);
    }
    public static void Blue$set( MemorySegment seg, short x) {
        _TRIVERTEX.Blue$VH.set(seg, x);
    }
    public static short Blue$get(MemorySegment seg, long index) {
        return (short)_TRIVERTEX.Blue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Blue$set(MemorySegment seg, long index, short x) {
        _TRIVERTEX.Blue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Alpha$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Alpha"));
    public static VarHandle Alpha$VH() {
        return _TRIVERTEX.Alpha$VH;
    }
    public static short Alpha$get(MemorySegment seg) {
        return (short)_TRIVERTEX.Alpha$VH.get(seg);
    }
    public static void Alpha$set( MemorySegment seg, short x) {
        _TRIVERTEX.Alpha$VH.set(seg, x);
    }
    public static short Alpha$get(MemorySegment seg, long index) {
        return (short)_TRIVERTEX.Alpha$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Alpha$set(MemorySegment seg, long index, short x) {
        _TRIVERTEX.Alpha$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


