// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$784 {

    static final FunctionDescriptor __glutCreateMenuWithExit$exitfunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle __glutCreateMenuWithExit$exitfunc$MH = RuntimeHelper.downcallHandle(
        constants$784.__glutCreateMenuWithExit$exitfunc$FUNC
    );
    static final FunctionDescriptor __glutCreateMenuWithExit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __glutCreateMenuWithExit$MH = RuntimeHelper.downcallHandle(
        "__glutCreateMenuWithExit",
        constants$784.__glutCreateMenuWithExit$FUNC
    );
    static final FunctionDescriptor glutInit_ATEXIT_HACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutInit_ATEXIT_HACK$MH = RuntimeHelper.downcallHandle(
        "glutInit_ATEXIT_HACK",
        constants$784.glutInit_ATEXIT_HACK$FUNC
    );
    static final FunctionDescriptor glutCreateWindow_ATEXIT_HACK$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutCreateWindow_ATEXIT_HACK$MH = RuntimeHelper.downcallHandle(
        "glutCreateWindow_ATEXIT_HACK",
        constants$784.glutCreateWindow_ATEXIT_HACK$FUNC
    );
    static final FunctionDescriptor glutCreateMenu_ATEXIT_HACK$func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
}


