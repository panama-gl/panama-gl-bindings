// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$525 {

    static final FunctionDescriptor GetWindowInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowInfo$MH = RuntimeHelper.downcallHandle(
        "GetWindowInfo",
        constants$525.GetWindowInfo$FUNC
    );
    static final FunctionDescriptor GetTitleBarInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTitleBarInfo$MH = RuntimeHelper.downcallHandle(
        "GetTitleBarInfo",
        constants$525.GetTitleBarInfo$FUNC
    );
    static final FunctionDescriptor GetMenuBarInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuBarInfo$MH = RuntimeHelper.downcallHandle(
        "GetMenuBarInfo",
        constants$525.GetMenuBarInfo$FUNC
    );
    static final FunctionDescriptor GetScrollBarInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetScrollBarInfo$MH = RuntimeHelper.downcallHandle(
        "GetScrollBarInfo",
        constants$525.GetScrollBarInfo$FUNC
    );
    static final FunctionDescriptor GetComboBoxInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComboBoxInfo$MH = RuntimeHelper.downcallHandle(
        "GetComboBoxInfo",
        constants$525.GetComboBoxInfo$FUNC
    );
    static final FunctionDescriptor GetAncestor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAncestor$MH = RuntimeHelper.downcallHandle(
        "GetAncestor",
        constants$525.GetAncestor$FUNC
    );
}


