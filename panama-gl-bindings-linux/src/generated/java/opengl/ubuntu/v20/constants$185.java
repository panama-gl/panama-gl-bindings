// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$185 {

    static final FunctionDescriptor PFNGLGETFRAGDATAINDEXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETFRAGDATAINDEXPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$185.PFNGLGETFRAGDATAINDEXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENSAMPLERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENSAMPLERSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$185.PFNGLGENSAMPLERSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETESAMPLERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETESAMPLERSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$185.PFNGLDELETESAMPLERSPROC$FUNC, false
    );
}


