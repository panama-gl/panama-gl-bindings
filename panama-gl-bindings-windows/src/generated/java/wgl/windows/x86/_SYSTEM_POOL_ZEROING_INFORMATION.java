// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SYSTEM_POOL_ZEROING_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("PoolZeroingSupportPresent")
    ).withName("_SYSTEM_POOL_ZEROING_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _SYSTEM_POOL_ZEROING_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle PoolZeroingSupportPresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PoolZeroingSupportPresent"));
    public static VarHandle PoolZeroingSupportPresent$VH() {
        return _SYSTEM_POOL_ZEROING_INFORMATION.PoolZeroingSupportPresent$VH;
    }
    public static byte PoolZeroingSupportPresent$get(MemorySegment seg) {
        return (byte)_SYSTEM_POOL_ZEROING_INFORMATION.PoolZeroingSupportPresent$VH.get(seg);
    }
    public static void PoolZeroingSupportPresent$set( MemorySegment seg, byte x) {
        _SYSTEM_POOL_ZEROING_INFORMATION.PoolZeroingSupportPresent$VH.set(seg, x);
    }
    public static byte PoolZeroingSupportPresent$get(MemorySegment seg, long index) {
        return (byte)_SYSTEM_POOL_ZEROING_INFORMATION.PoolZeroingSupportPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PoolZeroingSupportPresent$set(MemorySegment seg, long index, byte x) {
        _SYSTEM_POOL_ZEROING_INFORMATION.PoolZeroingSupportPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

