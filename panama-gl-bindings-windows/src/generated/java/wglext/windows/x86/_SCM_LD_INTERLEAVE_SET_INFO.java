// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SCM_LD_INTERLEAVE_SET_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("InterleaveSetSize"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("DeviceHandle"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("DeviceGuid")
        ).withName("_SCM_INTERLEAVED_PD_INFO")).withName("InterleaveSet")
    ).withName("_SCM_LD_INTERLEAVE_SET_INFO");
    public static MemoryLayout $LAYOUT() {
        return _SCM_LD_INTERLEAVE_SET_INFO.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _SCM_LD_INTERLEAVE_SET_INFO.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_SCM_LD_INTERLEAVE_SET_INFO.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _SCM_LD_INTERLEAVE_SET_INFO.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_SCM_LD_INTERLEAVE_SET_INFO.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _SCM_LD_INTERLEAVE_SET_INFO.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCM_LD_INTERLEAVE_SET_INFO.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_SCM_LD_INTERLEAVE_SET_INFO.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _SCM_LD_INTERLEAVE_SET_INFO.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCM_LD_INTERLEAVE_SET_INFO.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCM_LD_INTERLEAVE_SET_INFO.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle InterleaveSetSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InterleaveSetSize"));
    public static VarHandle InterleaveSetSize$VH() {
        return _SCM_LD_INTERLEAVE_SET_INFO.InterleaveSetSize$VH;
    }
    public static int InterleaveSetSize$get(MemorySegment seg) {
        return (int)_SCM_LD_INTERLEAVE_SET_INFO.InterleaveSetSize$VH.get(seg);
    }
    public static void InterleaveSetSize$set( MemorySegment seg, int x) {
        _SCM_LD_INTERLEAVE_SET_INFO.InterleaveSetSize$VH.set(seg, x);
    }
    public static int InterleaveSetSize$get(MemorySegment seg, long index) {
        return (int)_SCM_LD_INTERLEAVE_SET_INFO.InterleaveSetSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InterleaveSetSize$set(MemorySegment seg, long index, int x) {
        _SCM_LD_INTERLEAVE_SET_INFO.InterleaveSetSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment InterleaveSet$slice(MemorySegment seg) {
        return seg.asSlice(12, 20);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


