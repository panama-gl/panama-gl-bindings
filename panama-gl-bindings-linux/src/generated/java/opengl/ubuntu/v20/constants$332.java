// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$332 {

    static final FunctionDescriptor PFNGLUNIFORM4I64ARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLUNIFORM4I64ARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJJJ)V",
        constants$332.PFNGLUNIFORM4I64ARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM1I64VARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM1I64VARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$332.PFNGLUNIFORM1I64VARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM2I64VARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM2I64VARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$332.PFNGLUNIFORM2I64VARBPROC$FUNC, false
    );
}

