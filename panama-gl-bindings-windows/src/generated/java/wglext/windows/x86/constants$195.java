// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$195 {

    static final FunctionDescriptor GetComputerNameExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComputerNameExA$MH = RuntimeHelper.downcallHandle(
        "GetComputerNameExA",
        constants$195.GetComputerNameExA$FUNC
    );
    static final FunctionDescriptor GetComputerNameExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComputerNameExW$MH = RuntimeHelper.downcallHandle(
        "GetComputerNameExW",
        constants$195.GetComputerNameExW$FUNC
    );
    static final FunctionDescriptor SetComputerNameExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameExW$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameExW",
        constants$195.SetComputerNameExW$FUNC
    );
    static final FunctionDescriptor SetSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetSystemTime$MH = RuntimeHelper.downcallHandle(
        "SetSystemTime",
        constants$195.SetSystemTime$FUNC
    );
    static final FunctionDescriptor GetVersionExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetVersionExA$MH = RuntimeHelper.downcallHandle(
        "GetVersionExA",
        constants$195.GetVersionExA$FUNC
    );
    static final FunctionDescriptor GetVersionExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetVersionExW$MH = RuntimeHelper.downcallHandle(
        "GetVersionExW",
        constants$195.GetVersionExW$FUNC
    );
}


