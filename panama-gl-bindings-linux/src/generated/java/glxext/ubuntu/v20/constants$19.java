// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$19 {

    static final FunctionDescriptor XSetWMProtocols$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XSetWMProtocols$MH = RuntimeHelper.downcallHandle(
        "XSetWMProtocols",
        constants$19.XSetWMProtocols$FUNC
    );
    static final FunctionDescriptor XIconifyWindow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XIconifyWindow$MH = RuntimeHelper.downcallHandle(
        "XIconifyWindow",
        constants$19.XIconifyWindow$FUNC
    );
    static final FunctionDescriptor XWithdrawWindow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XWithdrawWindow$MH = RuntimeHelper.downcallHandle(
        "XWithdrawWindow",
        constants$19.XWithdrawWindow$FUNC
    );
    static final FunctionDescriptor XGetCommand$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetCommand$MH = RuntimeHelper.downcallHandle(
        "XGetCommand",
        constants$19.XGetCommand$FUNC
    );
    static final FunctionDescriptor XGetWMColormapWindows$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetWMColormapWindows$MH = RuntimeHelper.downcallHandle(
        "XGetWMColormapWindows",
        constants$19.XGetWMColormapWindows$FUNC
    );
    static final FunctionDescriptor XSetWMColormapWindows$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XSetWMColormapWindows$MH = RuntimeHelper.downcallHandle(
        "XSetWMColormapWindows",
        constants$19.XSetWMColormapWindows$FUNC
    );
}


