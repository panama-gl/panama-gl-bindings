// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1039 {

    static final FunctionDescriptor PFNGLXCOPYIMAGESUBDATANVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLXCOPYIMAGESUBDATANVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIIIIILjdk/incubator/foreign/MemoryAddress;IIIIIIIII)V",
        constants$1039.PFNGLXCOPYIMAGESUBDATANVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXDELAYBEFORESWAPNVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_FLOAT
    );
    static final MethodHandle PFNGLXDELAYBEFORESWAPNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;JF)I",
        constants$1039.PFNGLXDELAYBEFORESWAPNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXENUMERATEVIDEODEVICESNVPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLXENUMERATEVIDEODEVICESNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1039.PFNGLXENUMERATEVIDEODEVICESNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXBINDVIDEODEVICENVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
}

