// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TOKEN_AUDIT_POLICY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(30, Constants$root.C_CHAR$LAYOUT).withName("PerUserPolicy")
    ).withName("_TOKEN_AUDIT_POLICY");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_AUDIT_POLICY.$struct$LAYOUT;
    }
    public static MemorySegment PerUserPolicy$slice(MemorySegment seg) {
        return seg.asSlice(0, 30);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


