// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$610 {

    static final FunctionDescriptor PFNGLTANGENT3BVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLTANGENT3BVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$610.PFNGLTANGENT3BVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTANGENT3DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLTANGENT3DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(DDD)V",
        constants$610.PFNGLTANGENT3DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTANGENT3DVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLTANGENT3DVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$610.PFNGLTANGENT3DVEXTPROC$FUNC, false
    );
}


