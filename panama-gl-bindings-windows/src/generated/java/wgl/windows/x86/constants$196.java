// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$196 {

    static final FunctionDescriptor GetLogicalProcessorInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLogicalProcessorInformation$MH = RuntimeHelper.downcallHandle(
        "GetLogicalProcessorInformation",
        constants$196.GetLogicalProcessorInformation$FUNC
    );
    static final FunctionDescriptor GetLogicalProcessorInformationEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLogicalProcessorInformationEx$MH = RuntimeHelper.downcallHandle(
        "GetLogicalProcessorInformationEx",
        constants$196.GetLogicalProcessorInformationEx$FUNC
    );
    static final FunctionDescriptor GetNativeSystemInfo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNativeSystemInfo$MH = RuntimeHelper.downcallHandle(
        "GetNativeSystemInfo",
        constants$196.GetNativeSystemInfo$FUNC
    );
    static final FunctionDescriptor GetSystemTimePreciseAsFileTime$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemTimePreciseAsFileTime$MH = RuntimeHelper.downcallHandle(
        "GetSystemTimePreciseAsFileTime",
        constants$196.GetSystemTimePreciseAsFileTime$FUNC
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
        constants$196.GetProductInfo$FUNC
    );
    static final FunctionDescriptor GetOsSafeBootMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetOsSafeBootMode$MH = RuntimeHelper.downcallHandle(
        "GetOsSafeBootMode",
        constants$196.GetOsSafeBootMode$FUNC
    );
}


