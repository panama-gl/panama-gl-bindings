// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _POWER_SESSION_CONNECT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Connected"),
        Constants$root.C_CHAR$LAYOUT.withName("Console")
    ).withName("_POWER_SESSION_CONNECT");
    public static MemoryLayout $LAYOUT() {
        return _POWER_SESSION_CONNECT.$struct$LAYOUT;
    }
    static final VarHandle Connected$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Connected"));
    public static VarHandle Connected$VH() {
        return _POWER_SESSION_CONNECT.Connected$VH;
    }
    public static byte Connected$get(MemorySegment seg) {
        return (byte)_POWER_SESSION_CONNECT.Connected$VH.get(seg);
    }
    public static void Connected$set( MemorySegment seg, byte x) {
        _POWER_SESSION_CONNECT.Connected$VH.set(seg, x);
    }
    public static byte Connected$get(MemorySegment seg, long index) {
        return (byte)_POWER_SESSION_CONNECT.Connected$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Connected$set(MemorySegment seg, long index, byte x) {
        _POWER_SESSION_CONNECT.Connected$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Console$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Console"));
    public static VarHandle Console$VH() {
        return _POWER_SESSION_CONNECT.Console$VH;
    }
    public static byte Console$get(MemorySegment seg) {
        return (byte)_POWER_SESSION_CONNECT.Console$VH.get(seg);
    }
    public static void Console$set( MemorySegment seg, byte x) {
        _POWER_SESSION_CONNECT.Console$VH.set(seg, x);
    }
    public static byte Console$get(MemorySegment seg, long index) {
        return (byte)_POWER_SESSION_CONNECT.Console$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Console$set(MemorySegment seg, long index, byte x) {
        _POWER_SESSION_CONNECT.Console$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


