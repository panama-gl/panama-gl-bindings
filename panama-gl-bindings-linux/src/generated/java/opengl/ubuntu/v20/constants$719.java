// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$719 {

    static final FunctionDescriptor PFNGLWINDOWPOS4IVMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS4IVMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$719.PFNGLWINDOWPOS4IVMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS4SMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLWINDOWPOS4SMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(SSSS)V",
        constants$719.PFNGLWINDOWPOS4SMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS4SVMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS4SVMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$719.PFNGLWINDOWPOS4SVMESAPROC$FUNC, false
    );
}


