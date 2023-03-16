// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SCHANNEL_ALG {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwUse"),
        Constants$root.C_LONG$LAYOUT.withName("Algid"),
        Constants$root.C_LONG$LAYOUT.withName("cBits"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved")
    ).withName("_SCHANNEL_ALG");
    public static MemoryLayout $LAYOUT() {
        return _SCHANNEL_ALG.$struct$LAYOUT;
    }
    static final VarHandle dwUse$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwUse"));
    public static VarHandle dwUse$VH() {
        return _SCHANNEL_ALG.dwUse$VH;
    }
    public static int dwUse$get(MemorySegment seg) {
        return (int)_SCHANNEL_ALG.dwUse$VH.get(seg);
    }
    public static void dwUse$set( MemorySegment seg, int x) {
        _SCHANNEL_ALG.dwUse$VH.set(seg, x);
    }
    public static int dwUse$get(MemorySegment seg, long index) {
        return (int)_SCHANNEL_ALG.dwUse$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwUse$set(MemorySegment seg, long index, int x) {
        _SCHANNEL_ALG.dwUse$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Algid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Algid"));
    public static VarHandle Algid$VH() {
        return _SCHANNEL_ALG.Algid$VH;
    }
    public static int Algid$get(MemorySegment seg) {
        return (int)_SCHANNEL_ALG.Algid$VH.get(seg);
    }
    public static void Algid$set( MemorySegment seg, int x) {
        _SCHANNEL_ALG.Algid$VH.set(seg, x);
    }
    public static int Algid$get(MemorySegment seg, long index) {
        return (int)_SCHANNEL_ALG.Algid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Algid$set(MemorySegment seg, long index, int x) {
        _SCHANNEL_ALG.Algid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cBits"));
    public static VarHandle cBits$VH() {
        return _SCHANNEL_ALG.cBits$VH;
    }
    public static int cBits$get(MemorySegment seg) {
        return (int)_SCHANNEL_ALG.cBits$VH.get(seg);
    }
    public static void cBits$set( MemorySegment seg, int x) {
        _SCHANNEL_ALG.cBits$VH.set(seg, x);
    }
    public static int cBits$get(MemorySegment seg, long index) {
        return (int)_SCHANNEL_ALG.cBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBits$set(MemorySegment seg, long index, int x) {
        _SCHANNEL_ALG.cBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _SCHANNEL_ALG.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_SCHANNEL_ALG.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _SCHANNEL_ALG.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_SCHANNEL_ALG.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _SCHANNEL_ALG.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    public static VarHandle dwReserved$VH() {
        return _SCHANNEL_ALG.dwReserved$VH;
    }
    public static int dwReserved$get(MemorySegment seg) {
        return (int)_SCHANNEL_ALG.dwReserved$VH.get(seg);
    }
    public static void dwReserved$set( MemorySegment seg, int x) {
        _SCHANNEL_ALG.dwReserved$VH.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)_SCHANNEL_ALG.dwReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        _SCHANNEL_ALG.dwReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


