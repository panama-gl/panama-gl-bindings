// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1045 {

    static final FunctionDescriptor PFNGLXRELEASEVIDEOIMAGENVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle PFNGLXRELEASEVIDEOIMAGENVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$1045.PFNGLXRELEASEVIDEOIMAGENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXSENDPBUFFERTOVIDEONVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_INT,
        C_POINTER,
        C_CHAR
    );
    static final MethodHandle PFNGLXSENDPBUFFERTOVIDEONVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;JILjdk/incubator/foreign/MemoryAddress;B)I",
        constants$1045.PFNGLXSENDPBUFFERTOVIDEONVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXGETVIDEOINFONVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLXGETVIDEOINFONVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1045.PFNGLXGETVIDEOINFONVPROC$FUNC, false
    );
    static final FunctionDescriptor imaxabs$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG
    );
    static final MethodHandle imaxabs$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "imaxabs",
        "(J)J",
        constants$1045.imaxabs$FUNC, false
    );
}

