// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$193 {

    static final FunctionDescriptor IsProcessCritical$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsProcessCritical$MH = RuntimeHelper.downcallHandle(
        "IsProcessCritical",
        constants$193.IsProcessCritical$FUNC
    );
    static final FunctionDescriptor SetProtectedPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetProtectedPolicy$MH = RuntimeHelper.downcallHandle(
        "SetProtectedPolicy",
        constants$193.SetProtectedPolicy$FUNC
    );
    static final FunctionDescriptor QueryProtectedPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryProtectedPolicy$MH = RuntimeHelper.downcallHandle(
        "QueryProtectedPolicy",
        constants$193.QueryProtectedPolicy$FUNC
    );
    static final FunctionDescriptor SetThreadIdealProcessor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadIdealProcessor$MH = RuntimeHelper.downcallHandle(
        "SetThreadIdealProcessor",
        constants$193.SetThreadIdealProcessor$FUNC
    );
    static final FunctionDescriptor SetProcessInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessInformation$MH = RuntimeHelper.downcallHandle(
        "SetProcessInformation",
        constants$193.SetProcessInformation$FUNC
    );
    static final FunctionDescriptor GetProcessInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetProcessInformation$MH = RuntimeHelper.downcallHandle(
        "GetProcessInformation",
        constants$193.GetProcessInformation$FUNC
    );
}


