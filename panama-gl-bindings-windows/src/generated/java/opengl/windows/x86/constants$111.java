// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$111 {

    static final  GroupLayout PPM_PERFSTATE_DOMAIN_CHANGE_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment PPM_PERFSTATE_DOMAIN_CHANGE_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("PPM_PERFSTATE_DOMAIN_CHANGE_GUID", constants$111.PPM_PERFSTATE_DOMAIN_CHANGE_GUID$LAYOUT);
    static final  GroupLayout PPM_IDLESTATE_CHANGE_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment PPM_IDLESTATE_CHANGE_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("PPM_IDLESTATE_CHANGE_GUID", constants$111.PPM_IDLESTATE_CHANGE_GUID$LAYOUT);
    static final  GroupLayout PPM_PERFSTATES_DATA_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment PPM_PERFSTATES_DATA_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("PPM_PERFSTATES_DATA_GUID", constants$111.PPM_PERFSTATES_DATA_GUID$LAYOUT);
    static final  GroupLayout PPM_IDLESTATES_DATA_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment PPM_IDLESTATES_DATA_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("PPM_IDLESTATES_DATA_GUID", constants$111.PPM_IDLESTATES_DATA_GUID$LAYOUT);
    static final  GroupLayout PPM_IDLE_ACCOUNTING_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment PPM_IDLE_ACCOUNTING_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("PPM_IDLE_ACCOUNTING_GUID", constants$111.PPM_IDLE_ACCOUNTING_GUID$LAYOUT);
    static final  GroupLayout PPM_IDLE_ACCOUNTING_EX_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment PPM_IDLE_ACCOUNTING_EX_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("PPM_IDLE_ACCOUNTING_EX_GUID", constants$111.PPM_IDLE_ACCOUNTING_EX_GUID$LAYOUT);
}


