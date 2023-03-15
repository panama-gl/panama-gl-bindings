// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PROCESSOR_GROUP_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("MaximumProcessorCount"),
        Constants$root.C_CHAR$LAYOUT.withName("ActiveProcessorCount"),
        MemoryLayout.sequenceLayout(38, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ActiveProcessorMask")
    ).withName("_PROCESSOR_GROUP_INFO");
    public static MemoryLayout $LAYOUT() {
        return _PROCESSOR_GROUP_INFO.$struct$LAYOUT;
    }
    static final VarHandle MaximumProcessorCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaximumProcessorCount"));
    public static VarHandle MaximumProcessorCount$VH() {
        return _PROCESSOR_GROUP_INFO.MaximumProcessorCount$VH;
    }
    public static byte MaximumProcessorCount$get(MemorySegment seg) {
        return (byte)_PROCESSOR_GROUP_INFO.MaximumProcessorCount$VH.get(seg);
    }
    public static void MaximumProcessorCount$set( MemorySegment seg, byte x) {
        _PROCESSOR_GROUP_INFO.MaximumProcessorCount$VH.set(seg, x);
    }
    public static byte MaximumProcessorCount$get(MemorySegment seg, long index) {
        return (byte)_PROCESSOR_GROUP_INFO.MaximumProcessorCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaximumProcessorCount$set(MemorySegment seg, long index, byte x) {
        _PROCESSOR_GROUP_INFO.MaximumProcessorCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ActiveProcessorCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ActiveProcessorCount"));
    public static VarHandle ActiveProcessorCount$VH() {
        return _PROCESSOR_GROUP_INFO.ActiveProcessorCount$VH;
    }
    public static byte ActiveProcessorCount$get(MemorySegment seg) {
        return (byte)_PROCESSOR_GROUP_INFO.ActiveProcessorCount$VH.get(seg);
    }
    public static void ActiveProcessorCount$set( MemorySegment seg, byte x) {
        _PROCESSOR_GROUP_INFO.ActiveProcessorCount$VH.set(seg, x);
    }
    public static byte ActiveProcessorCount$get(MemorySegment seg, long index) {
        return (byte)_PROCESSOR_GROUP_INFO.ActiveProcessorCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ActiveProcessorCount$set(MemorySegment seg, long index, byte x) {
        _PROCESSOR_GROUP_INFO.ActiveProcessorCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(2, 38);
    }
    static final VarHandle ActiveProcessorMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ActiveProcessorMask"));
    public static VarHandle ActiveProcessorMask$VH() {
        return _PROCESSOR_GROUP_INFO.ActiveProcessorMask$VH;
    }
    public static long ActiveProcessorMask$get(MemorySegment seg) {
        return (long)_PROCESSOR_GROUP_INFO.ActiveProcessorMask$VH.get(seg);
    }
    public static void ActiveProcessorMask$set( MemorySegment seg, long x) {
        _PROCESSOR_GROUP_INFO.ActiveProcessorMask$VH.set(seg, x);
    }
    public static long ActiveProcessorMask$get(MemorySegment seg, long index) {
        return (long)_PROCESSOR_GROUP_INFO.ActiveProcessorMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ActiveProcessorMask$set(MemorySegment seg, long index, long x) {
        _PROCESSOR_GROUP_INFO.ActiveProcessorMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


