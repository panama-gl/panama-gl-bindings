// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$330 {

    static final FunctionDescriptor PFNGLFRAMEBUFFERTEXTURELAYERARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLFRAMEBUFFERTEXTURELAYERARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$330.PFNGLFRAMEBUFFERTEXTURELAYERARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFRAMEBUFFERTEXTUREFACEARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLFRAMEBUFFERTEXTUREFACEARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$330.PFNGLFRAMEBUFFERTEXTUREFACEARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSPECIALIZESHADERARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLSPECIALIZESHADERARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$330.PFNGLSPECIALIZESHADERARBPROC$FUNC, false
    );
}

