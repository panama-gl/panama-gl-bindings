// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$4 {

    static final FunctionDescriptor glGenerateMipmap$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glGenerateMipmap$MH = RuntimeHelper.downcallHandle(
        "glGenerateMipmap",
        constants$4.glGenerateMipmap$FUNC
    );
    static final FunctionDescriptor glBlitFramebuffer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBlitFramebuffer$MH = RuntimeHelper.downcallHandle(
        "glBlitFramebuffer",
        constants$4.glBlitFramebuffer$FUNC
    );
    static final FunctionDescriptor glRenderbufferStorageMultisample$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glRenderbufferStorageMultisample$MH = RuntimeHelper.downcallHandle(
        "glRenderbufferStorageMultisample",
        constants$4.glRenderbufferStorageMultisample$FUNC
    );
    static final FunctionDescriptor glFramebufferTextureLayer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glFramebufferTextureLayer$MH = RuntimeHelper.downcallHandle(
        "glFramebufferTextureLayer",
        constants$4.glFramebufferTextureLayer$FUNC
    );
    static final FunctionDescriptor glVertexAttribDivisorARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glVertexAttribDivisorARB$MH = RuntimeHelper.downcallHandle(
        "glVertexAttribDivisorARB",
        constants$4.glVertexAttribDivisorARB$FUNC
    );
    static final FunctionDescriptor glSampleCoverageARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glSampleCoverageARB$MH = RuntimeHelper.downcallHandle(
        "glSampleCoverageARB",
        constants$4.glSampleCoverageARB$FUNC
    );
}


