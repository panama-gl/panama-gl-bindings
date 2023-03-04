// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GROUP_AFFINITY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Mask"),
        Constants$root.C_SHORT$LAYOUT.withName("Group"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("Reserved")
    ).withName("_GROUP_AFFINITY");
    public static MemoryLayout $LAYOUT() {
        return _GROUP_AFFINITY.$struct$LAYOUT;
    }
    static final VarHandle Mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Mask"));
    public static VarHandle Mask$VH() {
        return _GROUP_AFFINITY.Mask$VH;
    }
    public static long Mask$get(MemorySegment seg) {
        return (long)_GROUP_AFFINITY.Mask$VH.get(seg);
    }
    public static void Mask$set( MemorySegment seg, long x) {
        _GROUP_AFFINITY.Mask$VH.set(seg, x);
    }
    public static long Mask$get(MemorySegment seg, long index) {
        return (long)_GROUP_AFFINITY.Mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Mask$set(MemorySegment seg, long index, long x) {
        _GROUP_AFFINITY.Mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Group$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Group"));
    public static VarHandle Group$VH() {
        return _GROUP_AFFINITY.Group$VH;
    }
    public static short Group$get(MemorySegment seg) {
        return (short)_GROUP_AFFINITY.Group$VH.get(seg);
    }
    public static void Group$set( MemorySegment seg, short x) {
        _GROUP_AFFINITY.Group$VH.set(seg, x);
    }
    public static short Group$get(MemorySegment seg, long index) {
        return (short)_GROUP_AFFINITY.Group$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Group$set(MemorySegment seg, long index, short x) {
        _GROUP_AFFINITY.Group$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(10, 6);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


