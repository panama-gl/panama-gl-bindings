// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PHYSICAL_ELEMENT_STATUS_REQUEST {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("StartingElement"),
        Constants$root.C_CHAR$LAYOUT.withName("Filter"),
        Constants$root.C_CHAR$LAYOUT.withName("ReportType"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("Reserved")
    ).withName("_PHYSICAL_ELEMENT_STATUS_REQUEST");
    public static MemoryLayout $LAYOUT() {
        return _PHYSICAL_ELEMENT_STATUS_REQUEST.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _PHYSICAL_ELEMENT_STATUS_REQUEST.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_PHYSICAL_ELEMENT_STATUS_REQUEST.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _PHYSICAL_ELEMENT_STATUS_REQUEST.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_PHYSICAL_ELEMENT_STATUS_REQUEST.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _PHYSICAL_ELEMENT_STATUS_REQUEST.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _PHYSICAL_ELEMENT_STATUS_REQUEST.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_PHYSICAL_ELEMENT_STATUS_REQUEST.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _PHYSICAL_ELEMENT_STATUS_REQUEST.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_PHYSICAL_ELEMENT_STATUS_REQUEST.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _PHYSICAL_ELEMENT_STATUS_REQUEST.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StartingElement$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartingElement"));
    public static VarHandle StartingElement$VH() {
        return _PHYSICAL_ELEMENT_STATUS_REQUEST.StartingElement$VH;
    }
    public static int StartingElement$get(MemorySegment seg) {
        return (int)_PHYSICAL_ELEMENT_STATUS_REQUEST.StartingElement$VH.get(seg);
    }
    public static void StartingElement$set( MemorySegment seg, int x) {
        _PHYSICAL_ELEMENT_STATUS_REQUEST.StartingElement$VH.set(seg, x);
    }
    public static int StartingElement$get(MemorySegment seg, long index) {
        return (int)_PHYSICAL_ELEMENT_STATUS_REQUEST.StartingElement$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartingElement$set(MemorySegment seg, long index, int x) {
        _PHYSICAL_ELEMENT_STATUS_REQUEST.StartingElement$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Filter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Filter"));
    public static VarHandle Filter$VH() {
        return _PHYSICAL_ELEMENT_STATUS_REQUEST.Filter$VH;
    }
    public static byte Filter$get(MemorySegment seg) {
        return (byte)_PHYSICAL_ELEMENT_STATUS_REQUEST.Filter$VH.get(seg);
    }
    public static void Filter$set( MemorySegment seg, byte x) {
        _PHYSICAL_ELEMENT_STATUS_REQUEST.Filter$VH.set(seg, x);
    }
    public static byte Filter$get(MemorySegment seg, long index) {
        return (byte)_PHYSICAL_ELEMENT_STATUS_REQUEST.Filter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Filter$set(MemorySegment seg, long index, byte x) {
        _PHYSICAL_ELEMENT_STATUS_REQUEST.Filter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReportType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReportType"));
    public static VarHandle ReportType$VH() {
        return _PHYSICAL_ELEMENT_STATUS_REQUEST.ReportType$VH;
    }
    public static byte ReportType$get(MemorySegment seg) {
        return (byte)_PHYSICAL_ELEMENT_STATUS_REQUEST.ReportType$VH.get(seg);
    }
    public static void ReportType$set( MemorySegment seg, byte x) {
        _PHYSICAL_ELEMENT_STATUS_REQUEST.ReportType$VH.set(seg, x);
    }
    public static byte ReportType$get(MemorySegment seg, long index) {
        return (byte)_PHYSICAL_ELEMENT_STATUS_REQUEST.ReportType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReportType$set(MemorySegment seg, long index, byte x) {
        _PHYSICAL_ELEMENT_STATUS_REQUEST.ReportType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(14, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


