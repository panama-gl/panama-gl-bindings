// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$159 {

    static final FunctionDescriptor PFNGLGETUNIFORMUIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETUNIFORMUIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$159.PFNGLGETUNIFORMUIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDFRAGDATALOCATIONPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLBINDFRAGDATALOCATIONPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$159.PFNGLBINDFRAGDATALOCATIONPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETFRAGDATALOCATIONPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETFRAGDATALOCATIONPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$159.PFNGLGETFRAGDATALOCATIONPROC$FUNC, false
    );
}

