// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$246 {

    static final FunctionDescriptor PFNGLVIEWPORTINDEXEDFVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVIEWPORTINDEXEDFVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$246.PFNGLVIEWPORTINDEXEDFVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSCISSORARRAYVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSCISSORARRAYVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$246.PFNGLSCISSORARRAYVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSCISSORINDEXEDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSCISSORINDEXEDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$246.PFNGLSCISSORINDEXEDPROC$FUNC, false
    );
}


