// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RIP_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwError"),
        Constants$root.C_LONG$LAYOUT.withName("dwType")
    ).withName("_RIP_INFO");
    public static MemoryLayout $LAYOUT() {
        return _RIP_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwError$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwError"));
    public static VarHandle dwError$VH() {
        return _RIP_INFO.dwError$VH;
    }
    public static int dwError$get(MemorySegment seg) {
        return (int)_RIP_INFO.dwError$VH.get(seg);
    }
    public static void dwError$set( MemorySegment seg, int x) {
        _RIP_INFO.dwError$VH.set(seg, x);
    }
    public static int dwError$get(MemorySegment seg, long index) {
        return (int)_RIP_INFO.dwError$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwError$set(MemorySegment seg, long index, int x) {
        _RIP_INFO.dwError$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwType"));
    public static VarHandle dwType$VH() {
        return _RIP_INFO.dwType$VH;
    }
    public static int dwType$get(MemorySegment seg) {
        return (int)_RIP_INFO.dwType$VH.get(seg);
    }
    public static void dwType$set( MemorySegment seg, int x) {
        _RIP_INFO.dwType$VH.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)_RIP_INFO.dwType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        _RIP_INFO.dwType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


