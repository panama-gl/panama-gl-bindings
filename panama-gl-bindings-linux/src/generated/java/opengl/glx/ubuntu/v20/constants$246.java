// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$246 {

    static final FunctionDescriptor PFNGLUNIFORM3UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNIFORM3UIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$246.PFNGLUNIFORM3UIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM4UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNIFORM4UIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$246.PFNGLUNIFORM4UIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM1UIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM1UIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$246.PFNGLUNIFORM1UIVPROC$FUNC, false
    );
}


