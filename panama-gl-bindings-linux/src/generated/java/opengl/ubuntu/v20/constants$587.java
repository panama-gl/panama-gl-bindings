// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$587 {

    static final FunctionDescriptor PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIII)V",
        constants$587.PFNGLNAMEDPROGRAMLOCALPARAMETERI4IEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDPROGRAMLOCALPARAMETERI4IVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLNAMEDPROGRAMLOCALPARAMETERI4IVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$587.PFNGLNAMEDPROGRAMLOCALPARAMETERI4IVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDPROGRAMLOCALPARAMETERSI4IVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLNAMEDPROGRAMLOCALPARAMETERSI4IVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$587.PFNGLNAMEDPROGRAMLOCALPARAMETERSI4IVEXTPROC$FUNC, false
    );
}


