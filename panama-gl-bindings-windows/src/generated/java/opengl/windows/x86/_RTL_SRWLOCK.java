// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RTL_SRWLOCK {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Ptr")
    ).withName("_RTL_SRWLOCK");
    public static MemoryLayout $LAYOUT() {
        return _RTL_SRWLOCK.$struct$LAYOUT;
    }
    static final VarHandle Ptr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Ptr"));
    public static VarHandle Ptr$VH() {
        return _RTL_SRWLOCK.Ptr$VH;
    }
    public static MemoryAddress Ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RTL_SRWLOCK.Ptr$VH.get(seg);
    }
    public static void Ptr$set( MemorySegment seg, MemoryAddress x) {
        _RTL_SRWLOCK.Ptr$VH.set(seg, x);
    }
    public static MemoryAddress Ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RTL_SRWLOCK.Ptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Ptr$set(MemorySegment seg, long index, MemoryAddress x) {
        _RTL_SRWLOCK.Ptr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


