// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SCRUB_PARITY_EXTENT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Offset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Length")
    ).withName("_SCRUB_PARITY_EXTENT");
    public static MemoryLayout $LAYOUT() {
        return _SCRUB_PARITY_EXTENT.$struct$LAYOUT;
    }
    static final VarHandle Offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Offset"));
    public static VarHandle Offset$VH() {
        return _SCRUB_PARITY_EXTENT.Offset$VH;
    }
    public static long Offset$get(MemorySegment seg) {
        return (long)_SCRUB_PARITY_EXTENT.Offset$VH.get(seg);
    }
    public static void Offset$set( MemorySegment seg, long x) {
        _SCRUB_PARITY_EXTENT.Offset$VH.set(seg, x);
    }
    public static long Offset$get(MemorySegment seg, long index) {
        return (long)_SCRUB_PARITY_EXTENT.Offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Offset$set(MemorySegment seg, long index, long x) {
        _SCRUB_PARITY_EXTENT.Offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _SCRUB_PARITY_EXTENT.Length$VH;
    }
    public static long Length$get(MemorySegment seg) {
        return (long)_SCRUB_PARITY_EXTENT.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, long x) {
        _SCRUB_PARITY_EXTENT.Length$VH.set(seg, x);
    }
    public static long Length$get(MemorySegment seg, long index) {
        return (long)_SCRUB_PARITY_EXTENT.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, long x) {
        _SCRUB_PARITY_EXTENT.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


