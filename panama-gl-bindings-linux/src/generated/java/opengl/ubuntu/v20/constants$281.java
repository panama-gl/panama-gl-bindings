// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$281 {

    static final FunctionDescriptor PFNGLCLEARNAMEDFRAMEBUFFERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCLEARNAMEDFRAMEBUFFERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$281.PFNGLCLEARNAMEDFRAMEBUFFERIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$281.PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLEARNAMEDFRAMEBUFFERFVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCLEARNAMEDFRAMEBUFFERFVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$281.PFNGLCLEARNAMEDFRAMEBUFFERFVPROC$FUNC, false
    );
}

