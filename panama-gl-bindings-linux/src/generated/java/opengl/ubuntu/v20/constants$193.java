// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$193 {

    static final FunctionDescriptor PFNGLVERTEXATTRIBP3UIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIBP3UIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$193.PFNGLVERTEXATTRIBP3UIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBP4UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXATTRIBP4UIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIBI)V",
        constants$193.PFNGLVERTEXATTRIBP4UIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBP4UIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIBP4UIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$193.PFNGLVERTEXATTRIBP4UIVPROC$FUNC, false
    );
}


