// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$188 {

    static final FunctionDescriptor PFNGLWINDOWPOS2IVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS2IVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$188.PFNGLWINDOWPOS2IVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS2SPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLWINDOWPOS2SPROC$MH = RuntimeHelper.downcallHandle(
        "(SS)V",
        constants$188.PFNGLWINDOWPOS2SPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS2SVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS2SVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$188.PFNGLWINDOWPOS2SVPROC$FUNC, false
    );
}

