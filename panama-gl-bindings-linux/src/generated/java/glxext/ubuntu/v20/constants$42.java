// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$42 {

    static final FunctionDescriptor XMapSubwindows$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XMapSubwindows$MH = RuntimeHelper.downcallHandle(
        "XMapSubwindows",
        constants$42.XMapSubwindows$FUNC
    );
    static final FunctionDescriptor XMapWindow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XMapWindow$MH = RuntimeHelper.downcallHandle(
        "XMapWindow",
        constants$42.XMapWindow$FUNC
    );
    static final FunctionDescriptor XMaskEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XMaskEvent$MH = RuntimeHelper.downcallHandle(
        "XMaskEvent",
        constants$42.XMaskEvent$FUNC
    );
    static final FunctionDescriptor XMaxCmapsOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XMaxCmapsOfScreen$MH = RuntimeHelper.downcallHandle(
        "XMaxCmapsOfScreen",
        constants$42.XMaxCmapsOfScreen$FUNC
    );
    static final FunctionDescriptor XMinCmapsOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XMinCmapsOfScreen$MH = RuntimeHelper.downcallHandle(
        "XMinCmapsOfScreen",
        constants$42.XMinCmapsOfScreen$FUNC
    );
    static final FunctionDescriptor XMoveResizeWindow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XMoveResizeWindow$MH = RuntimeHelper.downcallHandle(
        "XMoveResizeWindow",
        constants$42.XMoveResizeWindow$FUNC
    );
}

