// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$201 {

    static final FunctionDescriptor GetSystemTimePreciseAsFileTime$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemTimePreciseAsFileTime$MH = RuntimeHelper.downcallHandle(
        "GetSystemTimePreciseAsFileTime",
        constants$201.GetSystemTimePreciseAsFileTime$FUNC
    );
    static final FunctionDescriptor GetProductInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProductInfo$MH = RuntimeHelper.downcallHandle(
        "GetProductInfo",
        constants$201.GetProductInfo$FUNC
    );
    static final FunctionDescriptor GetOsSafeBootMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetOsSafeBootMode$MH = RuntimeHelper.downcallHandle(
        "GetOsSafeBootMode",
        constants$201.GetOsSafeBootMode$FUNC
    );
    static final FunctionDescriptor EnumSystemFirmwareTables$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnumSystemFirmwareTables$MH = RuntimeHelper.downcallHandle(
        "EnumSystemFirmwareTables",
        constants$201.EnumSystemFirmwareTables$FUNC
    );
    static final FunctionDescriptor GetSystemFirmwareTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemFirmwareTable$MH = RuntimeHelper.downcallHandle(
        "GetSystemFirmwareTable",
        constants$201.GetSystemFirmwareTable$FUNC
    );
    static final FunctionDescriptor DnsHostnameToComputerNameExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DnsHostnameToComputerNameExW$MH = RuntimeHelper.downcallHandle(
        "DnsHostnameToComputerNameExW",
        constants$201.DnsHostnameToComputerNameExW$FUNC
    );
}

