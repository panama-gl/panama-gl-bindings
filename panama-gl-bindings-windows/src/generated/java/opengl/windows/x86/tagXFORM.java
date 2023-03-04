// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagXFORM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("eM11"),
        Constants$root.C_FLOAT$LAYOUT.withName("eM12"),
        Constants$root.C_FLOAT$LAYOUT.withName("eM21"),
        Constants$root.C_FLOAT$LAYOUT.withName("eM22"),
        Constants$root.C_FLOAT$LAYOUT.withName("eDx"),
        Constants$root.C_FLOAT$LAYOUT.withName("eDy")
    ).withName("tagXFORM");
    public static MemoryLayout $LAYOUT() {
        return tagXFORM.$struct$LAYOUT;
    }
    static final VarHandle eM11$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("eM11"));
    public static VarHandle eM11$VH() {
        return tagXFORM.eM11$VH;
    }
    public static float eM11$get(MemorySegment seg) {
        return (float)tagXFORM.eM11$VH.get(seg);
    }
    public static void eM11$set( MemorySegment seg, float x) {
        tagXFORM.eM11$VH.set(seg, x);
    }
    public static float eM11$get(MemorySegment seg, long index) {
        return (float)tagXFORM.eM11$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void eM11$set(MemorySegment seg, long index, float x) {
        tagXFORM.eM11$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle eM12$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("eM12"));
    public static VarHandle eM12$VH() {
        return tagXFORM.eM12$VH;
    }
    public static float eM12$get(MemorySegment seg) {
        return (float)tagXFORM.eM12$VH.get(seg);
    }
    public static void eM12$set( MemorySegment seg, float x) {
        tagXFORM.eM12$VH.set(seg, x);
    }
    public static float eM12$get(MemorySegment seg, long index) {
        return (float)tagXFORM.eM12$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void eM12$set(MemorySegment seg, long index, float x) {
        tagXFORM.eM12$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle eM21$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("eM21"));
    public static VarHandle eM21$VH() {
        return tagXFORM.eM21$VH;
    }
    public static float eM21$get(MemorySegment seg) {
        return (float)tagXFORM.eM21$VH.get(seg);
    }
    public static void eM21$set( MemorySegment seg, float x) {
        tagXFORM.eM21$VH.set(seg, x);
    }
    public static float eM21$get(MemorySegment seg, long index) {
        return (float)tagXFORM.eM21$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void eM21$set(MemorySegment seg, long index, float x) {
        tagXFORM.eM21$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle eM22$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("eM22"));
    public static VarHandle eM22$VH() {
        return tagXFORM.eM22$VH;
    }
    public static float eM22$get(MemorySegment seg) {
        return (float)tagXFORM.eM22$VH.get(seg);
    }
    public static void eM22$set( MemorySegment seg, float x) {
        tagXFORM.eM22$VH.set(seg, x);
    }
    public static float eM22$get(MemorySegment seg, long index) {
        return (float)tagXFORM.eM22$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void eM22$set(MemorySegment seg, long index, float x) {
        tagXFORM.eM22$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle eDx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("eDx"));
    public static VarHandle eDx$VH() {
        return tagXFORM.eDx$VH;
    }
    public static float eDx$get(MemorySegment seg) {
        return (float)tagXFORM.eDx$VH.get(seg);
    }
    public static void eDx$set( MemorySegment seg, float x) {
        tagXFORM.eDx$VH.set(seg, x);
    }
    public static float eDx$get(MemorySegment seg, long index) {
        return (float)tagXFORM.eDx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void eDx$set(MemorySegment seg, long index, float x) {
        tagXFORM.eDx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle eDy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("eDy"));
    public static VarHandle eDy$VH() {
        return tagXFORM.eDy$VH;
    }
    public static float eDy$get(MemorySegment seg) {
        return (float)tagXFORM.eDy$VH.get(seg);
    }
    public static void eDy$set( MemorySegment seg, float x) {
        tagXFORM.eDy$VH.set(seg, x);
    }
    public static float eDy$get(MemorySegment seg, long index) {
        return (float)tagXFORM.eDy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void eDy$set(MemorySegment seg, long index, float x) {
        tagXFORM.eDy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


