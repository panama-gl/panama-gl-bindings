// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$573 {

    static final FunctionDescriptor GetCurrentConsoleFontEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentConsoleFontEx$MH = RuntimeHelper.downcallHandle(
        "GetCurrentConsoleFontEx",
        constants$573.GetCurrentConsoleFontEx$FUNC
    );
    static final FunctionDescriptor SetCurrentConsoleFontEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCurrentConsoleFontEx$MH = RuntimeHelper.downcallHandle(
        "SetCurrentConsoleFontEx",
        constants$573.SetCurrentConsoleFontEx$FUNC
    );
    static final FunctionDescriptor GetConsoleSelectionInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleSelectionInfo$MH = RuntimeHelper.downcallHandle(
        "GetConsoleSelectionInfo",
        constants$573.GetConsoleSelectionInfo$FUNC
    );
    static final FunctionDescriptor GetConsoleHistoryInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleHistoryInfo$MH = RuntimeHelper.downcallHandle(
        "GetConsoleHistoryInfo",
        constants$573.GetConsoleHistoryInfo$FUNC
    );
    static final FunctionDescriptor SetConsoleHistoryInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleHistoryInfo$MH = RuntimeHelper.downcallHandle(
        "SetConsoleHistoryInfo",
        constants$573.SetConsoleHistoryInfo$FUNC
    );
    static final FunctionDescriptor GetConsoleDisplayMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleDisplayMode$MH = RuntimeHelper.downcallHandle(
        "GetConsoleDisplayMode",
        constants$573.GetConsoleDisplayMode$FUNC
    );
}


