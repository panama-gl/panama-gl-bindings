// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPARAMDESC {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pparamdescex"),
        Constants$root.C_SHORT$LAYOUT.withName("wParamFlags"),
        MemoryLayout.paddingLayout(48)
    ).withName("tagPARAMDESC");
    public static MemoryLayout $LAYOUT() {
        return tagPARAMDESC.$struct$LAYOUT;
    }
    static final VarHandle pparamdescex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pparamdescex"));
    public static VarHandle pparamdescex$VH() {
        return tagPARAMDESC.pparamdescex$VH;
    }
    public static MemoryAddress pparamdescex$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPARAMDESC.pparamdescex$VH.get(seg);
    }
    public static void pparamdescex$set( MemorySegment seg, MemoryAddress x) {
        tagPARAMDESC.pparamdescex$VH.set(seg, x);
    }
    public static MemoryAddress pparamdescex$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPARAMDESC.pparamdescex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pparamdescex$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPARAMDESC.pparamdescex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wParamFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wParamFlags"));
    public static VarHandle wParamFlags$VH() {
        return tagPARAMDESC.wParamFlags$VH;
    }
    public static short wParamFlags$get(MemorySegment seg) {
        return (short)tagPARAMDESC.wParamFlags$VH.get(seg);
    }
    public static void wParamFlags$set( MemorySegment seg, short x) {
        tagPARAMDESC.wParamFlags$VH.set(seg, x);
    }
    public static short wParamFlags$get(MemorySegment seg, long index) {
        return (short)tagPARAMDESC.wParamFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wParamFlags$set(MemorySegment seg, long index, short x) {
        tagPARAMDESC.wParamFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


