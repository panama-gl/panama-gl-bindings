// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$431 {

    static final FunctionDescriptor PFNGLGETMAPXVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETMAPXVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$431.PFNGLGETMAPXVOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETMATERIALXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLGETMATERIALXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$431.PFNGLGETMATERIALXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPIXELMAPXVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPIXELMAPXVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$431.PFNGLGETPIXELMAPXVPROC$FUNC, false
    );
}


