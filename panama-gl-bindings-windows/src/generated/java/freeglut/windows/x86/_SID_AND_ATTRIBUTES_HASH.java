// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SID_AND_ATTRIBUTES_HASH {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("SidCount"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("SidAttr"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_LONG_LONG$LAYOUT).withName("Hash")
    ).withName("_SID_AND_ATTRIBUTES_HASH");
    public static MemoryLayout $LAYOUT() {
        return _SID_AND_ATTRIBUTES_HASH.$struct$LAYOUT;
    }
    static final VarHandle SidCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SidCount"));
    public static VarHandle SidCount$VH() {
        return _SID_AND_ATTRIBUTES_HASH.SidCount$VH;
    }
    public static int SidCount$get(MemorySegment seg) {
        return (int)_SID_AND_ATTRIBUTES_HASH.SidCount$VH.get(seg);
    }
    public static void SidCount$set( MemorySegment seg, int x) {
        _SID_AND_ATTRIBUTES_HASH.SidCount$VH.set(seg, x);
    }
    public static int SidCount$get(MemorySegment seg, long index) {
        return (int)_SID_AND_ATTRIBUTES_HASH.SidCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SidCount$set(MemorySegment seg, long index, int x) {
        _SID_AND_ATTRIBUTES_HASH.SidCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SidAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SidAttr"));
    public static VarHandle SidAttr$VH() {
        return _SID_AND_ATTRIBUTES_HASH.SidAttr$VH;
    }
    public static MemoryAddress SidAttr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SID_AND_ATTRIBUTES_HASH.SidAttr$VH.get(seg);
    }
    public static void SidAttr$set( MemorySegment seg, MemoryAddress x) {
        _SID_AND_ATTRIBUTES_HASH.SidAttr$VH.set(seg, x);
    }
    public static MemoryAddress SidAttr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SID_AND_ATTRIBUTES_HASH.SidAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SidAttr$set(MemorySegment seg, long index, MemoryAddress x) {
        _SID_AND_ATTRIBUTES_HASH.SidAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Hash$slice(MemorySegment seg) {
        return seg.asSlice(16, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


