// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$829 {

    static final FunctionDescriptor PFNGLMAPPARAMETERFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMAPPARAMETERFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$829.PFNGLMAPPARAMETERFVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETMAPCONTROLPOINTSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLGETMAPCONTROLPOINTSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$829.PFNGLGETMAPCONTROLPOINTSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETMAPPARAMETERIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETMAPPARAMETERIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$829.PFNGLGETMAPPARAMETERIVNVPROC$FUNC, false
    );
}

