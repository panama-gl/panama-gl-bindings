// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _POWER_SESSION_WINLOGON {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("SessionId"),
        Constants$root.C_CHAR$LAYOUT.withName("Console"),
        Constants$root.C_CHAR$LAYOUT.withName("Locked"),
        MemoryLayout.paddingLayout(16)
    ).withName("_POWER_SESSION_WINLOGON");
    public static MemoryLayout $LAYOUT() {
        return _POWER_SESSION_WINLOGON.$struct$LAYOUT;
    }
    static final VarHandle SessionId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SessionId"));
    public static VarHandle SessionId$VH() {
        return _POWER_SESSION_WINLOGON.SessionId$VH;
    }
    public static int SessionId$get(MemorySegment seg) {
        return (int)_POWER_SESSION_WINLOGON.SessionId$VH.get(seg);
    }
    public static void SessionId$set( MemorySegment seg, int x) {
        _POWER_SESSION_WINLOGON.SessionId$VH.set(seg, x);
    }
    public static int SessionId$get(MemorySegment seg, long index) {
        return (int)_POWER_SESSION_WINLOGON.SessionId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SessionId$set(MemorySegment seg, long index, int x) {
        _POWER_SESSION_WINLOGON.SessionId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Console$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Console"));
    public static VarHandle Console$VH() {
        return _POWER_SESSION_WINLOGON.Console$VH;
    }
    public static byte Console$get(MemorySegment seg) {
        return (byte)_POWER_SESSION_WINLOGON.Console$VH.get(seg);
    }
    public static void Console$set( MemorySegment seg, byte x) {
        _POWER_SESSION_WINLOGON.Console$VH.set(seg, x);
    }
    public static byte Console$get(MemorySegment seg, long index) {
        return (byte)_POWER_SESSION_WINLOGON.Console$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Console$set(MemorySegment seg, long index, byte x) {
        _POWER_SESSION_WINLOGON.Console$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Locked$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Locked"));
    public static VarHandle Locked$VH() {
        return _POWER_SESSION_WINLOGON.Locked$VH;
    }
    public static byte Locked$get(MemorySegment seg) {
        return (byte)_POWER_SESSION_WINLOGON.Locked$VH.get(seg);
    }
    public static void Locked$set( MemorySegment seg, byte x) {
        _POWER_SESSION_WINLOGON.Locked$VH.set(seg, x);
    }
    public static byte Locked$get(MemorySegment seg, long index) {
        return (byte)_POWER_SESSION_WINLOGON.Locked$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Locked$set(MemorySegment seg, long index, byte x) {
        _POWER_SESSION_WINLOGON.Locked$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


