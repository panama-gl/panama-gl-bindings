// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$192 {

    static final FunctionDescriptor GetSystemInfo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemInfo$MH = RuntimeHelper.downcallHandle(
        "GetSystemInfo",
        constants$192.GetSystemInfo$FUNC
    );
    static final FunctionDescriptor GetSystemTime$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemTime$MH = RuntimeHelper.downcallHandle(
        "GetSystemTime",
        constants$192.GetSystemTime$FUNC
    );
    static final FunctionDescriptor GetSystemTimeAsFileTime$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemTimeAsFileTime$MH = RuntimeHelper.downcallHandle(
        "GetSystemTimeAsFileTime",
        constants$192.GetSystemTimeAsFileTime$FUNC
    );
    static final FunctionDescriptor GetLocalTime$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLocalTime$MH = RuntimeHelper.downcallHandle(
        "GetLocalTime",
        constants$192.GetLocalTime$FUNC
    );
    static final FunctionDescriptor IsUserCetAvailableInEnvironment$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsUserCetAvailableInEnvironment$MH = RuntimeHelper.downcallHandle(
        "IsUserCetAvailableInEnvironment",
        constants$192.IsUserCetAvailableInEnvironment$FUNC
    );
    static final FunctionDescriptor GetSystemLeapSecondInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemLeapSecondInformation$MH = RuntimeHelper.downcallHandle(
        "GetSystemLeapSecondInformation",
        constants$192.GetSystemLeapSecondInformation$FUNC
    );
}


