// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PRINTER_INFO_2A {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pServerName"),
        Constants$root.C_POINTER$LAYOUT.withName("pPrinterName"),
        Constants$root.C_POINTER$LAYOUT.withName("pShareName"),
        Constants$root.C_POINTER$LAYOUT.withName("pPortName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDriverName"),
        Constants$root.C_POINTER$LAYOUT.withName("pComment"),
        Constants$root.C_POINTER$LAYOUT.withName("pLocation"),
        Constants$root.C_POINTER$LAYOUT.withName("pDevMode"),
        Constants$root.C_POINTER$LAYOUT.withName("pSepFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pPrintProcessor"),
        Constants$root.C_POINTER$LAYOUT.withName("pDatatype"),
        Constants$root.C_POINTER$LAYOUT.withName("pParameters"),
        Constants$root.C_POINTER$LAYOUT.withName("pSecurityDescriptor"),
        Constants$root.C_LONG$LAYOUT.withName("Attributes"),
        Constants$root.C_LONG$LAYOUT.withName("Priority"),
        Constants$root.C_LONG$LAYOUT.withName("DefaultPriority"),
        Constants$root.C_LONG$LAYOUT.withName("StartTime"),
        Constants$root.C_LONG$LAYOUT.withName("UntilTime"),
        Constants$root.C_LONG$LAYOUT.withName("Status"),
        Constants$root.C_LONG$LAYOUT.withName("cJobs"),
        Constants$root.C_LONG$LAYOUT.withName("AveragePPM")
    ).withName("_PRINTER_INFO_2A");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_INFO_2A.$struct$LAYOUT;
    }
    static final VarHandle pServerName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pServerName"));
    public static VarHandle pServerName$VH() {
        return _PRINTER_INFO_2A.pServerName$VH;
    }
    public static MemoryAddress pServerName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pServerName$VH.get(seg);
    }
    public static void pServerName$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pServerName$VH.set(seg, x);
    }
    public static MemoryAddress pServerName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pServerName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pServerName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pServerName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPrinterName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrinterName"));
    public static VarHandle pPrinterName$VH() {
        return _PRINTER_INFO_2A.pPrinterName$VH;
    }
    public static MemoryAddress pPrinterName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pPrinterName$VH.get(seg);
    }
    public static void pPrinterName$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pPrinterName$VH.set(seg, x);
    }
    public static MemoryAddress pPrinterName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pPrinterName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrinterName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pPrinterName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pShareName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pShareName"));
    public static VarHandle pShareName$VH() {
        return _PRINTER_INFO_2A.pShareName$VH;
    }
    public static MemoryAddress pShareName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pShareName$VH.get(seg);
    }
    public static void pShareName$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pShareName$VH.set(seg, x);
    }
    public static MemoryAddress pShareName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pShareName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pShareName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pShareName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPortName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPortName"));
    public static VarHandle pPortName$VH() {
        return _PRINTER_INFO_2A.pPortName$VH;
    }
    public static MemoryAddress pPortName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pPortName$VH.get(seg);
    }
    public static void pPortName$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pPortName$VH.set(seg, x);
    }
    public static MemoryAddress pPortName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pPortName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPortName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pPortName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDriverName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDriverName"));
    public static VarHandle pDriverName$VH() {
        return _PRINTER_INFO_2A.pDriverName$VH;
    }
    public static MemoryAddress pDriverName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pDriverName$VH.get(seg);
    }
    public static void pDriverName$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pDriverName$VH.set(seg, x);
    }
    public static MemoryAddress pDriverName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pDriverName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDriverName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pDriverName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pComment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pComment"));
    public static VarHandle pComment$VH() {
        return _PRINTER_INFO_2A.pComment$VH;
    }
    public static MemoryAddress pComment$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pComment$VH.get(seg);
    }
    public static void pComment$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pComment$VH.set(seg, x);
    }
    public static MemoryAddress pComment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pComment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pComment$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pComment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pLocation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pLocation"));
    public static VarHandle pLocation$VH() {
        return _PRINTER_INFO_2A.pLocation$VH;
    }
    public static MemoryAddress pLocation$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pLocation$VH.get(seg);
    }
    public static void pLocation$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pLocation$VH.set(seg, x);
    }
    public static MemoryAddress pLocation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pLocation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pLocation$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pLocation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDevMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDevMode"));
    public static VarHandle pDevMode$VH() {
        return _PRINTER_INFO_2A.pDevMode$VH;
    }
    public static MemoryAddress pDevMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pDevMode$VH.get(seg);
    }
    public static void pDevMode$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pDevMode$VH.set(seg, x);
    }
    public static MemoryAddress pDevMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pDevMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDevMode$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pDevMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSepFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSepFile"));
    public static VarHandle pSepFile$VH() {
        return _PRINTER_INFO_2A.pSepFile$VH;
    }
    public static MemoryAddress pSepFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pSepFile$VH.get(seg);
    }
    public static void pSepFile$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pSepFile$VH.set(seg, x);
    }
    public static MemoryAddress pSepFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pSepFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSepFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pSepFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPrintProcessor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrintProcessor"));
    public static VarHandle pPrintProcessor$VH() {
        return _PRINTER_INFO_2A.pPrintProcessor$VH;
    }
    public static MemoryAddress pPrintProcessor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pPrintProcessor$VH.get(seg);
    }
    public static void pPrintProcessor$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pPrintProcessor$VH.set(seg, x);
    }
    public static MemoryAddress pPrintProcessor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pPrintProcessor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrintProcessor$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pPrintProcessor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDatatype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDatatype"));
    public static VarHandle pDatatype$VH() {
        return _PRINTER_INFO_2A.pDatatype$VH;
    }
    public static MemoryAddress pDatatype$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pDatatype$VH.get(seg);
    }
    public static void pDatatype$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pDatatype$VH.set(seg, x);
    }
    public static MemoryAddress pDatatype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pDatatype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDatatype$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pDatatype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pParameters$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pParameters"));
    public static VarHandle pParameters$VH() {
        return _PRINTER_INFO_2A.pParameters$VH;
    }
    public static MemoryAddress pParameters$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pParameters$VH.get(seg);
    }
    public static void pParameters$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pParameters$VH.set(seg, x);
    }
    public static MemoryAddress pParameters$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pParameters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pParameters$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pParameters$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSecurityDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSecurityDescriptor"));
    public static VarHandle pSecurityDescriptor$VH() {
        return _PRINTER_INFO_2A.pSecurityDescriptor$VH;
    }
    public static MemoryAddress pSecurityDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pSecurityDescriptor$VH.get(seg);
    }
    public static void pSecurityDescriptor$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_2A.pSecurityDescriptor$VH.set(seg, x);
    }
    public static MemoryAddress pSecurityDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PRINTER_INFO_2A.pSecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSecurityDescriptor$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_2A.pSecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Attributes"));
    public static VarHandle Attributes$VH() {
        return _PRINTER_INFO_2A.Attributes$VH;
    }
    public static int Attributes$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2A.Attributes$VH.get(seg);
    }
    public static void Attributes$set( MemorySegment seg, int x) {
        _PRINTER_INFO_2A.Attributes$VH.set(seg, x);
    }
    public static int Attributes$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2A.Attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Attributes$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2A.Attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Priority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Priority"));
    public static VarHandle Priority$VH() {
        return _PRINTER_INFO_2A.Priority$VH;
    }
    public static int Priority$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2A.Priority$VH.get(seg);
    }
    public static void Priority$set( MemorySegment seg, int x) {
        _PRINTER_INFO_2A.Priority$VH.set(seg, x);
    }
    public static int Priority$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2A.Priority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Priority$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2A.Priority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DefaultPriority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DefaultPriority"));
    public static VarHandle DefaultPriority$VH() {
        return _PRINTER_INFO_2A.DefaultPriority$VH;
    }
    public static int DefaultPriority$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2A.DefaultPriority$VH.get(seg);
    }
    public static void DefaultPriority$set( MemorySegment seg, int x) {
        _PRINTER_INFO_2A.DefaultPriority$VH.set(seg, x);
    }
    public static int DefaultPriority$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2A.DefaultPriority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultPriority$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2A.DefaultPriority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StartTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartTime"));
    public static VarHandle StartTime$VH() {
        return _PRINTER_INFO_2A.StartTime$VH;
    }
    public static int StartTime$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2A.StartTime$VH.get(seg);
    }
    public static void StartTime$set( MemorySegment seg, int x) {
        _PRINTER_INFO_2A.StartTime$VH.set(seg, x);
    }
    public static int StartTime$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2A.StartTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartTime$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2A.StartTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UntilTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UntilTime"));
    public static VarHandle UntilTime$VH() {
        return _PRINTER_INFO_2A.UntilTime$VH;
    }
    public static int UntilTime$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2A.UntilTime$VH.get(seg);
    }
    public static void UntilTime$set( MemorySegment seg, int x) {
        _PRINTER_INFO_2A.UntilTime$VH.set(seg, x);
    }
    public static int UntilTime$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2A.UntilTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UntilTime$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2A.UntilTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Status"));
    public static VarHandle Status$VH() {
        return _PRINTER_INFO_2A.Status$VH;
    }
    public static int Status$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2A.Status$VH.get(seg);
    }
    public static void Status$set( MemorySegment seg, int x) {
        _PRINTER_INFO_2A.Status$VH.set(seg, x);
    }
    public static int Status$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2A.Status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Status$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2A.Status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cJobs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cJobs"));
    public static VarHandle cJobs$VH() {
        return _PRINTER_INFO_2A.cJobs$VH;
    }
    public static int cJobs$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2A.cJobs$VH.get(seg);
    }
    public static void cJobs$set( MemorySegment seg, int x) {
        _PRINTER_INFO_2A.cJobs$VH.set(seg, x);
    }
    public static int cJobs$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2A.cJobs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cJobs$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2A.cJobs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AveragePPM$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AveragePPM"));
    public static VarHandle AveragePPM$VH() {
        return _PRINTER_INFO_2A.AveragePPM$VH;
    }
    public static int AveragePPM$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2A.AveragePPM$VH.get(seg);
    }
    public static void AveragePPM$set( MemorySegment seg, int x) {
        _PRINTER_INFO_2A.AveragePPM$VH.set(seg, x);
    }
    public static int AveragePPM$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2A.AveragePPM$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AveragePPM$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2A.AveragePPM$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


