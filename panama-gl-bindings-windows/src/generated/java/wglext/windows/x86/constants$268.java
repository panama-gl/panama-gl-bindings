// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$268 {

    static final FunctionDescriptor ClearCommError$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClearCommError$MH = RuntimeHelper.downcallHandle(
        "ClearCommError",
        constants$268.ClearCommError$FUNC
    );
    static final FunctionDescriptor SetupComm$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetupComm$MH = RuntimeHelper.downcallHandle(
        "SetupComm",
        constants$268.SetupComm$FUNC
    );
    static final FunctionDescriptor EscapeCommFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EscapeCommFunction$MH = RuntimeHelper.downcallHandle(
        "EscapeCommFunction",
        constants$268.EscapeCommFunction$FUNC
    );
    static final FunctionDescriptor GetCommConfig$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommConfig$MH = RuntimeHelper.downcallHandle(
        "GetCommConfig",
        constants$268.GetCommConfig$FUNC
    );
    static final FunctionDescriptor GetCommMask$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommMask$MH = RuntimeHelper.downcallHandle(
        "GetCommMask",
        constants$268.GetCommMask$FUNC
    );
    static final FunctionDescriptor GetCommProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommProperties$MH = RuntimeHelper.downcallHandle(
        "GetCommProperties",
        constants$268.GetCommProperties$FUNC
    );
}

