// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$272 {

    static final FunctionDescriptor PFNGLSAMPLERPARAMETERIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSAMPLERPARAMETERIPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$272.PFNGLSAMPLERPARAMETERIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSAMPLERPARAMETERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSAMPLERPARAMETERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$272.PFNGLSAMPLERPARAMETERIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSAMPLERPARAMETERFPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLSAMPLERPARAMETERFPROC$MH = RuntimeHelper.downcallHandle(
        "(IIF)V",
        constants$272.PFNGLSAMPLERPARAMETERFPROC$FUNC, false
    );
}

