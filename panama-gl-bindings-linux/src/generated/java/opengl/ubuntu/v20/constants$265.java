// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$265 {

    static final FunctionDescriptor PFNGLGETDEBUGMESSAGELOGPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETDEBUGMESSAGELOGPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$265.PFNGLGETDEBUGMESSAGELOGPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPUSHDEBUGGROUPPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPUSHDEBUGGROUPPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$265.PFNGLPUSHDEBUGGROUPPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPOPDEBUGGROUPPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLPOPDEBUGGROUPPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$265.PFNGLPOPDEBUGGROUPPROC$FUNC, false
    );
}


