// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$17 {

    static final FunctionDescriptor XEventMaskOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XEventMaskOfScreen$MH = RuntimeHelper.downcallHandle(
        "XEventMaskOfScreen",
        constants$17.XEventMaskOfScreen$FUNC
    );
    static final FunctionDescriptor XScreenNumberOfScreen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XScreenNumberOfScreen$MH = RuntimeHelper.downcallHandle(
        "XScreenNumberOfScreen",
        constants$17.XScreenNumberOfScreen$FUNC
    );
    static final FunctionDescriptor XErrorHandler$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XErrorHandler$MH = RuntimeHelper.downcallHandle(
        constants$17.XErrorHandler$FUNC
    );
    static final FunctionDescriptor XSetErrorHandler$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XSetErrorHandler$MH = RuntimeHelper.downcallHandle(
        "XSetErrorHandler",
        constants$17.XSetErrorHandler$FUNC
    );
    static final FunctionDescriptor XIOErrorHandler$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


