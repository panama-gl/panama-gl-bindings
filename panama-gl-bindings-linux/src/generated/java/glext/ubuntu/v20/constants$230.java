// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$230 {

    static final FunctionDescriptor glGetBufferParameteri64v$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetBufferParameteri64v$MH = RuntimeHelper.downcallHandle(
        "glGetBufferParameteri64v",
        constants$230.glGetBufferParameteri64v$FUNC
    );
    static final FunctionDescriptor glFramebufferTexture$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glFramebufferTexture$MH = RuntimeHelper.downcallHandle(
        "glFramebufferTexture",
        constants$230.glFramebufferTexture$FUNC
    );
    static final FunctionDescriptor glTexImage2DMultisample$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glTexImage2DMultisample$MH = RuntimeHelper.downcallHandle(
        "glTexImage2DMultisample",
        constants$230.glTexImage2DMultisample$FUNC
    );
    static final FunctionDescriptor glTexImage3DMultisample$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glTexImage3DMultisample$MH = RuntimeHelper.downcallHandle(
        "glTexImage3DMultisample",
        constants$230.glTexImage3DMultisample$FUNC
    );
    static final FunctionDescriptor glGetMultisamplefv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetMultisamplefv$MH = RuntimeHelper.downcallHandle(
        "glGetMultisamplefv",
        constants$230.glGetMultisamplefv$FUNC
    );
    static final FunctionDescriptor glSampleMaski$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glSampleMaski$MH = RuntimeHelper.downcallHandle(
        "glSampleMaski",
        constants$230.glSampleMaski$FUNC
    );
}

