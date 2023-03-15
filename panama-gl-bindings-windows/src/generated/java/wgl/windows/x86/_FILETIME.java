// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILETIME {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwLowDateTime"),
        Constants$root.C_LONG$LAYOUT.withName("dwHighDateTime")
    ).withName("_FILETIME");
    public static MemoryLayout $LAYOUT() {
        return _FILETIME.$struct$LAYOUT;
    }
    static final VarHandle dwLowDateTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLowDateTime"));
    public static VarHandle dwLowDateTime$VH() {
        return _FILETIME.dwLowDateTime$VH;
    }
    public static int dwLowDateTime$get(MemorySegment seg) {
        return (int)_FILETIME.dwLowDateTime$VH.get(seg);
    }
    public static void dwLowDateTime$set( MemorySegment seg, int x) {
        _FILETIME.dwLowDateTime$VH.set(seg, x);
    }
    public static int dwLowDateTime$get(MemorySegment seg, long index) {
        return (int)_FILETIME.dwLowDateTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLowDateTime$set(MemorySegment seg, long index, int x) {
        _FILETIME.dwLowDateTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwHighDateTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwHighDateTime"));
    public static VarHandle dwHighDateTime$VH() {
        return _FILETIME.dwHighDateTime$VH;
    }
    public static int dwHighDateTime$get(MemorySegment seg) {
        return (int)_FILETIME.dwHighDateTime$VH.get(seg);
    }
    public static void dwHighDateTime$set( MemorySegment seg, int x) {
        _FILETIME.dwHighDateTime$VH.set(seg, x);
    }
    public static int dwHighDateTime$get(MemorySegment seg, long index) {
        return (int)_FILETIME.dwHighDateTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwHighDateTime$set(MemorySegment seg, long index, int x) {
        _FILETIME.dwHighDateTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


