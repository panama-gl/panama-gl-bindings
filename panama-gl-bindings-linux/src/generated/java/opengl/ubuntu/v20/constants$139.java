// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$139 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB4NUBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR,
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLVERTEXATTRIB4NUBPROC$MH = RuntimeHelper.downcallHandle(
        "(IBBBB)V",
        constants$139.PFNGLVERTEXATTRIB4NUBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB4NUBVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB4NUBVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$139.PFNGLVERTEXATTRIB4NUBVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB4NUIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB4NUIVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$139.PFNGLVERTEXATTRIB4NUIVPROC$FUNC, false
    );
}


