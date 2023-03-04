// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _BLENDFUNCTION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("BlendOp"),
        Constants$root.C_CHAR$LAYOUT.withName("BlendFlags"),
        Constants$root.C_CHAR$LAYOUT.withName("SourceConstantAlpha"),
        Constants$root.C_CHAR$LAYOUT.withName("AlphaFormat")
    ).withName("_BLENDFUNCTION");
    public static MemoryLayout $LAYOUT() {
        return _BLENDFUNCTION.$struct$LAYOUT;
    }
    static final VarHandle BlendOp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BlendOp"));
    public static VarHandle BlendOp$VH() {
        return _BLENDFUNCTION.BlendOp$VH;
    }
    public static byte BlendOp$get(MemorySegment seg) {
        return (byte)_BLENDFUNCTION.BlendOp$VH.get(seg);
    }
    public static void BlendOp$set( MemorySegment seg, byte x) {
        _BLENDFUNCTION.BlendOp$VH.set(seg, x);
    }
    public static byte BlendOp$get(MemorySegment seg, long index) {
        return (byte)_BLENDFUNCTION.BlendOp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BlendOp$set(MemorySegment seg, long index, byte x) {
        _BLENDFUNCTION.BlendOp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BlendFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BlendFlags"));
    public static VarHandle BlendFlags$VH() {
        return _BLENDFUNCTION.BlendFlags$VH;
    }
    public static byte BlendFlags$get(MemorySegment seg) {
        return (byte)_BLENDFUNCTION.BlendFlags$VH.get(seg);
    }
    public static void BlendFlags$set( MemorySegment seg, byte x) {
        _BLENDFUNCTION.BlendFlags$VH.set(seg, x);
    }
    public static byte BlendFlags$get(MemorySegment seg, long index) {
        return (byte)_BLENDFUNCTION.BlendFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BlendFlags$set(MemorySegment seg, long index, byte x) {
        _BLENDFUNCTION.BlendFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SourceConstantAlpha$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SourceConstantAlpha"));
    public static VarHandle SourceConstantAlpha$VH() {
        return _BLENDFUNCTION.SourceConstantAlpha$VH;
    }
    public static byte SourceConstantAlpha$get(MemorySegment seg) {
        return (byte)_BLENDFUNCTION.SourceConstantAlpha$VH.get(seg);
    }
    public static void SourceConstantAlpha$set( MemorySegment seg, byte x) {
        _BLENDFUNCTION.SourceConstantAlpha$VH.set(seg, x);
    }
    public static byte SourceConstantAlpha$get(MemorySegment seg, long index) {
        return (byte)_BLENDFUNCTION.SourceConstantAlpha$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SourceConstantAlpha$set(MemorySegment seg, long index, byte x) {
        _BLENDFUNCTION.SourceConstantAlpha$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AlphaFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AlphaFormat"));
    public static VarHandle AlphaFormat$VH() {
        return _BLENDFUNCTION.AlphaFormat$VH;
    }
    public static byte AlphaFormat$get(MemorySegment seg) {
        return (byte)_BLENDFUNCTION.AlphaFormat$VH.get(seg);
    }
    public static void AlphaFormat$set( MemorySegment seg, byte x) {
        _BLENDFUNCTION.AlphaFormat$VH.set(seg, x);
    }
    public static byte AlphaFormat$get(MemorySegment seg, long index) {
        return (byte)_BLENDFUNCTION.AlphaFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AlphaFormat$set(MemorySegment seg, long index, byte x) {
        _BLENDFUNCTION.AlphaFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


