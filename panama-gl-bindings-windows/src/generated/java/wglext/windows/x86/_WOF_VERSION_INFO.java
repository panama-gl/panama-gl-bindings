// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _WOF_VERSION_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("WofVersion")
    ).withName("_WOF_VERSION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _WOF_VERSION_INFO.$struct$LAYOUT;
    }
    static final VarHandle WofVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WofVersion"));
    public static VarHandle WofVersion$VH() {
        return _WOF_VERSION_INFO.WofVersion$VH;
    }
    public static int WofVersion$get(MemorySegment seg) {
        return (int)_WOF_VERSION_INFO.WofVersion$VH.get(seg);
    }
    public static void WofVersion$set( MemorySegment seg, int x) {
        _WOF_VERSION_INFO.WofVersion$VH.set(seg, x);
    }
    public static int WofVersion$get(MemorySegment seg, long index) {
        return (int)_WOF_VERSION_INFO.WofVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WofVersion$set(MemorySegment seg, long index, int x) {
        _WOF_VERSION_INFO.WofVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


