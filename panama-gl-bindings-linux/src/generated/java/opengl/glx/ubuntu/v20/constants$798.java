// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$798 {

    static final FunctionDescriptor PFNGLWINDOWPOS2FMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLWINDOWPOS2FMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(FF)V",
        constants$798.PFNGLWINDOWPOS2FMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS2FVMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS2FVMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$798.PFNGLWINDOWPOS2FVMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS2IMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLWINDOWPOS2IMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$798.PFNGLWINDOWPOS2IMESAPROC$FUNC, false
    );
}

