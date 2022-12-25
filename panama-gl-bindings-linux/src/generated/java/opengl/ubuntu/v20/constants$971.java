// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_LONG_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$971 {

    static final FunctionDescriptor strtoll$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle strtoll$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "strtoll",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)J",
        constants$971.strtoll$FUNC, false
    );
    static final FunctionDescriptor strtoull$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle strtoull$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "strtoull",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)J",
        constants$971.strtoull$FUNC, false
    );
    static final FunctionDescriptor l64a$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG
    );
    static final MethodHandle l64a$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "l64a",
        "(J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$971.l64a$FUNC, false
    );
    static final FunctionDescriptor a64l$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle a64l$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "a64l",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$971.a64l$FUNC, false
    );
    static final FunctionDescriptor __bswap_16$FUNC = FunctionDescriptor.of(C_SHORT,
        C_SHORT
    );
    static final MethodHandle __bswap_16$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "__bswap_16",
        "(S)S",
        constants$971.__bswap_16$FUNC, false
    );
    static final FunctionDescriptor __bswap_32$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle __bswap_32$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "__bswap_32",
        "(I)I",
        constants$971.__bswap_32$FUNC, false
    );
}


