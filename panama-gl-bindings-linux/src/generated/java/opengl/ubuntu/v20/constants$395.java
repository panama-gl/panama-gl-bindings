// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$395 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB4IVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB4IVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$395.PFNGLVERTEXATTRIB4IVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB4SARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXATTRIB4SARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSSS)V",
        constants$395.PFNGLVERTEXATTRIB4SARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB4SVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB4SVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$395.PFNGLVERTEXATTRIB4SVARBPROC$FUNC, false
    );
}


