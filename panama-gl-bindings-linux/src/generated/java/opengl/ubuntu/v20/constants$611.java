// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$611 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM3DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM3DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIDDD)V",
        constants$611.PFNGLPROGRAMUNIFORM3DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIDDDD)V",
        constants$611.PFNGLPROGRAMUNIFORM4DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1DVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1DVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$611.PFNGLPROGRAMUNIFORM1DVEXTPROC$FUNC, false
    );
}


