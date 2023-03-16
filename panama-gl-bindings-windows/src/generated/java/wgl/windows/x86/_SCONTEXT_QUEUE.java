// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SCONTEXT_QUEUE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NumberOfObjects"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ArrayOfObjects")
    ).withName("_SCONTEXT_QUEUE");
    public static MemoryLayout $LAYOUT() {
        return _SCONTEXT_QUEUE.$struct$LAYOUT;
    }
    static final VarHandle NumberOfObjects$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfObjects"));
    public static VarHandle NumberOfObjects$VH() {
        return _SCONTEXT_QUEUE.NumberOfObjects$VH;
    }
    public static int NumberOfObjects$get(MemorySegment seg) {
        return (int)_SCONTEXT_QUEUE.NumberOfObjects$VH.get(seg);
    }
    public static void NumberOfObjects$set( MemorySegment seg, int x) {
        _SCONTEXT_QUEUE.NumberOfObjects$VH.set(seg, x);
    }
    public static int NumberOfObjects$get(MemorySegment seg, long index) {
        return (int)_SCONTEXT_QUEUE.NumberOfObjects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfObjects$set(MemorySegment seg, long index, int x) {
        _SCONTEXT_QUEUE.NumberOfObjects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ArrayOfObjects$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ArrayOfObjects"));
    public static VarHandle ArrayOfObjects$VH() {
        return _SCONTEXT_QUEUE.ArrayOfObjects$VH;
    }
    public static MemoryAddress ArrayOfObjects$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SCONTEXT_QUEUE.ArrayOfObjects$VH.get(seg);
    }
    public static void ArrayOfObjects$set( MemorySegment seg, MemoryAddress x) {
        _SCONTEXT_QUEUE.ArrayOfObjects$VH.set(seg, x);
    }
    public static MemoryAddress ArrayOfObjects$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SCONTEXT_QUEUE.ArrayOfObjects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ArrayOfObjects$set(MemorySegment seg, long index, MemoryAddress x) {
        _SCONTEXT_QUEUE.ArrayOfObjects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


