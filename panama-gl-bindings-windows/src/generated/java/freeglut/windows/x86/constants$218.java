// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$218 {

    static final FunctionDescriptor PTP_WIN32_IO_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_WIN32_IO_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$218.PTP_WIN32_IO_CALLBACK$FUNC
    );
    static final FunctionDescriptor CreateThreadpool$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateThreadpool$MH = RuntimeHelper.downcallHandle(
        "CreateThreadpool",
        constants$218.CreateThreadpool$FUNC
    );
    static final FunctionDescriptor SetThreadpoolThreadMaximum$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadpoolThreadMaximum$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolThreadMaximum",
        constants$218.SetThreadpoolThreadMaximum$FUNC
    );
    static final FunctionDescriptor SetThreadpoolThreadMinimum$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadpoolThreadMinimum$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolThreadMinimum",
        constants$218.SetThreadpoolThreadMinimum$FUNC
    );
    static final FunctionDescriptor SetThreadpoolStackInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadpoolStackInformation$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolStackInformation",
        constants$218.SetThreadpoolStackInformation$FUNC
    );
    static final FunctionDescriptor QueryThreadpoolStackInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryThreadpoolStackInformation$MH = RuntimeHelper.downcallHandle(
        "QueryThreadpoolStackInformation",
        constants$218.QueryThreadpoolStackInformation$FUNC
    );
}

