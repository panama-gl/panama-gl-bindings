// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("CycleTime")
    ).withName("_SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle CycleTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CycleTime"));
    public static VarHandle CycleTime$VH() {
        return _SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION.CycleTime$VH;
    }
    public static long CycleTime$get(MemorySegment seg) {
        return (long)_SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION.CycleTime$VH.get(seg);
    }
    public static void CycleTime$set( MemorySegment seg, long x) {
        _SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION.CycleTime$VH.set(seg, x);
    }
    public static long CycleTime$get(MemorySegment seg, long index) {
        return (long)_SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION.CycleTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CycleTime$set(MemorySegment seg, long index, long x) {
        _SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION.CycleTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


