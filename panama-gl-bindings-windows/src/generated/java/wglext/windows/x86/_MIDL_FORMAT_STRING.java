// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MIDL_FORMAT_STRING {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Pad"),
        MemoryLayout.sequenceLayout(0, Constants$root.C_CHAR$LAYOUT).withName("Format")
    ).withName("_MIDL_FORMAT_STRING");
    public static MemoryLayout $LAYOUT() {
        return _MIDL_FORMAT_STRING.$struct$LAYOUT;
    }
    static final VarHandle Pad$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Pad"));
    public static VarHandle Pad$VH() {
        return _MIDL_FORMAT_STRING.Pad$VH;
    }
    public static short Pad$get(MemorySegment seg) {
        return (short)_MIDL_FORMAT_STRING.Pad$VH.get(seg);
    }
    public static void Pad$set( MemorySegment seg, short x) {
        _MIDL_FORMAT_STRING.Pad$VH.set(seg, x);
    }
    public static short Pad$get(MemorySegment seg, long index) {
        return (short)_MIDL_FORMAT_STRING.Pad$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Pad$set(MemorySegment seg, long index, short x) {
        _MIDL_FORMAT_STRING.Pad$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


