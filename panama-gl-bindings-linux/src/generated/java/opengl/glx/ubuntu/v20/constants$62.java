// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$62 {

    static final FunctionDescriptor XGetOMValues$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XGetOMValues$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetOMValues",
        "(Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$62.XGetOMValues$FUNC, true
    );
    static final FunctionDescriptor XDisplayOfOM$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XDisplayOfOM$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDisplayOfOM",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$62.XDisplayOfOM$FUNC, false
    );
    static final FunctionDescriptor XLocaleOfOM$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XLocaleOfOM$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XLocaleOfOM",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$62.XLocaleOfOM$FUNC, false
    );
    static final FunctionDescriptor XCreateOC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XCreateOC$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCreateOC",
        "(Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$62.XCreateOC$FUNC, true
    );
    static final FunctionDescriptor XDestroyOC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle XDestroyOC$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDestroyOC",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$62.XDestroyOC$FUNC, false
    );
    static final FunctionDescriptor XOMOfOC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XOMOfOC$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XOMOfOC",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$62.XOMOfOC$FUNC, false
    );
}

