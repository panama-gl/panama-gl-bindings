// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SC_ACTION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        Constants$root.C_LONG$LAYOUT.withName("Delay")
    ).withName("_SC_ACTION");
    public static MemoryLayout $LAYOUT() {
        return _SC_ACTION.$struct$LAYOUT;
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _SC_ACTION.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)_SC_ACTION.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        _SC_ACTION.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_SC_ACTION.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _SC_ACTION.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Delay$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Delay"));
    public static VarHandle Delay$VH() {
        return _SC_ACTION.Delay$VH;
    }
    public static int Delay$get(MemorySegment seg) {
        return (int)_SC_ACTION.Delay$VH.get(seg);
    }
    public static void Delay$set( MemorySegment seg, int x) {
        _SC_ACTION.Delay$VH.set(seg, x);
    }
    public static int Delay$get(MemorySegment seg, long index) {
        return (int)_SC_ACTION.Delay$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Delay$set(MemorySegment seg, long index, int x) {
        _SC_ACTION.Delay$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


