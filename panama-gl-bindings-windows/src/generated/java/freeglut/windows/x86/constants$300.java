// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$300 {

    static final FunctionDescriptor PGET_SYSTEM_WOW64_DIRECTORY_W$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PGET_SYSTEM_WOW64_DIRECTORY_W$MH = RuntimeHelper.downcallHandle(
        constants$300.PGET_SYSTEM_WOW64_DIRECTORY_W$FUNC
    );
    static final FunctionDescriptor SetDllDirectoryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDllDirectoryA$MH = RuntimeHelper.downcallHandle(
        "SetDllDirectoryA",
        constants$300.SetDllDirectoryA$FUNC
    );
    static final FunctionDescriptor SetDllDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDllDirectoryW$MH = RuntimeHelper.downcallHandle(
        "SetDllDirectoryW",
        constants$300.SetDllDirectoryW$FUNC
    );
    static final FunctionDescriptor GetDllDirectoryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDllDirectoryA$MH = RuntimeHelper.downcallHandle(
        "GetDllDirectoryA",
        constants$300.GetDllDirectoryA$FUNC
    );
    static final FunctionDescriptor GetDllDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDllDirectoryW$MH = RuntimeHelper.downcallHandle(
        "GetDllDirectoryW",
        constants$300.GetDllDirectoryW$FUNC
    );
}

