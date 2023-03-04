// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DOCINFOW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpszDocName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszOutput"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszDatatype"),
        Constants$root.C_LONG$LAYOUT.withName("fwType"),
        MemoryLayout.paddingLayout(32)
    ).withName("_DOCINFOW");
    public static MemoryLayout $LAYOUT() {
        return _DOCINFOW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _DOCINFOW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_DOCINFOW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _DOCINFOW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_DOCINFOW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _DOCINFOW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszDocName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszDocName"));
    public static VarHandle lpszDocName$VH() {
        return _DOCINFOW.lpszDocName$VH;
    }
    public static MemoryAddress lpszDocName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DOCINFOW.lpszDocName$VH.get(seg);
    }
    public static void lpszDocName$set( MemorySegment seg, MemoryAddress x) {
        _DOCINFOW.lpszDocName$VH.set(seg, x);
    }
    public static MemoryAddress lpszDocName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DOCINFOW.lpszDocName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszDocName$set(MemorySegment seg, long index, MemoryAddress x) {
        _DOCINFOW.lpszDocName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszOutput$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszOutput"));
    public static VarHandle lpszOutput$VH() {
        return _DOCINFOW.lpszOutput$VH;
    }
    public static MemoryAddress lpszOutput$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DOCINFOW.lpszOutput$VH.get(seg);
    }
    public static void lpszOutput$set( MemorySegment seg, MemoryAddress x) {
        _DOCINFOW.lpszOutput$VH.set(seg, x);
    }
    public static MemoryAddress lpszOutput$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DOCINFOW.lpszOutput$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszOutput$set(MemorySegment seg, long index, MemoryAddress x) {
        _DOCINFOW.lpszOutput$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszDatatype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszDatatype"));
    public static VarHandle lpszDatatype$VH() {
        return _DOCINFOW.lpszDatatype$VH;
    }
    public static MemoryAddress lpszDatatype$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_DOCINFOW.lpszDatatype$VH.get(seg);
    }
    public static void lpszDatatype$set( MemorySegment seg, MemoryAddress x) {
        _DOCINFOW.lpszDatatype$VH.set(seg, x);
    }
    public static MemoryAddress lpszDatatype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_DOCINFOW.lpszDatatype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszDatatype$set(MemorySegment seg, long index, MemoryAddress x) {
        _DOCINFOW.lpszDatatype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fwType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fwType"));
    public static VarHandle fwType$VH() {
        return _DOCINFOW.fwType$VH;
    }
    public static int fwType$get(MemorySegment seg) {
        return (int)_DOCINFOW.fwType$VH.get(seg);
    }
    public static void fwType$set( MemorySegment seg, int x) {
        _DOCINFOW.fwType$VH.set(seg, x);
    }
    public static int fwType$get(MemorySegment seg, long index) {
        return (int)_DOCINFOW.fwType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fwType$set(MemorySegment seg, long index, int x) {
        _DOCINFOW.fwType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


