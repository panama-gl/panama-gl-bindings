// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$175 {

    static final FunctionDescriptor WakeByAddressSingle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WakeByAddressSingle$MH = RuntimeHelper.downcallHandle(
        "WakeByAddressSingle",
        constants$175.WakeByAddressSingle$FUNC
    );
    static final FunctionDescriptor WakeByAddressAll$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WakeByAddressAll$MH = RuntimeHelper.downcallHandle(
        "WakeByAddressAll",
        constants$175.WakeByAddressAll$FUNC
    );
    static final FunctionDescriptor SignalObjectAndWait$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SignalObjectAndWait$MH = RuntimeHelper.downcallHandle(
        "SignalObjectAndWait",
        constants$175.SignalObjectAndWait$FUNC
    );
    static final FunctionDescriptor WaitForMultipleObjects$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForMultipleObjects$MH = RuntimeHelper.downcallHandle(
        "WaitForMultipleObjects",
        constants$175.WaitForMultipleObjects$FUNC
    );
    static final FunctionDescriptor CreateSemaphoreW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateSemaphoreW$MH = RuntimeHelper.downcallHandle(
        "CreateSemaphoreW",
        constants$175.CreateSemaphoreW$FUNC
    );
    static final FunctionDescriptor CreateWaitableTimerW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateWaitableTimerW$MH = RuntimeHelper.downcallHandle(
        "CreateWaitableTimerW",
        constants$175.CreateWaitableTimerW$FUNC
    );
}

