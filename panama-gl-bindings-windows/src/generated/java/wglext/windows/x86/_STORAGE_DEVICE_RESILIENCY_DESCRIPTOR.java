// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("NameOffset"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfLogicalCopies"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfPhysicalCopies"),
        Constants$root.C_LONG$LAYOUT.withName("PhysicalDiskRedundancy"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfColumns"),
        Constants$root.C_LONG$LAYOUT.withName("Interleave")
    ).withName("_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NameOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NameOffset"));
    public static VarHandle NameOffset$VH() {
        return _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NameOffset$VH;
    }
    public static int NameOffset$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NameOffset$VH.get(seg);
    }
    public static void NameOffset$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NameOffset$VH.set(seg, x);
    }
    public static int NameOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NameOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NameOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NameOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfLogicalCopies$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfLogicalCopies"));
    public static VarHandle NumberOfLogicalCopies$VH() {
        return _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfLogicalCopies$VH;
    }
    public static int NumberOfLogicalCopies$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfLogicalCopies$VH.get(seg);
    }
    public static void NumberOfLogicalCopies$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfLogicalCopies$VH.set(seg, x);
    }
    public static int NumberOfLogicalCopies$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfLogicalCopies$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfLogicalCopies$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfLogicalCopies$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfPhysicalCopies$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfPhysicalCopies"));
    public static VarHandle NumberOfPhysicalCopies$VH() {
        return _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfPhysicalCopies$VH;
    }
    public static int NumberOfPhysicalCopies$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfPhysicalCopies$VH.get(seg);
    }
    public static void NumberOfPhysicalCopies$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfPhysicalCopies$VH.set(seg, x);
    }
    public static int NumberOfPhysicalCopies$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfPhysicalCopies$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfPhysicalCopies$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfPhysicalCopies$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PhysicalDiskRedundancy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PhysicalDiskRedundancy"));
    public static VarHandle PhysicalDiskRedundancy$VH() {
        return _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.PhysicalDiskRedundancy$VH;
    }
    public static int PhysicalDiskRedundancy$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.PhysicalDiskRedundancy$VH.get(seg);
    }
    public static void PhysicalDiskRedundancy$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.PhysicalDiskRedundancy$VH.set(seg, x);
    }
    public static int PhysicalDiskRedundancy$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.PhysicalDiskRedundancy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PhysicalDiskRedundancy$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.PhysicalDiskRedundancy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfColumns$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfColumns"));
    public static VarHandle NumberOfColumns$VH() {
        return _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfColumns$VH;
    }
    public static int NumberOfColumns$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfColumns$VH.get(seg);
    }
    public static void NumberOfColumns$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfColumns$VH.set(seg, x);
    }
    public static int NumberOfColumns$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfColumns$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfColumns$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.NumberOfColumns$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Interleave$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Interleave"));
    public static VarHandle Interleave$VH() {
        return _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Interleave$VH;
    }
    public static int Interleave$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Interleave$VH.get(seg);
    }
    public static void Interleave$set( MemorySegment seg, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Interleave$VH.set(seg, x);
    }
    public static int Interleave$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Interleave$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Interleave$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_RESILIENCY_DESCRIPTOR.Interleave$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


