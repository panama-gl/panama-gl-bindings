// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1040 {

    static final FunctionDescriptor PFNGLXBINDVIDEODEVICENVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLXBINDVIDEODEVICENVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1040.PFNGLXBINDVIDEODEVICENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXJOINSWAPGROUPNVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLXJOINSWAPGROUPNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;JI)I",
        constants$1040.PFNGLXJOINSWAPGROUPNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXBINDSWAPBARRIERNVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLXBINDSWAPBARRIERNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$1040.PFNGLXBINDSWAPBARRIERNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXQUERYSWAPGROUPNVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
}


