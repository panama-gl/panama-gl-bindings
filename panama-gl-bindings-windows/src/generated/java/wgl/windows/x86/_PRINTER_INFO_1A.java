// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PRINTER_INFO_1A {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pDescription"),
        Constants$root.C_POINTER$LAYOUT.withName("pName"),
        Constants$root.C_POINTER$LAYOUT.withName("pComment")
    ).withName("_PRINTER_INFO_1A");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_INFO_1A.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _PRINTER_INFO_1A.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_1A.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _PRINTER_INFO_1A.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_1A.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_1A.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDescription$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDescription"));
    public static VarHandle pDescription$VH() {
        return _PRINTER_INFO_1A.pDescription$VH;
    }
    public static MemoryAddress pDescription$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_1A.pDescription$VH.get(seg);
    }
    public static void pDescription$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_1A.pDescription$VH.set(seg, x);
    }
    public static MemoryAddress pDescription$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_1A.pDescription$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDescription$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_1A.pDescription$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pName"));
    public static VarHandle pName$VH() {
        return _PRINTER_INFO_1A.pName$VH;
    }
    public static MemoryAddress pName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_1A.pName$VH.get(seg);
    }
    public static void pName$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_1A.pName$VH.set(seg, x);
    }
    public static MemoryAddress pName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_1A.pName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_1A.pName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pComment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pComment"));
    public static VarHandle pComment$VH() {
        return _PRINTER_INFO_1A.pComment$VH;
    }
    public static MemoryAddress pComment$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_1A.pComment$VH.get(seg);
    }
    public static void pComment$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_1A.pComment$VH.set(seg, x);
    }
    public static MemoryAddress pComment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_1A.pComment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pComment$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_1A.pComment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


