// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MEMORYSTATUSEX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwLength"),
        Constants$root.C_LONG$LAYOUT.withName("dwMemoryLoad"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ullTotalPhys"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ullAvailPhys"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ullTotalPageFile"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ullAvailPageFile"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ullTotalVirtual"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ullAvailVirtual"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ullAvailExtendedVirtual")
    ).withName("_MEMORYSTATUSEX");
    public static MemoryLayout $LAYOUT() {
        return _MEMORYSTATUSEX.$struct$LAYOUT;
    }
    static final VarHandle dwLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLength"));
    public static VarHandle dwLength$VH() {
        return _MEMORYSTATUSEX.dwLength$VH;
    }
    public static int dwLength$get(MemorySegment seg) {
        return (int)_MEMORYSTATUSEX.dwLength$VH.get(seg);
    }
    public static void dwLength$set( MemorySegment seg, int x) {
        _MEMORYSTATUSEX.dwLength$VH.set(seg, x);
    }
    public static int dwLength$get(MemorySegment seg, long index) {
        return (int)_MEMORYSTATUSEX.dwLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLength$set(MemorySegment seg, long index, int x) {
        _MEMORYSTATUSEX.dwLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMemoryLoad$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMemoryLoad"));
    public static VarHandle dwMemoryLoad$VH() {
        return _MEMORYSTATUSEX.dwMemoryLoad$VH;
    }
    public static int dwMemoryLoad$get(MemorySegment seg) {
        return (int)_MEMORYSTATUSEX.dwMemoryLoad$VH.get(seg);
    }
    public static void dwMemoryLoad$set( MemorySegment seg, int x) {
        _MEMORYSTATUSEX.dwMemoryLoad$VH.set(seg, x);
    }
    public static int dwMemoryLoad$get(MemorySegment seg, long index) {
        return (int)_MEMORYSTATUSEX.dwMemoryLoad$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMemoryLoad$set(MemorySegment seg, long index, int x) {
        _MEMORYSTATUSEX.dwMemoryLoad$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ullTotalPhys$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ullTotalPhys"));
    public static VarHandle ullTotalPhys$VH() {
        return _MEMORYSTATUSEX.ullTotalPhys$VH;
    }
    public static long ullTotalPhys$get(MemorySegment seg) {
        return (long)_MEMORYSTATUSEX.ullTotalPhys$VH.get(seg);
    }
    public static void ullTotalPhys$set( MemorySegment seg, long x) {
        _MEMORYSTATUSEX.ullTotalPhys$VH.set(seg, x);
    }
    public static long ullTotalPhys$get(MemorySegment seg, long index) {
        return (long)_MEMORYSTATUSEX.ullTotalPhys$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ullTotalPhys$set(MemorySegment seg, long index, long x) {
        _MEMORYSTATUSEX.ullTotalPhys$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ullAvailPhys$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ullAvailPhys"));
    public static VarHandle ullAvailPhys$VH() {
        return _MEMORYSTATUSEX.ullAvailPhys$VH;
    }
    public static long ullAvailPhys$get(MemorySegment seg) {
        return (long)_MEMORYSTATUSEX.ullAvailPhys$VH.get(seg);
    }
    public static void ullAvailPhys$set( MemorySegment seg, long x) {
        _MEMORYSTATUSEX.ullAvailPhys$VH.set(seg, x);
    }
    public static long ullAvailPhys$get(MemorySegment seg, long index) {
        return (long)_MEMORYSTATUSEX.ullAvailPhys$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ullAvailPhys$set(MemorySegment seg, long index, long x) {
        _MEMORYSTATUSEX.ullAvailPhys$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ullTotalPageFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ullTotalPageFile"));
    public static VarHandle ullTotalPageFile$VH() {
        return _MEMORYSTATUSEX.ullTotalPageFile$VH;
    }
    public static long ullTotalPageFile$get(MemorySegment seg) {
        return (long)_MEMORYSTATUSEX.ullTotalPageFile$VH.get(seg);
    }
    public static void ullTotalPageFile$set( MemorySegment seg, long x) {
        _MEMORYSTATUSEX.ullTotalPageFile$VH.set(seg, x);
    }
    public static long ullTotalPageFile$get(MemorySegment seg, long index) {
        return (long)_MEMORYSTATUSEX.ullTotalPageFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ullTotalPageFile$set(MemorySegment seg, long index, long x) {
        _MEMORYSTATUSEX.ullTotalPageFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ullAvailPageFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ullAvailPageFile"));
    public static VarHandle ullAvailPageFile$VH() {
        return _MEMORYSTATUSEX.ullAvailPageFile$VH;
    }
    public static long ullAvailPageFile$get(MemorySegment seg) {
        return (long)_MEMORYSTATUSEX.ullAvailPageFile$VH.get(seg);
    }
    public static void ullAvailPageFile$set( MemorySegment seg, long x) {
        _MEMORYSTATUSEX.ullAvailPageFile$VH.set(seg, x);
    }
    public static long ullAvailPageFile$get(MemorySegment seg, long index) {
        return (long)_MEMORYSTATUSEX.ullAvailPageFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ullAvailPageFile$set(MemorySegment seg, long index, long x) {
        _MEMORYSTATUSEX.ullAvailPageFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ullTotalVirtual$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ullTotalVirtual"));
    public static VarHandle ullTotalVirtual$VH() {
        return _MEMORYSTATUSEX.ullTotalVirtual$VH;
    }
    public static long ullTotalVirtual$get(MemorySegment seg) {
        return (long)_MEMORYSTATUSEX.ullTotalVirtual$VH.get(seg);
    }
    public static void ullTotalVirtual$set( MemorySegment seg, long x) {
        _MEMORYSTATUSEX.ullTotalVirtual$VH.set(seg, x);
    }
    public static long ullTotalVirtual$get(MemorySegment seg, long index) {
        return (long)_MEMORYSTATUSEX.ullTotalVirtual$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ullTotalVirtual$set(MemorySegment seg, long index, long x) {
        _MEMORYSTATUSEX.ullTotalVirtual$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ullAvailVirtual$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ullAvailVirtual"));
    public static VarHandle ullAvailVirtual$VH() {
        return _MEMORYSTATUSEX.ullAvailVirtual$VH;
    }
    public static long ullAvailVirtual$get(MemorySegment seg) {
        return (long)_MEMORYSTATUSEX.ullAvailVirtual$VH.get(seg);
    }
    public static void ullAvailVirtual$set( MemorySegment seg, long x) {
        _MEMORYSTATUSEX.ullAvailVirtual$VH.set(seg, x);
    }
    public static long ullAvailVirtual$get(MemorySegment seg, long index) {
        return (long)_MEMORYSTATUSEX.ullAvailVirtual$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ullAvailVirtual$set(MemorySegment seg, long index, long x) {
        _MEMORYSTATUSEX.ullAvailVirtual$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ullAvailExtendedVirtual$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ullAvailExtendedVirtual"));
    public static VarHandle ullAvailExtendedVirtual$VH() {
        return _MEMORYSTATUSEX.ullAvailExtendedVirtual$VH;
    }
    public static long ullAvailExtendedVirtual$get(MemorySegment seg) {
        return (long)_MEMORYSTATUSEX.ullAvailExtendedVirtual$VH.get(seg);
    }
    public static void ullAvailExtendedVirtual$set( MemorySegment seg, long x) {
        _MEMORYSTATUSEX.ullAvailExtendedVirtual$VH.set(seg, x);
    }
    public static long ullAvailExtendedVirtual$get(MemorySegment seg, long index) {
        return (long)_MEMORYSTATUSEX.ullAvailExtendedVirtual$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ullAvailExtendedVirtual$set(MemorySegment seg, long index, long x) {
        _MEMORYSTATUSEX.ullAvailExtendedVirtual$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


