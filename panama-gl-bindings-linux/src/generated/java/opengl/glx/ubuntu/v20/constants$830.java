// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$830 {

    static final FunctionDescriptor PFNGLGETMAPPARAMETERFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETMAPPARAMETERFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$830.PFNGLGETMAPPARAMETERFVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETMAPATTRIBPARAMETERIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETMAPATTRIBPARAMETERIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$830.PFNGLGETMAPATTRIBPARAMETERIVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETMAPATTRIBPARAMETERFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETMAPATTRIBPARAMETERFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$830.PFNGLGETMAPATTRIBPARAMETERFVNVPROC$FUNC, false
    );
}

