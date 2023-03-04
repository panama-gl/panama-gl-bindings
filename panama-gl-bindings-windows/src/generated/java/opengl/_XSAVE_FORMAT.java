// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _XSAVE_FORMAT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("ControlWord"),
        Constants$root.C_SHORT$LAYOUT.withName("StatusWord"),
        Constants$root.C_CHAR$LAYOUT.withName("TagWord"),
        Constants$root.C_CHAR$LAYOUT.withName("Reserved1"),
        Constants$root.C_SHORT$LAYOUT.withName("ErrorOpcode"),
        Constants$root.C_LONG$LAYOUT.withName("ErrorOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("ErrorSelector"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved2"),
        Constants$root.C_LONG$LAYOUT.withName("DataOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("DataSelector"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved3"),
        Constants$root.C_LONG$LAYOUT.withName("MxCsr"),
        Constants$root.C_LONG$LAYOUT.withName("MxCsr_Mask"),
        MemoryLayout.sequenceLayout(8, MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("Low"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("High")
        ).withName("_M128A")).withName("FloatRegisters"),
        MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("Low"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("High")
        ).withName("_M128A")).withName("XmmRegisters"),
        MemoryLayout.sequenceLayout(96, Constants$root.C_CHAR$LAYOUT).withName("Reserved4")
    ).withName("_XSAVE_FORMAT");
    public static MemoryLayout $LAYOUT() {
        return _XSAVE_FORMAT.$struct$LAYOUT;
    }
    static final VarHandle ControlWord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ControlWord"));
    public static VarHandle ControlWord$VH() {
        return _XSAVE_FORMAT.ControlWord$VH;
    }
    public static short ControlWord$get(MemorySegment seg) {
        return (short)_XSAVE_FORMAT.ControlWord$VH.get(seg);
    }
    public static void ControlWord$set( MemorySegment seg, short x) {
        _XSAVE_FORMAT.ControlWord$VH.set(seg, x);
    }
    public static short ControlWord$get(MemorySegment seg, long index) {
        return (short)_XSAVE_FORMAT.ControlWord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlWord$set(MemorySegment seg, long index, short x) {
        _XSAVE_FORMAT.ControlWord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StatusWord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StatusWord"));
    public static VarHandle StatusWord$VH() {
        return _XSAVE_FORMAT.StatusWord$VH;
    }
    public static short StatusWord$get(MemorySegment seg) {
        return (short)_XSAVE_FORMAT.StatusWord$VH.get(seg);
    }
    public static void StatusWord$set( MemorySegment seg, short x) {
        _XSAVE_FORMAT.StatusWord$VH.set(seg, x);
    }
    public static short StatusWord$get(MemorySegment seg, long index) {
        return (short)_XSAVE_FORMAT.StatusWord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StatusWord$set(MemorySegment seg, long index, short x) {
        _XSAVE_FORMAT.StatusWord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TagWord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TagWord"));
    public static VarHandle TagWord$VH() {
        return _XSAVE_FORMAT.TagWord$VH;
    }
    public static byte TagWord$get(MemorySegment seg) {
        return (byte)_XSAVE_FORMAT.TagWord$VH.get(seg);
    }
    public static void TagWord$set( MemorySegment seg, byte x) {
        _XSAVE_FORMAT.TagWord$VH.set(seg, x);
    }
    public static byte TagWord$get(MemorySegment seg, long index) {
        return (byte)_XSAVE_FORMAT.TagWord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TagWord$set(MemorySegment seg, long index, byte x) {
        _XSAVE_FORMAT.TagWord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved1"));
    public static VarHandle Reserved1$VH() {
        return _XSAVE_FORMAT.Reserved1$VH;
    }
    public static byte Reserved1$get(MemorySegment seg) {
        return (byte)_XSAVE_FORMAT.Reserved1$VH.get(seg);
    }
    public static void Reserved1$set( MemorySegment seg, byte x) {
        _XSAVE_FORMAT.Reserved1$VH.set(seg, x);
    }
    public static byte Reserved1$get(MemorySegment seg, long index) {
        return (byte)_XSAVE_FORMAT.Reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved1$set(MemorySegment seg, long index, byte x) {
        _XSAVE_FORMAT.Reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorOpcode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ErrorOpcode"));
    public static VarHandle ErrorOpcode$VH() {
        return _XSAVE_FORMAT.ErrorOpcode$VH;
    }
    public static short ErrorOpcode$get(MemorySegment seg) {
        return (short)_XSAVE_FORMAT.ErrorOpcode$VH.get(seg);
    }
    public static void ErrorOpcode$set( MemorySegment seg, short x) {
        _XSAVE_FORMAT.ErrorOpcode$VH.set(seg, x);
    }
    public static short ErrorOpcode$get(MemorySegment seg, long index) {
        return (short)_XSAVE_FORMAT.ErrorOpcode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorOpcode$set(MemorySegment seg, long index, short x) {
        _XSAVE_FORMAT.ErrorOpcode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ErrorOffset"));
    public static VarHandle ErrorOffset$VH() {
        return _XSAVE_FORMAT.ErrorOffset$VH;
    }
    public static int ErrorOffset$get(MemorySegment seg) {
        return (int)_XSAVE_FORMAT.ErrorOffset$VH.get(seg);
    }
    public static void ErrorOffset$set( MemorySegment seg, int x) {
        _XSAVE_FORMAT.ErrorOffset$VH.set(seg, x);
    }
    public static int ErrorOffset$get(MemorySegment seg, long index) {
        return (int)_XSAVE_FORMAT.ErrorOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorOffset$set(MemorySegment seg, long index, int x) {
        _XSAVE_FORMAT.ErrorOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorSelector$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ErrorSelector"));
    public static VarHandle ErrorSelector$VH() {
        return _XSAVE_FORMAT.ErrorSelector$VH;
    }
    public static short ErrorSelector$get(MemorySegment seg) {
        return (short)_XSAVE_FORMAT.ErrorSelector$VH.get(seg);
    }
    public static void ErrorSelector$set( MemorySegment seg, short x) {
        _XSAVE_FORMAT.ErrorSelector$VH.set(seg, x);
    }
    public static short ErrorSelector$get(MemorySegment seg, long index) {
        return (short)_XSAVE_FORMAT.ErrorSelector$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorSelector$set(MemorySegment seg, long index, short x) {
        _XSAVE_FORMAT.ErrorSelector$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved2"));
    public static VarHandle Reserved2$VH() {
        return _XSAVE_FORMAT.Reserved2$VH;
    }
    public static short Reserved2$get(MemorySegment seg) {
        return (short)_XSAVE_FORMAT.Reserved2$VH.get(seg);
    }
    public static void Reserved2$set( MemorySegment seg, short x) {
        _XSAVE_FORMAT.Reserved2$VH.set(seg, x);
    }
    public static short Reserved2$get(MemorySegment seg, long index) {
        return (short)_XSAVE_FORMAT.Reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved2$set(MemorySegment seg, long index, short x) {
        _XSAVE_FORMAT.Reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataOffset"));
    public static VarHandle DataOffset$VH() {
        return _XSAVE_FORMAT.DataOffset$VH;
    }
    public static int DataOffset$get(MemorySegment seg) {
        return (int)_XSAVE_FORMAT.DataOffset$VH.get(seg);
    }
    public static void DataOffset$set( MemorySegment seg, int x) {
        _XSAVE_FORMAT.DataOffset$VH.set(seg, x);
    }
    public static int DataOffset$get(MemorySegment seg, long index) {
        return (int)_XSAVE_FORMAT.DataOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataOffset$set(MemorySegment seg, long index, int x) {
        _XSAVE_FORMAT.DataOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataSelector$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataSelector"));
    public static VarHandle DataSelector$VH() {
        return _XSAVE_FORMAT.DataSelector$VH;
    }
    public static short DataSelector$get(MemorySegment seg) {
        return (short)_XSAVE_FORMAT.DataSelector$VH.get(seg);
    }
    public static void DataSelector$set( MemorySegment seg, short x) {
        _XSAVE_FORMAT.DataSelector$VH.set(seg, x);
    }
    public static short DataSelector$get(MemorySegment seg, long index) {
        return (short)_XSAVE_FORMAT.DataSelector$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataSelector$set(MemorySegment seg, long index, short x) {
        _XSAVE_FORMAT.DataSelector$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved3"));
    public static VarHandle Reserved3$VH() {
        return _XSAVE_FORMAT.Reserved3$VH;
    }
    public static short Reserved3$get(MemorySegment seg) {
        return (short)_XSAVE_FORMAT.Reserved3$VH.get(seg);
    }
    public static void Reserved3$set( MemorySegment seg, short x) {
        _XSAVE_FORMAT.Reserved3$VH.set(seg, x);
    }
    public static short Reserved3$get(MemorySegment seg, long index) {
        return (short)_XSAVE_FORMAT.Reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved3$set(MemorySegment seg, long index, short x) {
        _XSAVE_FORMAT.Reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MxCsr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MxCsr"));
    public static VarHandle MxCsr$VH() {
        return _XSAVE_FORMAT.MxCsr$VH;
    }
    public static int MxCsr$get(MemorySegment seg) {
        return (int)_XSAVE_FORMAT.MxCsr$VH.get(seg);
    }
    public static void MxCsr$set( MemorySegment seg, int x) {
        _XSAVE_FORMAT.MxCsr$VH.set(seg, x);
    }
    public static int MxCsr$get(MemorySegment seg, long index) {
        return (int)_XSAVE_FORMAT.MxCsr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MxCsr$set(MemorySegment seg, long index, int x) {
        _XSAVE_FORMAT.MxCsr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MxCsr_Mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MxCsr_Mask"));
    public static VarHandle MxCsr_Mask$VH() {
        return _XSAVE_FORMAT.MxCsr_Mask$VH;
    }
    public static int MxCsr_Mask$get(MemorySegment seg) {
        return (int)_XSAVE_FORMAT.MxCsr_Mask$VH.get(seg);
    }
    public static void MxCsr_Mask$set( MemorySegment seg, int x) {
        _XSAVE_FORMAT.MxCsr_Mask$VH.set(seg, x);
    }
    public static int MxCsr_Mask$get(MemorySegment seg, long index) {
        return (int)_XSAVE_FORMAT.MxCsr_Mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MxCsr_Mask$set(MemorySegment seg, long index, int x) {
        _XSAVE_FORMAT.MxCsr_Mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FloatRegisters$slice(MemorySegment seg) {
        return seg.asSlice(32, 128);
    }
    public static MemorySegment XmmRegisters$slice(MemorySegment seg) {
        return seg.asSlice(160, 256);
    }
    public static MemorySegment Reserved4$slice(MemorySegment seg) {
        return seg.asSlice(416, 96);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


