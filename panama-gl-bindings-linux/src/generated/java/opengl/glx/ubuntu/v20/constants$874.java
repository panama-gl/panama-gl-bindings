// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$874 {

    static final FunctionDescriptor PFNGLPATHSTRINGNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPATHSTRINGNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$874.PFNGLPATHSTRINGNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPATHGLYPHSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPATHGLYPHSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;IIF)V",
        constants$874.PFNGLPATHGLYPHSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPATHGLYPHRANGENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPATHGLYPHRANGENVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;IIIIIF)V",
        constants$874.PFNGLPATHGLYPHRANGENVPROC$FUNC, false
    );
}

