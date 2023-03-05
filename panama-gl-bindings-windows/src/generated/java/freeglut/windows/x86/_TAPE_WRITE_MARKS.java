// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TAPE_WRITE_MARKS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        Constants$root.C_CHAR$LAYOUT.withName("Immediate"),
        MemoryLayout.paddingLayout(24)
    ).withName("_TAPE_WRITE_MARKS");
    public static MemoryLayout $LAYOUT() {
        return _TAPE_WRITE_MARKS.$struct$LAYOUT;
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _TAPE_WRITE_MARKS.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)_TAPE_WRITE_MARKS.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        _TAPE_WRITE_MARKS.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_TAPE_WRITE_MARKS.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _TAPE_WRITE_MARKS.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return _TAPE_WRITE_MARKS.Count$VH;
    }
    public static int Count$get(MemorySegment seg) {
        return (int)_TAPE_WRITE_MARKS.Count$VH.get(seg);
    }
    public static void Count$set( MemorySegment seg, int x) {
        _TAPE_WRITE_MARKS.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)_TAPE_WRITE_MARKS.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        _TAPE_WRITE_MARKS.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Immediate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Immediate"));
    public static VarHandle Immediate$VH() {
        return _TAPE_WRITE_MARKS.Immediate$VH;
    }
    public static byte Immediate$get(MemorySegment seg) {
        return (byte)_TAPE_WRITE_MARKS.Immediate$VH.get(seg);
    }
    public static void Immediate$set( MemorySegment seg, byte x) {
        _TAPE_WRITE_MARKS.Immediate$VH.set(seg, x);
    }
    public static byte Immediate$get(MemorySegment seg, long index) {
        return (byte)_TAPE_WRITE_MARKS.Immediate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Immediate$set(MemorySegment seg, long index, byte x) {
        _TAPE_WRITE_MARKS.Immediate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


