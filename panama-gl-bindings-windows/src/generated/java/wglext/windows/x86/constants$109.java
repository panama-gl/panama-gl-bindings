// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$109 {

    static final  GroupLayout PPM_IDLE_ACCOUNTING_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment PPM_IDLE_ACCOUNTING_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("PPM_IDLE_ACCOUNTING_GUID", constants$109.PPM_IDLE_ACCOUNTING_GUID$LAYOUT);
    static final  GroupLayout PPM_IDLE_ACCOUNTING_EX_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment PPM_IDLE_ACCOUNTING_EX_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("PPM_IDLE_ACCOUNTING_EX_GUID", constants$109.PPM_IDLE_ACCOUNTING_EX_GUID$LAYOUT);
    static final  GroupLayout PPM_THERMALCONSTRAINT_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment PPM_THERMALCONSTRAINT_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("PPM_THERMALCONSTRAINT_GUID", constants$109.PPM_THERMALCONSTRAINT_GUID$LAYOUT);
    static final  GroupLayout PPM_PERFMON_PERFSTATE_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment PPM_PERFMON_PERFSTATE_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("PPM_PERFMON_PERFSTATE_GUID", constants$109.PPM_PERFMON_PERFSTATE_GUID$LAYOUT);
    static final  GroupLayout PPM_THERMAL_POLICY_CHANGE_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment PPM_THERMAL_POLICY_CHANGE_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("PPM_THERMAL_POLICY_CHANGE_GUID", constants$109.PPM_THERMAL_POLICY_CHANGE_GUID$LAYOUT);
    static final FunctionDescriptor PIMAGE_TLS_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


