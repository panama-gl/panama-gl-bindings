// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FIXED {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("fract"),
        Constants$root.C_SHORT$LAYOUT.withName("value")
    ).withName("_FIXED");
    public static MemoryLayout $LAYOUT() {
        return _FIXED.$struct$LAYOUT;
    }
    static final VarHandle fract$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fract"));
    public static VarHandle fract$VH() {
        return _FIXED.fract$VH;
    }
    public static short fract$get(MemorySegment seg) {
        return (short)_FIXED.fract$VH.get(seg);
    }
    public static void fract$set( MemorySegment seg, short x) {
        _FIXED.fract$VH.set(seg, x);
    }
    public static short fract$get(MemorySegment seg, long index) {
        return (short)_FIXED.fract$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fract$set(MemorySegment seg, long index, short x) {
        _FIXED.fract$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _FIXED.value$VH;
    }
    public static short value$get(MemorySegment seg) {
        return (short)_FIXED.value$VH.get(seg);
    }
    public static void value$set( MemorySegment seg, short x) {
        _FIXED.value$VH.set(seg, x);
    }
    public static short value$get(MemorySegment seg, long index) {
        return (short)_FIXED.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, short x) {
        _FIXED.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


