// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$790 {

    static final FunctionDescriptor PFNGLCOPYPATHNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOPYPATHNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$790.PFNGLCOPYPATHNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLINTERPOLATEPATHSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLINTERPOLATEPATHSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIF)V",
        constants$790.PFNGLINTERPOLATEPATHSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTRANSFORMPATHNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLTRANSFORMPATHNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$790.PFNGLTRANSFORMPATHNVPROC$FUNC, false
    );
}

