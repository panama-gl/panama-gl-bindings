// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$788 {

    static final FunctionDescriptor glutWMCloseFunc$callback$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutWMCloseFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$788.glutWMCloseFunc$callback$FUNC
    );
    static final FunctionDescriptor glutWMCloseFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutWMCloseFunc$MH = RuntimeHelper.downcallHandle(
        "glutWMCloseFunc",
        constants$788.glutWMCloseFunc$FUNC
    );
    static final FunctionDescriptor glutMenuDestroyFunc$callback$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutMenuDestroyFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$788.glutMenuDestroyFunc$callback$FUNC
    );
    static final FunctionDescriptor glutMenuDestroyFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutMenuDestroyFunc$MH = RuntimeHelper.downcallHandle(
        "glutMenuDestroyFunc",
        constants$788.glutMenuDestroyFunc$FUNC
    );
    static final FunctionDescriptor glutSetOption$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutSetOption$MH = RuntimeHelper.downcallHandle(
        "glutSetOption",
        constants$788.glutSetOption$FUNC
    );
}


