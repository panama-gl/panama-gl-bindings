// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRPOLYPOLYLINE16 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rclBounds"),
        Constants$root.C_LONG$LAYOUT.withName("nPolys"),
        Constants$root.C_LONG$LAYOUT.withName("cpts"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("aPolyCounts"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("x"),
            Constants$root.C_SHORT$LAYOUT.withName("y")
        ).withName("tagPOINTS")).withName("apts")
    ).withName("tagEMRPOLYPOLYLINE16");
    public static MemoryLayout $LAYOUT() {
        return tagEMRPOLYPOLYLINE16.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle nPolys$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nPolys"));
    public static VarHandle nPolys$VH() {
        return tagEMRPOLYPOLYLINE16.nPolys$VH;
    }
    public static int nPolys$get(MemorySegment seg) {
        return (int)tagEMRPOLYPOLYLINE16.nPolys$VH.get(seg);
    }
    public static void nPolys$set( MemorySegment seg, int x) {
        tagEMRPOLYPOLYLINE16.nPolys$VH.set(seg, x);
    }
    public static int nPolys$get(MemorySegment seg, long index) {
        return (int)tagEMRPOLYPOLYLINE16.nPolys$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nPolys$set(MemorySegment seg, long index, int x) {
        tagEMRPOLYPOLYLINE16.nPolys$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cpts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cpts"));
    public static VarHandle cpts$VH() {
        return tagEMRPOLYPOLYLINE16.cpts$VH;
    }
    public static int cpts$get(MemorySegment seg) {
        return (int)tagEMRPOLYPOLYLINE16.cpts$VH.get(seg);
    }
    public static void cpts$set( MemorySegment seg, int x) {
        tagEMRPOLYPOLYLINE16.cpts$VH.set(seg, x);
    }
    public static int cpts$get(MemorySegment seg, long index) {
        return (int)tagEMRPOLYPOLYLINE16.cpts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cpts$set(MemorySegment seg, long index, int x) {
        tagEMRPOLYPOLYLINE16.cpts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment aPolyCounts$slice(MemorySegment seg) {
        return seg.asSlice(32, 4);
    }
    public static MemorySegment apts$slice(MemorySegment seg) {
        return seg.asSlice(36, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


