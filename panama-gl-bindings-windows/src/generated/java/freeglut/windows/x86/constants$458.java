// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$458 {

    static final FunctionDescriptor IsCharLowerW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle IsCharLowerW$MH = RuntimeHelper.downcallHandle(
        "IsCharLowerW",
        constants$458.IsCharLowerW$FUNC
    );
    static final FunctionDescriptor SetFocus$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFocus$MH = RuntimeHelper.downcallHandle(
        "SetFocus",
        constants$458.SetFocus$FUNC
    );
    static final FunctionDescriptor GetActiveWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetActiveWindow$MH = RuntimeHelper.downcallHandle(
        "GetActiveWindow",
        constants$458.GetActiveWindow$FUNC
    );
    static final FunctionDescriptor GetFocus$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetFocus$MH = RuntimeHelper.downcallHandle(
        "GetFocus",
        constants$458.GetFocus$FUNC
    );
    static final FunctionDescriptor GetKBCodePage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetKBCodePage$MH = RuntimeHelper.downcallHandle(
        "GetKBCodePage",
        constants$458.GetKBCodePage$FUNC
    );
    static final FunctionDescriptor GetKeyState$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetKeyState$MH = RuntimeHelper.downcallHandle(
        "GetKeyState",
        constants$458.GetKeyState$FUNC
    );
}


