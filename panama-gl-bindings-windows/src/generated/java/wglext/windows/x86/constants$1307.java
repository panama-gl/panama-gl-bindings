// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1307 {

    static final FunctionDescriptor glFeedbackBuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glFeedbackBuffer$MH = RuntimeHelper.downcallHandle(
        "glFeedbackBuffer",
        constants$1307.glFeedbackBuffer$FUNC
    );
    static final FunctionDescriptor glFinish$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glFinish$MH = RuntimeHelper.downcallHandle(
        "glFinish",
        constants$1307.glFinish$FUNC
    );
    static final FunctionDescriptor glFlush$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glFlush$MH = RuntimeHelper.downcallHandle(
        "glFlush",
        constants$1307.glFlush$FUNC
    );
    static final FunctionDescriptor glFogf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glFogf$MH = RuntimeHelper.downcallHandle(
        "glFogf",
        constants$1307.glFogf$FUNC
    );
    static final FunctionDescriptor glFogfv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glFogfv$MH = RuntimeHelper.downcallHandle(
        "glFogfv",
        constants$1307.glFogfv$FUNC
    );
    static final FunctionDescriptor glFogi$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glFogi$MH = RuntimeHelper.downcallHandle(
        "glFogi",
        constants$1307.glFogi$FUNC
    );
}


