// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRPOLYDRAW16 {

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
        Constants$root.C_LONG$LAYOUT.withName("cpts"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("x"),
            Constants$root.C_SHORT$LAYOUT.withName("y")
        ).withName("tagPOINTS")).withName("apts"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("abTypes"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagEMRPOLYDRAW16");
    public static MemoryLayout $LAYOUT() {
        return tagEMRPOLYDRAW16.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle cpts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cpts"));
    public static VarHandle cpts$VH() {
        return tagEMRPOLYDRAW16.cpts$VH;
    }
    public static int cpts$get(MemorySegment seg) {
        return (int)tagEMRPOLYDRAW16.cpts$VH.get(seg);
    }
    public static void cpts$set( MemorySegment seg, int x) {
        tagEMRPOLYDRAW16.cpts$VH.set(seg, x);
    }
    public static int cpts$get(MemorySegment seg, long index) {
        return (int)tagEMRPOLYDRAW16.cpts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cpts$set(MemorySegment seg, long index, int x) {
        tagEMRPOLYDRAW16.cpts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment apts$slice(MemorySegment seg) {
        return seg.asSlice(28, 4);
    }
    public static MemorySegment abTypes$slice(MemorySegment seg) {
        return seg.asSlice(32, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


