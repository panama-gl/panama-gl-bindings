// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$222 {

    static final FunctionDescriptor IsThreadpoolTimerSet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsThreadpoolTimerSet$MH = RuntimeHelper.downcallHandle(
        "IsThreadpoolTimerSet",
        constants$222.IsThreadpoolTimerSet$FUNC
    );
    static final FunctionDescriptor WaitForThreadpoolTimerCallbacks$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForThreadpoolTimerCallbacks$MH = RuntimeHelper.downcallHandle(
        "WaitForThreadpoolTimerCallbacks",
        constants$222.WaitForThreadpoolTimerCallbacks$FUNC
    );
    static final FunctionDescriptor CloseThreadpoolTimer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseThreadpoolTimer$MH = RuntimeHelper.downcallHandle(
        "CloseThreadpoolTimer",
        constants$222.CloseThreadpoolTimer$FUNC
    );
    static final FunctionDescriptor CreateThreadpoolWait$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateThreadpoolWait$MH = RuntimeHelper.downcallHandle(
        "CreateThreadpoolWait",
        constants$222.CreateThreadpoolWait$FUNC
    );
    static final FunctionDescriptor SetThreadpoolWait$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadpoolWait$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolWait",
        constants$222.SetThreadpoolWait$FUNC
    );
    static final FunctionDescriptor WaitForThreadpoolWaitCallbacks$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForThreadpoolWaitCallbacks$MH = RuntimeHelper.downcallHandle(
        "WaitForThreadpoolWaitCallbacks",
        constants$222.WaitForThreadpoolWaitCallbacks$FUNC
    );
}


