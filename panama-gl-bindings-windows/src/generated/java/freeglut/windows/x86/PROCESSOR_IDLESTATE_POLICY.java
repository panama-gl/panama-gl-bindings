// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PROCESSOR_IDLESTATE_POLICY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Revision"),
        MemoryLayout.unionLayout(
            Constants$root.C_SHORT$LAYOUT.withName("AsWORD"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1).withName("AllowScaling"),
                    MemoryLayout.paddingLayout(1).withName("Disabled"),
                    MemoryLayout.paddingLayout(14).withName("Reserved")
                )
            ).withName("$anon$0")
        ).withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("PolicyCount"),
        MemoryLayout.sequenceLayout(3, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("TimeCheck"),
            Constants$root.C_CHAR$LAYOUT.withName("DemotePercent"),
            Constants$root.C_CHAR$LAYOUT.withName("PromotePercent"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("Spare")
        )).withName("Policy")
    );
    public static MemoryLayout $LAYOUT() {
        return PROCESSOR_IDLESTATE_POLICY.$struct$LAYOUT;
    }
    static final VarHandle Revision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Revision"));
    public static VarHandle Revision$VH() {
        return PROCESSOR_IDLESTATE_POLICY.Revision$VH;
    }
    public static short Revision$get(MemorySegment seg) {
        return (short)PROCESSOR_IDLESTATE_POLICY.Revision$VH.get(seg);
    }
    public static void Revision$set( MemorySegment seg, short x) {
        PROCESSOR_IDLESTATE_POLICY.Revision$VH.set(seg, x);
    }
    public static short Revision$get(MemorySegment seg, long index) {
        return (short)PROCESSOR_IDLESTATE_POLICY.Revision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Revision$set(MemorySegment seg, long index, short x) {
        PROCESSOR_IDLESTATE_POLICY.Revision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class Flags {

        static final  GroupLayout Flags$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_SHORT$LAYOUT.withName("AsWORD"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1).withName("AllowScaling"),
                    MemoryLayout.paddingLayout(1).withName("Disabled"),
                    MemoryLayout.paddingLayout(14).withName("Reserved")
                )
            ).withName("$anon$0")
        );
        public static MemoryLayout $LAYOUT() {
            return Flags.Flags$union$LAYOUT;
        }
        static final VarHandle AsWORD$VH = Flags$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AsWORD"));
        public static VarHandle AsWORD$VH() {
            return Flags.AsWORD$VH;
        }
        public static short AsWORD$get(MemorySegment seg) {
            return (short)Flags.AsWORD$VH.get(seg);
        }
        public static void AsWORD$set( MemorySegment seg, short x) {
            Flags.AsWORD$VH.set(seg, x);
        }
        public static short AsWORD$get(MemorySegment seg, long index) {
            return (short)Flags.AsWORD$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void AsWORD$set(MemorySegment seg, long index, short x) {
            Flags.AsWORD$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Flags$slice(MemorySegment seg) {
        return seg.asSlice(2, 2);
    }
    static final VarHandle PolicyCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PolicyCount"));
    public static VarHandle PolicyCount$VH() {
        return PROCESSOR_IDLESTATE_POLICY.PolicyCount$VH;
    }
    public static int PolicyCount$get(MemorySegment seg) {
        return (int)PROCESSOR_IDLESTATE_POLICY.PolicyCount$VH.get(seg);
    }
    public static void PolicyCount$set( MemorySegment seg, int x) {
        PROCESSOR_IDLESTATE_POLICY.PolicyCount$VH.set(seg, x);
    }
    public static int PolicyCount$get(MemorySegment seg, long index) {
        return (int)PROCESSOR_IDLESTATE_POLICY.PolicyCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PolicyCount$set(MemorySegment seg, long index, int x) {
        PROCESSOR_IDLESTATE_POLICY.PolicyCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Policy$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


