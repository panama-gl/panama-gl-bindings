// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1033 {

    static final FunctionDescriptor PFNGLXIMPORTCONTEXTEXTPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle PFNGLXIMPORTCONTEXTEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1033.PFNGLXIMPORTCONTEXTEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXFREECONTEXTEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLXFREECONTEXTEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1033.PFNGLXFREECONTEXTEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXSWAPINTERVALEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLXSWAPINTERVALEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;JI)V",
        constants$1033.PFNGLXSWAPINTERVALEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXBINDTEXIMAGEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_INT,
        C_POINTER
    );
}

