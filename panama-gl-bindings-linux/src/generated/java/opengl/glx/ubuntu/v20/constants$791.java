// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$791 {

    static final FunctionDescriptor PFNGLUNMAPTEXTURE2DINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNMAPTEXTURE2DINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$791.PFNGLUNMAPTEXTURE2DINTELPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAPTEXTURE2DINTELPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLMAPTEXTURE2DINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$791.PFNGLMAPTEXTURE2DINTELPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXPOINTERVINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXPOINTERVINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$791.PFNGLVERTEXPOINTERVINTELPROC$FUNC, false
    );
}


