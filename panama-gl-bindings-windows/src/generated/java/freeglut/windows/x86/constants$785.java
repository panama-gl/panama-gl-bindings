// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$785 {

    static final FunctionDescriptor glutCreateMenu_ATEXIT_HACK$func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutCreateMenu_ATEXIT_HACK$func$MH = RuntimeHelper.downcallHandle(
        constants$785.glutCreateMenu_ATEXIT_HACK$func$FUNC
    );
    static final FunctionDescriptor glutCreateMenu_ATEXIT_HACK$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutCreateMenu_ATEXIT_HACK$MH = RuntimeHelper.downcallHandle(
        "glutCreateMenu_ATEXIT_HACK",
        constants$785.glutCreateMenu_ATEXIT_HACK$FUNC
    );
    static final FunctionDescriptor glutMainLoopEvent$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutMainLoopEvent$MH = RuntimeHelper.downcallHandle(
        "glutMainLoopEvent",
        constants$785.glutMainLoopEvent$FUNC
    );
    static final FunctionDescriptor glutLeaveMainLoop$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutLeaveMainLoop$MH = RuntimeHelper.downcallHandle(
        "glutLeaveMainLoop",
        constants$785.glutLeaveMainLoop$FUNC
    );
    static final FunctionDescriptor glutExit$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutExit$MH = RuntimeHelper.downcallHandle(
        "glutExit",
        constants$785.glutExit$FUNC
    );
    static final FunctionDescriptor glutFullScreenToggle$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutFullScreenToggle$MH = RuntimeHelper.downcallHandle(
        "glutFullScreenToggle",
        constants$785.glutFullScreenToggle$FUNC
    );
}

