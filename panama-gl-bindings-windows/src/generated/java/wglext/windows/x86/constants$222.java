// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$222 {

    static final FunctionDescriptor IsWow64GuestMachineSupported$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsWow64GuestMachineSupported$MH = RuntimeHelper.downcallHandle(
        "IsWow64GuestMachineSupported",
        constants$222.IsWow64GuestMachineSupported$FUNC
    );
    static final FunctionDescriptor Wow64GetThreadContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Wow64GetThreadContext$MH = RuntimeHelper.downcallHandle(
        "Wow64GetThreadContext",
        constants$222.Wow64GetThreadContext$FUNC
    );
    static final FunctionDescriptor Wow64SetThreadContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Wow64SetThreadContext$MH = RuntimeHelper.downcallHandle(
        "Wow64SetThreadContext",
        constants$222.Wow64SetThreadContext$FUNC
    );
    static final FunctionDescriptor Wow64SuspendThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Wow64SuspendThread$MH = RuntimeHelper.downcallHandle(
        "Wow64SuspendThread",
        constants$222.Wow64SuspendThread$FUNC
    );
    static final FunctionDescriptor ENUMRESLANGPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ENUMRESLANGPROCA$MH = RuntimeHelper.downcallHandle(
        constants$222.ENUMRESLANGPROCA$FUNC
    );
}


