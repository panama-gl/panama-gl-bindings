// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$188 {

    static final FunctionDescriptor PFNGLSAMPLERPARAMETERIIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSAMPLERPARAMETERIIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$188.PFNGLSAMPLERPARAMETERIIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSAMPLERPARAMETERIUIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSAMPLERPARAMETERIUIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$188.PFNGLSAMPLERPARAMETERIUIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETSAMPLERPARAMETERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETSAMPLERPARAMETERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$188.PFNGLGETSAMPLERPARAMETERIVPROC$FUNC, false
    );
}


