// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("IsAllowed")
    ).withName("_POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES");
    public static MemoryLayout $LAYOUT() {
        return _POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES.$struct$LAYOUT;
    }
    static final VarHandle IsAllowed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsAllowed"));
    public static VarHandle IsAllowed$VH() {
        return _POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES.IsAllowed$VH;
    }
    public static byte IsAllowed$get(MemorySegment seg) {
        return (byte)_POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES.IsAllowed$VH.get(seg);
    }
    public static void IsAllowed$set( MemorySegment seg, byte x) {
        _POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES.IsAllowed$VH.set(seg, x);
    }
    public static byte IsAllowed$get(MemorySegment seg, long index) {
        return (byte)_POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES.IsAllowed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsAllowed$set(MemorySegment seg, long index, byte x) {
        _POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES.IsAllowed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


