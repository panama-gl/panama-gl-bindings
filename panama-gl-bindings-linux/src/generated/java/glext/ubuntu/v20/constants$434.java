// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$434 {

    static final FunctionDescriptor glDebugMessageControlARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glDebugMessageControlARB$MH = RuntimeHelper.downcallHandle(
        "glDebugMessageControlARB",
        constants$434.glDebugMessageControlARB$FUNC
    );
    static final FunctionDescriptor glDebugMessageInsertARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDebugMessageInsertARB$MH = RuntimeHelper.downcallHandle(
        "glDebugMessageInsertARB",
        constants$434.glDebugMessageInsertARB$FUNC
    );
    static final FunctionDescriptor glDebugMessageCallbackARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDebugMessageCallbackARB$MH = RuntimeHelper.downcallHandle(
        "glDebugMessageCallbackARB",
        constants$434.glDebugMessageCallbackARB$FUNC
    );
    static final FunctionDescriptor glGetDebugMessageLogARB$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetDebugMessageLogARB$MH = RuntimeHelper.downcallHandle(
        "glGetDebugMessageLogARB",
        constants$434.glGetDebugMessageLogARB$FUNC
    );
    static final FunctionDescriptor PFNGLDRAWBUFFERSARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLDRAWBUFFERSARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$434.PFNGLDRAWBUFFERSARBPROC$FUNC
    );
}

