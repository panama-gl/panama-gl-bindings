// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_DEVICE_NUMBER_EX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("DeviceType"),
        Constants$root.C_LONG$LAYOUT.withName("DeviceNumber"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("DeviceGuid"),
        Constants$root.C_LONG$LAYOUT.withName("PartitionNumber")
    ).withName("_STORAGE_DEVICE_NUMBER_EX");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_DEVICE_NUMBER_EX.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_DEVICE_NUMBER_EX.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_NUMBER_EX.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_NUMBER_EX.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_NUMBER_EX.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_NUMBER_EX.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_DEVICE_NUMBER_EX.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_NUMBER_EX.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_NUMBER_EX.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_NUMBER_EX.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_NUMBER_EX.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _STORAGE_DEVICE_NUMBER_EX.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_NUMBER_EX.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_NUMBER_EX.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_NUMBER_EX.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_NUMBER_EX.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceType"));
    public static VarHandle DeviceType$VH() {
        return _STORAGE_DEVICE_NUMBER_EX.DeviceType$VH;
    }
    public static int DeviceType$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_NUMBER_EX.DeviceType$VH.get(seg);
    }
    public static void DeviceType$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_NUMBER_EX.DeviceType$VH.set(seg, x);
    }
    public static int DeviceType$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_NUMBER_EX.DeviceType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceType$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_NUMBER_EX.DeviceType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceNumber"));
    public static VarHandle DeviceNumber$VH() {
        return _STORAGE_DEVICE_NUMBER_EX.DeviceNumber$VH;
    }
    public static int DeviceNumber$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_NUMBER_EX.DeviceNumber$VH.get(seg);
    }
    public static void DeviceNumber$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_NUMBER_EX.DeviceNumber$VH.set(seg, x);
    }
    public static int DeviceNumber$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_NUMBER_EX.DeviceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceNumber$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_NUMBER_EX.DeviceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DeviceGuid$slice(MemorySegment seg) {
        return seg.asSlice(20, 16);
    }
    static final VarHandle PartitionNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PartitionNumber"));
    public static VarHandle PartitionNumber$VH() {
        return _STORAGE_DEVICE_NUMBER_EX.PartitionNumber$VH;
    }
    public static int PartitionNumber$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_NUMBER_EX.PartitionNumber$VH.get(seg);
    }
    public static void PartitionNumber$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_NUMBER_EX.PartitionNumber$VH.set(seg, x);
    }
    public static int PartitionNumber$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_NUMBER_EX.PartitionNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PartitionNumber$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_NUMBER_EX.PartitionNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

