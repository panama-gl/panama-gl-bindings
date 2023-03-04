// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SERVICE_TABLE_ENTRYW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpServiceName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpServiceProc")
    ).withName("_SERVICE_TABLE_ENTRYW");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_TABLE_ENTRYW.$struct$LAYOUT;
    }
    static final VarHandle lpServiceName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpServiceName"));
    public static VarHandle lpServiceName$VH() {
        return _SERVICE_TABLE_ENTRYW.lpServiceName$VH;
    }
    public static MemoryAddress lpServiceName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_TABLE_ENTRYW.lpServiceName$VH.get(seg);
    }
    public static void lpServiceName$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_TABLE_ENTRYW.lpServiceName$VH.set(seg, x);
    }
    public static MemoryAddress lpServiceName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_TABLE_ENTRYW.lpServiceName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpServiceName$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_TABLE_ENTRYW.lpServiceName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpServiceProc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpServiceProc"));
    public static VarHandle lpServiceProc$VH() {
        return _SERVICE_TABLE_ENTRYW.lpServiceProc$VH;
    }
    public static MemoryAddress lpServiceProc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_TABLE_ENTRYW.lpServiceProc$VH.get(seg);
    }
    public static void lpServiceProc$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_TABLE_ENTRYW.lpServiceProc$VH.set(seg, x);
    }
    public static MemoryAddress lpServiceProc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_TABLE_ENTRYW.lpServiceProc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpServiceProc$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_TABLE_ENTRYW.lpServiceProc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPSERVICE_MAIN_FUNCTIONW lpServiceProc (MemorySegment segment, MemorySession session) {
        return LPSERVICE_MAIN_FUNCTIONW.ofAddress(lpServiceProc$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


