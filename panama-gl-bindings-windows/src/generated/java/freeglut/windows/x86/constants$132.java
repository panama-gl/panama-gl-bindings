// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$132 {

    static final FunctionDescriptor GetStdHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetStdHandle$MH = RuntimeHelper.downcallHandle(
        "GetStdHandle",
        constants$132.GetStdHandle$FUNC
    );
    static final FunctionDescriptor SetStdHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetStdHandle$MH = RuntimeHelper.downcallHandle(
        "SetStdHandle",
        constants$132.SetStdHandle$FUNC
    );
    static final FunctionDescriptor SetStdHandleEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetStdHandleEx$MH = RuntimeHelper.downcallHandle(
        "SetStdHandleEx",
        constants$132.SetStdHandleEx$FUNC
    );
    static final FunctionDescriptor GetCommandLineA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetCommandLineA$MH = RuntimeHelper.downcallHandle(
        "GetCommandLineA",
        constants$132.GetCommandLineA$FUNC
    );
    static final FunctionDescriptor GetCommandLineW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetCommandLineW$MH = RuntimeHelper.downcallHandle(
        "GetCommandLineW",
        constants$132.GetCommandLineW$FUNC
    );
    static final FunctionDescriptor GetEnvironmentStrings$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetEnvironmentStrings$MH = RuntimeHelper.downcallHandle(
        "GetEnvironmentStrings",
        constants$132.GetEnvironmentStrings$FUNC
    );
}


