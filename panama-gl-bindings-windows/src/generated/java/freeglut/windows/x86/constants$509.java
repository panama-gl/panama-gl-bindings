// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$509 {

    static final FunctionDescriptor GetClassNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetClassNameW$MH = RuntimeHelper.downcallHandle(
        "GetClassNameW",
        constants$509.GetClassNameW$FUNC
    );
    static final FunctionDescriptor GetTopWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTopWindow$MH = RuntimeHelper.downcallHandle(
        "GetTopWindow",
        constants$509.GetTopWindow$FUNC
    );
    static final FunctionDescriptor GetWindowThreadProcessId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowThreadProcessId$MH = RuntimeHelper.downcallHandle(
        "GetWindowThreadProcessId",
        constants$509.GetWindowThreadProcessId$FUNC
    );
    static final FunctionDescriptor IsGUIThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsGUIThread$MH = RuntimeHelper.downcallHandle(
        "IsGUIThread",
        constants$509.IsGUIThread$FUNC
    );
    static final FunctionDescriptor GetLastActivePopup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLastActivePopup$MH = RuntimeHelper.downcallHandle(
        "GetLastActivePopup",
        constants$509.GetLastActivePopup$FUNC
    );
    static final FunctionDescriptor GetWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetWindow$MH = RuntimeHelper.downcallHandle(
        "GetWindow",
        constants$509.GetWindow$FUNC
    );
}

