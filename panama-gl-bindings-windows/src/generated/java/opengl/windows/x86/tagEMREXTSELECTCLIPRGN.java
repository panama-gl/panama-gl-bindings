// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMREXTSELECTCLIPRGN {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("cbRgnData"),
        Constants$root.C_LONG$LAYOUT.withName("iMode"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("RgnData"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagEMREXTSELECTCLIPRGN");
    public static MemoryLayout $LAYOUT() {
        return tagEMREXTSELECTCLIPRGN.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle cbRgnData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbRgnData"));
    public static VarHandle cbRgnData$VH() {
        return tagEMREXTSELECTCLIPRGN.cbRgnData$VH;
    }
    public static int cbRgnData$get(MemorySegment seg) {
        return (int)tagEMREXTSELECTCLIPRGN.cbRgnData$VH.get(seg);
    }
    public static void cbRgnData$set( MemorySegment seg, int x) {
        tagEMREXTSELECTCLIPRGN.cbRgnData$VH.set(seg, x);
    }
    public static int cbRgnData$get(MemorySegment seg, long index) {
        return (int)tagEMREXTSELECTCLIPRGN.cbRgnData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbRgnData$set(MemorySegment seg, long index, int x) {
        tagEMREXTSELECTCLIPRGN.cbRgnData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iMode"));
    public static VarHandle iMode$VH() {
        return tagEMREXTSELECTCLIPRGN.iMode$VH;
    }
    public static int iMode$get(MemorySegment seg) {
        return (int)tagEMREXTSELECTCLIPRGN.iMode$VH.get(seg);
    }
    public static void iMode$set( MemorySegment seg, int x) {
        tagEMREXTSELECTCLIPRGN.iMode$VH.set(seg, x);
    }
    public static int iMode$get(MemorySegment seg, long index) {
        return (int)tagEMREXTSELECTCLIPRGN.iMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iMode$set(MemorySegment seg, long index, int x) {
        tagEMREXTSELECTCLIPRGN.iMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RgnData$slice(MemorySegment seg) {
        return seg.asSlice(16, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


