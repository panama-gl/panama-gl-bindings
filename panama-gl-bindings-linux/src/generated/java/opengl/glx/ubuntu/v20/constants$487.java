// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$487 {

    static final FunctionDescriptor PFNGLWINDOWPOS2IARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLWINDOWPOS2IARBPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$487.PFNGLWINDOWPOS2IARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS2IVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS2IVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$487.PFNGLWINDOWPOS2IVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS2SARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLWINDOWPOS2SARBPROC$MH = RuntimeHelper.downcallHandle(
        "(SS)V",
        constants$487.PFNGLWINDOWPOS2SARBPROC$FUNC, false
    );
}

