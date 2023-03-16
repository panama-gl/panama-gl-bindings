// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SHSTOCKICONINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hIcon"),
        Constants$root.C_LONG$LAYOUT.withName("iSysImageIndex"),
        Constants$root.C_LONG$LAYOUT.withName("iIcon"),
        MemoryLayout.sequenceLayout(260, Constants$root.C_SHORT$LAYOUT).withName("szPath")
    ).withName("_SHSTOCKICONINFO");
    public static MemoryLayout $LAYOUT() {
        return _SHSTOCKICONINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _SHSTOCKICONINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_SHSTOCKICONINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _SHSTOCKICONINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_SHSTOCKICONINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _SHSTOCKICONINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hIcon"));
    public static VarHandle hIcon$VH() {
        return _SHSTOCKICONINFO.hIcon$VH;
    }
    public static MemoryAddress hIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHSTOCKICONINFO.hIcon$VH.get(seg);
    }
    public static void hIcon$set( MemorySegment seg, MemoryAddress x) {
        _SHSTOCKICONINFO.hIcon$VH.set(seg, x);
    }
    public static MemoryAddress hIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHSTOCKICONINFO.hIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHSTOCKICONINFO.hIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iSysImageIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iSysImageIndex"));
    public static VarHandle iSysImageIndex$VH() {
        return _SHSTOCKICONINFO.iSysImageIndex$VH;
    }
    public static int iSysImageIndex$get(MemorySegment seg) {
        return (int)_SHSTOCKICONINFO.iSysImageIndex$VH.get(seg);
    }
    public static void iSysImageIndex$set( MemorySegment seg, int x) {
        _SHSTOCKICONINFO.iSysImageIndex$VH.set(seg, x);
    }
    public static int iSysImageIndex$get(MemorySegment seg, long index) {
        return (int)_SHSTOCKICONINFO.iSysImageIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iSysImageIndex$set(MemorySegment seg, long index, int x) {
        _SHSTOCKICONINFO.iSysImageIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iIcon"));
    public static VarHandle iIcon$VH() {
        return _SHSTOCKICONINFO.iIcon$VH;
    }
    public static int iIcon$get(MemorySegment seg) {
        return (int)_SHSTOCKICONINFO.iIcon$VH.get(seg);
    }
    public static void iIcon$set( MemorySegment seg, int x) {
        _SHSTOCKICONINFO.iIcon$VH.set(seg, x);
    }
    public static int iIcon$get(MemorySegment seg, long index) {
        return (int)_SHSTOCKICONINFO.iIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iIcon$set(MemorySegment seg, long index, int x) {
        _SHSTOCKICONINFO.iIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPath$slice(MemorySegment seg) {
        return seg.asSlice(24, 520);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


