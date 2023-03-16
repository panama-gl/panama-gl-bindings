// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SET_PARTITION_INFORMATION_EX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("PartitionStyle"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("PartitionType")
            ).withName("Mbr"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("PartitionType"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("PartitionId"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("Attributes"),
                MemoryLayout.sequenceLayout(36, Constants$root.C_SHORT$LAYOUT).withName("Name")
            ).withName("Gpt")
        ).withName("$anon$0")
    ).withName("_SET_PARTITION_INFORMATION_EX");
    public static MemoryLayout $LAYOUT() {
        return _SET_PARTITION_INFORMATION_EX.$struct$LAYOUT;
    }
    static final VarHandle PartitionStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PartitionStyle"));
    public static VarHandle PartitionStyle$VH() {
        return _SET_PARTITION_INFORMATION_EX.PartitionStyle$VH;
    }
    public static int PartitionStyle$get(MemorySegment seg) {
        return (int)_SET_PARTITION_INFORMATION_EX.PartitionStyle$VH.get(seg);
    }
    public static void PartitionStyle$set( MemorySegment seg, int x) {
        _SET_PARTITION_INFORMATION_EX.PartitionStyle$VH.set(seg, x);
    }
    public static int PartitionStyle$get(MemorySegment seg, long index) {
        return (int)_SET_PARTITION_INFORMATION_EX.PartitionStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PartitionStyle$set(MemorySegment seg, long index, int x) {
        _SET_PARTITION_INFORMATION_EX.PartitionStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Mbr$slice(MemorySegment seg) {
        return seg.asSlice(8, 1);
    }
    public static MemorySegment Gpt$slice(MemorySegment seg) {
        return seg.asSlice(8, 112);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

