// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TOKEN_MANDATORY_POLICY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Policy")
    ).withName("_TOKEN_MANDATORY_POLICY");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_MANDATORY_POLICY.$struct$LAYOUT;
    }
    static final VarHandle Policy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Policy"));
    public static VarHandle Policy$VH() {
        return _TOKEN_MANDATORY_POLICY.Policy$VH;
    }
    public static int Policy$get(MemorySegment seg) {
        return (int)_TOKEN_MANDATORY_POLICY.Policy$VH.get(seg);
    }
    public static void Policy$set( MemorySegment seg, int x) {
        _TOKEN_MANDATORY_POLICY.Policy$VH.set(seg, x);
    }
    public static int Policy$get(MemorySegment seg, long index) {
        return (int)_TOKEN_MANDATORY_POLICY.Policy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Policy$set(MemorySegment seg, long index, int x) {
        _TOKEN_MANDATORY_POLICY.Policy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


