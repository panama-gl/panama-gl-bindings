// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$130 {

    static final FunctionDescriptor PFNGLUNIFORM3IVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM3IVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$130.PFNGLUNIFORM3IVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM4IVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM4IVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$130.PFNGLUNIFORM4IVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORMMATRIX2FVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORMMATRIX2FVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$130.PFNGLUNIFORMMATRIX2FVPROC$FUNC, false
    );
}

