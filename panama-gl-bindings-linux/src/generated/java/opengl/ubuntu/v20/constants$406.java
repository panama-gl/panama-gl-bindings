// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$406 {

    static final FunctionDescriptor PFNGLMAXSHADERCOMPILERTHREADSKHRPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLMAXSHADERCOMPILERTHREADSKHRPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$406.PFNGLMAXSHADERCOMPILERTHREADSKHRPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD1BOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR
    );
    static final MethodHandle PFNGLMULTITEXCOORD1BOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IB)V",
        constants$406.PFNGLMULTITEXCOORD1BOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD1BVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD1BVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$406.PFNGLMULTITEXCOORD1BVOESPROC$FUNC, false
    );
}


