// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$839 {

    static final FunctionDescriptor PFNGLFRAMEBUFFERTEXTUREFACEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLFRAMEBUFFERTEXTUREFACEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$839.PFNGLFRAMEBUFFERTEXTUREFACEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLRENDERGPUMASKNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLRENDERGPUMASKNVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$839.PFNGLRENDERGPUMASKNVPROC$FUNC, false
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
        constants$839.PFNGLMULTICASTBUFFERSUBDATANVPROC$FUNC, false
    );
}

