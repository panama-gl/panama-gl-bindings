// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$198 {

    static final FunctionDescriptor SetSystemTimeAdjustmentPrecise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSystemTimeAdjustmentPrecise$MH = RuntimeHelper.downcallHandle(
        "SetSystemTimeAdjustmentPrecise",
        constants$198.SetSystemTimeAdjustmentPrecise$FUNC
    );
    static final FunctionDescriptor InstallELAMCertificateInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InstallELAMCertificateInfo$MH = RuntimeHelper.downcallHandle(
        "InstallELAMCertificateInfo",
        constants$198.InstallELAMCertificateInfo$FUNC
    );
    static final FunctionDescriptor GetProcessorSystemCycleTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessorSystemCycleTime$MH = RuntimeHelper.downcallHandle(
        "GetProcessorSystemCycleTime",
        constants$198.GetProcessorSystemCycleTime$FUNC
    );
    static final FunctionDescriptor GetOsManufacturingMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetOsManufacturingMode$MH = RuntimeHelper.downcallHandle(
        "GetOsManufacturingMode",
        constants$198.GetOsManufacturingMode$FUNC
    );
    static final FunctionDescriptor GetIntegratedDisplaySize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetIntegratedDisplaySize$MH = RuntimeHelper.downcallHandle(
        "GetIntegratedDisplaySize",
        constants$198.GetIntegratedDisplaySize$FUNC
    );
    static final FunctionDescriptor SetComputerNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameA$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameA",
        constants$198.SetComputerNameA$FUNC
    );
}


