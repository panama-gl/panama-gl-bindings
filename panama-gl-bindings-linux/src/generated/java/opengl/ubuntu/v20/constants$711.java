// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$711 {

    static final FunctionDescriptor PFNGLFRAMEBUFFERPARAMETERIMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLFRAMEBUFFERPARAMETERIMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$711.PFNGLFRAMEBUFFERPARAMETERIMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETFRAMEBUFFERPARAMETERIVMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETFRAMEBUFFERPARAMETERIVMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$711.PFNGLGETFRAMEBUFFERPARAMETERIVMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLRESIZEBUFFERSMESAPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLRESIZEBUFFERSMESAPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$711.PFNGLRESIZEBUFFERSMESAPROC$FUNC, false
    );
}

