// Generated by jextract

package opengl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1 {

    static final FunctionDescriptor glDrawArraysInstancedARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDrawArraysInstancedARB$MH = RuntimeHelper.downcallHandle(
        "glDrawArraysInstancedARB",
        constants$1.glDrawArraysInstancedARB$FUNC
    );
    static final FunctionDescriptor glDrawElementsInstancedARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDrawElementsInstancedARB$MH = RuntimeHelper.downcallHandle(
        "glDrawElementsInstancedARB",
        constants$1.glDrawElementsInstancedARB$FUNC
    );
    static final FunctionDescriptor glIsRenderbuffer$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsRenderbuffer$MH = RuntimeHelper.downcallHandle(
        "glIsRenderbuffer",
        constants$1.glIsRenderbuffer$FUNC
    );
    static final FunctionDescriptor glBindRenderbuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBindRenderbuffer$MH = RuntimeHelper.downcallHandle(
        "glBindRenderbuffer",
        constants$1.glBindRenderbuffer$FUNC
    );
    static final FunctionDescriptor glDeleteRenderbuffers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteRenderbuffers$MH = RuntimeHelper.downcallHandle(
        "glDeleteRenderbuffers",
        constants$1.glDeleteRenderbuffers$FUNC
    );
    static final FunctionDescriptor glGenRenderbuffers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGenRenderbuffers$MH = RuntimeHelper.downcallHandle(
        "glGenRenderbuffers",
        constants$1.glGenRenderbuffers$FUNC
    );
}


