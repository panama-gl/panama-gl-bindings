// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$176 {

    static final FunctionDescriptor OpenWaitableTimerW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenWaitableTimerW$MH = RuntimeHelper.downcallHandle(
        "OpenWaitableTimerW",
        constants$176.OpenWaitableTimerW$FUNC
    );
    static final FunctionDescriptor SetWaitableTimerEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWaitableTimerEx$MH = RuntimeHelper.downcallHandle(
        "SetWaitableTimerEx",
        constants$176.SetWaitableTimerEx$FUNC
    );
    static final FunctionDescriptor SetWaitableTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWaitableTimer$MH = RuntimeHelper.downcallHandle(
        "SetWaitableTimer",
        constants$176.SetWaitableTimer$FUNC
    );
    static final FunctionDescriptor CancelWaitableTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CancelWaitableTimer$MH = RuntimeHelper.downcallHandle(
        "CancelWaitableTimer",
        constants$176.CancelWaitableTimer$FUNC
    );
    static final FunctionDescriptor CreateMutexExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateMutexExA$MH = RuntimeHelper.downcallHandle(
        "CreateMutexExA",
        constants$176.CreateMutexExA$FUNC
    );
    static final FunctionDescriptor CreateMutexExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateMutexExW$MH = RuntimeHelper.downcallHandle(
        "CreateMutexExW",
        constants$176.CreateMutexExW$FUNC
    );
}

