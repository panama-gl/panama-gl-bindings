// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$749 {

    static final FunctionDescriptor PFNGLSETFENCENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSETFENCENVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$749.PFNGLSETFENCENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFRAGMENTCOVERAGECOLORNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLFRAGMENTCOVERAGECOLORNVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$749.PFNGLFRAGMENTCOVERAGECOLORNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMNAMEDPARAMETER4FNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPROGRAMNAMEDPARAMETER4FNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;FFFF)V",
        constants$749.PFNGLPROGRAMNAMEDPARAMETER4FNVPROC$FUNC, false
    );
}


