// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagANIMATIONINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("iMinAnimate")
    ).withName("tagANIMATIONINFO");
    public static MemoryLayout $LAYOUT() {
        return tagANIMATIONINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagANIMATIONINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagANIMATIONINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagANIMATIONINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagANIMATIONINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagANIMATIONINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iMinAnimate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iMinAnimate"));
    public static VarHandle iMinAnimate$VH() {
        return tagANIMATIONINFO.iMinAnimate$VH;
    }
    public static int iMinAnimate$get(MemorySegment seg) {
        return (int)tagANIMATIONINFO.iMinAnimate$VH.get(seg);
    }
    public static void iMinAnimate$set( MemorySegment seg, int x) {
        tagANIMATIONINFO.iMinAnimate$VH.set(seg, x);
    }
    public static int iMinAnimate$get(MemorySegment seg, long index) {
        return (int)tagANIMATIONINFO.iMinAnimate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iMinAnimate$set(MemorySegment seg, long index, int x) {
        tagANIMATIONINFO.iMinAnimate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


