// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRPLGBLT {

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
        MemoryLayout.sequenceLayout(3, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("_POINTL")).withName("aptlDest"),
        Constants$root.C_LONG$LAYOUT.withName("xSrc"),
        Constants$root.C_LONG$LAYOUT.withName("ySrc"),
        Constants$root.C_LONG$LAYOUT.withName("cxSrc"),
        Constants$root.C_LONG$LAYOUT.withName("cySrc"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("eM11"),
            Constants$root.C_FLOAT$LAYOUT.withName("eM12"),
            Constants$root.C_FLOAT$LAYOUT.withName("eM21"),
            Constants$root.C_FLOAT$LAYOUT.withName("eM22"),
            Constants$root.C_FLOAT$LAYOUT.withName("eDx"),
            Constants$root.C_FLOAT$LAYOUT.withName("eDy")
        ).withName("xformSrc"),
        Constants$root.C_LONG$LAYOUT.withName("crBkColorSrc"),
        Constants$root.C_LONG$LAYOUT.withName("iUsageSrc"),
        Constants$root.C_LONG$LAYOUT.withName("offBmiSrc"),
        Constants$root.C_LONG$LAYOUT.withName("cbBmiSrc"),
        Constants$root.C_LONG$LAYOUT.withName("offBitsSrc"),
        Constants$root.C_LONG$LAYOUT.withName("cbBitsSrc"),
        Constants$root.C_LONG$LAYOUT.withName("xMask"),
        Constants$root.C_LONG$LAYOUT.withName("yMask"),
        Constants$root.C_LONG$LAYOUT.withName("iUsageMask"),
        Constants$root.C_LONG$LAYOUT.withName("offBmiMask"),
        Constants$root.C_LONG$LAYOUT.withName("cbBmiMask"),
        Constants$root.C_LONG$LAYOUT.withName("offBitsMask"),
        Constants$root.C_LONG$LAYOUT.withName("cbBitsMask")
    ).withName("tagEMRPLGBLT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRPLGBLT.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static MemorySegment aptlDest$slice(MemorySegment seg) {
        return seg.asSlice(24, 24);
    }
    static final VarHandle xSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xSrc"));
    public static VarHandle xSrc$VH() {
        return tagEMRPLGBLT.xSrc$VH;
    }
    public static int xSrc$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.xSrc$VH.get(seg);
    }
    public static void xSrc$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.xSrc$VH.set(seg, x);
    }
    public static int xSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.xSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xSrc$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.xSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ySrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ySrc"));
    public static VarHandle ySrc$VH() {
        return tagEMRPLGBLT.ySrc$VH;
    }
    public static int ySrc$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.ySrc$VH.get(seg);
    }
    public static void ySrc$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.ySrc$VH.set(seg, x);
    }
    public static int ySrc$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.ySrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ySrc$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.ySrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cxSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cxSrc"));
    public static VarHandle cxSrc$VH() {
        return tagEMRPLGBLT.cxSrc$VH;
    }
    public static int cxSrc$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.cxSrc$VH.get(seg);
    }
    public static void cxSrc$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.cxSrc$VH.set(seg, x);
    }
    public static int cxSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.cxSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cxSrc$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.cxSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cySrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cySrc"));
    public static VarHandle cySrc$VH() {
        return tagEMRPLGBLT.cySrc$VH;
    }
    public static int cySrc$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.cySrc$VH.get(seg);
    }
    public static void cySrc$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.cySrc$VH.set(seg, x);
    }
    public static int cySrc$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.cySrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cySrc$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.cySrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment xformSrc$slice(MemorySegment seg) {
        return seg.asSlice(64, 24);
    }
    static final VarHandle crBkColorSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("crBkColorSrc"));
    public static VarHandle crBkColorSrc$VH() {
        return tagEMRPLGBLT.crBkColorSrc$VH;
    }
    public static int crBkColorSrc$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.crBkColorSrc$VH.get(seg);
    }
    public static void crBkColorSrc$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.crBkColorSrc$VH.set(seg, x);
    }
    public static int crBkColorSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.crBkColorSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void crBkColorSrc$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.crBkColorSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iUsageSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iUsageSrc"));
    public static VarHandle iUsageSrc$VH() {
        return tagEMRPLGBLT.iUsageSrc$VH;
    }
    public static int iUsageSrc$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.iUsageSrc$VH.get(seg);
    }
    public static void iUsageSrc$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.iUsageSrc$VH.set(seg, x);
    }
    public static int iUsageSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.iUsageSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iUsageSrc$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.iUsageSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBmiSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBmiSrc"));
    public static VarHandle offBmiSrc$VH() {
        return tagEMRPLGBLT.offBmiSrc$VH;
    }
    public static int offBmiSrc$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.offBmiSrc$VH.get(seg);
    }
    public static void offBmiSrc$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.offBmiSrc$VH.set(seg, x);
    }
    public static int offBmiSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.offBmiSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBmiSrc$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.offBmiSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBmiSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBmiSrc"));
    public static VarHandle cbBmiSrc$VH() {
        return tagEMRPLGBLT.cbBmiSrc$VH;
    }
    public static int cbBmiSrc$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.cbBmiSrc$VH.get(seg);
    }
    public static void cbBmiSrc$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.cbBmiSrc$VH.set(seg, x);
    }
    public static int cbBmiSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.cbBmiSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBmiSrc$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.cbBmiSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBitsSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBitsSrc"));
    public static VarHandle offBitsSrc$VH() {
        return tagEMRPLGBLT.offBitsSrc$VH;
    }
    public static int offBitsSrc$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.offBitsSrc$VH.get(seg);
    }
    public static void offBitsSrc$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.offBitsSrc$VH.set(seg, x);
    }
    public static int offBitsSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.offBitsSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBitsSrc$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.offBitsSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBitsSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBitsSrc"));
    public static VarHandle cbBitsSrc$VH() {
        return tagEMRPLGBLT.cbBitsSrc$VH;
    }
    public static int cbBitsSrc$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.cbBitsSrc$VH.get(seg);
    }
    public static void cbBitsSrc$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.cbBitsSrc$VH.set(seg, x);
    }
    public static int cbBitsSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.cbBitsSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBitsSrc$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.cbBitsSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xMask"));
    public static VarHandle xMask$VH() {
        return tagEMRPLGBLT.xMask$VH;
    }
    public static int xMask$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.xMask$VH.get(seg);
    }
    public static void xMask$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.xMask$VH.set(seg, x);
    }
    public static int xMask$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.xMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xMask$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.xMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yMask"));
    public static VarHandle yMask$VH() {
        return tagEMRPLGBLT.yMask$VH;
    }
    public static int yMask$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.yMask$VH.get(seg);
    }
    public static void yMask$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.yMask$VH.set(seg, x);
    }
    public static int yMask$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.yMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yMask$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.yMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iUsageMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iUsageMask"));
    public static VarHandle iUsageMask$VH() {
        return tagEMRPLGBLT.iUsageMask$VH;
    }
    public static int iUsageMask$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.iUsageMask$VH.get(seg);
    }
    public static void iUsageMask$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.iUsageMask$VH.set(seg, x);
    }
    public static int iUsageMask$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.iUsageMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iUsageMask$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.iUsageMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBmiMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBmiMask"));
    public static VarHandle offBmiMask$VH() {
        return tagEMRPLGBLT.offBmiMask$VH;
    }
    public static int offBmiMask$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.offBmiMask$VH.get(seg);
    }
    public static void offBmiMask$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.offBmiMask$VH.set(seg, x);
    }
    public static int offBmiMask$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.offBmiMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBmiMask$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.offBmiMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBmiMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBmiMask"));
    public static VarHandle cbBmiMask$VH() {
        return tagEMRPLGBLT.cbBmiMask$VH;
    }
    public static int cbBmiMask$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.cbBmiMask$VH.get(seg);
    }
    public static void cbBmiMask$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.cbBmiMask$VH.set(seg, x);
    }
    public static int cbBmiMask$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.cbBmiMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBmiMask$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.cbBmiMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBitsMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBitsMask"));
    public static VarHandle offBitsMask$VH() {
        return tagEMRPLGBLT.offBitsMask$VH;
    }
    public static int offBitsMask$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.offBitsMask$VH.get(seg);
    }
    public static void offBitsMask$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.offBitsMask$VH.set(seg, x);
    }
    public static int offBitsMask$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.offBitsMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBitsMask$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.offBitsMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBitsMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBitsMask"));
    public static VarHandle cbBitsMask$VH() {
        return tagEMRPLGBLT.cbBitsMask$VH;
    }
    public static int cbBitsMask$get(MemorySegment seg) {
        return (int)tagEMRPLGBLT.cbBitsMask$VH.get(seg);
    }
    public static void cbBitsMask$set( MemorySegment seg, int x) {
        tagEMRPLGBLT.cbBitsMask$VH.set(seg, x);
    }
    public static int cbBitsMask$get(MemorySegment seg, long index) {
        return (int)tagEMRPLGBLT.cbBitsMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBitsMask$set(MemorySegment seg, long index, int x) {
        tagEMRPLGBLT.cbBitsMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


