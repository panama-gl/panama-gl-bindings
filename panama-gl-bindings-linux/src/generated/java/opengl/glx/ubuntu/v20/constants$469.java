// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$469 {

    static final FunctionDescriptor PFNGLMAPBUFFERARBPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMAPBUFFERARBPROC$MH = RuntimeHelper.downcallHandle(
        "(II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$469.PFNGLMAPBUFFERARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNMAPBUFFERARBPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLUNMAPBUFFERARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$469.PFNGLUNMAPBUFFERARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETBUFFERPARAMETERIVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETBUFFERPARAMETERIVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$469.PFNGLGETBUFFERPARAMETERIVARBPROC$FUNC, false
    );
}

