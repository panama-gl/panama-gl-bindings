// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$526 {

    static final FunctionDescriptor WINEVENTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WINEVENTPROC$MH = RuntimeHelper.downcallHandle(
        constants$526.WINEVENTPROC$FUNC
    );
    static final FunctionDescriptor SetWinEventHook$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWinEventHook$MH = RuntimeHelper.downcallHandle(
        "SetWinEventHook",
        constants$526.SetWinEventHook$FUNC
    );
    static final FunctionDescriptor IsWinEventHookInstalled$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsWinEventHookInstalled$MH = RuntimeHelper.downcallHandle(
        "IsWinEventHookInstalled",
        constants$526.IsWinEventHookInstalled$FUNC
    );
    static final FunctionDescriptor UnhookWinEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnhookWinEvent$MH = RuntimeHelper.downcallHandle(
        "UnhookWinEvent",
        constants$526.UnhookWinEvent$FUNC
    );
    static final FunctionDescriptor GetGUIThreadInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetGUIThreadInfo$MH = RuntimeHelper.downcallHandle(
        "GetGUIThreadInfo",
        constants$526.GetGUIThreadInfo$FUNC
    );
    static final FunctionDescriptor BlockInput$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BlockInput$MH = RuntimeHelper.downcallHandle(
        "BlockInput",
        constants$526.BlockInput$FUNC
    );
}


