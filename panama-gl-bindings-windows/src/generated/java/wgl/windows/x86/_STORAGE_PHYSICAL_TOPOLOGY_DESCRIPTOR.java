// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("NodeCount"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("NodeId"),
            Constants$root.C_LONG$LAYOUT.withName("AdapterCount"),
            Constants$root.C_LONG$LAYOUT.withName("AdapterDataLength"),
            Constants$root.C_LONG$LAYOUT.withName("AdapterDataOffset"),
            Constants$root.C_LONG$LAYOUT.withName("DeviceCount"),
            Constants$root.C_LONG$LAYOUT.withName("DeviceDataLength"),
            Constants$root.C_LONG$LAYOUT.withName("DeviceDataOffset"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_LONG$LAYOUT).withName("Reserved")
        ).withName("_STORAGE_PHYSICAL_NODE_DATA")).withName("Node")
    ).withName("_STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NodeCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NodeCount"));
    public static VarHandle NodeCount$VH() {
        return _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.NodeCount$VH;
    }
    public static int NodeCount$get(MemorySegment seg) {
        return (int)_STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.NodeCount$VH.get(seg);
    }
    public static void NodeCount$set( MemorySegment seg, int x) {
        _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.NodeCount$VH.set(seg, x);
    }
    public static int NodeCount$get(MemorySegment seg, long index) {
        return (int)_STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.NodeCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NodeCount$set(MemorySegment seg, long index, int x) {
        _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.NodeCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Node$slice(MemorySegment seg) {
        return seg.asSlice(16, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


