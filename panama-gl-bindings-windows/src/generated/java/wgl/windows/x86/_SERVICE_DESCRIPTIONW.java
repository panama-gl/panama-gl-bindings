// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SERVICE_DESCRIPTIONW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpDescription")
    ).withName("_SERVICE_DESCRIPTIONW");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_DESCRIPTIONW.$struct$LAYOUT;
    }
    static final VarHandle lpDescription$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpDescription"));
    public static VarHandle lpDescription$VH() {
        return _SERVICE_DESCRIPTIONW.lpDescription$VH;
    }
    public static MemoryAddress lpDescription$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_DESCRIPTIONW.lpDescription$VH.get(seg);
    }
    public static void lpDescription$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_DESCRIPTIONW.lpDescription$VH.set(seg, x);
    }
    public static MemoryAddress lpDescription$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_DESCRIPTIONW.lpDescription$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDescription$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_DESCRIPTIONW.lpDescription$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


