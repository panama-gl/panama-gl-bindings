// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$104 {

    static final  GroupLayout GUID_LOCK_CONSOLE_ON_WAKE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_LOCK_CONSOLE_ON_WAKE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_LOCK_CONSOLE_ON_WAKE", constants$104.GUID_LOCK_CONSOLE_ON_WAKE$LAYOUT);
    static final  GroupLayout GUID_DEVICE_IDLE_POLICY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVICE_IDLE_POLICY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEVICE_IDLE_POLICY", constants$104.GUID_DEVICE_IDLE_POLICY$LAYOUT);
    static final  GroupLayout GUID_CONNECTIVITY_IN_STANDBY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_CONNECTIVITY_IN_STANDBY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_CONNECTIVITY_IN_STANDBY", constants$104.GUID_CONNECTIVITY_IN_STANDBY$LAYOUT);
    static final  GroupLayout GUID_DISCONNECTED_STANDBY_MODE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISCONNECTED_STANDBY_MODE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISCONNECTED_STANDBY_MODE", constants$104.GUID_DISCONNECTED_STANDBY_MODE$LAYOUT);
    static final  GroupLayout GUID_ACDC_POWER_SOURCE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ACDC_POWER_SOURCE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ACDC_POWER_SOURCE", constants$104.GUID_ACDC_POWER_SOURCE$LAYOUT);
    static final  GroupLayout GUID_LIDSWITCH_STATE_CHANGE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_LIDSWITCH_STATE_CHANGE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_LIDSWITCH_STATE_CHANGE", constants$104.GUID_LIDSWITCH_STATE_CHANGE$LAYOUT);
}

