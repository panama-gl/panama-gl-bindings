// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$453 {

    static final FunctionDescriptor GetFocus$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetFocus$MH = RuntimeHelper.downcallHandle(
        "GetFocus",
        constants$453.GetFocus$FUNC
    );
    static final FunctionDescriptor GetKBCodePage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetKBCodePage$MH = RuntimeHelper.downcallHandle(
        "GetKBCodePage",
        constants$453.GetKBCodePage$FUNC
    );
    static final FunctionDescriptor GetKeyState$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetKeyState$MH = RuntimeHelper.downcallHandle(
        "GetKeyState",
        constants$453.GetKeyState$FUNC
    );
    static final FunctionDescriptor GetAsyncKeyState$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAsyncKeyState$MH = RuntimeHelper.downcallHandle(
        "GetAsyncKeyState",
        constants$453.GetAsyncKeyState$FUNC
    );
    static final FunctionDescriptor GetKeyboardState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetKeyboardState$MH = RuntimeHelper.downcallHandle(
        "GetKeyboardState",
        constants$453.GetKeyboardState$FUNC
    );
    static final FunctionDescriptor SetKeyboardState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetKeyboardState$MH = RuntimeHelper.downcallHandle(
        "SetKeyboardState",
        constants$453.SetKeyboardState$FUNC
    );
}

