// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$268 {

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
        constants$268.PFNGLCLEARTEXSUBIMAGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDBUFFERSBASEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLBINDBUFFERSBASEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$268.PFNGLBINDBUFFERSBASEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDBUFFERSRANGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLBINDBUFFERSRANGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$268.PFNGLBINDBUFFERSRANGEPROC$FUNC, false
    );
}

