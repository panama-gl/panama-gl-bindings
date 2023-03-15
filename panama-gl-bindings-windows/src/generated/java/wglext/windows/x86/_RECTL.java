// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RECTL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("left"),
        Constants$root.C_LONG$LAYOUT.withName("top"),
        Constants$root.C_LONG$LAYOUT.withName("right"),
        Constants$root.C_LONG$LAYOUT.withName("bottom")
    ).withName("_RECTL");
    public static MemoryLayout $LAYOUT() {
        return _RECTL.$struct$LAYOUT;
    }
    static final VarHandle left$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("left"));
    public static VarHandle left$VH() {
        return _RECTL.left$VH;
    }
    public static int left$get(MemorySegment seg) {
        return (int)_RECTL.left$VH.get(seg);
    }
    public static void left$set( MemorySegment seg, int x) {
        _RECTL.left$VH.set(seg, x);
    }
    public static int left$get(MemorySegment seg, long index) {
        return (int)_RECTL.left$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void left$set(MemorySegment seg, long index, int x) {
        _RECTL.left$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle top$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("top"));
    public static VarHandle top$VH() {
        return _RECTL.top$VH;
    }
    public static int top$get(MemorySegment seg) {
        return (int)_RECTL.top$VH.get(seg);
    }
    public static void top$set( MemorySegment seg, int x) {
        _RECTL.top$VH.set(seg, x);
    }
    public static int top$get(MemorySegment seg, long index) {
        return (int)_RECTL.top$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void top$set(MemorySegment seg, long index, int x) {
        _RECTL.top$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle right$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("right"));
    public static VarHandle right$VH() {
        return _RECTL.right$VH;
    }
    public static int right$get(MemorySegment seg) {
        return (int)_RECTL.right$VH.get(seg);
    }
    public static void right$set( MemorySegment seg, int x) {
        _RECTL.right$VH.set(seg, x);
    }
    public static int right$get(MemorySegment seg, long index) {
        return (int)_RECTL.right$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void right$set(MemorySegment seg, long index, int x) {
        _RECTL.right$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bottom$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bottom"));
    public static VarHandle bottom$VH() {
        return _RECTL.bottom$VH;
    }
    public static int bottom$get(MemorySegment seg) {
        return (int)_RECTL.bottom$VH.get(seg);
    }
    public static void bottom$set( MemorySegment seg, int x) {
        _RECTL.bottom$VH.set(seg, x);
    }
    public static int bottom$get(MemorySegment seg, long index) {
        return (int)_RECTL.bottom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bottom$set(MemorySegment seg, long index, int x) {
        _RECTL.bottom$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


