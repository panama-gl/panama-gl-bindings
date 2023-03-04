// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagKEYBDINPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wVk"),
        Constants$root.C_SHORT$LAYOUT.withName("wScan"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("time"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwExtraInfo")
    ).withName("tagKEYBDINPUT");
    public static MemoryLayout $LAYOUT() {
        return tagKEYBDINPUT.$struct$LAYOUT;
    }
    static final VarHandle wVk$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wVk"));
    public static VarHandle wVk$VH() {
        return tagKEYBDINPUT.wVk$VH;
    }
    public static short wVk$get(MemorySegment seg) {
        return (short)tagKEYBDINPUT.wVk$VH.get(seg);
    }
    public static void wVk$set( MemorySegment seg, short x) {
        tagKEYBDINPUT.wVk$VH.set(seg, x);
    }
    public static short wVk$get(MemorySegment seg, long index) {
        return (short)tagKEYBDINPUT.wVk$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVk$set(MemorySegment seg, long index, short x) {
        tagKEYBDINPUT.wVk$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wScan$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wScan"));
    public static VarHandle wScan$VH() {
        return tagKEYBDINPUT.wScan$VH;
    }
    public static short wScan$get(MemorySegment seg) {
        return (short)tagKEYBDINPUT.wScan$VH.get(seg);
    }
    public static void wScan$set( MemorySegment seg, short x) {
        tagKEYBDINPUT.wScan$VH.set(seg, x);
    }
    public static short wScan$get(MemorySegment seg, long index) {
        return (short)tagKEYBDINPUT.wScan$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wScan$set(MemorySegment seg, long index, short x) {
        tagKEYBDINPUT.wScan$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagKEYBDINPUT.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagKEYBDINPUT.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagKEYBDINPUT.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagKEYBDINPUT.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagKEYBDINPUT.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return tagKEYBDINPUT.time$VH;
    }
    public static int time$get(MemorySegment seg) {
        return (int)tagKEYBDINPUT.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, int x) {
        tagKEYBDINPUT.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)tagKEYBDINPUT.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        tagKEYBDINPUT.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExtraInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwExtraInfo"));
    public static VarHandle dwExtraInfo$VH() {
        return tagKEYBDINPUT.dwExtraInfo$VH;
    }
    public static long dwExtraInfo$get(MemorySegment seg) {
        return (long)tagKEYBDINPUT.dwExtraInfo$VH.get(seg);
    }
    public static void dwExtraInfo$set( MemorySegment seg, long x) {
        tagKEYBDINPUT.dwExtraInfo$VH.set(seg, x);
    }
    public static long dwExtraInfo$get(MemorySegment seg, long index) {
        return (long)tagKEYBDINPUT.dwExtraInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExtraInfo$set(MemorySegment seg, long index, long x) {
        tagKEYBDINPUT.dwExtraInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


