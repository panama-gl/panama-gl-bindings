// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$197 {

    static final FunctionDescriptor GetLocalTime$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLocalTime$MH = RuntimeHelper.downcallHandle(
        "GetLocalTime",
        constants$197.GetLocalTime$FUNC
    );
    static final FunctionDescriptor IsUserCetAvailableInEnvironment$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsUserCetAvailableInEnvironment$MH = RuntimeHelper.downcallHandle(
        "IsUserCetAvailableInEnvironment",
        constants$197.IsUserCetAvailableInEnvironment$FUNC
    );
    static final FunctionDescriptor GetSystemLeapSecondInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemLeapSecondInformation$MH = RuntimeHelper.downcallHandle(
        "GetSystemLeapSecondInformation",
        constants$197.GetSystemLeapSecondInformation$FUNC
    );
    static final FunctionDescriptor GetVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetVersion$MH = RuntimeHelper.downcallHandle(
        "GetVersion",
        constants$197.GetVersion$FUNC
    );
    static final FunctionDescriptor SetLocalTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetLocalTime$MH = RuntimeHelper.downcallHandle(
        "SetLocalTime",
        constants$197.SetLocalTime$FUNC
    );
    static final FunctionDescriptor GetTickCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetTickCount$MH = RuntimeHelper.downcallHandle(
        "GetTickCount",
        constants$197.GetTickCount$FUNC
    );
}


