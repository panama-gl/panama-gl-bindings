// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$579 {

    static final FunctionDescriptor GetConsoleSelectionInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleSelectionInfo$MH = RuntimeHelper.downcallHandle(
        "GetConsoleSelectionInfo",
        constants$579.GetConsoleSelectionInfo$FUNC
    );
    static final FunctionDescriptor GetConsoleHistoryInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleHistoryInfo$MH = RuntimeHelper.downcallHandle(
        "GetConsoleHistoryInfo",
        constants$579.GetConsoleHistoryInfo$FUNC
    );
    static final FunctionDescriptor SetConsoleHistoryInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleHistoryInfo$MH = RuntimeHelper.downcallHandle(
        "SetConsoleHistoryInfo",
        constants$579.SetConsoleHistoryInfo$FUNC
    );
    static final FunctionDescriptor GetConsoleDisplayMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleDisplayMode$MH = RuntimeHelper.downcallHandle(
        "GetConsoleDisplayMode",
        constants$579.GetConsoleDisplayMode$FUNC
    );
    static final FunctionDescriptor SetConsoleDisplayMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleDisplayMode$MH = RuntimeHelper.downcallHandle(
        "SetConsoleDisplayMode",
        constants$579.SetConsoleDisplayMode$FUNC
    );
    static final FunctionDescriptor GetConsoleWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetConsoleWindow$MH = RuntimeHelper.downcallHandle(
        "GetConsoleWindow",
        constants$579.GetConsoleWindow$FUNC
    );
}


