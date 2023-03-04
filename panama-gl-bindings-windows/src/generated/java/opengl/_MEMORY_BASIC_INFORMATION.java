// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MEMORY_BASIC_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("BaseAddress"),
        Constants$root.C_POINTER$LAYOUT.withName("AllocationBase"),
        Constants$root.C_LONG$LAYOUT.withName("AllocationProtect"),
        Constants$root.C_SHORT$LAYOUT.withName("PartitionId"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_LONG_LONG$LAYOUT.withName("RegionSize"),
        Constants$root.C_LONG$LAYOUT.withName("State"),
        Constants$root.C_LONG$LAYOUT.withName("Protect"),
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        MemoryLayout.paddingLayout(32)
    ).withName("_MEMORY_BASIC_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _MEMORY_BASIC_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle BaseAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseAddress"));
    public static VarHandle BaseAddress$VH() {
        return _MEMORY_BASIC_INFORMATION.BaseAddress$VH;
    }
    public static MemoryAddress BaseAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MEMORY_BASIC_INFORMATION.BaseAddress$VH.get(seg);
    }
    public static void BaseAddress$set( MemorySegment seg, MemoryAddress x) {
        _MEMORY_BASIC_INFORMATION.BaseAddress$VH.set(seg, x);
    }
    public static MemoryAddress BaseAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MEMORY_BASIC_INFORMATION.BaseAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseAddress$set(MemorySegment seg, long index, MemoryAddress x) {
        _MEMORY_BASIC_INFORMATION.BaseAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AllocationBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AllocationBase"));
    public static VarHandle AllocationBase$VH() {
        return _MEMORY_BASIC_INFORMATION.AllocationBase$VH;
    }
    public static MemoryAddress AllocationBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MEMORY_BASIC_INFORMATION.AllocationBase$VH.get(seg);
    }
    public static void AllocationBase$set( MemorySegment seg, MemoryAddress x) {
        _MEMORY_BASIC_INFORMATION.AllocationBase$VH.set(seg, x);
    }
    public static MemoryAddress AllocationBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MEMORY_BASIC_INFORMATION.AllocationBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AllocationBase$set(MemorySegment seg, long index, MemoryAddress x) {
        _MEMORY_BASIC_INFORMATION.AllocationBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AllocationProtect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AllocationProtect"));
    public static VarHandle AllocationProtect$VH() {
        return _MEMORY_BASIC_INFORMATION.AllocationProtect$VH;
    }
    public static int AllocationProtect$get(MemorySegment seg) {
        return (int)_MEMORY_BASIC_INFORMATION.AllocationProtect$VH.get(seg);
    }
    public static void AllocationProtect$set( MemorySegment seg, int x) {
        _MEMORY_BASIC_INFORMATION.AllocationProtect$VH.set(seg, x);
    }
    public static int AllocationProtect$get(MemorySegment seg, long index) {
        return (int)_MEMORY_BASIC_INFORMATION.AllocationProtect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AllocationProtect$set(MemorySegment seg, long index, int x) {
        _MEMORY_BASIC_INFORMATION.AllocationProtect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PartitionId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PartitionId"));
    public static VarHandle PartitionId$VH() {
        return _MEMORY_BASIC_INFORMATION.PartitionId$VH;
    }
    public static short PartitionId$get(MemorySegment seg) {
        return (short)_MEMORY_BASIC_INFORMATION.PartitionId$VH.get(seg);
    }
    public static void PartitionId$set( MemorySegment seg, short x) {
        _MEMORY_BASIC_INFORMATION.PartitionId$VH.set(seg, x);
    }
    public static short PartitionId$get(MemorySegment seg, long index) {
        return (short)_MEMORY_BASIC_INFORMATION.PartitionId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PartitionId$set(MemorySegment seg, long index, short x) {
        _MEMORY_BASIC_INFORMATION.PartitionId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RegionSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RegionSize"));
    public static VarHandle RegionSize$VH() {
        return _MEMORY_BASIC_INFORMATION.RegionSize$VH;
    }
    public static long RegionSize$get(MemorySegment seg) {
        return (long)_MEMORY_BASIC_INFORMATION.RegionSize$VH.get(seg);
    }
    public static void RegionSize$set( MemorySegment seg, long x) {
        _MEMORY_BASIC_INFORMATION.RegionSize$VH.set(seg, x);
    }
    public static long RegionSize$get(MemorySegment seg, long index) {
        return (long)_MEMORY_BASIC_INFORMATION.RegionSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RegionSize$set(MemorySegment seg, long index, long x) {
        _MEMORY_BASIC_INFORMATION.RegionSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle State$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("State"));
    public static VarHandle State$VH() {
        return _MEMORY_BASIC_INFORMATION.State$VH;
    }
    public static int State$get(MemorySegment seg) {
        return (int)_MEMORY_BASIC_INFORMATION.State$VH.get(seg);
    }
    public static void State$set( MemorySegment seg, int x) {
        _MEMORY_BASIC_INFORMATION.State$VH.set(seg, x);
    }
    public static int State$get(MemorySegment seg, long index) {
        return (int)_MEMORY_BASIC_INFORMATION.State$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void State$set(MemorySegment seg, long index, int x) {
        _MEMORY_BASIC_INFORMATION.State$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Protect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Protect"));
    public static VarHandle Protect$VH() {
        return _MEMORY_BASIC_INFORMATION.Protect$VH;
    }
    public static int Protect$get(MemorySegment seg) {
        return (int)_MEMORY_BASIC_INFORMATION.Protect$VH.get(seg);
    }
    public static void Protect$set( MemorySegment seg, int x) {
        _MEMORY_BASIC_INFORMATION.Protect$VH.set(seg, x);
    }
    public static int Protect$get(MemorySegment seg, long index) {
        return (int)_MEMORY_BASIC_INFORMATION.Protect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Protect$set(MemorySegment seg, long index, int x) {
        _MEMORY_BASIC_INFORMATION.Protect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _MEMORY_BASIC_INFORMATION.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)_MEMORY_BASIC_INFORMATION.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        _MEMORY_BASIC_INFORMATION.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_MEMORY_BASIC_INFORMATION.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _MEMORY_BASIC_INFORMATION.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


