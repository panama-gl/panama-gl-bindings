// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _UNIVERSAL_NAME_INFOA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpUniversalName")
    ).withName("_UNIVERSAL_NAME_INFOA");
    public static MemoryLayout $LAYOUT() {
        return _UNIVERSAL_NAME_INFOA.$struct$LAYOUT;
    }
    static final VarHandle lpUniversalName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpUniversalName"));
    public static VarHandle lpUniversalName$VH() {
        return _UNIVERSAL_NAME_INFOA.lpUniversalName$VH;
    }
    public static MemoryAddress lpUniversalName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_UNIVERSAL_NAME_INFOA.lpUniversalName$VH.get(seg);
    }
    public static void lpUniversalName$set( MemorySegment seg, MemoryAddress x) {
        _UNIVERSAL_NAME_INFOA.lpUniversalName$VH.set(seg, x);
    }
    public static MemoryAddress lpUniversalName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_UNIVERSAL_NAME_INFOA.lpUniversalName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpUniversalName$set(MemorySegment seg, long index, MemoryAddress x) {
        _UNIVERSAL_NAME_INFOA.lpUniversalName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


