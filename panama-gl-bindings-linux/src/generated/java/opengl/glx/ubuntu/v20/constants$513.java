// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$513 {

    static final FunctionDescriptor PFNGLCONVOLUTIONPARAMETERXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCONVOLUTIONPARAMETERXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$513.PFNGLCONVOLUTIONPARAMETERXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCONVOLUTIONPARAMETERXVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCONVOLUTIONPARAMETERXVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$513.PFNGLCONVOLUTIONPARAMETERXVOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLEVALCOORD1XOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLEVALCOORD1XOESPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$513.PFNGLEVALCOORD1XOESPROC$FUNC, false
    );
}

