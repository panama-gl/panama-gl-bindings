// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagLASTINPUTINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwTime")
    ).withName("tagLASTINPUTINFO");
    public static MemoryLayout $LAYOUT() {
        return tagLASTINPUTINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagLASTINPUTINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagLASTINPUTINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagLASTINPUTINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagLASTINPUTINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagLASTINPUTINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTime"));
    public static VarHandle dwTime$VH() {
        return tagLASTINPUTINFO.dwTime$VH;
    }
    public static int dwTime$get(MemorySegment seg) {
        return (int)tagLASTINPUTINFO.dwTime$VH.get(seg);
    }
    public static void dwTime$set( MemorySegment seg, int x) {
        tagLASTINPUTINFO.dwTime$VH.set(seg, x);
    }
    public static int dwTime$get(MemorySegment seg, long index) {
        return (int)tagLASTINPUTINFO.dwTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTime$set(MemorySegment seg, long index, int x) {
        tagLASTINPUTINFO.dwTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

