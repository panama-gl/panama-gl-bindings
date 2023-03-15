// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OFSTRUCT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("cBytes"),
        Constants$root.C_CHAR$LAYOUT.withName("fFixedDisk"),
        Constants$root.C_SHORT$LAYOUT.withName("nErrCode"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved1"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved2"),
        MemoryLayout.sequenceLayout(128, Constants$root.C_CHAR$LAYOUT).withName("szPathName")
    ).withName("_OFSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return _OFSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle cBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cBytes"));
    public static VarHandle cBytes$VH() {
        return _OFSTRUCT.cBytes$VH;
    }
    public static byte cBytes$get(MemorySegment seg) {
        return (byte)_OFSTRUCT.cBytes$VH.get(seg);
    }
    public static void cBytes$set( MemorySegment seg, byte x) {
        _OFSTRUCT.cBytes$VH.set(seg, x);
    }
    public static byte cBytes$get(MemorySegment seg, long index) {
        return (byte)_OFSTRUCT.cBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBytes$set(MemorySegment seg, long index, byte x) {
        _OFSTRUCT.cBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fFixedDisk$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fFixedDisk"));
    public static VarHandle fFixedDisk$VH() {
        return _OFSTRUCT.fFixedDisk$VH;
    }
    public static byte fFixedDisk$get(MemorySegment seg) {
        return (byte)_OFSTRUCT.fFixedDisk$VH.get(seg);
    }
    public static void fFixedDisk$set( MemorySegment seg, byte x) {
        _OFSTRUCT.fFixedDisk$VH.set(seg, x);
    }
    public static byte fFixedDisk$get(MemorySegment seg, long index) {
        return (byte)_OFSTRUCT.fFixedDisk$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fFixedDisk$set(MemorySegment seg, long index, byte x) {
        _OFSTRUCT.fFixedDisk$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nErrCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nErrCode"));
    public static VarHandle nErrCode$VH() {
        return _OFSTRUCT.nErrCode$VH;
    }
    public static short nErrCode$get(MemorySegment seg) {
        return (short)_OFSTRUCT.nErrCode$VH.get(seg);
    }
    public static void nErrCode$set( MemorySegment seg, short x) {
        _OFSTRUCT.nErrCode$VH.set(seg, x);
    }
    public static short nErrCode$get(MemorySegment seg, long index) {
        return (short)_OFSTRUCT.nErrCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nErrCode$set(MemorySegment seg, long index, short x) {
        _OFSTRUCT.nErrCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved1"));
    public static VarHandle Reserved1$VH() {
        return _OFSTRUCT.Reserved1$VH;
    }
    public static short Reserved1$get(MemorySegment seg) {
        return (short)_OFSTRUCT.Reserved1$VH.get(seg);
    }
    public static void Reserved1$set( MemorySegment seg, short x) {
        _OFSTRUCT.Reserved1$VH.set(seg, x);
    }
    public static short Reserved1$get(MemorySegment seg, long index) {
        return (short)_OFSTRUCT.Reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved1$set(MemorySegment seg, long index, short x) {
        _OFSTRUCT.Reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved2"));
    public static VarHandle Reserved2$VH() {
        return _OFSTRUCT.Reserved2$VH;
    }
    public static short Reserved2$get(MemorySegment seg) {
        return (short)_OFSTRUCT.Reserved2$VH.get(seg);
    }
    public static void Reserved2$set( MemorySegment seg, short x) {
        _OFSTRUCT.Reserved2$VH.set(seg, x);
    }
    public static short Reserved2$get(MemorySegment seg, long index) {
        return (short)_OFSTRUCT.Reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved2$set(MemorySegment seg, long index, short x) {
        _OFSTRUCT.Reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPathName$slice(MemorySegment seg) {
        return seg.asSlice(8, 128);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


