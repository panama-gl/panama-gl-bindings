// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1053 {

    static final FunctionDescriptor PFNGLXQUERYHYPERPIPEATTRIBSGIXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLXQUERYHYPERPIPEATTRIBSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1053.PFNGLXQUERYHYPERPIPEATTRIBSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXCREATEGLXPBUFFERSGIXPROC$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLXCREATEGLXPBUFFERSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)J",
        constants$1053.PFNGLXCREATEGLXPBUFFERSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXDESTROYGLXPBUFFERSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG
    );
    static final MethodHandle PFNGLXDESTROYGLXPBUFFERSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;J)V",
        constants$1053.PFNGLXDESTROYGLXPBUFFERSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXQUERYGLXPBUFFERSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_INT,
        C_POINTER
    );
}


