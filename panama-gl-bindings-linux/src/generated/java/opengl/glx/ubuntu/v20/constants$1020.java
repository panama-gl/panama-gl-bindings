// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1020 {

    static final FunctionDescriptor glXCreatePbuffer$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glXCreatePbuffer$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXCreatePbuffer",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$1020.glXCreatePbuffer$FUNC, false
    );
    static final FunctionDescriptor glXDestroyPbuffer$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG
    );
    static final MethodHandle glXDestroyPbuffer$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXDestroyPbuffer",
        "(Ljdk/incubator/foreign/MemoryAddress;J)V",
        constants$1020.glXDestroyPbuffer$FUNC, false
    );
    static final FunctionDescriptor glXQueryDrawable$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glXQueryDrawable$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXQueryDrawable",
        "(Ljdk/incubator/foreign/MemoryAddress;JILjdk/incubator/foreign/MemoryAddress;)V",
        constants$1020.glXQueryDrawable$FUNC, false
    );
    static final FunctionDescriptor glXCreateNewContext$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle glXCreateNewContext$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXCreateNewContext",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1020.glXCreateNewContext$FUNC, false
    );
    static final FunctionDescriptor glXMakeContextCurrent$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle glXMakeContextCurrent$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXMakeContextCurrent",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1020.glXMakeContextCurrent$FUNC, false
    );
    static final FunctionDescriptor glXGetCurrentReadDrawable$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle glXGetCurrentReadDrawable$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXGetCurrentReadDrawable",
        "()J",
        constants$1020.glXGetCurrentReadDrawable$FUNC, false
    );
}

