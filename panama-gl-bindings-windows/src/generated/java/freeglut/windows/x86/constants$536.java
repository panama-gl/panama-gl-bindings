// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$536 {

    static final FunctionDescriptor GetGestureExtraArgs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetGestureExtraArgs$MH = RuntimeHelper.downcallHandle(
        "GetGestureExtraArgs",
        constants$536.GetGestureExtraArgs$FUNC
    );
    static final FunctionDescriptor CloseGestureInfoHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseGestureInfoHandle$MH = RuntimeHelper.downcallHandle(
        "CloseGestureInfoHandle",
        constants$536.CloseGestureInfoHandle$FUNC
    );
    static final FunctionDescriptor SetGestureConfig$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetGestureConfig$MH = RuntimeHelper.downcallHandle(
        "SetGestureConfig",
        constants$536.SetGestureConfig$FUNC
    );
    static final FunctionDescriptor GetGestureConfig$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetGestureConfig$MH = RuntimeHelper.downcallHandle(
        "GetGestureConfig",
        constants$536.GetGestureConfig$FUNC
    );
    static final FunctionDescriptor ShutdownBlockReasonCreate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ShutdownBlockReasonCreate$MH = RuntimeHelper.downcallHandle(
        "ShutdownBlockReasonCreate",
        constants$536.ShutdownBlockReasonCreate$FUNC
    );
    static final FunctionDescriptor ShutdownBlockReasonQuery$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ShutdownBlockReasonQuery$MH = RuntimeHelper.downcallHandle(
        "ShutdownBlockReasonQuery",
        constants$536.ShutdownBlockReasonQuery$FUNC
    );
}

