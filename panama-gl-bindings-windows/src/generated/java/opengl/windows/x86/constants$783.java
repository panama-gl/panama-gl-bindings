// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$783 {

    static final FunctionDescriptor __glutInitWithExit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __glutInitWithExit$MH = RuntimeHelper.downcallHandle(
        "__glutInitWithExit",
        constants$783.__glutInitWithExit$FUNC
    );
    static final FunctionDescriptor __glutCreateWindowWithExit$exitfunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle __glutCreateWindowWithExit$exitfunc$MH = RuntimeHelper.downcallHandle(
        constants$783.__glutCreateWindowWithExit$exitfunc$FUNC
    );
    static final FunctionDescriptor __glutCreateWindowWithExit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __glutCreateWindowWithExit$MH = RuntimeHelper.downcallHandle(
        "__glutCreateWindowWithExit",
        constants$783.__glutCreateWindowWithExit$FUNC
    );
    static final FunctionDescriptor __glutCreateMenuWithExit$func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle __glutCreateMenuWithExit$func$MH = RuntimeHelper.downcallHandle(
        constants$783.__glutCreateMenuWithExit$func$FUNC
    );
}


