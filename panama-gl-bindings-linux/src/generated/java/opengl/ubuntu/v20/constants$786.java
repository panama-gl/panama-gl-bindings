// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$786 {

    static final FunctionDescriptor PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$786.PFNGLPROGRAMBUFFERPARAMETERSIUIVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENPATHSNVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle PFNGLGENPATHSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)I",
        constants$786.PFNGLGENPATHSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEPATHSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDELETEPATHSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$786.PFNGLDELETEPATHSNVPROC$FUNC, false
    );
}


