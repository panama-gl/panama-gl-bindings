// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$228 {

    static final FunctionDescriptor Wow64SetThreadContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Wow64SetThreadContext$MH = RuntimeHelper.downcallHandle(
        "Wow64SetThreadContext",
        constants$228.Wow64SetThreadContext$FUNC
    );
    static final FunctionDescriptor Wow64SuspendThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Wow64SuspendThread$MH = RuntimeHelper.downcallHandle(
        "Wow64SuspendThread",
        constants$228.Wow64SuspendThread$FUNC
    );
    static final FunctionDescriptor ENUMRESLANGPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ENUMRESLANGPROCA$MH = RuntimeHelper.downcallHandle(
        constants$228.ENUMRESLANGPROCA$FUNC
    );
    static final FunctionDescriptor ENUMRESLANGPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ENUMRESLANGPROCW$MH = RuntimeHelper.downcallHandle(
        constants$228.ENUMRESLANGPROCW$FUNC
    );
}

