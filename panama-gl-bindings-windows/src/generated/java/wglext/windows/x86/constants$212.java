// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$212 {

    static final FunctionDescriptor DeleteTimerQueueTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteTimerQueueTimer$MH = RuntimeHelper.downcallHandle(
        "DeleteTimerQueueTimer",
        constants$212.DeleteTimerQueueTimer$FUNC
    );
    static final FunctionDescriptor DeleteTimerQueueEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteTimerQueueEx$MH = RuntimeHelper.downcallHandle(
        "DeleteTimerQueueEx",
        constants$212.DeleteTimerQueueEx$FUNC
    );
    static final FunctionDescriptor PTP_WIN32_IO_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_WIN32_IO_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$212.PTP_WIN32_IO_CALLBACK$FUNC
    );
    static final FunctionDescriptor CreateThreadpool$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateThreadpool$MH = RuntimeHelper.downcallHandle(
        "CreateThreadpool",
        constants$212.CreateThreadpool$FUNC
    );
    static final FunctionDescriptor SetThreadpoolThreadMaximum$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadpoolThreadMaximum$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolThreadMaximum",
        constants$212.SetThreadpoolThreadMaximum$FUNC
    );
}


