// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$171 {

    static final FunctionDescriptor CreateMutexW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateMutexW$MH = RuntimeHelper.downcallHandle(
        "CreateMutexW",
        constants$171.CreateMutexW$FUNC
    );
    static final FunctionDescriptor OpenMutexW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenMutexW$MH = RuntimeHelper.downcallHandle(
        "OpenMutexW",
        constants$171.OpenMutexW$FUNC
    );
    static final FunctionDescriptor CreateEventA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateEventA$MH = RuntimeHelper.downcallHandle(
        "CreateEventA",
        constants$171.CreateEventA$FUNC
    );
    static final FunctionDescriptor CreateEventW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateEventW$MH = RuntimeHelper.downcallHandle(
        "CreateEventW",
        constants$171.CreateEventW$FUNC
    );
    static final FunctionDescriptor OpenEventA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenEventA$MH = RuntimeHelper.downcallHandle(
        "OpenEventA",
        constants$171.OpenEventA$FUNC
    );
    static final FunctionDescriptor OpenEventW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenEventW$MH = RuntimeHelper.downcallHandle(
        "OpenEventW",
        constants$171.OpenEventW$FUNC
    );
}


