// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$417 {

    static final FunctionDescriptor EnumDesktopsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumDesktopsW$MH = RuntimeHelper.downcallHandle(
        "EnumDesktopsW",
        constants$417.EnumDesktopsW$FUNC
    );
    static final FunctionDescriptor EnumDesktopWindows$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumDesktopWindows$MH = RuntimeHelper.downcallHandle(
        "EnumDesktopWindows",
        constants$417.EnumDesktopWindows$FUNC
    );
    static final FunctionDescriptor SwitchDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SwitchDesktop$MH = RuntimeHelper.downcallHandle(
        "SwitchDesktop",
        constants$417.SwitchDesktop$FUNC
    );
    static final FunctionDescriptor SetThreadDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadDesktop$MH = RuntimeHelper.downcallHandle(
        "SetThreadDesktop",
        constants$417.SetThreadDesktop$FUNC
    );
    static final FunctionDescriptor CloseDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseDesktop$MH = RuntimeHelper.downcallHandle(
        "CloseDesktop",
        constants$417.CloseDesktop$FUNC
    );
    static final FunctionDescriptor GetThreadDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetThreadDesktop$MH = RuntimeHelper.downcallHandle(
        "GetThreadDesktop",
        constants$417.GetThreadDesktop$FUNC
    );
}


