// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1015 {

    static final FunctionDescriptor PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$1015.PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC$FUNC, false
    );
    static final FunctionDescriptor glXChooseVisual$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glXChooseVisual$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXChooseVisual",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1015.glXChooseVisual$FUNC, false
    );
    static final FunctionDescriptor glXCreateContext$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle glXCreateContext$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXCreateContext",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1015.glXCreateContext$FUNC, false
    );
    static final FunctionDescriptor glXDestroyContext$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glXDestroyContext$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXDestroyContext",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1015.glXDestroyContext$FUNC, false
    );
    static final FunctionDescriptor glXMakeCurrent$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle glXMakeCurrent$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXMakeCurrent",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1015.glXMakeCurrent$FUNC, false
    );
    static final FunctionDescriptor glXCopyContext$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle glXCopyContext$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXCopyContext",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)V",
        constants$1015.glXCopyContext$FUNC, false
    );
}


