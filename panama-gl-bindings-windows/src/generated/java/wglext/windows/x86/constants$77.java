// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$77 {

    static final  GroupLayout GUID_VIDEO_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_SUBGROUP", constants$77.GUID_VIDEO_SUBGROUP$LAYOUT);
    static final  GroupLayout GUID_VIDEO_POWERDOWN_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_POWERDOWN_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_POWERDOWN_TIMEOUT", constants$77.GUID_VIDEO_POWERDOWN_TIMEOUT$LAYOUT);
    static final  GroupLayout GUID_VIDEO_ANNOYANCE_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_ANNOYANCE_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_ANNOYANCE_TIMEOUT", constants$77.GUID_VIDEO_ANNOYANCE_TIMEOUT$LAYOUT);
    static final  GroupLayout GUID_VIDEO_ADAPTIVE_PERCENT_INCREASE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_ADAPTIVE_PERCENT_INCREASE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_ADAPTIVE_PERCENT_INCREASE", constants$77.GUID_VIDEO_ADAPTIVE_PERCENT_INCREASE$LAYOUT);
    static final  GroupLayout GUID_VIDEO_DIM_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_DIM_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_DIM_TIMEOUT", constants$77.GUID_VIDEO_DIM_TIMEOUT$LAYOUT);
    static final  GroupLayout GUID_VIDEO_ADAPTIVE_POWERDOWN$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_ADAPTIVE_POWERDOWN$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_ADAPTIVE_POWERDOWN", constants$77.GUID_VIDEO_ADAPTIVE_POWERDOWN$LAYOUT);
}

