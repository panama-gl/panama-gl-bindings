// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$124 {

    static final FunctionDescriptor PFNGLISSHADERPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISSHADERPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$124.PFNGLISSHADERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLLINKPROGRAMPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLLINKPROGRAMPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$124.PFNGLLINKPROGRAMPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSHADERSOURCEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLSHADERSOURCEPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$124.PFNGLSHADERSOURCEPROC$FUNC, false
    );
}

