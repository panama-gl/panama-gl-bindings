// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$96 {

    static final  GroupLayout GUID_PROCESSOR_IDLE_DISABLE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_IDLE_DISABLE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_IDLE_DISABLE", constants$96.GUID_PROCESSOR_IDLE_DISABLE$LAYOUT);
    static final  GroupLayout GUID_PROCESSOR_IDLE_STATE_MAXIMUM$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_IDLE_STATE_MAXIMUM$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_IDLE_STATE_MAXIMUM", constants$96.GUID_PROCESSOR_IDLE_STATE_MAXIMUM$LAYOUT);
    static final  GroupLayout GUID_PROCESSOR_IDLE_TIME_CHECK$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_IDLE_TIME_CHECK$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_IDLE_TIME_CHECK", constants$96.GUID_PROCESSOR_IDLE_TIME_CHECK$LAYOUT);
    static final  GroupLayout GUID_PROCESSOR_IDLE_DEMOTE_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_IDLE_DEMOTE_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_IDLE_DEMOTE_THRESHOLD", constants$96.GUID_PROCESSOR_IDLE_DEMOTE_THRESHOLD$LAYOUT);
    static final  GroupLayout GUID_PROCESSOR_IDLE_PROMOTE_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_IDLE_PROMOTE_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_IDLE_PROMOTE_THRESHOLD", constants$96.GUID_PROCESSOR_IDLE_PROMOTE_THRESHOLD$LAYOUT);
    static final  GroupLayout GUID_PROCESSOR_CORE_PARKING_INCREASE_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_CORE_PARKING_INCREASE_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_CORE_PARKING_INCREASE_THRESHOLD", constants$96.GUID_PROCESSOR_CORE_PARKING_INCREASE_THRESHOLD$LAYOUT);
}

