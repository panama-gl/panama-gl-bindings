// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$849 {

    static final FunctionDescriptor PFNGLVERTEXATTRIBIFORMATNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXATTRIBIFORMATNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$849.PFNGLVERTEXATTRIBIFORMATNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETINTEGERUI64I_VNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETINTEGERUI64I_VNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$849.PFNGLGETINTEGERUI64I_VNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLAREPROGRAMSRESIDENTNVPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLAREPROGRAMSRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)B",
        constants$849.PFNGLAREPROGRAMSRESIDENTNVPROC$FUNC, false
    );
}


