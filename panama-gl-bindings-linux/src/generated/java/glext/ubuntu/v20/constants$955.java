// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$955 {

    static final FunctionDescriptor glutKeyboardUpFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutKeyboardUpFunc$MH = RuntimeHelper.downcallHandle(
        "glutKeyboardUpFunc",
        constants$955.glutKeyboardUpFunc$FUNC
    );
    static final FunctionDescriptor glutSpecialUpFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutSpecialUpFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$955.glutSpecialUpFunc$callback$FUNC
    );
    static final FunctionDescriptor glutSpecialUpFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutSpecialUpFunc$MH = RuntimeHelper.downcallHandle(
        "glutSpecialUpFunc",
        constants$955.glutSpecialUpFunc$FUNC
    );
    static final FunctionDescriptor glutJoystickFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutJoystickFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$955.glutJoystickFunc$callback$FUNC
    );
}


