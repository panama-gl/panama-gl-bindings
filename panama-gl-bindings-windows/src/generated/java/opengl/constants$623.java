// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$623 {

    static final FunctionDescriptor QueryServiceStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryServiceStatus$MH = RuntimeHelper.downcallHandle(
        "QueryServiceStatus",
        constants$623.QueryServiceStatus$FUNC
    );
    static final FunctionDescriptor QueryServiceStatusEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryServiceStatusEx$MH = RuntimeHelper.downcallHandle(
        "QueryServiceStatusEx",
        constants$623.QueryServiceStatusEx$FUNC
    );
    static final FunctionDescriptor RegisterServiceCtrlHandlerA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterServiceCtrlHandlerA$MH = RuntimeHelper.downcallHandle(
        "RegisterServiceCtrlHandlerA",
        constants$623.RegisterServiceCtrlHandlerA$FUNC
    );
    static final FunctionDescriptor RegisterServiceCtrlHandlerW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterServiceCtrlHandlerW$MH = RuntimeHelper.downcallHandle(
        "RegisterServiceCtrlHandlerW",
        constants$623.RegisterServiceCtrlHandlerW$FUNC
    );
    static final FunctionDescriptor RegisterServiceCtrlHandlerExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterServiceCtrlHandlerExA$MH = RuntimeHelper.downcallHandle(
        "RegisterServiceCtrlHandlerExA",
        constants$623.RegisterServiceCtrlHandlerExA$FUNC
    );
    static final FunctionDescriptor RegisterServiceCtrlHandlerExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterServiceCtrlHandlerExW$MH = RuntimeHelper.downcallHandle(
        "RegisterServiceCtrlHandlerExW",
        constants$623.RegisterServiceCtrlHandlerExW$FUNC
    );
}


