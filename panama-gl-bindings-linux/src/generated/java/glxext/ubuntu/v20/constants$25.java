// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$25 {

    static final FunctionDescriptor XCheckMaskEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCheckMaskEvent$MH = RuntimeHelper.downcallHandle(
        "XCheckMaskEvent",
        constants$25.XCheckMaskEvent$FUNC
    );
    static final FunctionDescriptor XCheckTypedEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCheckTypedEvent$MH = RuntimeHelper.downcallHandle(
        "XCheckTypedEvent",
        constants$25.XCheckTypedEvent$FUNC
    );
    static final FunctionDescriptor XCheckTypedWindowEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCheckTypedWindowEvent$MH = RuntimeHelper.downcallHandle(
        "XCheckTypedWindowEvent",
        constants$25.XCheckTypedWindowEvent$FUNC
    );
    static final FunctionDescriptor XCheckWindowEvent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCheckWindowEvent$MH = RuntimeHelper.downcallHandle(
        "XCheckWindowEvent",
        constants$25.XCheckWindowEvent$FUNC
    );
    static final FunctionDescriptor XCirculateSubwindows$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle XCirculateSubwindows$MH = RuntimeHelper.downcallHandle(
        "XCirculateSubwindows",
        constants$25.XCirculateSubwindows$FUNC
    );
    static final FunctionDescriptor XCirculateSubwindowsDown$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle XCirculateSubwindowsDown$MH = RuntimeHelper.downcallHandle(
        "XCirculateSubwindowsDown",
        constants$25.XCirculateSubwindowsDown$FUNC
    );
}

