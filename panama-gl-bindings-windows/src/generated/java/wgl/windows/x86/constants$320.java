// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$320 {

    static final FunctionDescriptor IsTokenUntrusted$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsTokenUntrusted$MH = RuntimeHelper.downcallHandle(
        "IsTokenUntrusted",
        constants$320.IsTokenUntrusted$FUNC
    );
    static final FunctionDescriptor RegisterWaitForSingleObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterWaitForSingleObject$MH = RuntimeHelper.downcallHandle(
        "RegisterWaitForSingleObject",
        constants$320.RegisterWaitForSingleObject$FUNC
    );
    static final FunctionDescriptor UnregisterWait$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterWait$MH = RuntimeHelper.downcallHandle(
        "UnregisterWait",
        constants$320.UnregisterWait$FUNC
    );
    static final FunctionDescriptor BindIoCompletionCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BindIoCompletionCallback$MH = RuntimeHelper.downcallHandle(
        "BindIoCompletionCallback",
        constants$320.BindIoCompletionCallback$FUNC
    );
    static final FunctionDescriptor SetTimerQueueTimer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetTimerQueueTimer$MH = RuntimeHelper.downcallHandle(
        "SetTimerQueueTimer",
        constants$320.SetTimerQueueTimer$FUNC
    );
    static final FunctionDescriptor CancelTimerQueueTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CancelTimerQueueTimer$MH = RuntimeHelper.downcallHandle(
        "CancelTimerQueueTimer",
        constants$320.CancelTimerQueueTimer$FUNC
    );
}


