// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$62 {

    static final FunctionDescriptor __addgsqword$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __addgsqword$MH = RuntimeHelper.downcallHandle(
        "__addgsqword",
        constants$62.__addgsqword$FUNC
    );
    static final FunctionDescriptor GET_RUNTIME_FUNCTION_CALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GET_RUNTIME_FUNCTION_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$62.GET_RUNTIME_FUNCTION_CALLBACK$FUNC
    );
    static final FunctionDescriptor PGET_RUNTIME_FUNCTION_CALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PGET_RUNTIME_FUNCTION_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$62.PGET_RUNTIME_FUNCTION_CALLBACK$FUNC
    );
    static final FunctionDescriptor OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


