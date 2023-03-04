// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPOLYTEXTA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("x"),
        Constants$root.C_LONG$LAYOUT.withName("y"),
        Constants$root.C_LONG$LAYOUT.withName("n"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstr"),
        Constants$root.C_LONG$LAYOUT.withName("uiFlags"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcl"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pdx")
    ).withName("tagPOLYTEXTA");
    public static MemoryLayout $LAYOUT() {
        return tagPOLYTEXTA.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return tagPOLYTEXTA.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)tagPOLYTEXTA.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        tagPOLYTEXTA.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)tagPOLYTEXTA.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        tagPOLYTEXTA.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return tagPOLYTEXTA.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)tagPOLYTEXTA.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        tagPOLYTEXTA.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)tagPOLYTEXTA.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        tagPOLYTEXTA.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle n$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("n"));
    public static VarHandle n$VH() {
        return tagPOLYTEXTA.n$VH;
    }
    public static int n$get(MemorySegment seg) {
        return (int)tagPOLYTEXTA.n$VH.get(seg);
    }
    public static void n$set( MemorySegment seg, int x) {
        tagPOLYTEXTA.n$VH.set(seg, x);
    }
    public static int n$get(MemorySegment seg, long index) {
        return (int)tagPOLYTEXTA.n$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void n$set(MemorySegment seg, long index, int x) {
        tagPOLYTEXTA.n$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstr"));
    public static VarHandle lpstr$VH() {
        return tagPOLYTEXTA.lpstr$VH;
    }
    public static MemoryAddress lpstr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPOLYTEXTA.lpstr$VH.get(seg);
    }
    public static void lpstr$set( MemorySegment seg, MemoryAddress x) {
        tagPOLYTEXTA.lpstr$VH.set(seg, x);
    }
    public static MemoryAddress lpstr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPOLYTEXTA.lpstr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstr$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPOLYTEXTA.lpstr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uiFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uiFlags"));
    public static VarHandle uiFlags$VH() {
        return tagPOLYTEXTA.uiFlags$VH;
    }
    public static int uiFlags$get(MemorySegment seg) {
        return (int)tagPOLYTEXTA.uiFlags$VH.get(seg);
    }
    public static void uiFlags$set( MemorySegment seg, int x) {
        tagPOLYTEXTA.uiFlags$VH.set(seg, x);
    }
    public static int uiFlags$get(MemorySegment seg, long index) {
        return (int)tagPOLYTEXTA.uiFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uiFlags$set(MemorySegment seg, long index, int x) {
        tagPOLYTEXTA.uiFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcl$slice(MemorySegment seg) {
        return seg.asSlice(28, 16);
    }
    static final VarHandle pdx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pdx"));
    public static VarHandle pdx$VH() {
        return tagPOLYTEXTA.pdx$VH;
    }
    public static MemoryAddress pdx$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPOLYTEXTA.pdx$VH.get(seg);
    }
    public static void pdx$set( MemorySegment seg, MemoryAddress x) {
        tagPOLYTEXTA.pdx$VH.set(seg, x);
    }
    public static MemoryAddress pdx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPOLYTEXTA.pdx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pdx$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPOLYTEXTA.pdx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


