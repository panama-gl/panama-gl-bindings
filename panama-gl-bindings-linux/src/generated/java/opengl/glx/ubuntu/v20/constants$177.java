// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$177 {

    static final FunctionDescriptor PFNGLMULTIDRAWARRAYSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLMULTIDRAWARRAYSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$177.PFNGLMULTIDRAWARRAYSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTIDRAWELEMENTSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLMULTIDRAWELEMENTSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$177.PFNGLMULTIDRAWELEMENTSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPOINTPARAMETERFPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPOINTPARAMETERFPROC$MH = RuntimeHelper.downcallHandle(
        "(IF)V",
        constants$177.PFNGLPOINTPARAMETERFPROC$FUNC, false
    );
}


