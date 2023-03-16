// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DRIVERSTATUS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("bDriverError"),
        Constants$root.C_CHAR$LAYOUT.withName("bIDEError"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("bReserved"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_LONG$LAYOUT).withName("dwReserved")
    ).withName("_DRIVERSTATUS");
    public static MemoryLayout $LAYOUT() {
        return _DRIVERSTATUS.$struct$LAYOUT;
    }
    static final VarHandle bDriverError$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bDriverError"));
    public static VarHandle bDriverError$VH() {
        return _DRIVERSTATUS.bDriverError$VH;
    }
    public static byte bDriverError$get(MemorySegment seg) {
        return (byte)_DRIVERSTATUS.bDriverError$VH.get(seg);
    }
    public static void bDriverError$set( MemorySegment seg, byte x) {
        _DRIVERSTATUS.bDriverError$VH.set(seg, x);
    }
    public static byte bDriverError$get(MemorySegment seg, long index) {
        return (byte)_DRIVERSTATUS.bDriverError$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bDriverError$set(MemorySegment seg, long index, byte x) {
        _DRIVERSTATUS.bDriverError$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bIDEError$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bIDEError"));
    public static VarHandle bIDEError$VH() {
        return _DRIVERSTATUS.bIDEError$VH;
    }
    public static byte bIDEError$get(MemorySegment seg) {
        return (byte)_DRIVERSTATUS.bIDEError$VH.get(seg);
    }
    public static void bIDEError$set( MemorySegment seg, byte x) {
        _DRIVERSTATUS.bIDEError$VH.set(seg, x);
    }
    public static byte bIDEError$get(MemorySegment seg, long index) {
        return (byte)_DRIVERSTATUS.bIDEError$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bIDEError$set(MemorySegment seg, long index, byte x) {
        _DRIVERSTATUS.bIDEError$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment bReserved$slice(MemorySegment seg) {
        return seg.asSlice(2, 2);
    }
    public static MemorySegment dwReserved$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


