// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$182 {

    static final FunctionDescriptor PFNGLSECONDARYCOLOR3FPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3FPROC$MH = RuntimeHelper.downcallHandle(
        "(FFF)V",
        constants$182.PFNGLSECONDARYCOLOR3FPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3FVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3FVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$182.PFNGLSECONDARYCOLOR3FVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3IPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3IPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$182.PFNGLSECONDARYCOLOR3IPROC$FUNC, false
    );
}


