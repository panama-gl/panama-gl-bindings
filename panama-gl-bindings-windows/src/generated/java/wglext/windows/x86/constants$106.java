// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$106 {

    static final  GroupLayout GUID_BACKGROUND_TASK_NOTIFICATION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BACKGROUND_TASK_NOTIFICATION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BACKGROUND_TASK_NOTIFICATION", constants$106.GUID_BACKGROUND_TASK_NOTIFICATION$LAYOUT);
    static final  GroupLayout GUID_APPLAUNCH_BUTTON$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_APPLAUNCH_BUTTON$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_APPLAUNCH_BUTTON", constants$106.GUID_APPLAUNCH_BUTTON$LAYOUT);
    static final  GroupLayout GUID_PCIEXPRESS_SETTINGS_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PCIEXPRESS_SETTINGS_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PCIEXPRESS_SETTINGS_SUBGROUP", constants$106.GUID_PCIEXPRESS_SETTINGS_SUBGROUP$LAYOUT);
    static final  GroupLayout GUID_PCIEXPRESS_ASPM_POLICY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PCIEXPRESS_ASPM_POLICY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PCIEXPRESS_ASPM_POLICY", constants$106.GUID_PCIEXPRESS_ASPM_POLICY$LAYOUT);
    static final  GroupLayout GUID_ENABLE_SWITCH_FORCED_SHUTDOWN$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ENABLE_SWITCH_FORCED_SHUTDOWN$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ENABLE_SWITCH_FORCED_SHUTDOWN", constants$106.GUID_ENABLE_SWITCH_FORCED_SHUTDOWN$LAYOUT);
    static final  GroupLayout GUID_INTSTEER_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_INTSTEER_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_INTSTEER_SUBGROUP", constants$106.GUID_INTSTEER_SUBGROUP$LAYOUT);
}


