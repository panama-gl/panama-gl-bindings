// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$57 {

    static final FunctionDescriptor XStoreColors$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XStoreColors$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XStoreColors",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;I)I",
        constants$57.XStoreColors$FUNC, false
    );
    static final FunctionDescriptor XStoreName$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle XStoreName$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XStoreName",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$57.XStoreName$FUNC, false
    );
    static final FunctionDescriptor XStoreNamedColor$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_INT
    );
    static final MethodHandle XStoreNamedColor$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XStoreNamedColor",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;JI)I",
        constants$57.XStoreNamedColor$FUNC, false
    );
    static final FunctionDescriptor XSync$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XSync$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XSync",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$57.XSync$FUNC, false
    );
    static final FunctionDescriptor XTextExtents$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XTextExtents$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XTextExtents",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$57.XTextExtents$FUNC, false
    );
    static final FunctionDescriptor XTextExtents16$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XTextExtents16$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XTextExtents16",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$57.XTextExtents16$FUNC, false
    );
}

