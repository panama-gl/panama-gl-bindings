// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$718 {

    static final FunctionDescriptor PFNGLWINDOWPOS4FMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLWINDOWPOS4FMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(FFFF)V",
        constants$718.PFNGLWINDOWPOS4FMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS4FVMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS4FVMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$718.PFNGLWINDOWPOS4FVMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS4IMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLWINDOWPOS4IMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$718.PFNGLWINDOWPOS4IMESAPROC$FUNC, false
    );
}

