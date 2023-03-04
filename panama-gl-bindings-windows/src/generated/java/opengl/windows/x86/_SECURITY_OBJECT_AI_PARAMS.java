// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SECURITY_OBJECT_AI_PARAMS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("ConstraintMask")
    ).withName("_SECURITY_OBJECT_AI_PARAMS");
    public static MemoryLayout $LAYOUT() {
        return _SECURITY_OBJECT_AI_PARAMS.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SECURITY_OBJECT_AI_PARAMS.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_SECURITY_OBJECT_AI_PARAMS.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _SECURITY_OBJECT_AI_PARAMS.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SECURITY_OBJECT_AI_PARAMS.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SECURITY_OBJECT_AI_PARAMS.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ConstraintMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ConstraintMask"));
    public static VarHandle ConstraintMask$VH() {
        return _SECURITY_OBJECT_AI_PARAMS.ConstraintMask$VH;
    }
    public static int ConstraintMask$get(MemorySegment seg) {
        return (int)_SECURITY_OBJECT_AI_PARAMS.ConstraintMask$VH.get(seg);
    }
    public static void ConstraintMask$set( MemorySegment seg, int x) {
        _SECURITY_OBJECT_AI_PARAMS.ConstraintMask$VH.set(seg, x);
    }
    public static int ConstraintMask$get(MemorySegment seg, long index) {
        return (int)_SECURITY_OBJECT_AI_PARAMS.ConstraintMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ConstraintMask$set(MemorySegment seg, long index, int x) {
        _SECURITY_OBJECT_AI_PARAMS.ConstraintMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


