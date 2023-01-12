// Generated by jextract

package opengl.cgl.macos.v10_15_7;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$6 {

    static final FunctionDescriptor CGLEnable$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle CGLEnable$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLEnable",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$6.CGLEnable$FUNC, false
    );
    static final FunctionDescriptor CGLDisable$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle CGLDisable$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLDisable",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$6.CGLDisable$FUNC, false
    );
    static final FunctionDescriptor CGLIsEnabled$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle CGLIsEnabled$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLIsEnabled",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$6.CGLIsEnabled$FUNC, false
    );
    static final FunctionDescriptor CGLSetParameter$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle CGLSetParameter$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLSetParameter",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$6.CGLSetParameter$FUNC, false
    );
    static final FunctionDescriptor CGLGetParameter$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle CGLGetParameter$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLGetParameter",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$6.CGLGetParameter$FUNC, false
    );
    static final FunctionDescriptor CGLSetVirtualScreen$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle CGLSetVirtualScreen$MH = RuntimeHelper.downcallHandle(
        OpenGL_h.LIBRARIES, "CGLSetVirtualScreen",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$6.CGLSetVirtualScreen$FUNC, false
    );
}

