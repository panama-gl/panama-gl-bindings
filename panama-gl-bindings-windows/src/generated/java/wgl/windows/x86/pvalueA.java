// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class pvalueA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pv_valuename"),
        Constants$root.C_LONG$LAYOUT.withName("pv_valuelen"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pv_value_context"),
        Constants$root.C_LONG$LAYOUT.withName("pv_type"),
        MemoryLayout.paddingLayout(32)
    ).withName("pvalueA");
    public static MemoryLayout $LAYOUT() {
        return pvalueA.$struct$LAYOUT;
    }
    static final VarHandle pv_valuename$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pv_valuename"));
    public static VarHandle pv_valuename$VH() {
        return pvalueA.pv_valuename$VH;
    }
    public static MemoryAddress pv_valuename$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)pvalueA.pv_valuename$VH.get(seg);
    }
    public static void pv_valuename$set( MemorySegment seg, MemoryAddress x) {
        pvalueA.pv_valuename$VH.set(seg, x);
    }
    public static MemoryAddress pv_valuename$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)pvalueA.pv_valuename$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pv_valuename$set(MemorySegment seg, long index, MemoryAddress x) {
        pvalueA.pv_valuename$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pv_valuelen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pv_valuelen"));
    public static VarHandle pv_valuelen$VH() {
        return pvalueA.pv_valuelen$VH;
    }
    public static int pv_valuelen$get(MemorySegment seg) {
        return (int)pvalueA.pv_valuelen$VH.get(seg);
    }
    public static void pv_valuelen$set( MemorySegment seg, int x) {
        pvalueA.pv_valuelen$VH.set(seg, x);
    }
    public static int pv_valuelen$get(MemorySegment seg, long index) {
        return (int)pvalueA.pv_valuelen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pv_valuelen$set(MemorySegment seg, long index, int x) {
        pvalueA.pv_valuelen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pv_value_context$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pv_value_context"));
    public static VarHandle pv_value_context$VH() {
        return pvalueA.pv_value_context$VH;
    }
    public static MemoryAddress pv_value_context$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)pvalueA.pv_value_context$VH.get(seg);
    }
    public static void pv_value_context$set( MemorySegment seg, MemoryAddress x) {
        pvalueA.pv_value_context$VH.set(seg, x);
    }
    public static MemoryAddress pv_value_context$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)pvalueA.pv_value_context$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pv_value_context$set(MemorySegment seg, long index, MemoryAddress x) {
        pvalueA.pv_value_context$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pv_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pv_type"));
    public static VarHandle pv_type$VH() {
        return pvalueA.pv_type$VH;
    }
    public static int pv_type$get(MemorySegment seg) {
        return (int)pvalueA.pv_type$VH.get(seg);
    }
    public static void pv_type$set( MemorySegment seg, int x) {
        pvalueA.pv_type$VH.set(seg, x);
    }
    public static int pv_type$get(MemorySegment seg, long index) {
        return (int)pvalueA.pv_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pv_type$set(MemorySegment seg, long index, int x) {
        pvalueA.pv_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


