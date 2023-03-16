// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _WOW64_FLOATING_SAVE_AREA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ControlWord"),
        Constants$root.C_LONG$LAYOUT.withName("StatusWord"),
        Constants$root.C_LONG$LAYOUT.withName("TagWord"),
        Constants$root.C_LONG$LAYOUT.withName("ErrorOffset"),
        Constants$root.C_LONG$LAYOUT.withName("ErrorSelector"),
        Constants$root.C_LONG$LAYOUT.withName("DataOffset"),
        Constants$root.C_LONG$LAYOUT.withName("DataSelector"),
        MemoryLayout.sequenceLayout(80, Constants$root.C_CHAR$LAYOUT).withName("RegisterArea"),
        Constants$root.C_LONG$LAYOUT.withName("Cr0NpxState")
    ).withName("_WOW64_FLOATING_SAVE_AREA");
    public static MemoryLayout $LAYOUT() {
        return _WOW64_FLOATING_SAVE_AREA.$struct$LAYOUT;
    }
    static final VarHandle ControlWord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ControlWord"));
    public static VarHandle ControlWord$VH() {
        return _WOW64_FLOATING_SAVE_AREA.ControlWord$VH;
    }
    public static int ControlWord$get(MemorySegment seg) {
        return (int)_WOW64_FLOATING_SAVE_AREA.ControlWord$VH.get(seg);
    }
    public static void ControlWord$set( MemorySegment seg, int x) {
        _WOW64_FLOATING_SAVE_AREA.ControlWord$VH.set(seg, x);
    }
    public static int ControlWord$get(MemorySegment seg, long index) {
        return (int)_WOW64_FLOATING_SAVE_AREA.ControlWord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlWord$set(MemorySegment seg, long index, int x) {
        _WOW64_FLOATING_SAVE_AREA.ControlWord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StatusWord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StatusWord"));
    public static VarHandle StatusWord$VH() {
        return _WOW64_FLOATING_SAVE_AREA.StatusWord$VH;
    }
    public static int StatusWord$get(MemorySegment seg) {
        return (int)_WOW64_FLOATING_SAVE_AREA.StatusWord$VH.get(seg);
    }
    public static void StatusWord$set( MemorySegment seg, int x) {
        _WOW64_FLOATING_SAVE_AREA.StatusWord$VH.set(seg, x);
    }
    public static int StatusWord$get(MemorySegment seg, long index) {
        return (int)_WOW64_FLOATING_SAVE_AREA.StatusWord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StatusWord$set(MemorySegment seg, long index, int x) {
        _WOW64_FLOATING_SAVE_AREA.StatusWord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TagWord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TagWord"));
    public static VarHandle TagWord$VH() {
        return _WOW64_FLOATING_SAVE_AREA.TagWord$VH;
    }
    public static int TagWord$get(MemorySegment seg) {
        return (int)_WOW64_FLOATING_SAVE_AREA.TagWord$VH.get(seg);
    }
    public static void TagWord$set( MemorySegment seg, int x) {
        _WOW64_FLOATING_SAVE_AREA.TagWord$VH.set(seg, x);
    }
    public static int TagWord$get(MemorySegment seg, long index) {
        return (int)_WOW64_FLOATING_SAVE_AREA.TagWord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TagWord$set(MemorySegment seg, long index, int x) {
        _WOW64_FLOATING_SAVE_AREA.TagWord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ErrorOffset"));
    public static VarHandle ErrorOffset$VH() {
        return _WOW64_FLOATING_SAVE_AREA.ErrorOffset$VH;
    }
    public static int ErrorOffset$get(MemorySegment seg) {
        return (int)_WOW64_FLOATING_SAVE_AREA.ErrorOffset$VH.get(seg);
    }
    public static void ErrorOffset$set( MemorySegment seg, int x) {
        _WOW64_FLOATING_SAVE_AREA.ErrorOffset$VH.set(seg, x);
    }
    public static int ErrorOffset$get(MemorySegment seg, long index) {
        return (int)_WOW64_FLOATING_SAVE_AREA.ErrorOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorOffset$set(MemorySegment seg, long index, int x) {
        _WOW64_FLOATING_SAVE_AREA.ErrorOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorSelector$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ErrorSelector"));
    public static VarHandle ErrorSelector$VH() {
        return _WOW64_FLOATING_SAVE_AREA.ErrorSelector$VH;
    }
    public static int ErrorSelector$get(MemorySegment seg) {
        return (int)_WOW64_FLOATING_SAVE_AREA.ErrorSelector$VH.get(seg);
    }
    public static void ErrorSelector$set( MemorySegment seg, int x) {
        _WOW64_FLOATING_SAVE_AREA.ErrorSelector$VH.set(seg, x);
    }
    public static int ErrorSelector$get(MemorySegment seg, long index) {
        return (int)_WOW64_FLOATING_SAVE_AREA.ErrorSelector$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorSelector$set(MemorySegment seg, long index, int x) {
        _WOW64_FLOATING_SAVE_AREA.ErrorSelector$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataOffset"));
    public static VarHandle DataOffset$VH() {
        return _WOW64_FLOATING_SAVE_AREA.DataOffset$VH;
    }
    public static int DataOffset$get(MemorySegment seg) {
        return (int)_WOW64_FLOATING_SAVE_AREA.DataOffset$VH.get(seg);
    }
    public static void DataOffset$set( MemorySegment seg, int x) {
        _WOW64_FLOATING_SAVE_AREA.DataOffset$VH.set(seg, x);
    }
    public static int DataOffset$get(MemorySegment seg, long index) {
        return (int)_WOW64_FLOATING_SAVE_AREA.DataOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataOffset$set(MemorySegment seg, long index, int x) {
        _WOW64_FLOATING_SAVE_AREA.DataOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataSelector$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataSelector"));
    public static VarHandle DataSelector$VH() {
        return _WOW64_FLOATING_SAVE_AREA.DataSelector$VH;
    }
    public static int DataSelector$get(MemorySegment seg) {
        return (int)_WOW64_FLOATING_SAVE_AREA.DataSelector$VH.get(seg);
    }
    public static void DataSelector$set( MemorySegment seg, int x) {
        _WOW64_FLOATING_SAVE_AREA.DataSelector$VH.set(seg, x);
    }
    public static int DataSelector$get(MemorySegment seg, long index) {
        return (int)_WOW64_FLOATING_SAVE_AREA.DataSelector$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataSelector$set(MemorySegment seg, long index, int x) {
        _WOW64_FLOATING_SAVE_AREA.DataSelector$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RegisterArea$slice(MemorySegment seg) {
        return seg.asSlice(28, 80);
    }
    static final VarHandle Cr0NpxState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Cr0NpxState"));
    public static VarHandle Cr0NpxState$VH() {
        return _WOW64_FLOATING_SAVE_AREA.Cr0NpxState$VH;
    }
    public static int Cr0NpxState$get(MemorySegment seg) {
        return (int)_WOW64_FLOATING_SAVE_AREA.Cr0NpxState$VH.get(seg);
    }
    public static void Cr0NpxState$set( MemorySegment seg, int x) {
        _WOW64_FLOATING_SAVE_AREA.Cr0NpxState$VH.set(seg, x);
    }
    public static int Cr0NpxState$get(MemorySegment seg, long index) {
        return (int)_WOW64_FLOATING_SAVE_AREA.Cr0NpxState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Cr0NpxState$set(MemorySegment seg, long index, int x) {
        _WOW64_FLOATING_SAVE_AREA.Cr0NpxState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

