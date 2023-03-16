// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DEVICE_DSM_REPORT_ZONES_PARAMETERS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_CHAR$LAYOUT.withName("ReportOption"),
        Constants$root.C_CHAR$LAYOUT.withName("Partial"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("Reserved")
    ).withName("_DEVICE_DSM_REPORT_ZONES_PARAMETERS");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_DSM_REPORT_ZONES_PARAMETERS.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _DEVICE_DSM_REPORT_ZONES_PARAMETERS.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_REPORT_ZONES_PARAMETERS.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _DEVICE_DSM_REPORT_ZONES_PARAMETERS.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_REPORT_ZONES_PARAMETERS.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_REPORT_ZONES_PARAMETERS.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReportOption$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReportOption"));
    public static VarHandle ReportOption$VH() {
        return _DEVICE_DSM_REPORT_ZONES_PARAMETERS.ReportOption$VH;
    }
    public static byte ReportOption$get(MemorySegment seg) {
        return (byte)_DEVICE_DSM_REPORT_ZONES_PARAMETERS.ReportOption$VH.get(seg);
    }
    public static void ReportOption$set( MemorySegment seg, byte x) {
        _DEVICE_DSM_REPORT_ZONES_PARAMETERS.ReportOption$VH.set(seg, x);
    }
    public static byte ReportOption$get(MemorySegment seg, long index) {
        return (byte)_DEVICE_DSM_REPORT_ZONES_PARAMETERS.ReportOption$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReportOption$set(MemorySegment seg, long index, byte x) {
        _DEVICE_DSM_REPORT_ZONES_PARAMETERS.ReportOption$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Partial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Partial"));
    public static VarHandle Partial$VH() {
        return _DEVICE_DSM_REPORT_ZONES_PARAMETERS.Partial$VH;
    }
    public static byte Partial$get(MemorySegment seg) {
        return (byte)_DEVICE_DSM_REPORT_ZONES_PARAMETERS.Partial$VH.get(seg);
    }
    public static void Partial$set( MemorySegment seg, byte x) {
        _DEVICE_DSM_REPORT_ZONES_PARAMETERS.Partial$VH.set(seg, x);
    }
    public static byte Partial$get(MemorySegment seg, long index) {
        return (byte)_DEVICE_DSM_REPORT_ZONES_PARAMETERS.Partial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Partial$set(MemorySegment seg, long index, byte x) {
        _DEVICE_DSM_REPORT_ZONES_PARAMETERS.Partial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(6, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


