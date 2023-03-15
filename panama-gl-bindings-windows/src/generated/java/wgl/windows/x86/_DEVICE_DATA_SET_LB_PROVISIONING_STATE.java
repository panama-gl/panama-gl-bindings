// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DEVICE_DATA_SET_LB_PROVISIONING_STATE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("SlabSizeInBytes"),
        Constants$root.C_LONG$LAYOUT.withName("SlabOffsetDeltaInBytes"),
        Constants$root.C_LONG$LAYOUT.withName("SlabAllocationBitMapBitCount"),
        Constants$root.C_LONG$LAYOUT.withName("SlabAllocationBitMapLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("SlabAllocationBitMap")
    ).withName("_DEVICE_DATA_SET_LB_PROVISIONING_STATE");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_DATA_SET_LB_PROVISIONING_STATE.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _DEVICE_DATA_SET_LB_PROVISIONING_STATE.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_DEVICE_DATA_SET_LB_PROVISIONING_STATE.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _DEVICE_DATA_SET_LB_PROVISIONING_STATE.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DATA_SET_LB_PROVISIONING_STATE.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _DEVICE_DATA_SET_LB_PROVISIONING_STATE.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _DEVICE_DATA_SET_LB_PROVISIONING_STATE.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_DEVICE_DATA_SET_LB_PROVISIONING_STATE.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _DEVICE_DATA_SET_LB_PROVISIONING_STATE.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DATA_SET_LB_PROVISIONING_STATE.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _DEVICE_DATA_SET_LB_PROVISIONING_STATE.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SlabSizeInBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SlabSizeInBytes"));
    public static VarHandle SlabSizeInBytes$VH() {
        return _DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabSizeInBytes$VH;
    }
    public static long SlabSizeInBytes$get(MemorySegment seg) {
        return (long)_DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabSizeInBytes$VH.get(seg);
    }
    public static void SlabSizeInBytes$set( MemorySegment seg, long x) {
        _DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabSizeInBytes$VH.set(seg, x);
    }
    public static long SlabSizeInBytes$get(MemorySegment seg, long index) {
        return (long)_DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabSizeInBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SlabSizeInBytes$set(MemorySegment seg, long index, long x) {
        _DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabSizeInBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SlabOffsetDeltaInBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SlabOffsetDeltaInBytes"));
    public static VarHandle SlabOffsetDeltaInBytes$VH() {
        return _DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabOffsetDeltaInBytes$VH;
    }
    public static int SlabOffsetDeltaInBytes$get(MemorySegment seg) {
        return (int)_DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabOffsetDeltaInBytes$VH.get(seg);
    }
    public static void SlabOffsetDeltaInBytes$set( MemorySegment seg, int x) {
        _DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabOffsetDeltaInBytes$VH.set(seg, x);
    }
    public static int SlabOffsetDeltaInBytes$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabOffsetDeltaInBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SlabOffsetDeltaInBytes$set(MemorySegment seg, long index, int x) {
        _DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabOffsetDeltaInBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SlabAllocationBitMapBitCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SlabAllocationBitMapBitCount"));
    public static VarHandle SlabAllocationBitMapBitCount$VH() {
        return _DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabAllocationBitMapBitCount$VH;
    }
    public static int SlabAllocationBitMapBitCount$get(MemorySegment seg) {
        return (int)_DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabAllocationBitMapBitCount$VH.get(seg);
    }
    public static void SlabAllocationBitMapBitCount$set( MemorySegment seg, int x) {
        _DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabAllocationBitMapBitCount$VH.set(seg, x);
    }
    public static int SlabAllocationBitMapBitCount$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabAllocationBitMapBitCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SlabAllocationBitMapBitCount$set(MemorySegment seg, long index, int x) {
        _DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabAllocationBitMapBitCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SlabAllocationBitMapLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SlabAllocationBitMapLength"));
    public static VarHandle SlabAllocationBitMapLength$VH() {
        return _DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabAllocationBitMapLength$VH;
    }
    public static int SlabAllocationBitMapLength$get(MemorySegment seg) {
        return (int)_DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabAllocationBitMapLength$VH.get(seg);
    }
    public static void SlabAllocationBitMapLength$set( MemorySegment seg, int x) {
        _DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabAllocationBitMapLength$VH.set(seg, x);
    }
    public static int SlabAllocationBitMapLength$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabAllocationBitMapLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SlabAllocationBitMapLength$set(MemorySegment seg, long index, int x) {
        _DEVICE_DATA_SET_LB_PROVISIONING_STATE.SlabAllocationBitMapLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SlabAllocationBitMap$slice(MemorySegment seg) {
        return seg.asSlice(28, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


