// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$29 {

    static final FunctionDescriptor XDoesSaveUnders$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XDoesSaveUnders$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDoesSaveUnders",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$29.XDoesSaveUnders$FUNC, false
    );
    static final FunctionDescriptor XDisableAccessControl$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XDisableAccessControl$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDisableAccessControl",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$29.XDisableAccessControl$FUNC, false
    );
    static final FunctionDescriptor XDisplayCells$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XDisplayCells$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDisplayCells",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$29.XDisplayCells$FUNC, false
    );
    static final FunctionDescriptor XDisplayHeight$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XDisplayHeight$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDisplayHeight",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$29.XDisplayHeight$FUNC, false
    );
    static final FunctionDescriptor XDisplayHeightMM$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XDisplayHeightMM$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDisplayHeightMM",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$29.XDisplayHeightMM$FUNC, false
    );
    static final FunctionDescriptor XDisplayKeycodes$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XDisplayKeycodes$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDisplayKeycodes",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$29.XDisplayKeycodes$FUNC, false
    );
}


