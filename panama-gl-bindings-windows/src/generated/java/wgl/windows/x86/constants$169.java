// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$169 {

    static final FunctionDescriptor WakeAllConditionVariable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WakeAllConditionVariable$MH = RuntimeHelper.downcallHandle(
        "WakeAllConditionVariable",
        constants$169.WakeAllConditionVariable$FUNC
    );
    static final FunctionDescriptor SleepConditionVariableCS$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SleepConditionVariableCS$MH = RuntimeHelper.downcallHandle(
        "SleepConditionVariableCS",
        constants$169.SleepConditionVariableCS$FUNC
    );
    static final FunctionDescriptor SleepConditionVariableSRW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SleepConditionVariableSRW$MH = RuntimeHelper.downcallHandle(
        "SleepConditionVariableSRW",
        constants$169.SleepConditionVariableSRW$FUNC
    );
    static final FunctionDescriptor SetEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEvent$MH = RuntimeHelper.downcallHandle(
        "SetEvent",
        constants$169.SetEvent$FUNC
    );
    static final FunctionDescriptor ResetEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ResetEvent$MH = RuntimeHelper.downcallHandle(
        "ResetEvent",
        constants$169.ResetEvent$FUNC
    );
    static final FunctionDescriptor ReleaseSemaphore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseSemaphore$MH = RuntimeHelper.downcallHandle(
        "ReleaseSemaphore",
        constants$169.ReleaseSemaphore$FUNC
    );
}


