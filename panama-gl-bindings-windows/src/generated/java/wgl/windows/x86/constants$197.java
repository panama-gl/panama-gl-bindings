// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$197 {

    static final FunctionDescriptor EnumSystemFirmwareTables$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnumSystemFirmwareTables$MH = RuntimeHelper.downcallHandle(
        "EnumSystemFirmwareTables",
        constants$197.EnumSystemFirmwareTables$FUNC
    );
    static final FunctionDescriptor GetSystemFirmwareTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemFirmwareTable$MH = RuntimeHelper.downcallHandle(
        "GetSystemFirmwareTable",
        constants$197.GetSystemFirmwareTable$FUNC
    );
    static final FunctionDescriptor DnsHostnameToComputerNameExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DnsHostnameToComputerNameExW$MH = RuntimeHelper.downcallHandle(
        "DnsHostnameToComputerNameExW",
        constants$197.DnsHostnameToComputerNameExW$FUNC
    );
    static final FunctionDescriptor GetPhysicallyInstalledSystemMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPhysicallyInstalledSystemMemory$MH = RuntimeHelper.downcallHandle(
        "GetPhysicallyInstalledSystemMemory",
        constants$197.GetPhysicallyInstalledSystemMemory$FUNC
    );
    static final FunctionDescriptor SetComputerNameEx2W$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameEx2W$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameEx2W",
        constants$197.SetComputerNameEx2W$FUNC
    );
    static final FunctionDescriptor SetSystemTimeAdjustment$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSystemTimeAdjustment$MH = RuntimeHelper.downcallHandle(
        "SetSystemTimeAdjustment",
        constants$197.SetSystemTimeAdjustment$FUNC
    );
}


