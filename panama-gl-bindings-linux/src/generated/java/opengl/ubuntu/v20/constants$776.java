// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$776 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB2HNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXATTRIB2HNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ISS)V",
        constants$776.PFNGLVERTEXATTRIB2HNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB2HVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB2HVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$776.PFNGLVERTEXATTRIB2HVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB3HNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXATTRIB3HNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSS)V",
        constants$776.PFNGLVERTEXATTRIB3HNVPROC$FUNC, false
    );
}


