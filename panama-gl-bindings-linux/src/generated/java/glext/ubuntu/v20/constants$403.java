// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$403 {

    static final FunctionDescriptor glGetNamedBufferParameteriv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetNamedBufferParameteriv$MH = RuntimeHelper.downcallHandle(
        "glGetNamedBufferParameteriv",
        constants$403.glGetNamedBufferParameteriv$FUNC
    );
    static final FunctionDescriptor glGetNamedBufferParameteri64v$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetNamedBufferParameteri64v$MH = RuntimeHelper.downcallHandle(
        "glGetNamedBufferParameteri64v",
        constants$403.glGetNamedBufferParameteri64v$FUNC
    );
    static final FunctionDescriptor glGetNamedBufferPointerv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetNamedBufferPointerv$MH = RuntimeHelper.downcallHandle(
        "glGetNamedBufferPointerv",
        constants$403.glGetNamedBufferPointerv$FUNC
    );
    static final FunctionDescriptor glGetNamedBufferSubData$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetNamedBufferSubData$MH = RuntimeHelper.downcallHandle(
        "glGetNamedBufferSubData",
        constants$403.glGetNamedBufferSubData$FUNC
    );
    static final FunctionDescriptor glCreateFramebuffers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glCreateFramebuffers$MH = RuntimeHelper.downcallHandle(
        "glCreateFramebuffers",
        constants$403.glCreateFramebuffers$FUNC
    );
    static final FunctionDescriptor glNamedFramebufferRenderbuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glNamedFramebufferRenderbuffer$MH = RuntimeHelper.downcallHandle(
        "glNamedFramebufferRenderbuffer",
        constants$403.glNamedFramebufferRenderbuffer$FUNC
    );
}

