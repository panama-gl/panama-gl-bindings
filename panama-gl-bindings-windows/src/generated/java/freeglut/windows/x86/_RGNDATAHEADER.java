// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RGNDATAHEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwSize"),
        Constants$root.C_LONG$LAYOUT.withName("iType"),
        Constants$root.C_LONG$LAYOUT.withName("nCount"),
        Constants$root.C_LONG$LAYOUT.withName("nRgnSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcBound")
    ).withName("_RGNDATAHEADER");
    public static MemoryLayout $LAYOUT() {
        return _RGNDATAHEADER.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return _RGNDATAHEADER.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)_RGNDATAHEADER.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        _RGNDATAHEADER.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)_RGNDATAHEADER.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        _RGNDATAHEADER.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iType"));
    public static VarHandle iType$VH() {
        return _RGNDATAHEADER.iType$VH;
    }
    public static int iType$get(MemorySegment seg) {
        return (int)_RGNDATAHEADER.iType$VH.get(seg);
    }
    public static void iType$set( MemorySegment seg, int x) {
        _RGNDATAHEADER.iType$VH.set(seg, x);
    }
    public static int iType$get(MemorySegment seg, long index) {
        return (int)_RGNDATAHEADER.iType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iType$set(MemorySegment seg, long index, int x) {
        _RGNDATAHEADER.iType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nCount"));
    public static VarHandle nCount$VH() {
        return _RGNDATAHEADER.nCount$VH;
    }
    public static int nCount$get(MemorySegment seg) {
        return (int)_RGNDATAHEADER.nCount$VH.get(seg);
    }
    public static void nCount$set( MemorySegment seg, int x) {
        _RGNDATAHEADER.nCount$VH.set(seg, x);
    }
    public static int nCount$get(MemorySegment seg, long index) {
        return (int)_RGNDATAHEADER.nCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nCount$set(MemorySegment seg, long index, int x) {
        _RGNDATAHEADER.nCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nRgnSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nRgnSize"));
    public static VarHandle nRgnSize$VH() {
        return _RGNDATAHEADER.nRgnSize$VH;
    }
    public static int nRgnSize$get(MemorySegment seg) {
        return (int)_RGNDATAHEADER.nRgnSize$VH.get(seg);
    }
    public static void nRgnSize$set( MemorySegment seg, int x) {
        _RGNDATAHEADER.nRgnSize$VH.set(seg, x);
    }
    public static int nRgnSize$get(MemorySegment seg, long index) {
        return (int)_RGNDATAHEADER.nRgnSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nRgnSize$set(MemorySegment seg, long index, int x) {
        _RGNDATAHEADER.nRgnSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcBound$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


