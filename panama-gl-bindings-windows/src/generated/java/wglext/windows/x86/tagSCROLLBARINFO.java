// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagSCROLLBARINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcScrollBar"),
        Constants$root.C_LONG$LAYOUT.withName("dxyLineButton"),
        Constants$root.C_LONG$LAYOUT.withName("xyThumbTop"),
        Constants$root.C_LONG$LAYOUT.withName("xyThumbBottom"),
        Constants$root.C_LONG$LAYOUT.withName("reserved"),
        MemoryLayout.sequenceLayout(6, Constants$root.C_LONG$LAYOUT).withName("rgstate")
    ).withName("tagSCROLLBARINFO");
    public static MemoryLayout $LAYOUT() {
        return tagSCROLLBARINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagSCROLLBARINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagSCROLLBARINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagSCROLLBARINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagSCROLLBARINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagSCROLLBARINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcScrollBar$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    static final VarHandle dxyLineButton$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dxyLineButton"));
    public static VarHandle dxyLineButton$VH() {
        return tagSCROLLBARINFO.dxyLineButton$VH;
    }
    public static int dxyLineButton$get(MemorySegment seg) {
        return (int)tagSCROLLBARINFO.dxyLineButton$VH.get(seg);
    }
    public static void dxyLineButton$set( MemorySegment seg, int x) {
        tagSCROLLBARINFO.dxyLineButton$VH.set(seg, x);
    }
    public static int dxyLineButton$get(MemorySegment seg, long index) {
        return (int)tagSCROLLBARINFO.dxyLineButton$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dxyLineButton$set(MemorySegment seg, long index, int x) {
        tagSCROLLBARINFO.dxyLineButton$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xyThumbTop$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xyThumbTop"));
    public static VarHandle xyThumbTop$VH() {
        return tagSCROLLBARINFO.xyThumbTop$VH;
    }
    public static int xyThumbTop$get(MemorySegment seg) {
        return (int)tagSCROLLBARINFO.xyThumbTop$VH.get(seg);
    }
    public static void xyThumbTop$set( MemorySegment seg, int x) {
        tagSCROLLBARINFO.xyThumbTop$VH.set(seg, x);
    }
    public static int xyThumbTop$get(MemorySegment seg, long index) {
        return (int)tagSCROLLBARINFO.xyThumbTop$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xyThumbTop$set(MemorySegment seg, long index, int x) {
        tagSCROLLBARINFO.xyThumbTop$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xyThumbBottom$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xyThumbBottom"));
    public static VarHandle xyThumbBottom$VH() {
        return tagSCROLLBARINFO.xyThumbBottom$VH;
    }
    public static int xyThumbBottom$get(MemorySegment seg) {
        return (int)tagSCROLLBARINFO.xyThumbBottom$VH.get(seg);
    }
    public static void xyThumbBottom$set( MemorySegment seg, int x) {
        tagSCROLLBARINFO.xyThumbBottom$VH.set(seg, x);
    }
    public static int xyThumbBottom$get(MemorySegment seg, long index) {
        return (int)tagSCROLLBARINFO.xyThumbBottom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xyThumbBottom$set(MemorySegment seg, long index, int x) {
        tagSCROLLBARINFO.xyThumbBottom$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved"));
    public static VarHandle reserved$VH() {
        return tagSCROLLBARINFO.reserved$VH;
    }
    public static int reserved$get(MemorySegment seg) {
        return (int)tagSCROLLBARINFO.reserved$VH.get(seg);
    }
    public static void reserved$set( MemorySegment seg, int x) {
        tagSCROLLBARINFO.reserved$VH.set(seg, x);
    }
    public static int reserved$get(MemorySegment seg, long index) {
        return (int)tagSCROLLBARINFO.reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved$set(MemorySegment seg, long index, int x) {
        tagSCROLLBARINFO.reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rgstate$slice(MemorySegment seg) {
        return seg.asSlice(36, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


