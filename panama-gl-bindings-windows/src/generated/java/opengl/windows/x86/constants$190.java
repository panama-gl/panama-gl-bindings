// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$190 {

    static final FunctionDescriptor GetProcessMitigationPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle GetProcessMitigationPolicy$MH = RuntimeHelper.downcallHandle(
        "GetProcessMitigationPolicy",
        constants$190.GetProcessMitigationPolicy$FUNC
    );
    static final FunctionDescriptor SetThreadContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadContext$MH = RuntimeHelper.downcallHandle(
        "SetThreadContext",
        constants$190.SetThreadContext$FUNC
    );
    static final FunctionDescriptor SetProcessMitigationPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetProcessMitigationPolicy$MH = RuntimeHelper.downcallHandle(
        "SetProcessMitigationPolicy",
        constants$190.SetProcessMitigationPolicy$FUNC
    );
    static final FunctionDescriptor FlushInstructionCache$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle FlushInstructionCache$MH = RuntimeHelper.downcallHandle(
        "FlushInstructionCache",
        constants$190.FlushInstructionCache$FUNC
    );
    static final FunctionDescriptor GetThreadTimes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadTimes$MH = RuntimeHelper.downcallHandle(
        "GetThreadTimes",
        constants$190.GetThreadTimes$FUNC
    );
    static final FunctionDescriptor OpenProcess$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenProcess$MH = RuntimeHelper.downcallHandle(
        "OpenProcess",
        constants$190.OpenProcess$FUNC
    );
}


