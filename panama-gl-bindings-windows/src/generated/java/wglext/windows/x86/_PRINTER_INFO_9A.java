// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PRINTER_INFO_9A {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pDevMode")
    ).withName("_PRINTER_INFO_9A");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_INFO_9A.$struct$LAYOUT;
    }
    static final VarHandle pDevMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDevMode"));
    public static VarHandle pDevMode$VH() {
        return _PRINTER_INFO_9A.pDevMode$VH;
    }
    public static MemoryAddress pDevMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_9A.pDevMode$VH.get(seg);
    }
    public static void pDevMode$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_9A.pDevMode$VH.set(seg, x);
    }
    public static MemoryAddress pDevMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_9A.pDevMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDevMode$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_9A.pDevMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


