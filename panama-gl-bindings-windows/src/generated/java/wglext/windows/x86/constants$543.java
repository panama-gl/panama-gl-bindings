// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$543 {

    static final FunctionDescriptor GetOEMCP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetOEMCP$MH = RuntimeHelper.downcallHandle(
        "GetOEMCP",
        constants$543.GetOEMCP$FUNC
    );
    static final FunctionDescriptor GetCPInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCPInfo$MH = RuntimeHelper.downcallHandle(
        "GetCPInfo",
        constants$543.GetCPInfo$FUNC
    );
    static final FunctionDescriptor GetCPInfoExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCPInfoExA$MH = RuntimeHelper.downcallHandle(
        "GetCPInfoExA",
        constants$543.GetCPInfoExA$FUNC
    );
    static final FunctionDescriptor GetCPInfoExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCPInfoExW$MH = RuntimeHelper.downcallHandle(
        "GetCPInfoExW",
        constants$543.GetCPInfoExW$FUNC
    );
    static final FunctionDescriptor CompareStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CompareStringA$MH = RuntimeHelper.downcallHandle(
        "CompareStringA",
        constants$543.CompareStringA$FUNC
    );
    static final FunctionDescriptor FindNLSString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindNLSString$MH = RuntimeHelper.downcallHandle(
        "FindNLSString",
        constants$543.FindNLSString$FUNC
    );
}


