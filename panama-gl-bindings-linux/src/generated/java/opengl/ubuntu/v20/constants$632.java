// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$632 {

    static final FunctionDescriptor PFNGLGETUNIFORMUIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETUNIFORMUIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$632.PFNGLGETUNIFORMUIVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDFRAGDATALOCATIONEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLBINDFRAGDATALOCATIONEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$632.PFNGLBINDFRAGDATALOCATIONEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETFRAGDATALOCATIONEXTPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETFRAGDATALOCATIONEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$632.PFNGLGETFRAGDATALOCATIONEXTPROC$FUNC, false
    );
}


