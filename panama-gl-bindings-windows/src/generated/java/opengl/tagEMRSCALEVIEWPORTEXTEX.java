// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRSCALEVIEWPORTEXTEX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("xNum"),
        Constants$root.C_LONG$LAYOUT.withName("xDenom"),
        Constants$root.C_LONG$LAYOUT.withName("yNum"),
        Constants$root.C_LONG$LAYOUT.withName("yDenom")
    ).withName("tagEMRSCALEVIEWPORTEXTEX");
    public static MemoryLayout $LAYOUT() {
        return tagEMRSCALEVIEWPORTEXTEX.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle xNum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xNum"));
    public static VarHandle xNum$VH() {
        return tagEMRSCALEVIEWPORTEXTEX.xNum$VH;
    }
    public static int xNum$get(MemorySegment seg) {
        return (int)tagEMRSCALEVIEWPORTEXTEX.xNum$VH.get(seg);
    }
    public static void xNum$set( MemorySegment seg, int x) {
        tagEMRSCALEVIEWPORTEXTEX.xNum$VH.set(seg, x);
    }
    public static int xNum$get(MemorySegment seg, long index) {
        return (int)tagEMRSCALEVIEWPORTEXTEX.xNum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xNum$set(MemorySegment seg, long index, int x) {
        tagEMRSCALEVIEWPORTEXTEX.xNum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xDenom$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xDenom"));
    public static VarHandle xDenom$VH() {
        return tagEMRSCALEVIEWPORTEXTEX.xDenom$VH;
    }
    public static int xDenom$get(MemorySegment seg) {
        return (int)tagEMRSCALEVIEWPORTEXTEX.xDenom$VH.get(seg);
    }
    public static void xDenom$set( MemorySegment seg, int x) {
        tagEMRSCALEVIEWPORTEXTEX.xDenom$VH.set(seg, x);
    }
    public static int xDenom$get(MemorySegment seg, long index) {
        return (int)tagEMRSCALEVIEWPORTEXTEX.xDenom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xDenom$set(MemorySegment seg, long index, int x) {
        tagEMRSCALEVIEWPORTEXTEX.xDenom$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yNum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yNum"));
    public static VarHandle yNum$VH() {
        return tagEMRSCALEVIEWPORTEXTEX.yNum$VH;
    }
    public static int yNum$get(MemorySegment seg) {
        return (int)tagEMRSCALEVIEWPORTEXTEX.yNum$VH.get(seg);
    }
    public static void yNum$set( MemorySegment seg, int x) {
        tagEMRSCALEVIEWPORTEXTEX.yNum$VH.set(seg, x);
    }
    public static int yNum$get(MemorySegment seg, long index) {
        return (int)tagEMRSCALEVIEWPORTEXTEX.yNum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yNum$set(MemorySegment seg, long index, int x) {
        tagEMRSCALEVIEWPORTEXTEX.yNum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yDenom$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yDenom"));
    public static VarHandle yDenom$VH() {
        return tagEMRSCALEVIEWPORTEXTEX.yDenom$VH;
    }
    public static int yDenom$get(MemorySegment seg) {
        return (int)tagEMRSCALEVIEWPORTEXTEX.yDenom$VH.get(seg);
    }
    public static void yDenom$set( MemorySegment seg, int x) {
        tagEMRSCALEVIEWPORTEXTEX.yDenom$VH.set(seg, x);
    }
    public static int yDenom$get(MemorySegment seg, long index) {
        return (int)tagEMRSCALEVIEWPORTEXTEX.yDenom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yDenom$set(MemorySegment seg, long index, int x) {
        tagEMRSCALEVIEWPORTEXTEX.yDenom$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


