// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$273 {

    static final FunctionDescriptor SetFileShortNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFileShortNameW$MH = RuntimeHelper.downcallHandle(
        "SetFileShortNameW",
        constants$273.SetFileShortNameW$FUNC
    );
    static final FunctionDescriptor LoadModule$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadModule$MH = RuntimeHelper.downcallHandle(
        "LoadModule",
        constants$273.LoadModule$FUNC
    );
    static final FunctionDescriptor WinExec$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WinExec$MH = RuntimeHelper.downcallHandle(
        "WinExec",
        constants$273.WinExec$FUNC
    );
    static final FunctionDescriptor ClearCommBreak$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClearCommBreak$MH = RuntimeHelper.downcallHandle(
        "ClearCommBreak",
        constants$273.ClearCommBreak$FUNC
    );
    static final FunctionDescriptor ClearCommError$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClearCommError$MH = RuntimeHelper.downcallHandle(
        "ClearCommError",
        constants$273.ClearCommError$FUNC
    );
    static final FunctionDescriptor SetupComm$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetupComm$MH = RuntimeHelper.downcallHandle(
        "SetupComm",
        constants$273.SetupComm$FUNC
    );
}


