// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$595 {

    static final FunctionDescriptor PFNGLVERTEXSTREAM4IVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM4IVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$595.PFNGLVERTEXSTREAM4IVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM4FATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXSTREAM4FATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFFF)V",
        constants$595.PFNGLVERTEXSTREAM4FATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM4FVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM4FVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$595.PFNGLVERTEXSTREAM4FVATIPROC$FUNC, false
    );
}


