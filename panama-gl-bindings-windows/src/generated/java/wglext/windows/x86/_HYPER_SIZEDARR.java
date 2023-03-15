// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _HYPER_SIZEDARR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("clSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pData")
    ).withName("_HYPER_SIZEDARR");
    public static MemoryLayout $LAYOUT() {
        return _HYPER_SIZEDARR.$struct$LAYOUT;
    }
    static final VarHandle clSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("clSize"));
    public static VarHandle clSize$VH() {
        return _HYPER_SIZEDARR.clSize$VH;
    }
    public static int clSize$get(MemorySegment seg) {
        return (int)_HYPER_SIZEDARR.clSize$VH.get(seg);
    }
    public static void clSize$set( MemorySegment seg, int x) {
        _HYPER_SIZEDARR.clSize$VH.set(seg, x);
    }
    public static int clSize$get(MemorySegment seg, long index) {
        return (int)_HYPER_SIZEDARR.clSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void clSize$set(MemorySegment seg, long index, int x) {
        _HYPER_SIZEDARR.clSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pData"));
    public static VarHandle pData$VH() {
        return _HYPER_SIZEDARR.pData$VH;
    }
    public static MemoryAddress pData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_HYPER_SIZEDARR.pData$VH.get(seg);
    }
    public static void pData$set( MemorySegment seg, MemoryAddress x) {
        _HYPER_SIZEDARR.pData$VH.set(seg, x);
    }
    public static MemoryAddress pData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_HYPER_SIZEDARR.pData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pData$set(MemorySegment seg, long index, MemoryAddress x) {
        _HYPER_SIZEDARR.pData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


