// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagLOGBRUSH32 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lbStyle"),
        Constants$root.C_LONG$LAYOUT.withName("lbColor"),
        Constants$root.C_LONG$LAYOUT.withName("lbHatch")
    ).withName("tagLOGBRUSH32");
    public static MemoryLayout $LAYOUT() {
        return tagLOGBRUSH32.$struct$LAYOUT;
    }
    static final VarHandle lbStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lbStyle"));
    public static VarHandle lbStyle$VH() {
        return tagLOGBRUSH32.lbStyle$VH;
    }
    public static int lbStyle$get(MemorySegment seg) {
        return (int)tagLOGBRUSH32.lbStyle$VH.get(seg);
    }
    public static void lbStyle$set( MemorySegment seg, int x) {
        tagLOGBRUSH32.lbStyle$VH.set(seg, x);
    }
    public static int lbStyle$get(MemorySegment seg, long index) {
        return (int)tagLOGBRUSH32.lbStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lbStyle$set(MemorySegment seg, long index, int x) {
        tagLOGBRUSH32.lbStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lbColor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lbColor"));
    public static VarHandle lbColor$VH() {
        return tagLOGBRUSH32.lbColor$VH;
    }
    public static int lbColor$get(MemorySegment seg) {
        return (int)tagLOGBRUSH32.lbColor$VH.get(seg);
    }
    public static void lbColor$set( MemorySegment seg, int x) {
        tagLOGBRUSH32.lbColor$VH.set(seg, x);
    }
    public static int lbColor$get(MemorySegment seg, long index) {
        return (int)tagLOGBRUSH32.lbColor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lbColor$set(MemorySegment seg, long index, int x) {
        tagLOGBRUSH32.lbColor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lbHatch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lbHatch"));
    public static VarHandle lbHatch$VH() {
        return tagLOGBRUSH32.lbHatch$VH;
    }
    public static int lbHatch$get(MemorySegment seg) {
        return (int)tagLOGBRUSH32.lbHatch$VH.get(seg);
    }
    public static void lbHatch$set( MemorySegment seg, int x) {
        tagLOGBRUSH32.lbHatch$VH.set(seg, x);
    }
    public static int lbHatch$get(MemorySegment seg, long index) {
        return (int)tagLOGBRUSH32.lbHatch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lbHatch$set(MemorySegment seg, long index, int x) {
        tagLOGBRUSH32.lbHatch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


