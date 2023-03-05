// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagAXISINFOW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("axMinValue"),
        Constants$root.C_LONG$LAYOUT.withName("axMaxValue"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_SHORT$LAYOUT).withName("axAxisName")
    ).withName("tagAXISINFOW");
    public static MemoryLayout $LAYOUT() {
        return tagAXISINFOW.$struct$LAYOUT;
    }
    static final VarHandle axMinValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("axMinValue"));
    public static VarHandle axMinValue$VH() {
        return tagAXISINFOW.axMinValue$VH;
    }
    public static int axMinValue$get(MemorySegment seg) {
        return (int)tagAXISINFOW.axMinValue$VH.get(seg);
    }
    public static void axMinValue$set( MemorySegment seg, int x) {
        tagAXISINFOW.axMinValue$VH.set(seg, x);
    }
    public static int axMinValue$get(MemorySegment seg, long index) {
        return (int)tagAXISINFOW.axMinValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void axMinValue$set(MemorySegment seg, long index, int x) {
        tagAXISINFOW.axMinValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle axMaxValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("axMaxValue"));
    public static VarHandle axMaxValue$VH() {
        return tagAXISINFOW.axMaxValue$VH;
    }
    public static int axMaxValue$get(MemorySegment seg) {
        return (int)tagAXISINFOW.axMaxValue$VH.get(seg);
    }
    public static void axMaxValue$set( MemorySegment seg, int x) {
        tagAXISINFOW.axMaxValue$VH.set(seg, x);
    }
    public static int axMaxValue$get(MemorySegment seg, long index) {
        return (int)tagAXISINFOW.axMaxValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void axMaxValue$set(MemorySegment seg, long index, int x) {
        tagAXISINFOW.axMaxValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment axAxisName$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


