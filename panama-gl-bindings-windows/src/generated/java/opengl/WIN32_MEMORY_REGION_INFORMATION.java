// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class WIN32_MEMORY_REGION_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("AllocationBase"),
        Constants$root.C_LONG$LAYOUT.withName("AllocationProtect"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("Flags"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1).withName("Private"),
                    MemoryLayout.paddingLayout(1).withName("MappedDataFile"),
                    MemoryLayout.paddingLayout(1).withName("MappedImage"),
                    MemoryLayout.paddingLayout(1).withName("MappedPageFile"),
                    MemoryLayout.paddingLayout(1).withName("MappedPhysical"),
                    MemoryLayout.paddingLayout(1).withName("DirectMapped"),
                    MemoryLayout.paddingLayout(26).withName("Reserved")
                )
            ).withName("$anon$0")
        ).withName("$anon$0"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("RegionSize"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("CommitSize")
    ).withName("WIN32_MEMORY_REGION_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return WIN32_MEMORY_REGION_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle AllocationBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AllocationBase"));
    public static VarHandle AllocationBase$VH() {
        return WIN32_MEMORY_REGION_INFORMATION.AllocationBase$VH;
    }
    public static MemoryAddress AllocationBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)WIN32_MEMORY_REGION_INFORMATION.AllocationBase$VH.get(seg);
    }
    public static void AllocationBase$set( MemorySegment seg, MemoryAddress x) {
        WIN32_MEMORY_REGION_INFORMATION.AllocationBase$VH.set(seg, x);
    }
    public static MemoryAddress AllocationBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)WIN32_MEMORY_REGION_INFORMATION.AllocationBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AllocationBase$set(MemorySegment seg, long index, MemoryAddress x) {
        WIN32_MEMORY_REGION_INFORMATION.AllocationBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AllocationProtect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AllocationProtect"));
    public static VarHandle AllocationProtect$VH() {
        return WIN32_MEMORY_REGION_INFORMATION.AllocationProtect$VH;
    }
    public static int AllocationProtect$get(MemorySegment seg) {
        return (int)WIN32_MEMORY_REGION_INFORMATION.AllocationProtect$VH.get(seg);
    }
    public static void AllocationProtect$set( MemorySegment seg, int x) {
        WIN32_MEMORY_REGION_INFORMATION.AllocationProtect$VH.set(seg, x);
    }
    public static int AllocationProtect$get(MemorySegment seg, long index) {
        return (int)WIN32_MEMORY_REGION_INFORMATION.AllocationProtect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AllocationProtect$set(MemorySegment seg, long index, int x) {
        WIN32_MEMORY_REGION_INFORMATION.AllocationProtect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return WIN32_MEMORY_REGION_INFORMATION.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)WIN32_MEMORY_REGION_INFORMATION.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        WIN32_MEMORY_REGION_INFORMATION.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)WIN32_MEMORY_REGION_INFORMATION.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        WIN32_MEMORY_REGION_INFORMATION.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RegionSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RegionSize"));
    public static VarHandle RegionSize$VH() {
        return WIN32_MEMORY_REGION_INFORMATION.RegionSize$VH;
    }
    public static long RegionSize$get(MemorySegment seg) {
        return (long)WIN32_MEMORY_REGION_INFORMATION.RegionSize$VH.get(seg);
    }
    public static void RegionSize$set( MemorySegment seg, long x) {
        WIN32_MEMORY_REGION_INFORMATION.RegionSize$VH.set(seg, x);
    }
    public static long RegionSize$get(MemorySegment seg, long index) {
        return (long)WIN32_MEMORY_REGION_INFORMATION.RegionSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RegionSize$set(MemorySegment seg, long index, long x) {
        WIN32_MEMORY_REGION_INFORMATION.RegionSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CommitSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CommitSize"));
    public static VarHandle CommitSize$VH() {
        return WIN32_MEMORY_REGION_INFORMATION.CommitSize$VH;
    }
    public static long CommitSize$get(MemorySegment seg) {
        return (long)WIN32_MEMORY_REGION_INFORMATION.CommitSize$VH.get(seg);
    }
    public static void CommitSize$set( MemorySegment seg, long x) {
        WIN32_MEMORY_REGION_INFORMATION.CommitSize$VH.set(seg, x);
    }
    public static long CommitSize$get(MemorySegment seg, long index) {
        return (long)WIN32_MEMORY_REGION_INFORMATION.CommitSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CommitSize$set(MemorySegment seg, long index, long x) {
        WIN32_MEMORY_REGION_INFORMATION.CommitSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


