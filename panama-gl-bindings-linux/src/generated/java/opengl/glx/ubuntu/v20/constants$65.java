// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$65 {

    static final FunctionDescriptor XwcTextEscapement$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XwcTextEscapement$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XwcTextEscapement",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$65.XwcTextEscapement$FUNC, false
    );
    static final FunctionDescriptor Xutf8TextEscapement$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle Xutf8TextEscapement$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "Xutf8TextEscapement",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$65.Xutf8TextEscapement$FUNC, false
    );
    static final FunctionDescriptor XmbTextExtents$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XmbTextExtents$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XmbTextExtents",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$65.XmbTextExtents$FUNC, false
    );
    static final FunctionDescriptor XwcTextExtents$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XwcTextExtents$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XwcTextExtents",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$65.XwcTextExtents$FUNC, false
    );
    static final FunctionDescriptor Xutf8TextExtents$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle Xutf8TextExtents$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "Xutf8TextExtents",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$65.Xutf8TextExtents$FUNC, false
    );
    static final FunctionDescriptor XmbTextPerCharExtents$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XmbTextPerCharExtents$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XmbTextPerCharExtents",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$65.XmbTextPerCharExtents$FUNC, false
    );
}

