// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$624 {

    static final FunctionDescriptor SetServiceObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetServiceObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "SetServiceObjectSecurity",
        constants$624.SetServiceObjectSecurity$FUNC
    );
    static final FunctionDescriptor SetServiceStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetServiceStatus$MH = RuntimeHelper.downcallHandle(
        "SetServiceStatus",
        constants$624.SetServiceStatus$FUNC
    );
    static final FunctionDescriptor StartServiceCtrlDispatcherA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StartServiceCtrlDispatcherA$MH = RuntimeHelper.downcallHandle(
        "StartServiceCtrlDispatcherA",
        constants$624.StartServiceCtrlDispatcherA$FUNC
    );
    static final FunctionDescriptor StartServiceCtrlDispatcherW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StartServiceCtrlDispatcherW$MH = RuntimeHelper.downcallHandle(
        "StartServiceCtrlDispatcherW",
        constants$624.StartServiceCtrlDispatcherW$FUNC
    );
    static final FunctionDescriptor StartServiceA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StartServiceA$MH = RuntimeHelper.downcallHandle(
        "StartServiceA",
        constants$624.StartServiceA$FUNC
    );
    static final FunctionDescriptor StartServiceW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle StartServiceW$MH = RuntimeHelper.downcallHandle(
        "StartServiceW",
        constants$624.StartServiceW$FUNC
    );
}


