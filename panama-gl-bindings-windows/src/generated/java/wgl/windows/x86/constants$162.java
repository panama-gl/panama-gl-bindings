// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$162 {

    static final FunctionDescriptor HeapCompact$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle HeapCompact$MH = RuntimeHelper.downcallHandle(
        "HeapCompact",
        constants$162.HeapCompact$FUNC
    );
    static final FunctionDescriptor HeapSetInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle HeapSetInformation$MH = RuntimeHelper.downcallHandle(
        "HeapSetInformation",
        constants$162.HeapSetInformation$FUNC
    );
    static final FunctionDescriptor HeapValidate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HeapValidate$MH = RuntimeHelper.downcallHandle(
        "HeapValidate",
        constants$162.HeapValidate$FUNC
    );
    static final FunctionDescriptor HeapSummary$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HeapSummary$MH = RuntimeHelper.downcallHandle(
        "HeapSummary",
        constants$162.HeapSummary$FUNC
    );
    static final FunctionDescriptor GetProcessHeaps$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessHeaps$MH = RuntimeHelper.downcallHandle(
        "GetProcessHeaps",
        constants$162.GetProcessHeaps$FUNC
    );
    static final FunctionDescriptor HeapLock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HeapLock$MH = RuntimeHelper.downcallHandle(
        "HeapLock",
        constants$162.HeapLock$FUNC
    );
}

