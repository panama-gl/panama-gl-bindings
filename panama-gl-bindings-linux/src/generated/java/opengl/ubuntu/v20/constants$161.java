// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$161 {

    static final FunctionDescriptor PFNGLUNIFORM4UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNIFORM4UIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$161.PFNGLUNIFORM4UIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM1UIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM1UIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$161.PFNGLUNIFORM1UIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM2UIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM2UIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$161.PFNGLUNIFORM2UIVPROC$FUNC, false
    );
}

