// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$316 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM3FPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM3FPROC$MH = RuntimeHelper.downcallHandle(
        "(IIFFF)V",
        constants$316.PFNGLPROGRAMUNIFORM3FPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM3FVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM3FVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$316.PFNGLPROGRAMUNIFORM3FVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM3DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM3DPROC$MH = RuntimeHelper.downcallHandle(
        "(IIDDD)V",
        constants$316.PFNGLPROGRAMUNIFORM3DPROC$FUNC, false
    );
}


