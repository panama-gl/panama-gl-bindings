// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$807 {

    static final FunctionDescriptor glutJoystickFuncUcall$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutJoystickFuncUcall$callback$MH = RuntimeHelper.downcallHandle(
        constants$807.glutJoystickFuncUcall$callback$FUNC
    );
    static final FunctionDescriptor glutJoystickFuncUcall$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutJoystickFuncUcall$MH = RuntimeHelper.downcallHandle(
        "glutJoystickFuncUcall",
        constants$807.glutJoystickFuncUcall$FUNC
    );
    static final FunctionDescriptor glutMenuStatusFuncUcall$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutMenuStatusFuncUcall$callback$MH = RuntimeHelper.downcallHandle(
        constants$807.glutMenuStatusFuncUcall$callback$FUNC
    );
    static final FunctionDescriptor glutMenuStatusFuncUcall$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutMenuStatusFuncUcall$MH = RuntimeHelper.downcallHandle(
        "glutMenuStatusFuncUcall",
        constants$807.glutMenuStatusFuncUcall$FUNC
    );
    static final FunctionDescriptor glutOverlayDisplayFuncUcall$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
}


