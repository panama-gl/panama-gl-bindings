// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$363 {

    static final FunctionDescriptor PFNGLCREATEFRAMEBUFFERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCREATEFRAMEBUFFERSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$363.PFNGLCREATEFRAMEBUFFERSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$363.PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$363.PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC$FUNC, false
    );
}

