// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$786 {

    static final FunctionDescriptor glutLeaveFullScreen$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutLeaveFullScreen$MH = RuntimeHelper.downcallHandle(
        "glutLeaveFullScreen",
        constants$786.glutLeaveFullScreen$FUNC
    );
    static final FunctionDescriptor glutSetMenuFont$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutSetMenuFont$MH = RuntimeHelper.downcallHandle(
        "glutSetMenuFont",
        constants$786.glutSetMenuFont$FUNC
    );
    static final FunctionDescriptor glutMouseWheelFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutMouseWheelFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$786.glutMouseWheelFunc$callback$FUNC
    );
    static final FunctionDescriptor glutMouseWheelFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutMouseWheelFunc$MH = RuntimeHelper.downcallHandle(
        "glutMouseWheelFunc",
        constants$786.glutMouseWheelFunc$FUNC
    );
    static final FunctionDescriptor glutPositionFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
}

