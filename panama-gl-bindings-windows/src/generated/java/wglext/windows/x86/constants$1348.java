// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1348 {

    static final FunctionDescriptor glVertexPointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glVertexPointer$MH = RuntimeHelper.downcallHandle(
        "glVertexPointer",
        constants$1348.glVertexPointer$FUNC
    );
    static final FunctionDescriptor glViewport$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glViewport$MH = RuntimeHelper.downcallHandle(
        "glViewport",
        constants$1348.glViewport$FUNC
    );
    static final FunctionDescriptor PFNGLARRAYELEMENTEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFNGLARRAYELEMENTEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$1348.PFNGLARRAYELEMENTEXTPROC$FUNC
    );
    static final FunctionDescriptor PFNGLDRAWARRAYSEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFNGLDRAWARRAYSEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$1348.PFNGLDRAWARRAYSEXTPROC$FUNC
    );
}

