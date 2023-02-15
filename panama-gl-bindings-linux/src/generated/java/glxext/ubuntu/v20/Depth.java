// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class Depth {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("depth"),
        Constants$root.C_INT$LAYOUT.withName("nvisuals"),
        Constants$root.C_POINTER$LAYOUT.withName("visuals")
    );
    public static MemoryLayout $LAYOUT() {
        return Depth.$struct$LAYOUT;
    }
    static final VarHandle depth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("depth"));
    public static VarHandle depth$VH() {
        return Depth.depth$VH;
    }
    public static int depth$get(MemorySegment seg) {
        return (int)Depth.depth$VH.get(seg);
    }
    public static void depth$set( MemorySegment seg, int x) {
        Depth.depth$VH.set(seg, x);
    }
    public static int depth$get(MemorySegment seg, long index) {
        return (int)Depth.depth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void depth$set(MemorySegment seg, long index, int x) {
        Depth.depth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nvisuals$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nvisuals"));
    public static VarHandle nvisuals$VH() {
        return Depth.nvisuals$VH;
    }
    public static int nvisuals$get(MemorySegment seg) {
        return (int)Depth.nvisuals$VH.get(seg);
    }
    public static void nvisuals$set( MemorySegment seg, int x) {
        Depth.nvisuals$VH.set(seg, x);
    }
    public static int nvisuals$get(MemorySegment seg, long index) {
        return (int)Depth.nvisuals$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nvisuals$set(MemorySegment seg, long index, int x) {
        Depth.nvisuals$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle visuals$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("visuals"));
    public static VarHandle visuals$VH() {
        return Depth.visuals$VH;
    }
    public static MemoryAddress visuals$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Depth.visuals$VH.get(seg);
    }
    public static void visuals$set( MemorySegment seg, MemoryAddress x) {
        Depth.visuals$VH.set(seg, x);
    }
    public static MemoryAddress visuals$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Depth.visuals$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void visuals$set(MemorySegment seg, long index, MemoryAddress x) {
        Depth.visuals$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


