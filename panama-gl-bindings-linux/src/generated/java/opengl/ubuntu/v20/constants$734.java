// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$734 {

    static final FunctionDescriptor PFNGLDRAWCOMMANDSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLDRAWCOMMANDSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$734.PFNGLDRAWCOMMANDSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWCOMMANDSADDRESSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLDRAWCOMMANDSADDRESSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$734.PFNGLDRAWCOMMANDSADDRESSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWCOMMANDSSTATESNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLDRAWCOMMANDSSTATESNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$734.PFNGLDRAWCOMMANDSSTATESNVPROC$FUNC, false
    );
}


