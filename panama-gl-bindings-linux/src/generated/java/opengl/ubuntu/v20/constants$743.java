// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$743 {

    static final FunctionDescriptor PFNGLMAPCONTROLPOINTSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLMAPCONTROLPOINTSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$743.PFNGLMAPCONTROLPOINTSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAPPARAMETERIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMAPPARAMETERIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$743.PFNGLMAPPARAMETERIVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAPPARAMETERFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMAPPARAMETERFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$743.PFNGLMAPPARAMETERFVNVPROC$FUNC, false
    );
}

