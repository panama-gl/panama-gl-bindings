// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$656 {

    static final FunctionDescriptor PFNGLMAPNAMEDBUFFEREXTPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMAPNAMEDBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$656.PFNGLMAPNAMEDBUFFEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNMAPNAMEDBUFFEREXTPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLUNMAPNAMEDBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$656.PFNGLUNMAPNAMEDBUFFEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$656.PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROC$FUNC, false
    );
}

