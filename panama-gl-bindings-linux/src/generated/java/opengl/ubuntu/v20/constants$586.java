// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$586 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM3UIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM3UIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$586.PFNGLPROGRAMUNIFORM3UIVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4UIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4UIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$586.PFNGLPROGRAMUNIFORM4UIVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$586.PFNGLNAMEDPROGRAMLOCALPARAMETERS4FVEXTPROC$FUNC, false
    );
}


