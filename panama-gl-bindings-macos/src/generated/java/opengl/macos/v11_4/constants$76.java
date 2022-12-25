// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$76 {

    static final FunctionDescriptor glColorSubTable$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glColorSubTable$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColorSubTable",
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$76.glColorSubTable$FUNC, false
    );
    static final FunctionDescriptor glColorTable$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glColorTable$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColorTable",
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$76.glColorTable$FUNC, false
    );
    static final FunctionDescriptor glColorTableParameterfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glColorTableParameterfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColorTableParameterfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$76.glColorTableParameterfv$FUNC, false
    );
    static final FunctionDescriptor glColorTableParameteriv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glColorTableParameteriv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColorTableParameteriv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$76.glColorTableParameteriv$FUNC, false
    );
    static final FunctionDescriptor glConvolutionFilter1D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glConvolutionFilter1D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glConvolutionFilter1D",
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$76.glConvolutionFilter1D$FUNC, false
    );
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
        glut_h.LIBRARIES, "glConvolutionFilter2D",
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$76.glConvolutionFilter2D$FUNC, false
    );
}


