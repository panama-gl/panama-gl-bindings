// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$38 {

    static final FunctionDescriptor XGetKeyboardControl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetKeyboardControl$MH = RuntimeHelper.downcallHandle(
        "XGetKeyboardControl",
        constants$38.XGetKeyboardControl$FUNC
    );
    static final FunctionDescriptor XGetPointerControl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetPointerControl$MH = RuntimeHelper.downcallHandle(
        "XGetPointerControl",
        constants$38.XGetPointerControl$FUNC
    );
    static final FunctionDescriptor XGetPointerMapping$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XGetPointerMapping$MH = RuntimeHelper.downcallHandle(
        "XGetPointerMapping",
        constants$38.XGetPointerMapping$FUNC
    );
    static final FunctionDescriptor XGetScreenSaver$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetScreenSaver$MH = RuntimeHelper.downcallHandle(
        "XGetScreenSaver",
        constants$38.XGetScreenSaver$FUNC
    );
    static final FunctionDescriptor XGetTransientForHint$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetTransientForHint$MH = RuntimeHelper.downcallHandle(
        "XGetTransientForHint",
        constants$38.XGetTransientForHint$FUNC
    );
    static final FunctionDescriptor XGetWindowProperty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetWindowProperty$MH = RuntimeHelper.downcallHandle(
        "XGetWindowProperty",
        constants$38.XGetWindowProperty$FUNC
    );
}


