// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$324 {

    static final FunctionDescriptor PFNGLGENPROGRAMSARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENPROGRAMSARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$324.PFNGLGENPROGRAMSARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMENVPARAMETER4DARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLPROGRAMENVPARAMETER4DARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIDDDD)V",
        constants$324.PFNGLPROGRAMENVPARAMETER4DARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMENVPARAMETER4DVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMENVPARAMETER4DVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$324.PFNGLPROGRAMENVPARAMETER4DVARBPROC$FUNC, false
    );
}

