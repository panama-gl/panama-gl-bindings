// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$743 {

    static final FunctionDescriptor PFNGLSECONDARYCOLOR3SVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3SVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$743.PFNGLSECONDARYCOLOR3SVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3UBEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3UBEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(BBB)V",
        constants$743.PFNGLSECONDARYCOLOR3UBEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3UBVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3UBVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$743.PFNGLSECONDARYCOLOR3UBVEXTPROC$FUNC, false
    );
}


