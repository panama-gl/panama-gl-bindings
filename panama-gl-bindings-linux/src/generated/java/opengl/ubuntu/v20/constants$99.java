// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$99 {

    static final FunctionDescriptor PFNGLSECONDARYCOLOR3UBVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3UBVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$99.PFNGLSECONDARYCOLOR3UBVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3UIPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$99.PFNGLSECONDARYCOLOR3UIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3UIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3UIVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$99.PFNGLSECONDARYCOLOR3UIVPROC$FUNC, false
    );
}

