// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$110 {

    static final FunctionDescriptor PFNGLDELETEBUFFERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETEBUFFERSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$110.PFNGLDELETEBUFFERSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENBUFFERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENBUFFERSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$110.PFNGLGENBUFFERSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISBUFFERPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$110.PFNGLISBUFFERPROC$FUNC, false
    );
}


