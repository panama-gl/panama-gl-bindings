// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$199 {

    static final FunctionDescriptor PFNGLDRAWBUFFERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDRAWBUFFERSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$199.PFNGLDRAWBUFFERSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSTENCILOPSEPARATEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSTENCILOPSEPARATEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$199.PFNGLSTENCILOPSEPARATEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSTENCILFUNCSEPARATEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSTENCILFUNCSEPARATEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$199.PFNGLSTENCILFUNCSEPARATEPROC$FUNC, false
    );
}


