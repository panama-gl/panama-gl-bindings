// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SERVICE_FAILURE_ACTIONSW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwResetPeriod"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpRebootMsg"),
        Constants$root.C_POINTER$LAYOUT.withName("lpCommand"),
        Constants$root.C_LONG$LAYOUT.withName("cActions"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpsaActions")
    ).withName("_SERVICE_FAILURE_ACTIONSW");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_FAILURE_ACTIONSW.$struct$LAYOUT;
    }
    static final VarHandle dwResetPeriod$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwResetPeriod"));
    public static VarHandle dwResetPeriod$VH() {
        return _SERVICE_FAILURE_ACTIONSW.dwResetPeriod$VH;
    }
    public static int dwResetPeriod$get(MemorySegment seg) {
        return (int)_SERVICE_FAILURE_ACTIONSW.dwResetPeriod$VH.get(seg);
    }
    public static void dwResetPeriod$set( MemorySegment seg, int x) {
        _SERVICE_FAILURE_ACTIONSW.dwResetPeriod$VH.set(seg, x);
    }
    public static int dwResetPeriod$get(MemorySegment seg, long index) {
        return (int)_SERVICE_FAILURE_ACTIONSW.dwResetPeriod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwResetPeriod$set(MemorySegment seg, long index, int x) {
        _SERVICE_FAILURE_ACTIONSW.dwResetPeriod$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpRebootMsg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpRebootMsg"));
    public static VarHandle lpRebootMsg$VH() {
        return _SERVICE_FAILURE_ACTIONSW.lpRebootMsg$VH;
    }
    public static MemoryAddress lpRebootMsg$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_FAILURE_ACTIONSW.lpRebootMsg$VH.get(seg);
    }
    public static void lpRebootMsg$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_FAILURE_ACTIONSW.lpRebootMsg$VH.set(seg, x);
    }
    public static MemoryAddress lpRebootMsg$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_FAILURE_ACTIONSW.lpRebootMsg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpRebootMsg$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_FAILURE_ACTIONSW.lpRebootMsg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpCommand$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpCommand"));
    public static VarHandle lpCommand$VH() {
        return _SERVICE_FAILURE_ACTIONSW.lpCommand$VH;
    }
    public static MemoryAddress lpCommand$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_FAILURE_ACTIONSW.lpCommand$VH.get(seg);
    }
    public static void lpCommand$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_FAILURE_ACTIONSW.lpCommand$VH.set(seg, x);
    }
    public static MemoryAddress lpCommand$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_FAILURE_ACTIONSW.lpCommand$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpCommand$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_FAILURE_ACTIONSW.lpCommand$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cActions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cActions"));
    public static VarHandle cActions$VH() {
        return _SERVICE_FAILURE_ACTIONSW.cActions$VH;
    }
    public static int cActions$get(MemorySegment seg) {
        return (int)_SERVICE_FAILURE_ACTIONSW.cActions$VH.get(seg);
    }
    public static void cActions$set( MemorySegment seg, int x) {
        _SERVICE_FAILURE_ACTIONSW.cActions$VH.set(seg, x);
    }
    public static int cActions$get(MemorySegment seg, long index) {
        return (int)_SERVICE_FAILURE_ACTIONSW.cActions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cActions$set(MemorySegment seg, long index, int x) {
        _SERVICE_FAILURE_ACTIONSW.cActions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpsaActions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpsaActions"));
    public static VarHandle lpsaActions$VH() {
        return _SERVICE_FAILURE_ACTIONSW.lpsaActions$VH;
    }
    public static MemoryAddress lpsaActions$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_FAILURE_ACTIONSW.lpsaActions$VH.get(seg);
    }
    public static void lpsaActions$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_FAILURE_ACTIONSW.lpsaActions$VH.set(seg, x);
    }
    public static MemoryAddress lpsaActions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_FAILURE_ACTIONSW.lpsaActions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpsaActions$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_FAILURE_ACTIONSW.lpsaActions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


