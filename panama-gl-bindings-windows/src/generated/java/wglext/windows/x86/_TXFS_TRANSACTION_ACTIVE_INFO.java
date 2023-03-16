// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TXFS_TRANSACTION_ACTIVE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("TransactionsActiveAtSnapshot")
    ).withName("_TXFS_TRANSACTION_ACTIVE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _TXFS_TRANSACTION_ACTIVE_INFO.$struct$LAYOUT;
    }
    static final VarHandle TransactionsActiveAtSnapshot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransactionsActiveAtSnapshot"));
    public static VarHandle TransactionsActiveAtSnapshot$VH() {
        return _TXFS_TRANSACTION_ACTIVE_INFO.TransactionsActiveAtSnapshot$VH;
    }
    public static byte TransactionsActiveAtSnapshot$get(MemorySegment seg) {
        return (byte)_TXFS_TRANSACTION_ACTIVE_INFO.TransactionsActiveAtSnapshot$VH.get(seg);
    }
    public static void TransactionsActiveAtSnapshot$set( MemorySegment seg, byte x) {
        _TXFS_TRANSACTION_ACTIVE_INFO.TransactionsActiveAtSnapshot$VH.set(seg, x);
    }
    public static byte TransactionsActiveAtSnapshot$get(MemorySegment seg, long index) {
        return (byte)_TXFS_TRANSACTION_ACTIVE_INFO.TransactionsActiveAtSnapshot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransactionsActiveAtSnapshot$set(MemorySegment seg, long index, byte x) {
        _TXFS_TRANSACTION_ACTIVE_INFO.TransactionsActiveAtSnapshot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

