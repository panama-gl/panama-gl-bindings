// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$196 {

    static final FunctionDescriptor PFNGLISBUFFERPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$196.PFNGLISBUFFERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBUFFERDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLBUFFERDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IJLjdk/incubator/foreign/MemoryAddress;I)V",
        constants$196.PFNGLBUFFERDATAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBUFFERSUBDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle PFNGLBUFFERSUBDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJLjdk/incubator/foreign/MemoryAddress;)V",
        constants$196.PFNGLBUFFERSUBDATAPROC$FUNC, false
    );
}


