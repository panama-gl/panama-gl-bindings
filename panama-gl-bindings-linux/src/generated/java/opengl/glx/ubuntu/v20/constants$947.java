// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$947 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB2SVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB2SVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$947.PFNGLVERTEXATTRIB2SVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB3DNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIB3DNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IDDD)V",
        constants$947.PFNGLVERTEXATTRIB3DNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB3DVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB3DVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$947.PFNGLVERTEXATTRIB3DVNVPROC$FUNC, false
    );
}


