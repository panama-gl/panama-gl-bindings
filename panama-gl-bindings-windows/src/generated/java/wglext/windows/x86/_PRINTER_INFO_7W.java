// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PRINTER_INFO_7W {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszObjectGUID"),
        Constants$root.C_LONG$LAYOUT.withName("dwAction"),
        MemoryLayout.paddingLayout(32)
    ).withName("_PRINTER_INFO_7W");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_INFO_7W.$struct$LAYOUT;
    }
    static final VarHandle pszObjectGUID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszObjectGUID"));
    public static VarHandle pszObjectGUID$VH() {
        return _PRINTER_INFO_7W.pszObjectGUID$VH;
    }
    public static MemoryAddress pszObjectGUID$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_7W.pszObjectGUID$VH.get(seg);
    }
    public static void pszObjectGUID$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_7W.pszObjectGUID$VH.set(seg, x);
    }
    public static MemoryAddress pszObjectGUID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_7W.pszObjectGUID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszObjectGUID$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_7W.pszObjectGUID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAction"));
    public static VarHandle dwAction$VH() {
        return _PRINTER_INFO_7W.dwAction$VH;
    }
    public static int dwAction$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_7W.dwAction$VH.get(seg);
    }
    public static void dwAction$set( MemorySegment seg, int x) {
        _PRINTER_INFO_7W.dwAction$VH.set(seg, x);
    }
    public static int dwAction$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_7W.dwAction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAction$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_7W.dwAction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


