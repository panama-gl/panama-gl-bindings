// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$405 {

    static final FunctionDescriptor PFNGLDEBUGMESSAGEINSERTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDEBUGMESSAGEINSERTARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$405.PFNGLDEBUGMESSAGEINSERTARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDEBUGMESSAGECALLBACKARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLDEBUGMESSAGECALLBACKARBPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$405.PFNGLDEBUGMESSAGECALLBACKARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETDEBUGMESSAGELOGARBPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETDEBUGMESSAGELOGARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$405.PFNGLGETDEBUGMESSAGELOGARBPROC$FUNC, false
    );
}

