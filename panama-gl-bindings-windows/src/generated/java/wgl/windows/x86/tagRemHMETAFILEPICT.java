// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRemHMETAFILEPICT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("mm"),
        Constants$root.C_LONG$LAYOUT.withName("xExt"),
        Constants$root.C_LONG$LAYOUT.withName("yExt"),
        Constants$root.C_LONG$LAYOUT.withName("cbData"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("data"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagRemHMETAFILEPICT");
    public static MemoryLayout $LAYOUT() {
        return tagRemHMETAFILEPICT.$struct$LAYOUT;
    }
    static final VarHandle mm$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mm"));
    public static VarHandle mm$VH() {
        return tagRemHMETAFILEPICT.mm$VH;
    }
    public static int mm$get(MemorySegment seg) {
        return (int)tagRemHMETAFILEPICT.mm$VH.get(seg);
    }
    public static void mm$set( MemorySegment seg, int x) {
        tagRemHMETAFILEPICT.mm$VH.set(seg, x);
    }
    public static int mm$get(MemorySegment seg, long index) {
        return (int)tagRemHMETAFILEPICT.mm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mm$set(MemorySegment seg, long index, int x) {
        tagRemHMETAFILEPICT.mm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xExt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xExt"));
    public static VarHandle xExt$VH() {
        return tagRemHMETAFILEPICT.xExt$VH;
    }
    public static int xExt$get(MemorySegment seg) {
        return (int)tagRemHMETAFILEPICT.xExt$VH.get(seg);
    }
    public static void xExt$set( MemorySegment seg, int x) {
        tagRemHMETAFILEPICT.xExt$VH.set(seg, x);
    }
    public static int xExt$get(MemorySegment seg, long index) {
        return (int)tagRemHMETAFILEPICT.xExt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xExt$set(MemorySegment seg, long index, int x) {
        tagRemHMETAFILEPICT.xExt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yExt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yExt"));
    public static VarHandle yExt$VH() {
        return tagRemHMETAFILEPICT.yExt$VH;
    }
    public static int yExt$get(MemorySegment seg) {
        return (int)tagRemHMETAFILEPICT.yExt$VH.get(seg);
    }
    public static void yExt$set( MemorySegment seg, int x) {
        tagRemHMETAFILEPICT.yExt$VH.set(seg, x);
    }
    public static int yExt$get(MemorySegment seg, long index) {
        return (int)tagRemHMETAFILEPICT.yExt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yExt$set(MemorySegment seg, long index, int x) {
        tagRemHMETAFILEPICT.yExt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return tagRemHMETAFILEPICT.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)tagRemHMETAFILEPICT.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        tagRemHMETAFILEPICT.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)tagRemHMETAFILEPICT.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        tagRemHMETAFILEPICT.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(16, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


