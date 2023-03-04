// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PROCESS_POWER_THROTTLING_STATE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("ControlMask"),
        Constants$root.C_LONG$LAYOUT.withName("StateMask")
    ).withName("_PROCESS_POWER_THROTTLING_STATE");
    public static MemoryLayout $LAYOUT() {
        return _PROCESS_POWER_THROTTLING_STATE.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _PROCESS_POWER_THROTTLING_STATE.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_PROCESS_POWER_THROTTLING_STATE.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _PROCESS_POWER_THROTTLING_STATE.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_PROCESS_POWER_THROTTLING_STATE.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _PROCESS_POWER_THROTTLING_STATE.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ControlMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ControlMask"));
    public static VarHandle ControlMask$VH() {
        return _PROCESS_POWER_THROTTLING_STATE.ControlMask$VH;
    }
    public static int ControlMask$get(MemorySegment seg) {
        return (int)_PROCESS_POWER_THROTTLING_STATE.ControlMask$VH.get(seg);
    }
    public static void ControlMask$set( MemorySegment seg, int x) {
        _PROCESS_POWER_THROTTLING_STATE.ControlMask$VH.set(seg, x);
    }
    public static int ControlMask$get(MemorySegment seg, long index) {
        return (int)_PROCESS_POWER_THROTTLING_STATE.ControlMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlMask$set(MemorySegment seg, long index, int x) {
        _PROCESS_POWER_THROTTLING_STATE.ControlMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StateMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StateMask"));
    public static VarHandle StateMask$VH() {
        return _PROCESS_POWER_THROTTLING_STATE.StateMask$VH;
    }
    public static int StateMask$get(MemorySegment seg) {
        return (int)_PROCESS_POWER_THROTTLING_STATE.StateMask$VH.get(seg);
    }
    public static void StateMask$set( MemorySegment seg, int x) {
        _PROCESS_POWER_THROTTLING_STATE.StateMask$VH.set(seg, x);
    }
    public static int StateMask$get(MemorySegment seg, long index) {
        return (int)_PROCESS_POWER_THROTTLING_STATE.StateMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StateMask$set(MemorySegment seg, long index, int x) {
        _PROCESS_POWER_THROTTLING_STATE.StateMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


