// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$721 {

    static final FunctionDescriptor glutCreateMenu$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutCreateMenu$callback$MH = RuntimeHelper.downcallHandle(
        constants$721.glutCreateMenu$callback$FUNC
    );
    static final FunctionDescriptor glutCreateMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutCreateMenu$MH = RuntimeHelper.downcallHandle(
        "glutCreateMenu",
        constants$721.glutCreateMenu$FUNC
    );
    static final FunctionDescriptor glutDestroyMenu$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutDestroyMenu$MH = RuntimeHelper.downcallHandle(
        "glutDestroyMenu",
        constants$721.glutDestroyMenu$FUNC
    );
    static final FunctionDescriptor glutGetMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle glutGetMenu$MH = RuntimeHelper.downcallHandle(
        "glutGetMenu",
        constants$721.glutGetMenu$FUNC
    );
    static final FunctionDescriptor glutSetMenu$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutSetMenu$MH = RuntimeHelper.downcallHandle(
        "glutSetMenu",
        constants$721.glutSetMenu$FUNC
    );
}


