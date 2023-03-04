// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _XSTATE_FEATURE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Offset"),
        Constants$root.C_LONG$LAYOUT.withName("Size")
    ).withName("_XSTATE_FEATURE");
    public static MemoryLayout $LAYOUT() {
        return _XSTATE_FEATURE.$struct$LAYOUT;
    }
    static final VarHandle Offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Offset"));
    public static VarHandle Offset$VH() {
        return _XSTATE_FEATURE.Offset$VH;
    }
    public static int Offset$get(MemorySegment seg) {
        return (int)_XSTATE_FEATURE.Offset$VH.get(seg);
    }
    public static void Offset$set( MemorySegment seg, int x) {
        _XSTATE_FEATURE.Offset$VH.set(seg, x);
    }
    public static int Offset$get(MemorySegment seg, long index) {
        return (int)_XSTATE_FEATURE.Offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Offset$set(MemorySegment seg, long index, int x) {
        _XSTATE_FEATURE.Offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _XSTATE_FEATURE.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_XSTATE_FEATURE.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _XSTATE_FEATURE.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_XSTATE_FEATURE.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _XSTATE_FEATURE.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


