// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$730 {

    static final FunctionDescriptor glutJoystickFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutJoystickFunc$MH = RuntimeHelper.downcallHandle(
        "glutJoystickFunc",
        constants$730.glutJoystickFunc$FUNC
    );
    static final FunctionDescriptor glutMenuStateFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutMenuStateFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$730.glutMenuStateFunc$callback$FUNC
    );
    static final FunctionDescriptor glutMenuStateFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutMenuStateFunc$MH = RuntimeHelper.downcallHandle(
        "glutMenuStateFunc",
        constants$730.glutMenuStateFunc$FUNC
    );
    static final FunctionDescriptor glutMenuStatusFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutMenuStatusFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$730.glutMenuStatusFunc$callback$FUNC
    );
}

