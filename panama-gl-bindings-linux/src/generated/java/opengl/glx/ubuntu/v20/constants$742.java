// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$742 {

    static final FunctionDescriptor PFNGLSECONDARYCOLOR3IEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3IEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$742.PFNGLSECONDARYCOLOR3IEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3IVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3IVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$742.PFNGLSECONDARYCOLOR3IVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3SEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3SEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(SSS)V",
        constants$742.PFNGLSECONDARYCOLOR3SEXTPROC$FUNC, false
    );
}

