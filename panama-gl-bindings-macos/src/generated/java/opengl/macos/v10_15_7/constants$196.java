// Generated by jextract

package opengl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$196 {

    static final FunctionDescriptor glutKeyboardUpFunc$func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutKeyboardUpFunc$func$MH = RuntimeHelper.downcallHandle(
        constants$196.glutKeyboardUpFunc$func$FUNC
    );
    static final FunctionDescriptor glutKeyboardUpFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutKeyboardUpFunc$MH = RuntimeHelper.downcallHandle(
        "glutKeyboardUpFunc",
        constants$196.glutKeyboardUpFunc$FUNC
    );
    static final FunctionDescriptor glutSpecialUpFunc$func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutSpecialUpFunc$func$MH = RuntimeHelper.downcallHandle(
        constants$196.glutSpecialUpFunc$func$FUNC
    );
    static final FunctionDescriptor glutSpecialUpFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutSpecialUpFunc$MH = RuntimeHelper.downcallHandle(
        "glutSpecialUpFunc",
        constants$196.glutSpecialUpFunc$FUNC
    );
    static final FunctionDescriptor glutJoystickFunc$func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
}

