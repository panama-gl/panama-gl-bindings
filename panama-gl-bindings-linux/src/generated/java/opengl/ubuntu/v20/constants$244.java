// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$244 {

    static final FunctionDescriptor PFNGLVERTEXATTRIBL3DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIBL3DVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$244.PFNGLVERTEXATTRIBL3DVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBL4DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIBL4DVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$244.PFNGLVERTEXATTRIBL4DVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBLPOINTERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIBLPOINTERPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$244.PFNGLVERTEXATTRIBLPOINTERPROC$FUNC, false
    );
}

