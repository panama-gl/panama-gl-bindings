// Generated by jextract

package opengl.cgl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1 {

    static final FunctionDescriptor CGLDestroyPixelFormat$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle CGLDestroyPixelFormat$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLDestroyPixelFormat",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1.CGLDestroyPixelFormat$FUNC, false
    );
    static final FunctionDescriptor CGLDescribePixelFormat$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle CGLDescribePixelFormat$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLDescribePixelFormat",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1.CGLDescribePixelFormat$FUNC, false
    );
    static final FunctionDescriptor CGLReleasePixelFormat$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle CGLReleasePixelFormat$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLReleasePixelFormat",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1.CGLReleasePixelFormat$FUNC, false
    );
    static final FunctionDescriptor CGLRetainPixelFormat$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle CGLRetainPixelFormat$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLRetainPixelFormat",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1.CGLRetainPixelFormat$FUNC, false
    );
    static final FunctionDescriptor CGLGetPixelFormatRetainCount$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle CGLGetPixelFormatRetainCount$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLGetPixelFormatRetainCount",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1.CGLGetPixelFormatRetainCount$FUNC, false
    );
    static final FunctionDescriptor CGLQueryRendererInfo$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CGLQueryRendererInfo$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLQueryRendererInfo",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1.CGLQueryRendererInfo$FUNC, false
    );
}


