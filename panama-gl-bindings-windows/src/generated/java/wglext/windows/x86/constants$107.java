// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$107 {

    static final  GroupLayout GUID_INTSTEER_MODE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_INTSTEER_MODE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_INTSTEER_MODE", constants$107.GUID_INTSTEER_MODE$LAYOUT);
    static final  GroupLayout GUID_INTSTEER_LOAD_PER_PROC_TRIGGER$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_INTSTEER_LOAD_PER_PROC_TRIGGER$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_INTSTEER_LOAD_PER_PROC_TRIGGER", constants$107.GUID_INTSTEER_LOAD_PER_PROC_TRIGGER$LAYOUT);
    static final  GroupLayout GUID_INTSTEER_TIME_UNPARK_TRIGGER$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_INTSTEER_TIME_UNPARK_TRIGGER$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_INTSTEER_TIME_UNPARK_TRIGGER", constants$107.GUID_INTSTEER_TIME_UNPARK_TRIGGER$LAYOUT);
    static final  GroupLayout GUID_GRAPHICS_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_GRAPHICS_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_GRAPHICS_SUBGROUP", constants$107.GUID_GRAPHICS_SUBGROUP$LAYOUT);
    static final  GroupLayout GUID_GPU_PREFERENCE_POLICY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_GPU_PREFERENCE_POLICY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_GPU_PREFERENCE_POLICY", constants$107.GUID_GPU_PREFERENCE_POLICY$LAYOUT);
    static final  GroupLayout GUID_MIXED_REALITY_MODE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_MIXED_REALITY_MODE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_MIXED_REALITY_MODE", constants$107.GUID_MIXED_REALITY_MODE$LAYOUT);
}


