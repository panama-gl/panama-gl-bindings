// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$70 {

    static final FunctionDescriptor XSetICValues$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XSetICValues$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XSetICValues",
        "(Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$70.XSetICValues$FUNC, true
    );
    static final FunctionDescriptor XGetICValues$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XGetICValues$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetICValues",
        "(Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$70.XGetICValues$FUNC, true
    );
    static final FunctionDescriptor XIMOfIC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XIMOfIC$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XIMOfIC",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$70.XIMOfIC$FUNC, false
    );
    static final FunctionDescriptor XFilterEvent$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle XFilterEvent$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XFilterEvent",
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$70.XFilterEvent$FUNC, false
    );
    static final FunctionDescriptor XmbLookupString$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XmbLookupString$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XmbLookupString",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$70.XmbLookupString$FUNC, false
    );
    static final FunctionDescriptor XwcLookupString$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XwcLookupString$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XwcLookupString",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$70.XwcLookupString$FUNC, false
    );
}

