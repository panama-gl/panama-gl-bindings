// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagNCCALCSIZE_PARAMS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(3, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("tagRECT")).withName("rgrc"),
        Constants$root.C_POINTER$LAYOUT.withName("lppos")
    ).withName("tagNCCALCSIZE_PARAMS");
    public static MemoryLayout $LAYOUT() {
        return tagNCCALCSIZE_PARAMS.$struct$LAYOUT;
    }
    public static MemorySegment rgrc$slice(MemorySegment seg) {
        return seg.asSlice(0, 48);
    }
    static final VarHandle lppos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lppos"));
    public static VarHandle lppos$VH() {
        return tagNCCALCSIZE_PARAMS.lppos$VH;
    }
    public static MemoryAddress lppos$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagNCCALCSIZE_PARAMS.lppos$VH.get(seg);
    }
    public static void lppos$set( MemorySegment seg, MemoryAddress x) {
        tagNCCALCSIZE_PARAMS.lppos$VH.set(seg, x);
    }
    public static MemoryAddress lppos$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagNCCALCSIZE_PARAMS.lppos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lppos$set(MemorySegment seg, long index, MemoryAddress x) {
        tagNCCALCSIZE_PARAMS.lppos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


