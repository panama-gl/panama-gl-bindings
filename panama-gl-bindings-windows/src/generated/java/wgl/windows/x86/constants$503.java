// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$503 {

    static final FunctionDescriptor EnumWindows$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumWindows$MH = RuntimeHelper.downcallHandle(
        "EnumWindows",
        constants$503.EnumWindows$FUNC
    );
    static final FunctionDescriptor EnumThreadWindows$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumThreadWindows$MH = RuntimeHelper.downcallHandle(
        "EnumThreadWindows",
        constants$503.EnumThreadWindows$FUNC
    );
    static final FunctionDescriptor GetClassNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetClassNameA$MH = RuntimeHelper.downcallHandle(
        "GetClassNameA",
        constants$503.GetClassNameA$FUNC
    );
    static final FunctionDescriptor GetClassNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetClassNameW$MH = RuntimeHelper.downcallHandle(
        "GetClassNameW",
        constants$503.GetClassNameW$FUNC
    );
    static final FunctionDescriptor GetTopWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTopWindow$MH = RuntimeHelper.downcallHandle(
        "GetTopWindow",
        constants$503.GetTopWindow$FUNC
    );
    static final FunctionDescriptor GetWindowThreadProcessId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowThreadProcessId$MH = RuntimeHelper.downcallHandle(
        "GetWindowThreadProcessId",
        constants$503.GetWindowThreadProcessId$FUNC
    );
}


