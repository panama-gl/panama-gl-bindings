// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$528 {

    static final FunctionDescriptor GetDpiFromDpiAwarenessContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDpiFromDpiAwarenessContext$MH = RuntimeHelper.downcallHandle(
        "GetDpiFromDpiAwarenessContext",
        constants$528.GetDpiFromDpiAwarenessContext$FUNC
    );
    static final FunctionDescriptor AreDpiAwarenessContextsEqual$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AreDpiAwarenessContextsEqual$MH = RuntimeHelper.downcallHandle(
        "AreDpiAwarenessContextsEqual",
        constants$528.AreDpiAwarenessContextsEqual$FUNC
    );
    static final FunctionDescriptor IsValidDpiAwarenessContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsValidDpiAwarenessContext$MH = RuntimeHelper.downcallHandle(
        "IsValidDpiAwarenessContext",
        constants$528.IsValidDpiAwarenessContext$FUNC
    );
    static final FunctionDescriptor GetDpiForWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDpiForWindow$MH = RuntimeHelper.downcallHandle(
        "GetDpiForWindow",
        constants$528.GetDpiForWindow$FUNC
    );
    static final FunctionDescriptor GetDpiForSystem$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetDpiForSystem$MH = RuntimeHelper.downcallHandle(
        "GetDpiForSystem",
        constants$528.GetDpiForSystem$FUNC
    );
    static final FunctionDescriptor GetSystemDpiForProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemDpiForProcess$MH = RuntimeHelper.downcallHandle(
        "GetSystemDpiForProcess",
        constants$528.GetSystemDpiForProcess$FUNC
    );
}


