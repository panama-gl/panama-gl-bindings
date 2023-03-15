// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MONITOR_INFO_2W {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pName"),
        Constants$root.C_POINTER$LAYOUT.withName("pEnvironment"),
        Constants$root.C_POINTER$LAYOUT.withName("pDLLName")
    ).withName("_MONITOR_INFO_2W");
    public static MemoryLayout $LAYOUT() {
        return _MONITOR_INFO_2W.$struct$LAYOUT;
    }
    static final VarHandle pName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pName"));
    public static VarHandle pName$VH() {
        return _MONITOR_INFO_2W.pName$VH;
    }
    public static MemoryAddress pName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MONITOR_INFO_2W.pName$VH.get(seg);
    }
    public static void pName$set( MemorySegment seg, MemoryAddress x) {
        _MONITOR_INFO_2W.pName$VH.set(seg, x);
    }
    public static MemoryAddress pName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MONITOR_INFO_2W.pName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pName$set(MemorySegment seg, long index, MemoryAddress x) {
        _MONITOR_INFO_2W.pName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pEnvironment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pEnvironment"));
    public static VarHandle pEnvironment$VH() {
        return _MONITOR_INFO_2W.pEnvironment$VH;
    }
    public static MemoryAddress pEnvironment$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MONITOR_INFO_2W.pEnvironment$VH.get(seg);
    }
    public static void pEnvironment$set( MemorySegment seg, MemoryAddress x) {
        _MONITOR_INFO_2W.pEnvironment$VH.set(seg, x);
    }
    public static MemoryAddress pEnvironment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MONITOR_INFO_2W.pEnvironment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pEnvironment$set(MemorySegment seg, long index, MemoryAddress x) {
        _MONITOR_INFO_2W.pEnvironment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDLLName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDLLName"));
    public static VarHandle pDLLName$VH() {
        return _MONITOR_INFO_2W.pDLLName$VH;
    }
    public static MemoryAddress pDLLName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MONITOR_INFO_2W.pDLLName$VH.get(seg);
    }
    public static void pDLLName$set( MemorySegment seg, MemoryAddress x) {
        _MONITOR_INFO_2W.pDLLName$VH.set(seg, x);
    }
    public static MemoryAddress pDLLName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MONITOR_INFO_2W.pDLLName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDLLName$set(MemorySegment seg, long index, MemoryAddress x) {
        _MONITOR_INFO_2W.pDLLName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


