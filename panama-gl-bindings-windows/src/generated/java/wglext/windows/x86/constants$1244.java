// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1244 {

    static final FunctionDescriptor RegisterActiveObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterActiveObject$MH = RuntimeHelper.downcallHandle(
        "RegisterActiveObject",
        constants$1244.RegisterActiveObject$FUNC
    );
    static final FunctionDescriptor RevokeActiveObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RevokeActiveObject$MH = RuntimeHelper.downcallHandle(
        "RevokeActiveObject",
        constants$1244.RevokeActiveObject$FUNC
    );
    static final FunctionDescriptor GetActiveObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetActiveObject$MH = RuntimeHelper.downcallHandle(
        "GetActiveObject",
        constants$1244.GetActiveObject$FUNC
    );
    static final FunctionDescriptor SetErrorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetErrorInfo$MH = RuntimeHelper.downcallHandle(
        "SetErrorInfo",
        constants$1244.SetErrorInfo$FUNC
    );
    static final FunctionDescriptor GetErrorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetErrorInfo$MH = RuntimeHelper.downcallHandle(
        "GetErrorInfo",
        constants$1244.GetErrorInfo$FUNC
    );
    static final FunctionDescriptor CreateErrorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateErrorInfo$MH = RuntimeHelper.downcallHandle(
        "CreateErrorInfo",
        constants$1244.CreateErrorInfo$FUNC
    );
}


