// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$395 {

    static final FunctionDescriptor PFNGLGETNSEPARABLEFILTERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNSEPARABLEFILTERPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$395.PFNGLGETNSEPARABLEFILTERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNHISTOGRAMPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNHISTOGRAMPROC$MH = RuntimeHelper.downcallHandle(
        "(IBIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$395.PFNGLGETNHISTOGRAMPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNMINMAXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNMINMAXPROC$MH = RuntimeHelper.downcallHandle(
        "(IBIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$395.PFNGLGETNMINMAXPROC$FUNC, false
    );
}

