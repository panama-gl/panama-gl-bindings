// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$385 {

    static final FunctionDescriptor PFNGLGETVERTEXARRAYIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXARRAYIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$385.PFNGLGETVERTEXARRAYIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVERTEXARRAYINDEXEDIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXARRAYINDEXEDIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$385.PFNGLGETVERTEXARRAYINDEXEDIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVERTEXARRAYINDEXED64IVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXARRAYINDEXED64IVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$385.PFNGLGETVERTEXARRAYINDEXED64IVPROC$FUNC, false
    );
}

