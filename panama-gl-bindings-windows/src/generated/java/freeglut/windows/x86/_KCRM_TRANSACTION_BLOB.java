// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _KCRM_TRANSACTION_BLOB {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("UOW"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("TmIdentity"),
        Constants$root.C_LONG$LAYOUT.withName("IsolationLevel"),
        Constants$root.C_LONG$LAYOUT.withName("IsolationFlags"),
        Constants$root.C_LONG$LAYOUT.withName("Timeout"),
        MemoryLayout.sequenceLayout(64, Constants$root.C_SHORT$LAYOUT).withName("Description")
    ).withName("_KCRM_TRANSACTION_BLOB");
    public static MemoryLayout $LAYOUT() {
        return _KCRM_TRANSACTION_BLOB.$struct$LAYOUT;
    }
    public static MemorySegment UOW$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment TmIdentity$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    static final VarHandle IsolationLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsolationLevel"));
    public static VarHandle IsolationLevel$VH() {
        return _KCRM_TRANSACTION_BLOB.IsolationLevel$VH;
    }
    public static int IsolationLevel$get(MemorySegment seg) {
        return (int)_KCRM_TRANSACTION_BLOB.IsolationLevel$VH.get(seg);
    }
    public static void IsolationLevel$set( MemorySegment seg, int x) {
        _KCRM_TRANSACTION_BLOB.IsolationLevel$VH.set(seg, x);
    }
    public static int IsolationLevel$get(MemorySegment seg, long index) {
        return (int)_KCRM_TRANSACTION_BLOB.IsolationLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsolationLevel$set(MemorySegment seg, long index, int x) {
        _KCRM_TRANSACTION_BLOB.IsolationLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IsolationFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsolationFlags"));
    public static VarHandle IsolationFlags$VH() {
        return _KCRM_TRANSACTION_BLOB.IsolationFlags$VH;
    }
    public static int IsolationFlags$get(MemorySegment seg) {
        return (int)_KCRM_TRANSACTION_BLOB.IsolationFlags$VH.get(seg);
    }
    public static void IsolationFlags$set( MemorySegment seg, int x) {
        _KCRM_TRANSACTION_BLOB.IsolationFlags$VH.set(seg, x);
    }
    public static int IsolationFlags$get(MemorySegment seg, long index) {
        return (int)_KCRM_TRANSACTION_BLOB.IsolationFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsolationFlags$set(MemorySegment seg, long index, int x) {
        _KCRM_TRANSACTION_BLOB.IsolationFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Timeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Timeout"));
    public static VarHandle Timeout$VH() {
        return _KCRM_TRANSACTION_BLOB.Timeout$VH;
    }
    public static int Timeout$get(MemorySegment seg) {
        return (int)_KCRM_TRANSACTION_BLOB.Timeout$VH.get(seg);
    }
    public static void Timeout$set( MemorySegment seg, int x) {
        _KCRM_TRANSACTION_BLOB.Timeout$VH.set(seg, x);
    }
    public static int Timeout$get(MemorySegment seg, long index) {
        return (int)_KCRM_TRANSACTION_BLOB.Timeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Timeout$set(MemorySegment seg, long index, int x) {
        _KCRM_TRANSACTION_BLOB.Timeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Description$slice(MemorySegment seg) {
        return seg.asSlice(44, 128);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


