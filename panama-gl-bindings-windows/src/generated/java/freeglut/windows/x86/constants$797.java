// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$797 {

    static final FunctionDescriptor glutInitContextFlags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutInitContextFlags$MH = RuntimeHelper.downcallHandle(
        "glutInitContextFlags",
        constants$797.glutInitContextFlags$FUNC
    );
    static final FunctionDescriptor glutInitContextProfile$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutInitContextProfile$MH = RuntimeHelper.downcallHandle(
        "glutInitContextProfile",
        constants$797.glutInitContextProfile$FUNC
    );
    static final FunctionDescriptor glutInitErrorFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutInitErrorFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$797.glutInitErrorFunc$callback$FUNC
    );
    static final FunctionDescriptor glutInitErrorFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutInitErrorFunc$MH = RuntimeHelper.downcallHandle(
        "glutInitErrorFunc",
        constants$797.glutInitErrorFunc$FUNC
    );
    static final FunctionDescriptor glutInitWarningFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

