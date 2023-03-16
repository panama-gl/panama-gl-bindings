// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OFNOTIFYEXA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("hwndFrom"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("idFrom"),
            Constants$root.C_LONG$LAYOUT.withName("code"),
            MemoryLayout.paddingLayout(32)
        ).withName("hdr"),
        Constants$root.C_POINTER$LAYOUT.withName("lpOFN"),
        Constants$root.C_POINTER$LAYOUT.withName("psf"),
        Constants$root.C_POINTER$LAYOUT.withName("pidl")
    ).withName("_OFNOTIFYEXA");
    public static MemoryLayout $LAYOUT() {
        return _OFNOTIFYEXA.$struct$LAYOUT;
    }
    public static MemorySegment hdr$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    static final VarHandle lpOFN$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpOFN"));
    public static VarHandle lpOFN$VH() {
        return _OFNOTIFYEXA.lpOFN$VH;
    }
    public static MemoryAddress lpOFN$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OFNOTIFYEXA.lpOFN$VH.get(seg);
    }
    public static void lpOFN$set( MemorySegment seg, MemoryAddress x) {
        _OFNOTIFYEXA.lpOFN$VH.set(seg, x);
    }
    public static MemoryAddress lpOFN$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OFNOTIFYEXA.lpOFN$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpOFN$set(MemorySegment seg, long index, MemoryAddress x) {
        _OFNOTIFYEXA.lpOFN$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle psf$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("psf"));
    public static VarHandle psf$VH() {
        return _OFNOTIFYEXA.psf$VH;
    }
    public static MemoryAddress psf$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OFNOTIFYEXA.psf$VH.get(seg);
    }
    public static void psf$set( MemorySegment seg, MemoryAddress x) {
        _OFNOTIFYEXA.psf$VH.set(seg, x);
    }
    public static MemoryAddress psf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OFNOTIFYEXA.psf$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void psf$set(MemorySegment seg, long index, MemoryAddress x) {
        _OFNOTIFYEXA.psf$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pidl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pidl"));
    public static VarHandle pidl$VH() {
        return _OFNOTIFYEXA.pidl$VH;
    }
    public static MemoryAddress pidl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OFNOTIFYEXA.pidl$VH.get(seg);
    }
    public static void pidl$set( MemorySegment seg, MemoryAddress x) {
        _OFNOTIFYEXA.pidl$VH.set(seg, x);
    }
    public static MemoryAddress pidl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OFNOTIFYEXA.pidl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pidl$set(MemorySegment seg, long index, MemoryAddress x) {
        _OFNOTIFYEXA.pidl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


