// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PRINTER_INFO_5A {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pPrinterName"),
        Constants$root.C_POINTER$LAYOUT.withName("pPortName"),
        Constants$root.C_LONG$LAYOUT.withName("Attributes"),
        Constants$root.C_LONG$LAYOUT.withName("DeviceNotSelectedTimeout"),
        Constants$root.C_LONG$LAYOUT.withName("TransmissionRetryTimeout"),
        MemoryLayout.paddingLayout(32)
    ).withName("_PRINTER_INFO_5A");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_INFO_5A.$struct$LAYOUT;
    }
    static final VarHandle pPrinterName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrinterName"));
    public static VarHandle pPrinterName$VH() {
        return _PRINTER_INFO_5A.pPrinterName$VH;
    }
    public static MemoryAddress pPrinterName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_5A.pPrinterName$VH.get(seg);
    }
    public static void pPrinterName$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_5A.pPrinterName$VH.set(seg, x);
    }
    public static MemoryAddress pPrinterName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_5A.pPrinterName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrinterName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_5A.pPrinterName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPortName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPortName"));
    public static VarHandle pPortName$VH() {
        return _PRINTER_INFO_5A.pPortName$VH;
    }
    public static MemoryAddress pPortName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_5A.pPortName$VH.get(seg);
    }
    public static void pPortName$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_5A.pPortName$VH.set(seg, x);
    }
    public static MemoryAddress pPortName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_5A.pPortName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPortName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_5A.pPortName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Attributes"));
    public static VarHandle Attributes$VH() {
        return _PRINTER_INFO_5A.Attributes$VH;
    }
    public static int Attributes$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_5A.Attributes$VH.get(seg);
    }
    public static void Attributes$set( MemorySegment seg, int x) {
        _PRINTER_INFO_5A.Attributes$VH.set(seg, x);
    }
    public static int Attributes$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_5A.Attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Attributes$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_5A.Attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceNotSelectedTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceNotSelectedTimeout"));
    public static VarHandle DeviceNotSelectedTimeout$VH() {
        return _PRINTER_INFO_5A.DeviceNotSelectedTimeout$VH;
    }
    public static int DeviceNotSelectedTimeout$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_5A.DeviceNotSelectedTimeout$VH.get(seg);
    }
    public static void DeviceNotSelectedTimeout$set( MemorySegment seg, int x) {
        _PRINTER_INFO_5A.DeviceNotSelectedTimeout$VH.set(seg, x);
    }
    public static int DeviceNotSelectedTimeout$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_5A.DeviceNotSelectedTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceNotSelectedTimeout$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_5A.DeviceNotSelectedTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TransmissionRetryTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransmissionRetryTimeout"));
    public static VarHandle TransmissionRetryTimeout$VH() {
        return _PRINTER_INFO_5A.TransmissionRetryTimeout$VH;
    }
    public static int TransmissionRetryTimeout$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_5A.TransmissionRetryTimeout$VH.get(seg);
    }
    public static void TransmissionRetryTimeout$set( MemorySegment seg, int x) {
        _PRINTER_INFO_5A.TransmissionRetryTimeout$VH.set(seg, x);
    }
    public static int TransmissionRetryTimeout$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_5A.TransmissionRetryTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransmissionRetryTimeout$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_5A.TransmissionRetryTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


