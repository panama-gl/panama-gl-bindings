// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMCI_ANIM_STEP_PARMS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwCallback"),
        Constants$root.C_LONG$LAYOUT.withName("dwFrames")
    ).withName("tagMCI_ANIM_STEP_PARMS");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_ANIM_STEP_PARMS.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_ANIM_STEP_PARMS.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_ANIM_STEP_PARMS.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_ANIM_STEP_PARMS.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_ANIM_STEP_PARMS.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_ANIM_STEP_PARMS.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFrames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFrames"));
    public static VarHandle dwFrames$VH() {
        return tagMCI_ANIM_STEP_PARMS.dwFrames$VH;
    }
    public static int dwFrames$get(MemorySegment seg) {
        return (int)tagMCI_ANIM_STEP_PARMS.dwFrames$VH.get(seg);
    }
    public static void dwFrames$set( MemorySegment seg, int x) {
        tagMCI_ANIM_STEP_PARMS.dwFrames$VH.set(seg, x);
    }
    public static int dwFrames$get(MemorySegment seg, long index) {
        return (int)tagMCI_ANIM_STEP_PARMS.dwFrames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFrames$set(MemorySegment seg, long index, int x) {
        tagMCI_ANIM_STEP_PARMS.dwFrames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


