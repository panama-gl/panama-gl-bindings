// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$611 {

    static final FunctionDescriptor PFNGLTANGENT3FEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLTANGENT3FEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(FFF)V",
        constants$611.PFNGLTANGENT3FEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTANGENT3FVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLTANGENT3FVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$611.PFNGLTANGENT3FVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTANGENT3IEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLTANGENT3IEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$611.PFNGLTANGENT3IEXTPROC$FUNC, false
    );
}


