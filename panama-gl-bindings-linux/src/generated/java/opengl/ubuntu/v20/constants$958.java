// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$958 {

    static final FunctionDescriptor glutWindowStatusFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutWindowStatusFunc$MH = RuntimeHelper.downcallHandle(
        "glutWindowStatusFunc",
        constants$958.glutWindowStatusFunc$FUNC
    );
    static final FunctionDescriptor glutSpaceballMotionFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutSpaceballMotionFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$958.glutSpaceballMotionFunc$callback$FUNC
    );
    static final FunctionDescriptor glutSpaceballMotionFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutSpaceballMotionFunc$MH = RuntimeHelper.downcallHandle(
        "glutSpaceballMotionFunc",
        constants$958.glutSpaceballMotionFunc$FUNC
    );
    static final FunctionDescriptor glutSpaceballRotateFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glutSpaceballRotateFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$958.glutSpaceballRotateFunc$callback$FUNC
    );
}


