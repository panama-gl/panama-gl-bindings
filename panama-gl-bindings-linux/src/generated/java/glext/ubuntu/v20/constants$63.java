// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$63 {

    static final FunctionDescriptor glGetConvolutionParameterfv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetConvolutionParameterfv$MH = RuntimeHelper.downcallHandle(
        "glGetConvolutionParameterfv",
        constants$63.glGetConvolutionParameterfv$FUNC
    );
    static final FunctionDescriptor glGetConvolutionParameteriv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetConvolutionParameteriv$MH = RuntimeHelper.downcallHandle(
        "glGetConvolutionParameteriv",
        constants$63.glGetConvolutionParameteriv$FUNC
    );
    static final FunctionDescriptor glSeparableFilter2D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glSeparableFilter2D$MH = RuntimeHelper.downcallHandle(
        "glSeparableFilter2D",
        constants$63.glSeparableFilter2D$FUNC
    );
    static final FunctionDescriptor glGetSeparableFilter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetSeparableFilter$MH = RuntimeHelper.downcallHandle(
        "glGetSeparableFilter",
        constants$63.glGetSeparableFilter$FUNC
    );
    static final FunctionDescriptor glActiveTexture$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glActiveTexture$MH = RuntimeHelper.downcallHandle(
        "glActiveTexture",
        constants$63.glActiveTexture$FUNC
    );
    static final FunctionDescriptor glClientActiveTexture$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glClientActiveTexture$MH = RuntimeHelper.downcallHandle(
        "glClientActiveTexture",
        constants$63.glClientActiveTexture$FUNC
    );
}


