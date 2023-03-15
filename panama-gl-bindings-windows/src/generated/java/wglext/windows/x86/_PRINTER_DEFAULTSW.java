// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PRINTER_DEFAULTSW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pDatatype"),
        Constants$root.C_POINTER$LAYOUT.withName("pDevMode"),
        Constants$root.C_LONG$LAYOUT.withName("DesiredAccess"),
        MemoryLayout.paddingLayout(32)
    ).withName("_PRINTER_DEFAULTSW");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_DEFAULTSW.$struct$LAYOUT;
    }
    static final VarHandle pDatatype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDatatype"));
    public static VarHandle pDatatype$VH() {
        return _PRINTER_DEFAULTSW.pDatatype$VH;
    }
    public static MemoryAddress pDatatype$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_DEFAULTSW.pDatatype$VH.get(seg);
    }
    public static void pDatatype$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_DEFAULTSW.pDatatype$VH.set(seg, x);
    }
    public static MemoryAddress pDatatype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_DEFAULTSW.pDatatype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDatatype$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_DEFAULTSW.pDatatype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDevMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDevMode"));
    public static VarHandle pDevMode$VH() {
        return _PRINTER_DEFAULTSW.pDevMode$VH;
    }
    public static MemoryAddress pDevMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_DEFAULTSW.pDevMode$VH.get(seg);
    }
    public static void pDevMode$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_DEFAULTSW.pDevMode$VH.set(seg, x);
    }
    public static MemoryAddress pDevMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_DEFAULTSW.pDevMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDevMode$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_DEFAULTSW.pDevMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DesiredAccess$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DesiredAccess"));
    public static VarHandle DesiredAccess$VH() {
        return _PRINTER_DEFAULTSW.DesiredAccess$VH;
    }
    public static int DesiredAccess$get(MemorySegment seg) {
        return (int)_PRINTER_DEFAULTSW.DesiredAccess$VH.get(seg);
    }
    public static void DesiredAccess$set( MemorySegment seg, int x) {
        _PRINTER_DEFAULTSW.DesiredAccess$VH.set(seg, x);
    }
    public static int DesiredAccess$get(MemorySegment seg, long index) {
        return (int)_PRINTER_DEFAULTSW.DesiredAccess$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DesiredAccess$set(MemorySegment seg, long index, int x) {
        _PRINTER_DEFAULTSW.DesiredAccess$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


