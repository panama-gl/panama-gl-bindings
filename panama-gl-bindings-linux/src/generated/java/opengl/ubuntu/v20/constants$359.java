// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$359 {

    static final FunctionDescriptor PFNGLSHADERSOURCEARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLSHADERSOURCEARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$359.PFNGLSHADERSOURCEARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMPILESHADERARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLCOMPILESHADERARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$359.PFNGLCOMPILESHADERARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCREATEPROGRAMOBJECTARBPROC$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle PFNGLCREATEPROGRAMOBJECTARBPROC$MH = RuntimeHelper.downcallHandle(
        "()I",
        constants$359.PFNGLCREATEPROGRAMOBJECTARBPROC$FUNC, false
    );
}


