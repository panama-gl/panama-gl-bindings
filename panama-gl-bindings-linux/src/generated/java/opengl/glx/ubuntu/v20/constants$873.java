// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$873 {

    static final FunctionDescriptor PFNGLPATHCOORDSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPATHCOORDSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$873.PFNGLPATHCOORDSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPATHSUBCOMMANDSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPATHSUBCOMMANDSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$873.PFNGLPATHSUBCOMMANDSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPATHSUBCOORDSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPATHSUBCOORDSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$873.PFNGLPATHSUBCOORDSNVPROC$FUNC, false
    );
}


