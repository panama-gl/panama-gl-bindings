// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$903 {

    static final FunctionDescriptor PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$903.PFNGLGETCOMBINERSTAGEPARAMETERFVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$903.PFNGLFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$903.PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$FUNC, false
    );
}

