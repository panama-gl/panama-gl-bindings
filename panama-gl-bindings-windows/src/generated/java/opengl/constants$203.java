// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$203 {

    static final FunctionDescriptor GetOsManufacturingMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetOsManufacturingMode$MH = RuntimeHelper.downcallHandle(
        "GetOsManufacturingMode",
        constants$203.GetOsManufacturingMode$FUNC
    );
    static final FunctionDescriptor GetIntegratedDisplaySize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetIntegratedDisplaySize$MH = RuntimeHelper.downcallHandle(
        "GetIntegratedDisplaySize",
        constants$203.GetIntegratedDisplaySize$FUNC
    );
    static final FunctionDescriptor SetComputerNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameA$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameA",
        constants$203.SetComputerNameA$FUNC
    );
    static final FunctionDescriptor SetComputerNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameW$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameW",
        constants$203.SetComputerNameW$FUNC
    );
    static final FunctionDescriptor SetComputerNameExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameExA$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameExA",
        constants$203.SetComputerNameExA$FUNC
    );
    static final FunctionDescriptor VirtualAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VirtualAlloc$MH = RuntimeHelper.downcallHandle(
        "VirtualAlloc",
        constants$203.VirtualAlloc$FUNC
    );
}


