// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$90 {

    static final  GroupLayout GUID_BATTERY_DISCHARGE_FLAGS_2$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_DISCHARGE_FLAGS_2$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_DISCHARGE_FLAGS_2", constants$90.GUID_BATTERY_DISCHARGE_FLAGS_2$LAYOUT);
    static final  GroupLayout GUID_BATTERY_DISCHARGE_ACTION_3$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_DISCHARGE_ACTION_3$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_DISCHARGE_ACTION_3", constants$90.GUID_BATTERY_DISCHARGE_ACTION_3$LAYOUT);
    static final  GroupLayout GUID_BATTERY_DISCHARGE_LEVEL_3$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_DISCHARGE_LEVEL_3$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_DISCHARGE_LEVEL_3", constants$90.GUID_BATTERY_DISCHARGE_LEVEL_3$LAYOUT);
    static final  GroupLayout GUID_BATTERY_DISCHARGE_FLAGS_3$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_DISCHARGE_FLAGS_3$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_DISCHARGE_FLAGS_3", constants$90.GUID_BATTERY_DISCHARGE_FLAGS_3$LAYOUT);
    static final  GroupLayout GUID_PROCESSOR_SETTINGS_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_SETTINGS_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_SETTINGS_SUBGROUP", constants$90.GUID_PROCESSOR_SETTINGS_SUBGROUP$LAYOUT);
    static final  GroupLayout GUID_PROCESSOR_THROTTLE_POLICY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_THROTTLE_POLICY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_THROTTLE_POLICY", constants$90.GUID_PROCESSOR_THROTTLE_POLICY$LAYOUT);
}


