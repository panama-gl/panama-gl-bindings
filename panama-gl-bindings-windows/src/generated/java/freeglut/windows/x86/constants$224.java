// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$224 {

    static final FunctionDescriptor SetThreadpoolTimerEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadpoolTimerEx$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolTimerEx",
        constants$224.SetThreadpoolTimerEx$FUNC
    );
    static final FunctionDescriptor SetThreadpoolWaitEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadpoolWaitEx$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolWaitEx",
        constants$224.SetThreadpoolWaitEx$FUNC
    );
    static final FunctionDescriptor IsProcessInJob$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsProcessInJob$MH = RuntimeHelper.downcallHandle(
        "IsProcessInJob",
        constants$224.IsProcessInJob$FUNC
    );
    static final FunctionDescriptor CreateJobObjectW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateJobObjectW$MH = RuntimeHelper.downcallHandle(
        "CreateJobObjectW",
        constants$224.CreateJobObjectW$FUNC
    );
    static final FunctionDescriptor FreeMemoryJobObject$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeMemoryJobObject$MH = RuntimeHelper.downcallHandle(
        "FreeMemoryJobObject",
        constants$224.FreeMemoryJobObject$FUNC
    );
    static final FunctionDescriptor OpenJobObjectW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenJobObjectW$MH = RuntimeHelper.downcallHandle(
        "OpenJobObjectW",
        constants$224.OpenJobObjectW$FUNC
    );
}

