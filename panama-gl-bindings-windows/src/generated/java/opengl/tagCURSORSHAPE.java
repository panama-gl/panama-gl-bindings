// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCURSORSHAPE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("xHotSpot"),
        Constants$root.C_LONG$LAYOUT.withName("yHotSpot"),
        Constants$root.C_LONG$LAYOUT.withName("cx"),
        Constants$root.C_LONG$LAYOUT.withName("cy"),
        Constants$root.C_LONG$LAYOUT.withName("cbWidth"),
        Constants$root.C_CHAR$LAYOUT.withName("Planes"),
        Constants$root.C_CHAR$LAYOUT.withName("BitsPixel"),
        MemoryLayout.paddingLayout(16)
    ).withName("tagCURSORSHAPE");
    public static MemoryLayout $LAYOUT() {
        return tagCURSORSHAPE.$struct$LAYOUT;
    }
    static final VarHandle xHotSpot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xHotSpot"));
    public static VarHandle xHotSpot$VH() {
        return tagCURSORSHAPE.xHotSpot$VH;
    }
    public static int xHotSpot$get(MemorySegment seg) {
        return (int)tagCURSORSHAPE.xHotSpot$VH.get(seg);
    }
    public static void xHotSpot$set( MemorySegment seg, int x) {
        tagCURSORSHAPE.xHotSpot$VH.set(seg, x);
    }
    public static int xHotSpot$get(MemorySegment seg, long index) {
        return (int)tagCURSORSHAPE.xHotSpot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xHotSpot$set(MemorySegment seg, long index, int x) {
        tagCURSORSHAPE.xHotSpot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yHotSpot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yHotSpot"));
    public static VarHandle yHotSpot$VH() {
        return tagCURSORSHAPE.yHotSpot$VH;
    }
    public static int yHotSpot$get(MemorySegment seg) {
        return (int)tagCURSORSHAPE.yHotSpot$VH.get(seg);
    }
    public static void yHotSpot$set( MemorySegment seg, int x) {
        tagCURSORSHAPE.yHotSpot$VH.set(seg, x);
    }
    public static int yHotSpot$get(MemorySegment seg, long index) {
        return (int)tagCURSORSHAPE.yHotSpot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yHotSpot$set(MemorySegment seg, long index, int x) {
        tagCURSORSHAPE.yHotSpot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cx"));
    public static VarHandle cx$VH() {
        return tagCURSORSHAPE.cx$VH;
    }
    public static int cx$get(MemorySegment seg) {
        return (int)tagCURSORSHAPE.cx$VH.get(seg);
    }
    public static void cx$set( MemorySegment seg, int x) {
        tagCURSORSHAPE.cx$VH.set(seg, x);
    }
    public static int cx$get(MemorySegment seg, long index) {
        return (int)tagCURSORSHAPE.cx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cx$set(MemorySegment seg, long index, int x) {
        tagCURSORSHAPE.cx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cy"));
    public static VarHandle cy$VH() {
        return tagCURSORSHAPE.cy$VH;
    }
    public static int cy$get(MemorySegment seg) {
        return (int)tagCURSORSHAPE.cy$VH.get(seg);
    }
    public static void cy$set( MemorySegment seg, int x) {
        tagCURSORSHAPE.cy$VH.set(seg, x);
    }
    public static int cy$get(MemorySegment seg, long index) {
        return (int)tagCURSORSHAPE.cy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cy$set(MemorySegment seg, long index, int x) {
        tagCURSORSHAPE.cy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbWidth"));
    public static VarHandle cbWidth$VH() {
        return tagCURSORSHAPE.cbWidth$VH;
    }
    public static int cbWidth$get(MemorySegment seg) {
        return (int)tagCURSORSHAPE.cbWidth$VH.get(seg);
    }
    public static void cbWidth$set( MemorySegment seg, int x) {
        tagCURSORSHAPE.cbWidth$VH.set(seg, x);
    }
    public static int cbWidth$get(MemorySegment seg, long index) {
        return (int)tagCURSORSHAPE.cbWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbWidth$set(MemorySegment seg, long index, int x) {
        tagCURSORSHAPE.cbWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Planes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Planes"));
    public static VarHandle Planes$VH() {
        return tagCURSORSHAPE.Planes$VH;
    }
    public static byte Planes$get(MemorySegment seg) {
        return (byte)tagCURSORSHAPE.Planes$VH.get(seg);
    }
    public static void Planes$set( MemorySegment seg, byte x) {
        tagCURSORSHAPE.Planes$VH.set(seg, x);
    }
    public static byte Planes$get(MemorySegment seg, long index) {
        return (byte)tagCURSORSHAPE.Planes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Planes$set(MemorySegment seg, long index, byte x) {
        tagCURSORSHAPE.Planes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BitsPixel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BitsPixel"));
    public static VarHandle BitsPixel$VH() {
        return tagCURSORSHAPE.BitsPixel$VH;
    }
    public static byte BitsPixel$get(MemorySegment seg) {
        return (byte)tagCURSORSHAPE.BitsPixel$VH.get(seg);
    }
    public static void BitsPixel$set( MemorySegment seg, byte x) {
        tagCURSORSHAPE.BitsPixel$VH.set(seg, x);
    }
    public static byte BitsPixel$get(MemorySegment seg, long index) {
        return (byte)tagCURSORSHAPE.BitsPixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BitsPixel$set(MemorySegment seg, long index, byte x) {
        tagCURSORSHAPE.BitsPixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


