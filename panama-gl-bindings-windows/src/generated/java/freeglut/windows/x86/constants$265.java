// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$265 {

    static final FunctionDescriptor SetEnvironmentStringsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEnvironmentStringsA$MH = RuntimeHelper.downcallHandle(
        "SetEnvironmentStringsA",
        constants$265.SetEnvironmentStringsA$FUNC
    );
    static final FunctionDescriptor SwitchToFiber$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SwitchToFiber$MH = RuntimeHelper.downcallHandle(
        "SwitchToFiber",
        constants$265.SwitchToFiber$FUNC
    );
    static final FunctionDescriptor DeleteFiber$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteFiber$MH = RuntimeHelper.downcallHandle(
        "DeleteFiber",
        constants$265.DeleteFiber$FUNC
    );
    static final FunctionDescriptor ConvertFiberToThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle ConvertFiberToThread$MH = RuntimeHelper.downcallHandle(
        "ConvertFiberToThread",
        constants$265.ConvertFiberToThread$FUNC
    );
    static final FunctionDescriptor CreateFiberEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFiberEx$MH = RuntimeHelper.downcallHandle(
        "CreateFiberEx",
        constants$265.CreateFiberEx$FUNC
    );
    static final FunctionDescriptor ConvertThreadToFiberEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ConvertThreadToFiberEx$MH = RuntimeHelper.downcallHandle(
        "ConvertThreadToFiberEx",
        constants$265.ConvertThreadToFiberEx$FUNC
    );
}


