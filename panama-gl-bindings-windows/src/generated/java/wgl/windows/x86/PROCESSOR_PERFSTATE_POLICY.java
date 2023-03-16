// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PROCESSOR_PERFSTATE_POLICY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Revision"),
        Constants$root.C_CHAR$LAYOUT.withName("MaxThrottle"),
        Constants$root.C_CHAR$LAYOUT.withName("MinThrottle"),
        Constants$root.C_CHAR$LAYOUT.withName("BusyAdjThreshold"),
        MemoryLayout.unionLayout(
            Constants$root.C_CHAR$LAYOUT.withName("Spare"),
            MemoryLayout.unionLayout(
                Constants$root.C_CHAR$LAYOUT.withName("AsBYTE"),
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.paddingLayout(1).withName("NoDomainAccounting"),
                        MemoryLayout.paddingLayout(2).withName("IncreasePolicy"),
                        MemoryLayout.paddingLayout(2).withName("DecreasePolicy"),
                        MemoryLayout.paddingLayout(3).withName("Reserved")
                    )
                ).withName("$anon$0")
            ).withName("Flags")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("TimeCheck"),
        Constants$root.C_LONG$LAYOUT.withName("IncreaseTime"),
        Constants$root.C_LONG$LAYOUT.withName("DecreaseTime"),
        Constants$root.C_LONG$LAYOUT.withName("IncreasePercent"),
        Constants$root.C_LONG$LAYOUT.withName("DecreasePercent")
    );
    public static MemoryLayout $LAYOUT() {
        return PROCESSOR_PERFSTATE_POLICY.$struct$LAYOUT;
    }
    static final VarHandle Revision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Revision"));
    public static VarHandle Revision$VH() {
        return PROCESSOR_PERFSTATE_POLICY.Revision$VH;
    }
    public static int Revision$get(MemorySegment seg) {
        return (int)PROCESSOR_PERFSTATE_POLICY.Revision$VH.get(seg);
    }
    public static void Revision$set( MemorySegment seg, int x) {
        PROCESSOR_PERFSTATE_POLICY.Revision$VH.set(seg, x);
    }
    public static int Revision$get(MemorySegment seg, long index) {
        return (int)PROCESSOR_PERFSTATE_POLICY.Revision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Revision$set(MemorySegment seg, long index, int x) {
        PROCESSOR_PERFSTATE_POLICY.Revision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxThrottle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxThrottle"));
    public static VarHandle MaxThrottle$VH() {
        return PROCESSOR_PERFSTATE_POLICY.MaxThrottle$VH;
    }
    public static byte MaxThrottle$get(MemorySegment seg) {
        return (byte)PROCESSOR_PERFSTATE_POLICY.MaxThrottle$VH.get(seg);
    }
    public static void MaxThrottle$set( MemorySegment seg, byte x) {
        PROCESSOR_PERFSTATE_POLICY.MaxThrottle$VH.set(seg, x);
    }
    public static byte MaxThrottle$get(MemorySegment seg, long index) {
        return (byte)PROCESSOR_PERFSTATE_POLICY.MaxThrottle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxThrottle$set(MemorySegment seg, long index, byte x) {
        PROCESSOR_PERFSTATE_POLICY.MaxThrottle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinThrottle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinThrottle"));
    public static VarHandle MinThrottle$VH() {
        return PROCESSOR_PERFSTATE_POLICY.MinThrottle$VH;
    }
    public static byte MinThrottle$get(MemorySegment seg) {
        return (byte)PROCESSOR_PERFSTATE_POLICY.MinThrottle$VH.get(seg);
    }
    public static void MinThrottle$set( MemorySegment seg, byte x) {
        PROCESSOR_PERFSTATE_POLICY.MinThrottle$VH.set(seg, x);
    }
    public static byte MinThrottle$get(MemorySegment seg, long index) {
        return (byte)PROCESSOR_PERFSTATE_POLICY.MinThrottle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinThrottle$set(MemorySegment seg, long index, byte x) {
        PROCESSOR_PERFSTATE_POLICY.MinThrottle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BusyAdjThreshold$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BusyAdjThreshold"));
    public static VarHandle BusyAdjThreshold$VH() {
        return PROCESSOR_PERFSTATE_POLICY.BusyAdjThreshold$VH;
    }
    public static byte BusyAdjThreshold$get(MemorySegment seg) {
        return (byte)PROCESSOR_PERFSTATE_POLICY.BusyAdjThreshold$VH.get(seg);
    }
    public static void BusyAdjThreshold$set( MemorySegment seg, byte x) {
        PROCESSOR_PERFSTATE_POLICY.BusyAdjThreshold$VH.set(seg, x);
    }
    public static byte BusyAdjThreshold$get(MemorySegment seg, long index) {
        return (byte)PROCESSOR_PERFSTATE_POLICY.BusyAdjThreshold$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BusyAdjThreshold$set(MemorySegment seg, long index, byte x) {
        PROCESSOR_PERFSTATE_POLICY.BusyAdjThreshold$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Spare$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Spare"));
    public static VarHandle Spare$VH() {
        return PROCESSOR_PERFSTATE_POLICY.Spare$VH;
    }
    public static byte Spare$get(MemorySegment seg) {
        return (byte)PROCESSOR_PERFSTATE_POLICY.Spare$VH.get(seg);
    }
    public static void Spare$set( MemorySegment seg, byte x) {
        PROCESSOR_PERFSTATE_POLICY.Spare$VH.set(seg, x);
    }
    public static byte Spare$get(MemorySegment seg, long index) {
        return (byte)PROCESSOR_PERFSTATE_POLICY.Spare$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Spare$set(MemorySegment seg, long index, byte x) {
        PROCESSOR_PERFSTATE_POLICY.Spare$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class Flags {

        static final  GroupLayout Flags$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_CHAR$LAYOUT.withName("AsBYTE"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1).withName("NoDomainAccounting"),
                    MemoryLayout.paddingLayout(2).withName("IncreasePolicy"),
                    MemoryLayout.paddingLayout(2).withName("DecreasePolicy"),
                    MemoryLayout.paddingLayout(3).withName("Reserved")
                )
            ).withName("$anon$0")
        );
        public static MemoryLayout $LAYOUT() {
            return Flags.Flags$union$LAYOUT;
        }
        static final VarHandle AsBYTE$VH = Flags$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AsBYTE"));
        public static VarHandle AsBYTE$VH() {
            return Flags.AsBYTE$VH;
        }
        public static byte AsBYTE$get(MemorySegment seg) {
            return (byte)Flags.AsBYTE$VH.get(seg);
        }
        public static void AsBYTE$set( MemorySegment seg, byte x) {
            Flags.AsBYTE$VH.set(seg, x);
        }
        public static byte AsBYTE$get(MemorySegment seg, long index) {
            return (byte)Flags.AsBYTE$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void AsBYTE$set(MemorySegment seg, long index, byte x) {
            Flags.AsBYTE$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Flags$slice(MemorySegment seg) {
        return seg.asSlice(7, 1);
    }
    static final VarHandle TimeCheck$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeCheck"));
    public static VarHandle TimeCheck$VH() {
        return PROCESSOR_PERFSTATE_POLICY.TimeCheck$VH;
    }
    public static int TimeCheck$get(MemorySegment seg) {
        return (int)PROCESSOR_PERFSTATE_POLICY.TimeCheck$VH.get(seg);
    }
    public static void TimeCheck$set( MemorySegment seg, int x) {
        PROCESSOR_PERFSTATE_POLICY.TimeCheck$VH.set(seg, x);
    }
    public static int TimeCheck$get(MemorySegment seg, long index) {
        return (int)PROCESSOR_PERFSTATE_POLICY.TimeCheck$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeCheck$set(MemorySegment seg, long index, int x) {
        PROCESSOR_PERFSTATE_POLICY.TimeCheck$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IncreaseTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IncreaseTime"));
    public static VarHandle IncreaseTime$VH() {
        return PROCESSOR_PERFSTATE_POLICY.IncreaseTime$VH;
    }
    public static int IncreaseTime$get(MemorySegment seg) {
        return (int)PROCESSOR_PERFSTATE_POLICY.IncreaseTime$VH.get(seg);
    }
    public static void IncreaseTime$set( MemorySegment seg, int x) {
        PROCESSOR_PERFSTATE_POLICY.IncreaseTime$VH.set(seg, x);
    }
    public static int IncreaseTime$get(MemorySegment seg, long index) {
        return (int)PROCESSOR_PERFSTATE_POLICY.IncreaseTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IncreaseTime$set(MemorySegment seg, long index, int x) {
        PROCESSOR_PERFSTATE_POLICY.IncreaseTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DecreaseTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DecreaseTime"));
    public static VarHandle DecreaseTime$VH() {
        return PROCESSOR_PERFSTATE_POLICY.DecreaseTime$VH;
    }
    public static int DecreaseTime$get(MemorySegment seg) {
        return (int)PROCESSOR_PERFSTATE_POLICY.DecreaseTime$VH.get(seg);
    }
    public static void DecreaseTime$set( MemorySegment seg, int x) {
        PROCESSOR_PERFSTATE_POLICY.DecreaseTime$VH.set(seg, x);
    }
    public static int DecreaseTime$get(MemorySegment seg, long index) {
        return (int)PROCESSOR_PERFSTATE_POLICY.DecreaseTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DecreaseTime$set(MemorySegment seg, long index, int x) {
        PROCESSOR_PERFSTATE_POLICY.DecreaseTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IncreasePercent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IncreasePercent"));
    public static VarHandle IncreasePercent$VH() {
        return PROCESSOR_PERFSTATE_POLICY.IncreasePercent$VH;
    }
    public static int IncreasePercent$get(MemorySegment seg) {
        return (int)PROCESSOR_PERFSTATE_POLICY.IncreasePercent$VH.get(seg);
    }
    public static void IncreasePercent$set( MemorySegment seg, int x) {
        PROCESSOR_PERFSTATE_POLICY.IncreasePercent$VH.set(seg, x);
    }
    public static int IncreasePercent$get(MemorySegment seg, long index) {
        return (int)PROCESSOR_PERFSTATE_POLICY.IncreasePercent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IncreasePercent$set(MemorySegment seg, long index, int x) {
        PROCESSOR_PERFSTATE_POLICY.IncreasePercent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DecreasePercent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DecreasePercent"));
    public static VarHandle DecreasePercent$VH() {
        return PROCESSOR_PERFSTATE_POLICY.DecreasePercent$VH;
    }
    public static int DecreasePercent$get(MemorySegment seg) {
        return (int)PROCESSOR_PERFSTATE_POLICY.DecreasePercent$VH.get(seg);
    }
    public static void DecreasePercent$set( MemorySegment seg, int x) {
        PROCESSOR_PERFSTATE_POLICY.DecreasePercent$VH.set(seg, x);
    }
    public static int DecreasePercent$get(MemorySegment seg, long index) {
        return (int)PROCESSOR_PERFSTATE_POLICY.DecreasePercent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DecreasePercent$set(MemorySegment seg, long index, int x) {
        PROCESSOR_PERFSTATE_POLICY.DecreasePercent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


