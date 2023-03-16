// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_DEVICE_DESCRIPTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_CHAR$LAYOUT.withName("DeviceType"),
        Constants$root.C_CHAR$LAYOUT.withName("DeviceTypeModifier"),
        Constants$root.C_CHAR$LAYOUT.withName("RemovableMedia"),
        Constants$root.C_CHAR$LAYOUT.withName("CommandQueueing"),
        Constants$root.C_LONG$LAYOUT.withName("VendorIdOffset"),
        Constants$root.C_LONG$LAYOUT.withName("ProductIdOffset"),
        Constants$root.C_LONG$LAYOUT.withName("ProductRevisionOffset"),
        Constants$root.C_LONG$LAYOUT.withName("SerialNumberOffset"),
        Constants$root.C_LONG$LAYOUT.withName("BusType"),
        Constants$root.C_LONG$LAYOUT.withName("RawPropertiesLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("RawDeviceProperties"),
        MemoryLayout.paddingLayout(24)
    ).withName("_STORAGE_DEVICE_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_DEVICE_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceType"));
    public static VarHandle DeviceType$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.DeviceType$VH;
    }
    public static byte DeviceType$get(MemorySegment seg) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.DeviceType$VH.get(seg);
    }
    public static void DeviceType$set( MemorySegment seg, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.DeviceType$VH.set(seg, x);
    }
    public static byte DeviceType$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.DeviceType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceType$set(MemorySegment seg, long index, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.DeviceType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceTypeModifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceTypeModifier"));
    public static VarHandle DeviceTypeModifier$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.DeviceTypeModifier$VH;
    }
    public static byte DeviceTypeModifier$get(MemorySegment seg) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.DeviceTypeModifier$VH.get(seg);
    }
    public static void DeviceTypeModifier$set( MemorySegment seg, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.DeviceTypeModifier$VH.set(seg, x);
    }
    public static byte DeviceTypeModifier$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.DeviceTypeModifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceTypeModifier$set(MemorySegment seg, long index, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.DeviceTypeModifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RemovableMedia$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RemovableMedia"));
    public static VarHandle RemovableMedia$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.RemovableMedia$VH;
    }
    public static byte RemovableMedia$get(MemorySegment seg) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.RemovableMedia$VH.get(seg);
    }
    public static void RemovableMedia$set( MemorySegment seg, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.RemovableMedia$VH.set(seg, x);
    }
    public static byte RemovableMedia$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.RemovableMedia$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RemovableMedia$set(MemorySegment seg, long index, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.RemovableMedia$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CommandQueueing$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CommandQueueing"));
    public static VarHandle CommandQueueing$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.CommandQueueing$VH;
    }
    public static byte CommandQueueing$get(MemorySegment seg) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.CommandQueueing$VH.get(seg);
    }
    public static void CommandQueueing$set( MemorySegment seg, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.CommandQueueing$VH.set(seg, x);
    }
    public static byte CommandQueueing$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.CommandQueueing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CommandQueueing$set(MemorySegment seg, long index, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.CommandQueueing$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VendorIdOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VendorIdOffset"));
    public static VarHandle VendorIdOffset$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.VendorIdOffset$VH;
    }
    public static int VendorIdOffset$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.VendorIdOffset$VH.get(seg);
    }
    public static void VendorIdOffset$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.VendorIdOffset$VH.set(seg, x);
    }
    public static int VendorIdOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.VendorIdOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VendorIdOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.VendorIdOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProductIdOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProductIdOffset"));
    public static VarHandle ProductIdOffset$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.ProductIdOffset$VH;
    }
    public static int ProductIdOffset$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.ProductIdOffset$VH.get(seg);
    }
    public static void ProductIdOffset$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.ProductIdOffset$VH.set(seg, x);
    }
    public static int ProductIdOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.ProductIdOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProductIdOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.ProductIdOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProductRevisionOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProductRevisionOffset"));
    public static VarHandle ProductRevisionOffset$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.ProductRevisionOffset$VH;
    }
    public static int ProductRevisionOffset$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.ProductRevisionOffset$VH.get(seg);
    }
    public static void ProductRevisionOffset$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.ProductRevisionOffset$VH.set(seg, x);
    }
    public static int ProductRevisionOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.ProductRevisionOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProductRevisionOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.ProductRevisionOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SerialNumberOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SerialNumberOffset"));
    public static VarHandle SerialNumberOffset$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.SerialNumberOffset$VH;
    }
    public static int SerialNumberOffset$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.SerialNumberOffset$VH.get(seg);
    }
    public static void SerialNumberOffset$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.SerialNumberOffset$VH.set(seg, x);
    }
    public static int SerialNumberOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.SerialNumberOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SerialNumberOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.SerialNumberOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BusType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BusType"));
    public static VarHandle BusType$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.BusType$VH;
    }
    public static int BusType$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.BusType$VH.get(seg);
    }
    public static void BusType$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.BusType$VH.set(seg, x);
    }
    public static int BusType$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.BusType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BusType$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.BusType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RawPropertiesLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RawPropertiesLength"));
    public static VarHandle RawPropertiesLength$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.RawPropertiesLength$VH;
    }
    public static int RawPropertiesLength$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.RawPropertiesLength$VH.get(seg);
    }
    public static void RawPropertiesLength$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.RawPropertiesLength$VH.set(seg, x);
    }
    public static int RawPropertiesLength$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.RawPropertiesLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RawPropertiesLength$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.RawPropertiesLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RawDeviceProperties$slice(MemorySegment seg) {
        return seg.asSlice(36, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


