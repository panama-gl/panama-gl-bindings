// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$434 {

    static final FunctionDescriptor ShowWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShowWindow$MH = RuntimeHelper.downcallHandle(
        "ShowWindow",
        constants$434.ShowWindow$FUNC
    );
    static final FunctionDescriptor AnimateWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AnimateWindow$MH = RuntimeHelper.downcallHandle(
        "AnimateWindow",
        constants$434.AnimateWindow$FUNC
    );
    static final FunctionDescriptor UpdateLayeredWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UpdateLayeredWindow$MH = RuntimeHelper.downcallHandle(
        "UpdateLayeredWindow",
        constants$434.UpdateLayeredWindow$FUNC
    );
    static final FunctionDescriptor UpdateLayeredWindowIndirect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UpdateLayeredWindowIndirect$MH = RuntimeHelper.downcallHandle(
        "UpdateLayeredWindowIndirect",
        constants$434.UpdateLayeredWindowIndirect$FUNC
    );
    static final FunctionDescriptor GetLayeredWindowAttributes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLayeredWindowAttributes$MH = RuntimeHelper.downcallHandle(
        "GetLayeredWindowAttributes",
        constants$434.GetLayeredWindowAttributes$FUNC
    );
    static final FunctionDescriptor PrintWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrintWindow$MH = RuntimeHelper.downcallHandle(
        "PrintWindow",
        constants$434.PrintWindow$FUNC
    );
}


