// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _POWER_MONITOR_INVOCATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Console"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_LONG$LAYOUT.withName("RequestReason")
    ).withName("_POWER_MONITOR_INVOCATION");
    public static MemoryLayout $LAYOUT() {
        return _POWER_MONITOR_INVOCATION.$struct$LAYOUT;
    }
    static final VarHandle Console$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Console"));
    public static VarHandle Console$VH() {
        return _POWER_MONITOR_INVOCATION.Console$VH;
    }
    public static byte Console$get(MemorySegment seg) {
        return (byte)_POWER_MONITOR_INVOCATION.Console$VH.get(seg);
    }
    public static void Console$set( MemorySegment seg, byte x) {
        _POWER_MONITOR_INVOCATION.Console$VH.set(seg, x);
    }
    public static byte Console$get(MemorySegment seg, long index) {
        return (byte)_POWER_MONITOR_INVOCATION.Console$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Console$set(MemorySegment seg, long index, byte x) {
        _POWER_MONITOR_INVOCATION.Console$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RequestReason$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RequestReason"));
    public static VarHandle RequestReason$VH() {
        return _POWER_MONITOR_INVOCATION.RequestReason$VH;
    }
    public static int RequestReason$get(MemorySegment seg) {
        return (int)_POWER_MONITOR_INVOCATION.RequestReason$VH.get(seg);
    }
    public static void RequestReason$set( MemorySegment seg, int x) {
        _POWER_MONITOR_INVOCATION.RequestReason$VH.set(seg, x);
    }
    public static int RequestReason$get(MemorySegment seg, long index) {
        return (int)_POWER_MONITOR_INVOCATION.RequestReason$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestReason$set(MemorySegment seg, long index, int x) {
        _POWER_MONITOR_INVOCATION.RequestReason$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


