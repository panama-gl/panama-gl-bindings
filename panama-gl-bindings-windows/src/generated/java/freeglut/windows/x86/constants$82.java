// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$82 {

    static final  GroupLayout GUID_ADAPTIVE_INPUT_CONTROLLER_STATE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ADAPTIVE_INPUT_CONTROLLER_STATE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ADAPTIVE_INPUT_CONTROLLER_STATE", constants$82.GUID_ADAPTIVE_INPUT_CONTROLLER_STATE$LAYOUT);
    static final  GroupLayout GUID_DISK_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISK_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISK_SUBGROUP", constants$82.GUID_DISK_SUBGROUP$LAYOUT);
    static final  GroupLayout GUID_DISK_MAX_POWER$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISK_MAX_POWER$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISK_MAX_POWER", constants$82.GUID_DISK_MAX_POWER$LAYOUT);
    static final  GroupLayout GUID_DISK_POWERDOWN_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISK_POWERDOWN_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISK_POWERDOWN_TIMEOUT", constants$82.GUID_DISK_POWERDOWN_TIMEOUT$LAYOUT);
    static final  GroupLayout GUID_DISK_IDLE_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISK_IDLE_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISK_IDLE_TIMEOUT", constants$82.GUID_DISK_IDLE_TIMEOUT$LAYOUT);
    static final  GroupLayout GUID_DISK_BURST_IGNORE_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISK_BURST_IGNORE_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISK_BURST_IGNORE_THRESHOLD", constants$82.GUID_DISK_BURST_IGNORE_THRESHOLD$LAYOUT);
}


