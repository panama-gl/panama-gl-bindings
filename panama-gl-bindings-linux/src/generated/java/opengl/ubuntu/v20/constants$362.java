// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$362 {

    static final FunctionDescriptor PFNGLUNIFORM3FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLUNIFORM3FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFF)V",
        constants$362.PFNGLUNIFORM3FARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM4FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLUNIFORM4FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFFF)V",
        constants$362.PFNGLUNIFORM4FARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM1IARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNIFORM1IARBPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$362.PFNGLUNIFORM1IARBPROC$FUNC, false
    );
}

