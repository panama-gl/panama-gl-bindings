// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$142 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB4IVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB4IVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$142.PFNGLVERTEXATTRIB4IVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB4SPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXATTRIB4SPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSSS)V",
        constants$142.PFNGLVERTEXATTRIB4SPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB4SVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB4SVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$142.PFNGLVERTEXATTRIB4SVPROC$FUNC, false
    );
}


