// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$212 {

    static final FunctionDescriptor glGetRenderbufferParameteriv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetRenderbufferParameteriv$MH = RuntimeHelper.downcallHandle(
        "glGetRenderbufferParameteriv",
        constants$212.glGetRenderbufferParameteriv$FUNC
    );
    static final FunctionDescriptor glIsFramebuffer$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsFramebuffer$MH = RuntimeHelper.downcallHandle(
        "glIsFramebuffer",
        constants$212.glIsFramebuffer$FUNC
    );
    static final FunctionDescriptor glBindFramebuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBindFramebuffer$MH = RuntimeHelper.downcallHandle(
        "glBindFramebuffer",
        constants$212.glBindFramebuffer$FUNC
    );
    static final FunctionDescriptor glDeleteFramebuffers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteFramebuffers$MH = RuntimeHelper.downcallHandle(
        "glDeleteFramebuffers",
        constants$212.glDeleteFramebuffers$FUNC
    );
    static final FunctionDescriptor glGenFramebuffers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGenFramebuffers$MH = RuntimeHelper.downcallHandle(
        "glGenFramebuffers",
        constants$212.glGenFramebuffers$FUNC
    );
    static final FunctionDescriptor glCheckFramebufferStatus$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glCheckFramebufferStatus$MH = RuntimeHelper.downcallHandle(
        "glCheckFramebufferStatus",
        constants$212.glCheckFramebufferStatus$FUNC
    );
}


