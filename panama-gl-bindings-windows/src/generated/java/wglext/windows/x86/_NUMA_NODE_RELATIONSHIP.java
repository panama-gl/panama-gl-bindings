// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NUMA_NODE_RELATIONSHIP {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NodeNumber"),
        MemoryLayout.sequenceLayout(20, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("Mask"),
            Constants$root.C_SHORT$LAYOUT.withName("Group"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("Reserved")
        ).withName("GroupMask")
    ).withName("_NUMA_NODE_RELATIONSHIP");
    public static MemoryLayout $LAYOUT() {
        return _NUMA_NODE_RELATIONSHIP.$struct$LAYOUT;
    }
    static final VarHandle NodeNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NodeNumber"));
    public static VarHandle NodeNumber$VH() {
        return _NUMA_NODE_RELATIONSHIP.NodeNumber$VH;
    }
    public static int NodeNumber$get(MemorySegment seg) {
        return (int)_NUMA_NODE_RELATIONSHIP.NodeNumber$VH.get(seg);
    }
    public static void NodeNumber$set( MemorySegment seg, int x) {
        _NUMA_NODE_RELATIONSHIP.NodeNumber$VH.set(seg, x);
    }
    public static int NodeNumber$get(MemorySegment seg, long index) {
        return (int)_NUMA_NODE_RELATIONSHIP.NodeNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NodeNumber$set(MemorySegment seg, long index, int x) {
        _NUMA_NODE_RELATIONSHIP.NodeNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(4, 20);
    }
    public static MemorySegment GroupMask$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


