// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$821 {

    static final FunctionDescriptor PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$821.PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISNAMEDBUFFERRESIDENTNVPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISNAMEDBUFFERRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$821.PFNGLISNAMEDBUFFERRESIDENTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETBUFFERPARAMETERUI64VNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETBUFFERPARAMETERUI64VNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$821.PFNGLGETBUFFERPARAMETERUI64VNVPROC$FUNC, false
    );
}


