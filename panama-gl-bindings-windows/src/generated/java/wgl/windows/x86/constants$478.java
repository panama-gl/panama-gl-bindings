// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$478 {

    static final FunctionDescriptor GetTabbedTextExtentW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTabbedTextExtentW$MH = RuntimeHelper.downcallHandle(
        "GetTabbedTextExtentW",
        constants$478.GetTabbedTextExtentW$FUNC
    );
    static final FunctionDescriptor UpdateWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UpdateWindow$MH = RuntimeHelper.downcallHandle(
        "UpdateWindow",
        constants$478.UpdateWindow$FUNC
    );
    static final FunctionDescriptor SetActiveWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetActiveWindow$MH = RuntimeHelper.downcallHandle(
        "SetActiveWindow",
        constants$478.SetActiveWindow$FUNC
    );
    static final FunctionDescriptor GetForegroundWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetForegroundWindow$MH = RuntimeHelper.downcallHandle(
        "GetForegroundWindow",
        constants$478.GetForegroundWindow$FUNC
    );
    static final FunctionDescriptor PaintDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PaintDesktop$MH = RuntimeHelper.downcallHandle(
        "PaintDesktop",
        constants$478.PaintDesktop$FUNC
    );
    static final FunctionDescriptor SwitchToThisWindow$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SwitchToThisWindow$MH = RuntimeHelper.downcallHandle(
        "SwitchToThisWindow",
        constants$478.SwitchToThisWindow$FUNC
    );
}

