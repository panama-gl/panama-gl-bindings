// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$568 {

    static final FunctionDescriptor AllocConsole$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle AllocConsole$MH = RuntimeHelper.downcallHandle(
        "AllocConsole",
        constants$568.AllocConsole$FUNC
    );
    static final FunctionDescriptor FreeConsole$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle FreeConsole$MH = RuntimeHelper.downcallHandle(
        "FreeConsole",
        constants$568.FreeConsole$FUNC
    );
    static final FunctionDescriptor AttachConsole$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AttachConsole$MH = RuntimeHelper.downcallHandle(
        "AttachConsole",
        constants$568.AttachConsole$FUNC
    );
    static final FunctionDescriptor GetConsoleCP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetConsoleCP$MH = RuntimeHelper.downcallHandle(
        "GetConsoleCP",
        constants$568.GetConsoleCP$FUNC
    );
    static final FunctionDescriptor GetConsoleOutputCP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetConsoleOutputCP$MH = RuntimeHelper.downcallHandle(
        "GetConsoleOutputCP",
        constants$568.GetConsoleOutputCP$FUNC
    );
    static final FunctionDescriptor GetConsoleMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleMode$MH = RuntimeHelper.downcallHandle(
        "GetConsoleMode",
        constants$568.GetConsoleMode$FUNC
    );
}


