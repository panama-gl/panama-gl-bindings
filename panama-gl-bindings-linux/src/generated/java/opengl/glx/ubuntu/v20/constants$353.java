// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$353 {

    static final FunctionDescriptor PFNGLCLEARTEXIMAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCLEARTEXIMAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$353.PFNGLCLEARTEXIMAGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLEARTEXSUBIMAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCLEARTEXSUBIMAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$353.PFNGLCLEARTEXSUBIMAGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDBUFFERSBASEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLBINDBUFFERSBASEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$353.PFNGLBINDBUFFERSBASEPROC$FUNC, false
    );
}

