// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$815 {

    static final FunctionDescriptor PFNGLFINALCOMBINERINPUTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLFINALCOMBINERINPUTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$815.PFNGLFINALCOMBINERINPUTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$815.PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETCOMBINERINPUTPARAMETERIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETCOMBINERINPUTPARAMETERIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$815.PFNGLGETCOMBINERINPUTPARAMETERIVNVPROC$FUNC, false
    );
}


