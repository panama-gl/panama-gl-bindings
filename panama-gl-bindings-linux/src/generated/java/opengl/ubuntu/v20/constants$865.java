// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$865 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB4FVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB4FVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$865.PFNGLVERTEXATTRIB4FVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB4SNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXATTRIB4SNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSSS)V",
        constants$865.PFNGLVERTEXATTRIB4SNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB4SVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB4SVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$865.PFNGLVERTEXATTRIB4SVNVPROC$FUNC, false
    );
}


