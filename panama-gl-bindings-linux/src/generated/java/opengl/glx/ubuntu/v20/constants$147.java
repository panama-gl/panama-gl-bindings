// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$147 {

    static final FunctionDescriptor glConvolutionFilter2D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glConvolutionFilter2D$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glConvolutionFilter2D",
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$147.glConvolutionFilter2D$FUNC, false
    );
    static final FunctionDescriptor glConvolutionParameterf$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glConvolutionParameterf$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glConvolutionParameterf",
        "(IIF)V",
        constants$147.glConvolutionParameterf$FUNC, false
    );
    static final FunctionDescriptor glConvolutionParameterfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glConvolutionParameterfv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glConvolutionParameterfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$147.glConvolutionParameterfv$FUNC, false
    );
    static final FunctionDescriptor glConvolutionParameteri$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glConvolutionParameteri$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glConvolutionParameteri",
        "(III)V",
        constants$147.glConvolutionParameteri$FUNC, false
    );
    static final FunctionDescriptor glConvolutionParameteriv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glConvolutionParameteriv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glConvolutionParameteriv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$147.glConvolutionParameteriv$FUNC, false
    );
    static final FunctionDescriptor glCopyConvolutionFilter1D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glCopyConvolutionFilter1D$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glCopyConvolutionFilter1D",
        "(IIIII)V",
        constants$147.glCopyConvolutionFilter1D$FUNC, false
    );
}

