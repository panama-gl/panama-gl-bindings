// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$187 {

    static final FunctionDescriptor PFNGLSAMPLERPARAMETERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSAMPLERPARAMETERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$187.PFNGLSAMPLERPARAMETERIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSAMPLERPARAMETERFPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLSAMPLERPARAMETERFPROC$MH = RuntimeHelper.downcallHandle(
        "(IIF)V",
        constants$187.PFNGLSAMPLERPARAMETERFPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSAMPLERPARAMETERFVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSAMPLERPARAMETERFVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$187.PFNGLSAMPLERPARAMETERFVPROC$FUNC, false
    );
}


