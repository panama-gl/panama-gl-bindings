// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRANGLEARC {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptlCenter"),
        Constants$root.C_LONG$LAYOUT.withName("nRadius"),
        Constants$root.C_FLOAT$LAYOUT.withName("eStartAngle"),
        Constants$root.C_FLOAT$LAYOUT.withName("eSweepAngle")
    ).withName("tagEMRANGLEARC");
    public static MemoryLayout $LAYOUT() {
        return tagEMRANGLEARC.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment ptlCenter$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle nRadius$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nRadius"));
    public static VarHandle nRadius$VH() {
        return tagEMRANGLEARC.nRadius$VH;
    }
    public static int nRadius$get(MemorySegment seg) {
        return (int)tagEMRANGLEARC.nRadius$VH.get(seg);
    }
    public static void nRadius$set( MemorySegment seg, int x) {
        tagEMRANGLEARC.nRadius$VH.set(seg, x);
    }
    public static int nRadius$get(MemorySegment seg, long index) {
        return (int)tagEMRANGLEARC.nRadius$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nRadius$set(MemorySegment seg, long index, int x) {
        tagEMRANGLEARC.nRadius$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle eStartAngle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("eStartAngle"));
    public static VarHandle eStartAngle$VH() {
        return tagEMRANGLEARC.eStartAngle$VH;
    }
    public static float eStartAngle$get(MemorySegment seg) {
        return (float)tagEMRANGLEARC.eStartAngle$VH.get(seg);
    }
    public static void eStartAngle$set( MemorySegment seg, float x) {
        tagEMRANGLEARC.eStartAngle$VH.set(seg, x);
    }
    public static float eStartAngle$get(MemorySegment seg, long index) {
        return (float)tagEMRANGLEARC.eStartAngle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void eStartAngle$set(MemorySegment seg, long index, float x) {
        tagEMRANGLEARC.eStartAngle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle eSweepAngle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("eSweepAngle"));
    public static VarHandle eSweepAngle$VH() {
        return tagEMRANGLEARC.eSweepAngle$VH;
    }
    public static float eSweepAngle$get(MemorySegment seg) {
        return (float)tagEMRANGLEARC.eSweepAngle$VH.get(seg);
    }
    public static void eSweepAngle$set( MemorySegment seg, float x) {
        tagEMRANGLEARC.eSweepAngle$VH.set(seg, x);
    }
    public static float eSweepAngle$get(MemorySegment seg, long index) {
        return (float)tagEMRANGLEARC.eSweepAngle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void eSweepAngle$set(MemorySegment seg, long index, float x) {
        tagEMRANGLEARC.eSweepAngle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

