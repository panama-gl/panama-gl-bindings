// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$111 {

    static final FunctionDescriptor PFNGLBUFFERDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLBUFFERDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IJLjdk/incubator/foreign/MemoryAddress;I)V",
        constants$111.PFNGLBUFFERDATAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBUFFERSUBDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle PFNGLBUFFERSUBDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJLjdk/incubator/foreign/MemoryAddress;)V",
        constants$111.PFNGLBUFFERSUBDATAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETBUFFERSUBDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle PFNGLGETBUFFERSUBDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJLjdk/incubator/foreign/MemoryAddress;)V",
        constants$111.PFNGLGETBUFFERSUBDATAPROC$FUNC, false
    );
}


