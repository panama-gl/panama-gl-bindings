// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMETARECORD {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("rdSize"),
        Constants$root.C_SHORT$LAYOUT.withName("rdFunction"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("rdParm")
    ).withName("tagMETARECORD");
    public static MemoryLayout $LAYOUT() {
        return tagMETARECORD.$struct$LAYOUT;
    }
    static final VarHandle rdSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rdSize"));
    public static VarHandle rdSize$VH() {
        return tagMETARECORD.rdSize$VH;
    }
    public static int rdSize$get(MemorySegment seg) {
        return (int)tagMETARECORD.rdSize$VH.get(seg);
    }
    public static void rdSize$set( MemorySegment seg, int x) {
        tagMETARECORD.rdSize$VH.set(seg, x);
    }
    public static int rdSize$get(MemorySegment seg, long index) {
        return (int)tagMETARECORD.rdSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rdSize$set(MemorySegment seg, long index, int x) {
        tagMETARECORD.rdSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rdFunction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rdFunction"));
    public static VarHandle rdFunction$VH() {
        return tagMETARECORD.rdFunction$VH;
    }
    public static short rdFunction$get(MemorySegment seg) {
        return (short)tagMETARECORD.rdFunction$VH.get(seg);
    }
    public static void rdFunction$set( MemorySegment seg, short x) {
        tagMETARECORD.rdFunction$VH.set(seg, x);
    }
    public static short rdFunction$get(MemorySegment seg, long index) {
        return (short)tagMETARECORD.rdFunction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rdFunction$set(MemorySegment seg, long index, short x) {
        tagMETARECORD.rdFunction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rdParm$slice(MemorySegment seg) {
        return seg.asSlice(6, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


