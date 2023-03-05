// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TRANSACTION_LIST_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NumberOfTransactions"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("UOW")
        ).withName("_TRANSACTION_LIST_ENTRY")).withName("TransactionInformation")
    ).withName("_TRANSACTION_LIST_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TRANSACTION_LIST_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle NumberOfTransactions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfTransactions"));
    public static VarHandle NumberOfTransactions$VH() {
        return _TRANSACTION_LIST_INFORMATION.NumberOfTransactions$VH;
    }
    public static int NumberOfTransactions$get(MemorySegment seg) {
        return (int)_TRANSACTION_LIST_INFORMATION.NumberOfTransactions$VH.get(seg);
    }
    public static void NumberOfTransactions$set( MemorySegment seg, int x) {
        _TRANSACTION_LIST_INFORMATION.NumberOfTransactions$VH.set(seg, x);
    }
    public static int NumberOfTransactions$get(MemorySegment seg, long index) {
        return (int)_TRANSACTION_LIST_INFORMATION.NumberOfTransactions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfTransactions$set(MemorySegment seg, long index, int x) {
        _TRANSACTION_LIST_INFORMATION.NumberOfTransactions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment TransactionInformation$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


