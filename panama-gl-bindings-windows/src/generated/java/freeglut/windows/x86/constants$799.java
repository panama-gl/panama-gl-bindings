// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$799 {

    static final FunctionDescriptor glutInitContextFunc$callback$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutInitContextFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$799.glutInitContextFunc$callback$FUNC
    );
    static final FunctionDescriptor glutInitContextFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutInitContextFunc$MH = RuntimeHelper.downcallHandle(
        "glutInitContextFunc",
        constants$799.glutInitContextFunc$FUNC
    );
    static final FunctionDescriptor glutAppStatusFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutAppStatusFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$799.glutAppStatusFunc$callback$FUNC
    );
    static final FunctionDescriptor glutAppStatusFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutAppStatusFunc$MH = RuntimeHelper.downcallHandle(
        "glutAppStatusFunc",
        constants$799.glutAppStatusFunc$FUNC
    );
    static final FunctionDescriptor glutCreateMenuUcall$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


