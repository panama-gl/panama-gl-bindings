// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$464 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4I64VNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4I64VNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$464.PFNGLPROGRAMUNIFORM4I64VNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1UI64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1UI64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJ)V",
        constants$464.PFNGLPROGRAMUNIFORM1UI64NVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM2UI64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM2UI64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJJ)V",
        constants$464.PFNGLPROGRAMUNIFORM2UI64NVPROC$FUNC, false
    );
}


