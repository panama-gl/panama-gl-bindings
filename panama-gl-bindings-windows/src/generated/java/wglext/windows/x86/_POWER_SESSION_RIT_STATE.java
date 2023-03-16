// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _POWER_SESSION_RIT_STATE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Active"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_LONG$LAYOUT.withName("LastInputTime")
    ).withName("_POWER_SESSION_RIT_STATE");
    public static MemoryLayout $LAYOUT() {
        return _POWER_SESSION_RIT_STATE.$struct$LAYOUT;
    }
    static final VarHandle Active$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Active"));
    public static VarHandle Active$VH() {
        return _POWER_SESSION_RIT_STATE.Active$VH;
    }
    public static byte Active$get(MemorySegment seg) {
        return (byte)_POWER_SESSION_RIT_STATE.Active$VH.get(seg);
    }
    public static void Active$set( MemorySegment seg, byte x) {
        _POWER_SESSION_RIT_STATE.Active$VH.set(seg, x);
    }
    public static byte Active$get(MemorySegment seg, long index) {
        return (byte)_POWER_SESSION_RIT_STATE.Active$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Active$set(MemorySegment seg, long index, byte x) {
        _POWER_SESSION_RIT_STATE.Active$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LastInputTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LastInputTime"));
    public static VarHandle LastInputTime$VH() {
        return _POWER_SESSION_RIT_STATE.LastInputTime$VH;
    }
    public static int LastInputTime$get(MemorySegment seg) {
        return (int)_POWER_SESSION_RIT_STATE.LastInputTime$VH.get(seg);
    }
    public static void LastInputTime$set( MemorySegment seg, int x) {
        _POWER_SESSION_RIT_STATE.LastInputTime$VH.set(seg, x);
    }
    public static int LastInputTime$get(MemorySegment seg, long index) {
        return (int)_POWER_SESSION_RIT_STATE.LastInputTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LastInputTime$set(MemorySegment seg, long index, int x) {
        _POWER_SESSION_RIT_STATE.LastInputTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


