// Generated by jextract

package opengl.cgl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$4 {

    static final FunctionDescriptor CGLTexImagePBuffer$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle CGLTexImagePBuffer$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLTexImagePBuffer",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$4.CGLTexImagePBuffer$FUNC, false
    );
    static final FunctionDescriptor CGLRetainPBuffer$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle CGLRetainPBuffer$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLRetainPBuffer",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$4.CGLRetainPBuffer$FUNC, false
    );
    static final FunctionDescriptor CGLReleasePBuffer$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle CGLReleasePBuffer$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLReleasePBuffer",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$4.CGLReleasePBuffer$FUNC, false
    );
    static final FunctionDescriptor CGLGetPBufferRetainCount$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle CGLGetPBufferRetainCount$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLGetPBufferRetainCount",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$4.CGLGetPBufferRetainCount$FUNC, false
    );
    static final FunctionDescriptor CGLSetOffScreen$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle CGLSetOffScreen$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLSetOffScreen",
        "(Ljdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$4.CGLSetOffScreen$FUNC, false
    );
    static final FunctionDescriptor CGLGetOffScreen$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CGLGetOffScreen$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLGetOffScreen",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$4.CGLGetOffScreen$FUNC, false
    );
}


