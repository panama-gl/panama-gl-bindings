// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PROCESS_DYNAMIC_EH_CONTINUATION_TARGET {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("TargetAddress"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Flags")
    ).withName("_PROCESS_DYNAMIC_EH_CONTINUATION_TARGET");
    public static MemoryLayout $LAYOUT() {
        return _PROCESS_DYNAMIC_EH_CONTINUATION_TARGET.$struct$LAYOUT;
    }
    static final VarHandle TargetAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetAddress"));
    public static VarHandle TargetAddress$VH() {
        return _PROCESS_DYNAMIC_EH_CONTINUATION_TARGET.TargetAddress$VH;
    }
    public static long TargetAddress$get(MemorySegment seg) {
        return (long)_PROCESS_DYNAMIC_EH_CONTINUATION_TARGET.TargetAddress$VH.get(seg);
    }
    public static void TargetAddress$set( MemorySegment seg, long x) {
        _PROCESS_DYNAMIC_EH_CONTINUATION_TARGET.TargetAddress$VH.set(seg, x);
    }
    public static long TargetAddress$get(MemorySegment seg, long index) {
        return (long)_PROCESS_DYNAMIC_EH_CONTINUATION_TARGET.TargetAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetAddress$set(MemorySegment seg, long index, long x) {
        _PROCESS_DYNAMIC_EH_CONTINUATION_TARGET.TargetAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _PROCESS_DYNAMIC_EH_CONTINUATION_TARGET.Flags$VH;
    }
    public static long Flags$get(MemorySegment seg) {
        return (long)_PROCESS_DYNAMIC_EH_CONTINUATION_TARGET.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, long x) {
        _PROCESS_DYNAMIC_EH_CONTINUATION_TARGET.Flags$VH.set(seg, x);
    }
    public static long Flags$get(MemorySegment seg, long index) {
        return (long)_PROCESS_DYNAMIC_EH_CONTINUATION_TARGET.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, long x) {
        _PROCESS_DYNAMIC_EH_CONTINUATION_TARGET.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


