// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$873 {

    static final FunctionDescriptor PFNGLVERTEXATTRIBI3UIEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXATTRIBI3UIEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$873.PFNGLVERTEXATTRIBI3UIEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBI4UIEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXATTRIBI4UIEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$873.PFNGLVERTEXATTRIBI4UIEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBI1IVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIBI1IVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$873.PFNGLVERTEXATTRIBI1IVEXTPROC$FUNC, false
    );
}


