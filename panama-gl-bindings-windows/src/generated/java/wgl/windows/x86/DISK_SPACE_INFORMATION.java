// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class DISK_SPACE_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("ActualTotalAllocationUnits"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ActualAvailableAllocationUnits"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ActualPoolUnavailableAllocationUnits"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("CallerTotalAllocationUnits"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("CallerAvailableAllocationUnits"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("CallerPoolUnavailableAllocationUnits"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("UsedAllocationUnits"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TotalReservedAllocationUnits"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("VolumeStorageReserveAllocationUnits"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("AvailableCommittedAllocationUnits"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("PoolAvailableAllocationUnits"),
        Constants$root.C_LONG$LAYOUT.withName("SectorsPerAllocationUnit"),
        Constants$root.C_LONG$LAYOUT.withName("BytesPerSector")
    ).withName("DISK_SPACE_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return DISK_SPACE_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle ActualTotalAllocationUnits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ActualTotalAllocationUnits"));
    public static VarHandle ActualTotalAllocationUnits$VH() {
        return DISK_SPACE_INFORMATION.ActualTotalAllocationUnits$VH;
    }
    public static long ActualTotalAllocationUnits$get(MemorySegment seg) {
        return (long)DISK_SPACE_INFORMATION.ActualTotalAllocationUnits$VH.get(seg);
    }
    public static void ActualTotalAllocationUnits$set( MemorySegment seg, long x) {
        DISK_SPACE_INFORMATION.ActualTotalAllocationUnits$VH.set(seg, x);
    }
    public static long ActualTotalAllocationUnits$get(MemorySegment seg, long index) {
        return (long)DISK_SPACE_INFORMATION.ActualTotalAllocationUnits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ActualTotalAllocationUnits$set(MemorySegment seg, long index, long x) {
        DISK_SPACE_INFORMATION.ActualTotalAllocationUnits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ActualAvailableAllocationUnits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ActualAvailableAllocationUnits"));
    public static VarHandle ActualAvailableAllocationUnits$VH() {
        return DISK_SPACE_INFORMATION.ActualAvailableAllocationUnits$VH;
    }
    public static long ActualAvailableAllocationUnits$get(MemorySegment seg) {
        return (long)DISK_SPACE_INFORMATION.ActualAvailableAllocationUnits$VH.get(seg);
    }
    public static void ActualAvailableAllocationUnits$set( MemorySegment seg, long x) {
        DISK_SPACE_INFORMATION.ActualAvailableAllocationUnits$VH.set(seg, x);
    }
    public static long ActualAvailableAllocationUnits$get(MemorySegment seg, long index) {
        return (long)DISK_SPACE_INFORMATION.ActualAvailableAllocationUnits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ActualAvailableAllocationUnits$set(MemorySegment seg, long index, long x) {
        DISK_SPACE_INFORMATION.ActualAvailableAllocationUnits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ActualPoolUnavailableAllocationUnits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ActualPoolUnavailableAllocationUnits"));
    public static VarHandle ActualPoolUnavailableAllocationUnits$VH() {
        return DISK_SPACE_INFORMATION.ActualPoolUnavailableAllocationUnits$VH;
    }
    public static long ActualPoolUnavailableAllocationUnits$get(MemorySegment seg) {
        return (long)DISK_SPACE_INFORMATION.ActualPoolUnavailableAllocationUnits$VH.get(seg);
    }
    public static void ActualPoolUnavailableAllocationUnits$set( MemorySegment seg, long x) {
        DISK_SPACE_INFORMATION.ActualPoolUnavailableAllocationUnits$VH.set(seg, x);
    }
    public static long ActualPoolUnavailableAllocationUnits$get(MemorySegment seg, long index) {
        return (long)DISK_SPACE_INFORMATION.ActualPoolUnavailableAllocationUnits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ActualPoolUnavailableAllocationUnits$set(MemorySegment seg, long index, long x) {
        DISK_SPACE_INFORMATION.ActualPoolUnavailableAllocationUnits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CallerTotalAllocationUnits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CallerTotalAllocationUnits"));
    public static VarHandle CallerTotalAllocationUnits$VH() {
        return DISK_SPACE_INFORMATION.CallerTotalAllocationUnits$VH;
    }
    public static long CallerTotalAllocationUnits$get(MemorySegment seg) {
        return (long)DISK_SPACE_INFORMATION.CallerTotalAllocationUnits$VH.get(seg);
    }
    public static void CallerTotalAllocationUnits$set( MemorySegment seg, long x) {
        DISK_SPACE_INFORMATION.CallerTotalAllocationUnits$VH.set(seg, x);
    }
    public static long CallerTotalAllocationUnits$get(MemorySegment seg, long index) {
        return (long)DISK_SPACE_INFORMATION.CallerTotalAllocationUnits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CallerTotalAllocationUnits$set(MemorySegment seg, long index, long x) {
        DISK_SPACE_INFORMATION.CallerTotalAllocationUnits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CallerAvailableAllocationUnits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CallerAvailableAllocationUnits"));
    public static VarHandle CallerAvailableAllocationUnits$VH() {
        return DISK_SPACE_INFORMATION.CallerAvailableAllocationUnits$VH;
    }
    public static long CallerAvailableAllocationUnits$get(MemorySegment seg) {
        return (long)DISK_SPACE_INFORMATION.CallerAvailableAllocationUnits$VH.get(seg);
    }
    public static void CallerAvailableAllocationUnits$set( MemorySegment seg, long x) {
        DISK_SPACE_INFORMATION.CallerAvailableAllocationUnits$VH.set(seg, x);
    }
    public static long CallerAvailableAllocationUnits$get(MemorySegment seg, long index) {
        return (long)DISK_SPACE_INFORMATION.CallerAvailableAllocationUnits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CallerAvailableAllocationUnits$set(MemorySegment seg, long index, long x) {
        DISK_SPACE_INFORMATION.CallerAvailableAllocationUnits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CallerPoolUnavailableAllocationUnits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CallerPoolUnavailableAllocationUnits"));
    public static VarHandle CallerPoolUnavailableAllocationUnits$VH() {
        return DISK_SPACE_INFORMATION.CallerPoolUnavailableAllocationUnits$VH;
    }
    public static long CallerPoolUnavailableAllocationUnits$get(MemorySegment seg) {
        return (long)DISK_SPACE_INFORMATION.CallerPoolUnavailableAllocationUnits$VH.get(seg);
    }
    public static void CallerPoolUnavailableAllocationUnits$set( MemorySegment seg, long x) {
        DISK_SPACE_INFORMATION.CallerPoolUnavailableAllocationUnits$VH.set(seg, x);
    }
    public static long CallerPoolUnavailableAllocationUnits$get(MemorySegment seg, long index) {
        return (long)DISK_SPACE_INFORMATION.CallerPoolUnavailableAllocationUnits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CallerPoolUnavailableAllocationUnits$set(MemorySegment seg, long index, long x) {
        DISK_SPACE_INFORMATION.CallerPoolUnavailableAllocationUnits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UsedAllocationUnits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UsedAllocationUnits"));
    public static VarHandle UsedAllocationUnits$VH() {
        return DISK_SPACE_INFORMATION.UsedAllocationUnits$VH;
    }
    public static long UsedAllocationUnits$get(MemorySegment seg) {
        return (long)DISK_SPACE_INFORMATION.UsedAllocationUnits$VH.get(seg);
    }
    public static void UsedAllocationUnits$set( MemorySegment seg, long x) {
        DISK_SPACE_INFORMATION.UsedAllocationUnits$VH.set(seg, x);
    }
    public static long UsedAllocationUnits$get(MemorySegment seg, long index) {
        return (long)DISK_SPACE_INFORMATION.UsedAllocationUnits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UsedAllocationUnits$set(MemorySegment seg, long index, long x) {
        DISK_SPACE_INFORMATION.UsedAllocationUnits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalReservedAllocationUnits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalReservedAllocationUnits"));
    public static VarHandle TotalReservedAllocationUnits$VH() {
        return DISK_SPACE_INFORMATION.TotalReservedAllocationUnits$VH;
    }
    public static long TotalReservedAllocationUnits$get(MemorySegment seg) {
        return (long)DISK_SPACE_INFORMATION.TotalReservedAllocationUnits$VH.get(seg);
    }
    public static void TotalReservedAllocationUnits$set( MemorySegment seg, long x) {
        DISK_SPACE_INFORMATION.TotalReservedAllocationUnits$VH.set(seg, x);
    }
    public static long TotalReservedAllocationUnits$get(MemorySegment seg, long index) {
        return (long)DISK_SPACE_INFORMATION.TotalReservedAllocationUnits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalReservedAllocationUnits$set(MemorySegment seg, long index, long x) {
        DISK_SPACE_INFORMATION.TotalReservedAllocationUnits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VolumeStorageReserveAllocationUnits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VolumeStorageReserveAllocationUnits"));
    public static VarHandle VolumeStorageReserveAllocationUnits$VH() {
        return DISK_SPACE_INFORMATION.VolumeStorageReserveAllocationUnits$VH;
    }
    public static long VolumeStorageReserveAllocationUnits$get(MemorySegment seg) {
        return (long)DISK_SPACE_INFORMATION.VolumeStorageReserveAllocationUnits$VH.get(seg);
    }
    public static void VolumeStorageReserveAllocationUnits$set( MemorySegment seg, long x) {
        DISK_SPACE_INFORMATION.VolumeStorageReserveAllocationUnits$VH.set(seg, x);
    }
    public static long VolumeStorageReserveAllocationUnits$get(MemorySegment seg, long index) {
        return (long)DISK_SPACE_INFORMATION.VolumeStorageReserveAllocationUnits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeStorageReserveAllocationUnits$set(MemorySegment seg, long index, long x) {
        DISK_SPACE_INFORMATION.VolumeStorageReserveAllocationUnits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AvailableCommittedAllocationUnits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AvailableCommittedAllocationUnits"));
    public static VarHandle AvailableCommittedAllocationUnits$VH() {
        return DISK_SPACE_INFORMATION.AvailableCommittedAllocationUnits$VH;
    }
    public static long AvailableCommittedAllocationUnits$get(MemorySegment seg) {
        return (long)DISK_SPACE_INFORMATION.AvailableCommittedAllocationUnits$VH.get(seg);
    }
    public static void AvailableCommittedAllocationUnits$set( MemorySegment seg, long x) {
        DISK_SPACE_INFORMATION.AvailableCommittedAllocationUnits$VH.set(seg, x);
    }
    public static long AvailableCommittedAllocationUnits$get(MemorySegment seg, long index) {
        return (long)DISK_SPACE_INFORMATION.AvailableCommittedAllocationUnits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AvailableCommittedAllocationUnits$set(MemorySegment seg, long index, long x) {
        DISK_SPACE_INFORMATION.AvailableCommittedAllocationUnits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PoolAvailableAllocationUnits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PoolAvailableAllocationUnits"));
    public static VarHandle PoolAvailableAllocationUnits$VH() {
        return DISK_SPACE_INFORMATION.PoolAvailableAllocationUnits$VH;
    }
    public static long PoolAvailableAllocationUnits$get(MemorySegment seg) {
        return (long)DISK_SPACE_INFORMATION.PoolAvailableAllocationUnits$VH.get(seg);
    }
    public static void PoolAvailableAllocationUnits$set( MemorySegment seg, long x) {
        DISK_SPACE_INFORMATION.PoolAvailableAllocationUnits$VH.set(seg, x);
    }
    public static long PoolAvailableAllocationUnits$get(MemorySegment seg, long index) {
        return (long)DISK_SPACE_INFORMATION.PoolAvailableAllocationUnits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PoolAvailableAllocationUnits$set(MemorySegment seg, long index, long x) {
        DISK_SPACE_INFORMATION.PoolAvailableAllocationUnits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SectorsPerAllocationUnit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SectorsPerAllocationUnit"));
    public static VarHandle SectorsPerAllocationUnit$VH() {
        return DISK_SPACE_INFORMATION.SectorsPerAllocationUnit$VH;
    }
    public static int SectorsPerAllocationUnit$get(MemorySegment seg) {
        return (int)DISK_SPACE_INFORMATION.SectorsPerAllocationUnit$VH.get(seg);
    }
    public static void SectorsPerAllocationUnit$set( MemorySegment seg, int x) {
        DISK_SPACE_INFORMATION.SectorsPerAllocationUnit$VH.set(seg, x);
    }
    public static int SectorsPerAllocationUnit$get(MemorySegment seg, long index) {
        return (int)DISK_SPACE_INFORMATION.SectorsPerAllocationUnit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SectorsPerAllocationUnit$set(MemorySegment seg, long index, int x) {
        DISK_SPACE_INFORMATION.SectorsPerAllocationUnit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BytesPerSector$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BytesPerSector"));
    public static VarHandle BytesPerSector$VH() {
        return DISK_SPACE_INFORMATION.BytesPerSector$VH;
    }
    public static int BytesPerSector$get(MemorySegment seg) {
        return (int)DISK_SPACE_INFORMATION.BytesPerSector$VH.get(seg);
    }
    public static void BytesPerSector$set( MemorySegment seg, int x) {
        DISK_SPACE_INFORMATION.BytesPerSector$VH.set(seg, x);
    }
    public static int BytesPerSector$get(MemorySegment seg, long index) {
        return (int)DISK_SPACE_INFORMATION.BytesPerSector$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BytesPerSector$set(MemorySegment seg, long index, int x) {
        DISK_SPACE_INFORMATION.BytesPerSector$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

