// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("Flags"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1).withName("EnableControlFlowGuard"),
                    MemoryLayout.paddingLayout(1).withName("EnableExportSuppression"),
                    MemoryLayout.paddingLayout(1).withName("StrictMode"),
                    MemoryLayout.paddingLayout(1).withName("EnableXfg"),
                    MemoryLayout.paddingLayout(1).withName("EnableXfgAuditMode"),
                    MemoryLayout.paddingLayout(27).withName("ReservedFlags")
                )
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY");
    public static MemoryLayout $LAYOUT() {
        return _PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


