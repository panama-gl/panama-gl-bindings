// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SHFILEINFOW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hIcon"),
        Constants$root.C_LONG$LAYOUT.withName("iIcon"),
        Constants$root.C_LONG$LAYOUT.withName("dwAttributes"),
        MemoryLayout.sequenceLayout(260, Constants$root.C_SHORT$LAYOUT).withName("szDisplayName"),
        MemoryLayout.sequenceLayout(80, Constants$root.C_SHORT$LAYOUT).withName("szTypeName")
    ).withName("_SHFILEINFOW");
    public static MemoryLayout $LAYOUT() {
        return _SHFILEINFOW.$struct$LAYOUT;
    }
    static final VarHandle hIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hIcon"));
    public static VarHandle hIcon$VH() {
        return _SHFILEINFOW.hIcon$VH;
    }
    public static MemoryAddress hIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHFILEINFOW.hIcon$VH.get(seg);
    }
    public static void hIcon$set( MemorySegment seg, MemoryAddress x) {
        _SHFILEINFOW.hIcon$VH.set(seg, x);
    }
    public static MemoryAddress hIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHFILEINFOW.hIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHFILEINFOW.hIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iIcon"));
    public static VarHandle iIcon$VH() {
        return _SHFILEINFOW.iIcon$VH;
    }
    public static int iIcon$get(MemorySegment seg) {
        return (int)_SHFILEINFOW.iIcon$VH.get(seg);
    }
    public static void iIcon$set( MemorySegment seg, int x) {
        _SHFILEINFOW.iIcon$VH.set(seg, x);
    }
    public static int iIcon$get(MemorySegment seg, long index) {
        return (int)_SHFILEINFOW.iIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iIcon$set(MemorySegment seg, long index, int x) {
        _SHFILEINFOW.iIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAttributes"));
    public static VarHandle dwAttributes$VH() {
        return _SHFILEINFOW.dwAttributes$VH;
    }
    public static int dwAttributes$get(MemorySegment seg) {
        return (int)_SHFILEINFOW.dwAttributes$VH.get(seg);
    }
    public static void dwAttributes$set( MemorySegment seg, int x) {
        _SHFILEINFOW.dwAttributes$VH.set(seg, x);
    }
    public static int dwAttributes$get(MemorySegment seg, long index) {
        return (int)_SHFILEINFOW.dwAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAttributes$set(MemorySegment seg, long index, int x) {
        _SHFILEINFOW.dwAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szDisplayName$slice(MemorySegment seg) {
        return seg.asSlice(16, 520);
    }
    public static MemorySegment szTypeName$slice(MemorySegment seg) {
        return seg.asSlice(536, 160);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

