// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$384 {

    static final FunctionDescriptor PFNGLUNMAPBUFFERARBPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLUNMAPBUFFERARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$384.PFNGLUNMAPBUFFERARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETBUFFERPARAMETERIVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETBUFFERPARAMETERIVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$384.PFNGLGETBUFFERPARAMETERIVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETBUFFERPOINTERVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETBUFFERPOINTERVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$384.PFNGLGETBUFFERPOINTERVARBPROC$FUNC, false
    );
}

