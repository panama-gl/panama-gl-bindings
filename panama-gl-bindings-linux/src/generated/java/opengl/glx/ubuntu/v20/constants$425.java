// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$425 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM3I64VARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM3I64VARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$425.PFNGLPROGRAMUNIFORM3I64VARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4I64VARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4I64VARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$425.PFNGLPROGRAMUNIFORM4I64VARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1UI64ARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1UI64ARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJ)V",
        constants$425.PFNGLPROGRAMUNIFORM1UI64ARBPROC$FUNC, false
    );
}


