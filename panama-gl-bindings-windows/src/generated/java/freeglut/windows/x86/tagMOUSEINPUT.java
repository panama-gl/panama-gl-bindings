// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMOUSEINPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dx"),
        Constants$root.C_LONG$LAYOUT.withName("dy"),
        Constants$root.C_LONG$LAYOUT.withName("mouseData"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("time"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwExtraInfo")
    ).withName("tagMOUSEINPUT");
    public static MemoryLayout $LAYOUT() {
        return tagMOUSEINPUT.$struct$LAYOUT;
    }
    static final VarHandle dx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dx"));
    public static VarHandle dx$VH() {
        return tagMOUSEINPUT.dx$VH;
    }
    public static int dx$get(MemorySegment seg) {
        return (int)tagMOUSEINPUT.dx$VH.get(seg);
    }
    public static void dx$set( MemorySegment seg, int x) {
        tagMOUSEINPUT.dx$VH.set(seg, x);
    }
    public static int dx$get(MemorySegment seg, long index) {
        return (int)tagMOUSEINPUT.dx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dx$set(MemorySegment seg, long index, int x) {
        tagMOUSEINPUT.dx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dy"));
    public static VarHandle dy$VH() {
        return tagMOUSEINPUT.dy$VH;
    }
    public static int dy$get(MemorySegment seg) {
        return (int)tagMOUSEINPUT.dy$VH.get(seg);
    }
    public static void dy$set( MemorySegment seg, int x) {
        tagMOUSEINPUT.dy$VH.set(seg, x);
    }
    public static int dy$get(MemorySegment seg, long index) {
        return (int)tagMOUSEINPUT.dy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dy$set(MemorySegment seg, long index, int x) {
        tagMOUSEINPUT.dy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mouseData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mouseData"));
    public static VarHandle mouseData$VH() {
        return tagMOUSEINPUT.mouseData$VH;
    }
    public static int mouseData$get(MemorySegment seg) {
        return (int)tagMOUSEINPUT.mouseData$VH.get(seg);
    }
    public static void mouseData$set( MemorySegment seg, int x) {
        tagMOUSEINPUT.mouseData$VH.set(seg, x);
    }
    public static int mouseData$get(MemorySegment seg, long index) {
        return (int)tagMOUSEINPUT.mouseData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mouseData$set(MemorySegment seg, long index, int x) {
        tagMOUSEINPUT.mouseData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagMOUSEINPUT.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagMOUSEINPUT.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagMOUSEINPUT.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagMOUSEINPUT.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagMOUSEINPUT.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return tagMOUSEINPUT.time$VH;
    }
    public static int time$get(MemorySegment seg) {
        return (int)tagMOUSEINPUT.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, int x) {
        tagMOUSEINPUT.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)tagMOUSEINPUT.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        tagMOUSEINPUT.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExtraInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwExtraInfo"));
    public static VarHandle dwExtraInfo$VH() {
        return tagMOUSEINPUT.dwExtraInfo$VH;
    }
    public static long dwExtraInfo$get(MemorySegment seg) {
        return (long)tagMOUSEINPUT.dwExtraInfo$VH.get(seg);
    }
    public static void dwExtraInfo$set( MemorySegment seg, long x) {
        tagMOUSEINPUT.dwExtraInfo$VH.set(seg, x);
    }
    public static long dwExtraInfo$get(MemorySegment seg, long index) {
        return (long)tagMOUSEINPUT.dwExtraInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExtraInfo$set(MemorySegment seg, long index, long x) {
        tagMOUSEINPUT.dwExtraInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


