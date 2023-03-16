// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagAXESLISTW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("axlReserved"),
        Constants$root.C_LONG$LAYOUT.withName("axlNumAxes"),
        MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("axMinValue"),
            Constants$root.C_LONG$LAYOUT.withName("axMaxValue"),
            MemoryLayout.sequenceLayout(16, Constants$root.C_SHORT$LAYOUT).withName("axAxisName")
        ).withName("tagAXISINFOW")).withName("axlAxisInfo")
    ).withName("tagAXESLISTW");
    public static MemoryLayout $LAYOUT() {
        return tagAXESLISTW.$struct$LAYOUT;
    }
    static final VarHandle axlReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("axlReserved"));
    public static VarHandle axlReserved$VH() {
        return tagAXESLISTW.axlReserved$VH;
    }
    public static int axlReserved$get(MemorySegment seg) {
        return (int)tagAXESLISTW.axlReserved$VH.get(seg);
    }
    public static void axlReserved$set( MemorySegment seg, int x) {
        tagAXESLISTW.axlReserved$VH.set(seg, x);
    }
    public static int axlReserved$get(MemorySegment seg, long index) {
        return (int)tagAXESLISTW.axlReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void axlReserved$set(MemorySegment seg, long index, int x) {
        tagAXESLISTW.axlReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle axlNumAxes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("axlNumAxes"));
    public static VarHandle axlNumAxes$VH() {
        return tagAXESLISTW.axlNumAxes$VH;
    }
    public static int axlNumAxes$get(MemorySegment seg) {
        return (int)tagAXESLISTW.axlNumAxes$VH.get(seg);
    }
    public static void axlNumAxes$set( MemorySegment seg, int x) {
        tagAXESLISTW.axlNumAxes$VH.set(seg, x);
    }
    public static int axlNumAxes$get(MemorySegment seg, long index) {
        return (int)tagAXESLISTW.axlNumAxes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void axlNumAxes$set(MemorySegment seg, long index, int x) {
        tagAXESLISTW.axlNumAxes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment axlAxisInfo$slice(MemorySegment seg) {
        return seg.asSlice(8, 640);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


