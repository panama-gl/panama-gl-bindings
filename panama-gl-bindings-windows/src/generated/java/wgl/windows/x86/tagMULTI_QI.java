// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMULTI_QI {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pIID"),
        Constants$root.C_POINTER$LAYOUT.withName("pItf"),
        Constants$root.C_LONG$LAYOUT.withName("hr"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagMULTI_QI");
    public static MemoryLayout $LAYOUT() {
        return tagMULTI_QI.$struct$LAYOUT;
    }
    static final VarHandle pIID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pIID"));
    public static VarHandle pIID$VH() {
        return tagMULTI_QI.pIID$VH;
    }
    public static MemoryAddress pIID$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMULTI_QI.pIID$VH.get(seg);
    }
    public static void pIID$set( MemorySegment seg, MemoryAddress x) {
        tagMULTI_QI.pIID$VH.set(seg, x);
    }
    public static MemoryAddress pIID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMULTI_QI.pIID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pIID$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMULTI_QI.pIID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pItf$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pItf"));
    public static VarHandle pItf$VH() {
        return tagMULTI_QI.pItf$VH;
    }
    public static MemoryAddress pItf$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMULTI_QI.pItf$VH.get(seg);
    }
    public static void pItf$set( MemorySegment seg, MemoryAddress x) {
        tagMULTI_QI.pItf$VH.set(seg, x);
    }
    public static MemoryAddress pItf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMULTI_QI.pItf$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pItf$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMULTI_QI.pItf$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hr"));
    public static VarHandle hr$VH() {
        return tagMULTI_QI.hr$VH;
    }
    public static int hr$get(MemorySegment seg) {
        return (int)tagMULTI_QI.hr$VH.get(seg);
    }
    public static void hr$set( MemorySegment seg, int x) {
        tagMULTI_QI.hr$VH.set(seg, x);
    }
    public static int hr$get(MemorySegment seg, long index) {
        return (int)tagMULTI_QI.hr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hr$set(MemorySegment seg, long index, int x) {
        tagMULTI_QI.hr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


