// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$871 {

    static final  GroupLayout GUID_DEVINTERFACE_SCM_PHYSICAL_DEVICE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVINTERFACE_SCM_PHYSICAL_DEVICE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEVINTERFACE_SCM_PHYSICAL_DEVICE", constants$871.GUID_DEVINTERFACE_SCM_PHYSICAL_DEVICE$LAYOUT);
    static final  GroupLayout GUID_SCM_PD_HEALTH_NOTIFICATION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SCM_PD_HEALTH_NOTIFICATION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_SCM_PD_HEALTH_NOTIFICATION", constants$871.GUID_SCM_PD_HEALTH_NOTIFICATION$LAYOUT);
    static final  GroupLayout GUID_SCM_PD_PASSTHROUGH_INVDIMM$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SCM_PD_PASSTHROUGH_INVDIMM$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_SCM_PD_PASSTHROUGH_INVDIMM", constants$871.GUID_SCM_PD_PASSTHROUGH_INVDIMM$LAYOUT);
    static final  GroupLayout GUID_DEVINTERFACE_COMPORT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVINTERFACE_COMPORT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEVINTERFACE_COMPORT", constants$871.GUID_DEVINTERFACE_COMPORT$LAYOUT);
    static final  GroupLayout GUID_DEVINTERFACE_SERENUM_BUS_ENUMERATOR$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVINTERFACE_SERENUM_BUS_ENUMERATOR$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEVINTERFACE_SERENUM_BUS_ENUMERATOR", constants$871.GUID_DEVINTERFACE_SERENUM_BUS_ENUMERATOR$LAYOUT);
    static final FunctionDescriptor DeviceDsmParameterBlock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceDsmParameterBlock$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmParameterBlock",
        constants$871.DeviceDsmParameterBlock$FUNC
    );
}

