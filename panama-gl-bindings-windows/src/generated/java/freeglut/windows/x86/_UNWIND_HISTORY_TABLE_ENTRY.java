// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _UNWIND_HISTORY_TABLE_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("ImageBase"),
        Constants$root.C_POINTER$LAYOUT.withName("FunctionEntry")
    ).withName("_UNWIND_HISTORY_TABLE_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _UNWIND_HISTORY_TABLE_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle ImageBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImageBase"));
    public static VarHandle ImageBase$VH() {
        return _UNWIND_HISTORY_TABLE_ENTRY.ImageBase$VH;
    }
    public static long ImageBase$get(MemorySegment seg) {
        return (long)_UNWIND_HISTORY_TABLE_ENTRY.ImageBase$VH.get(seg);
    }
    public static void ImageBase$set( MemorySegment seg, long x) {
        _UNWIND_HISTORY_TABLE_ENTRY.ImageBase$VH.set(seg, x);
    }
    public static long ImageBase$get(MemorySegment seg, long index) {
        return (long)_UNWIND_HISTORY_TABLE_ENTRY.ImageBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImageBase$set(MemorySegment seg, long index, long x) {
        _UNWIND_HISTORY_TABLE_ENTRY.ImageBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FunctionEntry$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FunctionEntry"));
    public static VarHandle FunctionEntry$VH() {
        return _UNWIND_HISTORY_TABLE_ENTRY.FunctionEntry$VH;
    }
    public static MemoryAddress FunctionEntry$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_UNWIND_HISTORY_TABLE_ENTRY.FunctionEntry$VH.get(seg);
    }
    public static void FunctionEntry$set( MemorySegment seg, MemoryAddress x) {
        _UNWIND_HISTORY_TABLE_ENTRY.FunctionEntry$VH.set(seg, x);
    }
    public static MemoryAddress FunctionEntry$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_UNWIND_HISTORY_TABLE_ENTRY.FunctionEntry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FunctionEntry$set(MemorySegment seg, long index, MemoryAddress x) {
        _UNWIND_HISTORY_TABLE_ENTRY.FunctionEntry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


