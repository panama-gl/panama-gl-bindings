// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$423 {

    static final FunctionDescriptor SetThreadDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadDesktop$MH = RuntimeHelper.downcallHandle(
        "SetThreadDesktop",
        constants$423.SetThreadDesktop$FUNC
    );
    static final FunctionDescriptor CloseDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseDesktop$MH = RuntimeHelper.downcallHandle(
        "CloseDesktop",
        constants$423.CloseDesktop$FUNC
    );
    static final FunctionDescriptor GetThreadDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetThreadDesktop$MH = RuntimeHelper.downcallHandle(
        "GetThreadDesktop",
        constants$423.GetThreadDesktop$FUNC
    );
    static final FunctionDescriptor CreateWindowStationA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateWindowStationA$MH = RuntimeHelper.downcallHandle(
        "CreateWindowStationA",
        constants$423.CreateWindowStationA$FUNC
    );
    static final FunctionDescriptor CreateWindowStationW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateWindowStationW$MH = RuntimeHelper.downcallHandle(
        "CreateWindowStationW",
        constants$423.CreateWindowStationW$FUNC
    );
    static final FunctionDescriptor OpenWindowStationA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenWindowStationA$MH = RuntimeHelper.downcallHandle(
        "OpenWindowStationA",
        constants$423.OpenWindowStationA$FUNC
    );
}

