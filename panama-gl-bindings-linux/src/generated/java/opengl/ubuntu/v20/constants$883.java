// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$883 {

    static final FunctionDescriptor PFNGLFRAMEBUFFERTEXTUREMULTIVIEWOVRPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLFRAMEBUFFERTEXTUREMULTIVIEWOVRPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIII)V",
        constants$883.PFNGLFRAMEBUFFERTEXTUREMULTIVIEWOVRPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLHINTPGIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLHINTPGIPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$883.PFNGLHINTPGIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDETAILTEXFUNCSGISPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDETAILTEXFUNCSGISPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$883.PFNGLDETAILTEXFUNCSGISPROC$FUNC, false
    );
}


