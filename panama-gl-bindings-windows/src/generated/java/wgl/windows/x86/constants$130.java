// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$130 {

    static final FunctionDescriptor GetEnvironmentStringsW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetEnvironmentStringsW$MH = RuntimeHelper.downcallHandle(
        "GetEnvironmentStringsW",
        constants$130.GetEnvironmentStringsW$FUNC
    );
    static final FunctionDescriptor FreeEnvironmentStringsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeEnvironmentStringsA$MH = RuntimeHelper.downcallHandle(
        "FreeEnvironmentStringsA",
        constants$130.FreeEnvironmentStringsA$FUNC
    );
    static final FunctionDescriptor FreeEnvironmentStringsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeEnvironmentStringsW$MH = RuntimeHelper.downcallHandle(
        "FreeEnvironmentStringsW",
        constants$130.FreeEnvironmentStringsW$FUNC
    );
    static final FunctionDescriptor GetEnvironmentVariableA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetEnvironmentVariableA$MH = RuntimeHelper.downcallHandle(
        "GetEnvironmentVariableA",
        constants$130.GetEnvironmentVariableA$FUNC
    );
    static final FunctionDescriptor GetEnvironmentVariableW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetEnvironmentVariableW$MH = RuntimeHelper.downcallHandle(
        "GetEnvironmentVariableW",
        constants$130.GetEnvironmentVariableW$FUNC
    );
    static final FunctionDescriptor SetEnvironmentVariableA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEnvironmentVariableA$MH = RuntimeHelper.downcallHandle(
        "SetEnvironmentVariableA",
        constants$130.SetEnvironmentVariableA$FUNC
    );
}


