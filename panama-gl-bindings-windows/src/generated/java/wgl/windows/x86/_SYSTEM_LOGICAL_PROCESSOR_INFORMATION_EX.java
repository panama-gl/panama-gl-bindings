// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Relationship"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("Flags"),
                Constants$root.C_CHAR$LAYOUT.withName("EfficiencyClass"),
                MemoryLayout.sequenceLayout(20, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
                Constants$root.C_SHORT$LAYOUT.withName("GroupCount"),
                MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
                    Constants$root.C_LONG_LONG$LAYOUT.withName("Mask"),
                    Constants$root.C_SHORT$LAYOUT.withName("Group"),
                    MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("Reserved")
                ).withName("_GROUP_AFFINITY")).withName("GroupMask")
            ).withName("Processor"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("NodeNumber"),
                MemoryLayout.sequenceLayout(20, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG_LONG$LAYOUT.withName("Mask"),
                    Constants$root.C_SHORT$LAYOUT.withName("Group"),
                    MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("Reserved")
                ).withName("GroupMask")
            ).withName("NumaNode"),
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("Level"),
                Constants$root.C_CHAR$LAYOUT.withName("Associativity"),
                Constants$root.C_SHORT$LAYOUT.withName("LineSize"),
                Constants$root.C_LONG$LAYOUT.withName("CacheSize"),
                Constants$root.C_LONG$LAYOUT.withName("Type"),
                MemoryLayout.sequenceLayout(20, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG_LONG$LAYOUT.withName("Mask"),
                    Constants$root.C_SHORT$LAYOUT.withName("Group"),
                    MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("Reserved")
                ).withName("GroupMask")
            ).withName("Cache"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("MaximumGroupCount"),
                Constants$root.C_SHORT$LAYOUT.withName("ActiveGroupCount"),
                MemoryLayout.sequenceLayout(20, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
                MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
                    Constants$root.C_CHAR$LAYOUT.withName("MaximumProcessorCount"),
                    Constants$root.C_CHAR$LAYOUT.withName("ActiveProcessorCount"),
                    MemoryLayout.sequenceLayout(38, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
                    Constants$root.C_LONG_LONG$LAYOUT.withName("ActiveProcessorMask")
                ).withName("_PROCESSOR_GROUP_INFO")).withName("GroupInfo")
            ).withName("Group")
        ).withName("$anon$0")
    ).withName("_SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX");
    public static MemoryLayout $LAYOUT() {
        return _SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX.$struct$LAYOUT;
    }
    static final VarHandle Relationship$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Relationship"));
    public static VarHandle Relationship$VH() {
        return _SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX.Relationship$VH;
    }
    public static int Relationship$get(MemorySegment seg) {
        return (int)_SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX.Relationship$VH.get(seg);
    }
    public static void Relationship$set( MemorySegment seg, int x) {
        _SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX.Relationship$VH.set(seg, x);
    }
    public static int Relationship$get(MemorySegment seg, long index) {
        return (int)_SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX.Relationship$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Relationship$set(MemorySegment seg, long index, int x) {
        _SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX.Relationship$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Processor$slice(MemorySegment seg) {
        return seg.asSlice(8, 40);
    }
    public static MemorySegment NumaNode$slice(MemorySegment seg) {
        return seg.asSlice(8, 40);
    }
    public static MemorySegment Cache$slice(MemorySegment seg) {
        return seg.asSlice(8, 48);
    }
    public static MemorySegment Group$slice(MemorySegment seg) {
        return seg.asSlice(8, 72);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


