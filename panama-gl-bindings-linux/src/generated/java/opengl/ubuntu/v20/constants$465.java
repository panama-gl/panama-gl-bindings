// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$465 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM3UI64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM3UI64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJJJ)V",
        constants$465.PFNGLPROGRAMUNIFORM3UI64NVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4UI64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4UI64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJJJJ)V",
        constants$465.PFNGLPROGRAMUNIFORM4UI64NVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1UI64VNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1UI64VNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$465.PFNGLPROGRAMUNIFORM1UI64VNVPROC$FUNC, false
    );
}

