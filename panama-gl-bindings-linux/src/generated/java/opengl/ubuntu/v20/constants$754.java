// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$754 {

    static final FunctionDescriptor PFNGLRENDERGPUMASKNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLRENDERGPUMASKNVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$754.PFNGLRENDERGPUMASKNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTICASTBUFFERSUBDATANVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTICASTBUFFERSUBDATANVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJJLjdk/incubator/foreign/MemoryAddress;)V",
        constants$754.PFNGLMULTICASTBUFFERSUBDATANVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTICASTCOPYBUFFERSUBDATANVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLMULTICASTCOPYBUFFERSUBDATANVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIJJJ)V",
        constants$754.PFNGLMULTICASTCOPYBUFFERSUBDATANVPROC$FUNC, false
    );
}

