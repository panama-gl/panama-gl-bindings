// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$177 {

    static final FunctionDescriptor QueueUserAPC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle QueueUserAPC$MH = RuntimeHelper.downcallHandle(
        "QueueUserAPC",
        constants$177.QueueUserAPC$FUNC
    );
    static final FunctionDescriptor GetProcessTimes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessTimes$MH = RuntimeHelper.downcallHandle(
        "GetProcessTimes",
        constants$177.GetProcessTimes$FUNC
    );
    static final FunctionDescriptor GetCurrentProcess$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetCurrentProcess$MH = RuntimeHelper.downcallHandle(
        "GetCurrentProcess",
        constants$177.GetCurrentProcess$FUNC
    );
    static final FunctionDescriptor GetCurrentProcessId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetCurrentProcessId$MH = RuntimeHelper.downcallHandle(
        "GetCurrentProcessId",
        constants$177.GetCurrentProcessId$FUNC
    );
    static final FunctionDescriptor ExitProcess$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExitProcess$MH = RuntimeHelper.downcallHandle(
        "ExitProcess",
        constants$177.ExitProcess$FUNC
    );
    static final FunctionDescriptor TerminateProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TerminateProcess$MH = RuntimeHelper.downcallHandle(
        "TerminateProcess",
        constants$177.TerminateProcess$FUNC
    );
}

