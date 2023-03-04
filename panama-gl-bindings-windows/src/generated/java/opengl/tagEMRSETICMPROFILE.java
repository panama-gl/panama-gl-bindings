// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRSETICMPROFILE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("cbName"),
        Constants$root.C_LONG$LAYOUT.withName("cbData"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Data"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagEMRSETICMPROFILE");
    public static MemoryLayout $LAYOUT() {
        return tagEMRSETICMPROFILE.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagEMRSETICMPROFILE.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagEMRSETICMPROFILE.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagEMRSETICMPROFILE.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagEMRSETICMPROFILE.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagEMRSETICMPROFILE.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbName"));
    public static VarHandle cbName$VH() {
        return tagEMRSETICMPROFILE.cbName$VH;
    }
    public static int cbName$get(MemorySegment seg) {
        return (int)tagEMRSETICMPROFILE.cbName$VH.get(seg);
    }
    public static void cbName$set( MemorySegment seg, int x) {
        tagEMRSETICMPROFILE.cbName$VH.set(seg, x);
    }
    public static int cbName$get(MemorySegment seg, long index) {
        return (int)tagEMRSETICMPROFILE.cbName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbName$set(MemorySegment seg, long index, int x) {
        tagEMRSETICMPROFILE.cbName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return tagEMRSETICMPROFILE.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)tagEMRSETICMPROFILE.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        tagEMRSETICMPROFILE.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)tagEMRSETICMPROFILE.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        tagEMRSETICMPROFILE.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(20, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


