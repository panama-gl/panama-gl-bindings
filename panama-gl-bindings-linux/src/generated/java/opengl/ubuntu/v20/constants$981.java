// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$981 {

    static final FunctionDescriptor exit$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle exit$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "exit",
        "(I)V",
        constants$981.exit$FUNC, false
    );
    static final FunctionDescriptor quick_exit$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle quick_exit$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "quick_exit",
        "(I)V",
        constants$981.quick_exit$FUNC, false
    );
    static final FunctionDescriptor _Exit$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle _Exit$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "_Exit",
        "(I)V",
        constants$981._Exit$FUNC, false
    );
    static final FunctionDescriptor getenv$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle getenv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "getenv",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$981.getenv$FUNC, false
    );
    static final FunctionDescriptor putenv$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle putenv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "putenv",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$981.putenv$FUNC, false
    );
    static final FunctionDescriptor setenv$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle setenv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "setenv",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$981.setenv$FUNC, false
    );
}


