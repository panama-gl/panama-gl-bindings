// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TRANSACTION_NOTIFICATION_SAVEPOINT_ARGUMENT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("SavepointId")
    ).withName("_TRANSACTION_NOTIFICATION_SAVEPOINT_ARGUMENT");
    public static MemoryLayout $LAYOUT() {
        return _TRANSACTION_NOTIFICATION_SAVEPOINT_ARGUMENT.$struct$LAYOUT;
    }
    static final VarHandle SavepointId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SavepointId"));
    public static VarHandle SavepointId$VH() {
        return _TRANSACTION_NOTIFICATION_SAVEPOINT_ARGUMENT.SavepointId$VH;
    }
    public static int SavepointId$get(MemorySegment seg) {
        return (int)_TRANSACTION_NOTIFICATION_SAVEPOINT_ARGUMENT.SavepointId$VH.get(seg);
    }
    public static void SavepointId$set( MemorySegment seg, int x) {
        _TRANSACTION_NOTIFICATION_SAVEPOINT_ARGUMENT.SavepointId$VH.set(seg, x);
    }
    public static int SavepointId$get(MemorySegment seg, long index) {
        return (int)_TRANSACTION_NOTIFICATION_SAVEPOINT_ARGUMENT.SavepointId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SavepointId$set(MemorySegment seg, long index, int x) {
        _TRANSACTION_NOTIFICATION_SAVEPOINT_ARGUMENT.SavepointId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


