// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CLIENT_CALL_RETURN {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Pointer"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Simple")
    ).withName("_CLIENT_CALL_RETURN");
    public static MemoryLayout $LAYOUT() {
        return _CLIENT_CALL_RETURN.$union$LAYOUT;
    }
    static final VarHandle Pointer$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Pointer"));
    public static VarHandle Pointer$VH() {
        return _CLIENT_CALL_RETURN.Pointer$VH;
    }
    public static MemoryAddress Pointer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CLIENT_CALL_RETURN.Pointer$VH.get(seg);
    }
    public static void Pointer$set( MemorySegment seg, MemoryAddress x) {
        _CLIENT_CALL_RETURN.Pointer$VH.set(seg, x);
    }
    public static MemoryAddress Pointer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CLIENT_CALL_RETURN.Pointer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Pointer$set(MemorySegment seg, long index, MemoryAddress x) {
        _CLIENT_CALL_RETURN.Pointer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Simple$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Simple"));
    public static VarHandle Simple$VH() {
        return _CLIENT_CALL_RETURN.Simple$VH;
    }
    public static long Simple$get(MemorySegment seg) {
        return (long)_CLIENT_CALL_RETURN.Simple$VH.get(seg);
    }
    public static void Simple$set( MemorySegment seg, long x) {
        _CLIENT_CALL_RETURN.Simple$VH.set(seg, x);
    }
    public static long Simple$get(MemorySegment seg, long index) {
        return (long)_CLIENT_CALL_RETURN.Simple$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Simple$set(MemorySegment seg, long index, long x) {
        _CLIENT_CALL_RETURN.Simple$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


