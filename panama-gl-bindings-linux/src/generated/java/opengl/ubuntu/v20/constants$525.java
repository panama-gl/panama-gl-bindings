// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$525 {

    static final FunctionDescriptor PFNGLTANGENT3DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLTANGENT3DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(DDD)V",
        constants$525.PFNGLTANGENT3DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTANGENT3DVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLTANGENT3DVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$525.PFNGLTANGENT3DVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTANGENT3FEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLTANGENT3FEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(FFF)V",
        constants$525.PFNGLTANGENT3FEXTPROC$FUNC, false
    );
}


