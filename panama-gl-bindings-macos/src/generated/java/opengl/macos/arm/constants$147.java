// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$147 {

    static final FunctionDescriptor glMapBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glMapBuffer$MH = RuntimeHelper.downcallHandle(
        "glMapBuffer",
        constants$147.glMapBuffer$FUNC
    );
    static final FunctionDescriptor glUnmapBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glUnmapBuffer$MH = RuntimeHelper.downcallHandle(
        "glUnmapBuffer",
        constants$147.glUnmapBuffer$FUNC
    );
    static final FunctionDescriptor glGetBufferParameteriv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetBufferParameteriv$MH = RuntimeHelper.downcallHandle(
        "glGetBufferParameteriv",
        constants$147.glGetBufferParameteriv$FUNC
    );
    static final FunctionDescriptor glGetBufferPointerv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetBufferPointerv$MH = RuntimeHelper.downcallHandle(
        "glGetBufferPointerv",
        constants$147.glGetBufferPointerv$FUNC
    );
    static final FunctionDescriptor glDrawBuffers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDrawBuffers$MH = RuntimeHelper.downcallHandle(
        "glDrawBuffers",
        constants$147.glDrawBuffers$FUNC
    );
    static final FunctionDescriptor glVertexAttrib1d$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle glVertexAttrib1d$MH = RuntimeHelper.downcallHandle(
        "glVertexAttrib1d",
        constants$147.glVertexAttrib1d$FUNC
    );
}

