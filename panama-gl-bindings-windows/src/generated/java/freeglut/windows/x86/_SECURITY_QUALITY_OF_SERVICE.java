// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SECURITY_QUALITY_OF_SERVICE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Length"),
        Constants$root.C_LONG$LAYOUT.withName("ImpersonationLevel"),
        Constants$root.C_CHAR$LAYOUT.withName("ContextTrackingMode"),
        Constants$root.C_CHAR$LAYOUT.withName("EffectiveOnly"),
        MemoryLayout.paddingLayout(16)
    ).withName("_SECURITY_QUALITY_OF_SERVICE");
    public static MemoryLayout $LAYOUT() {
        return _SECURITY_QUALITY_OF_SERVICE.$struct$LAYOUT;
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _SECURITY_QUALITY_OF_SERVICE.Length$VH;
    }
    public static int Length$get(MemorySegment seg) {
        return (int)_SECURITY_QUALITY_OF_SERVICE.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, int x) {
        _SECURITY_QUALITY_OF_SERVICE.Length$VH.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)_SECURITY_QUALITY_OF_SERVICE.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        _SECURITY_QUALITY_OF_SERVICE.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImpersonationLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImpersonationLevel"));
    public static VarHandle ImpersonationLevel$VH() {
        return _SECURITY_QUALITY_OF_SERVICE.ImpersonationLevel$VH;
    }
    public static int ImpersonationLevel$get(MemorySegment seg) {
        return (int)_SECURITY_QUALITY_OF_SERVICE.ImpersonationLevel$VH.get(seg);
    }
    public static void ImpersonationLevel$set( MemorySegment seg, int x) {
        _SECURITY_QUALITY_OF_SERVICE.ImpersonationLevel$VH.set(seg, x);
    }
    public static int ImpersonationLevel$get(MemorySegment seg, long index) {
        return (int)_SECURITY_QUALITY_OF_SERVICE.ImpersonationLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImpersonationLevel$set(MemorySegment seg, long index, int x) {
        _SECURITY_QUALITY_OF_SERVICE.ImpersonationLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ContextTrackingMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ContextTrackingMode"));
    public static VarHandle ContextTrackingMode$VH() {
        return _SECURITY_QUALITY_OF_SERVICE.ContextTrackingMode$VH;
    }
    public static byte ContextTrackingMode$get(MemorySegment seg) {
        return (byte)_SECURITY_QUALITY_OF_SERVICE.ContextTrackingMode$VH.get(seg);
    }
    public static void ContextTrackingMode$set( MemorySegment seg, byte x) {
        _SECURITY_QUALITY_OF_SERVICE.ContextTrackingMode$VH.set(seg, x);
    }
    public static byte ContextTrackingMode$get(MemorySegment seg, long index) {
        return (byte)_SECURITY_QUALITY_OF_SERVICE.ContextTrackingMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextTrackingMode$set(MemorySegment seg, long index, byte x) {
        _SECURITY_QUALITY_OF_SERVICE.ContextTrackingMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EffectiveOnly$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EffectiveOnly"));
    public static VarHandle EffectiveOnly$VH() {
        return _SECURITY_QUALITY_OF_SERVICE.EffectiveOnly$VH;
    }
    public static byte EffectiveOnly$get(MemorySegment seg) {
        return (byte)_SECURITY_QUALITY_OF_SERVICE.EffectiveOnly$VH.get(seg);
    }
    public static void EffectiveOnly$set( MemorySegment seg, byte x) {
        _SECURITY_QUALITY_OF_SERVICE.EffectiveOnly$VH.set(seg, x);
    }
    public static byte EffectiveOnly$get(MemorySegment seg, long index) {
        return (byte)_SECURITY_QUALITY_OF_SERVICE.EffectiveOnly$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EffectiveOnly$set(MemorySegment seg, long index, byte x) {
        _SECURITY_QUALITY_OF_SERVICE.EffectiveOnly$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


