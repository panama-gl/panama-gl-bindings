// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$435 {

    static final FunctionDescriptor SetLayeredWindowAttributes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetLayeredWindowAttributes$MH = RuntimeHelper.downcallHandle(
        "SetLayeredWindowAttributes",
        constants$435.SetLayeredWindowAttributes$FUNC
    );
    static final FunctionDescriptor ShowWindowAsync$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShowWindowAsync$MH = RuntimeHelper.downcallHandle(
        "ShowWindowAsync",
        constants$435.ShowWindowAsync$FUNC
    );
    static final FunctionDescriptor FlashWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FlashWindow$MH = RuntimeHelper.downcallHandle(
        "FlashWindow",
        constants$435.FlashWindow$FUNC
    );
    static final FunctionDescriptor FlashWindowEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FlashWindowEx$MH = RuntimeHelper.downcallHandle(
        "FlashWindowEx",
        constants$435.FlashWindowEx$FUNC
    );
    static final FunctionDescriptor ShowOwnedPopups$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShowOwnedPopups$MH = RuntimeHelper.downcallHandle(
        "ShowOwnedPopups",
        constants$435.ShowOwnedPopups$FUNC
    );
    static final FunctionDescriptor OpenIcon$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenIcon$MH = RuntimeHelper.downcallHandle(
        "OpenIcon",
        constants$435.OpenIcon$FUNC
    );
}


