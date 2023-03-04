// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PROCESS_MEMORY_EXHAUSTION_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Version"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Value")
    ).withName("_PROCESS_MEMORY_EXHAUSTION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _PROCESS_MEMORY_EXHAUSTION_INFO.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _PROCESS_MEMORY_EXHAUSTION_INFO.Version$VH;
    }
    public static short Version$get(MemorySegment seg) {
        return (short)_PROCESS_MEMORY_EXHAUSTION_INFO.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, short x) {
        _PROCESS_MEMORY_EXHAUSTION_INFO.Version$VH.set(seg, x);
    }
    public static short Version$get(MemorySegment seg, long index) {
        return (short)_PROCESS_MEMORY_EXHAUSTION_INFO.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, short x) {
        _PROCESS_MEMORY_EXHAUSTION_INFO.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _PROCESS_MEMORY_EXHAUSTION_INFO.Reserved$VH;
    }
    public static short Reserved$get(MemorySegment seg) {
        return (short)_PROCESS_MEMORY_EXHAUSTION_INFO.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, short x) {
        _PROCESS_MEMORY_EXHAUSTION_INFO.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_PROCESS_MEMORY_EXHAUSTION_INFO.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _PROCESS_MEMORY_EXHAUSTION_INFO.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _PROCESS_MEMORY_EXHAUSTION_INFO.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)_PROCESS_MEMORY_EXHAUSTION_INFO.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        _PROCESS_MEMORY_EXHAUSTION_INFO.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_PROCESS_MEMORY_EXHAUSTION_INFO.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _PROCESS_MEMORY_EXHAUSTION_INFO.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Value"));
    public static VarHandle Value$VH() {
        return _PROCESS_MEMORY_EXHAUSTION_INFO.Value$VH;
    }
    public static long Value$get(MemorySegment seg) {
        return (long)_PROCESS_MEMORY_EXHAUSTION_INFO.Value$VH.get(seg);
    }
    public static void Value$set( MemorySegment seg, long x) {
        _PROCESS_MEMORY_EXHAUSTION_INFO.Value$VH.set(seg, x);
    }
    public static long Value$get(MemorySegment seg, long index) {
        return (long)_PROCESS_MEMORY_EXHAUSTION_INFO.Value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Value$set(MemorySegment seg, long index, long x) {
        _PROCESS_MEMORY_EXHAUSTION_INFO.Value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


