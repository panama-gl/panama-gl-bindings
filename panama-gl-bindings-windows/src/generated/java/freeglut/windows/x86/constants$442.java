// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$442 {

    static final FunctionDescriptor GetWindowPlacement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowPlacement$MH = RuntimeHelper.downcallHandle(
        "GetWindowPlacement",
        constants$442.GetWindowPlacement$FUNC
    );
    static final FunctionDescriptor SetWindowPlacement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetWindowPlacement$MH = RuntimeHelper.downcallHandle(
        "SetWindowPlacement",
        constants$442.SetWindowPlacement$FUNC
    );
    static final FunctionDescriptor GetWindowDisplayAffinity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowDisplayAffinity$MH = RuntimeHelper.downcallHandle(
        "GetWindowDisplayAffinity",
        constants$442.GetWindowDisplayAffinity$FUNC
    );
    static final FunctionDescriptor SetWindowDisplayAffinity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWindowDisplayAffinity$MH = RuntimeHelper.downcallHandle(
        "SetWindowDisplayAffinity",
        constants$442.SetWindowDisplayAffinity$FUNC
    );
    static final FunctionDescriptor BeginDeferWindowPos$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BeginDeferWindowPos$MH = RuntimeHelper.downcallHandle(
        "BeginDeferWindowPos",
        constants$442.BeginDeferWindowPos$FUNC
    );
    static final FunctionDescriptor DeferWindowPos$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeferWindowPos$MH = RuntimeHelper.downcallHandle(
        "DeferWindowPos",
        constants$442.DeferWindowPos$FUNC
    );
}


