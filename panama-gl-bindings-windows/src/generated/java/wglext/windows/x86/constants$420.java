// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$420 {

    static final FunctionDescriptor GetUserObjectInformationW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUserObjectInformationW$MH = RuntimeHelper.downcallHandle(
        "GetUserObjectInformationW",
        constants$420.GetUserObjectInformationW$FUNC
    );
    static final FunctionDescriptor SetUserObjectInformationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetUserObjectInformationA$MH = RuntimeHelper.downcallHandle(
        "SetUserObjectInformationA",
        constants$420.SetUserObjectInformationA$FUNC
    );
    static final FunctionDescriptor SetUserObjectInformationW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetUserObjectInformationW$MH = RuntimeHelper.downcallHandle(
        "SetUserObjectInformationW",
        constants$420.SetUserObjectInformationW$FUNC
    );
    static final FunctionDescriptor IsHungAppWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsHungAppWindow$MH = RuntimeHelper.downcallHandle(
        "IsHungAppWindow",
        constants$420.IsHungAppWindow$FUNC
    );
    static final FunctionDescriptor DisableProcessWindowsGhosting$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle DisableProcessWindowsGhosting$MH = RuntimeHelper.downcallHandle(
        "DisableProcessWindowsGhosting",
        constants$420.DisableProcessWindowsGhosting$FUNC
    );
    static final FunctionDescriptor RegisterWindowMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterWindowMessageA$MH = RuntimeHelper.downcallHandle(
        "RegisterWindowMessageA",
        constants$420.RegisterWindowMessageA$FUNC
    );
}

