// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$973 {

    static final FunctionDescriptor PFNGLPOINTPARAMETERFSGISPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPOINTPARAMETERFSGISPROC$MH = RuntimeHelper.downcallHandle(
        "(IF)V",
        constants$973.PFNGLPOINTPARAMETERFSGISPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPOINTPARAMETERFVSGISPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPOINTPARAMETERFVSGISPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$973.PFNGLPOINTPARAMETERFVSGISPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSHARPENTEXFUNCSGISPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSHARPENTEXFUNCSGISPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$973.PFNGLSHARPENTEXFUNCSGISPROC$FUNC, false
    );
}


