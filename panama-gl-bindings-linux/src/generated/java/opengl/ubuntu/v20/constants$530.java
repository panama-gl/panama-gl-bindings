// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$530 {

    static final FunctionDescriptor PFNGLBINORMAL3IVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLBINORMAL3IVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$530.PFNGLBINORMAL3IVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINORMAL3SEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLBINORMAL3SEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(SSS)V",
        constants$530.PFNGLBINORMAL3SEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINORMAL3SVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLBINORMAL3SVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$530.PFNGLBINORMAL3SVEXTPROC$FUNC, false
    );
}

