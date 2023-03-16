// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _REMSECURITY_ATTRIBUTES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("nLength"),
        Constants$root.C_LONG$LAYOUT.withName("lpSecurityDescriptor"),
        Constants$root.C_LONG$LAYOUT.withName("bInheritHandle")
    ).withName("_REMSECURITY_ATTRIBUTES");
    public static MemoryLayout $LAYOUT() {
        return _REMSECURITY_ATTRIBUTES.$struct$LAYOUT;
    }
    static final VarHandle nLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nLength"));
    public static VarHandle nLength$VH() {
        return _REMSECURITY_ATTRIBUTES.nLength$VH;
    }
    public static int nLength$get(MemorySegment seg) {
        return (int)_REMSECURITY_ATTRIBUTES.nLength$VH.get(seg);
    }
    public static void nLength$set( MemorySegment seg, int x) {
        _REMSECURITY_ATTRIBUTES.nLength$VH.set(seg, x);
    }
    public static int nLength$get(MemorySegment seg, long index) {
        return (int)_REMSECURITY_ATTRIBUTES.nLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nLength$set(MemorySegment seg, long index, int x) {
        _REMSECURITY_ATTRIBUTES.nLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpSecurityDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpSecurityDescriptor"));
    public static VarHandle lpSecurityDescriptor$VH() {
        return _REMSECURITY_ATTRIBUTES.lpSecurityDescriptor$VH;
    }
    public static int lpSecurityDescriptor$get(MemorySegment seg) {
        return (int)_REMSECURITY_ATTRIBUTES.lpSecurityDescriptor$VH.get(seg);
    }
    public static void lpSecurityDescriptor$set( MemorySegment seg, int x) {
        _REMSECURITY_ATTRIBUTES.lpSecurityDescriptor$VH.set(seg, x);
    }
    public static int lpSecurityDescriptor$get(MemorySegment seg, long index) {
        return (int)_REMSECURITY_ATTRIBUTES.lpSecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpSecurityDescriptor$set(MemorySegment seg, long index, int x) {
        _REMSECURITY_ATTRIBUTES.lpSecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bInheritHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bInheritHandle"));
    public static VarHandle bInheritHandle$VH() {
        return _REMSECURITY_ATTRIBUTES.bInheritHandle$VH;
    }
    public static int bInheritHandle$get(MemorySegment seg) {
        return (int)_REMSECURITY_ATTRIBUTES.bInheritHandle$VH.get(seg);
    }
    public static void bInheritHandle$set( MemorySegment seg, int x) {
        _REMSECURITY_ATTRIBUTES.bInheritHandle$VH.set(seg, x);
    }
    public static int bInheritHandle$get(MemorySegment seg, long index) {
        return (int)_REMSECURITY_ATTRIBUTES.bInheritHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bInheritHandle$set(MemorySegment seg, long index, int x) {
        _REMSECURITY_ATTRIBUTES.bInheritHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


