// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _QUERY_SERVICE_LOCK_STATUSA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("fIsLocked"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpLockOwner"),
        Constants$root.C_LONG$LAYOUT.withName("dwLockDuration"),
        MemoryLayout.paddingLayout(32)
    ).withName("_QUERY_SERVICE_LOCK_STATUSA");
    public static MemoryLayout $LAYOUT() {
        return _QUERY_SERVICE_LOCK_STATUSA.$struct$LAYOUT;
    }
    static final VarHandle fIsLocked$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fIsLocked"));
    public static VarHandle fIsLocked$VH() {
        return _QUERY_SERVICE_LOCK_STATUSA.fIsLocked$VH;
    }
    public static int fIsLocked$get(MemorySegment seg) {
        return (int)_QUERY_SERVICE_LOCK_STATUSA.fIsLocked$VH.get(seg);
    }
    public static void fIsLocked$set( MemorySegment seg, int x) {
        _QUERY_SERVICE_LOCK_STATUSA.fIsLocked$VH.set(seg, x);
    }
    public static int fIsLocked$get(MemorySegment seg, long index) {
        return (int)_QUERY_SERVICE_LOCK_STATUSA.fIsLocked$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fIsLocked$set(MemorySegment seg, long index, int x) {
        _QUERY_SERVICE_LOCK_STATUSA.fIsLocked$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpLockOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpLockOwner"));
    public static VarHandle lpLockOwner$VH() {
        return _QUERY_SERVICE_LOCK_STATUSA.lpLockOwner$VH;
    }
    public static MemoryAddress lpLockOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_QUERY_SERVICE_LOCK_STATUSA.lpLockOwner$VH.get(seg);
    }
    public static void lpLockOwner$set( MemorySegment seg, MemoryAddress x) {
        _QUERY_SERVICE_LOCK_STATUSA.lpLockOwner$VH.set(seg, x);
    }
    public static MemoryAddress lpLockOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_QUERY_SERVICE_LOCK_STATUSA.lpLockOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpLockOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        _QUERY_SERVICE_LOCK_STATUSA.lpLockOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwLockDuration$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLockDuration"));
    public static VarHandle dwLockDuration$VH() {
        return _QUERY_SERVICE_LOCK_STATUSA.dwLockDuration$VH;
    }
    public static int dwLockDuration$get(MemorySegment seg) {
        return (int)_QUERY_SERVICE_LOCK_STATUSA.dwLockDuration$VH.get(seg);
    }
    public static void dwLockDuration$set( MemorySegment seg, int x) {
        _QUERY_SERVICE_LOCK_STATUSA.dwLockDuration$VH.set(seg, x);
    }
    public static int dwLockDuration$get(MemorySegment seg, long index) {
        return (int)_QUERY_SERVICE_LOCK_STATUSA.dwLockDuration$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLockDuration$set(MemorySegment seg, long index, int x) {
        _QUERY_SERVICE_LOCK_STATUSA.dwLockDuration$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


