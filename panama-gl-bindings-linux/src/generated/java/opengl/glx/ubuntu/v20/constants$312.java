// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$312 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1UIPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$312.PFNGLPROGRAMUNIFORM1UIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1UIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1UIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$312.PFNGLPROGRAMUNIFORM1UIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM2IPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM2IPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$312.PFNGLPROGRAMUNIFORM2IPROC$FUNC, false
    );
}


