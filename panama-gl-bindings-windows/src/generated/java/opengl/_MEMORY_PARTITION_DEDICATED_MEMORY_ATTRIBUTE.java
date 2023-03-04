// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Value")
    ).withName("_MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE");
    public static MemoryLayout $LAYOUT() {
        return _MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.$struct$LAYOUT;
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Value"));
    public static VarHandle Value$VH() {
        return _MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Value$VH;
    }
    public static long Value$get(MemorySegment seg) {
        return (long)_MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Value$VH.get(seg);
    }
    public static void Value$set( MemorySegment seg, long x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Value$VH.set(seg, x);
    }
    public static long Value$get(MemorySegment seg, long index) {
        return (long)_MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Value$set(MemorySegment seg, long index, long x) {
        _MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE.Value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


