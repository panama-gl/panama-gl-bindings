// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _WIN32_MEMORY_RANGE_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("VirtualAddress"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumberOfBytes")
    ).withName("_WIN32_MEMORY_RANGE_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _WIN32_MEMORY_RANGE_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle VirtualAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VirtualAddress"));
    public static VarHandle VirtualAddress$VH() {
        return _WIN32_MEMORY_RANGE_ENTRY.VirtualAddress$VH;
    }
    public static MemoryAddress VirtualAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_WIN32_MEMORY_RANGE_ENTRY.VirtualAddress$VH.get(seg);
    }
    public static void VirtualAddress$set( MemorySegment seg, MemoryAddress x) {
        _WIN32_MEMORY_RANGE_ENTRY.VirtualAddress$VH.set(seg, x);
    }
    public static MemoryAddress VirtualAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_WIN32_MEMORY_RANGE_ENTRY.VirtualAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VirtualAddress$set(MemorySegment seg, long index, MemoryAddress x) {
        _WIN32_MEMORY_RANGE_ENTRY.VirtualAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfBytes"));
    public static VarHandle NumberOfBytes$VH() {
        return _WIN32_MEMORY_RANGE_ENTRY.NumberOfBytes$VH;
    }
    public static long NumberOfBytes$get(MemorySegment seg) {
        return (long)_WIN32_MEMORY_RANGE_ENTRY.NumberOfBytes$VH.get(seg);
    }
    public static void NumberOfBytes$set( MemorySegment seg, long x) {
        _WIN32_MEMORY_RANGE_ENTRY.NumberOfBytes$VH.set(seg, x);
    }
    public static long NumberOfBytes$get(MemorySegment seg, long index) {
        return (long)_WIN32_MEMORY_RANGE_ENTRY.NumberOfBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfBytes$set(MemorySegment seg, long index, long x) {
        _WIN32_MEMORY_RANGE_ENTRY.NumberOfBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


