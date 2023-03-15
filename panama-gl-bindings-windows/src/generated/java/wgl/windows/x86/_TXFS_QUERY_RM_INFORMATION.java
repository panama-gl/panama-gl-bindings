// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TXFS_QUERY_RM_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("BytesRequired"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TailLsn"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("CurrentLsn"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ArchiveTailLsn"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LogContainerSize"),
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
        ).withName("HighestVirtualClock"),
        Constants$root.C_LONG$LAYOUT.withName("LogContainerCount"),
        Constants$root.C_LONG$LAYOUT.withName("LogContainerCountMax"),
        Constants$root.C_LONG$LAYOUT.withName("LogContainerCountMin"),
        Constants$root.C_LONG$LAYOUT.withName("LogGrowthIncrement"),
        Constants$root.C_LONG$LAYOUT.withName("LogAutoShrinkPercentage"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_SHORT$LAYOUT.withName("LoggingMode"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("RmState"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LogCapacity"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LogFree"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TopsSize"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TopsUsed"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TransactionCount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("OnePCCount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TwoPCCount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumberLogFileFull"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("OldestTransactionAge"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("RMName"),
        Constants$root.C_LONG$LAYOUT.withName("TmLogPathOffset"),
        MemoryLayout.paddingLayout(32)
    ).withName("_TXFS_QUERY_RM_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TXFS_QUERY_RM_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle BytesRequired$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BytesRequired"));
    public static VarHandle BytesRequired$VH() {
        return _TXFS_QUERY_RM_INFORMATION.BytesRequired$VH;
    }
    public static int BytesRequired$get(MemorySegment seg) {
        return (int)_TXFS_QUERY_RM_INFORMATION.BytesRequired$VH.get(seg);
    }
    public static void BytesRequired$set( MemorySegment seg, int x) {
        _TXFS_QUERY_RM_INFORMATION.BytesRequired$VH.set(seg, x);
    }
    public static int BytesRequired$get(MemorySegment seg, long index) {
        return (int)_TXFS_QUERY_RM_INFORMATION.BytesRequired$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BytesRequired$set(MemorySegment seg, long index, int x) {
        _TXFS_QUERY_RM_INFORMATION.BytesRequired$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TailLsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TailLsn"));
    public static VarHandle TailLsn$VH() {
        return _TXFS_QUERY_RM_INFORMATION.TailLsn$VH;
    }
    public static long TailLsn$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.TailLsn$VH.get(seg);
    }
    public static void TailLsn$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.TailLsn$VH.set(seg, x);
    }
    public static long TailLsn$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.TailLsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TailLsn$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.TailLsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CurrentLsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CurrentLsn"));
    public static VarHandle CurrentLsn$VH() {
        return _TXFS_QUERY_RM_INFORMATION.CurrentLsn$VH;
    }
    public static long CurrentLsn$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.CurrentLsn$VH.get(seg);
    }
    public static void CurrentLsn$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.CurrentLsn$VH.set(seg, x);
    }
    public static long CurrentLsn$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.CurrentLsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CurrentLsn$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.CurrentLsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ArchiveTailLsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ArchiveTailLsn"));
    public static VarHandle ArchiveTailLsn$VH() {
        return _TXFS_QUERY_RM_INFORMATION.ArchiveTailLsn$VH;
    }
    public static long ArchiveTailLsn$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.ArchiveTailLsn$VH.get(seg);
    }
    public static void ArchiveTailLsn$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.ArchiveTailLsn$VH.set(seg, x);
    }
    public static long ArchiveTailLsn$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.ArchiveTailLsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ArchiveTailLsn$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.ArchiveTailLsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogContainerSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogContainerSize"));
    public static VarHandle LogContainerSize$VH() {
        return _TXFS_QUERY_RM_INFORMATION.LogContainerSize$VH;
    }
    public static long LogContainerSize$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.LogContainerSize$VH.get(seg);
    }
    public static void LogContainerSize$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.LogContainerSize$VH.set(seg, x);
    }
    public static long LogContainerSize$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.LogContainerSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogContainerSize$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.LogContainerSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment HighestVirtualClock$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    static final VarHandle LogContainerCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogContainerCount"));
    public static VarHandle LogContainerCount$VH() {
        return _TXFS_QUERY_RM_INFORMATION.LogContainerCount$VH;
    }
    public static int LogContainerCount$get(MemorySegment seg) {
        return (int)_TXFS_QUERY_RM_INFORMATION.LogContainerCount$VH.get(seg);
    }
    public static void LogContainerCount$set( MemorySegment seg, int x) {
        _TXFS_QUERY_RM_INFORMATION.LogContainerCount$VH.set(seg, x);
    }
    public static int LogContainerCount$get(MemorySegment seg, long index) {
        return (int)_TXFS_QUERY_RM_INFORMATION.LogContainerCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogContainerCount$set(MemorySegment seg, long index, int x) {
        _TXFS_QUERY_RM_INFORMATION.LogContainerCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogContainerCountMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogContainerCountMax"));
    public static VarHandle LogContainerCountMax$VH() {
        return _TXFS_QUERY_RM_INFORMATION.LogContainerCountMax$VH;
    }
    public static int LogContainerCountMax$get(MemorySegment seg) {
        return (int)_TXFS_QUERY_RM_INFORMATION.LogContainerCountMax$VH.get(seg);
    }
    public static void LogContainerCountMax$set( MemorySegment seg, int x) {
        _TXFS_QUERY_RM_INFORMATION.LogContainerCountMax$VH.set(seg, x);
    }
    public static int LogContainerCountMax$get(MemorySegment seg, long index) {
        return (int)_TXFS_QUERY_RM_INFORMATION.LogContainerCountMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogContainerCountMax$set(MemorySegment seg, long index, int x) {
        _TXFS_QUERY_RM_INFORMATION.LogContainerCountMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogContainerCountMin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogContainerCountMin"));
    public static VarHandle LogContainerCountMin$VH() {
        return _TXFS_QUERY_RM_INFORMATION.LogContainerCountMin$VH;
    }
    public static int LogContainerCountMin$get(MemorySegment seg) {
        return (int)_TXFS_QUERY_RM_INFORMATION.LogContainerCountMin$VH.get(seg);
    }
    public static void LogContainerCountMin$set( MemorySegment seg, int x) {
        _TXFS_QUERY_RM_INFORMATION.LogContainerCountMin$VH.set(seg, x);
    }
    public static int LogContainerCountMin$get(MemorySegment seg, long index) {
        return (int)_TXFS_QUERY_RM_INFORMATION.LogContainerCountMin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogContainerCountMin$set(MemorySegment seg, long index, int x) {
        _TXFS_QUERY_RM_INFORMATION.LogContainerCountMin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogGrowthIncrement$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogGrowthIncrement"));
    public static VarHandle LogGrowthIncrement$VH() {
        return _TXFS_QUERY_RM_INFORMATION.LogGrowthIncrement$VH;
    }
    public static int LogGrowthIncrement$get(MemorySegment seg) {
        return (int)_TXFS_QUERY_RM_INFORMATION.LogGrowthIncrement$VH.get(seg);
    }
    public static void LogGrowthIncrement$set( MemorySegment seg, int x) {
        _TXFS_QUERY_RM_INFORMATION.LogGrowthIncrement$VH.set(seg, x);
    }
    public static int LogGrowthIncrement$get(MemorySegment seg, long index) {
        return (int)_TXFS_QUERY_RM_INFORMATION.LogGrowthIncrement$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogGrowthIncrement$set(MemorySegment seg, long index, int x) {
        _TXFS_QUERY_RM_INFORMATION.LogGrowthIncrement$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogAutoShrinkPercentage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogAutoShrinkPercentage"));
    public static VarHandle LogAutoShrinkPercentage$VH() {
        return _TXFS_QUERY_RM_INFORMATION.LogAutoShrinkPercentage$VH;
    }
    public static int LogAutoShrinkPercentage$get(MemorySegment seg) {
        return (int)_TXFS_QUERY_RM_INFORMATION.LogAutoShrinkPercentage$VH.get(seg);
    }
    public static void LogAutoShrinkPercentage$set( MemorySegment seg, int x) {
        _TXFS_QUERY_RM_INFORMATION.LogAutoShrinkPercentage$VH.set(seg, x);
    }
    public static int LogAutoShrinkPercentage$get(MemorySegment seg, long index) {
        return (int)_TXFS_QUERY_RM_INFORMATION.LogAutoShrinkPercentage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogAutoShrinkPercentage$set(MemorySegment seg, long index, int x) {
        _TXFS_QUERY_RM_INFORMATION.LogAutoShrinkPercentage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _TXFS_QUERY_RM_INFORMATION.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_TXFS_QUERY_RM_INFORMATION.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _TXFS_QUERY_RM_INFORMATION.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_TXFS_QUERY_RM_INFORMATION.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _TXFS_QUERY_RM_INFORMATION.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LoggingMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LoggingMode"));
    public static VarHandle LoggingMode$VH() {
        return _TXFS_QUERY_RM_INFORMATION.LoggingMode$VH;
    }
    public static short LoggingMode$get(MemorySegment seg) {
        return (short)_TXFS_QUERY_RM_INFORMATION.LoggingMode$VH.get(seg);
    }
    public static void LoggingMode$set( MemorySegment seg, short x) {
        _TXFS_QUERY_RM_INFORMATION.LoggingMode$VH.set(seg, x);
    }
    public static short LoggingMode$get(MemorySegment seg, long index) {
        return (short)_TXFS_QUERY_RM_INFORMATION.LoggingMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LoggingMode$set(MemorySegment seg, long index, short x) {
        _TXFS_QUERY_RM_INFORMATION.LoggingMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _TXFS_QUERY_RM_INFORMATION.Reserved$VH;
    }
    public static short Reserved$get(MemorySegment seg) {
        return (short)_TXFS_QUERY_RM_INFORMATION.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, short x) {
        _TXFS_QUERY_RM_INFORMATION.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_TXFS_QUERY_RM_INFORMATION.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _TXFS_QUERY_RM_INFORMATION.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RmState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RmState"));
    public static VarHandle RmState$VH() {
        return _TXFS_QUERY_RM_INFORMATION.RmState$VH;
    }
    public static int RmState$get(MemorySegment seg) {
        return (int)_TXFS_QUERY_RM_INFORMATION.RmState$VH.get(seg);
    }
    public static void RmState$set( MemorySegment seg, int x) {
        _TXFS_QUERY_RM_INFORMATION.RmState$VH.set(seg, x);
    }
    public static int RmState$get(MemorySegment seg, long index) {
        return (int)_TXFS_QUERY_RM_INFORMATION.RmState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RmState$set(MemorySegment seg, long index, int x) {
        _TXFS_QUERY_RM_INFORMATION.RmState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogCapacity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogCapacity"));
    public static VarHandle LogCapacity$VH() {
        return _TXFS_QUERY_RM_INFORMATION.LogCapacity$VH;
    }
    public static long LogCapacity$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.LogCapacity$VH.get(seg);
    }
    public static void LogCapacity$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.LogCapacity$VH.set(seg, x);
    }
    public static long LogCapacity$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.LogCapacity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogCapacity$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.LogCapacity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogFree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogFree"));
    public static VarHandle LogFree$VH() {
        return _TXFS_QUERY_RM_INFORMATION.LogFree$VH;
    }
    public static long LogFree$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.LogFree$VH.get(seg);
    }
    public static void LogFree$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.LogFree$VH.set(seg, x);
    }
    public static long LogFree$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.LogFree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogFree$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.LogFree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TopsSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TopsSize"));
    public static VarHandle TopsSize$VH() {
        return _TXFS_QUERY_RM_INFORMATION.TopsSize$VH;
    }
    public static long TopsSize$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.TopsSize$VH.get(seg);
    }
    public static void TopsSize$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.TopsSize$VH.set(seg, x);
    }
    public static long TopsSize$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.TopsSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TopsSize$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.TopsSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TopsUsed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TopsUsed"));
    public static VarHandle TopsUsed$VH() {
        return _TXFS_QUERY_RM_INFORMATION.TopsUsed$VH;
    }
    public static long TopsUsed$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.TopsUsed$VH.get(seg);
    }
    public static void TopsUsed$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.TopsUsed$VH.set(seg, x);
    }
    public static long TopsUsed$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.TopsUsed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TopsUsed$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.TopsUsed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TransactionCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransactionCount"));
    public static VarHandle TransactionCount$VH() {
        return _TXFS_QUERY_RM_INFORMATION.TransactionCount$VH;
    }
    public static long TransactionCount$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.TransactionCount$VH.get(seg);
    }
    public static void TransactionCount$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.TransactionCount$VH.set(seg, x);
    }
    public static long TransactionCount$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.TransactionCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransactionCount$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.TransactionCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OnePCCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OnePCCount"));
    public static VarHandle OnePCCount$VH() {
        return _TXFS_QUERY_RM_INFORMATION.OnePCCount$VH;
    }
    public static long OnePCCount$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.OnePCCount$VH.get(seg);
    }
    public static void OnePCCount$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.OnePCCount$VH.set(seg, x);
    }
    public static long OnePCCount$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.OnePCCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnePCCount$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.OnePCCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TwoPCCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TwoPCCount"));
    public static VarHandle TwoPCCount$VH() {
        return _TXFS_QUERY_RM_INFORMATION.TwoPCCount$VH;
    }
    public static long TwoPCCount$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.TwoPCCount$VH.get(seg);
    }
    public static void TwoPCCount$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.TwoPCCount$VH.set(seg, x);
    }
    public static long TwoPCCount$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.TwoPCCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TwoPCCount$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.TwoPCCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberLogFileFull$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberLogFileFull"));
    public static VarHandle NumberLogFileFull$VH() {
        return _TXFS_QUERY_RM_INFORMATION.NumberLogFileFull$VH;
    }
    public static long NumberLogFileFull$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.NumberLogFileFull$VH.get(seg);
    }
    public static void NumberLogFileFull$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.NumberLogFileFull$VH.set(seg, x);
    }
    public static long NumberLogFileFull$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.NumberLogFileFull$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberLogFileFull$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.NumberLogFileFull$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OldestTransactionAge$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OldestTransactionAge"));
    public static VarHandle OldestTransactionAge$VH() {
        return _TXFS_QUERY_RM_INFORMATION.OldestTransactionAge$VH;
    }
    public static long OldestTransactionAge$get(MemorySegment seg) {
        return (long)_TXFS_QUERY_RM_INFORMATION.OldestTransactionAge$VH.get(seg);
    }
    public static void OldestTransactionAge$set( MemorySegment seg, long x) {
        _TXFS_QUERY_RM_INFORMATION.OldestTransactionAge$VH.set(seg, x);
    }
    public static long OldestTransactionAge$get(MemorySegment seg, long index) {
        return (long)_TXFS_QUERY_RM_INFORMATION.OldestTransactionAge$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OldestTransactionAge$set(MemorySegment seg, long index, long x) {
        _TXFS_QUERY_RM_INFORMATION.OldestTransactionAge$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RMName$slice(MemorySegment seg) {
        return seg.asSlice(152, 16);
    }
    static final VarHandle TmLogPathOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TmLogPathOffset"));
    public static VarHandle TmLogPathOffset$VH() {
        return _TXFS_QUERY_RM_INFORMATION.TmLogPathOffset$VH;
    }
    public static int TmLogPathOffset$get(MemorySegment seg) {
        return (int)_TXFS_QUERY_RM_INFORMATION.TmLogPathOffset$VH.get(seg);
    }
    public static void TmLogPathOffset$set( MemorySegment seg, int x) {
        _TXFS_QUERY_RM_INFORMATION.TmLogPathOffset$VH.set(seg, x);
    }
    public static int TmLogPathOffset$get(MemorySegment seg, long index) {
        return (int)_TXFS_QUERY_RM_INFORMATION.TmLogPathOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TmLogPathOffset$set(MemorySegment seg, long index, int x) {
        _TXFS_QUERY_RM_INFORMATION.TmLogPathOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


