// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$459 {

    static final FunctionDescriptor GetAsyncKeyState$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAsyncKeyState$MH = RuntimeHelper.downcallHandle(
        "GetAsyncKeyState",
        constants$459.GetAsyncKeyState$FUNC
    );
    static final FunctionDescriptor GetKeyboardState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetKeyboardState$MH = RuntimeHelper.downcallHandle(
        "GetKeyboardState",
        constants$459.GetKeyboardState$FUNC
    );
    static final FunctionDescriptor SetKeyboardState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetKeyboardState$MH = RuntimeHelper.downcallHandle(
        "SetKeyboardState",
        constants$459.SetKeyboardState$FUNC
    );
    static final FunctionDescriptor GetKeyNameTextA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetKeyNameTextA$MH = RuntimeHelper.downcallHandle(
        "GetKeyNameTextA",
        constants$459.GetKeyNameTextA$FUNC
    );
    static final FunctionDescriptor GetKeyNameTextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetKeyNameTextW$MH = RuntimeHelper.downcallHandle(
        "GetKeyNameTextW",
        constants$459.GetKeyNameTextW$FUNC
    );
    static final FunctionDescriptor GetKeyboardType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetKeyboardType$MH = RuntimeHelper.downcallHandle(
        "GetKeyboardType",
        constants$459.GetKeyboardType$FUNC
    );
}


