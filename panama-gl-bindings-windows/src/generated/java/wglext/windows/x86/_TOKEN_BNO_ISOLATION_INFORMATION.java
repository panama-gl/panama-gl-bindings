// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TOKEN_BNO_ISOLATION_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("IsolationPrefix"),
        Constants$root.C_CHAR$LAYOUT.withName("IsolationEnabled"),
        MemoryLayout.paddingLayout(56)
    ).withName("_TOKEN_BNO_ISOLATION_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_BNO_ISOLATION_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle IsolationPrefix$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsolationPrefix"));
    public static VarHandle IsolationPrefix$VH() {
        return _TOKEN_BNO_ISOLATION_INFORMATION.IsolationPrefix$VH;
    }
    public static MemoryAddress IsolationPrefix$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_TOKEN_BNO_ISOLATION_INFORMATION.IsolationPrefix$VH.get(seg);
    }
    public static void IsolationPrefix$set( MemorySegment seg, MemoryAddress x) {
        _TOKEN_BNO_ISOLATION_INFORMATION.IsolationPrefix$VH.set(seg, x);
    }
    public static MemoryAddress IsolationPrefix$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_TOKEN_BNO_ISOLATION_INFORMATION.IsolationPrefix$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsolationPrefix$set(MemorySegment seg, long index, MemoryAddress x) {
        _TOKEN_BNO_ISOLATION_INFORMATION.IsolationPrefix$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IsolationEnabled$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsolationEnabled"));
    public static VarHandle IsolationEnabled$VH() {
        return _TOKEN_BNO_ISOLATION_INFORMATION.IsolationEnabled$VH;
    }
    public static byte IsolationEnabled$get(MemorySegment seg) {
        return (byte)_TOKEN_BNO_ISOLATION_INFORMATION.IsolationEnabled$VH.get(seg);
    }
    public static void IsolationEnabled$set( MemorySegment seg, byte x) {
        _TOKEN_BNO_ISOLATION_INFORMATION.IsolationEnabled$VH.set(seg, x);
    }
    public static byte IsolationEnabled$get(MemorySegment seg, long index) {
        return (byte)_TOKEN_BNO_ISOLATION_INFORMATION.IsolationEnabled$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsolationEnabled$set(MemorySegment seg, long index, byte x) {
        _TOKEN_BNO_ISOLATION_INFORMATION.IsolationEnabled$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


