// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$39 {

    static final FunctionDescriptor XGetWindowAttributes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetWindowAttributes$MH = RuntimeHelper.downcallHandle(
        "XGetWindowAttributes",
        constants$39.XGetWindowAttributes$FUNC
    );
    static final FunctionDescriptor XGrabButton$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XGrabButton$MH = RuntimeHelper.downcallHandle(
        "XGrabButton",
        constants$39.XGrabButton$FUNC
    );
    static final FunctionDescriptor XGrabKey$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XGrabKey$MH = RuntimeHelper.downcallHandle(
        "XGrabKey",
        constants$39.XGrabKey$FUNC
    );
    static final FunctionDescriptor XGrabKeyboard$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XGrabKeyboard$MH = RuntimeHelper.downcallHandle(
        "XGrabKeyboard",
        constants$39.XGrabKeyboard$FUNC
    );
    static final FunctionDescriptor XGrabPointer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XGrabPointer$MH = RuntimeHelper.downcallHandle(
        "XGrabPointer",
        constants$39.XGrabPointer$FUNC
    );
    static final FunctionDescriptor XGrabServer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGrabServer$MH = RuntimeHelper.downcallHandle(
        "XGrabServer",
        constants$39.XGrabServer$FUNC
    );
}

