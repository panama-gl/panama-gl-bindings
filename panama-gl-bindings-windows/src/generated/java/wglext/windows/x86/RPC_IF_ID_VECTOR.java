// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RPC_IF_ID_VECTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(1, Constants$root.C_POINTER$LAYOUT).withName("IfId")
    );
    public static MemoryLayout $LAYOUT() {
        return RPC_IF_ID_VECTOR.$struct$LAYOUT;
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return RPC_IF_ID_VECTOR.Count$VH;
    }
    public static int Count$get(MemorySegment seg) {
        return (int)RPC_IF_ID_VECTOR.Count$VH.get(seg);
    }
    public static void Count$set( MemorySegment seg, int x) {
        RPC_IF_ID_VECTOR.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)RPC_IF_ID_VECTOR.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        RPC_IF_ID_VECTOR.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment IfId$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


