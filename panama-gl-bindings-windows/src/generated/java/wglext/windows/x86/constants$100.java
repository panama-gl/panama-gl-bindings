// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$100 {

    static final  GroupLayout GUID_PROCESSOR_LATENCY_HINT_MIN_UNPARK_1$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_LATENCY_HINT_MIN_UNPARK_1$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_LATENCY_HINT_MIN_UNPARK_1", constants$100.GUID_PROCESSOR_LATENCY_HINT_MIN_UNPARK_1$LAYOUT);
    static final  GroupLayout GUID_PROCESSOR_DISTRIBUTE_UTILITY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_DISTRIBUTE_UTILITY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_DISTRIBUTE_UTILITY", constants$100.GUID_PROCESSOR_DISTRIBUTE_UTILITY$LAYOUT);
    static final  GroupLayout GUID_PROCESSOR_HETEROGENEOUS_POLICY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_HETEROGENEOUS_POLICY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_HETEROGENEOUS_POLICY", constants$100.GUID_PROCESSOR_HETEROGENEOUS_POLICY$LAYOUT);
    static final  GroupLayout GUID_PROCESSOR_HETERO_DECREASE_TIME$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_HETERO_DECREASE_TIME$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_HETERO_DECREASE_TIME", constants$100.GUID_PROCESSOR_HETERO_DECREASE_TIME$LAYOUT);
    static final  GroupLayout GUID_PROCESSOR_HETERO_INCREASE_TIME$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_HETERO_INCREASE_TIME$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_HETERO_INCREASE_TIME", constants$100.GUID_PROCESSOR_HETERO_INCREASE_TIME$LAYOUT);
    static final  GroupLayout GUID_PROCESSOR_HETERO_DECREASE_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_HETERO_DECREASE_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_HETERO_DECREASE_THRESHOLD", constants$100.GUID_PROCESSOR_HETERO_DECREASE_THRESHOLD$LAYOUT);
}


