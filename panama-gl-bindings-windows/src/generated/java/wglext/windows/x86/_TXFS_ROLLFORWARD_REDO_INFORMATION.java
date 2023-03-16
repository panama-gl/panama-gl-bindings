// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TXFS_ROLLFORWARD_REDO_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("LastVirtualClock"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LastRedoLsn"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("HighestRecoveryLsn"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_TXFS_ROLLFORWARD_REDO_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TXFS_ROLLFORWARD_REDO_INFORMATION.$struct$LAYOUT;
    }
    public static MemorySegment LastVirtualClock$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle LastRedoLsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LastRedoLsn"));
    public static VarHandle LastRedoLsn$VH() {
        return _TXFS_ROLLFORWARD_REDO_INFORMATION.LastRedoLsn$VH;
    }
    public static long LastRedoLsn$get(MemorySegment seg) {
        return (long)_TXFS_ROLLFORWARD_REDO_INFORMATION.LastRedoLsn$VH.get(seg);
    }
    public static void LastRedoLsn$set( MemorySegment seg, long x) {
        _TXFS_ROLLFORWARD_REDO_INFORMATION.LastRedoLsn$VH.set(seg, x);
    }
    public static long LastRedoLsn$get(MemorySegment seg, long index) {
        return (long)_TXFS_ROLLFORWARD_REDO_INFORMATION.LastRedoLsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LastRedoLsn$set(MemorySegment seg, long index, long x) {
        _TXFS_ROLLFORWARD_REDO_INFORMATION.LastRedoLsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HighestRecoveryLsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HighestRecoveryLsn"));
    public static VarHandle HighestRecoveryLsn$VH() {
        return _TXFS_ROLLFORWARD_REDO_INFORMATION.HighestRecoveryLsn$VH;
    }
    public static long HighestRecoveryLsn$get(MemorySegment seg) {
        return (long)_TXFS_ROLLFORWARD_REDO_INFORMATION.HighestRecoveryLsn$VH.get(seg);
    }
    public static void HighestRecoveryLsn$set( MemorySegment seg, long x) {
        _TXFS_ROLLFORWARD_REDO_INFORMATION.HighestRecoveryLsn$VH.set(seg, x);
    }
    public static long HighestRecoveryLsn$get(MemorySegment seg, long index) {
        return (long)_TXFS_ROLLFORWARD_REDO_INFORMATION.HighestRecoveryLsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HighestRecoveryLsn$set(MemorySegment seg, long index, long x) {
        _TXFS_ROLLFORWARD_REDO_INFORMATION.HighestRecoveryLsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _TXFS_ROLLFORWARD_REDO_INFORMATION.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_TXFS_ROLLFORWARD_REDO_INFORMATION.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _TXFS_ROLLFORWARD_REDO_INFORMATION.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_TXFS_ROLLFORWARD_REDO_INFORMATION.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _TXFS_ROLLFORWARD_REDO_INFORMATION.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


