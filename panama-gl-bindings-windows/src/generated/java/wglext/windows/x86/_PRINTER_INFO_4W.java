// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PRINTER_INFO_4W {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pPrinterName"),
        Constants$root.C_POINTER$LAYOUT.withName("pServerName"),
        Constants$root.C_LONG$LAYOUT.withName("Attributes"),
        MemoryLayout.paddingLayout(32)
    ).withName("_PRINTER_INFO_4W");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_INFO_4W.$struct$LAYOUT;
    }
    static final VarHandle pPrinterName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrinterName"));
    public static VarHandle pPrinterName$VH() {
        return _PRINTER_INFO_4W.pPrinterName$VH;
    }
    public static MemoryAddress pPrinterName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_4W.pPrinterName$VH.get(seg);
    }
    public static void pPrinterName$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_4W.pPrinterName$VH.set(seg, x);
    }
    public static MemoryAddress pPrinterName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_4W.pPrinterName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrinterName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_4W.pPrinterName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pServerName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pServerName"));
    public static VarHandle pServerName$VH() {
        return _PRINTER_INFO_4W.pServerName$VH;
    }
    public static MemoryAddress pServerName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_4W.pServerName$VH.get(seg);
    }
    public static void pServerName$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_4W.pServerName$VH.set(seg, x);
    }
    public static MemoryAddress pServerName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_4W.pServerName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pServerName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_4W.pServerName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Attributes"));
    public static VarHandle Attributes$VH() {
        return _PRINTER_INFO_4W.Attributes$VH;
    }
    public static int Attributes$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_4W.Attributes$VH.get(seg);
    }
    public static void Attributes$set( MemorySegment seg, int x) {
        _PRINTER_INFO_4W.Attributes$VH.set(seg, x);
    }
    public static int Attributes$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_4W.Attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Attributes$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_4W.Attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


