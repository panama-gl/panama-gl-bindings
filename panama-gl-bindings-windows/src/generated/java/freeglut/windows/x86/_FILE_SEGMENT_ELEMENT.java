// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_SEGMENT_ELEMENT {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Buffer"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Alignment")
    ).withName("_FILE_SEGMENT_ELEMENT");
    public static MemoryLayout $LAYOUT() {
        return _FILE_SEGMENT_ELEMENT.$union$LAYOUT;
    }
    static final VarHandle Buffer$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Buffer"));
    public static VarHandle Buffer$VH() {
        return _FILE_SEGMENT_ELEMENT.Buffer$VH;
    }
    public static MemoryAddress Buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_FILE_SEGMENT_ELEMENT.Buffer$VH.get(seg);
    }
    public static void Buffer$set( MemorySegment seg, MemoryAddress x) {
        _FILE_SEGMENT_ELEMENT.Buffer$VH.set(seg, x);
    }
    public static MemoryAddress Buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_FILE_SEGMENT_ELEMENT.Buffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Buffer$set(MemorySegment seg, long index, MemoryAddress x) {
        _FILE_SEGMENT_ELEMENT.Buffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Alignment$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Alignment"));
    public static VarHandle Alignment$VH() {
        return _FILE_SEGMENT_ELEMENT.Alignment$VH;
    }
    public static long Alignment$get(MemorySegment seg) {
        return (long)_FILE_SEGMENT_ELEMENT.Alignment$VH.get(seg);
    }
    public static void Alignment$set( MemorySegment seg, long x) {
        _FILE_SEGMENT_ELEMENT.Alignment$VH.set(seg, x);
    }
    public static long Alignment$get(MemorySegment seg, long index) {
        return (long)_FILE_SEGMENT_ELEMENT.Alignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Alignment$set(MemorySegment seg, long index, long x) {
        _FILE_SEGMENT_ELEMENT.Alignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

