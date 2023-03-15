// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DISK_GROW_PARTITION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("PartitionNumber"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("BytesToGrow")
    ).withName("_DISK_GROW_PARTITION");
    public static MemoryLayout $LAYOUT() {
        return _DISK_GROW_PARTITION.$struct$LAYOUT;
    }
    static final VarHandle PartitionNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PartitionNumber"));
    public static VarHandle PartitionNumber$VH() {
        return _DISK_GROW_PARTITION.PartitionNumber$VH;
    }
    public static int PartitionNumber$get(MemorySegment seg) {
        return (int)_DISK_GROW_PARTITION.PartitionNumber$VH.get(seg);
    }
    public static void PartitionNumber$set( MemorySegment seg, int x) {
        _DISK_GROW_PARTITION.PartitionNumber$VH.set(seg, x);
    }
    public static int PartitionNumber$get(MemorySegment seg, long index) {
        return (int)_DISK_GROW_PARTITION.PartitionNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PartitionNumber$set(MemorySegment seg, long index, int x) {
        _DISK_GROW_PARTITION.PartitionNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment BytesToGrow$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


