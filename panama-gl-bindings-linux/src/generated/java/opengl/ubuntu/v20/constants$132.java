// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$132 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB1DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIB1DPROC$MH = RuntimeHelper.downcallHandle(
        "(ID)V",
        constants$132.PFNGLVERTEXATTRIB1DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB1DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB1DVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$132.PFNGLVERTEXATTRIB1DVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB1FPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXATTRIB1FPROC$MH = RuntimeHelper.downcallHandle(
        "(IF)V",
        constants$132.PFNGLVERTEXATTRIB1FPROC$FUNC, false
    );
}

