// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMCI_OVLY_SAVE_PARMSA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwCallback"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfilename"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rc")
    ).withName("tagMCI_OVLY_SAVE_PARMSA");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_OVLY_SAVE_PARMSA.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_OVLY_SAVE_PARMSA.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_OVLY_SAVE_PARMSA.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_OVLY_SAVE_PARMSA.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_OVLY_SAVE_PARMSA.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_OVLY_SAVE_PARMSA.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfilename$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfilename"));
    public static VarHandle lpfilename$VH() {
        return tagMCI_OVLY_SAVE_PARMSA.lpfilename$VH;
    }
    public static MemoryAddress lpfilename$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMCI_OVLY_SAVE_PARMSA.lpfilename$VH.get(seg);
    }
    public static void lpfilename$set( MemorySegment seg, MemoryAddress x) {
        tagMCI_OVLY_SAVE_PARMSA.lpfilename$VH.set(seg, x);
    }
    public static MemoryAddress lpfilename$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMCI_OVLY_SAVE_PARMSA.lpfilename$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfilename$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMCI_OVLY_SAVE_PARMSA.lpfilename$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rc$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


