// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ENCLAVE_INIT_INFO_SGX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(1808, Constants$root.C_CHAR$LAYOUT).withName("SigStruct"),
        MemoryLayout.sequenceLayout(240, Constants$root.C_CHAR$LAYOUT).withName("Reserved1"),
        MemoryLayout.sequenceLayout(304, Constants$root.C_CHAR$LAYOUT).withName("EInitToken"),
        MemoryLayout.sequenceLayout(1744, Constants$root.C_CHAR$LAYOUT).withName("Reserved2")
    ).withName("_ENCLAVE_INIT_INFO_SGX");
    public static MemoryLayout $LAYOUT() {
        return _ENCLAVE_INIT_INFO_SGX.$struct$LAYOUT;
    }
    public static MemorySegment SigStruct$slice(MemorySegment seg) {
        return seg.asSlice(0, 1808);
    }
    public static MemorySegment Reserved1$slice(MemorySegment seg) {
        return seg.asSlice(1808, 240);
    }
    public static MemorySegment EInitToken$slice(MemorySegment seg) {
        return seg.asSlice(2048, 304);
    }
    public static MemorySegment Reserved2$slice(MemorySegment seg) {
        return seg.asSlice(2352, 1744);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


