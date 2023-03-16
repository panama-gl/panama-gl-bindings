// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IO_COUNTERS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("ReadOperationCount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("WriteOperationCount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("OtherOperationCount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ReadTransferCount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("WriteTransferCount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("OtherTransferCount")
    ).withName("_IO_COUNTERS");
    public static MemoryLayout $LAYOUT() {
        return _IO_COUNTERS.$struct$LAYOUT;
    }
    static final VarHandle ReadOperationCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReadOperationCount"));
    public static VarHandle ReadOperationCount$VH() {
        return _IO_COUNTERS.ReadOperationCount$VH;
    }
    public static long ReadOperationCount$get(MemorySegment seg) {
        return (long)_IO_COUNTERS.ReadOperationCount$VH.get(seg);
    }
    public static void ReadOperationCount$set( MemorySegment seg, long x) {
        _IO_COUNTERS.ReadOperationCount$VH.set(seg, x);
    }
    public static long ReadOperationCount$get(MemorySegment seg, long index) {
        return (long)_IO_COUNTERS.ReadOperationCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReadOperationCount$set(MemorySegment seg, long index, long x) {
        _IO_COUNTERS.ReadOperationCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WriteOperationCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WriteOperationCount"));
    public static VarHandle WriteOperationCount$VH() {
        return _IO_COUNTERS.WriteOperationCount$VH;
    }
    public static long WriteOperationCount$get(MemorySegment seg) {
        return (long)_IO_COUNTERS.WriteOperationCount$VH.get(seg);
    }
    public static void WriteOperationCount$set( MemorySegment seg, long x) {
        _IO_COUNTERS.WriteOperationCount$VH.set(seg, x);
    }
    public static long WriteOperationCount$get(MemorySegment seg, long index) {
        return (long)_IO_COUNTERS.WriteOperationCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WriteOperationCount$set(MemorySegment seg, long index, long x) {
        _IO_COUNTERS.WriteOperationCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OtherOperationCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OtherOperationCount"));
    public static VarHandle OtherOperationCount$VH() {
        return _IO_COUNTERS.OtherOperationCount$VH;
    }
    public static long OtherOperationCount$get(MemorySegment seg) {
        return (long)_IO_COUNTERS.OtherOperationCount$VH.get(seg);
    }
    public static void OtherOperationCount$set( MemorySegment seg, long x) {
        _IO_COUNTERS.OtherOperationCount$VH.set(seg, x);
    }
    public static long OtherOperationCount$get(MemorySegment seg, long index) {
        return (long)_IO_COUNTERS.OtherOperationCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OtherOperationCount$set(MemorySegment seg, long index, long x) {
        _IO_COUNTERS.OtherOperationCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReadTransferCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReadTransferCount"));
    public static VarHandle ReadTransferCount$VH() {
        return _IO_COUNTERS.ReadTransferCount$VH;
    }
    public static long ReadTransferCount$get(MemorySegment seg) {
        return (long)_IO_COUNTERS.ReadTransferCount$VH.get(seg);
    }
    public static void ReadTransferCount$set( MemorySegment seg, long x) {
        _IO_COUNTERS.ReadTransferCount$VH.set(seg, x);
    }
    public static long ReadTransferCount$get(MemorySegment seg, long index) {
        return (long)_IO_COUNTERS.ReadTransferCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReadTransferCount$set(MemorySegment seg, long index, long x) {
        _IO_COUNTERS.ReadTransferCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WriteTransferCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WriteTransferCount"));
    public static VarHandle WriteTransferCount$VH() {
        return _IO_COUNTERS.WriteTransferCount$VH;
    }
    public static long WriteTransferCount$get(MemorySegment seg) {
        return (long)_IO_COUNTERS.WriteTransferCount$VH.get(seg);
    }
    public static void WriteTransferCount$set( MemorySegment seg, long x) {
        _IO_COUNTERS.WriteTransferCount$VH.set(seg, x);
    }
    public static long WriteTransferCount$get(MemorySegment seg, long index) {
        return (long)_IO_COUNTERS.WriteTransferCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WriteTransferCount$set(MemorySegment seg, long index, long x) {
        _IO_COUNTERS.WriteTransferCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OtherTransferCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OtherTransferCount"));
    public static VarHandle OtherTransferCount$VH() {
        return _IO_COUNTERS.OtherTransferCount$VH;
    }
    public static long OtherTransferCount$get(MemorySegment seg) {
        return (long)_IO_COUNTERS.OtherTransferCount$VH.get(seg);
    }
    public static void OtherTransferCount$set( MemorySegment seg, long x) {
        _IO_COUNTERS.OtherTransferCount$VH.set(seg, x);
    }
    public static long OtherTransferCount$get(MemorySegment seg, long index) {
        return (long)_IO_COUNTERS.OtherTransferCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OtherTransferCount$set(MemorySegment seg, long index, long x) {
        _IO_COUNTERS.OtherTransferCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


