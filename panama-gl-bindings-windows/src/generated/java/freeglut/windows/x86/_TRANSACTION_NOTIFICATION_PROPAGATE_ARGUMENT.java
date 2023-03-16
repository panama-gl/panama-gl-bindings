// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("PropagationCookie"),
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
        Constants$root.C_LONG$LAYOUT.withName("BufferLength")
    ).withName("_TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT");
    public static MemoryLayout $LAYOUT() {
        return _TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT.$struct$LAYOUT;
    }
    static final VarHandle PropagationCookie$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PropagationCookie"));
    public static VarHandle PropagationCookie$VH() {
        return _TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT.PropagationCookie$VH;
    }
    public static int PropagationCookie$get(MemorySegment seg) {
        return (int)_TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT.PropagationCookie$VH.get(seg);
    }
    public static void PropagationCookie$set( MemorySegment seg, int x) {
        _TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT.PropagationCookie$VH.set(seg, x);
    }
    public static int PropagationCookie$get(MemorySegment seg, long index) {
        return (int)_TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT.PropagationCookie$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PropagationCookie$set(MemorySegment seg, long index, int x) {
        _TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT.PropagationCookie$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment UOW$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static MemorySegment TmIdentity$slice(MemorySegment seg) {
        return seg.asSlice(20, 16);
    }
    static final VarHandle BufferLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BufferLength"));
    public static VarHandle BufferLength$VH() {
        return _TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT.BufferLength$VH;
    }
    public static int BufferLength$get(MemorySegment seg) {
        return (int)_TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT.BufferLength$VH.get(seg);
    }
    public static void BufferLength$set( MemorySegment seg, int x) {
        _TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT.BufferLength$VH.set(seg, x);
    }
    public static int BufferLength$get(MemorySegment seg, long index) {
        return (int)_TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT.BufferLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferLength$set(MemorySegment seg, long index, int x) {
        _TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT.BufferLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

