// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$37 {

    static final FunctionDescriptor XGetErrorText$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XGetErrorText$MH = RuntimeHelper.downcallHandle(
        "XGetErrorText",
        constants$37.XGetErrorText$FUNC
    );
    static final FunctionDescriptor XGetFontProperty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetFontProperty$MH = RuntimeHelper.downcallHandle(
        "XGetFontProperty",
        constants$37.XGetFontProperty$FUNC
    );
    static final FunctionDescriptor XGetGCValues$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetGCValues$MH = RuntimeHelper.downcallHandle(
        "XGetGCValues",
        constants$37.XGetGCValues$FUNC
    );
    static final FunctionDescriptor XGetGeometry$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetGeometry$MH = RuntimeHelper.downcallHandle(
        "XGetGeometry",
        constants$37.XGetGeometry$FUNC
    );
    static final FunctionDescriptor XGetIconName$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetIconName$MH = RuntimeHelper.downcallHandle(
        "XGetIconName",
        constants$37.XGetIconName$FUNC
    );
    static final FunctionDescriptor XGetInputFocus$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetInputFocus$MH = RuntimeHelper.downcallHandle(
        "XGetInputFocus",
        constants$37.XGetInputFocus$FUNC
    );
}


