// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$78 {

    static final  GroupLayout GUID_ACTIVE_POWERSCHEME$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ACTIVE_POWERSCHEME$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ACTIVE_POWERSCHEME", constants$78.GUID_ACTIVE_POWERSCHEME$LAYOUT);
    static final  GroupLayout GUID_IDLE_RESILIENCY_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_IDLE_RESILIENCY_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_IDLE_RESILIENCY_SUBGROUP", constants$78.GUID_IDLE_RESILIENCY_SUBGROUP$LAYOUT);
    static final  GroupLayout GUID_IDLE_RESILIENCY_PERIOD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_IDLE_RESILIENCY_PERIOD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_IDLE_RESILIENCY_PERIOD", constants$78.GUID_IDLE_RESILIENCY_PERIOD$LAYOUT);
    static final  GroupLayout GUID_DEEP_SLEEP_ENABLED$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEEP_SLEEP_ENABLED$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEEP_SLEEP_ENABLED", constants$78.GUID_DEEP_SLEEP_ENABLED$LAYOUT);
    static final  GroupLayout GUID_DEEP_SLEEP_PLATFORM_STATE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEEP_SLEEP_PLATFORM_STATE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEEP_SLEEP_PLATFORM_STATE", constants$78.GUID_DEEP_SLEEP_PLATFORM_STATE$LAYOUT);
    static final  GroupLayout GUID_DISK_COALESCING_POWERDOWN_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISK_COALESCING_POWERDOWN_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISK_COALESCING_POWERDOWN_TIMEOUT", constants$78.GUID_DISK_COALESCING_POWERDOWN_TIMEOUT$LAYOUT);
}


