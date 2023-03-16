// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SENDCMDOUTPARAMS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cBufferSize"),
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("bDriverError"),
            Constants$root.C_CHAR$LAYOUT.withName("bIDEError"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("bReserved"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_LONG$LAYOUT).withName("dwReserved")
        ).withName("DriverStatus"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("bBuffer")
    ).withName("_SENDCMDOUTPARAMS");
    public static MemoryLayout $LAYOUT() {
        return _SENDCMDOUTPARAMS.$struct$LAYOUT;
    }
    static final VarHandle cBufferSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cBufferSize"));
    public static VarHandle cBufferSize$VH() {
        return _SENDCMDOUTPARAMS.cBufferSize$VH;
    }
    public static int cBufferSize$get(MemorySegment seg) {
        return (int)_SENDCMDOUTPARAMS.cBufferSize$VH.get(seg);
    }
    public static void cBufferSize$set( MemorySegment seg, int x) {
        _SENDCMDOUTPARAMS.cBufferSize$VH.set(seg, x);
    }
    public static int cBufferSize$get(MemorySegment seg, long index) {
        return (int)_SENDCMDOUTPARAMS.cBufferSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBufferSize$set(MemorySegment seg, long index, int x) {
        _SENDCMDOUTPARAMS.cBufferSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DriverStatus$slice(MemorySegment seg) {
        return seg.asSlice(4, 12);
    }
    public static MemorySegment bBuffer$slice(MemorySegment seg) {
        return seg.asSlice(16, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


