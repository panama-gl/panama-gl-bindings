// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FSCTL_QUERY_REGION_INFO_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Alignment"),
        Constants$root.C_LONG$LAYOUT.withName("TotalNumberOfRegions"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfRegionsReturned"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("TierId"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Offset"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Length")
        ).withName("_FILE_STORAGE_TIER_REGION")).withName("Regions")
    ).withName("_FSCTL_QUERY_REGION_INFO_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _FSCTL_QUERY_REGION_INFO_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _FSCTL_QUERY_REGION_INFO_OUTPUT.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_FSCTL_QUERY_REGION_INFO_OUTPUT.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_FSCTL_QUERY_REGION_INFO_OUTPUT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _FSCTL_QUERY_REGION_INFO_OUTPUT.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_FSCTL_QUERY_REGION_INFO_OUTPUT.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_FSCTL_QUERY_REGION_INFO_OUTPUT.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _FSCTL_QUERY_REGION_INFO_OUTPUT.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_FSCTL_QUERY_REGION_INFO_OUTPUT.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_FSCTL_QUERY_REGION_INFO_OUTPUT.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _FSCTL_QUERY_REGION_INFO_OUTPUT.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_FSCTL_QUERY_REGION_INFO_OUTPUT.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_FSCTL_QUERY_REGION_INFO_OUTPUT.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Alignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Alignment"));
    public static VarHandle Alignment$VH() {
        return _FSCTL_QUERY_REGION_INFO_OUTPUT.Alignment$VH;
    }
    public static long Alignment$get(MemorySegment seg) {
        return (long)_FSCTL_QUERY_REGION_INFO_OUTPUT.Alignment$VH.get(seg);
    }
    public static void Alignment$set( MemorySegment seg, long x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.Alignment$VH.set(seg, x);
    }
    public static long Alignment$get(MemorySegment seg, long index) {
        return (long)_FSCTL_QUERY_REGION_INFO_OUTPUT.Alignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Alignment$set(MemorySegment seg, long index, long x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.Alignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalNumberOfRegions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalNumberOfRegions"));
    public static VarHandle TotalNumberOfRegions$VH() {
        return _FSCTL_QUERY_REGION_INFO_OUTPUT.TotalNumberOfRegions$VH;
    }
    public static int TotalNumberOfRegions$get(MemorySegment seg) {
        return (int)_FSCTL_QUERY_REGION_INFO_OUTPUT.TotalNumberOfRegions$VH.get(seg);
    }
    public static void TotalNumberOfRegions$set( MemorySegment seg, int x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.TotalNumberOfRegions$VH.set(seg, x);
    }
    public static int TotalNumberOfRegions$get(MemorySegment seg, long index) {
        return (int)_FSCTL_QUERY_REGION_INFO_OUTPUT.TotalNumberOfRegions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNumberOfRegions$set(MemorySegment seg, long index, int x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.TotalNumberOfRegions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfRegionsReturned$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfRegionsReturned"));
    public static VarHandle NumberOfRegionsReturned$VH() {
        return _FSCTL_QUERY_REGION_INFO_OUTPUT.NumberOfRegionsReturned$VH;
    }
    public static int NumberOfRegionsReturned$get(MemorySegment seg) {
        return (int)_FSCTL_QUERY_REGION_INFO_OUTPUT.NumberOfRegionsReturned$VH.get(seg);
    }
    public static void NumberOfRegionsReturned$set( MemorySegment seg, int x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.NumberOfRegionsReturned$VH.set(seg, x);
    }
    public static int NumberOfRegionsReturned$get(MemorySegment seg, long index) {
        return (int)_FSCTL_QUERY_REGION_INFO_OUTPUT.NumberOfRegionsReturned$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfRegionsReturned$set(MemorySegment seg, long index, int x) {
        _FSCTL_QUERY_REGION_INFO_OUTPUT.NumberOfRegionsReturned$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Regions$slice(MemorySegment seg) {
        return seg.asSlice(32, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


