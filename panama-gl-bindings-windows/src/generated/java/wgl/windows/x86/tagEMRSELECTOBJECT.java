// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRSELECTOBJECT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("ihObject")
    ).withName("tagEMRSELECTOBJECT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRSELECTOBJECT.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle ihObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ihObject"));
    public static VarHandle ihObject$VH() {
        return tagEMRSELECTOBJECT.ihObject$VH;
    }
    public static int ihObject$get(MemorySegment seg) {
        return (int)tagEMRSELECTOBJECT.ihObject$VH.get(seg);
    }
    public static void ihObject$set( MemorySegment seg, int x) {
        tagEMRSELECTOBJECT.ihObject$VH.set(seg, x);
    }
    public static int ihObject$get(MemorySegment seg, long index) {
        return (int)tagEMRSELECTOBJECT.ihObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ihObject$set(MemorySegment seg, long index, int x) {
        tagEMRSELECTOBJECT.ihObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


