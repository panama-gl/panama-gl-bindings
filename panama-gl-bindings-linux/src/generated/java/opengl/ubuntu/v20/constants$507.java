// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$507 {

    static final FunctionDescriptor PFNGLVERTEXSTREAM3IVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM3IVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$507.PFNGLVERTEXSTREAM3IVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM3FATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXSTREAM3FATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFF)V",
        constants$507.PFNGLVERTEXSTREAM3FATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM3FVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM3FVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$507.PFNGLVERTEXSTREAM3FVATIPROC$FUNC, false
    );
}


