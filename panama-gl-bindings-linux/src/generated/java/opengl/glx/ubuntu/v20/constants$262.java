// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$262 {

    static final FunctionDescriptor PFNGLGETACTIVEUNIFORMNAMEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETACTIVEUNIFORMNAMEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$262.PFNGLGETACTIVEUNIFORMNAMEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETUNIFORMBLOCKINDEXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETUNIFORMBLOCKINDEXPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$262.PFNGLGETUNIFORMBLOCKINDEXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETACTIVEUNIFORMBLOCKIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETACTIVEUNIFORMBLOCKIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$262.PFNGLGETACTIVEUNIFORMBLOCKIVPROC$FUNC, false
    );
}


