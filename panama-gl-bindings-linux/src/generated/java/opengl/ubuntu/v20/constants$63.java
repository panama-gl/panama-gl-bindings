// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$63 {

    static final FunctionDescriptor glGetConvolutionParameterfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetConvolutionParameterfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetConvolutionParameterfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$63.glGetConvolutionParameterfv$FUNC, false
    );
    static final FunctionDescriptor glGetConvolutionParameteriv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetConvolutionParameteriv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetConvolutionParameteriv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$63.glGetConvolutionParameteriv$FUNC, false
    );
    static final FunctionDescriptor glSeparableFilter2D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glSeparableFilter2D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSeparableFilter2D",
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$63.glSeparableFilter2D$FUNC, false
    );
    static final FunctionDescriptor glGetSeparableFilter$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glGetSeparableFilter$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetSeparableFilter",
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$63.glGetSeparableFilter$FUNC, false
    );
    static final FunctionDescriptor glActiveTexture$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glActiveTexture$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glActiveTexture",
        "(I)V",
        constants$63.glActiveTexture$FUNC, false
    );
    static final FunctionDescriptor glClientActiveTexture$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glClientActiveTexture$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClientActiveTexture",
        "(I)V",
        constants$63.glClientActiveTexture$FUNC, false
    );
}


